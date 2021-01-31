/**
 */
package MultiClassQN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link MultiClassQN.Arc#getTarget <em>Target</em>}</li>
 *   <li>{@link MultiClassQN.Arc#getWorkloadRouting <em>Workload Routing</em>}</li>
 *   <li>{@link MultiClassQN.Arc#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see MultiClassQN.MultiClassQNPackage#getArc_Source()
	 * @see MultiClassQN.Node#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link MultiClassQN.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see MultiClassQN.MultiClassQNPackage#getArc_Target()
	 * @see MultiClassQN.Node#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link MultiClassQN.Arc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Workload Routing</b></em>' reference list.
	 * The list contents are of type {@link MultiClassQN.WorkloadRouting}.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.WorkloadRouting#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload Routing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload Routing</em>' reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getArc_WorkloadRouting()
	 * @see MultiClassQN.WorkloadRouting#getArc
	 * @model opposite="arc"
	 * @generated
	 */
	EList<WorkloadRouting> getWorkloadRouting();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MultiClassQN.MultiClassQNPackage#getArc_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MultiClassQN.Arc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Arc
