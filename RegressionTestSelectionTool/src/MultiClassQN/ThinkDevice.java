/**
 */
package MultiClassQN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Think Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MultiClassQN.ThinkDevice#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link MultiClassQN.ThinkDevice#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see MultiClassQN.MultiClassQNPackage#getThinkDevice()
 * @model
 * @generated
 */
public interface ThinkDevice extends Node {
	/**
	 * Returns the value of the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Think Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' attribute.
	 * @see #setThinkTime(double)
	 * @see MultiClassQN.MultiClassQNPackage#getThinkDevice_ThinkTime()
	 * @model required="true"
	 * @generated
	 */
	double getThinkTime();

	/**
	 * Sets the value of the '{@link MultiClassQN.ThinkDevice#getThinkTime <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Think Time</em>' attribute.
	 * @see #getThinkTime()
	 * @generated
	 */
	void setThinkTime(double value);

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference.
	 * @see #setWorkload(Workload)
	 * @see MultiClassQN.MultiClassQNPackage#getThinkDevice_Workload()
	 * @model required="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link MultiClassQN.ThinkDevice#getWorkload <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

} // ThinkDevice
