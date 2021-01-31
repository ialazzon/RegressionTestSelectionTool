/**
 */
package OO;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OO.Operation#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see OO.OOPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Feature {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link OO.Parameter}.
	 * It is bidirectional and its opposite is '{@link OO.Parameter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see OO.OOPackage#getOperation_Parameters()
	 * @see OO.Parameter#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Operation
