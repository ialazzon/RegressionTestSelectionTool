/**
 */
package CPL2.impl;

import CPL.Busy;
import CPL.CPLPackage;
import CPL.Default;
import CPL.Failure;
import CPL.NoAnswer;
import CPL.Proxy;
import CPL.Redirection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CPL2.impl.ProxyImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link CPL2.impl.ProxyImpl#getRecurse <em>Recurse</em>}</li>
 *   <li>{@link CPL2.impl.ProxyImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link CPL2.impl.ProxyImpl#getBusy <em>Busy</em>}</li>
 *   <li>{@link CPL2.impl.ProxyImpl#getNoAnswer <em>No Answer</em>}</li>
 *   <li>{@link CPL2.impl.ProxyImpl#getRedirection <em>Redirection</em>}</li>
 *   <li>{@link CPL2.impl.ProxyImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link CPL2.impl.ProxyImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProxyImpl extends SignallingActionImpl implements Proxy {
	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurse() <em>Recurse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurse()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurse() <em>Recurse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurse()
	 * @generated
	 * @ordered
	 */
	protected String recurse = RECURSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected String ordering = ORDERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusy() <em>Busy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusy()
	 * @generated
	 * @ordered
	 */
	protected Busy busy;

	/**
	 * The cached value of the '{@link #getNoAnswer() <em>No Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoAnswer()
	 * @generated
	 * @ordered
	 */
	protected NoAnswer noAnswer;

	/**
	 * The cached value of the '{@link #getRedirection() <em>Redirection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirection()
	 * @generated
	 * @ordered
	 */
	protected Redirection redirection;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected Failure failure;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Default default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPLPackage.Literals.PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecurse() {
		return recurse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurse(String newRecurse) {
		String oldRecurse = recurse;
		recurse = newRecurse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__RECURSE, oldRecurse, recurse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(String newOrdering) {
		String oldOrdering = ordering;
		ordering = newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busy getBusy() {
		return busy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusy(Busy newBusy, NotificationChain msgs) {
		Busy oldBusy = busy;
		busy = newBusy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__BUSY, oldBusy, newBusy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusy(Busy newBusy) {
		if (newBusy != busy) {
			NotificationChain msgs = null;
			if (busy != null)
				msgs = ((InternalEObject)busy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__BUSY, null, msgs);
			if (newBusy != null)
				msgs = ((InternalEObject)newBusy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__BUSY, null, msgs);
			msgs = basicSetBusy(newBusy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__BUSY, newBusy, newBusy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoAnswer getNoAnswer() {
		return noAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoAnswer(NoAnswer newNoAnswer, NotificationChain msgs) {
		NoAnswer oldNoAnswer = noAnswer;
		noAnswer = newNoAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__NO_ANSWER, oldNoAnswer, newNoAnswer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoAnswer(NoAnswer newNoAnswer) {
		if (newNoAnswer != noAnswer) {
			NotificationChain msgs = null;
			if (noAnswer != null)
				msgs = ((InternalEObject)noAnswer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__NO_ANSWER, null, msgs);
			if (newNoAnswer != null)
				msgs = ((InternalEObject)newNoAnswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__NO_ANSWER, null, msgs);
			msgs = basicSetNoAnswer(newNoAnswer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__NO_ANSWER, newNoAnswer, newNoAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redirection getRedirection() {
		return redirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedirection(Redirection newRedirection, NotificationChain msgs) {
		Redirection oldRedirection = redirection;
		redirection = newRedirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__REDIRECTION, oldRedirection, newRedirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedirection(Redirection newRedirection) {
		if (newRedirection != redirection) {
			NotificationChain msgs = null;
			if (redirection != null)
				msgs = ((InternalEObject)redirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__REDIRECTION, null, msgs);
			if (newRedirection != null)
				msgs = ((InternalEObject)newRedirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__REDIRECTION, null, msgs);
			msgs = basicSetRedirection(newRedirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__REDIRECTION, newRedirection, newRedirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailure(Failure newFailure, NotificationChain msgs) {
		Failure oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__FAILURE, oldFailure, newFailure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(Failure newFailure) {
		if (newFailure != failure) {
			NotificationChain msgs = null;
			if (failure != null)
				msgs = ((InternalEObject)failure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__FAILURE, null, msgs);
			if (newFailure != null)
				msgs = ((InternalEObject)newFailure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__FAILURE, null, msgs);
			msgs = basicSetFailure(newFailure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__FAILURE, newFailure, newFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Default getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(Default newDefault, NotificationChain msgs) {
		Default oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Default newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPLPackage.PROXY__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.PROXY__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPLPackage.PROXY__BUSY:
				return basicSetBusy(null, msgs);
			case CPLPackage.PROXY__NO_ANSWER:
				return basicSetNoAnswer(null, msgs);
			case CPLPackage.PROXY__REDIRECTION:
				return basicSetRedirection(null, msgs);
			case CPLPackage.PROXY__FAILURE:
				return basicSetFailure(null, msgs);
			case CPLPackage.PROXY__DEFAULT:
				return basicSetDefault(null, msgs);
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
			case CPLPackage.PROXY__TIMEOUT:
				return getTimeout();
			case CPLPackage.PROXY__RECURSE:
				return getRecurse();
			case CPLPackage.PROXY__ORDERING:
				return getOrdering();
			case CPLPackage.PROXY__BUSY:
				return getBusy();
			case CPLPackage.PROXY__NO_ANSWER:
				return getNoAnswer();
			case CPLPackage.PROXY__REDIRECTION:
				return getRedirection();
			case CPLPackage.PROXY__FAILURE:
				return getFailure();
			case CPLPackage.PROXY__DEFAULT:
				return getDefault();
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
			case CPLPackage.PROXY__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case CPLPackage.PROXY__RECURSE:
				setRecurse((String)newValue);
				return;
			case CPLPackage.PROXY__ORDERING:
				setOrdering((String)newValue);
				return;
			case CPLPackage.PROXY__BUSY:
				setBusy((Busy)newValue);
				return;
			case CPLPackage.PROXY__NO_ANSWER:
				setNoAnswer((NoAnswer)newValue);
				return;
			case CPLPackage.PROXY__REDIRECTION:
				setRedirection((Redirection)newValue);
				return;
			case CPLPackage.PROXY__FAILURE:
				setFailure((Failure)newValue);
				return;
			case CPLPackage.PROXY__DEFAULT:
				setDefault((Default)newValue);
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
			case CPLPackage.PROXY__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case CPLPackage.PROXY__RECURSE:
				setRecurse(RECURSE_EDEFAULT);
				return;
			case CPLPackage.PROXY__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case CPLPackage.PROXY__BUSY:
				setBusy((Busy)null);
				return;
			case CPLPackage.PROXY__NO_ANSWER:
				setNoAnswer((NoAnswer)null);
				return;
			case CPLPackage.PROXY__REDIRECTION:
				setRedirection((Redirection)null);
				return;
			case CPLPackage.PROXY__FAILURE:
				setFailure((Failure)null);
				return;
			case CPLPackage.PROXY__DEFAULT:
				setDefault((Default)null);
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
			case CPLPackage.PROXY__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case CPLPackage.PROXY__RECURSE:
				return RECURSE_EDEFAULT == null ? recurse != null : !RECURSE_EDEFAULT.equals(recurse);
			case CPLPackage.PROXY__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
			case CPLPackage.PROXY__BUSY:
				return busy != null;
			case CPLPackage.PROXY__NO_ANSWER:
				return noAnswer != null;
			case CPLPackage.PROXY__REDIRECTION:
				return redirection != null;
			case CPLPackage.PROXY__FAILURE:
				return failure != null;
			case CPLPackage.PROXY__DEFAULT:
				return default_ != null;
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
		result.append(" (timeout: ");
		result.append(timeout);
		result.append(", recurse: ");
		result.append(recurse);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //ProxyImpl
