/**
 */
package BibTeX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BibTeX.BibTeXFactory
 * @model kind="package"
 * @generated
 */
public interface BibTeXPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BibTeX";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://BibTeX/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BibTeX";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BibTeXPackage eINSTANCE = BibTeX.impl.BibTeXPackageImpl.init();

	/**
	 * The meta object id for the '{@link BibTeX.impl.BibTeXFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.BibTeXFileImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getBibTeXFile()
	 * @generated
	 */
	int BIB_TE_XFILE = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIB_TE_XFILE__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIB_TE_XFILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIB_TE_XFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.AuthorImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__AUTHOR = 0;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.BibTeXEntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.BibTeXEntryImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getBibTeXEntry()
	 * @generated
	 */
	int BIB_TE_XENTRY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIB_TE_XENTRY__ID = 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIB_TE_XENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIB_TE_XENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.AuthoredEntryImpl <em>Authored Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.AuthoredEntryImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getAuthoredEntry()
	 * @generated
	 */
	int AUTHORED_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_ENTRY__ID = BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_ENTRY__AUTHORS = BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authored Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_ENTRY_FEATURE_COUNT = BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Authored Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_ENTRY_OPERATION_COUNT = BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.DatedEntryImpl <em>Dated Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.DatedEntryImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getDatedEntry()
	 * @generated
	 */
	int DATED_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_ENTRY__ID = BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_ENTRY__YEAR = BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dated Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_ENTRY_FEATURE_COUNT = BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dated Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_ENTRY_OPERATION_COUNT = BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.TitledEntryImpl <em>Titled Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.TitledEntryImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getTitledEntry()
	 * @generated
	 */
	int TITLED_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_ENTRY__ID = BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_ENTRY__TITLE = BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_ENTRY_FEATURE_COUNT = BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_ENTRY_OPERATION_COUNT = BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.BookTitledEntryImpl <em>Book Titled Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.BookTitledEntryImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getBookTitledEntry()
	 * @generated
	 */
	int BOOK_TITLED_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TITLED_ENTRY__ID = BIB_TE_XENTRY__ID;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TITLED_ENTRY__BOOKTITLE = BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Book Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TITLED_ENTRY_FEATURE_COUNT = BIB_TE_XENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Book Titled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TITLED_ENTRY_OPERATION_COUNT = BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.ArticleImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__ID = AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__AUTHORS = AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__YEAR = AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITLE = AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Journal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__JOURNAL = AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = AUTHORED_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.TechReportImpl <em>Tech Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.TechReportImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getTechReport()
	 * @generated
	 */
	int TECH_REPORT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_REPORT__ID = AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_REPORT__AUTHORS = AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_REPORT__YEAR = AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_REPORT__TITLE = AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tech Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_REPORT_FEATURE_COUNT = AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tech Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_REPORT_OPERATION_COUNT = AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.UnpublishedImpl <em>Unpublished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.UnpublishedImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getUnpublished()
	 * @generated
	 */
	int UNPUBLISHED = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__ID = AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__AUTHORS = AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__TITLE = AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__NOTE = AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED_FEATURE_COUNT = AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED_OPERATION_COUNT = AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.ManualImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ID = TITLED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__TITLE = TITLED_ENTRY__TITLE;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = TITLED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = TITLED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.ProceedingsImpl <em>Proceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.ProceedingsImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getProceedings()
	 * @generated
	 */
	int PROCEEDINGS = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__ID = DATED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__YEAR = DATED_ENTRY__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__TITLE = DATED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_FEATURE_COUNT = DATED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_OPERATION_COUNT = DATED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.InProceedingsImpl <em>In Proceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.InProceedingsImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getInProceedings()
	 * @generated
	 */
	int IN_PROCEEDINGS = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROCEEDINGS__ID = PROCEEDINGS__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROCEEDINGS__YEAR = PROCEEDINGS__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROCEEDINGS__TITLE = PROCEEDINGS__TITLE;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROCEEDINGS__AUTHORS = PROCEEDINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROCEEDINGS__BOOKTITLE = PROCEEDINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROCEEDINGS_FEATURE_COUNT = PROCEEDINGS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>In Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROCEEDINGS_OPERATION_COUNT = PROCEEDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.BookletImpl <em>Booklet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.BookletImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getBooklet()
	 * @generated
	 */
	int BOOKLET = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET__ID = DATED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET__YEAR = DATED_ENTRY__YEAR;

	/**
	 * The number of structural features of the '<em>Booklet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET_FEATURE_COUNT = DATED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Booklet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET_OPERATION_COUNT = DATED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.BookImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ID = AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHORS = AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__YEAR = AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PUBLISHER = AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = AUTHORED_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.InCollectionImpl <em>In Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.InCollectionImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getInCollection()
	 * @generated
	 */
	int IN_COLLECTION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION__ID = BOOK__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION__AUTHORS = BOOK__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION__YEAR = BOOK__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION__TITLE = BOOK__TITLE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION__PUBLISHER = BOOK__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION__BOOKTITLE = BOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION_FEATURE_COUNT = BOOK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_COLLECTION_OPERATION_COUNT = BOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.InBookImpl <em>In Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.InBookImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getInBook()
	 * @generated
	 */
	int IN_BOOK = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK__ID = BOOK__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK__AUTHORS = BOOK__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK__YEAR = BOOK__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK__TITLE = BOOK__TITLE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK__PUBLISHER = BOOK__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK__CHAPTER = BOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK_FEATURE_COUNT = BOOK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BOOK_OPERATION_COUNT = BOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.MiscImpl <em>Misc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.MiscImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getMisc()
	 * @generated
	 */
	int MISC = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC__ID = BIB_TE_XENTRY__ID;

	/**
	 * The number of structural features of the '<em>Misc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_FEATURE_COUNT = BIB_TE_XENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Misc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_OPERATION_COUNT = BIB_TE_XENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.ThesisEntryImpl <em>Thesis Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.ThesisEntryImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getThesisEntry()
	 * @generated
	 */
	int THESIS_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_ENTRY__ID = AUTHORED_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_ENTRY__AUTHORS = AUTHORED_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_ENTRY__YEAR = AUTHORED_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_ENTRY__TITLE = AUTHORED_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_ENTRY__SCHOOL = AUTHORED_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Thesis Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_ENTRY_FEATURE_COUNT = AUTHORED_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Thesis Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_ENTRY_OPERATION_COUNT = AUTHORED_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.PhDThesisImpl <em>Ph DThesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.PhDThesisImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getPhDThesis()
	 * @generated
	 */
	int PH_DTHESIS = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_DTHESIS__ID = THESIS_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_DTHESIS__AUTHORS = THESIS_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_DTHESIS__YEAR = THESIS_ENTRY__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_DTHESIS__TITLE = THESIS_ENTRY__TITLE;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_DTHESIS__SCHOOL = THESIS_ENTRY__SCHOOL;

	/**
	 * The number of structural features of the '<em>Ph DThesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_DTHESIS_FEATURE_COUNT = THESIS_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ph DThesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_DTHESIS_OPERATION_COUNT = THESIS_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BibTeX.impl.MasterThesisImpl <em>Master Thesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BibTeX.impl.MasterThesisImpl
	 * @see BibTeX.impl.BibTeXPackageImpl#getMasterThesis()
	 * @generated
	 */
	int MASTER_THESIS = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_THESIS__ID = THESIS_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_THESIS__AUTHORS = THESIS_ENTRY__AUTHORS;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_THESIS__YEAR = THESIS_ENTRY__YEAR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_THESIS__TITLE = THESIS_ENTRY__TITLE;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_THESIS__SCHOOL = THESIS_ENTRY__SCHOOL;

	/**
	 * The number of structural features of the '<em>Master Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_THESIS_FEATURE_COUNT = THESIS_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Master Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_THESIS_OPERATION_COUNT = THESIS_ENTRY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link BibTeX.BibTeXFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see BibTeX.BibTeXFile
	 * @generated
	 */
	EClass getBibTeXFile();

	/**
	 * Returns the meta object for the containment reference list '{@link BibTeX.BibTeXFile#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see BibTeX.BibTeXFile#getEntries()
	 * @see #getBibTeXFile()
	 * @generated
	 */
	EReference getBibTeXFile_Entries();

	/**
	 * Returns the meta object for class '{@link BibTeX.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see BibTeX.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.Author#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see BibTeX.Author#getAuthor()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Author();

	/**
	 * Returns the meta object for class '{@link BibTeX.BibTeXEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see BibTeX.BibTeXEntry
	 * @generated
	 */
	EClass getBibTeXEntry();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.BibTeXEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BibTeX.BibTeXEntry#getId()
	 * @see #getBibTeXEntry()
	 * @generated
	 */
	EAttribute getBibTeXEntry_Id();

	/**
	 * Returns the meta object for class '{@link BibTeX.AuthoredEntry <em>Authored Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authored Entry</em>'.
	 * @see BibTeX.AuthoredEntry
	 * @generated
	 */
	EClass getAuthoredEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link BibTeX.AuthoredEntry#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see BibTeX.AuthoredEntry#getAuthors()
	 * @see #getAuthoredEntry()
	 * @generated
	 */
	EReference getAuthoredEntry_Authors();

	/**
	 * Returns the meta object for class '{@link BibTeX.DatedEntry <em>Dated Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dated Entry</em>'.
	 * @see BibTeX.DatedEntry
	 * @generated
	 */
	EClass getDatedEntry();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.DatedEntry#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see BibTeX.DatedEntry#getYear()
	 * @see #getDatedEntry()
	 * @generated
	 */
	EAttribute getDatedEntry_Year();

	/**
	 * Returns the meta object for class '{@link BibTeX.TitledEntry <em>Titled Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titled Entry</em>'.
	 * @see BibTeX.TitledEntry
	 * @generated
	 */
	EClass getTitledEntry();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.TitledEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see BibTeX.TitledEntry#getTitle()
	 * @see #getTitledEntry()
	 * @generated
	 */
	EAttribute getTitledEntry_Title();

	/**
	 * Returns the meta object for class '{@link BibTeX.BookTitledEntry <em>Book Titled Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Titled Entry</em>'.
	 * @see BibTeX.BookTitledEntry
	 * @generated
	 */
	EClass getBookTitledEntry();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.BookTitledEntry#getBooktitle <em>Booktitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booktitle</em>'.
	 * @see BibTeX.BookTitledEntry#getBooktitle()
	 * @see #getBookTitledEntry()
	 * @generated
	 */
	EAttribute getBookTitledEntry_Booktitle();

	/**
	 * Returns the meta object for class '{@link BibTeX.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see BibTeX.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.Article#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal</em>'.
	 * @see BibTeX.Article#getJournal()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Journal();

	/**
	 * Returns the meta object for class '{@link BibTeX.TechReport <em>Tech Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Report</em>'.
	 * @see BibTeX.TechReport
	 * @generated
	 */
	EClass getTechReport();

	/**
	 * Returns the meta object for class '{@link BibTeX.Unpublished <em>Unpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unpublished</em>'.
	 * @see BibTeX.Unpublished
	 * @generated
	 */
	EClass getUnpublished();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.Unpublished#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see BibTeX.Unpublished#getNote()
	 * @see #getUnpublished()
	 * @generated
	 */
	EAttribute getUnpublished_Note();

	/**
	 * Returns the meta object for class '{@link BibTeX.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see BibTeX.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for class '{@link BibTeX.Proceedings <em>Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceedings</em>'.
	 * @see BibTeX.Proceedings
	 * @generated
	 */
	EClass getProceedings();

	/**
	 * Returns the meta object for class '{@link BibTeX.InProceedings <em>In Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Proceedings</em>'.
	 * @see BibTeX.InProceedings
	 * @generated
	 */
	EClass getInProceedings();

	/**
	 * Returns the meta object for class '{@link BibTeX.Booklet <em>Booklet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booklet</em>'.
	 * @see BibTeX.Booklet
	 * @generated
	 */
	EClass getBooklet();

	/**
	 * Returns the meta object for class '{@link BibTeX.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see BibTeX.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.Book#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see BibTeX.Book#getPublisher()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Publisher();

	/**
	 * Returns the meta object for class '{@link BibTeX.InCollection <em>In Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Collection</em>'.
	 * @see BibTeX.InCollection
	 * @generated
	 */
	EClass getInCollection();

	/**
	 * Returns the meta object for class '{@link BibTeX.InBook <em>In Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Book</em>'.
	 * @see BibTeX.InBook
	 * @generated
	 */
	EClass getInBook();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.InBook#getChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chapter</em>'.
	 * @see BibTeX.InBook#getChapter()
	 * @see #getInBook()
	 * @generated
	 */
	EAttribute getInBook_Chapter();

	/**
	 * Returns the meta object for class '{@link BibTeX.Misc <em>Misc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Misc</em>'.
	 * @see BibTeX.Misc
	 * @generated
	 */
	EClass getMisc();

	/**
	 * Returns the meta object for class '{@link BibTeX.ThesisEntry <em>Thesis Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis Entry</em>'.
	 * @see BibTeX.ThesisEntry
	 * @generated
	 */
	EClass getThesisEntry();

	/**
	 * Returns the meta object for the attribute '{@link BibTeX.ThesisEntry#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School</em>'.
	 * @see BibTeX.ThesisEntry#getSchool()
	 * @see #getThesisEntry()
	 * @generated
	 */
	EAttribute getThesisEntry_School();

	/**
	 * Returns the meta object for class '{@link BibTeX.PhDThesis <em>Ph DThesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ph DThesis</em>'.
	 * @see BibTeX.PhDThesis
	 * @generated
	 */
	EClass getPhDThesis();

	/**
	 * Returns the meta object for class '{@link BibTeX.MasterThesis <em>Master Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Thesis</em>'.
	 * @see BibTeX.MasterThesis
	 * @generated
	 */
	EClass getMasterThesis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BibTeXFactory getBibTeXFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BibTeX.impl.BibTeXFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.BibTeXFileImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getBibTeXFile()
		 * @generated
		 */
		EClass BIB_TE_XFILE = eINSTANCE.getBibTeXFile();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIB_TE_XFILE__ENTRIES = eINSTANCE.getBibTeXFile_Entries();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.AuthorImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__AUTHOR = eINSTANCE.getAuthor_Author();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.BibTeXEntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.BibTeXEntryImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getBibTeXEntry()
		 * @generated
		 */
		EClass BIB_TE_XENTRY = eINSTANCE.getBibTeXEntry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIB_TE_XENTRY__ID = eINSTANCE.getBibTeXEntry_Id();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.AuthoredEntryImpl <em>Authored Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.AuthoredEntryImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getAuthoredEntry()
		 * @generated
		 */
		EClass AUTHORED_ENTRY = eINSTANCE.getAuthoredEntry();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORED_ENTRY__AUTHORS = eINSTANCE.getAuthoredEntry_Authors();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.DatedEntryImpl <em>Dated Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.DatedEntryImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getDatedEntry()
		 * @generated
		 */
		EClass DATED_ENTRY = eINSTANCE.getDatedEntry();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATED_ENTRY__YEAR = eINSTANCE.getDatedEntry_Year();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.TitledEntryImpl <em>Titled Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.TitledEntryImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getTitledEntry()
		 * @generated
		 */
		EClass TITLED_ENTRY = eINSTANCE.getTitledEntry();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLED_ENTRY__TITLE = eINSTANCE.getTitledEntry_Title();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.BookTitledEntryImpl <em>Book Titled Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.BookTitledEntryImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getBookTitledEntry()
		 * @generated
		 */
		EClass BOOK_TITLED_ENTRY = eINSTANCE.getBookTitledEntry();

		/**
		 * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TITLED_ENTRY__BOOKTITLE = eINSTANCE.getBookTitledEntry_Booktitle();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.ArticleImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Journal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__JOURNAL = eINSTANCE.getArticle_Journal();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.TechReportImpl <em>Tech Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.TechReportImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getTechReport()
		 * @generated
		 */
		EClass TECH_REPORT = eINSTANCE.getTechReport();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.UnpublishedImpl <em>Unpublished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.UnpublishedImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getUnpublished()
		 * @generated
		 */
		EClass UNPUBLISHED = eINSTANCE.getUnpublished();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPUBLISHED__NOTE = eINSTANCE.getUnpublished_Note();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.ManualImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.ProceedingsImpl <em>Proceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.ProceedingsImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getProceedings()
		 * @generated
		 */
		EClass PROCEEDINGS = eINSTANCE.getProceedings();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.InProceedingsImpl <em>In Proceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.InProceedingsImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getInProceedings()
		 * @generated
		 */
		EClass IN_PROCEEDINGS = eINSTANCE.getInProceedings();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.BookletImpl <em>Booklet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.BookletImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getBooklet()
		 * @generated
		 */
		EClass BOOKLET = eINSTANCE.getBooklet();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.BookImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__PUBLISHER = eINSTANCE.getBook_Publisher();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.InCollectionImpl <em>In Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.InCollectionImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getInCollection()
		 * @generated
		 */
		EClass IN_COLLECTION = eINSTANCE.getInCollection();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.InBookImpl <em>In Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.InBookImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getInBook()
		 * @generated
		 */
		EClass IN_BOOK = eINSTANCE.getInBook();

		/**
		 * The meta object literal for the '<em><b>Chapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_BOOK__CHAPTER = eINSTANCE.getInBook_Chapter();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.MiscImpl <em>Misc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.MiscImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getMisc()
		 * @generated
		 */
		EClass MISC = eINSTANCE.getMisc();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.ThesisEntryImpl <em>Thesis Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.ThesisEntryImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getThesisEntry()
		 * @generated
		 */
		EClass THESIS_ENTRY = eINSTANCE.getThesisEntry();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS_ENTRY__SCHOOL = eINSTANCE.getThesisEntry_School();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.PhDThesisImpl <em>Ph DThesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.PhDThesisImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getPhDThesis()
		 * @generated
		 */
		EClass PH_DTHESIS = eINSTANCE.getPhDThesis();

		/**
		 * The meta object literal for the '{@link BibTeX.impl.MasterThesisImpl <em>Master Thesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BibTeX.impl.MasterThesisImpl
		 * @see BibTeX.impl.BibTeXPackageImpl#getMasterThesis()
		 * @generated
		 */
		EClass MASTER_THESIS = eINSTANCE.getMasterThesis();

	}

} //BibTeXPackage
