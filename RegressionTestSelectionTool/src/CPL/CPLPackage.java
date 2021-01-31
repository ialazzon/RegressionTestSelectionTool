/**
 */
package CPL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CPL.CPLFactory
 * @model kind="package"
 * @generated
 */
public interface CPLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CPL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpl/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CPL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CPLPackage eINSTANCE = CPL2.impl.CPLPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPL2.impl.CPLModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.CPLModelImpl
	 * @see CPL2.impl.CPLPackageImpl#getCPLModel()
	 * @generated
	 */
	int CPL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL_MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.ElementImpl
	 * @see CPL2.impl.CPLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.CPLImpl <em>CPL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.CPLImpl
	 * @see CPL2.impl.CPLPackageImpl#getCPL()
	 * @generated
	 */
	int CPL = 2;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL__SUB_ACTIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL__OUTGOING = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL__INCOMING = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.NodeContainerImpl <em>Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.NodeContainerImpl
	 * @see CPL2.impl.CPLPackageImpl#getNodeContainer()
	 * @generated
	 */
	int NODE_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SubActionImpl <em>Sub Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SubActionImpl
	 * @see CPL2.impl.CPLPackageImpl#getSubAction()
	 * @generated
	 */
	int SUB_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION__ID = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.OutgoingImpl <em>Outgoing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.OutgoingImpl
	 * @see CPL2.impl.CPLPackageImpl#getOutgoing()
	 * @generated
	 */
	int OUTGOING = 5;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Outgoing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Outgoing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.IncomingImpl <em>Incoming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.IncomingImpl
	 * @see CPL2.impl.CPLPackageImpl#getIncoming()
	 * @generated
	 */
	int INCOMING = 6;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Incoming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Incoming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.NotPresentImpl <em>Not Present</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.NotPresentImpl
	 * @see CPL2.impl.CPLPackageImpl#getNotPresent()
	 * @generated
	 */
	int NOT_PRESENT = 7;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRESENT__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Not Present</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRESENT_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Present</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRESENT_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.OtherwiseImpl <em>Otherwise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.OtherwiseImpl
	 * @see CPL2.impl.CPLPackageImpl#getOtherwise()
	 * @generated
	 */
	int OTHERWISE = 8;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERWISE__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Otherwise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERWISE_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Otherwise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERWISE_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SwitchedAddressImpl <em>Switched Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SwitchedAddressImpl
	 * @see CPL2.impl.CPLPackageImpl#getSwitchedAddress()
	 * @generated
	 */
	int SWITCHED_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_ADDRESS__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_ADDRESS__IS = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_ADDRESS__CONTAINS = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Domain Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_ADDRESS__SUB_DOMAIN_OF = NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switched Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_ADDRESS_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Switched Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_ADDRESS_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SwitchedStringImpl <em>Switched String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SwitchedStringImpl
	 * @see CPL2.impl.CPLPackageImpl#getSwitchedString()
	 * @generated
	 */
	int SWITCHED_STRING = 10;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_STRING__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_STRING__IS = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_STRING__CONTAINS = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switched String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_STRING_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switched String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_STRING_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SwitchedLanguageImpl <em>Switched Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SwitchedLanguageImpl
	 * @see CPL2.impl.CPLPackageImpl#getSwitchedLanguage()
	 * @generated
	 */
	int SWITCHED_LANGUAGE = 11;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_LANGUAGE__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_LANGUAGE__MATCHES = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switched Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_LANGUAGE_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switched Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_LANGUAGE_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SwitchedTimeImpl <em>Switched Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SwitchedTimeImpl
	 * @see CPL2.impl.CPLPackageImpl#getSwitchedTime()
	 * @generated
	 */
	int SWITCHED_TIME = 12;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__DTSTART = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__DTEND = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__DURATION = NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__FREQ = NODE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__UNTIL = NODE_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__COUNT = NODE_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__INTERVAL = NODE_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>By Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_SECOND = NODE_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>By Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_MINUTE = NODE_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>By Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_HOUR = NODE_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>By Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_DAY = NODE_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>By Month Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_MONTH_DAY = NODE_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>By Year Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_YEAR_DAY = NODE_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>By Week No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_WEEK_NO = NODE_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>By Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_MONTH = NODE_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Wkst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__WKST = NODE_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>By Set Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME__BY_SET_POS = NODE_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Switched Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Switched Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_TIME_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SwitchedPriorityImpl <em>Switched Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SwitchedPriorityImpl
	 * @see CPL2.impl.CPLPackageImpl#getSwitchedPriority()
	 * @generated
	 */
	int SWITCHED_PRIORITY = 13;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_PRIORITY__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Less</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_PRIORITY__LESS = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Greater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_PRIORITY__GREATER = NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Equal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_PRIORITY__EQUAL = NODE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switched Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_PRIORITY_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Switched Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHED_PRIORITY_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.BusyImpl <em>Busy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.BusyImpl
	 * @see CPL2.impl.CPLPackageImpl#getBusy()
	 * @generated
	 */
	int BUSY = 14;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSY__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Busy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSY_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Busy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSY_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.NoAnswerImpl <em>No Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.NoAnswerImpl
	 * @see CPL2.impl.CPLPackageImpl#getNoAnswer()
	 * @generated
	 */
	int NO_ANSWER = 15;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ANSWER__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>No Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ANSWER_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ANSWER_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.RedirectionImpl <em>Redirection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.RedirectionImpl
	 * @see CPL2.impl.CPLPackageImpl#getRedirection()
	 * @generated
	 */
	int REDIRECTION = 16;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Redirection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Redirection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.FailureImpl
	 * @see CPL2.impl.CPLPackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 17;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.DefaultImpl <em>Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.DefaultImpl
	 * @see CPL2.impl.CPLPackageImpl#getDefault()
	 * @generated
	 */
	int DEFAULT = 18;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT__CONTENTS = NODE_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_FEATURE_COUNT = NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_OPERATION_COUNT = NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.NodeImpl
	 * @see CPL2.impl.CPLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 19;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SwitchImpl
	 * @see CPL2.impl.CPLPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 20;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NOT_PRESENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OTHERWISE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.AddressSwitchImpl <em>Address Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.AddressSwitchImpl
	 * @see CPL2.impl.CPLPackageImpl#getAddressSwitch()
	 * @generated
	 */
	int ADDRESS_SWITCH = 21;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SWITCH__NOT_PRESENT = SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SWITCH__OTHERWISE = SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SWITCH__FIELD = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SWITCH__SUB_FIELD = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SWITCH__ADDRESSES = SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Address Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Address Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.StringSwitchImpl <em>String Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.StringSwitchImpl
	 * @see CPL2.impl.CPLPackageImpl#getStringSwitch()
	 * @generated
	 */
	int STRING_SWITCH = 22;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH__NOT_PRESENT = SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH__OTHERWISE = SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH__FIELD = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH__STRINGS = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.LanguageSwitchImpl <em>Language Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.LanguageSwitchImpl
	 * @see CPL2.impl.CPLPackageImpl#getLanguageSwitch()
	 * @generated
	 */
	int LANGUAGE_SWITCH = 23;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SWITCH__NOT_PRESENT = SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SWITCH__OTHERWISE = SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SWITCH__LANGUAGES = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Language Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.TimeSwitchImpl <em>Time Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.TimeSwitchImpl
	 * @see CPL2.impl.CPLPackageImpl#getTimeSwitch()
	 * @generated
	 */
	int TIME_SWITCH = 24;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SWITCH__NOT_PRESENT = SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SWITCH__OTHERWISE = SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SWITCH__TZID = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SWITCH__TZURL = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Times</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SWITCH__TIMES = SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.PrioritySwitchImpl <em>Priority Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.PrioritySwitchImpl
	 * @see CPL2.impl.CPLPackageImpl#getPrioritySwitch()
	 * @generated
	 */
	int PRIORITY_SWITCH = 25;

	/**
	 * The feature id for the '<em><b>Not Present</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SWITCH__NOT_PRESENT = SWITCH__NOT_PRESENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SWITCH__OTHERWISE = SWITCH__OTHERWISE;

	/**
	 * The feature id for the '<em><b>Priorities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SWITCH__PRIORITIES = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Priority Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Priority Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.LocationImpl
	 * @see CPL2.impl.CPLPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 26;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTENTS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__URL = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PRIORITY = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CLEAR = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SubCallImpl <em>Sub Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SubCallImpl
	 * @see CPL2.impl.CPLPackageImpl#getSubCall()
	 * @generated
	 */
	int SUB_CALL = 27;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CALL__REF = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CALL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CALL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.ActionImpl
	 * @see CPL2.impl.CPLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 28;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.SignallingActionImpl <em>Signalling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.SignallingActionImpl
	 * @see CPL2.impl.CPLPackageImpl#getSignallingAction()
	 * @generated
	 */
	int SIGNALLING_ACTION = 29;

	/**
	 * The number of structural features of the '<em>Signalling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALLING_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signalling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALLING_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.ProxyImpl
	 * @see CPL2.impl.CPLPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 30;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__TIMEOUT = SIGNALLING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recurse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__RECURSE = SIGNALLING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__ORDERING = SIGNALLING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__BUSY = SIGNALLING_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__NO_ANSWER = SIGNALLING_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Redirection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__REDIRECTION = SIGNALLING_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__FAILURE = SIGNALLING_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__DEFAULT = SIGNALLING_ACTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = SIGNALLING_ACTION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OPERATION_COUNT = SIGNALLING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.RedirectImpl <em>Redirect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.RedirectImpl
	 * @see CPL2.impl.CPLPackageImpl#getRedirect()
	 * @generated
	 */
	int REDIRECT = 31;

	/**
	 * The feature id for the '<em><b>Permanent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT__PERMANENT = SIGNALLING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Redirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_FEATURE_COUNT = SIGNALLING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Redirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_OPERATION_COUNT = SIGNALLING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPL2.impl.RejectImpl <em>Reject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPL2.impl.RejectImpl
	 * @see CPL2.impl.CPLPackageImpl#getReject()
	 * @generated
	 */
	int REJECT = 32;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT__STATUS = SIGNALLING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT__REASON = SIGNALLING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_FEATURE_COUNT = SIGNALLING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_OPERATION_COUNT = SIGNALLING_ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CPL.CPLModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see CPL.CPLModel
	 * @generated
	 */
	EClass getCPLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link CPL.CPLModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see CPL.CPLModel#getElements()
	 * @see #getCPLModel()
	 * @generated
	 */
	EReference getCPLModel_Elements();

	/**
	 * Returns the meta object for class '{@link CPL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CPL.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link CPL.CPL <em>CPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPL</em>'.
	 * @see CPL.CPL
	 * @generated
	 */
	EClass getCPL();

	/**
	 * Returns the meta object for the containment reference list '{@link CPL.CPL#getSubActions <em>Sub Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Actions</em>'.
	 * @see CPL.CPL#getSubActions()
	 * @see #getCPL()
	 * @generated
	 */
	EReference getCPL_SubActions();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.CPL#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outgoing</em>'.
	 * @see CPL.CPL#getOutgoing()
	 * @see #getCPL()
	 * @generated
	 */
	EReference getCPL_Outgoing();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.CPL#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incoming</em>'.
	 * @see CPL.CPL#getIncoming()
	 * @see #getCPL()
	 * @generated
	 */
	EReference getCPL_Incoming();

	/**
	 * Returns the meta object for class '{@link CPL.NodeContainer <em>Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Container</em>'.
	 * @see CPL.NodeContainer
	 * @generated
	 */
	EClass getNodeContainer();

	/**
	 * Returns the meta object for the reference '{@link CPL.NodeContainer#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contents</em>'.
	 * @see CPL.NodeContainer#getContents()
	 * @see #getNodeContainer()
	 * @generated
	 */
	EReference getNodeContainer_Contents();

	/**
	 * Returns the meta object for class '{@link CPL.SubAction <em>Sub Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Action</em>'.
	 * @see CPL.SubAction
	 * @generated
	 */
	EClass getSubAction();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SubAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CPL.SubAction#getId()
	 * @see #getSubAction()
	 * @generated
	 */
	EAttribute getSubAction_Id();

	/**
	 * Returns the meta object for class '{@link CPL.Outgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing</em>'.
	 * @see CPL.Outgoing
	 * @generated
	 */
	EClass getOutgoing();

	/**
	 * Returns the meta object for class '{@link CPL.Incoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming</em>'.
	 * @see CPL.Incoming
	 * @generated
	 */
	EClass getIncoming();

	/**
	 * Returns the meta object for class '{@link CPL.NotPresent <em>Not Present</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Present</em>'.
	 * @see CPL.NotPresent
	 * @generated
	 */
	EClass getNotPresent();

	/**
	 * Returns the meta object for class '{@link CPL.Otherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Otherwise</em>'.
	 * @see CPL.Otherwise
	 * @generated
	 */
	EClass getOtherwise();

	/**
	 * Returns the meta object for class '{@link CPL.SwitchedAddress <em>Switched Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switched Address</em>'.
	 * @see CPL.SwitchedAddress
	 * @generated
	 */
	EClass getSwitchedAddress();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedAddress#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is</em>'.
	 * @see CPL.SwitchedAddress#getIs()
	 * @see #getSwitchedAddress()
	 * @generated
	 */
	EAttribute getSwitchedAddress_Is();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedAddress#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains</em>'.
	 * @see CPL.SwitchedAddress#getContains()
	 * @see #getSwitchedAddress()
	 * @generated
	 */
	EAttribute getSwitchedAddress_Contains();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedAddress#getSubDomainOf <em>Sub Domain Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Domain Of</em>'.
	 * @see CPL.SwitchedAddress#getSubDomainOf()
	 * @see #getSwitchedAddress()
	 * @generated
	 */
	EAttribute getSwitchedAddress_SubDomainOf();

	/**
	 * Returns the meta object for class '{@link CPL.SwitchedString <em>Switched String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switched String</em>'.
	 * @see CPL.SwitchedString
	 * @generated
	 */
	EClass getSwitchedString();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedString#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is</em>'.
	 * @see CPL.SwitchedString#getIs()
	 * @see #getSwitchedString()
	 * @generated
	 */
	EAttribute getSwitchedString_Is();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedString#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains</em>'.
	 * @see CPL.SwitchedString#getContains()
	 * @see #getSwitchedString()
	 * @generated
	 */
	EAttribute getSwitchedString_Contains();

	/**
	 * Returns the meta object for class '{@link CPL.SwitchedLanguage <em>Switched Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switched Language</em>'.
	 * @see CPL.SwitchedLanguage
	 * @generated
	 */
	EClass getSwitchedLanguage();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedLanguage#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matches</em>'.
	 * @see CPL.SwitchedLanguage#getMatches()
	 * @see #getSwitchedLanguage()
	 * @generated
	 */
	EAttribute getSwitchedLanguage_Matches();

	/**
	 * Returns the meta object for class '{@link CPL.SwitchedTime <em>Switched Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switched Time</em>'.
	 * @see CPL.SwitchedTime
	 * @generated
	 */
	EClass getSwitchedTime();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see CPL.SwitchedTime#getDtstart()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getDtend <em>Dtend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtend</em>'.
	 * @see CPL.SwitchedTime#getDtend()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Dtend();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see CPL.SwitchedTime#getDuration()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Duration();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getFreq <em>Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq</em>'.
	 * @see CPL.SwitchedTime#getFreq()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Freq();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until</em>'.
	 * @see CPL.SwitchedTime#getUntil()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Until();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see CPL.SwitchedTime#getCount()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Count();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see CPL.SwitchedTime#getInterval()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Interval();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getBySecond <em>By Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Second</em>'.
	 * @see CPL.SwitchedTime#getBySecond()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_BySecond();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getByMinute <em>By Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Minute</em>'.
	 * @see CPL.SwitchedTime#getByMinute()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_ByMinute();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getByHour <em>By Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Hour</em>'.
	 * @see CPL.SwitchedTime#getByHour()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_ByHour();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getByDay <em>By Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Day</em>'.
	 * @see CPL.SwitchedTime#getByDay()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_ByDay();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getByMonthDay <em>By Month Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Month Day</em>'.
	 * @see CPL.SwitchedTime#getByMonthDay()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_ByMonthDay();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getByYearDay <em>By Year Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Year Day</em>'.
	 * @see CPL.SwitchedTime#getByYearDay()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_ByYearDay();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getByWeekNo <em>By Week No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Week No</em>'.
	 * @see CPL.SwitchedTime#getByWeekNo()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_ByWeekNo();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getByMonth <em>By Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Month</em>'.
	 * @see CPL.SwitchedTime#getByMonth()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_ByMonth();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getWkst <em>Wkst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wkst</em>'.
	 * @see CPL.SwitchedTime#getWkst()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_Wkst();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedTime#getBySetPos <em>By Set Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Set Pos</em>'.
	 * @see CPL.SwitchedTime#getBySetPos()
	 * @see #getSwitchedTime()
	 * @generated
	 */
	EAttribute getSwitchedTime_BySetPos();

	/**
	 * Returns the meta object for class '{@link CPL.SwitchedPriority <em>Switched Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switched Priority</em>'.
	 * @see CPL.SwitchedPriority
	 * @generated
	 */
	EClass getSwitchedPriority();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedPriority#getLess <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Less</em>'.
	 * @see CPL.SwitchedPriority#getLess()
	 * @see #getSwitchedPriority()
	 * @generated
	 */
	EAttribute getSwitchedPriority_Less();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedPriority#getGreater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greater</em>'.
	 * @see CPL.SwitchedPriority#getGreater()
	 * @see #getSwitchedPriority()
	 * @generated
	 */
	EAttribute getSwitchedPriority_Greater();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SwitchedPriority#getEqual <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equal</em>'.
	 * @see CPL.SwitchedPriority#getEqual()
	 * @see #getSwitchedPriority()
	 * @generated
	 */
	EAttribute getSwitchedPriority_Equal();

	/**
	 * Returns the meta object for class '{@link CPL.Busy <em>Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Busy</em>'.
	 * @see CPL.Busy
	 * @generated
	 */
	EClass getBusy();

	/**
	 * Returns the meta object for class '{@link CPL.NoAnswer <em>No Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Answer</em>'.
	 * @see CPL.NoAnswer
	 * @generated
	 */
	EClass getNoAnswer();

	/**
	 * Returns the meta object for class '{@link CPL.Redirection <em>Redirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redirection</em>'.
	 * @see CPL.Redirection
	 * @generated
	 */
	EClass getRedirection();

	/**
	 * Returns the meta object for class '{@link CPL.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see CPL.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the meta object for class '{@link CPL.Default <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default</em>'.
	 * @see CPL.Default
	 * @generated
	 */
	EClass getDefault();

	/**
	 * Returns the meta object for class '{@link CPL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see CPL.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link CPL.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see CPL.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.Switch#getNotPresent <em>Not Present</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Present</em>'.
	 * @see CPL.Switch#getNotPresent()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_NotPresent();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.Switch#getOtherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otherwise</em>'.
	 * @see CPL.Switch#getOtherwise()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Otherwise();

	/**
	 * Returns the meta object for class '{@link CPL.AddressSwitch <em>Address Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Switch</em>'.
	 * @see CPL.AddressSwitch
	 * @generated
	 */
	EClass getAddressSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CPL.AddressSwitch#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see CPL.AddressSwitch#getField()
	 * @see #getAddressSwitch()
	 * @generated
	 */
	EAttribute getAddressSwitch_Field();

	/**
	 * Returns the meta object for the attribute '{@link CPL.AddressSwitch#getSubField <em>Sub Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Field</em>'.
	 * @see CPL.AddressSwitch#getSubField()
	 * @see #getAddressSwitch()
	 * @generated
	 */
	EAttribute getAddressSwitch_SubField();

	/**
	 * Returns the meta object for the containment reference list '{@link CPL.AddressSwitch#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see CPL.AddressSwitch#getAddresses()
	 * @see #getAddressSwitch()
	 * @generated
	 */
	EReference getAddressSwitch_Addresses();

	/**
	 * Returns the meta object for class '{@link CPL.StringSwitch <em>String Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Switch</em>'.
	 * @see CPL.StringSwitch
	 * @generated
	 */
	EClass getStringSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CPL.StringSwitch#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see CPL.StringSwitch#getField()
	 * @see #getStringSwitch()
	 * @generated
	 */
	EAttribute getStringSwitch_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link CPL.StringSwitch#getStrings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strings</em>'.
	 * @see CPL.StringSwitch#getStrings()
	 * @see #getStringSwitch()
	 * @generated
	 */
	EReference getStringSwitch_Strings();

	/**
	 * Returns the meta object for class '{@link CPL.LanguageSwitch <em>Language Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Switch</em>'.
	 * @see CPL.LanguageSwitch
	 * @generated
	 */
	EClass getLanguageSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link CPL.LanguageSwitch#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see CPL.LanguageSwitch#getLanguages()
	 * @see #getLanguageSwitch()
	 * @generated
	 */
	EReference getLanguageSwitch_Languages();

	/**
	 * Returns the meta object for class '{@link CPL.TimeSwitch <em>Time Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Switch</em>'.
	 * @see CPL.TimeSwitch
	 * @generated
	 */
	EClass getTimeSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CPL.TimeSwitch#getTzid <em>Tzid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzid</em>'.
	 * @see CPL.TimeSwitch#getTzid()
	 * @see #getTimeSwitch()
	 * @generated
	 */
	EAttribute getTimeSwitch_Tzid();

	/**
	 * Returns the meta object for the attribute '{@link CPL.TimeSwitch#getTzurl <em>Tzurl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzurl</em>'.
	 * @see CPL.TimeSwitch#getTzurl()
	 * @see #getTimeSwitch()
	 * @generated
	 */
	EAttribute getTimeSwitch_Tzurl();

	/**
	 * Returns the meta object for the containment reference list '{@link CPL.TimeSwitch#getTimes <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Times</em>'.
	 * @see CPL.TimeSwitch#getTimes()
	 * @see #getTimeSwitch()
	 * @generated
	 */
	EReference getTimeSwitch_Times();

	/**
	 * Returns the meta object for class '{@link CPL.PrioritySwitch <em>Priority Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Switch</em>'.
	 * @see CPL.PrioritySwitch
	 * @generated
	 */
	EClass getPrioritySwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link CPL.PrioritySwitch#getPriorities <em>Priorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Priorities</em>'.
	 * @see CPL.PrioritySwitch#getPriorities()
	 * @see #getPrioritySwitch()
	 * @generated
	 */
	EReference getPrioritySwitch_Priorities();

	/**
	 * Returns the meta object for class '{@link CPL.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see CPL.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Location#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CPL.Location#getUrl()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Url();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Location#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CPL.Location#getPriority()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Priority();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Location#getClear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear</em>'.
	 * @see CPL.Location#getClear()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Clear();

	/**
	 * Returns the meta object for class '{@link CPL.SubCall <em>Sub Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Call</em>'.
	 * @see CPL.SubCall
	 * @generated
	 */
	EClass getSubCall();

	/**
	 * Returns the meta object for the attribute '{@link CPL.SubCall#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see CPL.SubCall#getRef()
	 * @see #getSubCall()
	 * @generated
	 */
	EAttribute getSubCall_Ref();

	/**
	 * Returns the meta object for class '{@link CPL.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see CPL.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link CPL.SignallingAction <em>Signalling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalling Action</em>'.
	 * @see CPL.SignallingAction
	 * @generated
	 */
	EClass getSignallingAction();

	/**
	 * Returns the meta object for class '{@link CPL.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see CPL.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Proxy#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see CPL.Proxy#getTimeout()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Proxy#getRecurse <em>Recurse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurse</em>'.
	 * @see CPL.Proxy#getRecurse()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Recurse();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Proxy#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see CPL.Proxy#getOrdering()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Ordering();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.Proxy#getBusy <em>Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Busy</em>'.
	 * @see CPL.Proxy#getBusy()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Busy();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.Proxy#getNoAnswer <em>No Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Answer</em>'.
	 * @see CPL.Proxy#getNoAnswer()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_NoAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.Proxy#getRedirection <em>Redirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Redirection</em>'.
	 * @see CPL.Proxy#getRedirection()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Redirection();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.Proxy#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure</em>'.
	 * @see CPL.Proxy#getFailure()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Failure();

	/**
	 * Returns the meta object for the containment reference '{@link CPL.Proxy#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see CPL.Proxy#getDefault()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Default();

	/**
	 * Returns the meta object for class '{@link CPL.Redirect <em>Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redirect</em>'.
	 * @see CPL.Redirect
	 * @generated
	 */
	EClass getRedirect();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Redirect#getPermanent <em>Permanent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permanent</em>'.
	 * @see CPL.Redirect#getPermanent()
	 * @see #getRedirect()
	 * @generated
	 */
	EAttribute getRedirect_Permanent();

	/**
	 * Returns the meta object for class '{@link CPL.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reject</em>'.
	 * @see CPL.Reject
	 * @generated
	 */
	EClass getReject();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Reject#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see CPL.Reject#getStatus()
	 * @see #getReject()
	 * @generated
	 */
	EAttribute getReject_Status();

	/**
	 * Returns the meta object for the attribute '{@link CPL.Reject#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CPL.Reject#getReason()
	 * @see #getReject()
	 * @generated
	 */
	EAttribute getReject_Reason();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CPLFactory getCPLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CPL2.impl.CPLModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.CPLModelImpl
		 * @see CPL2.impl.CPLPackageImpl#getCPLModel()
		 * @generated
		 */
		EClass CPL_MODEL = eINSTANCE.getCPLModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPL_MODEL__ELEMENTS = eINSTANCE.getCPLModel_Elements();

		/**
		 * The meta object literal for the '{@link CPL2.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.ElementImpl
		 * @see CPL2.impl.CPLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link CPL2.impl.CPLImpl <em>CPL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.CPLImpl
		 * @see CPL2.impl.CPLPackageImpl#getCPL()
		 * @generated
		 */
		EClass CPL = eINSTANCE.getCPL();

		/**
		 * The meta object literal for the '<em><b>Sub Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPL__SUB_ACTIONS = eINSTANCE.getCPL_SubActions();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPL__OUTGOING = eINSTANCE.getCPL_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPL__INCOMING = eINSTANCE.getCPL_Incoming();

		/**
		 * The meta object literal for the '{@link CPL2.impl.NodeContainerImpl <em>Node Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.NodeContainerImpl
		 * @see CPL2.impl.CPLPackageImpl#getNodeContainer()
		 * @generated
		 */
		EClass NODE_CONTAINER = eINSTANCE.getNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONTAINER__CONTENTS = eINSTANCE.getNodeContainer_Contents();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SubActionImpl <em>Sub Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SubActionImpl
		 * @see CPL2.impl.CPLPackageImpl#getSubAction()
		 * @generated
		 */
		EClass SUB_ACTION = eINSTANCE.getSubAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ACTION__ID = eINSTANCE.getSubAction_Id();

		/**
		 * The meta object literal for the '{@link CPL2.impl.OutgoingImpl <em>Outgoing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.OutgoingImpl
		 * @see CPL2.impl.CPLPackageImpl#getOutgoing()
		 * @generated
		 */
		EClass OUTGOING = eINSTANCE.getOutgoing();

		/**
		 * The meta object literal for the '{@link CPL2.impl.IncomingImpl <em>Incoming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.IncomingImpl
		 * @see CPL2.impl.CPLPackageImpl#getIncoming()
		 * @generated
		 */
		EClass INCOMING = eINSTANCE.getIncoming();

		/**
		 * The meta object literal for the '{@link CPL2.impl.NotPresentImpl <em>Not Present</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.NotPresentImpl
		 * @see CPL2.impl.CPLPackageImpl#getNotPresent()
		 * @generated
		 */
		EClass NOT_PRESENT = eINSTANCE.getNotPresent();

		/**
		 * The meta object literal for the '{@link CPL2.impl.OtherwiseImpl <em>Otherwise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.OtherwiseImpl
		 * @see CPL2.impl.CPLPackageImpl#getOtherwise()
		 * @generated
		 */
		EClass OTHERWISE = eINSTANCE.getOtherwise();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SwitchedAddressImpl <em>Switched Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SwitchedAddressImpl
		 * @see CPL2.impl.CPLPackageImpl#getSwitchedAddress()
		 * @generated
		 */
		EClass SWITCHED_ADDRESS = eINSTANCE.getSwitchedAddress();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_ADDRESS__IS = eINSTANCE.getSwitchedAddress_Is();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_ADDRESS__CONTAINS = eINSTANCE.getSwitchedAddress_Contains();

		/**
		 * The meta object literal for the '<em><b>Sub Domain Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_ADDRESS__SUB_DOMAIN_OF = eINSTANCE.getSwitchedAddress_SubDomainOf();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SwitchedStringImpl <em>Switched String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SwitchedStringImpl
		 * @see CPL2.impl.CPLPackageImpl#getSwitchedString()
		 * @generated
		 */
		EClass SWITCHED_STRING = eINSTANCE.getSwitchedString();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_STRING__IS = eINSTANCE.getSwitchedString_Is();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_STRING__CONTAINS = eINSTANCE.getSwitchedString_Contains();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SwitchedLanguageImpl <em>Switched Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SwitchedLanguageImpl
		 * @see CPL2.impl.CPLPackageImpl#getSwitchedLanguage()
		 * @generated
		 */
		EClass SWITCHED_LANGUAGE = eINSTANCE.getSwitchedLanguage();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_LANGUAGE__MATCHES = eINSTANCE.getSwitchedLanguage_Matches();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SwitchedTimeImpl <em>Switched Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SwitchedTimeImpl
		 * @see CPL2.impl.CPLPackageImpl#getSwitchedTime()
		 * @generated
		 */
		EClass SWITCHED_TIME = eINSTANCE.getSwitchedTime();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__DTSTART = eINSTANCE.getSwitchedTime_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Dtend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__DTEND = eINSTANCE.getSwitchedTime_Dtend();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__DURATION = eINSTANCE.getSwitchedTime_Duration();

		/**
		 * The meta object literal for the '<em><b>Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__FREQ = eINSTANCE.getSwitchedTime_Freq();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__UNTIL = eINSTANCE.getSwitchedTime_Until();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__COUNT = eINSTANCE.getSwitchedTime_Count();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__INTERVAL = eINSTANCE.getSwitchedTime_Interval();

		/**
		 * The meta object literal for the '<em><b>By Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_SECOND = eINSTANCE.getSwitchedTime_BySecond();

		/**
		 * The meta object literal for the '<em><b>By Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_MINUTE = eINSTANCE.getSwitchedTime_ByMinute();

		/**
		 * The meta object literal for the '<em><b>By Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_HOUR = eINSTANCE.getSwitchedTime_ByHour();

		/**
		 * The meta object literal for the '<em><b>By Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_DAY = eINSTANCE.getSwitchedTime_ByDay();

		/**
		 * The meta object literal for the '<em><b>By Month Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_MONTH_DAY = eINSTANCE.getSwitchedTime_ByMonthDay();

		/**
		 * The meta object literal for the '<em><b>By Year Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_YEAR_DAY = eINSTANCE.getSwitchedTime_ByYearDay();

		/**
		 * The meta object literal for the '<em><b>By Week No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_WEEK_NO = eINSTANCE.getSwitchedTime_ByWeekNo();

		/**
		 * The meta object literal for the '<em><b>By Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_MONTH = eINSTANCE.getSwitchedTime_ByMonth();

		/**
		 * The meta object literal for the '<em><b>Wkst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__WKST = eINSTANCE.getSwitchedTime_Wkst();

		/**
		 * The meta object literal for the '<em><b>By Set Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_TIME__BY_SET_POS = eINSTANCE.getSwitchedTime_BySetPos();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SwitchedPriorityImpl <em>Switched Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SwitchedPriorityImpl
		 * @see CPL2.impl.CPLPackageImpl#getSwitchedPriority()
		 * @generated
		 */
		EClass SWITCHED_PRIORITY = eINSTANCE.getSwitchedPriority();

		/**
		 * The meta object literal for the '<em><b>Less</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_PRIORITY__LESS = eINSTANCE.getSwitchedPriority_Less();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_PRIORITY__GREATER = eINSTANCE.getSwitchedPriority_Greater();

		/**
		 * The meta object literal for the '<em><b>Equal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHED_PRIORITY__EQUAL = eINSTANCE.getSwitchedPriority_Equal();

		/**
		 * The meta object literal for the '{@link CPL2.impl.BusyImpl <em>Busy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.BusyImpl
		 * @see CPL2.impl.CPLPackageImpl#getBusy()
		 * @generated
		 */
		EClass BUSY = eINSTANCE.getBusy();

		/**
		 * The meta object literal for the '{@link CPL2.impl.NoAnswerImpl <em>No Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.NoAnswerImpl
		 * @see CPL2.impl.CPLPackageImpl#getNoAnswer()
		 * @generated
		 */
		EClass NO_ANSWER = eINSTANCE.getNoAnswer();

		/**
		 * The meta object literal for the '{@link CPL2.impl.RedirectionImpl <em>Redirection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.RedirectionImpl
		 * @see CPL2.impl.CPLPackageImpl#getRedirection()
		 * @generated
		 */
		EClass REDIRECTION = eINSTANCE.getRedirection();

		/**
		 * The meta object literal for the '{@link CPL2.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.FailureImpl
		 * @see CPL2.impl.CPLPackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

		/**
		 * The meta object literal for the '{@link CPL2.impl.DefaultImpl <em>Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.DefaultImpl
		 * @see CPL2.impl.CPLPackageImpl#getDefault()
		 * @generated
		 */
		EClass DEFAULT = eINSTANCE.getDefault();

		/**
		 * The meta object literal for the '{@link CPL2.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.NodeImpl
		 * @see CPL2.impl.CPLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SwitchImpl
		 * @see CPL2.impl.CPLPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Not Present</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__NOT_PRESENT = eINSTANCE.getSwitch_NotPresent();

		/**
		 * The meta object literal for the '<em><b>Otherwise</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__OTHERWISE = eINSTANCE.getSwitch_Otherwise();

		/**
		 * The meta object literal for the '{@link CPL2.impl.AddressSwitchImpl <em>Address Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.AddressSwitchImpl
		 * @see CPL2.impl.CPLPackageImpl#getAddressSwitch()
		 * @generated
		 */
		EClass ADDRESS_SWITCH = eINSTANCE.getAddressSwitch();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SWITCH__FIELD = eINSTANCE.getAddressSwitch_Field();

		/**
		 * The meta object literal for the '<em><b>Sub Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SWITCH__SUB_FIELD = eINSTANCE.getAddressSwitch_SubField();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_SWITCH__ADDRESSES = eINSTANCE.getAddressSwitch_Addresses();

		/**
		 * The meta object literal for the '{@link CPL2.impl.StringSwitchImpl <em>String Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.StringSwitchImpl
		 * @see CPL2.impl.CPLPackageImpl#getStringSwitch()
		 * @generated
		 */
		EClass STRING_SWITCH = eINSTANCE.getStringSwitch();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_SWITCH__FIELD = eINSTANCE.getStringSwitch_Field();

		/**
		 * The meta object literal for the '<em><b>Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_SWITCH__STRINGS = eINSTANCE.getStringSwitch_Strings();

		/**
		 * The meta object literal for the '{@link CPL2.impl.LanguageSwitchImpl <em>Language Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.LanguageSwitchImpl
		 * @see CPL2.impl.CPLPackageImpl#getLanguageSwitch()
		 * @generated
		 */
		EClass LANGUAGE_SWITCH = eINSTANCE.getLanguageSwitch();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_SWITCH__LANGUAGES = eINSTANCE.getLanguageSwitch_Languages();

		/**
		 * The meta object literal for the '{@link CPL2.impl.TimeSwitchImpl <em>Time Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.TimeSwitchImpl
		 * @see CPL2.impl.CPLPackageImpl#getTimeSwitch()
		 * @generated
		 */
		EClass TIME_SWITCH = eINSTANCE.getTimeSwitch();

		/**
		 * The meta object literal for the '<em><b>Tzid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SWITCH__TZID = eINSTANCE.getTimeSwitch_Tzid();

		/**
		 * The meta object literal for the '<em><b>Tzurl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SWITCH__TZURL = eINSTANCE.getTimeSwitch_Tzurl();

		/**
		 * The meta object literal for the '<em><b>Times</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SWITCH__TIMES = eINSTANCE.getTimeSwitch_Times();

		/**
		 * The meta object literal for the '{@link CPL2.impl.PrioritySwitchImpl <em>Priority Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.PrioritySwitchImpl
		 * @see CPL2.impl.CPLPackageImpl#getPrioritySwitch()
		 * @generated
		 */
		EClass PRIORITY_SWITCH = eINSTANCE.getPrioritySwitch();

		/**
		 * The meta object literal for the '<em><b>Priorities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIORITY_SWITCH__PRIORITIES = eINSTANCE.getPrioritySwitch_Priorities();

		/**
		 * The meta object literal for the '{@link CPL2.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.LocationImpl
		 * @see CPL2.impl.CPLPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__URL = eINSTANCE.getLocation_Url();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__PRIORITY = eINSTANCE.getLocation_Priority();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CLEAR = eINSTANCE.getLocation_Clear();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SubCallImpl <em>Sub Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SubCallImpl
		 * @see CPL2.impl.CPLPackageImpl#getSubCall()
		 * @generated
		 */
		EClass SUB_CALL = eINSTANCE.getSubCall();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_CALL__REF = eINSTANCE.getSubCall_Ref();

		/**
		 * The meta object literal for the '{@link CPL2.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.ActionImpl
		 * @see CPL2.impl.CPLPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link CPL2.impl.SignallingActionImpl <em>Signalling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.SignallingActionImpl
		 * @see CPL2.impl.CPLPackageImpl#getSignallingAction()
		 * @generated
		 */
		EClass SIGNALLING_ACTION = eINSTANCE.getSignallingAction();

		/**
		 * The meta object literal for the '{@link CPL2.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.ProxyImpl
		 * @see CPL2.impl.CPLPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__TIMEOUT = eINSTANCE.getProxy_Timeout();

		/**
		 * The meta object literal for the '<em><b>Recurse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__RECURSE = eINSTANCE.getProxy_Recurse();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__ORDERING = eINSTANCE.getProxy_Ordering();

		/**
		 * The meta object literal for the '<em><b>Busy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__BUSY = eINSTANCE.getProxy_Busy();

		/**
		 * The meta object literal for the '<em><b>No Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__NO_ANSWER = eINSTANCE.getProxy_NoAnswer();

		/**
		 * The meta object literal for the '<em><b>Redirection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__REDIRECTION = eINSTANCE.getProxy_Redirection();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__FAILURE = eINSTANCE.getProxy_Failure();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__DEFAULT = eINSTANCE.getProxy_Default();

		/**
		 * The meta object literal for the '{@link CPL2.impl.RedirectImpl <em>Redirect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.RedirectImpl
		 * @see CPL2.impl.CPLPackageImpl#getRedirect()
		 * @generated
		 */
		EClass REDIRECT = eINSTANCE.getRedirect();

		/**
		 * The meta object literal for the '<em><b>Permanent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDIRECT__PERMANENT = eINSTANCE.getRedirect_Permanent();

		/**
		 * The meta object literal for the '{@link CPL2.impl.RejectImpl <em>Reject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPL2.impl.RejectImpl
		 * @see CPL2.impl.CPLPackageImpl#getReject()
		 * @generated
		 */
		EClass REJECT = eINSTANCE.getReject();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REJECT__STATUS = eINSTANCE.getReject_Status();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REJECT__REASON = eINSTANCE.getReject_Reason();

	}

} //CPLPackage
