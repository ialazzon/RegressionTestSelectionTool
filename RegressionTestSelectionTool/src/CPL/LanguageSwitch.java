/**
 */
package CPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.LanguageSwitch#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getLanguageSwitch()
 * @model
 * @generated
 */
public interface LanguageSwitch extends Switch {
	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link CPL.SwitchedLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see CPL.CPLPackage#getLanguageSwitch_Languages()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchedLanguage> getLanguages();

} // LanguageSwitch
