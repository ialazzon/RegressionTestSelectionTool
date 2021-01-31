/**
 */
package MultiClassQN;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MultiClassQN.MultiClassQNPackage
 * @generated
 */
public interface MultiClassQNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultiClassQNFactory eINSTANCE = MultiClassQN.impl.MultiClassQNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QNM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QNM</em>'.
	 * @generated
	 */
	QNM createQNM();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload</em>'.
	 * @generated
	 */
	Workload createWorkload();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Non Server Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Server Node</em>'.
	 * @generated
	 */
	NonServerNode createNonServerNode();

	/**
	 * Returns a new object of class '<em>Think Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Think Device</em>'.
	 * @generated
	 */
	ThinkDevice createThinkDevice();

	/**
	 * Returns a new object of class '<em>Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Node</em>'.
	 * @generated
	 */
	SourceNode createSourceNode();

	/**
	 * Returns a new object of class '<em>Sink Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Node</em>'.
	 * @generated
	 */
	SinkNode createSinkNode();

	/**
	 * Returns a new object of class '<em>Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Request</em>'.
	 * @generated
	 */
	ServiceRequest createServiceRequest();

	/**
	 * Returns a new object of class '<em>Workload Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload Routing</em>'.
	 * @generated
	 */
	WorkloadRouting createWorkloadRouting();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MultiClassQNPackage getMultiClassQNPackage();

} //MultiClassQNFactory
