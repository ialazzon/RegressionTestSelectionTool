/**
 */
package MultiClassQN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.Server#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link MultiClassQN.Server#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link MultiClassQN.Server#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Node {
	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MultiClassQN.SchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' attribute.
	 * @see MultiClassQN.SchedulingPolicy
	 * @see #setSchedulingPolicy(SchedulingPolicy)
	 * @see MultiClassQN.MultiClassQNPackage#getServer_SchedulingPolicy()
	 * @model required="true"
	 * @generated
	 */
	SchedulingPolicy getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link MultiClassQN.Server#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' attribute.
	 * @see MultiClassQN.SchedulingPolicy
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(SchedulingPolicy value);

	/**
	 * Returns the value of the '<em><b>Service Request</b></em>' reference list.
	 * The list contents are of type {@link MultiClassQN.ServiceRequest}.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.ServiceRequest#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Request</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Request</em>' reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getServer_ServiceRequest()
	 * @see MultiClassQN.ServiceRequest#getServer
	 * @model opposite="server"
	 * @generated
	 */
	EList<ServiceRequest> getServiceRequest();

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference list.
	 * The list contents are of type {@link MultiClassQN.Workload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference list.
	 * @see MultiClassQN.MultiClassQNPackage#getServer_Workload()
	 * @model
	 * @generated
	 */
	EList<Workload> getWorkload();

} // Server
