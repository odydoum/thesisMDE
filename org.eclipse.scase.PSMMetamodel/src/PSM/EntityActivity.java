/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.EntityActivity#getName <em>Name</em>}</li>
 *   <li>{@link PSM.EntityActivity#getEntityActivityHTTPVerb <em>Entity Activity HTTP Verb</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getEntityActivity()
 * @model
 * @generated
 */
public interface EntityActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PSM.PSMPackage#getEntityActivity_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.EntityActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity Activity HTTP Verb</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link PSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Activity HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Activity HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #setEntityActivityHTTPVerb(HTTPVerb)
	 * @see PSM.PSMPackage#getEntityActivity_EntityActivityHTTPVerb()
	 * @model default="GET" required="true"
	 * @generated
	 */
	HTTPVerb getEntityActivityHTTPVerb();

	/**
	 * Sets the value of the '{@link PSM.EntityActivity#getEntityActivityHTTPVerb <em>Entity Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Activity HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #getEntityActivityHTTPVerb()
	 * @generated
	 */
	void setEntityActivityHTTPVerb(HTTPVerb value);

} // EntityActivity
