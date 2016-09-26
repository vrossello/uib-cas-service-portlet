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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import es.uib.owu.liferay.cas.service.CasServiceUtilLocalServiceUtil;
import es.uib.owu.liferay.cas.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vrf495
 */
public class CasServiceUtilClp extends BaseModelImpl<CasServiceUtil>
	implements CasServiceUtil {
	public CasServiceUtilClp() {
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
	public long getPrimaryKey() {
		return _casServiceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCasServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _casServiceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCasServiceId() {
		return _casServiceId;
	}

	@Override
	public void setCasServiceId(long casServiceId) {
		_casServiceId = casServiceId;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setCasServiceId", long.class);

				method.invoke(_casServiceUtilRemoteModel, casServiceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProxyGrantingTicketIou() {
		return _proxyGrantingTicketIou;
	}

	@Override
	public void setProxyGrantingTicketIou(String proxyGrantingTicketIou) {
		_proxyGrantingTicketIou = proxyGrantingTicketIou;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setProxyGrantingTicketIou",
						String.class);

				method.invoke(_casServiceUtilRemoteModel, proxyGrantingTicketIou);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProxyGrantingTicket() {
		return _proxyGrantingTicket;
	}

	@Override
	public void setProxyGrantingTicket(String proxyGrantingTicket) {
		_proxyGrantingTicket = proxyGrantingTicket;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setProxyGrantingTicket",
						String.class);

				method.invoke(_casServiceUtilRemoteModel, proxyGrantingTicket);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_casServiceUtilRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_casServiceUtilRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_casServiceUtilRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_casServiceUtilRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_casServiceUtilRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_casServiceUtilRemoteModel != null) {
			try {
				Class<?> clazz = _casServiceUtilRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_casServiceUtilRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCasServiceUtilRemoteModel() {
		return _casServiceUtilRemoteModel;
	}

	public void setCasServiceUtilRemoteModel(
		BaseModel<?> casServiceUtilRemoteModel) {
		_casServiceUtilRemoteModel = casServiceUtilRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _casServiceUtilRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_casServiceUtilRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CasServiceUtilLocalServiceUtil.addCasServiceUtil(this);
		}
		else {
			CasServiceUtilLocalServiceUtil.updateCasServiceUtil(this);
		}
	}

	@Override
	public CasServiceUtil toEscapedModel() {
		return (CasServiceUtil)ProxyUtil.newProxyInstance(CasServiceUtil.class.getClassLoader(),
			new Class[] { CasServiceUtil.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CasServiceUtilClp clone = new CasServiceUtilClp();

		clone.setCasServiceId(getCasServiceId());
		clone.setProxyGrantingTicketIou(getProxyGrantingTicketIou());
		clone.setProxyGrantingTicket(getProxyGrantingTicket());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(CasServiceUtil casServiceUtil) {
		long primaryKey = casServiceUtil.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CasServiceUtilClp)) {
			return false;
		}

		CasServiceUtilClp casServiceUtil = (CasServiceUtilClp)obj;

		long primaryKey = casServiceUtil.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{casServiceId=");
		sb.append(getCasServiceId());
		sb.append(", proxyGrantingTicketIou=");
		sb.append(getProxyGrantingTicketIou());
		sb.append(", proxyGrantingTicket=");
		sb.append(getProxyGrantingTicket());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("es.uib.owu.liferay.cas.model.CasServiceUtil");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>casServiceId</column-name><column-value><![CDATA[");
		sb.append(getCasServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proxyGrantingTicketIou</column-name><column-value><![CDATA[");
		sb.append(getProxyGrantingTicketIou());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proxyGrantingTicket</column-name><column-value><![CDATA[");
		sb.append(getProxyGrantingTicket());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _casServiceId;
	private String _proxyGrantingTicketIou;
	private String _proxyGrantingTicket;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _casServiceUtilRemoteModel;
	private Class<?> _clpSerializerClass = es.uib.owu.liferay.cas.service.ClpSerializer.class;
}