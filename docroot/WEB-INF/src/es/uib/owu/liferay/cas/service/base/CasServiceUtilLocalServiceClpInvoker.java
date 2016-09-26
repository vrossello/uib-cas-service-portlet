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

package es.uib.owu.liferay.cas.service.base;

import es.uib.owu.liferay.cas.service.CasServiceUtilLocalServiceUtil;

import java.util.Arrays;

/**
 * @author vrf495
 * @generated
 */
public class CasServiceUtilLocalServiceClpInvoker {
	public CasServiceUtilLocalServiceClpInvoker() {
		_methodName0 = "addCasServiceUtil";

		_methodParameterTypes0 = new String[] {
				"es.uib.owu.liferay.cas.model.CasServiceUtil"
			};

		_methodName1 = "createCasServiceUtil";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCasServiceUtil";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCasServiceUtil";

		_methodParameterTypes3 = new String[] {
				"es.uib.owu.liferay.cas.model.CasServiceUtil"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchCasServiceUtil";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getCasServiceUtil";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getCasServiceUtils";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getCasServiceUtilsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateCasServiceUtil";

		_methodParameterTypes15 = new String[] {
				"es.uib.owu.liferay.cas.model.CasServiceUtil"
			};

		_methodName34 = "getBeanIdentifier";

		_methodParameterTypes34 = new String[] {  };

		_methodName35 = "setBeanIdentifier";

		_methodParameterTypes35 = new String[] { "java.lang.String" };

		_methodName40 = "initPGTS";

		_methodParameterTypes40 = new String[] {  };

		_methodName42 = "retrievePGT";

		_methodParameterTypes42 = new String[] { "java.lang.String" };

		_methodName43 = "cancelTimer";

		_methodParameterTypes43 = new String[] {  };

		_methodName44 = "readAndRespondToProxyReceptorRequest";

		_methodParameterTypes44 = new String[] {
				"javax.servlet.http.HttpServletRequest",
				"javax.servlet.http.HttpServletResponse"
			};

		_methodName48 = "assertValidator";

		_methodParameterTypes48 = new String[] {
				"java.lang.Long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "boolean",
				"java.lang.String", "javax.servlet.http.HttpSession"
			};

		_methodName49 = "constructServiceUrl";

		_methodParameterTypes49 = new String[] {
				"java.lang.Long", "javax.servlet.http.HttpServletRequest",
				"javax.servlet.http.HttpServletResponse"
			};

		_methodName50 = "getProxyTicket";

		_methodParameterTypes50 = new String[] {
				"javax.portlet.RenderRequest", "java.lang.String"
			};

		_methodName51 = "addProxyTickets";

		_methodParameterTypes51 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName52 = "getProxyTickets";

		_methodParameterTypes52 = new String[] { "java.lang.String" };

		_methodName53 = "findAllCSU";

		_methodParameterTypes53 = new String[] {  };

		_methodName54 = "removeCSU";

		_methodParameterTypes54 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.addCasServiceUtil((es.uib.owu.liferay.cas.model.CasServiceUtil)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.createCasServiceUtil(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.deleteCasServiceUtil(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.deleteCasServiceUtil((es.uib.owu.liferay.cas.model.CasServiceUtil)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.fetchCasServiceUtil(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.getCasServiceUtil(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.getCasServiceUtils(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.getCasServiceUtilsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.updateCasServiceUtil((es.uib.owu.liferay.cas.model.CasServiceUtil)arguments[0]);
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			CasServiceUtilLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			CasServiceUtilLocalServiceUtil.initPGTS();

			return null;
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.retrievePGT((java.lang.String)arguments[0]);
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			CasServiceUtilLocalServiceUtil.cancelTimer();

			return null;
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			CasServiceUtilLocalServiceUtil.readAndRespondToProxyReceptorRequest((javax.servlet.http.HttpServletRequest)arguments[0],
				(javax.servlet.http.HttpServletResponse)arguments[1]);

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.assertValidator((java.lang.Long)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Boolean)arguments[5]).booleanValue(),
				(java.lang.String)arguments[6],
				(javax.servlet.http.HttpSession)arguments[7]);
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.constructServiceUrl((java.lang.Long)arguments[0],
				(javax.servlet.http.HttpServletRequest)arguments[1],
				(javax.servlet.http.HttpServletResponse)arguments[2]);
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.getProxyTicket((javax.portlet.RenderRequest)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.addProxyTickets((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.getProxyTickets((java.lang.String)arguments[0]);
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.findAllCSU();
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return CasServiceUtilLocalServiceUtil.removeCSU(((Long)arguments[0]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
}