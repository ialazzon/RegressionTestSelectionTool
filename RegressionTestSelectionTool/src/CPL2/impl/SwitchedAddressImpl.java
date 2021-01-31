/**
 */
package CPL2.impl;

import CPL.CPLPackage;
import CPL.SwitchedAddress;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switched Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.SwitchedAddressImpl#getIs <em>Is</em>}</li>
 *   <li>{@link CPL2.impl.SwitchedAddressImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link CPL2.impl.SwitchedAddressImpl#getSubDomainOf <em>Sub Domain Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchedAddressImpl extends NodeContainerImpl implements SwitchedAddress {
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
	 * The default value of the '{@link #getSubDomainOf() <em>Sub Domain Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDomainOf()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_DOMAIN_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubDomainOf() <em>Sub Domain Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDomainOf()
	 * @generated
	 * @ordered
	 */
	protected String subDomainOf = SUB_DOMAIN_OF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchedAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.SWITCHED_ADDRESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCHED_ADDRESS__IS, oldIs, is));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCHED_ADDRESS__CONTAINS, oldContains, contains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubDomainOf() {
		return subDomainOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubDomainOf(String newSubDomainOf) {
		String oldSubDomainOf = subDomainOf;
		subDomainOf = newSubDomainOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCHED_ADDRESS__SUB_DOMAIN_OF, oldSubDomainOf, subDomainOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPLPackage.SWITCHED_ADDRESS__IS:
				return getIs();
			case CPLPackage.SWITCHED_ADDRESS__CONTAINS:
				return getContains();
			case CPLPackage.SWITCHED_ADDRESS__SUB_DOMAIN_OF:
				return getSubDomainOf();
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
			case CPLPackage.SWITCHED_ADDRESS__IS:
				setIs((String)newValue);
				return;
			case CPLPackage.SWITCHED_ADDRESS__CONTAINS:
				setContains((String)newValue);
				return;
			case CPLPackage.SWITCHED_ADDRESS__SUB_DOMAIN_OF:
				setSubDomainOf((String)newValue);
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
			case CPLPackage.SWITCHED_ADDRESS__IS:
				setIs(IS_EDEFAULT);
				return;
			case CPLPackage.SWITCHED_ADDRESS__CONTAINS:
				setContains(CONTAINS_EDEFAULT);
				return;
			case CPLPackage.SWITCHED_ADDRESS__SUB_DOMAIN_OF:
				setSubDomainOf(SUB_DOMAIN_OF_EDEFAULT);
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
			case CPLPackage.SWITCHED_ADDRESS__IS:
				return IS_EDEFAULT == null ? is != null : !IS_EDEFAULT.equals(is);
			case CPLPackage.SWITCHED_ADDRESS__CONTAINS:
				return CONTAINS_EDEFAULT == null ? contains != null : !CONTAINS_EDEFAULT.equals(contains);
			case CPLPackage.SWITCHED_ADDRESS__SUB_DOMAIN_OF:
				return SUB_DOMAIN_OF_EDEFAULT == null ? subDomainOf != null : !SUB_DOMAIN_OF_EDEFAULT.equals(subDomainOf);
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
		result.append(", subDomainOf: ");
		result.append(subDomainOf);
		result.append(')');
		return result.toString();
	}

} //SwitchedAddressImpl
