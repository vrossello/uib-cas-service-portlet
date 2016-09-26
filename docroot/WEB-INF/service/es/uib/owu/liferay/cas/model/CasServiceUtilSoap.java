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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.uib.owu.liferay.cas.service.http.CasServiceUtilServiceSoap}.
 *
 * @author vrf495
 * @see es.uib.owu.liferay.cas.service.http.CasServiceUtilServiceSoap
 * @generated
 */
public class CasServiceUtilSoap implements Serializable {
	public static CasServiceUtilSoap toSoapModel(CasServiceUtil model) {
		CasServiceUtilSoap soapModel = new CasServiceUtilSoap();

		soapModel.setCasServiceId(model.getCasServiceId());
		soapModel.setProxyGrantingTicketIou(model.getProxyGrantingTicketIou());
		soapModel.setProxyGrantingTicket(model.getProxyGrantingTicket());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CasServiceUtilSoap[] toSoapModels(CasServiceUtil[] models) {
		CasServiceUtilSoap[] soapModels = new CasServiceUtilSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CasServiceUtilSoap[][] toSoapModels(CasServiceUtil[][] models) {
		CasServiceUtilSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CasServiceUtilSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CasServiceUtilSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CasServiceUtilSoap[] toSoapModels(List<CasServiceUtil> models) {
		List<CasServiceUtilSoap> soapModels = new ArrayList<CasServiceUtilSoap>(models.size());

		for (CasServiceUtil model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CasServiceUtilSoap[soapModels.size()]);
	}

	public CasServiceUtilSoap() {
	}

	public long getPrimaryKey() {
		return _casServiceId;
	}

	public void setPrimaryKey(long pk) {
		setCasServiceId(pk);
	}

	public long getCasServiceId() {
		return _casServiceId;
	}

	public void setCasServiceId(long casServiceId) {
		_casServiceId = casServiceId;
	}

	public String getProxyGrantingTicketIou() {
		return _proxyGrantingTicketIou;
	}

	public void setProxyGrantingTicketIou(String proxyGrantingTicketIou) {
		_proxyGrantingTicketIou = proxyGrantingTicketIou;
	}

	public String getProxyGrantingTicket() {
		return _proxyGrantingTicket;
	}

	public void setProxyGrantingTicket(String proxyGrantingTicket) {
		_proxyGrantingTicket = proxyGrantingTicket;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _casServiceId;
	private String _proxyGrantingTicketIou;
	private String _proxyGrantingTicket;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}