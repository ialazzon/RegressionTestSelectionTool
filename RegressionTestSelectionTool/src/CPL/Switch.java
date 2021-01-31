/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.Switch#getNotPresent <em>Not Present</em>}</li>
 *   <li>{@link CPL.Switch#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getSwitch()
 * @model abstract="true"
 * @generated
 */
public interface Switch extends Node {
	/**
	 * Returns the value of the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Present</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Present</em>' containment reference.
	 * @see #setNotPresent(NotPresent)
	 * @see CPL.CPLPackage#getSwitch_NotPresent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NotPresent getNotPresent();

	/**
	 * Sets the value of the '{@link CPL.Switch#getNotPresent <em>Not Present</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Present</em>' containment reference.
	 * @see #getNotPresent()
	 * @generated
	 */
	void setNotPresent(NotPresent value);

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference.
	 * @see #setOtherwise(Otherwise)
	 * @see CPL.CPLPackage#getSwitch_Otherwise()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Otherwise getOtherwise();

	/**
	 * Sets the value of the '{@link CPL.Switch#getOtherwise <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' containment reference.
	 * @see #getOtherwise()
	 * @generated
	 */
	void setOtherwise(Otherwise value);

} // Switch
