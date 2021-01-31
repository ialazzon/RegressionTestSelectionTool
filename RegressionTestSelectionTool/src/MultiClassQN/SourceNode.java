/**
 */
package MultiClassQN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.SourceNode#getArrivalDistribution <em>Arrival Distribution</em>}</li>
 *   <li>{@link MultiClassQN.SourceNode#getArrivalParams <em>Arrival Params</em>}</li>
 *   <li>{@link MultiClassQN.SourceNode#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getSourceNode()
 * @model
 * @generated
 */
public interface SourceNode extends Node {
	/**
	 * Returns the value of the '<em><b>Arrival Distribution</b></em>' attribute.
	 * The literals are from the enumeration {@link MultiClassQN.ProbabilityDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Distribution</em>' attribute.
	 * @see MultiClassQN.ProbabilityDistribution
	 * @see #setArrivalDistribution(ProbabilityDistribution)
	 * @see MultiClassQN.MultiClassQNPackage#getSourceNode_ArrivalDistribution()
	 * @model required="true"
	 * @generated
	 */
	ProbabilityDistribution getArrivalDistribution();

	/**
	 * Sets the value of the '{@link MultiClassQN.SourceNode#getArrivalDistribution <em>Arrival Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Distribution</em>' attribute.
	 * @see MultiClassQN.ProbabilityDistribution
	 * @see #getArrivalDistribution()
	 * @generated
	 */
	void setArrivalDistribution(ProbabilityDistribution value);

	/**
	 * Returns the value of the '<em><b>Arrival Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Params</em>' attribute list.
	 * @see MultiClassQN.MultiClassQNPackage#getSourceNode_ArrivalParams()
	 * @model required="true"
	 * @generated
	 */
	EList<Double> getArrivalParams();

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
	 * @see MultiClassQN.MultiClassQNPackage#getSourceNode_Workload()
	 * @model required="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link MultiClassQN.SourceNode#getWorkload <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

} // SourceNode
