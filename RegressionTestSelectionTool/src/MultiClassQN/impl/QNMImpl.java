/**
 */
package MultiClassQN.impl;

import MultiClassQN.Arc;
import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.Node;
import MultiClassQN.QNM;
import MultiClassQN.ServiceRequest;
import MultiClassQN.Workload;
import MultiClassQN.WorkloadRouting;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QNM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.QNMImpl#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link MultiClassQN.impl.QNMImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link MultiClassQN.impl.QNMImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link MultiClassQN.impl.QNMImpl#getServiceRequests <em>Service Requests</em>}</li>
 *   <li>{@link MultiClassQN.impl.QNMImpl#getWorkloadRoutings <em>Workload Routings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QNMImpl extends MinimalEObjectImpl.Container implements QNM {
	/**
	 * The cached value of the '{@link #getWorkloads() <em>Workloads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloads()
	 * @generated
	 * @ordered
	 */
	protected EList<Workload> workloads;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getServiceRequests() <em>Service Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRequest> serviceRequests;

	/**
	 * The cached value of the '{@link #getWorkloadRoutings() <em>Workload Routings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloadRoutings()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkloadRouting> workloadRoutings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QNMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.QNM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workload> getWorkloads() {
		if (workloads == null) {
			workloads = new EObjectContainmentEList<Workload>(Workload.class, this, MultiClassQNPackage.QNM__WORKLOADS);
		}
		return workloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, MultiClassQNPackage.QNM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentEList<Arc>(Arc.class, this, MultiClassQNPackage.QNM__ARCS);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRequest> getServiceRequests() {
		if (serviceRequests == null) {
			serviceRequests = new EObjectContainmentEList<ServiceRequest>(ServiceRequest.class, this, MultiClassQNPackage.QNM__SERVICE_REQUESTS);
		}
		return serviceRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkloadRouting> getWorkloadRoutings() {
		if (workloadRoutings == null) {
			workloadRoutings = new EObjectContainmentEList<WorkloadRouting>(WorkloadRouting.class, this, MultiClassQNPackage.QNM__WORKLOAD_ROUTINGS);
		}
		return workloadRoutings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultiClassQNPackage.QNM__WORKLOADS:
				return ((InternalEList<?>)getWorkloads()).basicRemove(otherEnd, msgs);
			case MultiClassQNPackage.QNM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case MultiClassQNPackage.QNM__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case MultiClassQNPackage.QNM__SERVICE_REQUESTS:
				return ((InternalEList<?>)getServiceRequests()).basicRemove(otherEnd, msgs);
			case MultiClassQNPackage.QNM__WORKLOAD_ROUTINGS:
				return ((InternalEList<?>)getWorkloadRoutings()).basicRemove(otherEnd, msgs);
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
			case MultiClassQNPackage.QNM__WORKLOADS:
				return getWorkloads();
			case MultiClassQNPackage.QNM__NODES:
				return getNodes();
			case MultiClassQNPackage.QNM__ARCS:
				return getArcs();
			case MultiClassQNPackage.QNM__SERVICE_REQUESTS:
				return getServiceRequests();
			case MultiClassQNPackage.QNM__WORKLOAD_ROUTINGS:
				return getWorkloadRoutings();
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
			case MultiClassQNPackage.QNM__WORKLOADS:
				getWorkloads().clear();
				getWorkloads().addAll((Collection<? extends Workload>)newValue);
				return;
			case MultiClassQNPackage.QNM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case MultiClassQNPackage.QNM__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case MultiClassQNPackage.QNM__SERVICE_REQUESTS:
				getServiceRequests().clear();
				getServiceRequests().addAll((Collection<? extends ServiceRequest>)newValue);
				return;
			case MultiClassQNPackage.QNM__WORKLOAD_ROUTINGS:
				getWorkloadRoutings().clear();
				getWorkloadRoutings().addAll((Collection<? extends WorkloadRouting>)newValue);
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
			case MultiClassQNPackage.QNM__WORKLOADS:
				getWorkloads().clear();
				return;
			case MultiClassQNPackage.QNM__NODES:
				getNodes().clear();
				return;
			case MultiClassQNPackage.QNM__ARCS:
				getArcs().clear();
				return;
			case MultiClassQNPackage.QNM__SERVICE_REQUESTS:
				getServiceRequests().clear();
				return;
			case MultiClassQNPackage.QNM__WORKLOAD_ROUTINGS:
				getWorkloadRoutings().clear();
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
			case MultiClassQNPackage.QNM__WORKLOADS:
				return workloads != null && !workloads.isEmpty();
			case MultiClassQNPackage.QNM__NODES:
				return nodes != null && !nodes.isEmpty();
			case MultiClassQNPackage.QNM__ARCS:
				return arcs != null && !arcs.isEmpty();
			case MultiClassQNPackage.QNM__SERVICE_REQUESTS:
				return serviceRequests != null && !serviceRequests.isEmpty();
			case MultiClassQNPackage.QNM__WORKLOAD_ROUTINGS:
				return workloadRoutings != null && !workloadRoutings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QNMImpl
