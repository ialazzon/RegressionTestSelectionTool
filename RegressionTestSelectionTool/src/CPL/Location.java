/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.Location#getUrl <em>Url</em>}</li>
 *   <li>{@link CPL.Location#getPriority <em>Priority</em>}</li>
 *   <li>{@link CPL.Location#getClear <em>Clear</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Node, NodeContainer {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see CPL.CPLPackage#getLocation_Url()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link CPL.Location#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see CPL.CPLPackage#getLocation_Priority()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link CPL.Location#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear</em>' attribute.
	 * @see #setClear(String)
	 * @see CPL.CPLPackage#getLocation_Clear()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getClear();

	/**
	 * Sets the value of the '{@link CPL.Location#getClear <em>Clear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear</em>' attribute.
	 * @see #getClear()
	 * @generated
	 */
	void setClear(String value);

} // Location
