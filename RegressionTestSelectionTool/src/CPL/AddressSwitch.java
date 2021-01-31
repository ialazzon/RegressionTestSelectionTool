/**
 */
package CPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.AddressSwitch#getField <em>Field</em>}</li>
 *   <li>{@link CPL.AddressSwitch#getSubField <em>Sub Field</em>}</li>
 *   <li>{@link CPL.AddressSwitch#getAddresses <em>Addresses</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getAddressSwitch()
 * @model
 * @generated
 */
public interface AddressSwitch extends Switch {
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
	 * @see CPL.CPLPackage#getAddressSwitch_Field()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link CPL.AddressSwitch#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Sub Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Field</em>' attribute.
	 * @see #setSubField(String)
	 * @see CPL.CPLPackage#getAddressSwitch_SubField()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSubField();

	/**
	 * Sets the value of the '{@link CPL.AddressSwitch#getSubField <em>Sub Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Field</em>' attribute.
	 * @see #getSubField()
	 * @generated
	 */
	void setSubField(String value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link CPL.SwitchedAddress}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see CPL.CPLPackage#getAddressSwitch_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchedAddress> getAddresses();

} // AddressSwitch
