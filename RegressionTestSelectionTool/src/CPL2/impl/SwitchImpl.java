/**
 */
package CPL2.impl;

import CPL.CPLPackage;
import CPL.NotPresent;
import CPL.Otherwise;
import CPL.Switch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.SwitchImpl#getNotPresent <em>Not Present</em>}</li>
 *   <li>{@link CPL2.impl.SwitchImpl#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SwitchImpl extends NodeImpl implements Switch {
	/**
	 * The cached value of the '{@link #getNotPresent() <em>Not Present</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPresent()
	 * @generated
	 * @ordered
	 */
	protected NotPresent notPresent;

	/**
	 * The cached value of the '{@link #getOtherwise() <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwise()
	 * @generated
	 * @ordered
	 */
	protected Otherwise otherwise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotPresent getNotPresent() {
		return notPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotPresent(NotPresent newNotPresent, NotificationChain msgs) {
		NotPresent oldNotPresent = notPresent;
		notPresent = newNotPresent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCH__NOT_PRESENT, oldNotPresent, newNotPresent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotPresent(NotPresent newNotPresent) {
		if (newNotPresent != notPresent) {
			NotificationChain msgs = null;
			if (notPresent != null)
				msgs = ((InternalEObject)notPresent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.SWITCH__NOT_PRESENT, null, msgs);
			if (newNotPresent != null)
				msgs = ((InternalEObject)newNotPresent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.SWITCH__NOT_PRESENT, null, msgs);
			msgs = basicSetNotPresent(newNotPresent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCH__NOT_PRESENT, newNotPresent, newNotPresent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Otherwise getOtherwise() {
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(Otherwise newOtherwise, NotificationChain msgs) {
		Otherwise oldOtherwise = otherwise;
		otherwise = newOtherwise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCH__OTHERWISE, oldOtherwise, newOtherwise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwise(Otherwise newOtherwise) {
		if (newOtherwise != otherwise) {
			NotificationChain msgs = null;
			if (otherwise != null)
				msgs = ((InternalEObject)otherwise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.SWITCH__OTHERWISE, null, msgs);
			if (newOtherwise != null)
				msgs = ((InternalEObject)newOtherwise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.SWITCH__OTHERWISE, null, msgs);
			msgs = basicSetOtherwise(newOtherwise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCH__OTHERWISE, newOtherwise, newOtherwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPLPackage.SWITCH__NOT_PRESENT:
				return basicSetNotPresent(null, msgs);
			case CPLPackage.SWITCH__OTHERWISE:
				return basicSetOtherwise(null, msgs);
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
			case CPLPackage.SWITCH__NOT_PRESENT:
				return getNotPresent();
			case CPLPackage.SWITCH__OTHERWISE:
				return getOtherwise();
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
			case CPLPackage.SWITCH__NOT_PRESENT:
				setNotPresent((NotPresent)newValue);
				return;
			case CPLPackage.SWITCH__OTHERWISE:
				setOtherwise((Otherwise)newValue);
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
			case CPLPackage.SWITCH__NOT_PRESENT:
				setNotPresent((NotPresent)null);
				return;
			case CPLPackage.SWITCH__OTHERWISE:
				setOtherwise((Otherwise)null);
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
			case CPLPackage.SWITCH__NOT_PRESENT:
				return notPresent != null;
			case CPLPackage.SWITCH__OTHERWISE:
				return otherwise != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchImpl
