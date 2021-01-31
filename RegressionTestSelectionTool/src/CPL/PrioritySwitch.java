/**
 */
package CPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.PrioritySwitch#getPriorities <em>Priorities</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getPrioritySwitch()
 * @model
 * @generated
 */
public interface PrioritySwitch extends Switch {
	/**
	 * Returns the value of the '<em><b>Priorities</b></em>' containment reference list.
	 * The list contents are of type {@link CPL.SwitchedPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorities</em>' containment reference list.
	 * @see CPL.CPLPackage#getPrioritySwitch_Priorities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchedPriority> getPriorities();

} // PrioritySwitch
