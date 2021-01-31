/**
 */
package TestCaseMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestCaseMM.TestCaseSet#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link TestCaseMM.TestCaseSet#getRules <em>Rules</em>}</li>
 *   <li>{@link TestCaseMM.TestCaseSet#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link TestCaseMM.TestCaseSet#getTargetModels <em>Target Models</em>}</li>
 * </ul>
 *
 * @see TestCaseMM.TestCaseMMPackage#getTestCaseSet()
 * @model
 * @generated
 */
public interface TestCaseSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link TestCaseMM.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see TestCaseMM.TestCaseMMPackage#getTestCaseSet_TestCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getTestCases();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link TestCaseMM.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see TestCaseMM.TestCaseMMPackage#getTestCaseSet_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link TestCaseMM.SourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see TestCaseMM.TestCaseMMPackage#getTestCaseSet_SourceModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceModel> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Target Models</b></em>' containment reference list.
	 * The list contents are of type {@link TestCaseMM.TargetModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Models</em>' containment reference list.
	 * @see TestCaseMM.TestCaseMMPackage#getTestCaseSet_TargetModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetModel> getTargetModels();

} // TestCaseSet
