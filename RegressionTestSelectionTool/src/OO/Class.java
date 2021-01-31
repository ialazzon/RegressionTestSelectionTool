/**
 */
package OO;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OO.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link OO.Class#getExtendedBy <em>Extended By</em>}</li>
 *   <li>{@link OO.Class#getFeatures <em>Features</em>}</li>
 *   <li>{@link OO.Class#getIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see OO.OOPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OO.Class#getExtendedBy <em>Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Class)
	 * @see OO.OOPackage#getClass_Extends()
	 * @see OO.Class#getExtendedBy
	 * @model opposite="extendedBy"
	 * @generated
	 */
	Class getExtends();

	/**
	 * Sets the value of the '{@link OO.Class#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Class value);

	/**
	 * Returns the value of the '<em><b>Extended By</b></em>' reference list.
	 * The list contents are of type {@link OO.Class}.
	 * It is bidirectional and its opposite is '{@link OO.Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended By</em>' reference list.
	 * @see OO.OOPackage#getClass_ExtendedBy()
	 * @see OO.Class#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Class> getExtendedBy();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link OO.Feature}.
	 * It is bidirectional and its opposite is '{@link OO.Feature#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see OO.OOPackage#getClass_Features()
	 * @see OO.Feature#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see OO.OOPackage#getClass_IsAbstract()
	 * @model
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link OO.Class#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

} // Class
