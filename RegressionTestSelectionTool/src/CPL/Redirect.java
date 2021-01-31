/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redirect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.Redirect#getPermanent <em>Permanent</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getRedirect()
 * @model
 * @generated
 */
public interface Redirect extends SignallingAction {
	/**
	 * Returns the value of the '<em><b>Permanent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permanent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permanent</em>' attribute.
	 * @see #setPermanent(String)
	 * @see CPL.CPLPackage#getRedirect_Permanent()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPermanent();

	/**
	 * Sets the value of the '{@link CPL.Redirect#getPermanent <em>Permanent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permanent</em>' attribute.
	 * @see #getPermanent()
	 * @generated
	 */
	void setPermanent(String value);

} // Redirect
