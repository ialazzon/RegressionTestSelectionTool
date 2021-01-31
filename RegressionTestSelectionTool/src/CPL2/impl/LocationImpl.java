/**
 */
package CPL2.impl;

import CPL.CPLPackage;
import CPL.Location;
import CPL.Node;
import CPL.NodeContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.LocationImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link CPL2.impl.LocationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link CPL2.impl.LocationImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link CPL2.impl.LocationImpl#getClear <em>Clear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends NodeImpl implements Location {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected Node contents;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClear() <em>Clear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClear()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClear() <em>Clear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClear()
	 * @generated
	 * @ordered
	 */
	protected String clear = CLEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getContents() {
		if (contents != null && contents.eIsProxy()) {
			InternalEObject oldContents = (InternalEObject)contents;
			contents = (Node)eResolveProxy(oldContents);
			if (contents != oldContents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPLPackage.LOCATION__CONTENTS, oldContents, contents));
			}
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContents(Node newContents) {
		Node oldContents = contents;
		contents = newContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.LOCATION__CONTENTS, oldContents, contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.LOCATION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.LOCATION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClear() {
		return clear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClear(String newClear) {
		String oldClear = clear;
		clear = newClear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.LOCATION__CLEAR, oldClear, clear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPLPackage.LOCATION__CONTENTS:
				if (resolve) return getContents();
				return basicGetContents();
			case CPLPackage.LOCATION__URL:
				return getUrl();
			case CPLPackage.LOCATION__PRIORITY:
				return getPriority();
			case CPLPackage.LOCATION__CLEAR:
				return getClear();
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
			case CPLPackage.LOCATION__CONTENTS:
				setContents((Node)newValue);
				return;
			case CPLPackage.LOCATION__URL:
				setUrl((String)newValue);
				return;
			case CPLPackage.LOCATION__PRIORITY:
				setPriority((String)newValue);
				return;
			case CPLPackage.LOCATION__CLEAR:
				setClear((String)newValue);
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
			case CPLPackage.LOCATION__CONTENTS:
				setContents((Node)null);
				return;
			case CPLPackage.LOCATION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case CPLPackage.LOCATION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CPLPackage.LOCATION__CLEAR:
				setClear(CLEAR_EDEFAULT);
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
			case CPLPackage.LOCATION__CONTENTS:
				return contents != null;
			case CPLPackage.LOCATION__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case CPLPackage.LOCATION__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CPLPackage.LOCATION__CLEAR:
				return CLEAR_EDEFAULT == null ? clear != null : !CLEAR_EDEFAULT.equals(clear);
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
		if (baseClass == NodeContainer.class) {
			switch (derivedFeatureID) {
				case CPLPackage.LOCATION__CONTENTS: return CPLPackage.NODE_CONTAINER__CONTENTS;
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
		if (baseClass == NodeContainer.class) {
			switch (baseFeatureID) {
				case CPLPackage.NODE_CONTAINER__CONTENTS: return CPLPackage.LOCATION__CONTENTS;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", priority: ");
		result.append(priority);
		result.append(", clear: ");
		result.append(clear);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
