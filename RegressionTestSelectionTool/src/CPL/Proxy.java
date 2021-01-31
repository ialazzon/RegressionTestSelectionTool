/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.Proxy#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link CPL.Proxy#getRecurse <em>Recurse</em>}</li>
 *   <li>{@link CPL.Proxy#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link CPL.Proxy#getBusy <em>Busy</em>}</li>
 *   <li>{@link CPL.Proxy#getNoAnswer <em>No Answer</em>}</li>
 *   <li>{@link CPL.Proxy#getRedirection <em>Redirection</em>}</li>
 *   <li>{@link CPL.Proxy#getFailure <em>Failure</em>}</li>
 *   <li>{@link CPL.Proxy#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getProxy()
 * @model
 * @generated
 */
public interface Proxy extends SignallingAction {
	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see CPL.CPLPackage#getProxy_Timeout()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Recurse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurse</em>' attribute.
	 * @see #setRecurse(String)
	 * @see CPL.CPLPackage#getProxy_Recurse()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRecurse();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getRecurse <em>Recurse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurse</em>' attribute.
	 * @see #getRecurse()
	 * @generated
	 */
	void setRecurse(String value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see #setOrdering(String)
	 * @see CPL.CPLPackage#getProxy_Ordering()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(String value);

	/**
	 * Returns the value of the '<em><b>Busy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busy</em>' containment reference.
	 * @see #setBusy(Busy)
	 * @see CPL.CPLPackage#getProxy_Busy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Busy getBusy();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getBusy <em>Busy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busy</em>' containment reference.
	 * @see #getBusy()
	 * @generated
	 */
	void setBusy(Busy value);

	/**
	 * Returns the value of the '<em><b>No Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Answer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Answer</em>' containment reference.
	 * @see #setNoAnswer(NoAnswer)
	 * @see CPL.CPLPackage#getProxy_NoAnswer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NoAnswer getNoAnswer();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getNoAnswer <em>No Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Answer</em>' containment reference.
	 * @see #getNoAnswer()
	 * @generated
	 */
	void setNoAnswer(NoAnswer value);

	/**
	 * Returns the value of the '<em><b>Redirection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirection</em>' containment reference.
	 * @see #setRedirection(Redirection)
	 * @see CPL.CPLPackage#getProxy_Redirection()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Redirection getRedirection();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getRedirection <em>Redirection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirection</em>' containment reference.
	 * @see #getRedirection()
	 * @generated
	 */
	void setRedirection(Redirection value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference.
	 * @see #setFailure(Failure)
	 * @see CPL.CPLPackage#getProxy_Failure()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getFailure <em>Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' containment reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(Default)
	 * @see CPL.CPLPackage#getProxy_Default()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Default getDefault();

	/**
	 * Sets the value of the '{@link CPL.Proxy#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Default value);

} // Proxy
