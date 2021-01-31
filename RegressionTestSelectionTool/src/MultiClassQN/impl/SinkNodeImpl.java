/**
 */
package MultiClassQN.impl;

import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.SinkNode;
import MultiClassQN.Workload;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sink Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.SinkNodeImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SinkNodeImpl extends NodeImpl implements SinkNode {
	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected Workload workload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.SINK_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload getWorkload() {
		if (workload != null && workload.eIsProxy()) {
			InternalEObject oldWorkload = (InternalEObject)workload;
			workload = (Workload)eResolveProxy(oldWorkload);
			if (workload != oldWorkload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiClassQNPackage.SINK_NODE__WORKLOAD, oldWorkload, workload));
			}
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload basicGetWorkload() {
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkload(Workload newWorkload) {
		Workload oldWorkload = workload;
		workload = newWorkload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SINK_NODE__WORKLOAD, oldWorkload, workload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultiClassQNPackage.SINK_NODE__WORKLOAD:
				if (resolve) return getWorkload();
				return basicGetWorkload();
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
			case MultiClassQNPackage.SINK_NODE__WORKLOAD:
				setWorkload((Workload)newValue);
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
			case MultiClassQNPackage.SINK_NODE__WORKLOAD:
				setWorkload((Workload)null);
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
			case MultiClassQNPackage.SINK_NODE__WORKLOAD:
				return workload != null;
		}
		return super.eIsSet(featureID);
	}

} //SinkNodeImpl
