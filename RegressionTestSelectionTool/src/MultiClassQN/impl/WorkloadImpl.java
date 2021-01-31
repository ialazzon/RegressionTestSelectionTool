/**
 */
package MultiClassQN.impl;

import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.ServiceRequest;
import MultiClassQN.Workload;
import MultiClassQN.WorkloadRouting;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.WorkloadImpl#getNumOfJobs <em>Num Of Jobs</em>}</li>
 *   <li>{@link MultiClassQN.impl.WorkloadImpl#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link MultiClassQN.impl.WorkloadImpl#getWorkloadRouting <em>Workload Routing</em>}</li>
 *   <li>{@link MultiClassQN.impl.WorkloadImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadImpl extends MinimalEObjectImpl.Container implements Workload {
	/**
	 * The default value of the '{@link #getNumOfJobs() <em>Num Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfJobs()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_JOBS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfJobs() <em>Num Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfJobs()
	 * @generated
	 * @ordered
	 */
	protected int numOfJobs = NUM_OF_JOBS_EDEFAULT;

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
	 * The cached value of the '{@link #getWorkloadRouting() <em>Workload Routing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloadRouting()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkloadRouting> workloadRouting;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOfJobs() {
		return numOfJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfJobs(int newNumOfJobs) {
		int oldNumOfJobs = numOfJobs;
		numOfJobs = newNumOfJobs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.WORKLOAD__NUM_OF_JOBS, oldNumOfJobs, numOfJobs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRequest> getServiceRequest() {
		if (serviceRequest == null) {
			serviceRequest = new EObjectWithInverseResolvingEList<ServiceRequest>(ServiceRequest.class, this, MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST, MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD);
		}
		return serviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkloadRouting> getWorkloadRouting() {
		if (workloadRouting == null) {
			workloadRouting = new EObjectWithInverseResolvingEList<WorkloadRouting>(WorkloadRouting.class, this, MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING, MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD);
		}
		return workloadRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.WORKLOAD__NAME, oldName, name));
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
			case MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceRequest()).basicAdd(otherEnd, msgs);
			case MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkloadRouting()).basicAdd(otherEnd, msgs);
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
			case MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST:
				return ((InternalEList<?>)getServiceRequest()).basicRemove(otherEnd, msgs);
			case MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING:
				return ((InternalEList<?>)getWorkloadRouting()).basicRemove(otherEnd, msgs);
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
			case MultiClassQNPackage.WORKLOAD__NUM_OF_JOBS:
				return getNumOfJobs();
			case MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST:
				return getServiceRequest();
			case MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING:
				return getWorkloadRouting();
			case MultiClassQNPackage.WORKLOAD__NAME:
				return getName();
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
			case MultiClassQNPackage.WORKLOAD__NUM_OF_JOBS:
				setNumOfJobs((Integer)newValue);
				return;
			case MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST:
				getServiceRequest().clear();
				getServiceRequest().addAll((Collection<? extends ServiceRequest>)newValue);
				return;
			case MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING:
				getWorkloadRouting().clear();
				getWorkloadRouting().addAll((Collection<? extends WorkloadRouting>)newValue);
				return;
			case MultiClassQNPackage.WORKLOAD__NAME:
				setName((String)newValue);
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
			case MultiClassQNPackage.WORKLOAD__NUM_OF_JOBS:
				setNumOfJobs(NUM_OF_JOBS_EDEFAULT);
				return;
			case MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST:
				getServiceRequest().clear();
				return;
			case MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING:
				getWorkloadRouting().clear();
				return;
			case MultiClassQNPackage.WORKLOAD__NAME:
				setName(NAME_EDEFAULT);
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
			case MultiClassQNPackage.WORKLOAD__NUM_OF_JOBS:
				return numOfJobs != NUM_OF_JOBS_EDEFAULT;
			case MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST:
				return serviceRequest != null && !serviceRequest.isEmpty();
			case MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING:
				return workloadRouting != null && !workloadRouting.isEmpty();
			case MultiClassQNPackage.WORKLOAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (numOfJobs: ");
		result.append(numOfJobs);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkloadImpl
