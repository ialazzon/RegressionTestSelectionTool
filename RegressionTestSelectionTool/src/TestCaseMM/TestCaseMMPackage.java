/**
 */
package TestCaseMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TestCaseMM.TestCaseMMFactory
 * @model kind="package"
 * @generated
 */
public interface TestCaseMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestCaseMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TestCaseMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestCaseMMPackage eINSTANCE = TestCaseMM.impl.TestCaseMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link TestCaseMM.impl.TestCaseSetImpl <em>Test Case Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCaseMM.impl.TestCaseSetImpl
	 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getTestCaseSet()
	 * @generated
	 */
	int TEST_CASE_SET = 0;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_SET__TEST_CASES = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_SET__RULES = 1;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_SET__SOURCE_MODELS = 2;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_SET__TARGET_MODELS = 3;

	/**
	 * The number of structural features of the '<em>Test Case Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Test Case Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestCaseMM.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCaseMM.impl.TestCaseImpl
	 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__SOURCE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TARGET_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestCaseMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCaseMM.impl.RuleImpl
	 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TEST_CASES = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestCaseMM.impl.SourceModelImpl <em>Source Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCaseMM.impl.SourceModelImpl
	 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getSourceModel()
	 * @generated
	 */
	int SOURCE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Source Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestCaseMM.impl.TargetModelImpl <em>Target Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCaseMM.impl.TargetModelImpl
	 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getTargetModel()
	 * @generated
	 */
	int TARGET_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Target Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link TestCaseMM.TestCaseSet <em>Test Case Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case Set</em>'.
	 * @see TestCaseMM.TestCaseSet
	 * @generated
	 */
	EClass getTestCaseSet();

	/**
	 * Returns the meta object for the containment reference list '{@link TestCaseMM.TestCaseSet#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Cases</em>'.
	 * @see TestCaseMM.TestCaseSet#getTestCases()
	 * @see #getTestCaseSet()
	 * @generated
	 */
	EReference getTestCaseSet_TestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link TestCaseMM.TestCaseSet#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see TestCaseMM.TestCaseSet#getRules()
	 * @see #getTestCaseSet()
	 * @generated
	 */
	EReference getTestCaseSet_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link TestCaseMM.TestCaseSet#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see TestCaseMM.TestCaseSet#getSourceModels()
	 * @see #getTestCaseSet()
	 * @generated
	 */
	EReference getTestCaseSet_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link TestCaseMM.TestCaseSet#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see TestCaseMM.TestCaseSet#getTargetModels()
	 * @see #getTestCaseSet()
	 * @generated
	 */
	EReference getTestCaseSet_TargetModels();

	/**
	 * Returns the meta object for class '{@link TestCaseMM.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see TestCaseMM.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link TestCaseMM.TestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestCaseMM.TestCase#getName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Name();

	/**
	 * Returns the meta object for the reference '{@link TestCaseMM.TestCase#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model</em>'.
	 * @see TestCaseMM.TestCase#getSourceModel()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_SourceModel();

	/**
	 * Returns the meta object for the reference '{@link TestCaseMM.TestCase#getTargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Model</em>'.
	 * @see TestCaseMM.TestCase#getTargetModel()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_TargetModel();

	/**
	 * Returns the meta object for class '{@link TestCaseMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see TestCaseMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link TestCaseMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestCaseMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the reference list '{@link TestCaseMM.Rule#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Cases</em>'.
	 * @see TestCaseMM.Rule#getTestCases()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_TestCases();

	/**
	 * Returns the meta object for class '{@link TestCaseMM.SourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Model</em>'.
	 * @see TestCaseMM.SourceModel
	 * @generated
	 */
	EClass getSourceModel();

	/**
	 * Returns the meta object for the attribute '{@link TestCaseMM.SourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestCaseMM.SourceModel#getName()
	 * @see #getSourceModel()
	 * @generated
	 */
	EAttribute getSourceModel_Name();

	/**
	 * Returns the meta object for class '{@link TestCaseMM.TargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Model</em>'.
	 * @see TestCaseMM.TargetModel
	 * @generated
	 */
	EClass getTargetModel();

	/**
	 * Returns the meta object for the attribute '{@link TestCaseMM.TargetModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestCaseMM.TargetModel#getName()
	 * @see #getTargetModel()
	 * @generated
	 */
	EAttribute getTargetModel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestCaseMMFactory getTestCaseMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TestCaseMM.impl.TestCaseSetImpl <em>Test Case Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCaseMM.impl.TestCaseSetImpl
		 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getTestCaseSet()
		 * @generated
		 */
		EClass TEST_CASE_SET = eINSTANCE.getTestCaseSet();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE_SET__TEST_CASES = eINSTANCE.getTestCaseSet_TestCases();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE_SET__RULES = eINSTANCE.getTestCaseSet_Rules();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE_SET__SOURCE_MODELS = eINSTANCE.getTestCaseSet_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE_SET__TARGET_MODELS = eINSTANCE.getTestCaseSet_TargetModels();

		/**
		 * The meta object literal for the '{@link TestCaseMM.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCaseMM.impl.TestCaseImpl
		 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__NAME = eINSTANCE.getTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Source Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__SOURCE_MODEL = eINSTANCE.getTestCase_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Target Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__TARGET_MODEL = eINSTANCE.getTestCase_TargetModel();

		/**
		 * The meta object literal for the '{@link TestCaseMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCaseMM.impl.RuleImpl
		 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TEST_CASES = eINSTANCE.getRule_TestCases();

		/**
		 * The meta object literal for the '{@link TestCaseMM.impl.SourceModelImpl <em>Source Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCaseMM.impl.SourceModelImpl
		 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getSourceModel()
		 * @generated
		 */
		EClass SOURCE_MODEL = eINSTANCE.getSourceModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_MODEL__NAME = eINSTANCE.getSourceModel_Name();

		/**
		 * The meta object literal for the '{@link TestCaseMM.impl.TargetModelImpl <em>Target Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCaseMM.impl.TargetModelImpl
		 * @see TestCaseMM.impl.TestCaseMMPackageImpl#getTargetModel()
		 * @generated
		 */
		EClass TARGET_MODEL = eINSTANCE.getTargetModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_MODEL__NAME = eINSTANCE.getTargetModel_Name();

	}

} //TestCaseMMPackage
