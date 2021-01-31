/**
 */
package CPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.TimeSwitch#getTzid <em>Tzid</em>}</li>
 *   <li>{@link CPL.TimeSwitch#getTzurl <em>Tzurl</em>}</li>
 *   <li>{@link CPL.TimeSwitch#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getTimeSwitch()
 * @model
 * @generated
 */
public interface TimeSwitch extends Switch {
	/**
	 * Returns the value of the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tzid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzid</em>' attribute.
	 * @see #setTzid(String)
	 * @see CPL.CPLPackage#getTimeSwitch_Tzid()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTzid();

	/**
	 * Sets the value of the '{@link CPL.TimeSwitch#getTzid <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzid</em>' attribute.
	 * @see #getTzid()
	 * @generated
	 */
	void setTzid(String value);

	/**
	 * Returns the value of the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tzurl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzurl</em>' attribute.
	 * @see #setTzurl(String)
	 * @see CPL.CPLPackage#getTimeSwitch_Tzurl()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTzurl();

	/**
	 * Sets the value of the '{@link CPL.TimeSwitch#getTzurl <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzurl</em>' attribute.
	 * @see #getTzurl()
	 * @generated
	 */
	void setTzurl(String value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' containment reference list.
	 * The list contents are of type {@link CPL.SwitchedTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' containment reference list.
	 * @see CPL.CPLPackage#getTimeSwitch_Times()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchedTime> getTimes();

} // TimeSwitch
