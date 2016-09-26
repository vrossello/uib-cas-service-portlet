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

import com.liferay.portal.service.persistence.BasePersistence;

import es.uib.owu.liferay.cas.model.CasServiceUtil;

/**
 * The persistence interface for the cas service util service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vrf495
 * @see CasServiceUtilPersistenceImpl
 * @see CasServiceUtilUtil
 * @generated
 */
public interface CasServiceUtilPersistence extends BasePersistence<CasServiceUtil> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CasServiceUtilUtil} to access the cas service util persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the cas service utils where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @return the matching cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cas service util
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil findByProxyGrantingTicketIou_First(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException;

	/**
	* Returns the first cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cas service util, or <code>null</code> if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil fetchByProxyGrantingTicketIou_First(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cas service util
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil findByProxyGrantingTicketIou_Last(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException;

	/**
	* Returns the last cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cas service util, or <code>null</code> if a matching cas service util could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil fetchByProxyGrantingTicketIou_Last(
		java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.uib.owu.liferay.cas.model.CasServiceUtil[] findByProxyGrantingTicketIou_PrevAndNext(
		long casServiceId, java.lang.String proxyGrantingTicketIou,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException;

	/**
	* Removes all the cas service utils where proxyGrantingTicketIou = &#63; from the database.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cas service utils where proxyGrantingTicketIou = &#63;.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou
	* @return the number of matching cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public int countByProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the cas service util in the entity cache if it is enabled.
	*
	* @param casServiceUtil the cas service util
	*/
	public void cacheResult(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil);

	/**
	* Caches the cas service utils in the entity cache if it is enabled.
	*
	* @param casServiceUtils the cas service utils
	*/
	public void cacheResult(
		java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> casServiceUtils);

	/**
	* Creates a new cas service util with the primary key. Does not add the cas service util to the database.
	*
	* @param casServiceId the primary key for the new cas service util
	* @return the new cas service util
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil create(long casServiceId);

	/**
	* Removes the cas service util with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util that was removed
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil remove(long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException;

	public es.uib.owu.liferay.cas.model.CasServiceUtil updateImpl(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cas service util with the primary key or throws a {@link es.uib.owu.liferay.cas.NoSuchCasServiceUtilException} if it could not be found.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util
	* @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil findByPrimaryKey(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.uib.owu.liferay.cas.NoSuchCasServiceUtilException;

	/**
	* Returns the cas service util with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param casServiceId the primary key of the cas service util
	* @return the cas service util, or <code>null</code> if a cas service util with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.uib.owu.liferay.cas.model.CasServiceUtil fetchByPrimaryKey(
		long casServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cas service utils.
	*
	* @return the cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.uib.owu.liferay.cas.model.CasServiceUtil> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cas service utils from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cas service utils.
	*
	* @return the number of cas service utils
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}