/**
 */
package BibTeX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BibTeX.BibTeXFile#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see BibTeX.BibTeXPackage#getBibTeXFile()
 * @model
 * @generated
 */
public interface BibTeXFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link BibTeX.BibTeXEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see BibTeX.BibTeXPackage#getBibTeXFile_Entries()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BibTeXEntry> getEntries();

} // BibTeXFile
