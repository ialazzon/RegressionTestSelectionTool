/**
 */
package BibTeX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authored Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BibTeX.AuthoredEntry#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @see BibTeX.BibTeXPackage#getAuthoredEntry()
 * @model abstract="true"
 * @generated
 */
public interface AuthoredEntry extends BibTeXEntry {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link BibTeX.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see BibTeX.BibTeXPackage#getAuthoredEntry_Authors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Author> getAuthors();

} // AuthoredEntry
