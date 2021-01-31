/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switched Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.SwitchedLanguage#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getSwitchedLanguage()
 * @model
 * @generated
 */
public interface SwitchedLanguage extends NodeContainer {
	/**
	 * Returns the value of the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' attribute.
	 * @see #setMatches(String)
	 * @see CPL.CPLPackage#getSwitchedLanguage_Matches()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMatches();

	/**
	 * Sets the value of the '{@link CPL.SwitchedLanguage#getMatches <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matches</em>' attribute.
	 * @see #getMatches()
	 * @generated
	 */
	void setMatches(String value);

} // SwitchedLanguage
