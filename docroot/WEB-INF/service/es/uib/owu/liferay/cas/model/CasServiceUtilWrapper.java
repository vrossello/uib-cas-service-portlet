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

package es.uib.owu.liferay.cas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CasServiceUtil}.
 * </p>
 *
 * @author vrf495
 * @see CasServiceUtil
 * @generated
 */
public class CasServiceUtilWrapper implements CasServiceUtil,
	ModelWrapper<CasServiceUtil> {
	public CasServiceUtilWrapper(CasServiceUtil casServiceUtil) {
		_casServiceUtil = casServiceUtil;
	}

	@Override
	public Class<?> getModelClass() {
		return CasServiceUtil.class;
	}

	@Override
	public String getModelClassName() {
		return CasServiceUtil.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("casServiceId", getCasServiceId());
		attributes.put("proxyGrantingTicketIou", getProxyGrantingTicketIou());
		attributes.put("proxyGrantingTicket", getProxyGrantingTicket());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long casServiceId = (Long)attributes.get("casServiceId");

		if (casServiceId != null) {
			setCasServiceId(casServiceId);
		}

		String proxyGrantingTicketIou = (String)attributes.get(
				"proxyGrantingTicketIou");

		if (proxyGrantingTicketIou != null) {
			setProxyGrantingTicketIou(proxyGrantingTicketIou);
		}

		String proxyGrantingTicket = (String)attributes.get(
				"proxyGrantingTicket");

		if (proxyGrantingTicket != null) {
			setProxyGrantingTicket(proxyGrantingTicket);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this cas service util.
	*
	* @return the primary key of this cas service util
	*/
	@Override
	public long getPrimaryKey() {
		return _casServiceUtil.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cas service util.
	*
	* @param primaryKey the primary key of this cas service util
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_casServiceUtil.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cas service ID of this cas service util.
	*
	* @return the cas service ID of this cas service util
	*/
	@Override
	public long getCasServiceId() {
		return _casServiceUtil.getCasServiceId();
	}

	/**
	* Sets the cas service ID of this cas service util.
	*
	* @param casServiceId the cas service ID of this cas service util
	*/
	@Override
	public void setCasServiceId(long casServiceId) {
		_casServiceUtil.setCasServiceId(casServiceId);
	}

	/**
	* Returns the proxy granting ticket iou of this cas service util.
	*
	* @return the proxy granting ticket iou of this cas service util
	*/
	@Override
	public java.lang.String getProxyGrantingTicketIou() {
		return _casServiceUtil.getProxyGrantingTicketIou();
	}

	/**
	* Sets the proxy granting ticket iou of this cas service util.
	*
	* @param proxyGrantingTicketIou the proxy granting ticket iou of this cas service util
	*/
	@Override
	public void setProxyGrantingTicketIou(
		java.lang.String proxyGrantingTicketIou) {
		_casServiceUtil.setProxyGrantingTicketIou(proxyGrantingTicketIou);
	}

	/**
	* Returns the proxy granting ticket of this cas service util.
	*
	* @return the proxy granting ticket of this cas service util
	*/
	@Override
	public java.lang.String getProxyGrantingTicket() {
		return _casServiceUtil.getProxyGrantingTicket();
	}

	/**
	* Sets the proxy granting ticket of this cas service util.
	*
	* @param proxyGrantingTicket the proxy granting ticket of this cas service util
	*/
	@Override
	public void setProxyGrantingTicket(java.lang.String proxyGrantingTicket) {
		_casServiceUtil.setProxyGrantingTicket(proxyGrantingTicket);
	}

	/**
	* Returns the group ID of this cas service util.
	*
	* @return the group ID of this cas service util
	*/
	@Override
	public long getGroupId() {
		return _casServiceUtil.getGroupId();
	}

	/**
	* Sets the group ID of this cas service util.
	*
	* @param groupId the group ID of this cas service util
	*/
	@Override
	public void setGroupId(long groupId) {
		_casServiceUtil.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this cas service util.
	*
	* @return the company ID of this cas service util
	*/
	@Override
	public long getCompanyId() {
		return _casServiceUtil.getCompanyId();
	}

	/**
	* Sets the company ID of this cas service util.
	*
	* @param companyId the company ID of this cas service util
	*/
	@Override
	public void setCompanyId(long companyId) {
		_casServiceUtil.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this cas service util.
	*
	* @return the user ID of this cas service util
	*/
	@Override
	public long getUserId() {
		return _casServiceUtil.getUserId();
	}

	/**
	* Sets the user ID of this cas service util.
	*
	* @param userId the user ID of this cas service util
	*/
	@Override
	public void setUserId(long userId) {
		_casServiceUtil.setUserId(userId);
	}

	/**
	* Returns the user uuid of this cas service util.
	*
	* @return the user uuid of this cas service util
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casServiceUtil.getUserUuid();
	}

	/**
	* Sets the user uuid of this cas service util.
	*
	* @param userUuid the user uuid of this cas service util
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_casServiceUtil.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this cas service util.
	*
	* @return the user name of this cas service util
	*/
	@Override
	public java.lang.String getUserName() {
		return _casServiceUtil.getUserName();
	}

	/**
	* Sets the user name of this cas service util.
	*
	* @param userName the user name of this cas service util
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_casServiceUtil.setUserName(userName);
	}

	/**
	* Returns the create date of this cas service util.
	*
	* @return the create date of this cas service util
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _casServiceUtil.getCreateDate();
	}

	/**
	* Sets the create date of this cas service util.
	*
	* @param createDate the create date of this cas service util
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_casServiceUtil.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this cas service util.
	*
	* @return the modified date of this cas service util
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _casServiceUtil.getModifiedDate();
	}

	/**
	* Sets the modified date of this cas service util.
	*
	* @param modifiedDate the modified date of this cas service util
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_casServiceUtil.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _casServiceUtil.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_casServiceUtil.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _casServiceUtil.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_casServiceUtil.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _casServiceUtil.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _casServiceUtil.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_casServiceUtil.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _casServiceUtil.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_casServiceUtil.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_casServiceUtil.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_casServiceUtil.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CasServiceUtilWrapper((CasServiceUtil)_casServiceUtil.clone());
	}

	@Override
	public int compareTo(
		es.uib.owu.liferay.cas.model.CasServiceUtil casServiceUtil) {
		return _casServiceUtil.compareTo(casServiceUtil);
	}

	@Override
	public int hashCode() {
		return _casServiceUtil.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.uib.owu.liferay.cas.model.CasServiceUtil> toCacheModel() {
		return _casServiceUtil.toCacheModel();
	}

	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil toEscapedModel() {
		return new CasServiceUtilWrapper(_casServiceUtil.toEscapedModel());
	}

	@Override
	public es.uib.owu.liferay.cas.model.CasServiceUtil toUnescapedModel() {
		return new CasServiceUtilWrapper(_casServiceUtil.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _casServiceUtil.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _casServiceUtil.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_casServiceUtil.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CasServiceUtilWrapper)) {
			return false;
		}

		CasServiceUtilWrapper casServiceUtilWrapper = (CasServiceUtilWrapper)obj;

		if (Validator.equals(_casServiceUtil,
					casServiceUtilWrapper._casServiceUtil)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CasServiceUtil getWrappedCasServiceUtil() {
		return _casServiceUtil;
	}

	@Override
	public CasServiceUtil getWrappedModel() {
		return _casServiceUtil;
	}

	@Override
	public void resetOriginalValues() {
		_casServiceUtil.resetOriginalValues();
	}

	private CasServiceUtil _casServiceUtil;
}