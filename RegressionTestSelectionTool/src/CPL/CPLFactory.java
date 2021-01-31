/**
 */
package CPL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPL.CPLPackage
 * @generated
 */
public interface CPLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CPLFactory eINSTANCE = CPL2.impl.CPLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	CPLModel createCPLModel();

	/**
	 * Returns a new object of class '<em>CPL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPL</em>'.
	 * @generated
	 */
	CPL createCPL();

	/**
	 * Returns a new object of class '<em>Sub Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Action</em>'.
	 * @generated
	 */
	SubAction createSubAction();

	/**
	 * Returns a new object of class '<em>Outgoing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing</em>'.
	 * @generated
	 */
	Outgoing createOutgoing();

	/**
	 * Returns a new object of class '<em>Incoming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming</em>'.
	 * @generated
	 */
	Incoming createIncoming();

	/**
	 * Returns a new object of class '<em>Not Present</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Present</em>'.
	 * @generated
	 */
	NotPresent createNotPresent();

	/**
	 * Returns a new object of class '<em>Otherwise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Otherwise</em>'.
	 * @generated
	 */
	Otherwise createOtherwise();

	/**
	 * Returns a new object of class '<em>Switched Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switched Address</em>'.
	 * @generated
	 */
	SwitchedAddress createSwitchedAddress();

	/**
	 * Returns a new object of class '<em>Switched String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switched String</em>'.
	 * @generated
	 */
	SwitchedString createSwitchedString();

	/**
	 * Returns a new object of class '<em>Switched Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switched Language</em>'.
	 * @generated
	 */
	SwitchedLanguage createSwitchedLanguage();

	/**
	 * Returns a new object of class '<em>Switched Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switched Time</em>'.
	 * @generated
	 */
	SwitchedTime createSwitchedTime();

	/**
	 * Returns a new object of class '<em>Switched Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switched Priority</em>'.
	 * @generated
	 */
	SwitchedPriority createSwitchedPriority();

	/**
	 * Returns a new object of class '<em>Busy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Busy</em>'.
	 * @generated
	 */
	Busy createBusy();

	/**
	 * Returns a new object of class '<em>No Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Answer</em>'.
	 * @generated
	 */
	NoAnswer createNoAnswer();

	/**
	 * Returns a new object of class '<em>Redirection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redirection</em>'.
	 * @generated
	 */
	Redirection createRedirection();

	/**
	 * Returns a new object of class '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure</em>'.
	 * @generated
	 */
	Failure createFailure();

	/**
	 * Returns a new object of class '<em>Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default</em>'.
	 * @generated
	 */
	Default createDefault();

	/**
	 * Returns a new object of class '<em>Address Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Switch</em>'.
	 * @generated
	 */
	AddressSwitch createAddressSwitch();

	/**
	 * Returns a new object of class '<em>String Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Switch</em>'.
	 * @generated
	 */
	StringSwitch createStringSwitch();

	/**
	 * Returns a new object of class '<em>Language Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Switch</em>'.
	 * @generated
	 */
	LanguageSwitch createLanguageSwitch();

	/**
	 * Returns a new object of class '<em>Time Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Switch</em>'.
	 * @generated
	 */
	TimeSwitch createTimeSwitch();

	/**
	 * Returns a new object of class '<em>Priority Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Priority Switch</em>'.
	 * @generated
	 */
	PrioritySwitch createPrioritySwitch();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Sub Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Call</em>'.
	 * @generated
	 */
	SubCall createSubCall();

	/**
	 * Returns a new object of class '<em>Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy</em>'.
	 * @generated
	 */
	Proxy createProxy();

	/**
	 * Returns a new object of class '<em>Redirect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redirect</em>'.
	 * @generated
	 */
	Redirect createRedirect();

	/**
	 * Returns a new object of class '<em>Reject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reject</em>'.
	 * @generated
	 */
	Reject createReject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CPLPackage getCPLPackage();

} //CPLFactory
