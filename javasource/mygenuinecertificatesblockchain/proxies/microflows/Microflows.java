// This file was generated by Mendix Modeler 7.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mygenuinecertificatesblockchain.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the MyGenuineCertificatesBlockchain module
	public static void aT_CreateCertificate(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MyGenuineCertificatesBlockchain.AT_CreateCertificate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean aT_RedirectHome(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "MyGenuineCertificatesBlockchain.AT_RedirectHome", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aT_SaveCertificate(IContext context, mygenuinecertificatesblockchain.proxies.Certificate _certificate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Certificate", _certificate == null ? null : _certificate.getMendixObject());
			Core.execute(context, "MyGenuineCertificatesBlockchain.AT_SaveCertificate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}