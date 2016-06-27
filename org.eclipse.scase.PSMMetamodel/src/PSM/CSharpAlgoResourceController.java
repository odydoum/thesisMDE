/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSharp Algo Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.CSharpAlgoResourceController#getHasAssociatedCSharpAlgoModel <em>Has Associated CSharp Algo Model</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceController#getCSharpAlgoRChasHTTPAction <em>CSharp Algo RChas HTTP Action</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceController#getName <em>Name</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceController#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceController#getCSharpAlgoRControllerHasARAnnotation <em>CSharp Algo RController Has AR Annotation</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceController#getControllerURI <em>Controller URI</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getCSharpAlgoResourceController()
 * @model
 * @generated
 */
public interface CSharpAlgoResourceController extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Associated CSharp Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated CSharp Algo Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated CSharp Algo Model</em>' reference.
	 * @see #setHasAssociatedCSharpAlgoModel(CSharpAlgoResourceModel)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceController_HasAssociatedCSharpAlgoModel()
	 * @model required="true"
	 * @generated
	 */
	CSharpAlgoResourceModel getHasAssociatedCSharpAlgoModel();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceController#getHasAssociatedCSharpAlgoModel <em>Has Associated CSharp Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated CSharp Algo Model</em>' reference.
	 * @see #getHasAssociatedCSharpAlgoModel()
	 * @generated
	 */
	void setHasAssociatedCSharpAlgoModel(CSharpAlgoResourceModel value);

	/**
	 * Returns the value of the '<em><b>CSharp Algo RChas HTTP Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp Algo RChas HTTP Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp Algo RChas HTTP Action</em>' containment reference.
	 * @see #setCSharpAlgoRChasHTTPAction(HTTPAction)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceController_CSharpAlgoRChasHTTPAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTTPAction getCSharpAlgoRChasHTTPAction();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceController#getCSharpAlgoRChasHTTPAction <em>CSharp Algo RChas HTTP Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp Algo RChas HTTP Action</em>' containment reference.
	 * @see #getCSharpAlgoRChasHTTPAction()
	 * @generated
	 */
	void setCSharpAlgoRChasHTTPAction(HTTPAction value);

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
	 * @see PSM.PSMPackage#getCSharpAlgoResourceController_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Name</em>' attribute.
	 * @see #setParentName(String)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceController_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceController#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>CSharp Algo RController Has AR Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp Algo RController Has AR Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp Algo RController Has AR Annotation</em>' containment reference.
	 * @see #setCSharpAlgoRControllerHasARAnnotation(AttributeRoutingAnnotation)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceController_CSharpAlgoRControllerHasARAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeRoutingAnnotation getCSharpAlgoRControllerHasARAnnotation();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceController#getCSharpAlgoRControllerHasARAnnotation <em>CSharp Algo RController Has AR Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp Algo RController Has AR Annotation</em>' containment reference.
	 * @see #getCSharpAlgoRControllerHasARAnnotation()
	 * @generated
	 */
	void setCSharpAlgoRControllerHasARAnnotation(AttributeRoutingAnnotation value);

	/**
	 * Returns the value of the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller URI</em>' attribute.
	 * @see #setControllerURI(String)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceController_ControllerURI()
	 * @model required="true"
	 * @generated
	 */
	String getControllerURI();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceController#getControllerURI <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller URI</em>' attribute.
	 * @see #getControllerURI()
	 * @generated
	 */
	void setControllerURI(String value);

} // CSharpAlgoResourceController
