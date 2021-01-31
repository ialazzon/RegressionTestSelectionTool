/**
 */
package MultiClassQN.impl;

import MultiClassQN.Arc;
import MultiClassQN.MultiClassQNFactory;
import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.Node;
import MultiClassQN.NonServerNode;
import MultiClassQN.ProbabilityDistribution;
import MultiClassQN.SchedulingPolicy;
import MultiClassQN.Server;
import MultiClassQN.ServiceRequest;
import MultiClassQN.SinkNode;
import MultiClassQN.SourceNode;
import MultiClassQN.ThinkDevice;
import MultiClassQN.Workload;
import MultiClassQN.WorkloadRouting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiClassQNPackageImpl extends EPackageImpl implements MultiClassQNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qnmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonServerNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thinkDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadRoutingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum probabilityDistributionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MultiClassQN.MultiClassQNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MultiClassQNPackageImpl() {
		super(eNS_URI, MultiClassQNFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MultiClassQNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MultiClassQNPackage init() {
		if (isInited) return (MultiClassQNPackage)EPackage.Registry.INSTANCE.getEPackage(MultiClassQNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMultiClassQNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MultiClassQNPackageImpl theMultiClassQNPackage = registeredMultiClassQNPackage instanceof MultiClassQNPackageImpl ? (MultiClassQNPackageImpl)registeredMultiClassQNPackage : new MultiClassQNPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMultiClassQNPackage.createPackageContents();

		// Initialize created meta-data
		theMultiClassQNPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMultiClassQNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MultiClassQNPackage.eNS_URI, theMultiClassQNPackage);
		return theMultiClassQNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQNM() {
		return qnmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQNM_Workloads() {
		return (EReference)qnmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQNM_Nodes() {
		return (EReference)qnmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQNM_Arcs() {
		return (EReference)qnmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQNM_ServiceRequests() {
		return (EReference)qnmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQNM_WorkloadRoutings() {
		return (EReference)qnmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Source() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Target() {
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_WorkloadRouting() {
		return (EReference)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArc_Name() {
		return (EAttribute)arcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkload() {
		return workloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkload_NumOfJobs() {
		return (EAttribute)workloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkload_ServiceRequest() {
		return (EReference)workloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkload_WorkloadRouting() {
		return (EReference)workloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkload_Name() {
		return (EAttribute)workloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Outgoing() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Incoming() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_SchedulingPolicy() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_ServiceRequest() {
		return (EReference)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Workload() {
		return (EReference)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonServerNode() {
		return nonServerNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonServerNode_Workload() {
		return (EReference)nonServerNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThinkDevice() {
		return thinkDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThinkDevice_ThinkTime() {
		return (EAttribute)thinkDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThinkDevice_Workload() {
		return (EReference)thinkDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceNode() {
		return sourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceNode_ArrivalDistribution() {
		return (EAttribute)sourceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceNode_ArrivalParams() {
		return (EAttribute)sourceNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceNode_Workload() {
		return (EReference)sourceNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkNode() {
		return sinkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSinkNode_Workload() {
		return (EReference)sinkNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRequest() {
		return serviceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRequest_ServiceDistribution() {
		return (EAttribute)serviceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRequest_ServiceParams() {
		return (EAttribute)serviceRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRequest_Server() {
		return (EReference)serviceRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRequest_Workload() {
		return (EReference)serviceRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkloadRouting() {
		return workloadRoutingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkloadRouting_Probability() {
		return (EAttribute)workloadRoutingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadRouting_Arc() {
		return (EReference)workloadRoutingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadRouting_Workload() {
		return (EReference)workloadRoutingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingPolicy() {
		return schedulingPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProbabilityDistribution() {
		return probabilityDistributionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiClassQNFactory getMultiClassQNFactory() {
		return (MultiClassQNFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		qnmEClass = createEClass(QNM);
		createEReference(qnmEClass, QNM__WORKLOADS);
		createEReference(qnmEClass, QNM__NODES);
		createEReference(qnmEClass, QNM__ARCS);
		createEReference(qnmEClass, QNM__SERVICE_REQUESTS);
		createEReference(qnmEClass, QNM__WORKLOAD_ROUTINGS);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEReference(arcEClass, ARC__WORKLOAD_ROUTING);
		createEAttribute(arcEClass, ARC__NAME);

		workloadEClass = createEClass(WORKLOAD);
		createEAttribute(workloadEClass, WORKLOAD__NUM_OF_JOBS);
		createEReference(workloadEClass, WORKLOAD__SERVICE_REQUEST);
		createEReference(workloadEClass, WORKLOAD__WORKLOAD_ROUTING);
		createEAttribute(workloadEClass, WORKLOAD__NAME);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEReference(nodeEClass, NODE__INCOMING);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__SCHEDULING_POLICY);
		createEReference(serverEClass, SERVER__SERVICE_REQUEST);
		createEReference(serverEClass, SERVER__WORKLOAD);

		nonServerNodeEClass = createEClass(NON_SERVER_NODE);
		createEReference(nonServerNodeEClass, NON_SERVER_NODE__WORKLOAD);

		thinkDeviceEClass = createEClass(THINK_DEVICE);
		createEAttribute(thinkDeviceEClass, THINK_DEVICE__THINK_TIME);
		createEReference(thinkDeviceEClass, THINK_DEVICE__WORKLOAD);

		sourceNodeEClass = createEClass(SOURCE_NODE);
		createEAttribute(sourceNodeEClass, SOURCE_NODE__ARRIVAL_DISTRIBUTION);
		createEAttribute(sourceNodeEClass, SOURCE_NODE__ARRIVAL_PARAMS);
		createEReference(sourceNodeEClass, SOURCE_NODE__WORKLOAD);

		sinkNodeEClass = createEClass(SINK_NODE);
		createEReference(sinkNodeEClass, SINK_NODE__WORKLOAD);

		serviceRequestEClass = createEClass(SERVICE_REQUEST);
		createEAttribute(serviceRequestEClass, SERVICE_REQUEST__SERVICE_DISTRIBUTION);
		createEAttribute(serviceRequestEClass, SERVICE_REQUEST__SERVICE_PARAMS);
		createEReference(serviceRequestEClass, SERVICE_REQUEST__SERVER);
		createEReference(serviceRequestEClass, SERVICE_REQUEST__WORKLOAD);

		workloadRoutingEClass = createEClass(WORKLOAD_ROUTING);
		createEAttribute(workloadRoutingEClass, WORKLOAD_ROUTING__PROBABILITY);
		createEReference(workloadRoutingEClass, WORKLOAD_ROUTING__ARC);
		createEReference(workloadRoutingEClass, WORKLOAD_ROUTING__WORKLOAD);

		// Create enums
		schedulingPolicyEEnum = createEEnum(SCHEDULING_POLICY);
		probabilityDistributionEEnum = createEEnum(PROBABILITY_DISTRIBUTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serverEClass.getESuperTypes().add(this.getNode());
		nonServerNodeEClass.getESuperTypes().add(this.getNode());
		thinkDeviceEClass.getESuperTypes().add(this.getNode());
		sourceNodeEClass.getESuperTypes().add(this.getNode());
		sinkNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(qnmEClass, MultiClassQN.QNM.class, "QNM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQNM_Workloads(), this.getWorkload(), null, "workloads", null, 1, -1, MultiClassQN.QNM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQNM_Nodes(), this.getNode(), null, "nodes", null, 0, -1, MultiClassQN.QNM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQNM_Arcs(), this.getArc(), null, "arcs", null, 0, -1, MultiClassQN.QNM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQNM_ServiceRequests(), this.getServiceRequest(), null, "serviceRequests", null, 0, -1, MultiClassQN.QNM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQNM_WorkloadRoutings(), this.getWorkloadRouting(), null, "workloadRoutings", null, 0, -1, MultiClassQN.QNM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_WorkloadRouting(), this.getWorkloadRouting(), this.getWorkloadRouting_Arc(), "WorkloadRouting", null, 0, -1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Name(), ecorePackage.getEString(), "name", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadEClass, Workload.class, "Workload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkload_NumOfJobs(), ecorePackage.getEInt(), "numOfJobs", null, 1, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkload_ServiceRequest(), this.getServiceRequest(), this.getServiceRequest_Workload(), "serviceRequest", null, 0, -1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkload_WorkloadRouting(), this.getWorkloadRouting(), this.getWorkloadRouting_Workload(), "workloadRouting", null, 0, -1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkload_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_SchedulingPolicy(), this.getSchedulingPolicy(), "schedulingPolicy", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_ServiceRequest(), this.getServiceRequest(), this.getServiceRequest_Server(), "serviceRequest", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Workload(), this.getWorkload(), null, "workload", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonServerNodeEClass, NonServerNode.class, "NonServerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonServerNode_Workload(), this.getWorkload(), null, "workload", null, 1, 1, NonServerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thinkDeviceEClass, ThinkDevice.class, "ThinkDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThinkDevice_ThinkTime(), ecorePackage.getEDouble(), "thinkTime", null, 1, 1, ThinkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThinkDevice_Workload(), this.getWorkload(), null, "workload", null, 1, 1, ThinkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceNodeEClass, SourceNode.class, "SourceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceNode_ArrivalDistribution(), this.getProbabilityDistribution(), "arrivalDistribution", null, 1, 1, SourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceNode_ArrivalParams(), ecorePackage.getEDouble(), "arrivalParams", null, 1, -1, SourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceNode_Workload(), this.getWorkload(), null, "workload", null, 1, 1, SourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinkNodeEClass, SinkNode.class, "SinkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSinkNode_Workload(), this.getWorkload(), null, "workload", null, 1, 1, SinkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRequestEClass, ServiceRequest.class, "ServiceRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRequest_ServiceDistribution(), this.getProbabilityDistribution(), "serviceDistribution", null, 1, 1, ServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRequest_ServiceParams(), ecorePackage.getEDouble(), "serviceParams", null, 1, -1, ServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceRequest_Server(), this.getServer(), this.getServer_ServiceRequest(), "server", null, 1, 1, ServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceRequest_Workload(), this.getWorkload(), this.getWorkload_ServiceRequest(), "workload", null, 1, 1, ServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadRoutingEClass, WorkloadRouting.class, "WorkloadRouting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkloadRouting_Probability(), ecorePackage.getEDouble(), "probability", null, 1, 1, WorkloadRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkloadRouting_Arc(), this.getArc(), this.getArc_WorkloadRouting(), "arc", null, 1, 1, WorkloadRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkloadRouting_Workload(), this.getWorkload(), this.getWorkload_WorkloadRouting(), "workload", null, 1, 1, WorkloadRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(schedulingPolicyEEnum, SchedulingPolicy.class, "SchedulingPolicy");
		addEEnumLiteral(schedulingPolicyEEnum, SchedulingPolicy.FCFS);
		addEEnumLiteral(schedulingPolicyEEnum, SchedulingPolicy.IS);
		addEEnumLiteral(schedulingPolicyEEnum, SchedulingPolicy.PS);

		initEEnum(probabilityDistributionEEnum, ProbabilityDistribution.class, "ProbabilityDistribution");
		addEEnumLiteral(probabilityDistributionEEnum, ProbabilityDistribution.EXPONENTIAL);
		addEEnumLiteral(probabilityDistributionEEnum, ProbabilityDistribution.POISSON);
		addEEnumLiteral(probabilityDistributionEEnum, ProbabilityDistribution.CONSTANT);

		// Create resource
		createResource(eNS_URI);
	}

} //MultiClassQNPackageImpl
