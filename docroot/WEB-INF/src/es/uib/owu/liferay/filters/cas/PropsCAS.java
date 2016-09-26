package es.uib.owu.liferay.filters.cas;


public class PropsCAS {
	public static final Integer DEFAULT_MILLIS_BETWEEN_CLEANUPS = 60 * 1000;
	
	public static final String PROP_PREFIX = "uib.cas.";
	
	public static final String PROXY_CALLBACK_URL = PROP_PREFIX+"proxyCallbackUrl";
	public static final String ACCEPT_ANY_PROXY = PROP_PREFIX+"acceptAnyProxy";
	
		
	public static final String ALLOWED_PROXY_CHAINS = PROP_PREFIX+"allowedProxyChains";	
	public static final String RENEW = PROP_PREFIX+"renew";
	
	public static final String CAS_LOGIN = "CAS_LOGIN";

	public static final String[] RESERVED_INIT_PARAMS = new String[] {
			"proxyReceptorUrl", "acceptAnyProxy", "allowedProxyChains",
			"casServerUrlPrefix", "proxyCallbackUrl", "renew",
			"exceptionOnValidationFailure", "redirectAfterValidation",
			"useSession", "serverName", "service", "artifactParameterName",
			"serviceParameterName", "encodeServiceUrl" };

}
