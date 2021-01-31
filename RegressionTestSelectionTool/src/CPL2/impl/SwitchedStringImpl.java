/**
 */
package CPL2.impl;

import CPL.CPLPackage;
import CPL.SwitchedString;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switched String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.SwitchedStringImpl#getIs <em>Is</em>}</li>
 *   <li>{@link CPL2.impl.SwitchedStringImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchedStringImpl extends NodeContainerImpl implements SwitchedString {
	/**
	 * The default value of the '{@link #getIs() <em>Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIs() <em>Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs()
	 * @generated
	 * @ordered
	 */
	protected String is = IS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContains() <em>Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected String contains = CONTAINS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchedStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.SWITCHED_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIs() {
		return is;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs(String newIs) {
		String oldIs = is;
		is = newIs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCHED_STRING__IS, oldIs, is));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContains() {
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContains(String newContains) {
		String oldContains = contains;
		contains = newContains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCHED_STRING__CONTAINS, oldContains, contains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPLPackage.SWITCHED_STRING__IS:
				return getIs();
			case CPLPackage.SWITCHED_STRING__CONTAINS:
				return getContains();
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
			case CPLPackage.SWITCHED_STRING__IS:
				setIs((String)newValue);
				return;
			case CPLPackage.SWITCHED_STRING__CONTAINS:
				setContains((String)newValue);
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
			case CPLPackage.SWITCHED_STRING__IS:
				setIs(IS_EDEFAULT);
				return;
			case CPLPackage.SWITCHED_STRING__CONTAINS:
				setContains(CONTAINS_EDEFAULT);
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
			case CPLPackage.SWITCHED_STRING__IS:
				return IS_EDEFAULT == null ? is != null : !IS_EDEFAULT.equals(is);
			case CPLPackage.SWITCHED_STRING__CONTAINS:
				return CONTAINS_EDEFAULT == null ? contains != null : !CONTAINS_EDEFAULT.equals(contains);
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
		result.append(" (is: ");
		result.append(is);
		result.append(", contains: ");
		result.append(contains);
		result.append(')');
		return result.toString();
	}

} //SwitchedStringImpl
