/**
 */
package CPL2.impl;

import CPL.Action;
import CPL.AddressSwitch;
import CPL.Busy;
import CPL.CPLFactory;
import CPL.CPLModel;
import CPL.CPLPackage;
import CPL.Default;
import CPL.Element;
import CPL.Failure;
import CPL.Incoming;
import CPL.LanguageSwitch;
import CPL.Location;
import CPL.NoAnswer;
import CPL.Node;
import CPL.NodeContainer;
import CPL.NotPresent;
import CPL.Otherwise;
import CPL.Outgoing;
import CPL.PrioritySwitch;
import CPL.Proxy;
import CPL.Redirect;
import CPL.Redirection;
import CPL.Reject;
import CPL.SignallingAction;
import CPL.StringSwitch;
import CPL.SubAction;
import CPL.SubCall;
import CPL.Switch;
import CPL.SwitchedAddress;
import CPL.SwitchedLanguage;
import CPL.SwitchedPriority;
import CPL.SwitchedString;
import CPL.SwitchedTime;
import CPL.TimeSwitch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CPLPackageImpl extends EPackageImpl implements CPLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cplModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notPresentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherwiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchedAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchedLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchedTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchedPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritySwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signallingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redirectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rejectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CPL.CPLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CPLPackageImpl() {
		super(eNS_URI, CPLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CPLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CPLPackage init() {
		if (isInited) return (CPLPackage)EPackage.Registry.INSTANCE.getEPackage(CPLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCPLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CPLPackageImpl theCPLPackage = registeredCPLPackage instanceof CPLPackageImpl ? (CPLPackageImpl)registeredCPLPackage : new CPLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCPLPackage.createPackageContents();

		// Initialize created meta-data
		theCPLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCPLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CPLPackage.eNS_URI, theCPLPackage);
		return theCPLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPLModel() {
		return cplModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPLModel_Elements() {
		return (EReference)cplModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPL() {
		return cplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPL_SubActions() {
		return (EReference)cplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPL_Outgoing() {
		return (EReference)cplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPL_Incoming() {
		return (EReference)cplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeContainer() {
		return nodeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeContainer_Contents() {
		return (EReference)nodeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubAction() {
		return subActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAction_Id() {
		return (EAttribute)subActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoing() {
		return outgoingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncoming() {
		return incomingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotPresent() {
		return notPresentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherwise() {
		return otherwiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchedAddress() {
		return switchedAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedAddress_Is() {
		return (EAttribute)switchedAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedAddress_Contains() {
		return (EAttribute)switchedAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedAddress_SubDomainOf() {
		return (EAttribute)switchedAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchedString() {
		return switchedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedString_Is() {
		return (EAttribute)switchedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedString_Contains() {
		return (EAttribute)switchedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchedLanguage() {
		return switchedLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedLanguage_Matches() {
		return (EAttribute)switchedLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchedTime() {
		return switchedTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Dtstart() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Dtend() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Duration() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Freq() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Until() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Count() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Interval() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_BySecond() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_ByMinute() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_ByHour() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_ByDay() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_ByMonthDay() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_ByYearDay() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_ByWeekNo() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_ByMonth() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_Wkst() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedTime_BySetPos() {
		return (EAttribute)switchedTimeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchedPriority() {
		return switchedPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedPriority_Less() {
		return (EAttribute)switchedPriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedPriority_Greater() {
		return (EAttribute)switchedPriorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchedPriority_Equal() {
		return (EAttribute)switchedPriorityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusy() {
		return busyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoAnswer() {
		return noAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedirection() {
		return redirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure() {
		return failureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefault() {
		return defaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_NotPresent() {
		return (EReference)switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Otherwise() {
		return (EReference)switchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressSwitch() {
		return addressSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressSwitch_Field() {
		return (EAttribute)addressSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressSwitch_SubField() {
		return (EAttribute)addressSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressSwitch_Addresses() {
		return (EReference)addressSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringSwitch() {
		return stringSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringSwitch_Field() {
		return (EAttribute)stringSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringSwitch_Strings() {
		return (EReference)stringSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageSwitch() {
		return languageSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageSwitch_Languages() {
		return (EReference)languageSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSwitch() {
		return timeSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSwitch_Tzid() {
		return (EAttribute)timeSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSwitch_Tzurl() {
		return (EAttribute)timeSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSwitch_Times() {
		return (EReference)timeSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritySwitch() {
		return prioritySwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrioritySwitch_Priorities() {
		return (EReference)prioritySwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Url() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Priority() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Clear() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubCall() {
		return subCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubCall_Ref() {
		return (EAttribute)subCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignallingAction() {
		return signallingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxy() {
		return proxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxy_Timeout() {
		return (EAttribute)proxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxy_Recurse() {
		return (EAttribute)proxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxy_Ordering() {
		return (EAttribute)proxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxy_Busy() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxy_NoAnswer() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxy_Redirection() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxy_Failure() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxy_Default() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedirect() {
		return redirectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedirect_Permanent() {
		return (EAttribute)redirectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReject() {
		return rejectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReject_Status() {
		return (EAttribute)rejectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReject_Reason() {
		return (EAttribute)rejectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPLFactory getCPLFactory() {
		return (CPLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cplModelEClass = createEClass(CPL_MODEL);
		createEReference(cplModelEClass, CPL_MODEL__ELEMENTS);

		elementEClass = createEClass(ELEMENT);

		cplEClass = createEClass(CPL);
		createEReference(cplEClass, CPL__SUB_ACTIONS);
		createEReference(cplEClass, CPL__OUTGOING);
		createEReference(cplEClass, CPL__INCOMING);

		nodeContainerEClass = createEClass(NODE_CONTAINER);
		createEReference(nodeContainerEClass, NODE_CONTAINER__CONTENTS);

		subActionEClass = createEClass(SUB_ACTION);
		createEAttribute(subActionEClass, SUB_ACTION__ID);

		outgoingEClass = createEClass(OUTGOING);

		incomingEClass = createEClass(INCOMING);

		notPresentEClass = createEClass(NOT_PRESENT);

		otherwiseEClass = createEClass(OTHERWISE);

		switchedAddressEClass = createEClass(SWITCHED_ADDRESS);
		createEAttribute(switchedAddressEClass, SWITCHED_ADDRESS__IS);
		createEAttribute(switchedAddressEClass, SWITCHED_ADDRESS__CONTAINS);
		createEAttribute(switchedAddressEClass, SWITCHED_ADDRESS__SUB_DOMAIN_OF);

		switchedStringEClass = createEClass(SWITCHED_STRING);
		createEAttribute(switchedStringEClass, SWITCHED_STRING__IS);
		createEAttribute(switchedStringEClass, SWITCHED_STRING__CONTAINS);

		switchedLanguageEClass = createEClass(SWITCHED_LANGUAGE);
		createEAttribute(switchedLanguageEClass, SWITCHED_LANGUAGE__MATCHES);

		switchedTimeEClass = createEClass(SWITCHED_TIME);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__DTSTART);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__DTEND);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__DURATION);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__FREQ);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__UNTIL);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__COUNT);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__INTERVAL);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_SECOND);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_MINUTE);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_HOUR);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_DAY);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_MONTH_DAY);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_YEAR_DAY);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_WEEK_NO);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_MONTH);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__WKST);
		createEAttribute(switchedTimeEClass, SWITCHED_TIME__BY_SET_POS);

		switchedPriorityEClass = createEClass(SWITCHED_PRIORITY);
		createEAttribute(switchedPriorityEClass, SWITCHED_PRIORITY__LESS);
		createEAttribute(switchedPriorityEClass, SWITCHED_PRIORITY__GREATER);
		createEAttribute(switchedPriorityEClass, SWITCHED_PRIORITY__EQUAL);

		busyEClass = createEClass(BUSY);

		noAnswerEClass = createEClass(NO_ANSWER);

		redirectionEClass = createEClass(REDIRECTION);

		failureEClass = createEClass(FAILURE);

		defaultEClass = createEClass(DEFAULT);

		nodeEClass = createEClass(NODE);

		switchEClass = createEClass(SWITCH);
		createEReference(switchEClass, SWITCH__NOT_PRESENT);
		createEReference(switchEClass, SWITCH__OTHERWISE);

		addressSwitchEClass = createEClass(ADDRESS_SWITCH);
		createEAttribute(addressSwitchEClass, ADDRESS_SWITCH__FIELD);
		createEAttribute(addressSwitchEClass, ADDRESS_SWITCH__SUB_FIELD);
		createEReference(addressSwitchEClass, ADDRESS_SWITCH__ADDRESSES);

		stringSwitchEClass = createEClass(STRING_SWITCH);
		createEAttribute(stringSwitchEClass, STRING_SWITCH__FIELD);
		createEReference(stringSwitchEClass, STRING_SWITCH__STRINGS);

		languageSwitchEClass = createEClass(LANGUAGE_SWITCH);
		createEReference(languageSwitchEClass, LANGUAGE_SWITCH__LANGUAGES);

		timeSwitchEClass = createEClass(TIME_SWITCH);
		createEAttribute(timeSwitchEClass, TIME_SWITCH__TZID);
		createEAttribute(timeSwitchEClass, TIME_SWITCH__TZURL);
		createEReference(timeSwitchEClass, TIME_SWITCH__TIMES);

		prioritySwitchEClass = createEClass(PRIORITY_SWITCH);
		createEReference(prioritySwitchEClass, PRIORITY_SWITCH__PRIORITIES);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__URL);
		createEAttribute(locationEClass, LOCATION__PRIORITY);
		createEAttribute(locationEClass, LOCATION__CLEAR);

		subCallEClass = createEClass(SUB_CALL);
		createEAttribute(subCallEClass, SUB_CALL__REF);

		actionEClass = createEClass(ACTION);

		signallingActionEClass = createEClass(SIGNALLING_ACTION);

		proxyEClass = createEClass(PROXY);
		createEAttribute(proxyEClass, PROXY__TIMEOUT);
		createEAttribute(proxyEClass, PROXY__RECURSE);
		createEAttribute(proxyEClass, PROXY__ORDERING);
		createEReference(proxyEClass, PROXY__BUSY);
		createEReference(proxyEClass, PROXY__NO_ANSWER);
		createEReference(proxyEClass, PROXY__REDIRECTION);
		createEReference(proxyEClass, PROXY__FAILURE);
		createEReference(proxyEClass, PROXY__DEFAULT);

		redirectEClass = createEClass(REDIRECT);
		createEAttribute(redirectEClass, REDIRECT__PERMANENT);

		rejectEClass = createEClass(REJECT);
		createEAttribute(rejectEClass, REJECT__STATUS);
		createEAttribute(rejectEClass, REJECT__REASON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cplEClass.getESuperTypes().add(this.getElement());
		nodeContainerEClass.getESuperTypes().add(this.getElement());
		subActionEClass.getESuperTypes().add(this.getNodeContainer());
		outgoingEClass.getESuperTypes().add(this.getNodeContainer());
		incomingEClass.getESuperTypes().add(this.getNodeContainer());
		notPresentEClass.getESuperTypes().add(this.getNodeContainer());
		otherwiseEClass.getESuperTypes().add(this.getNodeContainer());
		switchedAddressEClass.getESuperTypes().add(this.getNodeContainer());
		switchedStringEClass.getESuperTypes().add(this.getNodeContainer());
		switchedLanguageEClass.getESuperTypes().add(this.getNodeContainer());
		switchedTimeEClass.getESuperTypes().add(this.getNodeContainer());
		switchedPriorityEClass.getESuperTypes().add(this.getNodeContainer());
		busyEClass.getESuperTypes().add(this.getNodeContainer());
		noAnswerEClass.getESuperTypes().add(this.getNodeContainer());
		redirectionEClass.getESuperTypes().add(this.getNodeContainer());
		failureEClass.getESuperTypes().add(this.getNodeContainer());
		defaultEClass.getESuperTypes().add(this.getNodeContainer());
		nodeEClass.getESuperTypes().add(this.getElement());
		switchEClass.getESuperTypes().add(this.getNode());
		addressSwitchEClass.getESuperTypes().add(this.getSwitch());
		stringSwitchEClass.getESuperTypes().add(this.getSwitch());
		languageSwitchEClass.getESuperTypes().add(this.getSwitch());
		timeSwitchEClass.getESuperTypes().add(this.getSwitch());
		prioritySwitchEClass.getESuperTypes().add(this.getSwitch());
		locationEClass.getESuperTypes().add(this.getNode());
		locationEClass.getESuperTypes().add(this.getNodeContainer());
		subCallEClass.getESuperTypes().add(this.getNode());
		actionEClass.getESuperTypes().add(this.getNode());
		signallingActionEClass.getESuperTypes().add(this.getAction());
		proxyEClass.getESuperTypes().add(this.getSignallingAction());
		redirectEClass.getESuperTypes().add(this.getSignallingAction());
		rejectEClass.getESuperTypes().add(this.getSignallingAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(cplModelEClass, CPLModel.class, "CPLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCPLModel_Elements(), this.getElement(), null, "elements", null, 0, -1, CPLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cplEClass, CPL.CPL.class, "CPL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCPL_SubActions(), this.getSubAction(), null, "subActions", null, 0, -1, CPL.CPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPL_Outgoing(), this.getOutgoing(), null, "outgoing", null, 0, 1, CPL.CPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCPL_Incoming(), this.getIncoming(), null, "incoming", null, 0, 1, CPL.CPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nodeContainerEClass, NodeContainer.class, "NodeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeContainer_Contents(), this.getNode(), null, "contents", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subActionEClass, SubAction.class, "SubAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubAction_Id(), ecorePackage.getEString(), "id", null, 1, 1, SubAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outgoingEClass, Outgoing.class, "Outgoing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(incomingEClass, Incoming.class, "Incoming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notPresentEClass, NotPresent.class, "NotPresent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherwiseEClass, Otherwise.class, "Otherwise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchedAddressEClass, SwitchedAddress.class, "SwitchedAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchedAddress_Is(), ecorePackage.getEString(), "is", null, 0, 1, SwitchedAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedAddress_Contains(), ecorePackage.getEString(), "contains", null, 0, 1, SwitchedAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedAddress_SubDomainOf(), ecorePackage.getEString(), "subDomainOf", null, 0, 1, SwitchedAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(switchedStringEClass, SwitchedString.class, "SwitchedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchedString_Is(), ecorePackage.getEString(), "is", null, 0, 1, SwitchedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedString_Contains(), ecorePackage.getEString(), "contains", null, 0, 1, SwitchedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(switchedLanguageEClass, SwitchedLanguage.class, "SwitchedLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchedLanguage_Matches(), ecorePackage.getEString(), "matches", null, 1, 1, SwitchedLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(switchedTimeEClass, SwitchedTime.class, "SwitchedTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchedTime_Dtstart(), ecorePackage.getEString(), "dtstart", null, 1, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_Dtend(), ecorePackage.getEString(), "dtend", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_Freq(), ecorePackage.getEString(), "freq", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_Until(), ecorePackage.getEString(), "until", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_Count(), ecorePackage.getEString(), "count", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_Interval(), ecorePackage.getEString(), "interval", null, 1, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_BySecond(), ecorePackage.getEString(), "bySecond", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_ByMinute(), ecorePackage.getEString(), "byMinute", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_ByHour(), ecorePackage.getEString(), "byHour", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_ByDay(), ecorePackage.getEString(), "byDay", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_ByMonthDay(), ecorePackage.getEString(), "byMonthDay", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_ByYearDay(), ecorePackage.getEString(), "byYearDay", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_ByWeekNo(), ecorePackage.getEString(), "byWeekNo", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_ByMonth(), ecorePackage.getEString(), "byMonth", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_Wkst(), ecorePackage.getEString(), "wkst", null, 1, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedTime_BySetPos(), ecorePackage.getEString(), "bySetPos", null, 0, 1, SwitchedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(switchedPriorityEClass, SwitchedPriority.class, "SwitchedPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchedPriority_Less(), ecorePackage.getEString(), "less", null, 0, 1, SwitchedPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedPriority_Greater(), ecorePackage.getEString(), "greater", null, 0, 1, SwitchedPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchedPriority_Equal(), ecorePackage.getEString(), "equal", null, 0, 1, SwitchedPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busyEClass, Busy.class, "Busy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noAnswerEClass, NoAnswer.class, "NoAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(redirectionEClass, Redirection.class, "Redirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureEClass, Failure.class, "Failure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchEClass, Switch.class, "Switch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitch_NotPresent(), this.getNotPresent(), null, "notPresent", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSwitch_Otherwise(), this.getOtherwise(), null, "otherwise", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(addressSwitchEClass, AddressSwitch.class, "AddressSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressSwitch_Field(), ecorePackage.getEString(), "field", null, 1, 1, AddressSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddressSwitch_SubField(), ecorePackage.getEString(), "subField", null, 0, 1, AddressSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAddressSwitch_Addresses(), this.getSwitchedAddress(), null, "addresses", null, 0, -1, AddressSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringSwitchEClass, StringSwitch.class, "StringSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringSwitch_Field(), ecorePackage.getEString(), "field", null, 1, 1, StringSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringSwitch_Strings(), this.getSwitchedString(), null, "strings", null, 0, -1, StringSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageSwitchEClass, LanguageSwitch.class, "LanguageSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageSwitch_Languages(), this.getSwitchedLanguage(), null, "languages", null, 0, -1, LanguageSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSwitchEClass, TimeSwitch.class, "TimeSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSwitch_Tzid(), ecorePackage.getEString(), "tzid", null, 0, 1, TimeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTimeSwitch_Tzurl(), ecorePackage.getEString(), "tzurl", null, 0, 1, TimeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeSwitch_Times(), this.getSwitchedTime(), null, "times", null, 0, -1, TimeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritySwitchEClass, PrioritySwitch.class, "PrioritySwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrioritySwitch_Priorities(), this.getSwitchedPriority(), null, "priorities", null, 0, -1, PrioritySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Url(), ecorePackage.getEString(), "url", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocation_Priority(), ecorePackage.getEString(), "priority", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocation_Clear(), ecorePackage.getEString(), "clear", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subCallEClass, SubCall.class, "SubCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubCall_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, SubCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signallingActionEClass, SignallingAction.class, "SignallingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proxyEClass, Proxy.class, "Proxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProxy_Timeout(), ecorePackage.getEString(), "timeout", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProxy_Recurse(), ecorePackage.getEString(), "recurse", null, 1, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProxy_Ordering(), ecorePackage.getEString(), "ordering", null, 1, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_Busy(), this.getBusy(), null, "busy", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_NoAnswer(), this.getNoAnswer(), null, "noAnswer", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_Redirection(), this.getRedirection(), null, "redirection", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_Failure(), this.getFailure(), null, "failure", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_Default(), this.getDefault(), null, "default", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(redirectEClass, Redirect.class, "Redirect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedirect_Permanent(), ecorePackage.getEString(), "permanent", null, 1, 1, Redirect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rejectEClass, Reject.class, "Reject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReject_Status(), ecorePackage.getEString(), "status", null, 1, 1, Reject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReject_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, Reject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CPLPackageImpl
