/**
 */
package MultiClassQN.impl;

import MultiClassQN.MultiClassQNPackage;
import MultiClassQN.ProbabilityDistribution;
import MultiClassQN.Server;
import MultiClassQN.ServiceRequest;
import MultiClassQN.Workload;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.impl.ServiceRequestImpl#getServiceDistribution <em>Service Distribution</em>}</li>
 *   <li>{@link MultiClassQN.impl.ServiceRequestImpl#getServiceParams <em>Service Params</em>}</li>
 *   <li>{@link MultiClassQN.impl.ServiceRequestImpl#getServer <em>Server</em>}</li>
 *   <li>{@link MultiClassQN.impl.ServiceRequestImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRequestImpl extends MinimalEObjectImpl.Container implements ServiceRequest {
	/**
	 * The default value of the '{@link #getServiceDistribution() <em>Service Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final ProbabilityDistribution SERVICE_DISTRIBUTION_EDEFAULT = ProbabilityDistribution.EXPONENTIAL;

	/**
	 * The cached value of the '{@link #getServiceDistribution() <em>Service Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDistribution()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistribution serviceDistribution = SERVICE_DISTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceParams() <em>Service Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> serviceParams;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

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
	protected ServiceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiClassQNPackage.Literals.SERVICE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistribution getServiceDistribution() {
		return serviceDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDistribution(ProbabilityDistribution newServiceDistribution) {
		ProbabilityDistribution oldServiceDistribution = serviceDistribution;
		serviceDistribution = newServiceDistribution == null ? SERVICE_DISTRIBUTION_EDEFAULT : newServiceDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SERVICE_REQUEST__SERVICE_DISTRIBUTION, oldServiceDistribution, serviceDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getServiceParams() {
		if (serviceParams == null) {
			serviceParams = new EDataTypeUniqueEList<Double>(Double.class, this, MultiClassQNPackage.SERVICE_REQUEST__SERVICE_PARAMS);
		}
		return serviceParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (Server)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiClassQNPackage.SERVICE_REQUEST__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(Server newServer, NotificationChain msgs) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SERVICE_REQUEST__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, MultiClassQNPackage.SERVER__SERVICE_REQUEST, Server.class, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, MultiClassQNPackage.SERVER__SERVICE_REQUEST, Server.class, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SERVICE_REQUEST__SERVER, newServer, newServer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD, oldWorkload, workload));
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
	public NotificationChain basicSetWorkload(Workload newWorkload, NotificationChain msgs) {
		Workload oldWorkload = workload;
		workload = newWorkload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD, oldWorkload, newWorkload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkload(Workload newWorkload) {
		if (newWorkload != workload) {
			NotificationChain msgs = null;
			if (workload != null)
				msgs = ((InternalEObject)workload).eInverseRemove(this, MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST, Workload.class, msgs);
			if (newWorkload != null)
				msgs = ((InternalEObject)newWorkload).eInverseAdd(this, MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST, Workload.class, msgs);
			msgs = basicSetWorkload(newWorkload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD, newWorkload, newWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultiClassQNPackage.SERVICE_REQUEST__SERVER:
				if (server != null)
					msgs = ((InternalEObject)server).eInverseRemove(this, MultiClassQNPackage.SERVER__SERVICE_REQUEST, Server.class, msgs);
				return basicSetServer((Server)otherEnd, msgs);
			case MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD:
				if (workload != null)
					msgs = ((InternalEObject)workload).eInverseRemove(this, MultiClassQNPackage.WORKLOAD__SERVICE_REQUEST, Workload.class, msgs);
				return basicSetWorkload((Workload)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultiClassQNPackage.SERVICE_REQUEST__SERVER:
				return basicSetServer(null, msgs);
			case MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD:
				return basicSetWorkload(null, msgs);
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
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_DISTRIBUTION:
				return getServiceDistribution();
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_PARAMS:
				return getServiceParams();
			case MultiClassQNPackage.SERVICE_REQUEST__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD:
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
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_DISTRIBUTION:
				setServiceDistribution((ProbabilityDistribution)newValue);
				return;
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_PARAMS:
				getServiceParams().clear();
				getServiceParams().addAll((Collection<? extends Double>)newValue);
				return;
			case MultiClassQNPackage.SERVICE_REQUEST__SERVER:
				setServer((Server)newValue);
				return;
			case MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD:
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
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_DISTRIBUTION:
				setServiceDistribution(SERVICE_DISTRIBUTION_EDEFAULT);
				return;
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_PARAMS:
				getServiceParams().clear();
				return;
			case MultiClassQNPackage.SERVICE_REQUEST__SERVER:
				setServer((Server)null);
				return;
			case MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD:
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
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_DISTRIBUTION:
				return serviceDistribution != SERVICE_DISTRIBUTION_EDEFAULT;
			case MultiClassQNPackage.SERVICE_REQUEST__SERVICE_PARAMS:
				return serviceParams != null && !serviceParams.isEmpty();
			case MultiClassQNPackage.SERVICE_REQUEST__SERVER:
				return server != null;
			case MultiClassQNPackage.SERVICE_REQUEST__WORKLOAD:
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
		result.append(" (serviceDistribution: ");
		result.append(serviceDistribution);
		result.append(", serviceParams: ");
		result.append(serviceParams);
		result.append(')');
		return result.toString();
	}

} //ServiceRequestImpl
