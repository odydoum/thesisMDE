/**
 */
package PSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.HTTPAction#getName <em>Name</em>}</li>
 *   <li>{@link PSM.HTTPAction#getActionHTTPVerb <em>Action HTTP Verb</em>}</li>
 *   <li>{@link PSM.HTTPAction#getHTTPActionURI <em>HTTP Action URI</em>}</li>
 *   <li>{@link PSM.HTTPAction#getHTTPActionHasARAnnotation <em>HTTP Action Has AR Annotation</em>}</li>
 *   <li>{@link PSM.HTTPAction#getHTTPActionHasParameter <em>HTTP Action Has Parameter</em>}</li>
 *   <li>{@link PSM.HTTPAction#getHasHTTPActionHandler <em>Has HTTP Action Handler</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getHTTPAction()
 * @model
 * @generated
 */
public interface HTTPAction extends EObject {
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
	 * @see PSM.PSMPackage#getHTTPAction_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.HTTPAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action HTTP Verb</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link PSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #setActionHTTPVerb(HTTPVerb)
	 * @see PSM.PSMPackage#getHTTPAction_ActionHTTPVerb()
	 * @model default="GET" required="true"
	 * @generated
	 */
	HTTPVerb getActionHTTPVerb();

	/**
	 * Sets the value of the '{@link PSM.HTTPAction#getActionHTTPVerb <em>Action HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #getActionHTTPVerb()
	 * @generated
	 */
	void setActionHTTPVerb(HTTPVerb value);

	/**
	 * Returns the value of the '<em><b>HTTP Action URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Action URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Action URI</em>' attribute.
	 * @see #setHTTPActionURI(String)
	 * @see PSM.PSMPackage#getHTTPAction_HTTPActionURI()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getHTTPActionURI();

	/**
	 * Sets the value of the '{@link PSM.HTTPAction#getHTTPActionURI <em>HTTP Action URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTTP Action URI</em>' attribute.
	 * @see #getHTTPActionURI()
	 * @generated
	 */
	void setHTTPActionURI(String value);

	/**
	 * Returns the value of the '<em><b>HTTP Action Has AR Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.AttributeRoutingAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Action Has AR Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Action Has AR Annotation</em>' containment reference list.
	 * @see PSM.PSMPackage#getHTTPAction_HTTPActionHasARAnnotation()
	 * @model containment="true" required="true" upper="3"
	 * @generated
	 */
	EList<AttributeRoutingAnnotation> getHTTPActionHasARAnnotation();

	/**
	 * Returns the value of the '<em><b>HTTP Action Has Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.FunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Action Has Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Action Has Parameter</em>' containment reference list.
	 * @see PSM.PSMPackage#getHTTPAction_HTTPActionHasParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionParameter> getHTTPActionHasParameter();

	/**
	 * Returns the value of the '<em><b>Has HTTP Action Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has HTTP Action Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has HTTP Action Handler</em>' containment reference.
	 * @see #setHasHTTPActionHandler(HTTPActionHandler)
	 * @see PSM.PSMPackage#getHTTPAction_HasHTTPActionHandler()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTTPActionHandler getHasHTTPActionHandler();

	/**
	 * Sets the value of the '{@link PSM.HTTPAction#getHasHTTPActionHandler <em>Has HTTP Action Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has HTTP Action Handler</em>' containment reference.
	 * @see #getHasHTTPActionHandler()
	 * @generated
	 */
	void setHasHTTPActionHandler(HTTPActionHandler value);

} // HTTPAction
