// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendixblockchain.actions;

import java.security.MessageDigest;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class CreateSHA256Hash extends CustomJavaAction<java.lang.String>
{
	private java.lang.String ValueToHash;

	public CreateSHA256Hash(IContext context, java.lang.String ValueToHash)
	{
		super(context);
		this.ValueToHash = ValueToHash;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
			MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
			//Applies sha256 to our input, 
			byte[] hash = digest.digest(ValueToHash.getBytes("UTF-8"));	        
			StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
			
			
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CreateSHA256Hash";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
