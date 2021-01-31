/**
 */
package MultiClassQN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.WorkloadRouting#getProbability <em>Probability</em>}</li>
 *   <li>{@link MultiClassQN.WorkloadRouting#getArc <em>Arc</em>}</li>
 *   <li>{@link MultiClassQN.WorkloadRouting#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getWorkloadRouting()
 * @model
 * @generated
 */
public interface WorkloadRouting extends EObject {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see MultiClassQN.MultiClassQNPackage#getWorkloadRouting_Probability()
	 * @model required="true"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link MultiClassQN.WorkloadRouting#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.Arc#getWorkloadRouting <em>Workload Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' reference.
	 * @see #setArc(Arc)
	 * @see MultiClassQN.MultiClassQNPackage#getWorkloadRouting_Arc()
	 * @see MultiClassQN.Arc#getWorkloadRouting
	 * @model opposite="WorkloadRouting" required="true"
	 * @generated
	 */
	Arc getArc();

	/**
	 * Sets the value of the '{@link MultiClassQN.WorkloadRouting#getArc <em>Arc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc</em>' reference.
	 * @see #getArc()
	 * @generated
	 */
	void setArc(Arc value);

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.Workload#getWorkloadRouting <em>Workload Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference.
	 * @see #setWorkload(Workload)
	 * @see MultiClassQN.MultiClassQNPackage#getWorkloadRouting_Workload()
	 * @see MultiClassQN.Workload#getWorkloadRouting
	 * @model opposite="workloadRouting" required="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link MultiClassQN.WorkloadRouting#getWorkload <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

} // WorkloadRouting
