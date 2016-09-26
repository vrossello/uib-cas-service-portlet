package es.uib.owu.liferay.cas.service.impl;

import java.io.Serializable;

public class ProxyGrantingTicketHolder implements Serializable{

	private static final long serialVersionUID = 4920637141837494473L;

	private final String proxyGrantingTicket;

       private final long timeInserted;

       protected ProxyGrantingTicketHolder(final String proxyGrantingTicket) {
           this.proxyGrantingTicket = proxyGrantingTicket;
           this.timeInserted = System.currentTimeMillis();
       }

       public String getProxyGrantingTicket() {
           return this.proxyGrantingTicket;
       }

       final boolean isExpired(final long timeout) {
           return System.currentTimeMillis() - this.timeInserted > timeout;
       }
}
