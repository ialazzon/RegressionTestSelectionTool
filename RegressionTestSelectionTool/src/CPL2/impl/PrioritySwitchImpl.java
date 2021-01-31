/**
 */
package CPL2.impl;

import CPL.CPLPackage;
import CPL.PrioritySwitch;
import CPL.SwitchedPriority;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Priority Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.PrioritySwitchImpl#getPriorities <em>Priorities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrioritySwitchImpl extends SwitchImpl implements PrioritySwitch {
	/**
	 * The cached value of the '{@link #getPriorities() <em>Priorities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorities()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchedPriority> priorities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrioritySwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.PRIORITY_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchedPriority> getPriorities() {
		if (priorities == null) {
			priorities = new EObjectContainmentEList<SwitchedPriority>(SwitchedPriority.class, this, CPLPackage.PRIORITY_SWITCH__PRIORITIES);
		}
		return priorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPLPackage.PRIORITY_SWITCH__PRIORITIES:
				return ((InternalEList<?>)getPriorities()).basicRemove(otherEnd, msgs);
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
			case CPLPackage.PRIORITY_SWITCH__PRIORITIES:
				return getPriorities();
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
			case CPLPackage.PRIORITY_SWITCH__PRIORITIES:
				getPriorities().clear();
				getPriorities().addAll((Collection<? extends SwitchedPriority>)newValue);
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
			case CPLPackage.PRIORITY_SWITCH__PRIORITIES:
				getPriorities().clear();
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
			case CPLPackage.PRIORITY_SWITCH__PRIORITIES:
				return priorities != null && !priorities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrioritySwitchImpl
