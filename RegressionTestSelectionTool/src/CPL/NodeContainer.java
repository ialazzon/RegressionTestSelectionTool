/**
 */
package CPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CPL.NodeContainer#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see CPL.CPLPackage#getNodeContainer()
 * @model abstract="true"
 * @generated
 */
public interface NodeContainer extends Element {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference.
	 * @see #setContents(Node)
	 * @see CPL.CPLPackage#getNodeContainer_Contents()
	 * @model ordered="false"
	 * @generated
	 */
	Node getContents();

	/**
	 * Sets the value of the '{@link CPL.NodeContainer#getContents <em>Contents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(Node value);

} // NodeContainer
