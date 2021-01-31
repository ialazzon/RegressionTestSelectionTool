/**
 */
package MultiClassQN.impl;

import MultiClassQN.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiClassQNFactoryImpl extends EFactoryImpl implements MultiClassQNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultiClassQNFactory init() {
		try {
			MultiClassQNFactory theMultiClassQNFactory = (MultiClassQNFactory)EPackage.Registry.INSTANCE.getEFactory(MultiClassQNPackage.eNS_URI);
			if (theMultiClassQNFactory != null) {
				return theMultiClassQNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultiClassQNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiClassQNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MultiClassQNPackage.QNM: return createQNM();
			case MultiClassQNPackage.ARC: return createArc();
			case MultiClassQNPackage.WORKLOAD: return createWorkload();
			case MultiClassQNPackage.SERVER: return createServer();
			case MultiClassQNPackage.NON_SERVER_NODE: return createNonServerNode();
			case MultiClassQNPackage.THINK_DEVICE: return createThinkDevice();
			case MultiClassQNPackage.SOURCE_NODE: return createSourceNode();
			case MultiClassQNPackage.SINK_NODE: return createSinkNode();
			case MultiClassQNPackage.SERVICE_REQUEST: return createServiceRequest();
			case MultiClassQNPackage.WORKLOAD_ROUTING: return createWorkloadRouting();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MultiClassQNPackage.SCHEDULING_POLICY:
				return createSchedulingPolicyFromString(eDataType, initialValue);
			case MultiClassQNPackage.PROBABILITY_DISTRIBUTION:
				return createProbabilityDistributionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MultiClassQNPackage.SCHEDULING_POLICY:
				return convertSchedulingPolicyToString(eDataType, instanceValue);
			case MultiClassQNPackage.PROBABILITY_DISTRIBUTION:
				return convertProbabilityDistributionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNM createQNM() {
		QNMImpl qnm = new QNMImpl();
		return qnm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload createWorkload() {
		WorkloadImpl workload = new WorkloadImpl();
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonServerNode createNonServerNode() {
		NonServerNodeImpl nonServerNode = new NonServerNodeImpl();
		return nonServerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThinkDevice createThinkDevice() {
		ThinkDeviceImpl thinkDevice = new ThinkDeviceImpl();
		return thinkDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNode createSourceNode() {
		SourceNodeImpl sourceNode = new SourceNodeImpl();
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode createSinkNode() {
		SinkNodeImpl sinkNode = new SinkNodeImpl();
		return sinkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequest createServiceRequest() {
		ServiceRequestImpl serviceRequest = new ServiceRequestImpl();
		return serviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadRouting createWorkloadRouting() {
		WorkloadRoutingImpl workloadRouting = new WorkloadRoutingImpl();
		return workloadRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy createSchedulingPolicyFromString(EDataType eDataType, String initialValue) {
		SchedulingPolicy result = SchedulingPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistribution createProbabilityDistributionFromString(EDataType eDataType, String initialValue) {
		ProbabilityDistribution result = ProbabilityDistribution.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbabilityDistributionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiClassQNPackage getMultiClassQNPackage() {
		return (MultiClassQNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultiClassQNPackage getPackage() {
		return MultiClassQNPackage.eINSTANCE;
	}

} //MultiClassQNFactoryImpl
