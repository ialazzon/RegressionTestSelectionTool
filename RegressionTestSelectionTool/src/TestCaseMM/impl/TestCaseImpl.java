/**
 */
package TestCaseMM.impl;

import TestCaseMM.SourceModel;
import TestCaseMM.TargetModel;
import TestCaseMM.TestCase;
import TestCaseMM.TestCaseMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestCaseMM.impl.TestCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link TestCaseMM.impl.TestCaseImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link TestCaseMM.impl.TestCaseImpl#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCaseImpl extends MinimalEObjectImpl.Container implements TestCase {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModel()
	 * @generated
	 * @ordered
	 */
	protected SourceModel sourceModel;

	/**
	 * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModel()
	 * @generated
	 * @ordered
	 */
	protected TargetModel targetModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestCaseMMPackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCaseMMPackage.TEST_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel getSourceModel() {
		if (sourceModel != null && sourceModel.eIsProxy()) {
			InternalEObject oldSourceModel = (InternalEObject)sourceModel;
			sourceModel = (SourceModel)eResolveProxy(oldSourceModel);
			if (sourceModel != oldSourceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestCaseMMPackage.TEST_CASE__SOURCE_MODEL, oldSourceModel, sourceModel));
			}
		}
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel basicGetSourceModel() {
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceModel(SourceModel newSourceModel) {
		SourceModel oldSourceModel = sourceModel;
		sourceModel = newSourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCaseMMPackage.TEST_CASE__SOURCE_MODEL, oldSourceModel, sourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetModel getTargetModel() {
		if (targetModel != null && targetModel.eIsProxy()) {
			InternalEObject oldTargetModel = (InternalEObject)targetModel;
			targetModel = (TargetModel)eResolveProxy(oldTargetModel);
			if (targetModel != oldTargetModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestCaseMMPackage.TEST_CASE__TARGET_MODEL, oldTargetModel, targetModel));
			}
		}
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetModel basicGetTargetModel() {
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetModel(TargetModel newTargetModel) {
		TargetModel oldTargetModel = targetModel;
		targetModel = newTargetModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCaseMMPackage.TEST_CASE__TARGET_MODEL, oldTargetModel, targetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestCaseMMPackage.TEST_CASE__NAME:
				return getName();
			case TestCaseMMPackage.TEST_CASE__SOURCE_MODEL:
				if (resolve) return getSourceModel();
				return basicGetSourceModel();
			case TestCaseMMPackage.TEST_CASE__TARGET_MODEL:
				if (resolve) return getTargetModel();
				return basicGetTargetModel();
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
			case TestCaseMMPackage.TEST_CASE__NAME:
				setName((String)newValue);
				return;
			case TestCaseMMPackage.TEST_CASE__SOURCE_MODEL:
				setSourceModel((SourceModel)newValue);
				return;
			case TestCaseMMPackage.TEST_CASE__TARGET_MODEL:
				setTargetModel((TargetModel)newValue);
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
			case TestCaseMMPackage.TEST_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestCaseMMPackage.TEST_CASE__SOURCE_MODEL:
				setSourceModel((SourceModel)null);
				return;
			case TestCaseMMPackage.TEST_CASE__TARGET_MODEL:
				setTargetModel((TargetModel)null);
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
			case TestCaseMMPackage.TEST_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestCaseMMPackage.TEST_CASE__SOURCE_MODEL:
				return sourceModel != null;
			case TestCaseMMPackage.TEST_CASE__TARGET_MODEL:
				return targetModel != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TestCaseImpl
