/**
 */
package CPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.StringSwitch#getField <em>Field</em>}</li>
 *   <li>{@link CPL.StringSwitch#getStrings <em>Strings</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getStringSwitch()
 * @model
 * @generated
 */
public interface StringSwitch extends Switch {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see CPL.CPLPackage#getStringSwitch_Field()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link CPL.StringSwitch#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Strings</b></em>' containment reference list.
	 * The list contents are of type {@link CPL.SwitchedString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strings</em>' containment reference list.
	 * @see CPL.CPLPackage#getStringSwitch_Strings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchedString> getStrings();

} // StringSwitch
