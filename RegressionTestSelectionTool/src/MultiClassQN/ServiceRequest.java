/**
 */
package MultiClassQN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.ServiceRequest#getServiceDistribution <em>Service Distribution</em>}</li>
 *   <li>{@link MultiClassQN.ServiceRequest#getServiceParams <em>Service Params</em>}</li>
 *   <li>{@link MultiClassQN.ServiceRequest#getServer <em>Server</em>}</li>
 *   <li>{@link MultiClassQN.ServiceRequest#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getServiceRequest()
 * @model
 * @generated
 */
public interface ServiceRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Distribution</b></em>' attribute.
	 * The literals are from the enumeration {@link MultiClassQN.ProbabilityDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Distribution</em>' attribute.
	 * @see MultiClassQN.ProbabilityDistribution
	 * @see #setServiceDistribution(ProbabilityDistribution)
	 * @see MultiClassQN.MultiClassQNPackage#getServiceRequest_ServiceDistribution()
	 * @model required="true"
	 * @generated
	 */
	ProbabilityDistribution getServiceDistribution();

	/**
	 * Sets the value of the '{@link MultiClassQN.ServiceRequest#getServiceDistribution <em>Service Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Distribution</em>' attribute.
	 * @see MultiClassQN.ProbabilityDistribution
	 * @see #getServiceDistribution()
	 * @generated
	 */
	void setServiceDistribution(ProbabilityDistribution value);

	/**
	 * Returns the value of the '<em><b>Service Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Params</em>' attribute list.
	 * @see MultiClassQN.MultiClassQNPackage#getServiceRequest_ServiceParams()
	 * @model required="true"
	 * @generated
	 */
	EList<Double> getServiceParams();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.Server#getServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see MultiClassQN.MultiClassQNPackage#getServiceRequest_Server()
	 * @see MultiClassQN.Server#getServiceRequest
	 * @model opposite="serviceRequest" required="true"
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link MultiClassQN.ServiceRequest#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MultiClassQN.Workload#getServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference.
	 * @see #setWorkload(Workload)
	 * @see MultiClassQN.MultiClassQNPackage#getServiceRequest_Workload()
	 * @see MultiClassQN.Workload#getServiceRequest
	 * @model opposite="serviceRequest" required="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link MultiClassQN.ServiceRequest#getWorkload <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

} // ServiceRequest
