/**
 */
package MultiClassQN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Server Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.NonServerNode#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getNonServerNode()
 * @model
 * @generated
 */
public interface NonServerNode extends Node {
	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference.
	 * @see #setWorkload(Workload)
	 * @see MultiClassQN.MultiClassQNPackage#getNonServerNode_Workload()
	 * @model required="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link MultiClassQN.NonServerNode#getWorkload <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

} // NonServerNode
