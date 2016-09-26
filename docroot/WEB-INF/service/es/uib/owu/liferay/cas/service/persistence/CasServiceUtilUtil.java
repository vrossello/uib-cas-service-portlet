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

package es.uib.owu.liferay.cas.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.uib.owu.liferay.cas.model.CasServiceUtil;

import java.util.List;

/**
 * The persistence utility for the cas service util service. This utility wraps {@link CasServiceUtilPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vrf495
 * @see CasServiceUtilPersistence
 * @see CasServiceUtilPersistenceImpl
 * @generated
 */
public class CasServiceUtilUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CasServiceUtil casServiceUtil) {
		getPersistence().clearCache(casServiceUtil);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CasServiceUtil> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CasServiceUtil> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CasServiceUtil> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CasServiceUtil update(CasServiceUtil casServiceUtil)
		throws SystemException {
		return getPersistence().update(casServiceUtil);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CasServiceUtil update(CasServiceUtil casServiceUtil,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(casServiceUtil, serviceContext);
	}

	/**
	* Returns all the cas service utils where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @return the matching cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProxyGrantingTicketIou(proxyGrantingTicketIou);
	}

	/**
	* Returns a range of all the cas service utils where proxyGrantingTicketIou = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.uib.owu.liferay.cas.model.impl.CasServiceUtilModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param start the lower bound of the range of cas service utils
	* @param end the upper bound of the range of cas service utils (not inclusive)
	* @return the range of matching cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProxyGrantingTicketIou(proxyGrantingTicketIou, start,
			end);
	}

	/**
	* Returns an ordered range of all the cas service utils where proxyGrantingTicketIou = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.uib.owu.liferay.cas.model.impl.CasServiceUtilModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param start the lower bound of the range of cas service utils
	* @param end the upper bound of the range of cas service utils (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProxyGrantingTicketIou(proxyGrantingTicketIou, start,
			end, orderByComparator);
	}

	/**
	* Returns the first cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cas service util
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil findByProxyGrantingTicketIou_First(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException {
		return getPersistence()
				   .findByProxyGrantingTicketIou_First(proxyGrantingTicketIou,
			orderByComparator);
	}

	/**
	* Returns the first cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cas service util, or <code>null</code> if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil fetchByProxyGrantingTicketIou_First(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProxyGrantingTicketIou_First(proxyGrantingTicketIou,
			orderByComparator);
	}

	/**
	* Returns the last cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cas service util
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil findByProxyGrantingTicketIou_Last(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException {
		return getPersistence()
				   .findByProxyGrantingTicketIou_Last(proxyGrantingTicketIou,
			orderByComparator);
	}

	/**
	* Returns the last cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cas service util, or <code>null</code> if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil fetchByProxyGrantingTicketIou_Last(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProxyGrantingTicketIou_Last(proxyGrantingTicketIou,
			orderByComparator);
	}

	/**
	* Returns the cas service utils before and after the current cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param casServiceId the primary key of the current cas service util
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cas service util
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil[] findByProxyGrantingTicketIou_PrevAndNext(
		long casServiceId, java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException {
		return getPersistence()
				   .findByProxyGrantingTicketIou_PrevAndNext(casServiceId,
			proxyGrantingTicketIou, orderByComparator);
	}

	/**
	* Removes all the cas service utils where proxyGrantingTicketIou = &#63; from the database.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByProxyGrantingTicketIou(proxyGrantingTicketIou);
	}

	/**
	* Returns the number of cas service utils where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @return the number of matching cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProxyGrantingTicketIou(proxyGrantingTicketIou);
	}

	/**
	* Caches the cas service util in the entity cache if it is enabled.
	*
	* @param casServiceUtil the cas service util
	*/
	public static void cacheResult(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil) {
		getPersistence().cacheResult(casServiceUtil);
	}

	/**
	* Caches the cas service utils in the entity cache if it is enabled.
	*
	* @param casServiceUtils the cas service utils
	*/
	public static void cacheResult(
		java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> casServiceUtils) {
		getPersistence().cacheResult(casServiceUtils);
	}

	/**
	* Creates a new cas service util with the primary key. Does not add the cas service util to the database.
	*
	* @param casServiceId the primary key for the new cas service util
	* @return the new cas service util
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil create(
		long casServiceId) {
		return getPersistence().create(casServiceId);
	}

	/**
	* Removes the cas service util with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util that was removed
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil remove(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException {
		return getPersistence().remove(casServiceId);
	}

	public static es.uib.owu.liferay.cas.model.CasServiceUtil updateImpl(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(casServiceUtil);
	}

	/**
	* Returns the cas service util with the primary key or throws a {@link es.uib.owu.liferay.cas.NoSuchCasServiceUtilException} if it could not be found.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil findByPrimaryKey(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException {
		return getPersistence().findByPrimaryKey(casServiceId);
	}

	/**
	* Returns the cas service util with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util, or <code>null</code> if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.uib.owu.liferay.cas.model.CasServiceUtil fetchByPrimaryKey(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(casServiceId);
	}

	/**
	* Returns all the cas service utils.
	*
	* @return the cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cas service utils.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.uib.owu.liferay.cas.model.impl.CasServiceUtilModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cas service utils
	* @param end the upper bound of the range of cas service utils (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cas service utils from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cas service utils.
	*
	* @return the number of cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CasServiceUtilPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CasServiceUtilPersistence)PortletBeanLocatorUtil.locate(es.uib.owu.liferay.cas.service.ClpSerializer.getServletContextName(),
					CasServiceUtilPersistence.class.getName());

			ReferenceRegistry.registerReference(CasServiceUtilUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CasServiceUtilPersistence persistence) {
	}

	private static CasServiceUtilPersistence _persistence;
}