/**
 */
package MultiClassQN.impl;

import MultiClassQN.Arc;
import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.Workload;
import MultiClassQN.WorkloadRouting;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.WorkloadRoutingImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link MultiClassQN.impl.WorkloadRoutingImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link MultiClassQN.impl.WorkloadRoutingImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadRoutingImpl extends MinimalEObjectImpl.Container implements WorkloadRouting {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected Arc arc;

	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected Workload workload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadRoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.WORKLOAD_ROUTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.WORKLOAD_ROUTING__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc getArc() {
		if (arc != null && arc.eIsProxy()) {
			InternalEObject oldArc = (InternalEObject)arc;
			arc = (Arc)eResolveProxy(oldArc);
			if (arc != oldArc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiClassQNPackage.WORKLOAD_ROUTING__ARC, oldArc, arc));
			}
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc basicGetArc() {
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArc(Arc newArc, NotificationChain msgs) {
		Arc oldArc = arc;
		arc = newArc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.WORKLOAD_ROUTING__ARC, oldArc, newArc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArc(Arc newArc) {
		if (newArc != arc) {
			NotificationChain msgs = null;
			if (arc != null)
				msgs = ((InternalEObject)arc).eInverseRemove(this, MultiClassQNPackage.ARC__WORKLOAD_ROUTING, Arc.class, msgs);
			if (newArc != null)
				msgs = ((InternalEObject)newArc).eInverseAdd(this, MultiClassQNPackage.ARC__WORKLOAD_ROUTING, Arc.class, msgs);
			msgs = basicSetArc(newArc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.WORKLOAD_ROUTING__ARC, newArc, newArc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload getWorkload() {
		if (workload != null && workload.eIsProxy()) {
			InternalEObject oldWorkload = (InternalEObject)workload;
			workload = (Workload)eResolveProxy(oldWorkload);
			if (workload != oldWorkload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD, oldWorkload, workload));
			}
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload basicGetWorkload() {
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkload(Workload newWorkload, NotificationChain msgs) {
		Workload oldWorkload = workload;
		workload = newWorkload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD, oldWorkload, newWorkload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkload(Workload newWorkload) {
		if (newWorkload != workload) {
			NotificationChain msgs = null;
			if (workload != null)
				msgs = ((InternalEObject)workload).eInverseRemove(this, MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING, Workload.class, msgs);
			if (newWorkload != null)
				msgs = ((InternalEObject)newWorkload).eInverseAdd(this, MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING, Workload.class, msgs);
			msgs = basicSetWorkload(newWorkload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD, newWorkload, newWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultiClassQNPackage.WORKLOAD_ROUTING__ARC:
				if (arc != null)
					msgs = ((InternalEObject)arc).eInverseRemove(this, MultiClassQNPackage.ARC__WORKLOAD_ROUTING, Arc.class, msgs);
				return basicSetArc((Arc)otherEnd, msgs);
			case MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD:
				if (workload != null)
					msgs = ((InternalEObject)workload).eInverseRemove(this, MultiClassQNPackage.WORKLOAD__WORKLOAD_ROUTING, Workload.class, msgs);
				return basicSetWorkload((Workload)otherEnd, msgs);
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
			case MultiClassQNPackage.WORKLOAD_ROUTING__ARC:
				return basicSetArc(null, msgs);
			case MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD:
				return basicSetWorkload(null, msgs);
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
			case MultiClassQNPackage.WORKLOAD_ROUTING__PROBABILITY:
				return getProbability();
			case MultiClassQNPackage.WORKLOAD_ROUTING__ARC:
				if (resolve) return getArc();
				return basicGetArc();
			case MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD:
				if (resolve) return getWorkload();
				return basicGetWorkload();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MultiClassQNPackage.WORKLOAD_ROUTING__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case MultiClassQNPackage.WORKLOAD_ROUTING__ARC:
				setArc((Arc)newValue);
				return;
			case MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD:
				setWorkload((Workload)newValue);
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
			case MultiClassQNPackage.WORKLOAD_ROUTING__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case MultiClassQNPackage.WORKLOAD_ROUTING__ARC:
				setArc((Arc)null);
				return;
			case MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD:
				setWorkload((Workload)null);
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
			case MultiClassQNPackage.WORKLOAD_ROUTING__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case MultiClassQNPackage.WORKLOAD_ROUTING__ARC:
				return arc != null;
			case MultiClassQNPackage.WORKLOAD_ROUTING__WORKLOAD:
				return workload != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //WorkloadRoutingImpl
