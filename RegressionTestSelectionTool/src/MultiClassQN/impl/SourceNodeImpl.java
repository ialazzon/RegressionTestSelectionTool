/**
 */
package MultiClassQN.impl;

import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.ProbabilityDistribution;
import MultiClassQN.SourceNode;
import MultiClassQN.Workload;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.SourceNodeImpl#getArrivalDistribution <em>Arrival Distribution</em>}</li>
 *   <li>{@link MultiClassQN.impl.SourceNodeImpl#getArrivalParams <em>Arrival Params</em>}</li>
 *   <li>{@link MultiClassQN.impl.SourceNodeImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceNodeImpl extends NodeImpl implements SourceNode {
	/**
	 * The default value of the '{@link #getArrivalDistribution() <em>Arrival Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final ProbabilityDistribution ARRIVAL_DISTRIBUTION_EDEFAULT = ProbabilityDistribution.EXPONENTIAL;

	/**
	 * The cached value of the '{@link #getArrivalDistribution() <em>Arrival Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDistribution()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistribution arrivalDistribution = ARRIVAL_DISTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrivalParams() <em>Arrival Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> arrivalParams;

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
	protected SourceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.SOURCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistribution getArrivalDistribution() {
		return arrivalDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalDistribution(ProbabilityDistribution newArrivalDistribution) {
		ProbabilityDistribution oldArrivalDistribution = arrivalDistribution;
		arrivalDistribution = newArrivalDistribution == null ? ARRIVAL_DISTRIBUTION_EDEFAULT : newArrivalDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SOURCE_NODE__ARRIVAL_DISTRIBUTION, oldArrivalDistribution, arrivalDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getArrivalParams() {
		if (arrivalParams == null) {
			arrivalParams = new EDataTypeUniqueEList<Double>(Double.class, this, MultiClassQNPackage.SOURCE_NODE__ARRIVAL_PARAMS);
		}
		return arrivalParams;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiClassQNPackage.SOURCE_NODE__WORKLOAD, oldWorkload, workload));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SOURCE_NODE__WORKLOAD, oldWorkload, workload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_DISTRIBUTION:
				return getArrivalDistribution();
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_PARAMS:
				return getArrivalParams();
			case MultiClassQNPackage.SOURCE_NODE__WORKLOAD:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_DISTRIBUTION:
				setArrivalDistribution((ProbabilityDistribution)newValue);
				return;
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_PARAMS:
				getArrivalParams().clear();
				getArrivalParams().addAll((Collection<? extends Double>)newValue);
				return;
			case MultiClassQNPackage.SOURCE_NODE__WORKLOAD:
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
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_DISTRIBUTION:
				setArrivalDistribution(ARRIVAL_DISTRIBUTION_EDEFAULT);
				return;
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_PARAMS:
				getArrivalParams().clear();
				return;
			case MultiClassQNPackage.SOURCE_NODE__WORKLOAD:
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
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_DISTRIBUTION:
				return arrivalDistribution != ARRIVAL_DISTRIBUTION_EDEFAULT;
			case MultiClassQNPackage.SOURCE_NODE__ARRIVAL_PARAMS:
				return arrivalParams != null && !arrivalParams.isEmpty();
			case MultiClassQNPackage.SOURCE_NODE__WORKLOAD:
				return workload != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (arrivalDistribution: ");
		result.append(arrivalDistribution);
		result.append(", arrivalParams: ");
		result.append(arrivalParams);
		result.append(')');
		return result.toString();
	}

} //SourceNodeImpl
