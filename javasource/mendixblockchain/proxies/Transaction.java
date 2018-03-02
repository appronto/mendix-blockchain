// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendixblockchain.proxies;

public class Transaction
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject transactionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MendixBlockchain.Transaction";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TxId("TxId"),
		Signature("Signature"),
		Data("Data"),
		PublicKey("PublicKey"),
		IsValid("IsValid"),
		Transaction_Block("MendixBlockchain.Transaction_Block");

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

	public Transaction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MendixBlockchain.Transaction"));
	}

	protected Transaction(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject transactionMendixObject)
	{
		if (transactionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MendixBlockchain.Transaction", transactionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MendixBlockchain.Transaction");

		this.transactionMendixObject = transactionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Transaction.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendixblockchain.proxies.Transaction initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendixblockchain.proxies.Transaction.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendixblockchain.proxies.Transaction initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("MyGenuineCertificatesBlockchain.Certificate", mendixObject.getType()))
			return mygenuinecertificatesblockchain.proxies.Certificate.initialize(context, mendixObject);

		return new mendixblockchain.proxies.Transaction(context, mendixObject);
	}

	public static mendixblockchain.proxies.Transaction load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendixblockchain.proxies.Transaction.initialize(context, mendixObject);
	}

	public static java.util.List<? extends mendixblockchain.proxies.Transaction> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mendixblockchain.proxies.Transaction> result = new java.util.ArrayList<mendixblockchain.proxies.Transaction>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MendixBlockchain.Transaction" + xpathConstraint))
			result.add(mendixblockchain.proxies.Transaction.initialize(context, obj));
		return result;
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
	 * @return value of TxId
	 */
	public final java.lang.String getTxId()
	{
		return getTxId(getContext());
	}

	/**
	 * @param context
	 * @return value of TxId
	 */
	public final java.lang.String getTxId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TxId.toString());
	}

	/**
	 * Set value of TxId
	 * @param txid
	 */
	public final void setTxId(java.lang.String txid)
	{
		setTxId(getContext(), txid);
	}

	/**
	 * Set value of TxId
	 * @param context
	 * @param txid
	 */
	public final void setTxId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String txid)
	{
		getMendixObject().setValue(context, MemberNames.TxId.toString(), txid);
	}

	/**
	 * @return value of Signature
	 */
	public final java.lang.String getSignature()
	{
		return getSignature(getContext());
	}

	/**
	 * @param context
	 * @return value of Signature
	 */
	public final java.lang.String getSignature(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Signature.toString());
	}

	/**
	 * Set value of Signature
	 * @param signature
	 */
	public final void setSignature(java.lang.String signature)
	{
		setSignature(getContext(), signature);
	}

	/**
	 * Set value of Signature
	 * @param context
	 * @param signature
	 */
	public final void setSignature(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String signature)
	{
		getMendixObject().setValue(context, MemberNames.Signature.toString(), signature);
	}

	/**
	 * @return value of Data
	 */
	public final java.lang.String getData()
	{
		return getData(getContext());
	}

	/**
	 * @param context
	 * @return value of Data
	 */
	public final java.lang.String getData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Data.toString());
	}

	/**
	 * Set value of Data
	 * @param data
	 */
	public final void setData(java.lang.String data)
	{
		setData(getContext(), data);
	}

	/**
	 * Set value of Data
	 * @param context
	 * @param data
	 */
	public final void setData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String data)
	{
		getMendixObject().setValue(context, MemberNames.Data.toString(), data);
	}

	/**
	 * @return value of PublicKey
	 */
	public final java.lang.String getPublicKey()
	{
		return getPublicKey(getContext());
	}

	/**
	 * @param context
	 * @return value of PublicKey
	 */
	public final java.lang.String getPublicKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PublicKey.toString());
	}

	/**
	 * Set value of PublicKey
	 * @param publickey
	 */
	public final void setPublicKey(java.lang.String publickey)
	{
		setPublicKey(getContext(), publickey);
	}

	/**
	 * Set value of PublicKey
	 * @param context
	 * @param publickey
	 */
	public final void setPublicKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String publickey)
	{
		getMendixObject().setValue(context, MemberNames.PublicKey.toString(), publickey);
	}

	/**
	 * @return value of IsValid
	 */
	public final java.lang.Boolean getIsValid()
	{
		return getIsValid(getContext());
	}

	/**
	 * @param context
	 * @return value of IsValid
	 */
	public final java.lang.Boolean getIsValid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsValid.toString());
	}

	/**
	 * Set value of IsValid
	 * @param isvalid
	 */
	public final void setIsValid(java.lang.Boolean isvalid)
	{
		setIsValid(getContext(), isvalid);
	}

	/**
	 * Set value of IsValid
	 * @param context
	 * @param isvalid
	 */
	public final void setIsValid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isvalid)
	{
		getMendixObject().setValue(context, MemberNames.IsValid.toString(), isvalid);
	}

	/**
	 * @return value of Transaction_Block
	 */
	public final mendixblockchain.proxies.Block getTransaction_Block() throws com.mendix.core.CoreException
	{
		return getTransaction_Block(getContext());
	}

	/**
	 * @param context
	 * @return value of Transaction_Block
	 */
	public final mendixblockchain.proxies.Block getTransaction_Block(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendixblockchain.proxies.Block result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Transaction_Block.toString());
		if (identifier != null)
			result = mendixblockchain.proxies.Block.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Transaction_Block
	 * @param transaction_block
	 */
	public final void setTransaction_Block(mendixblockchain.proxies.Block transaction_block)
	{
		setTransaction_Block(getContext(), transaction_block);
	}

	/**
	 * Set value of Transaction_Block
	 * @param context
	 * @param transaction_block
	 */
	public final void setTransaction_Block(com.mendix.systemwideinterfaces.core.IContext context, mendixblockchain.proxies.Block transaction_block)
	{
		if (transaction_block == null)
			getMendixObject().setValue(context, MemberNames.Transaction_Block.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Transaction_Block.toString(), transaction_block.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return transactionMendixObject;
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
			final mendixblockchain.proxies.Transaction that = (mendixblockchain.proxies.Transaction) obj;
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
		return "MendixBlockchain.Transaction";
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
