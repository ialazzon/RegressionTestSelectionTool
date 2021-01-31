/**
 */
package MultiClassQN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.SinkNode#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getSinkNode()
 * @model
 * @generated
 */
public interface SinkNode extends Node {
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
	 * @see MultiClassQN.MultiClassQNPackage#getSinkNode_Workload()
	 * @model required="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link MultiClassQN.SinkNode#getWorkload <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

} // SinkNode
