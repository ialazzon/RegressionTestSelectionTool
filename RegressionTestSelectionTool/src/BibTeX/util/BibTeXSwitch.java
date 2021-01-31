/**
 */
package BibTeX.util;

import BibTeX.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BibTeX.BibTeXPackage
 * @generated
 */
public class BibTeXSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BibTeXPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibTeXSwitch() {
		if (modelPackage == null) {
			modelPackage = BibTeXPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BibTeXPackage.BIB_TE_XFILE: {
				BibTeXFile bibTeXFile = (BibTeXFile)theEObject;
				T result = caseBibTeXFile(bibTeXFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.AUTHOR: {
				Author author = (Author)theEObject;
				T result = caseAuthor(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.BIB_TE_XENTRY: {
				BibTeXEntry bibTeXEntry = (BibTeXEntry)theEObject;
				T result = caseBibTeXEntry(bibTeXEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.AUTHORED_ENTRY: {
				AuthoredEntry authoredEntry = (AuthoredEntry)theEObject;
				T result = caseAuthoredEntry(authoredEntry);
				if (result == null) result = caseBibTeXEntry(authoredEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.DATED_ENTRY: {
				DatedEntry datedEntry = (DatedEntry)theEObject;
				T result = caseDatedEntry(datedEntry);
				if (result == null) result = caseBibTeXEntry(datedEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.TITLED_ENTRY: {
				TitledEntry titledEntry = (TitledEntry)theEObject;
				T result = caseTitledEntry(titledEntry);
				if (result == null) result = caseBibTeXEntry(titledEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.BOOK_TITLED_ENTRY: {
				BookTitledEntry bookTitledEntry = (BookTitledEntry)theEObject;
				T result = caseBookTitledEntry(bookTitledEntry);
				if (result == null) result = caseBibTeXEntry(bookTitledEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.ARTICLE: {
				Article article = (Article)theEObject;
				T result = caseArticle(article);
				if (result == null) result = caseAuthoredEntry(article);
				if (result == null) result = caseDatedEntry(article);
				if (result == null) result = caseTitledEntry(article);
				if (result == null) result = caseBibTeXEntry(article);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.TECH_REPORT: {
				TechReport techReport = (TechReport)theEObject;
				T result = caseTechReport(techReport);
				if (result == null) result = caseAuthoredEntry(techReport);
				if (result == null) result = caseDatedEntry(techReport);
				if (result == null) result = caseTitledEntry(techReport);
				if (result == null) result = caseBibTeXEntry(techReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.UNPUBLISHED: {
				Unpublished unpublished = (Unpublished)theEObject;
				T result = caseUnpublished(unpublished);
				if (result == null) result = caseAuthoredEntry(unpublished);
				if (result == null) result = caseTitledEntry(unpublished);
				if (result == null) result = caseBibTeXEntry(unpublished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.MANUAL: {
				Manual manual = (Manual)theEObject;
				T result = caseManual(manual);
				if (result == null) result = caseTitledEntry(manual);
				if (result == null) result = caseBibTeXEntry(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.PROCEEDINGS: {
				Proceedings proceedings = (Proceedings)theEObject;
				T result = caseProceedings(proceedings);
				if (result == null) result = caseDatedEntry(proceedings);
				if (result == null) result = caseTitledEntry(proceedings);
				if (result == null) result = caseBibTeXEntry(proceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.IN_PROCEEDINGS: {
				InProceedings inProceedings = (InProceedings)theEObject;
				T result = caseInProceedings(inProceedings);
				if (result == null) result = caseProceedings(inProceedings);
				if (result == null) result = caseAuthoredEntry(inProceedings);
				if (result == null) result = caseBookTitledEntry(inProceedings);
				if (result == null) result = caseDatedEntry(inProceedings);
				if (result == null) result = caseTitledEntry(inProceedings);
				if (result == null) result = caseBibTeXEntry(inProceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.BOOKLET: {
				Booklet booklet = (Booklet)theEObject;
				T result = caseBooklet(booklet);
				if (result == null) result = caseDatedEntry(booklet);
				if (result == null) result = caseBibTeXEntry(booklet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.BOOK: {
				Book book = (Book)theEObject;
				T result = caseBook(book);
				if (result == null) result = caseAuthoredEntry(book);
				if (result == null) result = caseDatedEntry(book);
				if (result == null) result = caseTitledEntry(book);
				if (result == null) result = caseBibTeXEntry(book);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.IN_COLLECTION: {
				InCollection inCollection = (InCollection)theEObject;
				T result = caseInCollection(inCollection);
				if (result == null) result = caseBook(inCollection);
				if (result == null) result = caseBookTitledEntry(inCollection);
				if (result == null) result = caseAuthoredEntry(inCollection);
				if (result == null) result = caseDatedEntry(inCollection);
				if (result == null) result = caseTitledEntry(inCollection);
				if (result == null) result = caseBibTeXEntry(inCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.IN_BOOK: {
				InBook inBook = (InBook)theEObject;
				T result = caseInBook(inBook);
				if (result == null) result = caseBook(inBook);
				if (result == null) result = caseAuthoredEntry(inBook);
				if (result == null) result = caseDatedEntry(inBook);
				if (result == null) result = caseTitledEntry(inBook);
				if (result == null) result = caseBibTeXEntry(inBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.MISC: {
				Misc misc = (Misc)theEObject;
				T result = caseMisc(misc);
				if (result == null) result = caseBibTeXEntry(misc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.THESIS_ENTRY: {
				ThesisEntry thesisEntry = (ThesisEntry)theEObject;
				T result = caseThesisEntry(thesisEntry);
				if (result == null) result = caseAuthoredEntry(thesisEntry);
				if (result == null) result = caseDatedEntry(thesisEntry);
				if (result == null) result = caseTitledEntry(thesisEntry);
				if (result == null) result = caseBibTeXEntry(thesisEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.PH_DTHESIS: {
				PhDThesis phDThesis = (PhDThesis)theEObject;
				T result = casePhDThesis(phDThesis);
				if (result == null) result = caseThesisEntry(phDThesis);
				if (result == null) result = caseAuthoredEntry(phDThesis);
				if (result == null) result = caseDatedEntry(phDThesis);
				if (result == null) result = caseTitledEntry(phDThesis);
				if (result == null) result = caseBibTeXEntry(phDThesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BibTeXPackage.MASTER_THESIS: {
				MasterThesis masterThesis = (MasterThesis)theEObject;
				T result = caseMasterThesis(masterThesis);
				if (result == null) result = caseThesisEntry(masterThesis);
				if (result == null) result = caseAuthoredEntry(masterThesis);
				if (result == null) result = caseDatedEntry(masterThesis);
				if (result == null) result = caseTitledEntry(masterThesis);
				if (result == null) result = caseBibTeXEntry(masterThesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibTeXFile(BibTeXFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibTeXEntry(BibTeXEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authored Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authored Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthoredEntry(AuthoredEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dated Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dated Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatedEntry(DatedEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titled Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titled Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitledEntry(TitledEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Titled Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Titled Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookTitledEntry(BookTitledEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticle(Article object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tech Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tech Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechReport(TechReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpublished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpublished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnpublished(Unpublished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManual(Manual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceedings(Proceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Proceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInProceedings(InProceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booklet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booklet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooklet(Booklet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBook(Book object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInCollection(InCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInBook(InBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Misc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Misc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMisc(Misc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thesis Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thesis Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThesisEntry(ThesisEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ph DThesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ph DThesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhDThesis(PhDThesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Thesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterThesis(MasterThesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BibTeXSwitch
