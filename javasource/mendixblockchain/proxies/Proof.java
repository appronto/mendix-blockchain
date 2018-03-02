// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendixblockchain.proxies;

public class Proof
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject proofMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MendixBlockchain.Proof";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PrivateKey("PrivateKey"),
		Proof_Transaction("MendixBlockchain.Proof_Transaction");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Proof(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MendixBlockchain.Proof"));
	}

	protected Proof(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject proofMendixObject)
	{
		if (proofMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MendixBlockchain.Proof", proofMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MendixBlockchain.Proof");

		this.proofMendixObject = proofMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Proof.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendixblockchain.proxies.Proof initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendixblockchain.proxies.Proof.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendixblockchain.proxies.Proof initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendixblockchain.proxies.Proof(context, mendixObject);
	}

	public static mendixblockchain.proxies.Proof load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendixblockchain.proxies.Proof.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of PrivateKey
	 */
	public final java.lang.String getPrivateKey()
	{
		return getPrivateKey(getContext());
	}

	/**
	 * @param context
	 * @return value of PrivateKey
	 */
	public final java.lang.String getPrivateKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PrivateKey.toString());
	}

	/**
	 * Set value of PrivateKey
	 * @param privatekey
	 */
	public final void setPrivateKey(java.lang.String privatekey)
	{
		setPrivateKey(getContext(), privatekey);
	}

	/**
	 * Set value of PrivateKey
	 * @param context
	 * @param privatekey
	 */
	public final void setPrivateKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String privatekey)
	{
		getMendixObject().setValue(context, MemberNames.PrivateKey.toString(), privatekey);
	}

	/**
	 * @return value of Proof_Transaction
	 */
	public final mendixblockchain.proxies.Transaction getProof_Transaction() throws com.mendix.core.CoreException
	{
		return getProof_Transaction(getContext());
	}

	/**
	 * @param context
	 * @return value of Proof_Transaction
	 */
	public final mendixblockchain.proxies.Transaction getProof_Transaction(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendixblockchain.proxies.Transaction result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Proof_Transaction.toString());
		if (identifier != null)
			result = mendixblockchain.proxies.Transaction.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Proof_Transaction
	 * @param proof_transaction
	 */
	public final void setProof_Transaction(mendixblockchain.proxies.Transaction proof_transaction)
	{
		setProof_Transaction(getContext(), proof_transaction);
	}

	/**
	 * Set value of Proof_Transaction
	 * @param context
	 * @param proof_transaction
	 */
	public final void setProof_Transaction(com.mendix.systemwideinterfaces.core.IContext context, mendixblockchain.proxies.Transaction proof_transaction)
	{
		if (proof_transaction == null)
			getMendixObject().setValue(context, MemberNames.Proof_Transaction.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Proof_Transaction.toString(), proof_transaction.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return proofMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mendixblockchain.proxies.Proof that = (mendixblockchain.proxies.Proof) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MendixBlockchain.Proof";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
