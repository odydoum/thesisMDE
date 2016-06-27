/**
 */
package PSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Database Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.EntityDatabaseController#getName <em>Name</em>}</li>
 *   <li>{@link PSM.EntityDatabaseController#getHasEntityActivity <em>Has Entity Activity</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getEntityDatabaseController()
 * @model
 * @generated
 */
public interface EntityDatabaseController extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PSM.PSMPackage#getEntityDatabaseController_Name()
	 * @model default="" id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.EntityDatabaseController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Entity Activity</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.EntityActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Entity Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entity Activity</em>' containment reference list.
	 * @see PSM.PSMPackage#getEntityDatabaseController_HasEntityActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntityActivity> getHasEntityActivity();

} // EntityDatabaseController
