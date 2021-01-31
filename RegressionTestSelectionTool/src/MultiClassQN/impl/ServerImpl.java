/**
 */
package MultiClassQN.impl;

import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.SchedulingPolicy;
import MultiClassQN.Server;
import MultiClassQN.ServiceRequest;
import MultiClassQN.Workload;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.ServerImpl#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link MultiClassQN.impl.ServerImpl#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link MultiClassQN.impl.ServerImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends NodeImpl implements Server {
	/**
	 * The default value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingPolicy SCHEDULING_POLICY_EDEFAULT = SchedulingPolicy.FCFS;

	/**
	 * The cached value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingPolicy schedulingPolicy = SCHEDULING_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceRequest() <em>Service Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRequest> serviceRequest;

	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected EList<Workload> workload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy getSchedulingPolicy() {
		return schedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingPolicy(SchedulingPolicy newSchedulingPolicy) {
		SchedulingPolicy oldSchedulingPolicy = schedulingPolicy;
		schedulingPolicy = newSchedulingPolicy == null ? SCHEDULING_POLICY_EDEFAULT : newSchedulingPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SERVER__SCHEDULING_POLICY, oldSchedulingPolicy, schedulingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRequest> getServiceRequest() {
		if (serviceRequest == null) {
			serviceRequest = new EObjectWithInverseResolvingEList<ServiceRequest>(ServiceRequest.class, this, MultiClassQNPackage.SERVER__SERVICE_REQUEST, MultiClassQNPackage.SERVICE_REQUEST__SERVER);
		}
		return serviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workload> getWorkload() {
		if (workload == null) {
			workload = new EObjectResolvingEList<Workload>(Workload.class, this, MultiClassQNPackage.SERVER__WORKLOAD);
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultiClassQNPackage.SERVER__SERVICE_REQUEST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceRequest()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultiClassQNPackage.SERVER__SERVICE_REQUEST:
				return ((InternalEList<?>)getServiceRequest()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultiClassQNPackage.SERVER__SCHEDULING_POLICY:
				return getSchedulingPolicy();
			case MultiClassQNPackage.SERVER__SERVICE_REQUEST:
				return getServiceRequest();
			case MultiClassQNPackage.SERVER__WORKLOAD:
				return getWorkload();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MultiClassQNPackage.SERVER__SCHEDULING_POLICY:
				setSchedulingPolicy((SchedulingPolicy)newValue);
				return;
			case MultiClassQNPackage.SERVER__SERVICE_REQUEST:
				getServiceRequest().clear();
				getServiceRequest().addAll((Collection<? extends ServiceRequest>)newValue);
				return;
			case MultiClassQNPackage.SERVER__WORKLOAD:
				getWorkload().clear();
				getWorkload().addAll((Collection<? extends Workload>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MultiClassQNPackage.SERVER__SCHEDULING_POLICY:
				setSchedulingPolicy(SCHEDULING_POLICY_EDEFAULT);
				return;
			case MultiClassQNPackage.SERVER__SERVICE_REQUEST:
				getServiceRequest().clear();
				return;
			case MultiClassQNPackage.SERVER__WORKLOAD:
				getWorkload().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MultiClassQNPackage.SERVER__SCHEDULING_POLICY:
				return schedulingPolicy != SCHEDULING_POLICY_EDEFAULT;
			case MultiClassQNPackage.SERVER__SERVICE_REQUEST:
				return serviceRequest != null && !serviceRequest.isEmpty();
			case MultiClassQNPackage.SERVER__WORKLOAD:
				return workload != null && !workload.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (schedulingPolicy: ");
		result.append(schedulingPolicy);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
