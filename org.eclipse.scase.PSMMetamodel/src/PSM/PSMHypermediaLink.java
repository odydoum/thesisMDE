/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypermedia Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.PSMHypermediaLink#getLinkHTTPVerb <em>Link HTTP Verb</em>}</li>
 *   <li>{@link PSM.PSMHypermediaLink#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link PSM.PSMHypermediaLink#getHasTargetCSharpRController <em>Has Target CSharp RController</em>}</li>
 *   <li>{@link PSM.PSMHypermediaLink#getHasTargetCSharpRMController <em>Has Target CSharp RM Controller</em>}</li>
 *   <li>{@link PSM.PSMHypermediaLink#getHasTargetCSharpAlgoRController <em>Has Target CSharp Algo RController</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getPSMHypermediaLink()
 * @model
 * @generated
 */
public interface PSMHypermediaLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Link HTTP Verb</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link PSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #setLinkHTTPVerb(HTTPVerb)
	 * @see PSM.PSMPackage#getPSMHypermediaLink_LinkHTTPVerb()
	 * @model default="GET" unique="false" required="true" ordered="false"
	 * @generated
	 */
	HTTPVerb getLinkHTTPVerb();

	/**
	 * Sets the value of the '{@link PSM.PSMHypermediaLink#getLinkHTTPVerb <em>Link HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link HTTP Verb</em>' attribute.
	 * @see PSM.HTTPVerb
	 * @see #getLinkHTTPVerb()
	 * @generated
	 */
	void setLinkHTTPVerb(HTTPVerb value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * The default value is <code>"Child"</code>.
	 * The literals are from the enumeration {@link PSM.LinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see PSM.LinkType
	 * @see #setLinkType(LinkType)
	 * @see PSM.PSMPackage#getPSMHypermediaLink_LinkType()
	 * @model default="Child" unique="false" required="true" ordered="false"
	 * @generated
	 */
	LinkType getLinkType();

	/**
	 * Sets the value of the '{@link PSM.PSMHypermediaLink#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see PSM.LinkType
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(LinkType value);

	/**
	 * Returns the value of the '<em><b>Has Target CSharp RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target CSharp RController</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target CSharp RController</em>' reference.
	 * @see #setHasTargetCSharpRController(CSharpResourceController)
	 * @see PSM.PSMPackage#getPSMHypermediaLink_HasTargetCSharpRController()
	 * @model
	 * @generated
	 */
	CSharpResourceController getHasTargetCSharpRController();

	/**
	 * Sets the value of the '{@link PSM.PSMHypermediaLink#getHasTargetCSharpRController <em>Has Target CSharp RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target CSharp RController</em>' reference.
	 * @see #getHasTargetCSharpRController()
	 * @generated
	 */
	void setHasTargetCSharpRController(CSharpResourceController value);

	/**
	 * Returns the value of the '<em><b>Has Target CSharp RM Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target CSharp RM Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target CSharp RM Controller</em>' reference.
	 * @see #setHasTargetCSharpRMController(CSharpResourceManagerController)
	 * @see PSM.PSMPackage#getPSMHypermediaLink_HasTargetCSharpRMController()
	 * @model
	 * @generated
	 */
	CSharpResourceManagerController getHasTargetCSharpRMController();

	/**
	 * Sets the value of the '{@link PSM.PSMHypermediaLink#getHasTargetCSharpRMController <em>Has Target CSharp RM Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target CSharp RM Controller</em>' reference.
	 * @see #getHasTargetCSharpRMController()
	 * @generated
	 */
	void setHasTargetCSharpRMController(CSharpResourceManagerController value);

	/**
	 * Returns the value of the '<em><b>Has Target CSharp Algo RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target CSharp Algo RController</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target CSharp Algo RController</em>' reference.
	 * @see #setHasTargetCSharpAlgoRController(CSharpAlgoResourceController)
	 * @see PSM.PSMPackage#getPSMHypermediaLink_HasTargetCSharpAlgoRController()
	 * @model
	 * @generated
	 */
	CSharpAlgoResourceController getHasTargetCSharpAlgoRController();

	/**
	 * Sets the value of the '{@link PSM.PSMHypermediaLink#getHasTargetCSharpAlgoRController <em>Has Target CSharp Algo RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target CSharp Algo RController</em>' reference.
	 * @see #getHasTargetCSharpAlgoRController()
	 * @generated
	 */
	void setHasTargetCSharpAlgoRController(CSharpAlgoResourceController value);

} // PSMHypermediaLink
