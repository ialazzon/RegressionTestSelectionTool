/**
 */
package BibTeX;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BibTeX.BibTeXPackage
 * @generated
 */
public interface BibTeXFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BibTeXFactory eINSTANCE = BibTeX.impl.BibTeXFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	BibTeXFile createBibTeXFile();

	/**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
	Author createAuthor();

	/**
	 * Returns a new object of class '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Article</em>'.
	 * @generated
	 */
	Article createArticle();

	/**
	 * Returns a new object of class '<em>Tech Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tech Report</em>'.
	 * @generated
	 */
	TechReport createTechReport();

	/**
	 * Returns a new object of class '<em>Unpublished</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unpublished</em>'.
	 * @generated
	 */
	Unpublished createUnpublished();

	/**
	 * Returns a new object of class '<em>Manual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manual</em>'.
	 * @generated
	 */
	Manual createManual();

	/**
	 * Returns a new object of class '<em>Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proceedings</em>'.
	 * @generated
	 */
	Proceedings createProceedings();

	/**
	 * Returns a new object of class '<em>In Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Proceedings</em>'.
	 * @generated
	 */
	InProceedings createInProceedings();

	/**
	 * Returns a new object of class '<em>Booklet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booklet</em>'.
	 * @generated
	 */
	Booklet createBooklet();

	/**
	 * Returns a new object of class '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book</em>'.
	 * @generated
	 */
	Book createBook();

	/**
	 * Returns a new object of class '<em>In Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Collection</em>'.
	 * @generated
	 */
	InCollection createInCollection();

	/**
	 * Returns a new object of class '<em>In Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Book</em>'.
	 * @generated
	 */
	InBook createInBook();

	/**
	 * Returns a new object of class '<em>Misc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Misc</em>'.
	 * @generated
	 */
	Misc createMisc();

	/**
	 * Returns a new object of class '<em>Ph DThesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ph DThesis</em>'.
	 * @generated
	 */
	PhDThesis createPhDThesis();

	/**
	 * Returns a new object of class '<em>Master Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master Thesis</em>'.
	 * @generated
	 */
	MasterThesis createMasterThesis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BibTeXPackage getBibTeXPackage();

} //BibTeXFactory
