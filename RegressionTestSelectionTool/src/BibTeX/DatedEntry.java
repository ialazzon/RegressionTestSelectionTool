/**
 */
package BibTeX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dated Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BibTeX.DatedEntry#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see BibTeX.BibTeXPackage#getDatedEntry()
 * @model abstract="true"
 * @generated
 */
public interface DatedEntry extends BibTeXEntry {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see BibTeX.BibTeXPackage#getDatedEntry_Year()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link BibTeX.DatedEntry#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

} // DatedEntry
