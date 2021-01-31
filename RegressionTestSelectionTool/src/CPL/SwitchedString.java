/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switched String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.SwitchedString#getIs <em>Is</em>}</li>
 *   <li>{@link CPL.SwitchedString#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getSwitchedString()
 * @model
 * @generated
 */
public interface SwitchedString extends NodeContainer {
	/**
	 * Returns the value of the '<em><b>Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' attribute.
	 * @see #setIs(String)
	 * @see CPL.CPLPackage#getSwitchedString_Is()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getIs();

	/**
	 * Sets the value of the '{@link CPL.SwitchedString#getIs <em>Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' attribute.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(String value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' attribute.
	 * @see #setContains(String)
	 * @see CPL.CPLPackage#getSwitchedString_Contains()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getContains();

	/**
	 * Sets the value of the '{@link CPL.SwitchedString#getContains <em>Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' attribute.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(String value);

} // SwitchedString
