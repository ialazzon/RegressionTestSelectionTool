/**
 */
package MultiClassQN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MultiClassQN.MultiClassQNFactory
 * @model kind="package"
 * @generated
 */
public interface MultiClassQNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MultiClassQN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MultiClassQN";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MultiClassQN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultiClassQNPackage eINSTANCE = MultiClassQN.impl.MultiClassQNPackageImpl.init();

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.QNMImpl <em>QNM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.QNMImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getQNM()
	 * @generated
	 */
	int QNM = 0;

	/**
	 * The feature id for the '<em><b>Workloads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNM__WORKLOADS = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNM__NODES = 1;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNM__ARCS = 2;

	/**
	 * The feature id for the '<em><b>Service Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNM__SERVICE_REQUESTS = 3;

	/**
	 * The feature id for the '<em><b>Workload Routings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNM__WORKLOAD_ROUTINGS = 4;

	/**
	 * The number of structural features of the '<em>QNM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>QNM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.ArcImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Workload Routing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__WORKLOAD_ROUTING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = 3;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.WorkloadImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 2;

	/**
	 * The feature id for the '<em><b>Num Of Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NUM_OF_JOBS = 0;

	/**
	 * The feature id for the '<em><b>Service Request</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__SERVICE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Workload Routing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__WORKLOAD_ROUTING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NAME = 3;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.NodeImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.ServerImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SCHEDULING_POLICY = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Request</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVICE_REQUEST = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__WORKLOAD = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.NonServerNodeImpl <em>Non Server Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.NonServerNodeImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getNonServerNode()
	 * @generated
	 */
	int NON_SERVER_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_SERVER_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_SERVER_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_SERVER_NODE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_SERVER_NODE__WORKLOAD = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Server Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_SERVER_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Server Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_SERVER_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.ThinkDeviceImpl <em>Think Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.ThinkDeviceImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getThinkDevice()
	 * @generated
	 */
	int THINK_DEVICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_DEVICE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_DEVICE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_DEVICE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_DEVICE__THINK_TIME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_DEVICE__WORKLOAD = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Think Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_DEVICE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Think Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_DEVICE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.SourceNodeImpl <em>Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.SourceNodeImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getSourceNode()
	 * @generated
	 */
	int SOURCE_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Arrival Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__ARRIVAL_DISTRIBUTION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrival Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__ARRIVAL_PARAMS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__WORKLOAD = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.SinkNodeImpl <em>Sink Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.SinkNodeImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getSinkNode()
	 * @generated
	 */
	int SINK_NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__WORKLOAD = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.ServiceRequestImpl <em>Service Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.ServiceRequestImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getServiceRequest()
	 * @generated
	 */
	int SERVICE_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Service Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__SERVICE_DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Service Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__SERVICE_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__SERVER = 2;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__WORKLOAD = 3;

	/**
	 * The number of structural features of the '<em>Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.impl.WorkloadRoutingImpl <em>Workload Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.impl.WorkloadRoutingImpl
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getWorkloadRouting()
	 * @generated
	 */
	int WORKLOAD_ROUTING = 10;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ROUTING__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ROUTING__ARC = 1;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ROUTING__WORKLOAD = 2;

	/**
	 * The number of structural features of the '<em>Workload Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ROUTING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workload Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ROUTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MultiClassQN.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.SchedulingPolicy
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getSchedulingPolicy()
	 * @generated
	 */
	int SCHEDULING_POLICY = 11;

	/**
	 * The meta object id for the '{@link MultiClassQN.ProbabilityDistribution <em>Probability Distribution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MultiClassQN.ProbabilityDistribution
	 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getProbabilityDistribution()
	 * @generated
	 */
	int PROBABILITY_DISTRIBUTION = 12;


	/**
	 * Returns the meta object for class '{@link MultiClassQN.QNM <em>QNM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QNM</em>'.
	 * @see MultiClassQN.QNM
	 * @generated
	 */
	EClass getQNM();

	/**
	 * Returns the meta object for the containment reference list '{@link MultiClassQN.QNM#getWorkloads <em>Workloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workloads</em>'.
	 * @see MultiClassQN.QNM#getWorkloads()
	 * @see #getQNM()
	 * @generated
	 */
	EReference getQNM_Workloads();

	/**
	 * Returns the meta object for the containment reference list '{@link MultiClassQN.QNM#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see MultiClassQN.QNM#getNodes()
	 * @see #getQNM()
	 * @generated
	 */
	EReference getQNM_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link MultiClassQN.QNM#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see MultiClassQN.QNM#getArcs()
	 * @see #getQNM()
	 * @generated
	 */
	EReference getQNM_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link MultiClassQN.QNM#getServiceRequests <em>Service Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Requests</em>'.
	 * @see MultiClassQN.QNM#getServiceRequests()
	 * @see #getQNM()
	 * @generated
	 */
	EReference getQNM_ServiceRequests();

	/**
	 * Returns the meta object for the containment reference list '{@link MultiClassQN.QNM#getWorkloadRoutings <em>Workload Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workload Routings</em>'.
	 * @see MultiClassQN.QNM#getWorkloadRoutings()
	 * @see #getQNM()
	 * @generated
	 */
	EReference getQNM_WorkloadRoutings();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see MultiClassQN.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see MultiClassQN.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see MultiClassQN.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for the reference list '{@link MultiClassQN.Arc#getWorkloadRouting <em>Workload Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workload Routing</em>'.
	 * @see MultiClassQN.Arc#getWorkloadRouting()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_WorkloadRouting();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.Arc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MultiClassQN.Arc#getName()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Name();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see MultiClassQN.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.Workload#getNumOfJobs <em>Num Of Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Jobs</em>'.
	 * @see MultiClassQN.Workload#getNumOfJobs()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_NumOfJobs();

	/**
	 * Returns the meta object for the reference list '{@link MultiClassQN.Workload#getServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Request</em>'.
	 * @see MultiClassQN.Workload#getServiceRequest()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_ServiceRequest();

	/**
	 * Returns the meta object for the reference list '{@link MultiClassQN.Workload#getWorkloadRouting <em>Workload Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workload Routing</em>'.
	 * @see MultiClassQN.Workload#getWorkloadRouting()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_WorkloadRouting();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.Workload#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MultiClassQN.Workload#getName()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Name();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see MultiClassQN.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MultiClassQN.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link MultiClassQN.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see MultiClassQN.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link MultiClassQN.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see MultiClassQN.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see MultiClassQN.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.Server#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Policy</em>'.
	 * @see MultiClassQN.Server#getSchedulingPolicy()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_SchedulingPolicy();

	/**
	 * Returns the meta object for the reference list '{@link MultiClassQN.Server#getServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Request</em>'.
	 * @see MultiClassQN.Server#getServiceRequest()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_ServiceRequest();

	/**
	 * Returns the meta object for the reference list '{@link MultiClassQN.Server#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workload</em>'.
	 * @see MultiClassQN.Server#getWorkload()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Workload();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.NonServerNode <em>Non Server Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Server Node</em>'.
	 * @see MultiClassQN.NonServerNode
	 * @generated
	 */
	EClass getNonServerNode();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.NonServerNode#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workload</em>'.
	 * @see MultiClassQN.NonServerNode#getWorkload()
	 * @see #getNonServerNode()
	 * @generated
	 */
	EReference getNonServerNode_Workload();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.ThinkDevice <em>Think Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Think Device</em>'.
	 * @see MultiClassQN.ThinkDevice
	 * @generated
	 */
	EClass getThinkDevice();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.ThinkDevice#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Think Time</em>'.
	 * @see MultiClassQN.ThinkDevice#getThinkTime()
	 * @see #getThinkDevice()
	 * @generated
	 */
	EAttribute getThinkDevice_ThinkTime();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.ThinkDevice#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workload</em>'.
	 * @see MultiClassQN.ThinkDevice#getWorkload()
	 * @see #getThinkDevice()
	 * @generated
	 */
	EReference getThinkDevice_Workload();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.SourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Node</em>'.
	 * @see MultiClassQN.SourceNode
	 * @generated
	 */
	EClass getSourceNode();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.SourceNode#getArrivalDistribution <em>Arrival Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Distribution</em>'.
	 * @see MultiClassQN.SourceNode#getArrivalDistribution()
	 * @see #getSourceNode()
	 * @generated
	 */
	EAttribute getSourceNode_ArrivalDistribution();

	/**
	 * Returns the meta object for the attribute list '{@link MultiClassQN.SourceNode#getArrivalParams <em>Arrival Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arrival Params</em>'.
	 * @see MultiClassQN.SourceNode#getArrivalParams()
	 * @see #getSourceNode()
	 * @generated
	 */
	EAttribute getSourceNode_ArrivalParams();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.SourceNode#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workload</em>'.
	 * @see MultiClassQN.SourceNode#getWorkload()
	 * @see #getSourceNode()
	 * @generated
	 */
	EReference getSourceNode_Workload();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.SinkNode <em>Sink Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Node</em>'.
	 * @see MultiClassQN.SinkNode
	 * @generated
	 */
	EClass getSinkNode();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.SinkNode#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workload</em>'.
	 * @see MultiClassQN.SinkNode#getWorkload()
	 * @see #getSinkNode()
	 * @generated
	 */
	EReference getSinkNode_Workload();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.ServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Request</em>'.
	 * @see MultiClassQN.ServiceRequest
	 * @generated
	 */
	EClass getServiceRequest();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.ServiceRequest#getServiceDistribution <em>Service Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Distribution</em>'.
	 * @see MultiClassQN.ServiceRequest#getServiceDistribution()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EAttribute getServiceRequest_ServiceDistribution();

	/**
	 * Returns the meta object for the attribute list '{@link MultiClassQN.ServiceRequest#getServiceParams <em>Service Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Params</em>'.
	 * @see MultiClassQN.ServiceRequest#getServiceParams()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EAttribute getServiceRequest_ServiceParams();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.ServiceRequest#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see MultiClassQN.ServiceRequest#getServer()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EReference getServiceRequest_Server();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.ServiceRequest#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workload</em>'.
	 * @see MultiClassQN.ServiceRequest#getWorkload()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EReference getServiceRequest_Workload();

	/**
	 * Returns the meta object for class '{@link MultiClassQN.WorkloadRouting <em>Workload Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Routing</em>'.
	 * @see MultiClassQN.WorkloadRouting
	 * @generated
	 */
	EClass getWorkloadRouting();

	/**
	 * Returns the meta object for the attribute '{@link MultiClassQN.WorkloadRouting#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see MultiClassQN.WorkloadRouting#getProbability()
	 * @see #getWorkloadRouting()
	 * @generated
	 */
	EAttribute getWorkloadRouting_Probability();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.WorkloadRouting#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arc</em>'.
	 * @see MultiClassQN.WorkloadRouting#getArc()
	 * @see #getWorkloadRouting()
	 * @generated
	 */
	EReference getWorkloadRouting_Arc();

	/**
	 * Returns the meta object for the reference '{@link MultiClassQN.WorkloadRouting#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workload</em>'.
	 * @see MultiClassQN.WorkloadRouting#getWorkload()
	 * @see #getWorkloadRouting()
	 * @generated
	 */
	EReference getWorkloadRouting_Workload();

	/**
	 * Returns the meta object for enum '{@link MultiClassQN.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Policy</em>'.
	 * @see MultiClassQN.SchedulingPolicy
	 * @generated
	 */
	EEnum getSchedulingPolicy();

	/**
	 * Returns the meta object for enum '{@link MultiClassQN.ProbabilityDistribution <em>Probability Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Probability Distribution</em>'.
	 * @see MultiClassQN.ProbabilityDistribution
	 * @generated
	 */
	EEnum getProbabilityDistribution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultiClassQNFactory getMultiClassQNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.QNMImpl <em>QNM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.QNMImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getQNM()
		 * @generated
		 */
		EClass QNM = eINSTANCE.getQNM();

		/**
		 * The meta object literal for the '<em><b>Workloads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QNM__WORKLOADS = eINSTANCE.getQNM_Workloads();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QNM__NODES = eINSTANCE.getQNM_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QNM__ARCS = eINSTANCE.getQNM_Arcs();

		/**
		 * The meta object literal for the '<em><b>Service Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QNM__SERVICE_REQUESTS = eINSTANCE.getQNM_ServiceRequests();

		/**
		 * The meta object literal for the '<em><b>Workload Routings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QNM__WORKLOAD_ROUTINGS = eINSTANCE.getQNM_WorkloadRoutings();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.ArcImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Workload Routing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__WORKLOAD_ROUTING = eINSTANCE.getArc_WorkloadRouting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__NAME = eINSTANCE.getArc_Name();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.WorkloadImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '<em><b>Num Of Jobs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__NUM_OF_JOBS = eINSTANCE.getWorkload_NumOfJobs();

		/**
		 * The meta object literal for the '<em><b>Service Request</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__SERVICE_REQUEST = eINSTANCE.getWorkload_ServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Workload Routing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__WORKLOAD_ROUTING = eINSTANCE.getWorkload_WorkloadRouting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__NAME = eINSTANCE.getWorkload_Name();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.NodeImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.ServerImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SCHEDULING_POLICY = eINSTANCE.getServer_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Service Request</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVICE_REQUEST = eINSTANCE.getServer_ServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__WORKLOAD = eINSTANCE.getServer_Workload();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.NonServerNodeImpl <em>Non Server Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.NonServerNodeImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getNonServerNode()
		 * @generated
		 */
		EClass NON_SERVER_NODE = eINSTANCE.getNonServerNode();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_SERVER_NODE__WORKLOAD = eINSTANCE.getNonServerNode_Workload();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.ThinkDeviceImpl <em>Think Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.ThinkDeviceImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getThinkDevice()
		 * @generated
		 */
		EClass THINK_DEVICE = eINSTANCE.getThinkDevice();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THINK_DEVICE__THINK_TIME = eINSTANCE.getThinkDevice_ThinkTime();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THINK_DEVICE__WORKLOAD = eINSTANCE.getThinkDevice_Workload();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.SourceNodeImpl <em>Source Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.SourceNodeImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getSourceNode()
		 * @generated
		 */
		EClass SOURCE_NODE = eINSTANCE.getSourceNode();

		/**
		 * The meta object literal for the '<em><b>Arrival Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_NODE__ARRIVAL_DISTRIBUTION = eINSTANCE.getSourceNode_ArrivalDistribution();

		/**
		 * The meta object literal for the '<em><b>Arrival Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_NODE__ARRIVAL_PARAMS = eINSTANCE.getSourceNode_ArrivalParams();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_NODE__WORKLOAD = eINSTANCE.getSourceNode_Workload();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.SinkNodeImpl <em>Sink Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.SinkNodeImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getSinkNode()
		 * @generated
		 */
		EClass SINK_NODE = eINSTANCE.getSinkNode();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_NODE__WORKLOAD = eINSTANCE.getSinkNode_Workload();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.ServiceRequestImpl <em>Service Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.ServiceRequestImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getServiceRequest()
		 * @generated
		 */
		EClass SERVICE_REQUEST = eINSTANCE.getServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Service Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REQUEST__SERVICE_DISTRIBUTION = eINSTANCE.getServiceRequest_ServiceDistribution();

		/**
		 * The meta object literal for the '<em><b>Service Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REQUEST__SERVICE_PARAMS = eINSTANCE.getServiceRequest_ServiceParams();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REQUEST__SERVER = eINSTANCE.getServiceRequest_Server();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REQUEST__WORKLOAD = eINSTANCE.getServiceRequest_Workload();

		/**
		 * The meta object literal for the '{@link MultiClassQN.impl.WorkloadRoutingImpl <em>Workload Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.impl.WorkloadRoutingImpl
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getWorkloadRouting()
		 * @generated
		 */
		EClass WORKLOAD_ROUTING = eINSTANCE.getWorkloadRouting();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD_ROUTING__PROBABILITY = eINSTANCE.getWorkloadRouting_Probability();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_ROUTING__ARC = eINSTANCE.getWorkloadRouting_Arc();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_ROUTING__WORKLOAD = eINSTANCE.getWorkloadRouting_Workload();

		/**
		 * The meta object literal for the '{@link MultiClassQN.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.SchedulingPolicy
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getSchedulingPolicy()
		 * @generated
		 */
		EEnum SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link MultiClassQN.ProbabilityDistribution <em>Probability Distribution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MultiClassQN.ProbabilityDistribution
		 * @see MultiClassQN.impl.MultiClassQNPackageImpl#getProbabilityDistribution()
		 * @generated
		 */
		EEnum PROBABILITY_DISTRIBUTION = eINSTANCE.getProbabilityDistribution();

	}

} //MultiClassQNPackage
