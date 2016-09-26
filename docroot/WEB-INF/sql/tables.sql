create table casutil_CasServiceUtil (
	casServiceId LONG not null primary key,
	proxyGrantingTicketIou VARCHAR(75) null,
	proxyGrantingTicket VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);