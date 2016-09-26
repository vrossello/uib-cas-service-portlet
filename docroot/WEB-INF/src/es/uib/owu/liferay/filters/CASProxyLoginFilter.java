package es.uib.owu.liferay.filters;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.util.CommonUtils;
import org.jasig.cas.client.validation.Assertion;
import org.jasig.cas.client.validation.Cas20ProxyTicketValidator;
import org.jasig.cas.client.validation.Cas20ServiceTicketValidator;
import org.jasig.cas.client.validation.ProxyList;
import org.jasig.cas.client.validation.ProxyListEditor;
import org.jasig.cas.client.validation.TicketValidator;
*/
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.BaseFilter;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

import es.uib.owu.liferay.cas.service.CasServiceUtilLocalService;
import es.uib.owu.liferay.cas.service.CasServiceUtilLocalServiceUtil;
import es.uib.owu.liferay.filters.cas.PropsCAS;

public class CASProxyLoginFilter extends BaseFilter {
	private static final String REGEX_TOKEN = "://";
	private static final String QUERYSTRING_VAR = "?service=";
	private static final String PORT_SEPARATOR = ":";
	private static final String REDIRECT_LOGOUT_URL_ENABLED_KEY = "redirect.logout.url.enabled";
	private static final String CAS_FORCE_LOGOUT = "CAS_FORCE_LOGOUT";
	
	private static final String PARAM_PROXY_GRANTING_TICKET_IOU = "pgtIou";
	private static final int DEFAULT_MILLIS_BETWEEN_CLEANUPS = 60 * 1000;//60s	
	private static final long DEFAULT_PGTS_TIMEOUT = 8*60*60 * 1000;//8h
	private static Log _log = LogFactoryUtil.getLog(CASProxyLoginFilter.class);

	
	private String proxyReceptorUrl = null;// "/cas/proxyCallback";
	
	protected static CasServiceUtilLocalService casServiceUtilLocalService;


	public CASProxyLoginFilter() {
		if (_log.isDebugEnabled())
			_log.debug("Created MultiDomainCASLoginFilter");	

	}

	@Override
	public void init(FilterConfig filterConfig) {
		super.init(filterConfig);
		if (_log.isDebugEnabled()) _log.debug("init FilterConfig ----------------------------------------------");
		casServiceUtilLocalService =	CasServiceUtilLocalServiceUtil.getService();
		casServiceUtilLocalService.initPGTS();
	}

	/*public static void reload(long companyId) {
		if (_log.isDebugEnabled()) _log.debug("reload - removeTicketValidator");
		casServiceUtilLocalService.removeTicketValidator(Long.valueOf(companyId));
	}*/

	public boolean isFilterEnabled(HttpServletRequest request, HttpServletResponse response) {
		long companyId = PortalUtil.getCompanyId(request);
		try {
			boolean casAuthEnabledValue = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.CAS_AUTH_ENABLED));

			if (PrefsPropsUtil.getBoolean(companyId, PropsKeys.CAS_AUTH_ENABLED, casAuthEnabledValue))
				return true;

		} catch (Exception e) {
			_log.error(e, e);
		}
		return false;
	}

	protected Log getLog() {
		return _log;
	}

	
	
    /**
     * This processes the ProxyReceptor request before the ticket validation code executes.
     */
    protected final boolean preFilter(final ServletRequest servletRequest, final ServletResponse servletResponse, final FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final String requestUri = request.getRequestURI();
        if (_log.isDebugEnabled()) _log.debug("preFilter proxyReceptorUrl: "+this.proxyReceptorUrl);
        if (isEmpty(this.proxyReceptorUrl) || !requestUri.endsWith(this.proxyReceptorUrl)) {
        	if (_log.isDebugEnabled()) _log.debug("preFiltrer true");
            return true;
        }
     
        try {        	
            //CommonUtils.readAndRespondToProxyReceptorRequest(request, response, casUtilLocalService.getProxyGrantingTicketStorage());
        	_log.debug("Content length: "+request.getContentLength());
        /*	_log.debug("getHeaderNames: "+request.getHeaderNames());
        	Enumeration eH = request.getHeaderNames();
        	while (eH.hasMoreElements()){
        		_log.debug("- "+eH.nextElement());
        	}*/
        	
        
        	BufferedReader br = request.getReader();
        	br.mark(0);
        	 String  thisLine = null;
        		      try{
        		         // open input stream test.txt for reading purpose.        		         
        		         while ((thisLine = br.readLine()) != null) {
        		        	 _log.debug("preFiltrer: "+thisLine);
        		            //System.out.println(thisLine);
        		         }       
        		      }catch(Exception e){
        		         e.printStackTrace();
        		      }
        	br.reset();
        	
            casServiceUtilLocalService.readAndRespondToProxyReceptorRequest(request, response);
            
            String proxyGrantingTicketIou = request.getParameter(PARAM_PROXY_GRANTING_TICKET_IOU);
            if (_log.isDebugEnabled()) _log.debug("param proxyGrantingTicketIou: "+proxyGrantingTicketIou);			
		
			/*if (proxyGrantingTicketIou!=null){
				String pgt = casServiceUtilLocalService.getPGT(proxyGrantingTicketIou);
				if (_log.isDebugEnabled()) _log.debug("param PGT: "+pgt);
				HttpSession session = request.getSession();		
				
				session.setAttribute("PROXY_GRANTING_TICKET", pgt);
			}*/
            
        } catch (final RuntimeException e) {
            _log.error(e.getMessage(), e);
            throw e;
        }
        if (_log.isDebugEnabled()) _log.debug("preFilter return false");		
        return false;
    }

	protected void processFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws Exception {
	
		long companyId = PortalUtil.getCompanyId(request);	
		proxyReceptorUrl = PrefsPropsUtil.getString(companyId, PropsCAS.PROXY_CALLBACK_URL);
		
		if (_log.isDebugEnabled()) {
			_log.debug("----------------------------------------------------------------------");
			_log.debug("processFilter..getRequestURL: " + request.getRequestURL());
			_log.debug("processFilter..getQueryString: " + request.getQueryString());

			for (String paramName : Collections.list(request.getParameterNames())) {
				_log.debug( paramName + ": " + request.getParameter(paramName));
			}
		}	
		
		 if (!preFilter(request, response, filterChain)) {
			 if (_log.isDebugEnabled()) {
				 _log.debug("Surt del filtre");
			 }
	            return;
	     }

		HttpSession session = request.getSession(false);
		if (_log.isDebugEnabled()) 
			_log.debug("session: "+session);
		if (session==null){			
			session = request.getSession();
			if (_log.isDebugEnabled()) 
				_log.debug("session is null, new session created: "+session);
		}	
		
		String pathInfo = request.getPathInfo();
		Object forceLogout = session.getAttribute(CAS_FORCE_LOGOUT);
		int serverPort = request.getServerPort();
		String serverNameFromRequest = request.getServerName();
		StringBuffer currentServerName = new StringBuffer();
		currentServerName.append(serverNameFromRequest);
		currentServerName.append(PORT_SEPARATOR);
		currentServerName.append(serverPort);
		
		if (_log.isDebugEnabled()) 
			_log.debug("sessionId: "+session.getId());
		
	

		if (forceLogout != null) {
			session.removeAttribute(CAS_FORCE_LOGOUT);
			String logoutUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_LOGOUT_URL,
					PropsUtil.get(PropsKeys.CAS_LOGOUT_URL));
			response.sendRedirect(logoutUrl);
			return;
		}
		String scheme = request.getScheme();
		if (Validator.isNotNull(pathInfo) && pathInfo.contains("/portal/logout")) {
			session.invalidate();
			String logoutUrl = getLogoutURL(companyId, currentServerName.toString(), scheme);
			if (_log.isDebugEnabled())
				_log.debug("logout and redirect:  " + logoutUrl);
			response.sendRedirect(logoutUrl);
			return;
		}
		String login = (String) session.getAttribute(PropsCAS.CAS_LOGIN);
		if (_log.isDebugEnabled())
			_log.debug("login: " + login);

		if (Validator.isNotNull(login)) {
			processFilter(CASProxyLoginFilter.class, request, response, filterChain);
			return;
		}

		// String cas_server_name = PropsUtil.get(PropsKeys.CAS_SERVER_NAME);

		String casServerName = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVER_NAME,
				PropsUtil.get(PropsKeys.CAS_SERVER_NAME));
		String casServiceUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVICE_URL,
				PropsUtil.get(PropsKeys.CAS_SERVICE_URL));
		String casServerUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_SERVER_URL,
				PropsUtil.get(PropsKeys.CAS_SERVER_URL));
		

		if (_log.isDebugEnabled()) {
			_log.debug("serverName: " + casServerName);
			_log.debug("serviceUrl: " + casServiceUrl);
		}

		if (Validator.isNull(casServiceUrl)){
			casServiceUrl = casServiceUtilLocalService.constructServiceUrl(companyId,request, response);
			String redirect=request.getParameter("redirect");
			if (_log.isDebugEnabled()) 
				_log.debug("redirect: ..." + redirect+"...");
				
			if (redirect!=null && redirect.equals("/")){ //l'arrel millor esborrar de la redireccio per si hi ha un LAST_PATH
				casServiceUrl = casServiceUrl.replaceAll("redirect=\\%2F\\&", "").replaceAll("redirect=/&", "");
			}
			
		}

		if (_log.isDebugEnabled()) {
			_log.debug("serviceUrl construct: " + casServiceUrl);
		}

		String ticket = ParamUtil.getString(request, "ticket");

		if (_log.isDebugEnabled()) {
			_log.debug("ticket: " + ticket);
		}

		if (Validator.isNull(ticket) ) {
			String loginUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_LOGIN_URL,
					PropsUtil.get(PropsKeys.CAS_LOGIN_URL));
			if (_log.isDebugEnabled()) {
				_log.debug("cas.login.url: " + loginUrl);
				_log.debug("for ticket null service url before: " + casServiceUrl);
			}
			// serviceUrl = serviceUrl.replaceFirst(serverName_without_scheme,
			// currentServerName.toString());

			if (_log.isDebugEnabled())
				_log.debug("for ticket null service url after changing URL as per host name: " + casServiceUrl);
			loginUrl = HttpUtil.addParameter(loginUrl, "service", casServiceUrl);
			response.sendRedirect(loginUrl);
			return;
		}

		// serviceUrl = serviceUrl.replaceFirst(serverName_without_scheme,
		// currentServerName.toString());
	
		
		String allowAnyProxy = PrefsPropsUtil.getString(companyId, PropsCAS.ACCEPT_ANY_PROXY);
		String allowedProxyChains = PrefsPropsUtil.getString(companyId, PropsCAS.ALLOWED_PROXY_CHAINS);
		Boolean renew = PrefsPropsUtil.getBoolean(companyId, PropsCAS.RENEW, false);
		
		login = casServiceUtilLocalService.assertValidator(companyId, casServiceUrl,proxyReceptorUrl, allowAnyProxy, allowedProxyChains,  renew, ticket,session);
		
		session.setAttribute(PropsCAS.CAS_LOGIN, login);
		if (_log.isDebugEnabled())
			_log.debug("USER_ATTRIBUTE_PRINCIPAL: " + session.getAttribute("USER_ATTRIBUTE_PRINCIPAL"));

		/*}*/
		processFilter(CASProxyLoginFilter.class, request, response, filterChain);
	}

	private String getLogoutURL(long companyId, String currentServerName, String scheme) throws SystemException {

		String logoutUrl = PrefsPropsUtil.getString(companyId, PropsKeys.CAS_LOGOUT_URL,
				PropsUtil.get(PropsKeys.CAS_LOGOUT_URL));
		String propvalue = PropsUtil.get(REDIRECT_LOGOUT_URL_ENABLED_KEY);
		boolean REDIRECT_LOGOUT_URL_ENABLED = GetterUtil.getBoolean(propvalue);
		if (REDIRECT_LOGOUT_URL_ENABLED) {
			String siteUrl = (new StringBuilder()).append(QUERYSTRING_VAR).append(scheme).append(REGEX_TOKEN)
					.append(currentServerName).toString();
			if (_log.isDebugEnabled())
				_log.debug((new StringBuilder("site Url :: ")).append(siteUrl).toString());
			logoutUrl = logoutUrl.concat(siteUrl);
		}
		if (_log.isDebugEnabled())
			_log.debug((new StringBuilder("logout url :: ")).append(logoutUrl).toString());
		return logoutUrl;
	}

	@Override
	public void destroy() {
		super.destroy();
		casServiceUtilLocalService.cancelTimer();
	}
	
	public final void setProxyReceptorUrl(final String proxyReceptorUrl) {
        this.proxyReceptorUrl = proxyReceptorUrl;
    }
	
	@Override
	public boolean isFilterEnabled() {
		return _filterEnabled;
	}

	@Override
	public void setFilterEnabled(boolean filterEnabled) {
		_filterEnabled = filterEnabled;
	}


	private boolean _filterEnabled = GetterUtil.getBoolean(
		PropsUtil.get(getClass().getName()), true);
	
	  public static boolean isEmpty(final String string) {
	        return string == null || string.length() == 0;
	    }

}
