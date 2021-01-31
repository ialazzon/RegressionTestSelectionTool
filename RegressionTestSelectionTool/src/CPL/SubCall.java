/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.SubCall#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getSubCall()
 * @model
 * @generated
 */
public interface SubCall extends Node {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see CPL.CPLPackage#getSubCall_Ref()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link CPL.SubCall#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // SubCall
