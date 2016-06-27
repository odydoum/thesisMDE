/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Action Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.HTTPActionHandler#getName <em>Name</em>}</li>
 *   <li>{@link PSM.HTTPActionHandler#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}</li>
 *   <li>{@link PSM.HTTPActionHandler#getUsesEntityActivity <em>Uses Entity Activity</em>}</li>
 *   <li>{@link PSM.HTTPActionHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getHTTPActionHandler()
 * @model
 * @generated
 */
public interface HTTPActionHandler extends EObject {
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
	 * @see PSM.PSMPackage#getHTTPActionHandler_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.HTTPActionHandler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Handler HTTP Verb</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link PSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #setHandlerHTTPVerb(HTTPVerb)
	 * @see PSM.PSMPackage#getHTTPActionHandler_HandlerHTTPVerb()
	 * @model default="GET" required="true"
	 * @generated
	 */
	HTTPVerb getHandlerHTTPVerb();

	/**
	 * Sets the value of the '{@link PSM.HTTPActionHandler#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #getHandlerHTTPVerb()
	 * @generated
	 */
	void setHandlerHTTPVerb(HTTPVerb value);

	/**
	 * Returns the value of the '<em><b>Uses Entity Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Entity Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Entity Activity</em>' reference.
	 * @see #setUsesEntityActivity(EntityActivity)
	 * @see PSM.PSMPackage#getHTTPActionHandler_UsesEntityActivity()
	 * @model
	 * @generated
	 */
	EntityActivity getUsesEntityActivity();

	/**
	 * Sets the value of the '{@link PSM.HTTPActionHandler#getUsesEntityActivity <em>Uses Entity Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Entity Activity</em>' reference.
	 * @see #getUsesEntityActivity()
	 * @generated
	 */
	void setUsesEntityActivity(EntityActivity value);

	/**
	 * Returns the value of the '<em><b>Has Hypermedia Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Hypermedia Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Hypermedia Function</em>' containment reference.
	 * @see #setHasHypermediaFunction(CreateHypermediaFunction)
	 * @see PSM.PSMPackage#getHTTPActionHandler_HasHypermediaFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CreateHypermediaFunction getHasHypermediaFunction();

	/**
	 * Sets the value of the '{@link PSM.HTTPActionHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Hypermedia Function</em>' containment reference.
	 * @see #getHasHypermediaFunction()
	 * @generated
	 */
	void setHasHypermediaFunction(CreateHypermediaFunction value);

} // HTTPActionHandler
