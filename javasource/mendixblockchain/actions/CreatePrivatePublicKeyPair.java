// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendixblockchain.actions;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import mendixblockchain.proxies.UserKeyPair;
import sun.misc.BASE64Encoder;

public class CreatePrivatePublicKeyPair extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __KeyPairObject;
	private mendixblockchain.proxies.UserKeyPair KeyPairObject;

	public CreatePrivatePublicKeyPair(IContext context, IMendixObject KeyPairObject)
	{
		super(context);
		this.__KeyPairObject = KeyPairObject;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.KeyPairObject = __KeyPairObject == null ? null : mendixblockchain.proxies.UserKeyPair.initialize(getContext(), __KeyPairObject);

		// BEGIN USER CODE
		
		 KeyPair keyPair = getKeyPair();
		 
		 String publicString = new BASE64Encoder().encode(keyPair.getPublic().getEncoded());
		 String privateString = new BASE64Encoder().encode(keyPair.getPrivate().getEncoded());
		 
		 KeyPairObject.setPrivateKey(privateString);
		 KeyPairObject.setPublicKey(publicString);
	       
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CreatePrivatePublicKeyPair";
	}

	// BEGIN EXTRA CODE
	private static KeyPair getKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        return kpg.genKeyPair();
    }
	// END EXTRA CODE
}
