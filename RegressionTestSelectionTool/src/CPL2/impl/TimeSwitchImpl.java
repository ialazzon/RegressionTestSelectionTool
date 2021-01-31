/**
 */
package CPL2.impl;

import CPL.CPLPackage;
import CPL.SwitchedTime;
import CPL.TimeSwitch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.TimeSwitchImpl#getTzid <em>Tzid</em>}</li>
 *   <li>{@link CPL2.impl.TimeSwitchImpl#getTzurl <em>Tzurl</em>}</li>
 *   <li>{@link CPL2.impl.TimeSwitchImpl#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSwitchImpl extends SwitchImpl implements TimeSwitch {
	/**
	 * The default value of the '{@link #getTzid() <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzid()
	 * @generated
	 * @ordered
	 */
	protected static final String TZID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzid() <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzid()
	 * @generated
	 * @ordered
	 */
	protected String tzid = TZID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTzurl() <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzurl()
	 * @generated
	 * @ordered
	 */
	protected static final String TZURL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzurl() <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzurl()
	 * @generated
	 * @ordered
	 */
	protected String tzurl = TZURL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimes() <em>Times</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchedTime> times;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.TIME_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTzid() {
		return tzid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTzid(String newTzid) {
		String oldTzid = tzid;
		tzid = newTzid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.TIME_SWITCH__TZID, oldTzid, tzid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTzurl() {
		return tzurl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTzurl(String newTzurl) {
		String oldTzurl = tzurl;
		tzurl = newTzurl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.TIME_SWITCH__TZURL, oldTzurl, tzurl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchedTime> getTimes() {
		if (times == null) {
			times = new EObjectContainmentEList<SwitchedTime>(SwitchedTime.class, this, CPLPackage.TIME_SWITCH__TIMES);
		}
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPLPackage.TIME_SWITCH__TIMES:
				return ((InternalEList<?>)getTimes()).basicRemove(otherEnd, msgs);
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
			case CPLPackage.TIME_SWITCH__TZID:
				return getTzid();
			case CPLPackage.TIME_SWITCH__TZURL:
				return getTzurl();
			case CPLPackage.TIME_SWITCH__TIMES:
				return getTimes();
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
			case CPLPackage.TIME_SWITCH__TZID:
				setTzid((String)newValue);
				return;
			case CPLPackage.TIME_SWITCH__TZURL:
				setTzurl((String)newValue);
				return;
			case CPLPackage.TIME_SWITCH__TIMES:
				getTimes().clear();
				getTimes().addAll((Collection<? extends SwitchedTime>)newValue);
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
			case CPLPackage.TIME_SWITCH__TZID:
				setTzid(TZID_EDEFAULT);
				return;
			case CPLPackage.TIME_SWITCH__TZURL:
				setTzurl(TZURL_EDEFAULT);
				return;
			case CPLPackage.TIME_SWITCH__TIMES:
				getTimes().clear();
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
			case CPLPackage.TIME_SWITCH__TZID:
				return TZID_EDEFAULT == null ? tzid != null : !TZID_EDEFAULT.equals(tzid);
			case CPLPackage.TIME_SWITCH__TZURL:
				return TZURL_EDEFAULT == null ? tzurl != null : !TZURL_EDEFAULT.equals(tzurl);
			case CPLPackage.TIME_SWITCH__TIMES:
				return times != null && !times.isEmpty();
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
		result.append(" (tzid: ");
		result.append(tzid);
		result.append(", tzurl: ");
		result.append(tzurl);
		result.append(')');
		return result.toString();
	}

} //TimeSwitchImpl
