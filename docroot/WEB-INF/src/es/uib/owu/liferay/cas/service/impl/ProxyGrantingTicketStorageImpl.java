/*
 * Copyright 2007 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.ja-sig.org/products/cas/overview/license/index.html
 */
package es.uib.owu.liferay.cas.service.impl;

import java.io.Serializable;
import java.util.List;

import org.jasig.cas.client.proxy.ProxyGrantingTicketStorage;
import org.jasig.cas.client.util.CommonUtils;

import com.liferay.portal.kernel.cache.MultiVMPoolUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import es.uib.owu.liferay.cas.model.CasServiceUtil;
import es.uib.owu.liferay.cas.service.CasServiceUtilLocalServiceUtil;

/**
 * Implementation of {@link ProxyGrantingTicketStorage} that is backed by a
 * HashMap that keeps a ProxyGrantingTicket for a specified amount of time.
 * <p>
 * {@link ProxyGrantingTicketStorage#cleanUp()} must be called on a regular basis to
 * keep the HashMap from growing indefinitely.
 *
 * @author Scott Battaglia
 * @author Brad Cupit (brad [at] lsu {dot} edu)
 * @version $Revision: 11729 $ $Date: 2007-09-26 14:22:30 -0400 (Tue, 26 Sep 2007) $
 * @since 3.0
 */
public final class ProxyGrantingTicketStorageImpl implements ProxyGrantingTicketStorage, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8119814499263266897L;

	//private final Log log = LogFactory.getLog(getClass());
	private static Log log = LogFactoryUtil.getLog(ProxyGrantingTicketStorageImpl.class);
	
	//private static final String CACHE_PGTS = "proxyGrantingTicketStorage-Cache";

    /**
     * Default timeout in milliseconds.
     */
    private static final long DEFAULT_TIMEOUT = 60*1000; //1min
    private static final int  DEFAULT_TIMETOLIVE_SECONDS = 24*60*60; //24h

    /**
     * Map that stores the PGTIOU to PGT mappings.
     */
   // private final Map cache = Collections.synchronizedMap(new HashMap());

    /**
     * time, in milliseconds, before a {@link ProxyGrantingTicketHolder}
     * is considered expired and ready for removal.
     * 
     * @see ProxyGrantingTicketStorageImpl#DEFAULT_TIMEOUT
     */
	private long timeout;

    /**
     * Constructor set the timeout to the default value.
     */
    public ProxyGrantingTicketStorageImpl() {
        this(DEFAULT_TIMEOUT);
    }

    /**
     * Sets the amount of time to hold on to a ProxyGrantingTicket if its never
     * been retrieved.
     *
     * @param timeout the time to hold on to the ProxyGrantingTicket
     */
    public ProxyGrantingTicketStorageImpl(final long timeout) {
    	this.timeout = timeout;
    	 if (log.isDebugEnabled()) {
	        	log.debug("***New ProxyGrantingTicketStorageImpl");
	      }
    }

    /**
     * NOTE: you can only retrieve a ProxyGrantingTicket once with this method.
     * Its removed after retrieval.
     */
    public String retrieve(final String proxyGrantingTicketIou) {
    	  if (CommonUtils.isBlank(proxyGrantingTicketIou)) {
              return null;
          }
    	String pgt = null;
    	log.debug("retrieving.."+this);
    	try {
			List<CasServiceUtil> csus = CasServiceUtilLocalServiceUtil.getProxyTickets(proxyGrantingTicketIou);
			if (csus!=null && csus.size()>0){
				log.debug("getProxyTickets size: "+csus.size());
				 pgt = csus.get(0).getProxyGrantingTicket();
				 if (log.isDebugEnabled()) {
			        	log.debug("Returned ProxyGrantingTicket [" +pgt + "]");
			      }
				 return pgt;
				
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("No Proxy Ticket found for [" + proxyGrantingTicketIou + "].");
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("No Proxy Ticket found for [" + proxyGrantingTicketIou + "].");
		}
    	return null;
    	/*
    	 ProxyGrantingTicketHolder holder =  ( ProxyGrantingTicketHolder) MultiVMPoolUtil.getCache(CACHE_PGTS).get(proxyGrantingTicketIou);
    	//final ProxyGrantingTicketHolder holder = (ProxyGrantingTicketHolder) this.cache.get(proxyGrantingTicketIou);

        if (holder == null) {
        	log.info("No Proxy Ticket found for [" + proxyGrantingTicketIou + "].");
            return null;
        }

        MultiVMPoolUtil.getCache(CACHE_PGTS).remove(proxyGrantingTicketIou);
        //this.cache.remove(holder);

        if (log.isDebugEnabled()) {
        	log.debug("Returned ProxyGrantingTicket of [" + holder.getProxyGrantingTicket() + "]");
        }
        return holder.getProxyGrantingTicket();
        */
    }

    public void save(final String proxyGrantingTicketIou,
                     final String proxyGrantingTicket) {
        /*final ProxyGrantingTicketHolder holder = new ProxyGrantingTicketHolder(
                proxyGrantingTicket);*/

        if (log.isDebugEnabled()) {
        	log.debug("Saving ProxyGrantingTicketIOU and ProxyGrantingTicket combo: [" + proxyGrantingTicketIou + ", " + proxyGrantingTicket + "]");
        }
       
        
        try {
			CasServiceUtilLocalServiceUtil.addProxyTickets(proxyGrantingTicketIou, proxyGrantingTicket);
		} catch (SystemException e) {
			log.error(e);
		}
        
       // MultiVMPoolUtil.getCache(CACHE_PGTS).put(proxyGrantingTicketIou, holder, DEFAULT_TIMETOLIVE_SECONDS);
        //this.cache.put(proxyGrantingTicketIou, holder);
    }

    private final boolean isExpired(CasServiceUtil csu) {
        return System.currentTimeMillis() - csu.getCreateDate().getTime() > timeout;
    }
    
    /**
     * Cleans up old, expired proxy tickets. This method must be
     * called regularly via an external thread or timer.
     */
    public void cleanUp() {    	
    	try {
			List<CasServiceUtil> llista = CasServiceUtilLocalServiceUtil.findAllCSU();
			for(CasServiceUtil csu: llista){
				if (isExpired(csu)){
					 if (log.isDebugEnabled()) {
	                       	log.debug("CleanUp  holder.isExpired(this.timeout): true");
	                       	log.debug(" PGTiou: "+csu.getProxyGrantingTicketIou());
	                       	log.debug(" PGT: "+csu.getProxyGrantingTicket());
	                       }
					 CasServiceUtilLocalServiceUtil.removeCSU(csu.getCasServiceId());
				}
			}
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("cleanUp", e);
		}
      /*  	 for(Serializable key:MultiVMPoolUtil.getCache(CACHE_PGTS).getKeys()){
        		 final ProxyGrantingTicketHolder holder = (ProxyGrantingTicketHolder)  MultiVMPoolUtil.getCache(CACHE_PGTS).get(key);        		
                 if (holder.isExpired(this.timeout)) {
                	 if (log.isDebugEnabled()) {
                       	log.debug("CleanUp  holder.isExpired(this.timeout): "+holder.isExpired(this.timeout));
                       	log.debug("ProxyGrantingTicketHolder PGT: "+holder.getProxyGrantingTicket());
                       }
                	 MultiVMPoolUtil.getCache(CACHE_PGTS).remove(key);
                 } 
        	 }
        	 */
        	 /*
            synchronized (this.cache) {
            for (final Iterator iter = this.cache.values().iterator(); iter
                    .hasNext();) {
                final ProxyGrantingTicketHolder holder = (ProxyGrantingTicketHolder) iter.next();
                if (log.isDebugEnabled()) {
                 	log.debug("CleanUp?  holder.isExpired(this.timeout): "+holder.isExpired(this.timeout));
                 	log.debug("ProxyGrantingTicketHolder PGT: "+holder.proxyGrantingTicket);
                 }
                if (holder.isExpired(this.timeout)) {
                    iter.remove();
                }
            }
        } */    	
    }
    
 
}
