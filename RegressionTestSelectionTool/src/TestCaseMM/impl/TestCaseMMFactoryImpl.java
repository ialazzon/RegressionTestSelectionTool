/**
 */
package TestCaseMM.impl;

import TestCaseMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestCaseMMFactoryImpl extends EFactoryImpl implements TestCaseMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestCaseMMFactory init() {
		try {
			TestCaseMMFactory theTestCaseMMFactory = (TestCaseMMFactory)EPackage.Registry.INSTANCE.getEFactory(TestCaseMMPackage.eNS_URI);
			if (theTestCaseMMFactory != null) {
				return theTestCaseMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestCaseMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCaseMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestCaseMMPackage.TEST_CASE_SET: return createTestCaseSet();
			case TestCaseMMPackage.TEST_CASE: return createTestCase();
			case TestCaseMMPackage.RULE: return createRule();
			case TestCaseMMPackage.SOURCE_MODEL: return createSourceModel();
			case TestCaseMMPackage.TARGET_MODEL: return createTargetModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCaseSet createTestCaseSet() {
		TestCaseSetImpl testCaseSet = new TestCaseSetImpl();
		return testCaseSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel createSourceModel() {
		SourceModelImpl sourceModel = new SourceModelImpl();
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetModel createTargetModel() {
		TargetModelImpl targetModel = new TargetModelImpl();
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCaseMMPackage getTestCaseMMPackage() {
		return (TestCaseMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestCaseMMPackage getPackage() {
		return TestCaseMMPackage.eINSTANCE;
	}

} //TestCaseMMFactoryImpl
