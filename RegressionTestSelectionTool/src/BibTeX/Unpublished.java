/**
 */
package BibTeX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unpublished</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BibTeX.Unpublished#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see BibTeX.BibTeXPackage#getUnpublished()
 * @model
 * @generated
 */
public interface Unpublished extends AuthoredEntry, TitledEntry {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see BibTeX.BibTeXPackage#getUnpublished_Note()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link BibTeX.Unpublished#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

} // Unpublished
