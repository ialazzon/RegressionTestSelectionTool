/**
 */
package CPL2.impl;

import CPL.AddressSwitch;
import CPL.CPLPackage;
import CPL.SwitchedAddress;

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
 * An implementation of the model object '<em><b>Address Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.AddressSwitchImpl#getField <em>Field</em>}</li>
 *   <li>{@link CPL2.impl.AddressSwitchImpl#getSubField <em>Sub Field</em>}</li>
 *   <li>{@link CPL2.impl.AddressSwitchImpl#getAddresses <em>Addresses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressSwitchImpl extends SwitchImpl implements AddressSwitch {
	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected String field = FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubField() <em>Sub Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubField()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubField() <em>Sub Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubField()
	 * @generated
	 * @ordered
	 */
	protected String subField = SUB_FIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchedAddress> addresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.ADDRESS_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(String newField) {
		String oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.ADDRESS_SWITCH__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubField() {
		return subField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubField(String newSubField) {
		String oldSubField = subField;
		subField = newSubField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.ADDRESS_SWITCH__SUB_FIELD, oldSubField, subField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchedAddress> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<SwitchedAddress>(SwitchedAddress.class, this, CPLPackage.ADDRESS_SWITCH__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPLPackage.ADDRESS_SWITCH__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
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
			case CPLPackage.ADDRESS_SWITCH__FIELD:
				return getField();
			case CPLPackage.ADDRESS_SWITCH__SUB_FIELD:
				return getSubField();
			case CPLPackage.ADDRESS_SWITCH__ADDRESSES:
				return getAddresses();
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
			case CPLPackage.ADDRESS_SWITCH__FIELD:
				setField((String)newValue);
				return;
			case CPLPackage.ADDRESS_SWITCH__SUB_FIELD:
				setSubField((String)newValue);
				return;
			case CPLPackage.ADDRESS_SWITCH__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends SwitchedAddress>)newValue);
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
			case CPLPackage.ADDRESS_SWITCH__FIELD:
				setField(FIELD_EDEFAULT);
				return;
			case CPLPackage.ADDRESS_SWITCH__SUB_FIELD:
				setSubField(SUB_FIELD_EDEFAULT);
				return;
			case CPLPackage.ADDRESS_SWITCH__ADDRESSES:
				getAddresses().clear();
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
			case CPLPackage.ADDRESS_SWITCH__FIELD:
				return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
			case CPLPackage.ADDRESS_SWITCH__SUB_FIELD:
				return SUB_FIELD_EDEFAULT == null ? subField != null : !SUB_FIELD_EDEFAULT.equals(subField);
			case CPLPackage.ADDRESS_SWITCH__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
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
		result.append(" (field: ");
		result.append(field);
		result.append(", subField: ");
		result.append(subField);
		result.append(')');
		return result.toString();
	}

} //AddressSwitchImpl
