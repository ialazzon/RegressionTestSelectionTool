/**
 */
package MultiClassQN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QNM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.QNM#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link MultiClassQN.QNM#getNodes <em>Nodes</em>}</li>
 *   <li>{@link MultiClassQN.QNM#getArcs <em>Arcs</em>}</li>
 *   <li>{@link MultiClassQN.QNM#getServiceRequests <em>Service Requests</em>}</li>
 *   <li>{@link MultiClassQN.QNM#getWorkloadRoutings <em>Workload Routings</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getQNM()
 * @model
 * @generated
 */
public interface QNM extends EObject {
	/**
	 * Returns the value of the '<em><b>Workloads</b></em>' containment reference list.
	 * The list contents are of type {@link MultiClassQN.Workload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workloads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workloads</em>' containment reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getQNM_Workloads()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Workload> getWorkloads();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link MultiClassQN.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getQNM_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link MultiClassQN.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getQNM_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Service Requests</b></em>' containment reference list.
	 * The list contents are of type {@link MultiClassQN.ServiceRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Requests</em>' containment reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getQNM_ServiceRequests()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceRequest> getServiceRequests();

	/**
	 * Returns the value of the '<em><b>Workload Routings</b></em>' containment reference list.
	 * The list contents are of type {@link MultiClassQN.WorkloadRouting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload Routings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload Routings</em>' containment reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getQNM_WorkloadRoutings()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkloadRouting> getWorkloadRoutings();

} // QNM
