/**
 */
package CPL2.impl;

import CPL.CPL;
import CPL.CPLPackage;
import CPL.Incoming;
import CPL.Outgoing;
import CPL.SubAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.CPLImpl#getSubActions <em>Sub Actions</em>}</li>
 *   <li>{@link CPL2.impl.CPLImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link CPL2.impl.CPLImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPLImpl extends ElementImpl implements CPL {
	/**
	 * The cached value of the '{@link #getSubActions() <em>Sub Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SubAction> subActions;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected Outgoing outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected Incoming incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.CPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubAction> getSubActions() {
		if (subActions == null) {
			subActions = new EObjectContainmentEList<SubAction>(SubAction.class, this, CPLPackage.CPL__SUB_ACTIONS);
		}
		return subActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outgoing getOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoing(Outgoing newOutgoing, NotificationChain msgs) {
		Outgoing oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.CPL__OUTGOING, oldOutgoing, newOutgoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(Outgoing newOutgoing) {
		if (newOutgoing != outgoing) {
			NotificationChain msgs = null;
			if (outgoing != null)
				msgs = ((InternalEObject)outgoing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.CPL__OUTGOING, null, msgs);
			if (newOutgoing != null)
				msgs = ((InternalEObject)newOutgoing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.CPL__OUTGOING, null, msgs);
			msgs = basicSetOutgoing(newOutgoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.CPL__OUTGOING, newOutgoing, newOutgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incoming getIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(Incoming newIncoming, NotificationChain msgs) {
		Incoming oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.CPL__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(Incoming newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.CPL__INCOMING, null, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.CPL__INCOMING, null, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.CPL__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPLPackage.CPL__SUB_ACTIONS:
				return ((InternalEList<?>)getSubActions()).basicRemove(otherEnd, msgs);
			case CPLPackage.CPL__OUTGOING:
				return basicSetOutgoing(null, msgs);
			case CPLPackage.CPL__INCOMING:
				return basicSetIncoming(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPLPackage.CPL__SUB_ACTIONS:
				return getSubActions();
			case CPLPackage.CPL__OUTGOING:
				return getOutgoing();
			case CPLPackage.CPL__INCOMING:
				return getIncoming();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CPLPackage.CPL__SUB_ACTIONS:
				getSubActions().clear();
				getSubActions().addAll((Collection<? extends SubAction>)newValue);
				return;
			case CPLPackage.CPL__OUTGOING:
				setOutgoing((Outgoing)newValue);
				return;
			case CPLPackage.CPL__INCOMING:
				setIncoming((Incoming)newValue);
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
			case CPLPackage.CPL__SUB_ACTIONS:
				getSubActions().clear();
				return;
			case CPLPackage.CPL__OUTGOING:
				setOutgoing((Outgoing)null);
				return;
			case CPLPackage.CPL__INCOMING:
				setIncoming((Incoming)null);
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
			case CPLPackage.CPL__SUB_ACTIONS:
				return subActions != null && !subActions.isEmpty();
			case CPLPackage.CPL__OUTGOING:
				return outgoing != null;
			case CPLPackage.CPL__INCOMING:
				return incoming != null;
		}
		return super.eIsSet(featureID);
	}

} //CPLImpl
