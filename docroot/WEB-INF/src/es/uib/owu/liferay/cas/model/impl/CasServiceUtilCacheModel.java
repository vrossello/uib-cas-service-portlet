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

package es.uib.owu.liferay.cas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.uib.owu.liferay.cas.model.CasServiceUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CasServiceUtil in entity cache.
 *
 * @author vrf495
 * @see CasServiceUtil
 * @generated
 */
public class CasServiceUtilCacheModel implements CacheModel<CasServiceUtil>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{casServiceId=");
		sb.append(casServiceId);
		sb.append(", proxyGrantingTicketIou=");
		sb.append(proxyGrantingTicketIou);
		sb.append(", proxyGrantingTicket=");
		sb.append(proxyGrantingTicket);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CasServiceUtil toEntityModel() {
		CasServiceUtilImpl casServiceUtilImpl = new CasServiceUtilImpl();

		casServiceUtilImpl.setCasServiceId(casServiceId);

		if (proxyGrantingTicketIou == null) {
			casServiceUtilImpl.setProxyGrantingTicketIou(StringPool.BLANK);
		}
		else {
			casServiceUtilImpl.setProxyGrantingTicketIou(proxyGrantingTicketIou);
		}

		if (proxyGrantingTicket == null) {
			casServiceUtilImpl.setProxyGrantingTicket(StringPool.BLANK);
		}
		else {
			casServiceUtilImpl.setProxyGrantingTicket(proxyGrantingTicket);
		}

		casServiceUtilImpl.setGroupId(groupId);
		casServiceUtilImpl.setCompanyId(companyId);
		casServiceUtilImpl.setUserId(userId);

		if (userName == null) {
			casServiceUtilImpl.setUserName(StringPool.BLANK);
		}
		else {
			casServiceUtilImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			casServiceUtilImpl.setCreateDate(null);
		}
		else {
			casServiceUtilImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			casServiceUtilImpl.setModifiedDate(null);
		}
		else {
			casServiceUtilImpl.setModifiedDate(new Date(modifiedDate));
		}

		casServiceUtilImpl.resetOriginalValues();

		return casServiceUtilImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		casServiceId = objectInput.readLong();
		proxyGrantingTicketIou = objectInput.readUTF();
		proxyGrantingTicket = objectInput.readUTF();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(casServiceId);

		if (proxyGrantingTicketIou == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proxyGrantingTicketIou);
		}

		if (proxyGrantingTicket == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proxyGrantingTicket);
		}

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long casServiceId;
	public String proxyGrantingTicketIou;
	public String proxyGrantingTicket;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}