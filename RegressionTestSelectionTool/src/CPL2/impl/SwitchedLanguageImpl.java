/**
 */
package CPL2.impl;

import CPL.CPLPackage;
import CPL.SwitchedLanguage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switched Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.SwitchedLanguageImpl#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchedLanguageImpl extends NodeContainerImpl implements SwitchedLanguage {
	/**
	 * The default value of the '{@link #getMatches() <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected String matches = MATCHES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchedLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.SWITCHED_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatches() {
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatches(String newMatches) {
		String oldMatches = matches;
		matches = newMatches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.SWITCHED_LANGUAGE__MATCHES, oldMatches, matches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPLPackage.SWITCHED_LANGUAGE__MATCHES:
				return getMatches();
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
			case CPLPackage.SWITCHED_LANGUAGE__MATCHES:
				setMatches((String)newValue);
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
			case CPLPackage.SWITCHED_LANGUAGE__MATCHES:
				setMatches(MATCHES_EDEFAULT);
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
			case CPLPackage.SWITCHED_LANGUAGE__MATCHES:
				return MATCHES_EDEFAULT == null ? matches != null : !MATCHES_EDEFAULT.equals(matches);
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
		result.append(" (matches: ");
		result.append(matches);
		result.append(')');
		return result.toString();
	}

} //SwitchedLanguageImpl
