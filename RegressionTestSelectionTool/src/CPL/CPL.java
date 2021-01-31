/**
 */
package CPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.CPL#getSubActions <em>Sub Actions</em>}</li>
 *   <li>{@link CPL.CPL#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link CPL.CPL#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getCPL()
 * @model
 * @generated
 */
public interface CPL extends Element {
	/**
	 * Returns the value of the '<em><b>Sub Actions</b></em>' containment reference list.
	 * The list contents are of type {@link CPL.SubAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Actions</em>' containment reference list.
	 * @see CPL.CPLPackage#getCPL_SubActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubAction> getSubActions();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference.
	 * @see #setOutgoing(Outgoing)
	 * @see CPL.CPLPackage#getCPL_Outgoing()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Outgoing getOutgoing();

	/**
	 * Sets the value of the '{@link CPL.CPL#getOutgoing <em>Outgoing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' containment reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(Outgoing value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' containment reference.
	 * @see #setIncoming(Incoming)
	 * @see CPL.CPLPackage#getCPL_Incoming()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Incoming getIncoming();

	/**
	 * Sets the value of the '{@link CPL.CPL#getIncoming <em>Incoming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' containment reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Incoming value);

} // CPL
