/**
 */
package TestCaseMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestCaseMM.TestCase#getName <em>Name</em>}</li>
 *   <li>{@link TestCaseMM.TestCase#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link TestCaseMM.TestCase#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 *
 * @see TestCaseMM.TestCaseMMPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestCaseMM.TestCaseMMPackage#getTestCase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestCaseMM.TestCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Model</em>' reference.
	 * @see #setSourceModel(SourceModel)
	 * @see TestCaseMM.TestCaseMMPackage#getTestCase_SourceModel()
	 * @model
	 * @generated
	 */
	SourceModel getSourceModel();

	/**
	 * Sets the value of the '{@link TestCaseMM.TestCase#getSourceModel <em>Source Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model</em>' reference.
	 * @see #getSourceModel()
	 * @generated
	 */
	void setSourceModel(SourceModel value);

	/**
	 * Returns the value of the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Model</em>' reference.
	 * @see #setTargetModel(TargetModel)
	 * @see TestCaseMM.TestCaseMMPackage#getTestCase_TargetModel()
	 * @model
	 * @generated
	 */
	TargetModel getTargetModel();

	/**
	 * Sets the value of the '{@link TestCaseMM.TestCase#getTargetModel <em>Target Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Model</em>' reference.
	 * @see #getTargetModel()
	 * @generated
	 */
	void setTargetModel(TargetModel value);

} // TestCase
