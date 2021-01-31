/**
 */
package CPL2.impl;

import CPL.*;

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
public class CPLFactoryImpl extends EFactoryImpl implements CPLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPLFactory init() {
		try {
			CPLFactory theCPLFactory = (CPLFactory)EPackage.Registry.INSTANCE.getEFactory(CPLPackage.eNS_URI);
			if (theCPLFactory != null) {
				return theCPLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CPLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPLFactoryImpl() {
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
			case CPLPackage.CPL_MODEL: return createCPLModel();
			case CPLPackage.CPL: return createCPL();
			case CPLPackage.SUB_ACTION: return createSubAction();
			case CPLPackage.OUTGOING: return createOutgoing();
			case CPLPackage.INCOMING: return createIncoming();
			case CPLPackage.NOT_PRESENT: return createNotPresent();
			case CPLPackage.OTHERWISE: return createOtherwise();
			case CPLPackage.SWITCHED_ADDRESS: return createSwitchedAddress();
			case CPLPackage.SWITCHED_STRING: return createSwitchedString();
			case CPLPackage.SWITCHED_LANGUAGE: return createSwitchedLanguage();
			case CPLPackage.SWITCHED_TIME: return createSwitchedTime();
			case CPLPackage.SWITCHED_PRIORITY: return createSwitchedPriority();
			case CPLPackage.BUSY: return createBusy();
			case CPLPackage.NO_ANSWER: return createNoAnswer();
			case CPLPackage.REDIRECTION: return createRedirection();
			case CPLPackage.FAILURE: return createFailure();
			case CPLPackage.DEFAULT: return createDefault();
			case CPLPackage.ADDRESS_SWITCH: return createAddressSwitch();
			case CPLPackage.STRING_SWITCH: return createStringSwitch();
			case CPLPackage.LANGUAGE_SWITCH: return createLanguageSwitch();
			case CPLPackage.TIME_SWITCH: return createTimeSwitch();
			case CPLPackage.PRIORITY_SWITCH: return createPrioritySwitch();
			case CPLPackage.LOCATION: return createLocation();
			case CPLPackage.SUB_CALL: return createSubCall();
			case CPLPackage.PROXY: return createProxy();
			case CPLPackage.REDIRECT: return createRedirect();
			case CPLPackage.REJECT: return createReject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPLModel createCPLModel() {
		CPLModelImpl cplModel = new CPLModelImpl();
		return cplModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPL createCPL() {
		CPLImpl cpl = new CPLImpl();
		return cpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAction createSubAction() {
		SubActionImpl subAction = new SubActionImpl();
		return subAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outgoing createOutgoing() {
		OutgoingImpl outgoing = new OutgoingImpl();
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incoming createIncoming() {
		IncomingImpl incoming = new IncomingImpl();
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotPresent createNotPresent() {
		NotPresentImpl notPresent = new NotPresentImpl();
		return notPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Otherwise createOtherwise() {
		OtherwiseImpl otherwise = new OtherwiseImpl();
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchedAddress createSwitchedAddress() {
		SwitchedAddressImpl switchedAddress = new SwitchedAddressImpl();
		return switchedAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchedString createSwitchedString() {
		SwitchedStringImpl switchedString = new SwitchedStringImpl();
		return switchedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchedLanguage createSwitchedLanguage() {
		SwitchedLanguageImpl switchedLanguage = new SwitchedLanguageImpl();
		return switchedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchedTime createSwitchedTime() {
		SwitchedTimeImpl switchedTime = new SwitchedTimeImpl();
		return switchedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchedPriority createSwitchedPriority() {
		SwitchedPriorityImpl switchedPriority = new SwitchedPriorityImpl();
		return switchedPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busy createBusy() {
		BusyImpl busy = new BusyImpl();
		return busy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoAnswer createNoAnswer() {
		NoAnswerImpl noAnswer = new NoAnswerImpl();
		return noAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redirection createRedirection() {
		RedirectionImpl redirection = new RedirectionImpl();
		return redirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure createFailure() {
		FailureImpl failure = new FailureImpl();
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Default createDefault() {
		DefaultImpl default_ = new DefaultImpl();
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSwitch createAddressSwitch() {
		AddressSwitchImpl addressSwitch = new AddressSwitchImpl();
		return addressSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringSwitch createStringSwitch() {
		StringSwitchImpl stringSwitch = new StringSwitchImpl();
		return stringSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSwitch createLanguageSwitch() {
		LanguageSwitchImpl languageSwitch = new LanguageSwitchImpl();
		return languageSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSwitch createTimeSwitch() {
		TimeSwitchImpl timeSwitch = new TimeSwitchImpl();
		return timeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrioritySwitch createPrioritySwitch() {
		PrioritySwitchImpl prioritySwitch = new PrioritySwitchImpl();
		return prioritySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCall createSubCall() {
		SubCallImpl subCall = new SubCallImpl();
		return subCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy createProxy() {
		ProxyImpl proxy = new ProxyImpl();
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redirect createRedirect() {
		RedirectImpl redirect = new RedirectImpl();
		return redirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reject createReject() {
		RejectImpl reject = new RejectImpl();
		return reject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPLPackage getCPLPackage() {
		return (CPLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CPLPackage getPackage() {
		return CPLPackage.eINSTANCE;
	}

} //CPLFactoryImpl
