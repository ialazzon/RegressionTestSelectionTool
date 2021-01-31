/**
 */
package BibTeX.impl;

import BibTeX.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibTeXFactoryImpl extends EFactoryImpl implements BibTeXFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BibTeXFactory init() {
		try {
			BibTeXFactory theBibTeXFactory = (BibTeXFactory)EPackage.Registry.INSTANCE.getEFactory(BibTeXPackage.eNS_URI);
			if (theBibTeXFactory != null) {
				return theBibTeXFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BibTeXFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibTeXFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BibTeXPackage.BIB_TE_XFILE: return createBibTeXFile();
			case BibTeXPackage.AUTHOR: return createAuthor();
			case BibTeXPackage.ARTICLE: return createArticle();
			case BibTeXPackage.TECH_REPORT: return createTechReport();
			case BibTeXPackage.UNPUBLISHED: return createUnpublished();
			case BibTeXPackage.MANUAL: return createManual();
			case BibTeXPackage.PROCEEDINGS: return createProceedings();
			case BibTeXPackage.IN_PROCEEDINGS: return createInProceedings();
			case BibTeXPackage.BOOKLET: return createBooklet();
			case BibTeXPackage.BOOK: return createBook();
			case BibTeXPackage.IN_COLLECTION: return createInCollection();
			case BibTeXPackage.IN_BOOK: return createInBook();
			case BibTeXPackage.MISC: return createMisc();
			case BibTeXPackage.PH_DTHESIS: return createPhDThesis();
			case BibTeXPackage.MASTER_THESIS: return createMasterThesis();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibTeXFile createBibTeXFile() {
		BibTeXFileImpl bibTeXFile = new BibTeXFileImpl();
		return bibTeXFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechReport createTechReport() {
		TechReportImpl techReport = new TechReportImpl();
		return techReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unpublished createUnpublished() {
		UnpublishedImpl unpublished = new UnpublishedImpl();
		return unpublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manual createManual() {
		ManualImpl manual = new ManualImpl();
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proceedings createProceedings() {
		ProceedingsImpl proceedings = new ProceedingsImpl();
		return proceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InProceedings createInProceedings() {
		InProceedingsImpl inProceedings = new InProceedingsImpl();
		return inProceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booklet createBooklet() {
		BookletImpl booklet = new BookletImpl();
		return booklet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InCollection createInCollection() {
		InCollectionImpl inCollection = new InCollectionImpl();
		return inCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InBook createInBook() {
		InBookImpl inBook = new InBookImpl();
		return inBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Misc createMisc() {
		MiscImpl misc = new MiscImpl();
		return misc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhDThesis createPhDThesis() {
		PhDThesisImpl phDThesis = new PhDThesisImpl();
		return phDThesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterThesis createMasterThesis() {
		MasterThesisImpl masterThesis = new MasterThesisImpl();
		return masterThesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibTeXPackage getBibTeXPackage() {
		return (BibTeXPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BibTeXPackage getPackage() {
		return BibTeXPackage.eINSTANCE;
	}

} //BibTeXFactoryImpl
