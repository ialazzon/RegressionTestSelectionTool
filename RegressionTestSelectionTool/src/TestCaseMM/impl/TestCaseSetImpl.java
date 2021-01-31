/**
 */
package TestCaseMM.impl;

import TestCaseMM.Rule;
import TestCaseMM.SourceModel;
import TestCaseMM.TargetModel;
import TestCaseMM.TestCase;
import TestCaseMM.TestCaseMMPackage;
import TestCaseMM.TestCaseSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestCaseMM.impl.TestCaseSetImpl#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link TestCaseMM.impl.TestCaseSetImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link TestCaseMM.impl.TestCaseSetImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link TestCaseMM.impl.TestCaseSetImpl#getTargetModels <em>Target Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCaseSetImpl extends MinimalEObjectImpl.Container implements TestCaseSet {
	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCases;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceModel> sourceModels;

	/**
	 * The cached value of the '{@link #getTargetModels() <em>Target Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetModel> targetModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestCaseMMPackage.Literals.TEST_CASE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectContainmentEList<TestCase>(TestCase.class, this, TestCaseMMPackage.TEST_CASE_SET__TEST_CASES);
		}
		return testCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, TestCaseMMPackage.TEST_CASE_SET__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceModel> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentEList<SourceModel>(SourceModel.class, this, TestCaseMMPackage.TEST_CASE_SET__SOURCE_MODELS);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetModel> getTargetModels() {
		if (targetModels == null) {
			targetModels = new EObjectContainmentEList<TargetModel>(TargetModel.class, this, TestCaseMMPackage.TEST_CASE_SET__TARGET_MODELS);
		}
		return targetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestCaseMMPackage.TEST_CASE_SET__TEST_CASES:
				return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
			case TestCaseMMPackage.TEST_CASE_SET__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case TestCaseMMPackage.TEST_CASE_SET__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case TestCaseMMPackage.TEST_CASE_SET__TARGET_MODELS:
				return ((InternalEList<?>)getTargetModels()).basicRemove(otherEnd, msgs);
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
			case TestCaseMMPackage.TEST_CASE_SET__TEST_CASES:
				return getTestCases();
			case TestCaseMMPackage.TEST_CASE_SET__RULES:
				return getRules();
			case TestCaseMMPackage.TEST_CASE_SET__SOURCE_MODELS:
				return getSourceModels();
			case TestCaseMMPackage.TEST_CASE_SET__TARGET_MODELS:
				return getTargetModels();
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
			case TestCaseMMPackage.TEST_CASE_SET__TEST_CASES:
				getTestCases().clear();
				getTestCases().addAll((Collection<? extends TestCase>)newValue);
				return;
			case TestCaseMMPackage.TEST_CASE_SET__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case TestCaseMMPackage.TEST_CASE_SET__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends SourceModel>)newValue);
				return;
			case TestCaseMMPackage.TEST_CASE_SET__TARGET_MODELS:
				getTargetModels().clear();
				getTargetModels().addAll((Collection<? extends TargetModel>)newValue);
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
			case TestCaseMMPackage.TEST_CASE_SET__TEST_CASES:
				getTestCases().clear();
				return;
			case TestCaseMMPackage.TEST_CASE_SET__RULES:
				getRules().clear();
				return;
			case TestCaseMMPackage.TEST_CASE_SET__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case TestCaseMMPackage.TEST_CASE_SET__TARGET_MODELS:
				getTargetModels().clear();
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
			case TestCaseMMPackage.TEST_CASE_SET__TEST_CASES:
				return testCases != null && !testCases.isEmpty();
			case TestCaseMMPackage.TEST_CASE_SET__RULES:
				return rules != null && !rules.isEmpty();
			case TestCaseMMPackage.TEST_CASE_SET__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case TestCaseMMPackage.TEST_CASE_SET__TARGET_MODELS:
				return targetModels != null && !targetModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestCaseSetImpl
