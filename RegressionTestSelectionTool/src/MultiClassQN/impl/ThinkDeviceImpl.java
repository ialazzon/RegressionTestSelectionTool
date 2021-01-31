/**
 */
package MultiClassQN.impl;

import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.ThinkDevice;
import MultiClassQN.Workload;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Think Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.ThinkDeviceImpl#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link MultiClassQN.impl.ThinkDeviceImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThinkDeviceImpl extends NodeImpl implements ThinkDevice {
	/**
	 * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected static final double THINK_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected double thinkTime = THINK_TIME_EDEFAULT;

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
	protected ThinkDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.THINK_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThinkTime() {
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThinkTime(double newThinkTime) {
		double oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.THINK_DEVICE__THINK_TIME, oldThinkTime, thinkTime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiClassQNPackage.THINK_DEVICE__WORKLOAD, oldWorkload, workload));
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
	public void setWorkload(Workload newWorkload) {
		Workload oldWorkload = workload;
		workload = newWorkload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.THINK_DEVICE__WORKLOAD, oldWorkload, workload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultiClassQNPackage.THINK_DEVICE__THINK_TIME:
				return getThinkTime();
			case MultiClassQNPackage.THINK_DEVICE__WORKLOAD:
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
			case MultiClassQNPackage.THINK_DEVICE__THINK_TIME:
				setThinkTime((Double)newValue);
				return;
			case MultiClassQNPackage.THINK_DEVICE__WORKLOAD:
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
			case MultiClassQNPackage.THINK_DEVICE__THINK_TIME:
				setThinkTime(THINK_TIME_EDEFAULT);
				return;
			case MultiClassQNPackage.THINK_DEVICE__WORKLOAD:
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
			case MultiClassQNPackage.THINK_DEVICE__THINK_TIME:
				return thinkTime != THINK_TIME_EDEFAULT;
			case MultiClassQNPackage.THINK_DEVICE__WORKLOAD:
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
		result.append(" (thinkTime: ");
		result.append(thinkTime);
		result.append(')');
		return result.toString();
	}

} //ThinkDeviceImpl
