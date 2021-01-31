/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switched Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.SwitchedAddress#getIs <em>Is</em>}</li>
 *   <li>{@link CPL.SwitchedAddress#getContains <em>Contains</em>}</li>
 *   <li>{@link CPL.SwitchedAddress#getSubDomainOf <em>Sub Domain Of</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getSwitchedAddress()
 * @model
 * @generated
 */
public interface SwitchedAddress extends NodeContainer {
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
	 * @see CPL.CPLPackage#getSwitchedAddress_Is()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getIs();

	/**
	 * Sets the value of the '{@link CPL.SwitchedAddress#getIs <em>Is</em>}' attribute.
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
	 * @see CPL.CPLPackage#getSwitchedAddress_Contains()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getContains();

	/**
	 * Sets the value of the '{@link CPL.SwitchedAddress#getContains <em>Contains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' attribute.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(String value);

	/**
	 * Returns the value of the '<em><b>Sub Domain Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Domain Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Domain Of</em>' attribute.
	 * @see #setSubDomainOf(String)
	 * @see CPL.CPLPackage#getSwitchedAddress_SubDomainOf()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSubDomainOf();

	/**
	 * Sets the value of the '{@link CPL.SwitchedAddress#getSubDomainOf <em>Sub Domain Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Domain Of</em>' attribute.
	 * @see #getSubDomainOf()
	 * @generated
	 */
	void setSubDomainOf(String value);

} // SwitchedAddress
