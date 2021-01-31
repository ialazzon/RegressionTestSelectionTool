/**
 */
package BibTeX.impl;

import BibTeX.Article;
import BibTeX.BibTeXPackage;
import BibTeX.DatedEntry;
import BibTeX.TitledEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BibTeX.impl.ArticleImpl#getYear <em>Year</em>}</li>
 *   <li>{@link BibTeX.impl.ArticleImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link BibTeX.impl.ArticleImpl#getJournal <em>Journal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleImpl extends AuthoredEntryImpl implements Article {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJournal() <em>Journal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournal()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJournal() <em>Journal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournal()
	 * @generated
	 * @ordered
	 */
	protected String journal = JOURNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BibTeXPackage.Literals.ARTICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJournal() {
		return journal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJournal(String newJournal) {
		String oldJournal = journal;
		journal = newJournal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__JOURNAL, oldJournal, journal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BibTeXPackage.ARTICLE__YEAR:
				return getYear();
			case BibTeXPackage.ARTICLE__TITLE:
				return getTitle();
			case BibTeXPackage.ARTICLE__JOURNAL:
				return getJournal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BibTeXPackage.ARTICLE__YEAR:
				setYear((String)newValue);
				return;
			case BibTeXPackage.ARTICLE__TITLE:
				setTitle((String)newValue);
				return;
			case BibTeXPackage.ARTICLE__JOURNAL:
				setJournal((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BibTeXPackage.ARTICLE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case BibTeXPackage.ARTICLE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case BibTeXPackage.ARTICLE__JOURNAL:
				setJournal(JOURNAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BibTeXPackage.ARTICLE__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case BibTeXPackage.ARTICLE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case BibTeXPackage.ARTICLE__JOURNAL:
				return JOURNAL_EDEFAULT == null ? journal != null : !JOURNAL_EDEFAULT.equals(journal);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DatedEntry.class) {
			switch (derivedFeatureID) {
				case BibTeXPackage.ARTICLE__YEAR: return BibTeXPackage.DATED_ENTRY__YEAR;
				default: return -1;
			}
		}
		if (baseClass == TitledEntry.class) {
			switch (derivedFeatureID) {
				case BibTeXPackage.ARTICLE__TITLE: return BibTeXPackage.TITLED_ENTRY__TITLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DatedEntry.class) {
			switch (baseFeatureID) {
				case BibTeXPackage.DATED_ENTRY__YEAR: return BibTeXPackage.ARTICLE__YEAR;
				default: return -1;
			}
		}
		if (baseClass == TitledEntry.class) {
			switch (baseFeatureID) {
				case BibTeXPackage.TITLED_ENTRY__TITLE: return BibTeXPackage.ARTICLE__TITLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(", title: ");
		result.append(title);
		result.append(", journal: ");
		result.append(journal);
		result.append(')');
		return result.toString();
	}

} //ArticleImpl
