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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.uib.owu.liferay.cas.NoSuchCasServiceUtilException;
import es.uib.owu.liferay.cas.model.CasServiceUtil;
import es.uib.owu.liferay.cas.model.impl.CasServiceUtilImpl;
import es.uib.owu.liferay.cas.model.impl.CasServiceUtilModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cas service util service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vrf495
 * @see CasServiceUtilPersistence
 * @see CasServiceUtilUtil
 * @generated
 */
public class CasServiceUtilPersistenceImpl extends BasePersistenceImpl<CasServiceUtil>
	implements CasServiceUtilPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CasServiceUtilUtil} to access the cas service util persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CasServiceUtilImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilModelImpl.FINDER_CACHE_ENABLED,
			CasServiceUtilImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilModelImpl.FINDER_CACHE_ENABLED,
			CasServiceUtilImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROXYGRANTINGTICKETIOU =
		new FinderPath(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilModelImpl.FINDER_CACHE_ENABLED,
			CasServiceUtilImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProxyGrantingTicketIou",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROXYGRANTINGTICKETIOU =
		new FinderPath(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilModelImpl.FINDER_CACHE_ENABLED,
			CasServiceUtilImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProxyGrantingTicketIou",
			new String[] { String.class.getName() },
			CasServiceUtilModelImpl.PROXYGRANTINGTICKETIOU_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PROXYGRANTINGTICKETIOU = new FinderPath(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProxyGrantingTicketIou",
			new String[] { String.class.getName() });

	/**
	 * Returns all the cas service utils where proxyGrantingTicketIou = &#63;.
	 *
	 * @param proxyGrantingTicketIou the proxy granting ticket iou
	 * @return the matching cas service utils
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CasServiceUtil> findByProxyGrantingTicketIou(
		String proxyGrantingTicketIou) throws SystemException {
		return findByProxyGrantingTicketIou(proxyGrantingTicketIou,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CasServiceUtil> findByProxyGrantingTicketIou(
		String proxyGrantingTicketIou, int start, int end)
		throws SystemException {
		return findByProxyGrantingTicketIou(proxyGrantingTicketIou, start, end,
			null);
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
	@Override
	public List<CasServiceUtil> findByProxyGrantingTicketIou(
		String proxyGrantingTicketIou, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROXYGRANTINGTICKETIOU;
			finderArgs = new Object[] { proxyGrantingTicketIou };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROXYGRANTINGTICKETIOU;
			finderArgs = new Object[] {
					proxyGrantingTicketIou,
					
					start, end, orderByComparator
				};
		}

		List<CasServiceUtil> list = (List<CasServiceUtil>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CasServiceUtil casServiceUtil : list) {
				if (!Validator.equals(proxyGrantingTicketIou,
							casServiceUtil.getProxyGrantingTicketIou())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CASSERVICEUTIL_WHERE);

			boolean bindProxyGrantingTicketIou = false;

			if (proxyGrantingTicketIou == null) {
				query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_1);
			}
			else if (proxyGrantingTicketIou.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_3);
			}
			else {
				bindProxyGrantingTicketIou = true;

				query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CasServiceUtilModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProxyGrantingTicketIou) {
					qPos.add(proxyGrantingTicketIou);
				}

				if (!pagination) {
					list = (List<CasServiceUtil>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CasServiceUtil>(list);
				}
				else {
					list = (List<CasServiceUtil>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public CasServiceUtil findByProxyGrantingTicketIou_First(
		String proxyGrantingTicketIou, OrderByComparator orderByComparator)
		throws NoSuchCasServiceUtilException, SystemException {
		CasServiceUtil casServiceUtil = fetchByProxyGrantingTicketIou_First(proxyGrantingTicketIou,
				orderByComparator);

		if (casServiceUtil != null) {
			return casServiceUtil;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("proxyGrantingTicketIou=");
		msg.append(proxyGrantingTicketIou);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCasServiceUtilException(msg.toString());
	}

	/**
	 * Returns the first cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	 *
	 * @param proxyGrantingTicketIou the proxy granting ticket iou
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cas service util, or <code>null</code> if a matching cas service util could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil fetchByProxyGrantingTicketIou_First(
		String proxyGrantingTicketIou, OrderByComparator orderByComparator)
		throws SystemException {
		List<CasServiceUtil> list = findByProxyGrantingTicketIou(proxyGrantingTicketIou,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CasServiceUtil findByProxyGrantingTicketIou_Last(
		String proxyGrantingTicketIou, OrderByComparator orderByComparator)
		throws NoSuchCasServiceUtilException, SystemException {
		CasServiceUtil casServiceUtil = fetchByProxyGrantingTicketIou_Last(proxyGrantingTicketIou,
				orderByComparator);

		if (casServiceUtil != null) {
			return casServiceUtil;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("proxyGrantingTicketIou=");
		msg.append(proxyGrantingTicketIou);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCasServiceUtilException(msg.toString());
	}

	/**
	 * Returns the last cas service util in the ordered set where proxyGrantingTicketIou = &#63;.
	 *
	 * @param proxyGrantingTicketIou the proxy granting ticket iou
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cas service util, or <code>null</code> if a matching cas service util could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil fetchByProxyGrantingTicketIou_Last(
		String proxyGrantingTicketIou, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByProxyGrantingTicketIou(proxyGrantingTicketIou);

		if (count == 0) {
			return null;
		}

		List<CasServiceUtil> list = findByProxyGrantingTicketIou(proxyGrantingTicketIou,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CasServiceUtil[] findByProxyGrantingTicketIou_PrevAndNext(
		long casServiceId, String proxyGrantingTicketIou,
		OrderByComparator orderByComparator)
		throws NoSuchCasServiceUtilException, SystemException {
		CasServiceUtil casServiceUtil = findByPrimaryKey(casServiceId);

		Session session = null;

		try {
			session = openSession();

			CasServiceUtil[] array = new CasServiceUtilImpl[3];

			array[0] = getByProxyGrantingTicketIou_PrevAndNext(session,
					casServiceUtil, proxyGrantingTicketIou, orderByComparator,
					true);

			array[1] = casServiceUtil;

			array[2] = getByProxyGrantingTicketIou_PrevAndNext(session,
					casServiceUtil, proxyGrantingTicketIou, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CasServiceUtil getByProxyGrantingTicketIou_PrevAndNext(
		Session session, CasServiceUtil casServiceUtil,
		String proxyGrantingTicketIou, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CASSERVICEUTIL_WHERE);

		boolean bindProxyGrantingTicketIou = false;

		if (proxyGrantingTicketIou == null) {
			query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_1);
		}
		else if (proxyGrantingTicketIou.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_3);
		}
		else {
			bindProxyGrantingTicketIou = true;

			query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CasServiceUtilModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProxyGrantingTicketIou) {
			qPos.add(proxyGrantingTicketIou);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(casServiceUtil);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CasServiceUtil> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cas service utils where proxyGrantingTicketIou = &#63; from the database.
	 *
	 * @param proxyGrantingTicketIou the proxy granting ticket iou
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProxyGrantingTicketIou(String proxyGrantingTicketIou)
		throws SystemException {
		for (CasServiceUtil casServiceUtil : findByProxyGrantingTicketIou(
				proxyGrantingTicketIou, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(casServiceUtil);
		}
	}

	/**
	 * Returns the number of cas service utils where proxyGrantingTicketIou = &#63;.
	 *
	 * @param proxyGrantingTicketIou the proxy granting ticket iou
	 * @return the number of matching cas service utils
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProxyGrantingTicketIou(String proxyGrantingTicketIou)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PROXYGRANTINGTICKETIOU;

		Object[] finderArgs = new Object[] { proxyGrantingTicketIou };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CASSERVICEUTIL_WHERE);

			boolean bindProxyGrantingTicketIou = false;

			if (proxyGrantingTicketIou == null) {
				query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_1);
			}
			else if (proxyGrantingTicketIou.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_3);
			}
			else {
				bindProxyGrantingTicketIou = true;

				query.append(_FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProxyGrantingTicketIou) {
					qPos.add(proxyGrantingTicketIou);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_1 =
		"casServiceUtil.proxyGrantingTicketIou IS NULL";
	private static final String _FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_2 =
		"casServiceUtil.proxyGrantingTicketIou = ?";
	private static final String _FINDER_COLUMN_PROXYGRANTINGTICKETIOU_PROXYGRANTINGTICKETIOU_3 =
		"(casServiceUtil.proxyGrantingTicketIou IS NULL OR casServiceUtil.proxyGrantingTicketIou = '')";

	public CasServiceUtilPersistenceImpl() {
		setModelClass(CasServiceUtil.class);
	}

	/**
	 * Caches the cas service util in the entity cache if it is enabled.
	 *
	 * @param casServiceUtil the cas service util
	 */
	@Override
	public void cacheResult(CasServiceUtil casServiceUtil) {
		EntityCacheUtil.putResult(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilImpl.class, casServiceUtil.getPrimaryKey(),
			casServiceUtil);

		casServiceUtil.resetOriginalValues();
	}

	/**
	 * Caches the cas service utils in the entity cache if it is enabled.
	 *
	 * @param casServiceUtils the cas service utils
	 */
	@Override
	public void cacheResult(List<CasServiceUtil> casServiceUtils) {
		for (CasServiceUtil casServiceUtil : casServiceUtils) {
			if (EntityCacheUtil.getResult(
						CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
						CasServiceUtilImpl.class, casServiceUtil.getPrimaryKey()) == null) {
				cacheResult(casServiceUtil);
			}
			else {
				casServiceUtil.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cas service utils.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CasServiceUtilImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CasServiceUtilImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cas service util.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CasServiceUtil casServiceUtil) {
		EntityCacheUtil.removeResult(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilImpl.class, casServiceUtil.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CasServiceUtil> casServiceUtils) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CasServiceUtil casServiceUtil : casServiceUtils) {
			EntityCacheUtil.removeResult(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
				CasServiceUtilImpl.class, casServiceUtil.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cas service util with the primary key. Does not add the cas service util to the database.
	 *
	 * @param casServiceId the primary key for the new cas service util
	 * @return the new cas service util
	 */
	@Override
	public CasServiceUtil create(long casServiceId) {
		CasServiceUtil casServiceUtil = new CasServiceUtilImpl();

		casServiceUtil.setNew(true);
		casServiceUtil.setPrimaryKey(casServiceId);

		return casServiceUtil;
	}

	/**
	 * Removes the cas service util with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param casServiceId the primary key of the cas service util
	 * @return the cas service util that was removed
	 * @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil remove(long casServiceId)
		throws NoSuchCasServiceUtilException, SystemException {
		return remove((Serializable)casServiceId);
	}

	/**
	 * Removes the cas service util with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cas service util
	 * @return the cas service util that was removed
	 * @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil remove(Serializable primaryKey)
		throws NoSuchCasServiceUtilException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CasServiceUtil casServiceUtil = (CasServiceUtil)session.get(CasServiceUtilImpl.class,
					primaryKey);

			if (casServiceUtil == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCasServiceUtilException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(casServiceUtil);
		}
		catch (NoSuchCasServiceUtilException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CasServiceUtil removeImpl(CasServiceUtil casServiceUtil)
		throws SystemException {
		casServiceUtil = toUnwrappedModel(casServiceUtil);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(casServiceUtil)) {
				casServiceUtil = (CasServiceUtil)session.get(CasServiceUtilImpl.class,
						casServiceUtil.getPrimaryKeyObj());
			}

			if (casServiceUtil != null) {
				session.delete(casServiceUtil);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (casServiceUtil != null) {
			clearCache(casServiceUtil);
		}

		return casServiceUtil;
	}

	@Override
	public CasServiceUtil updateImpl(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil)
		throws SystemException {
		casServiceUtil = toUnwrappedModel(casServiceUtil);

		boolean isNew = casServiceUtil.isNew();

		CasServiceUtilModelImpl casServiceUtilModelImpl = (CasServiceUtilModelImpl)casServiceUtil;

		Session session = null;

		try {
			session = openSession();

			if (casServiceUtil.isNew()) {
				session.save(casServiceUtil);

				casServiceUtil.setNew(false);
			}
			else {
				session.merge(casServiceUtil);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CasServiceUtilModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((casServiceUtilModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROXYGRANTINGTICKETIOU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						casServiceUtilModelImpl.getOriginalProxyGrantingTicketIou()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROXYGRANTINGTICKETIOU,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROXYGRANTINGTICKETIOU,
					args);

				args = new Object[] {
						casServiceUtilModelImpl.getProxyGrantingTicketIou()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROXYGRANTINGTICKETIOU,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROXYGRANTINGTICKETIOU,
					args);
			}
		}

		EntityCacheUtil.putResult(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
			CasServiceUtilImpl.class, casServiceUtil.getPrimaryKey(),
			casServiceUtil);

		return casServiceUtil;
	}

	protected CasServiceUtil toUnwrappedModel(CasServiceUtil casServiceUtil) {
		if (casServiceUtil instanceof CasServiceUtilImpl) {
			return casServiceUtil;
		}

		CasServiceUtilImpl casServiceUtilImpl = new CasServiceUtilImpl();

		casServiceUtilImpl.setNew(casServiceUtil.isNew());
		casServiceUtilImpl.setPrimaryKey(casServiceUtil.getPrimaryKey());

		casServiceUtilImpl.setCasServiceId(casServiceUtil.getCasServiceId());
		casServiceUtilImpl.setProxyGrantingTicketIou(casServiceUtil.getProxyGrantingTicketIou());
		casServiceUtilImpl.setProxyGrantingTicket(casServiceUtil.getProxyGrantingTicket());
		casServiceUtilImpl.setGroupId(casServiceUtil.getGroupId());
		casServiceUtilImpl.setCompanyId(casServiceUtil.getCompanyId());
		casServiceUtilImpl.setUserId(casServiceUtil.getUserId());
		casServiceUtilImpl.setUserName(casServiceUtil.getUserName());
		casServiceUtilImpl.setCreateDate(casServiceUtil.getCreateDate());
		casServiceUtilImpl.setModifiedDate(casServiceUtil.getModifiedDate());

		return casServiceUtilImpl;
	}

	/**
	 * Returns the cas service util with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cas service util
	 * @return the cas service util
	 * @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCasServiceUtilException, SystemException {
		CasServiceUtil casServiceUtil = fetchByPrimaryKey(primaryKey);

		if (casServiceUtil == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCasServiceUtilException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return casServiceUtil;
	}

	/**
	 * Returns the cas service util with the primary key or throws a {@link es.uib.owu.liferay.cas.NoSuchCasServiceUtilException} if it could not be found.
	 *
	 * @param casServiceId the primary key of the cas service util
	 * @return the cas service util
	 * @throws es.uib.owu.liferay.cas.NoSuchCasServiceUtilException if a cas service util with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil findByPrimaryKey(long casServiceId)
		throws NoSuchCasServiceUtilException, SystemException {
		return findByPrimaryKey((Serializable)casServiceId);
	}

	/**
	 * Returns the cas service util with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cas service util
	 * @return the cas service util, or <code>null</code> if a cas service util with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CasServiceUtil casServiceUtil = (CasServiceUtil)EntityCacheUtil.getResult(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
				CasServiceUtilImpl.class, primaryKey);

		if (casServiceUtil == _nullCasServiceUtil) {
			return null;
		}

		if (casServiceUtil == null) {
			Session session = null;

			try {
				session = openSession();

				casServiceUtil = (CasServiceUtil)session.get(CasServiceUtilImpl.class,
						primaryKey);

				if (casServiceUtil != null) {
					cacheResult(casServiceUtil);
				}
				else {
					EntityCacheUtil.putResult(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
						CasServiceUtilImpl.class, primaryKey,
						_nullCasServiceUtil);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CasServiceUtilModelImpl.ENTITY_CACHE_ENABLED,
					CasServiceUtilImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return casServiceUtil;
	}

	/**
	 * Returns the cas service util with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param casServiceId the primary key of the cas service util
	 * @return the cas service util, or <code>null</code> if a cas service util with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CasServiceUtil fetchByPrimaryKey(long casServiceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)casServiceId);
	}

	/**
	 * Returns all the cas service utils.
	 *
	 * @return the cas service utils
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CasServiceUtil> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<CasServiceUtil> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<CasServiceUtil> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CasServiceUtil> list = (List<CasServiceUtil>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CASSERVICEUTIL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CASSERVICEUTIL;

				if (pagination) {
					sql = sql.concat(CasServiceUtilModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CasServiceUtil>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CasServiceUtil>(list);
				}
				else {
					list = (List<CasServiceUtil>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cas service utils from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CasServiceUtil casServiceUtil : findAll()) {
			remove(casServiceUtil);
		}
	}

	/**
	 * Returns the number of cas service utils.
	 *
	 * @return the number of cas service utils
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CASSERVICEUTIL);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the cas service util persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.uib.owu.liferay.cas.model.CasServiceUtil")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CasServiceUtil>> listenersList = new ArrayList<ModelListener<CasServiceUtil>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CasServiceUtil>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CasServiceUtilImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CASSERVICEUTIL = "SELECT casServiceUtil FROM CasServiceUtil casServiceUtil";
	private static final String _SQL_SELECT_CASSERVICEUTIL_WHERE = "SELECT casServiceUtil FROM CasServiceUtil casServiceUtil WHERE ";
	private static final String _SQL_COUNT_CASSERVICEUTIL = "SELECT COUNT(casServiceUtil) FROM CasServiceUtil casServiceUtil";
	private static final String _SQL_COUNT_CASSERVICEUTIL_WHERE = "SELECT COUNT(casServiceUtil) FROM CasServiceUtil casServiceUtil WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "casServiceUtil.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CasServiceUtil exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CasServiceUtil exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CasServiceUtilPersistenceImpl.class);
	private static CasServiceUtil _nullCasServiceUtil = new CasServiceUtilImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CasServiceUtil> toCacheModel() {
				return _nullCasServiceUtilCacheModel;
			}
		};

	private static CacheModel<CasServiceUtil> _nullCasServiceUtilCacheModel = new CacheModel<CasServiceUtil>() {
			@Override
			public CasServiceUtil toEntityModel() {
				return _nullCasServiceUtil;
			}
		};
}