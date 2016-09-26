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

package es.uib.owu.liferay.cas.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CasServiceUtil. This utility wraps
 * {@link es.uib.owu.liferay.cas.service.impl.CasServiceUtilLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author vrf495
 * @see CasServiceUtilLocalService
 * @see es.uib.owu.liferay.cas.service.base.CasServiceUtilLocalServiceBaseImpl
 * @see es.uib.owu.liferay.cas.service.impl.CasServiceUtilLocalServiceImpl
 * @generated
 */
public class CasServiceUtilLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.uib.owu.liferay.cas.service.impl.CasServiceUtilLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the cas service util to the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceUtil the cas service util
	* @return the cas service util that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil addCasServiceUtil(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCasServiceUtil(casServiceUtil);
	}

	/**
	* Creates a new cas service util with the primary key. Does not add the cas service util to the database.
	*
	* @param casServiceId the primary key for the new cas service util
	* @return the new cas service util
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil createCasServiceUtil(
		long casServiceId) {
		return getService().createCasServiceUtil(casServiceId);
	}

	/**
	* Deletes the cas service util with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util that was removed
	* @throws PortalException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil deleteCasServiceUtil(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCasServiceUtil(casServiceId);
	}

	/**
	* Deletes the cas service util from the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceUtil the cas service util
	* @return the cas service util that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil deleteCasServiceUtil(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCasServiceUtil(casServiceUtil);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.uib.owu.liferay.cas.model.impl.CasServiceUtilModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.uib.owu.liferay.cas.model.impl.CasServiceUtilModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.uib.owu.liferay.cas.model.CasServiceUtil fetchCasServiceUtil(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCasServiceUtil(casServiceId);
	}

	/**
	* Returns the cas service util with the primary key.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util
	* @throws PortalException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil getCasServiceUtil(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCasServiceUtil(casServiceId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cas service utils.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.uib.owu.liferay.cas.model.impl.CasServiceUtilModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cas service utils
	* @param end the upper bound of the range of cas service utils (not inclusive)
	* @return the range of cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> getCasServiceUtils(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCasServiceUtils(start, end);
	}

	/**
	* Returns the number of cas service utils.
	*
	* @return the number of cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static int getCasServiceUtilsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCasServiceUtilsCount();
	}

	/**
	* Updates the cas service util in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param casServiceUtil the cas service util
	* @return the cas service util that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil updateCasServiceUtil(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCasServiceUtil(casServiceUtil);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void initPGTS() {
		getService().initPGTS();
	}

	public static java.lang.String retrievePGT(
		java.lang.String proxyGrantingTicketIou) {
		return getService().retrievePGT(proxyGrantingTicketIou);
	}

	public static void cancelTimer() {
		getService().cancelTimer();
	}

	public static void readAndRespondToProxyReceptorRequest(
		javax.servlet.http.HttpServletRequest request,
		javax.servlet.http.HttpServletResponse response) {
		getService().readAndRespondToProxyReceptorRequest(request, response);
	}

	public static java.lang.String assertValidator(java.lang.Long companyId,
		java.lang.String casServiceUrl, java.lang.String proxyReceptorUrl,
		java.lang.String allowAnyProxy, java.lang.String allowedProxyChains,
		boolean renew, java.lang.String ticket,
		javax.servlet.http.HttpSession session) {
		return getService()
				   .assertValidator(companyId, casServiceUrl, proxyReceptorUrl,
			allowAnyProxy, allowedProxyChains, renew, ticket, session);
	}

	public static java.lang.String constructServiceUrl(
		java.lang.Long companyId,
		javax.servlet.http.HttpServletRequest request,
		javax.servlet.http.HttpServletResponse response)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().constructServiceUrl(companyId, request, response);
	}

	public static java.lang.String getProxyTicket(
		javax.portlet.RenderRequest renderRequest,
		java.lang.String targetService) {
		return getService().getProxyTicket(renderRequest, targetService);
	}

	public static es.uib.owu.liferay.cas.model.CasServiceUtil addProxyTickets(
		java.lang.String proxyGrantingTicketIou,
		java.lang.String proxyGrantingTicket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addProxyTickets(proxyGrantingTicketIou, proxyGrantingTicket);
	}

	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> getProxyTickets(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProxyTickets(proxyGrantingTicketIou);
	}

	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAllCSU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findAllCSU();
	}

	public static es.uib.owu.liferay.cas.model.CasServiceUtil removeCSU(
		long csuId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().removeCSU(csuId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CasServiceUtilLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CasServiceUtilLocalService.class.getName());

			if (invokableLocalService instanceof CasServiceUtilLocalService) {
				_service = (CasServiceUtilLocalService)invokableLocalService;
			}
			else {
				_service = new CasServiceUtilLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CasServiceUtilLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CasServiceUtilLocalService service) {
	}

	private static CasServiceUtilLocalService _service;
}