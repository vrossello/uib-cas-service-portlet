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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CasServiceUtilLocalService}.
 *
 * @author vrf495
 * @see CasServiceUtilLocalService
 * @generated
 */
public class CasServiceUtilLocalServiceWrapper
	implements CasServiceUtilLocalService,
		ServiceWrapper<CasServiceUtilLocalService> {
	public CasServiceUtilLocalServiceWrapper(
		CasServiceUtilLocalService casServiceUtilLocalService) {
		_casServiceUtilLocalService = casServiceUtilLocalService;
	}

	/**
	* Adds the cas service util to the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceUtil the cas service util
	* @return the cas service util that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil addCasServiceUtil(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.addCasServiceUtil(casServiceUtil);
	}

	/**
	* Creates a new cas service util with the primary key. Does not add the cas service util to the database.
	*
	* @param casServiceId the primary key for the new cas service util
	* @return the new cas service util
	*/
	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil createCasServiceUtil(
		long casServiceId) {
		return _casServiceUtilLocalService.createCasServiceUtil(casServiceId);
	}

	/**
	* Deletes the cas service util with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util that was removed
	* @throws PortalException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil deleteCasServiceUtil(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.deleteCasServiceUtil(casServiceId);
	}

	/**
	* Deletes the cas service util from the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceUtil the cas service util
	* @return the cas service util that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil deleteCasServiceUtil(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.deleteCasServiceUtil(casServiceUtil);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _casServiceUtilLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil fetchCasServiceUtil(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.fetchCasServiceUtil(casServiceId);
	}

	/**
	* Returns the cas service util with the primary key.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util
	* @throws PortalException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil getCasServiceUtil(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.getCasServiceUtil(casServiceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> getCasServiceUtils(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.getCasServiceUtils(start, end);
	}

	/**
	* Returns the number of cas service utils.
	*
	* @return the number of cas service utils
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCasServiceUtilsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.getCasServiceUtilsCount();
	}

	/**
	* Updates the cas service util in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param casServiceUtil the cas service util
	* @return the cas service util that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil updateCasServiceUtil(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.updateCasServiceUtil(casServiceUtil);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _casServiceUtilLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_casServiceUtilLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _casServiceUtilLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public void initPGTS() {
		_casServiceUtilLocalService.initPGTS();
	}

	@Override
	public java.lang.String retrievePGT(java.lang.String proxyGrantingTicketIou) {
		return _casServiceUtilLocalService.retrievePGT(proxyGrantingTicketIou);
	}

	@Override
	public void cancelTimer() {
		_casServiceUtilLocalService.cancelTimer();
	}

	@Override
	public void readAndRespondToProxyReceptorRequest(
		javax.servlet.http.HttpServletRequest request,
		javax.servlet.http.HttpServletResponse response) {
		_casServiceUtilLocalService.readAndRespondToProxyReceptorRequest(request,
			response);
	}

	@Override
	public java.lang.String assertValidator(java.lang.Long companyId,
		java.lang.String casServiceUrl, java.lang.String proxyReceptorUrl,
		java.lang.String allowAnyProxy, java.lang.String allowedProxyChains,
		boolean renew, java.lang.String ticket,
		javax.servlet.http.HttpSession session) {
		return _casServiceUtilLocalService.assertValidator(companyId,
			casServiceUrl, proxyReceptorUrl, allowAnyProxy, allowedProxyChains,
			renew, ticket, session);
	}

	@Override
	public java.lang.String constructServiceUrl(java.lang.Long companyId,
		javax.servlet.http.HttpServletRequest request,
		javax.servlet.http.HttpServletResponse response)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.constructServiceUrl(companyId,
			request, response);
	}

	@Override
	public java.lang.String getProxyTicket(
		javax.portlet.RenderRequest renderRequest,
		java.lang.String targetService) {
		return _casServiceUtilLocalService.getProxyTicket(renderRequest,
			targetService);
	}

	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil addProxyTickets(
		java.lang.String proxyGrantingTicketIou,
		java.lang.String proxyGrantingTicket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.addProxyTickets(proxyGrantingTicketIou,
			proxyGrantingTicket);
	}

	@Override
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> getProxyTickets(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.getProxyTickets(proxyGrantingTicketIou);
	}

	@Override
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAllCSU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.findAllCSU();
	}

	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil removeCSU(long csuId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtilLocalService.removeCSU(csuId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CasServiceUtilLocalService getWrappedCasServiceUtilLocalService() {
		return _casServiceUtilLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCasServiceUtilLocalService(
		CasServiceUtilLocalService casServiceUtilLocalService) {
		_casServiceUtilLocalService = casServiceUtilLocalService;
	}

	@Override
	public CasServiceUtilLocalService getWrappedService() {
		return _casServiceUtilLocalService;
	}

	@Override
	public void setWrappedService(
		CasServiceUtilLocalService casServiceUtilLocalService) {
		_casServiceUtilLocalService = casServiceUtilLocalService;
	}

	private CasServiceUtilLocalService _casServiceUtilLocalService;
}