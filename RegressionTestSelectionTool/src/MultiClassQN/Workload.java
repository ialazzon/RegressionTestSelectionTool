/**
 */
package MultiClassQN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.Workload#getNumOfJobs <em>Num Of Jobs</em>}</li>
 *   <li>{@link MultiClassQN.Workload#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link MultiClassQN.Workload#getWorkloadRouting <em>Workload Routing</em>}</li>
 *   <li>{@link MultiClassQN.Workload#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Of Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Jobs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Jobs</em>' attribute.
	 * @see #setNumOfJobs(int)
	 * @see MultiClassQN.MultiClassQNPackage#getWorkload_NumOfJobs()
	 * @model required="true"
	 * @generated
	 */
	int getNumOfJobs();

	/**
	 * Sets the value of the '{@link MultiClassQN.Workload#getNumOfJobs <em>Num Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Jobs</em>' attribute.
	 * @see #getNumOfJobs()
	 * @generated
	 */
	void setNumOfJobs(int value);

	/**
	 * Returns the value of the '<em><b>Service Request</b></em>' reference list.
	 * The list contents are of type {@link MultiClassQN.ServiceRequest}.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.ServiceRequest#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Request</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Request</em>' reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getWorkload_ServiceRequest()
	 * @see MultiClassQN.ServiceRequest#getWorkload
	 * @model opposite="workload"
	 * @generated
	 */
	EList<ServiceRequest> getServiceRequest();

	/**
	 * Returns the value of the '<em><b>Workload Routing</b></em>' reference list.
	 * The list contents are of type {@link MultiClassQN.WorkloadRouting}.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.WorkloadRouting#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload Routing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload Routing</em>' reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getWorkload_WorkloadRouting()
	 * @see MultiClassQN.WorkloadRouting#getWorkload
	 * @model opposite="workload"
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
	 * @see MultiClassQN.MultiClassQNPackage#getWorkload_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MultiClassQN.Workload#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Workload
