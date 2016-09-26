/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.uib.owu.liferay.cas.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.authentication.AttributePrincipalImpl;
import org.jasig.cas.client.proxy.CleanUpTimerTask;
//import org.jasig.cas.client.proxy.ProxyGrantingTicketStorageImpl;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.util.CommonUtils;
import org.jasig.cas.client.validation.Assertion;
import org.jasig.cas.client.validation.Cas20ProxyTicketValidator;
import org.jasig.cas.client.validation.Cas20ServiceTicketValidator;
import org.jasig.cas.client.validation.ProxyList;
import org.jasig.cas.client.validation.ProxyListEditor;
import org.jasig.cas.client.validation.TicketValidationException;
import org.jasig.cas.client.validation.TicketValidator;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;

import es.uib.owu.liferay.cas.model.CasServiceUtil;
import es.uib.owu.liferay.cas.service.base.CasServiceUtilLocalServiceBaseImpl;


/**
 * The implementation of the cas util local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.uib.owu.liferay.cas.service.CasUtilLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author vrf495
 * @see es.uib.owu.liferay.cas.service.base.CasUtilLocalServiceBaseImpl
 * @see es.uib.owu.liferay.cas.service.CasUtilLocalServiceUtil
 */
public class CasServiceUtilLocalServiceImpl extends CasServiceUtilLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.uib.owu.liferay.cas.service.CasUtilLocalServiceUtil} to access the cas util local service.
	 */

	private static final int DEFAULT_MILLIS_BETWEEN_CLEANUPS = 60 * 1000;//60s	
	private static final long DEFAULT_PGTS_TIMEOUT = 8*60*60 * 1000;//8h
	//private ProxyGrantingTicketStorageImpl proxyGrantingTicketStorage; // = new ProxyGrantingTicketStorageImpl(DEFAULT_PGTS_TIMEOUT);
	
	private static Log _log = LogFactoryUtil.getLog(CasServiceUtilLocalServiceImpl.class);	

	private static Map<Long, Cas20ServiceTicketValidator> _ticketValidators = new ConcurrentHashMap<Long, Cas20ServiceTicketValidator>();
	
	private static ProxyGrantingTicketStorageImpl proxyGrantingTicketStorage; 

	private Timer timer;

	private TimerTask timerTask;
	
	public void initPGTS(){
		this.proxyGrantingTicketStorage = getPGTSI();
		 
		CommonUtils.assertNotNull(proxyGrantingTicketStorage, "proxyGrantingTicketStorage cannot be null.");

		if (this.timer == null) {
			this.timer = new Timer(true);
		}

		if (this.timerTask == null) {
			this.timerTask = new CleanUpTimerTask(proxyGrantingTicketStorage);
		}
		this.timer.schedule(this.timerTask, DEFAULT_MILLIS_BETWEEN_CLEANUPS, DEFAULT_MILLIS_BETWEEN_CLEANUPS);
	}
	
	@Override
	public void destroy() {
		if (_log.isDebugEnabled()) {
			_log.debug("DESTROY TIMER");
		}
		this.timer.purge();
		this.timer.cancel();
		super.destroy();
	}
	/*
	public void putTicketValidator(Long key, Cas20ServiceTicketValidator ticketValidator){
		_ticketValidators.put(key, ticketValidator);
	}
	
	public void removeTicketValidator(Long key){
		_ticketValidators.remove(key);
	}
	
	public ProxyGrantingTicketStorage getProxyGrantingTicketStorage(){
		return proxyGrantingTicketStorage;
	}*/
	
	public String retrievePGT(String proxyGrantingTicketIou){
		ProxyGrantingTicketStorageImpl proxyGrantingTicketStorage = getPGTSI();
		return proxyGrantingTicketStorage.retrieve(proxyGrantingTicketIou);
	}
	
/*	public Cas20ServiceTicketValidator getTicketValidatorByKey(Long key){
		return _ticketValidators.get(key);
	}*/
	
	public void cancelTimer(){
		this.timer.cancel();
	}
	
	public void readAndRespondToProxyReceptorRequest(HttpServletRequest request , HttpServletResponse response ){
		 try {
			 	CommonUtils.readAndRespondToProxyReceptorRequest(request, response, getPGTSI());
		  } catch (Exception e) {
	            _log.error(e.getMessage(), e);	           
	      }
	}
	
	private TicketValidator  getTicketValidator(long companyId, String proxyReceptorUrl, String allowAnyProxy, String allowedProxyChains, boolean renew) throws SystemException  {
		if (_log.isDebugEnabled())
			_log.debug("getTicketValidator");
		Cas20ServiceTicketValidator ticketValidator =  _ticketValidators.get(Long.valueOf(companyId));
		//Cas20ServiceTicketValidator ticketValidator = (Cas20ServiceTicketValidator) _ticketValidators.get(Long.valueOf(companyId));
		
		if (ticketValidator != null) {
			return ticketValidator;
		}

		String serverName = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVER_NAME,
				PropsUtil.get(PropsKeys.CAS_SERVER_NAME));
		String casServerUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVER_URL,
				PropsUtil.get(PropsKeys.CAS_SERVER_URL));
		String casLoginUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_LOGIN_URL,
				PropsUtil.get(PropsKeys.CAS_LOGIN_URL));

	

		if ((CommonUtils.isNotBlank(allowAnyProxy) || CommonUtils.isNotBlank(allowedProxyChains))) {
			final Cas20ProxyTicketValidator v = new Cas20ProxyTicketValidator(casServerUrl);
			v.setAcceptAnyProxy(PrefsPropsUtil.getBoolean(allowAnyProxy));
			v.setAllowedProxyChains(createProxyList(allowedProxyChains));
			ticketValidator = v;
			if (_log.isDebugEnabled()) {
				_log.debug("Cas20ProxyTicketValidator");
				_log.debug("-setAcceptAnyProxy: " + allowAnyProxy);
				_log.debug("-setAllowedProxyChains: " + allowedProxyChains);
			}
		} else {
			ticketValidator = new Cas20ServiceTicketValidator(casServerUrl);
			if (_log.isDebugEnabled()) {
				_log.debug("Cas20ServiceValidator");
			}
		}

		if (proxyReceptorUrl!=null){
			ticketValidator.setProxyCallbackUrl(serverName + proxyReceptorUrl);
			ProxyGrantingTicketStorageImpl proxyGrantingTicketStorage = getPGTSI();
			if (_log.isDebugEnabled()) {
				_log.debug("Cas20ServiceValidator assigname proxyGrantingTicketStorage: "+proxyGrantingTicketStorage);
			}
			ticketValidator.setProxyGrantingTicketStorage(proxyGrantingTicketStorage);
		}
		
		ticketValidator.setRenew(renew);


		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("serverName", serverName);
		parameters.put("casServerUrlPrefix", casServerUrl);
		parameters.put("casServerLoginUrl", casLoginUrl);
		parameters.put("redirectAfterValidation", "false");

		if (allowAnyProxy != null)
			parameters.put("allowAnyProxy", allowAnyProxy);

		ticketValidator.setCustomParameters(parameters);		
		_ticketValidators.put(Long.valueOf(companyId), ticketValidator);

		if (_log.isDebugEnabled()) {
			_log.debug("Returning cas20ProxyTicketValidator with..");
			_log.debug("- serverName: " + serverName);
			_log.debug("- casServerUrlPrefix: " + casServerUrl);
			_log.debug("- casServerLoginUrl: " + casLoginUrl);
			if (proxyReceptorUrl!=null)
				_log.debug("- proxyCallbackUrl: " + serverName + proxyReceptorUrl);

		}

		return ticketValidator;

	}

	private static ProxyGrantingTicketStorageImpl getPGTSI() {
		if (_log.isDebugEnabled()) {
			_log.debug("proxyGrantingTicketStorage: " + proxyGrantingTicketStorage);
		}
	
		if (proxyGrantingTicketStorage==null){
		
			proxyGrantingTicketStorage =  new ProxyGrantingTicketStorageImpl(DEFAULT_PGTS_TIMEOUT);
			if (_log.isDebugEnabled()) {
				_log.debug("proxyGrantingTicketStorage el cream.."+proxyGrantingTicketStorage);
			}	
		}
		return proxyGrantingTicketStorage;
	}

	protected final ProxyList createProxyList(final String proxies) {
		if (CommonUtils.isBlank(proxies)) {
			return new ProxyList();
		}

		final ProxyListEditor editor = new ProxyListEditor();
		editor.setAsText(proxies);
		return (ProxyList) editor.getValue();
	}
	
	public String assertValidator(Long companyId, String casServiceUrl, String proxyReceptorUrl, String allowAnyProxy, String allowedProxyChains, boolean renew, String ticket, HttpSession session){

		TicketValidator ticketValidator;
		try {
			ticketValidator = getTicketValidator(companyId, proxyReceptorUrl,  allowAnyProxy,  allowedProxyChains,  renew);
		
			if (_log.isDebugEnabled()) {
				_log.debug("*********************************\nticketValidator: " + ticketValidator);
			}
		
			try {
				if (_log.isDebugEnabled()) {
					_log.debug("ticketValidator validate ticket: " + ticket+" for casServiceUrl:"+casServiceUrl);
				}
				Assertion assertion = ticketValidator.validate(ticket, casServiceUrl);
	
				if (assertion != null) {
					if (_log.isDebugEnabled())
						_log.debug("Ticket validated: " + ticket+ " - ValidFromDate: "+assertion.getValidFromDate()+ " - ValidUntilDate: "+assertion.getValidUntilDate());
					AttributePrincipal attributePrincipal = assertion.getPrincipal();
					
					if (_log.isDebugEnabled()){					
						_log.debug("principal name: "+attributePrincipal.getName());
						_log.debug("set AtttributePrincipal in session");

					}
					session.setAttribute("USER_ATTRIBUTE_PRINCIPAL", attributePrincipal);
					session.setAttribute(AbstractCasFilter.CONST_CAS_ASSERTION, assertion);
					
					return attributePrincipal.getName();
				} else {
	
					if (_log.isDebugEnabled())
						_log.debug("tiquet no validat: " + ticket + " - servei:" + casServiceUrl);
				}
			} catch (TicketValidationException e) {
				if (_log.isErrorEnabled())
					_log.error("VALIDATION EXCEPTION",e);			
			}
		} catch (SystemException se) {
			if (_log.isErrorEnabled())
				_log.error(se);		
		}
		return null;
	}
	
	public String constructServiceUrl(Long companyId,HttpServletRequest request , HttpServletResponse response ) throws SystemException{
		String casServerName = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVER_NAME,
				PropsUtil.get(PropsKeys.CAS_SERVER_NAME));
		String casServiceUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVICE_URL,
				PropsUtil.get(PropsKeys.CAS_SERVICE_URL));
		String casServerUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVER_URL,
				PropsUtil.get(PropsKeys.CAS_SERVER_URL));
		return CommonUtils.constructServiceUrl(request, response, casServiceUrl, casServerName, "ticket", true); //ENCODEURL TRUE
	
	}
	
	public String getProxyTicket(RenderRequest renderRequest, String targetService){		
		AttributePrincipalImpl attributePrincipal = (AttributePrincipalImpl)renderRequest.getPortletSession().getAttribute("USER_ATTRIBUTE_PRINCIPAL",PortletSession.APPLICATION_SCOPE);
		/*Assertion assertion = (Assertion) renderRequest.getPortletSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION,PortletSession.APPLICATION_SCOPE);
		if (_log.isDebugEnabled()) {
			_log.debug("assertion: "+assertion);
		}
		if (assertion == null)	return null;		
		AttributePrincipal attributePrincipal = assertion.getPrincipal();*/
		if (_log.isDebugEnabled()) {
			_log.debug("attributePrincipal: "+attributePrincipal);
			_log.debug("attributePrincipal: "+attributePrincipal.hashCode());
		}
		if (attributePrincipal == null)	return null;	
		
		return attributePrincipal.getProxyTicketFor(targetService);
	}
	
	public CasServiceUtil addProxyTickets(String proxyGrantingTicketIou, String proxyGrantingTicket) throws SystemException{
		 Date now = new Date();

		long casServiceId = counterLocalService.increment(CasServiceUtil.class.getName());

		CasServiceUtil  csu = casServiceUtilPersistence.create(casServiceId);
		
		csu.setCreateDate(now);
		csu.setProxyGrantingTicketIou(proxyGrantingTicketIou);
		csu.setProxyGrantingTicket(proxyGrantingTicket);
		
		super.addCasServiceUtil(csu);
		
		return csu;
	}
	
	public List<CasServiceUtil> getProxyTickets(String proxyGrantingTicketIou)
		    throws SystemException, PortalException {	
			_log.debug("Searching PGT for proxyGrantingTicketIou: "+proxyGrantingTicketIou);
		    return casServiceUtilPersistence.findByProxyGrantingTicketIou(proxyGrantingTicketIou);
		}
	
	public List<CasServiceUtil> findAllCSU()
		    throws SystemException, PortalException {	
		    return casServiceUtilPersistence.findAll();
		}
	public CasServiceUtil removeCSU(long csuId)  throws SystemException, PortalException {	
	    return casServiceUtilPersistence.remove(csuId);		
	}
	
}