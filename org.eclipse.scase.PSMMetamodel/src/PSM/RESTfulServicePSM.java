/**
 */
package PSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RES Tful Service PSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.RESTfulServicePSM#getName <em>Name</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getHasCSharpRModel <em>Has CSharp RModel</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getHasCSharpRMManager <em>Has CSharp RM Manager</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getHasCSharpRMController <em>Has CSharp RM Controller</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getHasCSharpRController <em>Has CSharp RController</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getHasEntityDatabaseController <em>Has Entity Database Controller</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getHasCSharpAlgoRController <em>Has CSharp Algo RController</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getHasCSharpAlgoResourceModel <em>Has CSharp Algo Resource Model</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getServiceOutputPath <em>Service Output Path</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getServiceDatabaseIP <em>Service Database IP</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getServiceDatabasePort <em>Service Database Port</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getServiceDatabaseUsername <em>Service Database Username</em>}</li>
 *   <li>{@link PSM.RESTfulServicePSM#getServiceDatabasePassword <em>Service Database Password</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getRESTfulServicePSM()
 * @model
 * @generated
 */
public interface RESTfulServicePSM extends EObject {
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
	 * @see PSM.PSMPackage#getRESTfulServicePSM_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.RESTfulServicePSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has CSharp RModel</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CSharp RModel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CSharp RModel</em>' containment reference list.
	 * @see PSM.PSMPackage#getRESTfulServicePSM_HasCSharpRModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSharpResourceModel> getHasCSharpRModel();

	/**
	 * Returns the value of the '<em><b>Has CSharp RM Manager</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpResourceModelManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CSharp RM Manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CSharp RM Manager</em>' containment reference list.
	 * @see PSM.PSMPackage#getRESTfulServicePSM_HasCSharpRMManager()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSharpResourceModelManager> getHasCSharpRMManager();

	/**
	 * Returns the value of the '<em><b>Has CSharp RM Controller</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpResourceManagerController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CSharp RM Controller</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CSharp RM Controller</em>' containment reference list.
	 * @see PSM.PSMPackage#getRESTfulServicePSM_HasCSharpRMController()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSharpResourceManagerController> getHasCSharpRMController();

	/**
	 * Returns the value of the '<em><b>Has CSharp RController</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpResourceController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CSharp RController</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CSharp RController</em>' containment reference list.
	 * @see PSM.PSMPackage#getRESTfulServicePSM_HasCSharpRController()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSharpResourceController> getHasCSharpRController();

	/**
	 * Returns the value of the '<em><b>Has Entity Database Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Entity Database Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entity Database Controller</em>' containment reference.
	 * @see #setHasEntityDatabaseController(EntityDatabaseController)
	 * @see PSM.PSMPackage#getRESTfulServicePSM_HasEntityDatabaseController()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntityDatabaseController getHasEntityDatabaseController();

	/**
	 * Sets the value of the '{@link PSM.RESTfulServicePSM#getHasEntityDatabaseController <em>Has Entity Database Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Entity Database Controller</em>' containment reference.
	 * @see #getHasEntityDatabaseController()
	 * @generated
	 */
	void setHasEntityDatabaseController(EntityDatabaseController value);

	/**
	 * Returns the value of the '<em><b>Has CSharp Algo RController</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpAlgoResourceController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CSharp Algo RController</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CSharp Algo RController</em>' containment reference list.
	 * @see PSM.PSMPackage#getRESTfulServicePSM_HasCSharpAlgoRController()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSharpAlgoResourceController> getHasCSharpAlgoRController();

	/**
	 * Returns the value of the '<em><b>Has CSharp Algo Resource Model</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CSharp Algo Resource Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CSharp Algo Resource Model</em>' containment reference list.
	 * @see PSM.PSMPackage#getRESTfulServicePSM_HasCSharpAlgoResourceModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSharpAlgoResourceModel> getHasCSharpAlgoResourceModel();

	/**
	 * Returns the value of the '<em><b>Service Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Output Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Output Path</em>' attribute.
	 * @see #setServiceOutputPath(String)
	 * @see PSM.PSMPackage#getRESTfulServicePSM_ServiceOutputPath()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOutputPath();

	/**
	 * Sets the value of the '{@link PSM.RESTfulServicePSM#getServiceOutputPath <em>Service Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Output Path</em>' attribute.
	 * @see #getServiceOutputPath()
	 * @generated
	 */
	void setServiceOutputPath(String value);

	/**
	 * Returns the value of the '<em><b>Service Database IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database IP</em>' attribute.
	 * @see #setServiceDatabaseIP(String)
	 * @see PSM.PSMPackage#getRESTfulServicePSM_ServiceDatabaseIP()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabaseIP();

	/**
	 * Sets the value of the '{@link PSM.RESTfulServicePSM#getServiceDatabaseIP <em>Service Database IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database IP</em>' attribute.
	 * @see #getServiceDatabaseIP()
	 * @generated
	 */
	void setServiceDatabaseIP(String value);

	/**
	 * Returns the value of the '<em><b>Service Database Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database Port</em>' attribute.
	 * @see #setServiceDatabasePort(String)
	 * @see PSM.PSMPackage#getRESTfulServicePSM_ServiceDatabasePort()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabasePort();

	/**
	 * Sets the value of the '{@link PSM.RESTfulServicePSM#getServiceDatabasePort <em>Service Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database Port</em>' attribute.
	 * @see #getServiceDatabasePort()
	 * @generated
	 */
	void setServiceDatabasePort(String value);

	/**
	 * Returns the value of the '<em><b>Service Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database Username</em>' attribute.
	 * @see #setServiceDatabaseUsername(String)
	 * @see PSM.PSMPackage#getRESTfulServicePSM_ServiceDatabaseUsername()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabaseUsername();

	/**
	 * Sets the value of the '{@link PSM.RESTfulServicePSM#getServiceDatabaseUsername <em>Service Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database Username</em>' attribute.
	 * @see #getServiceDatabaseUsername()
	 * @generated
	 */
	void setServiceDatabaseUsername(String value);

	/**
	 * Returns the value of the '<em><b>Service Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database Password</em>' attribute.
	 * @see #setServiceDatabasePassword(String)
	 * @see PSM.PSMPackage#getRESTfulServicePSM_ServiceDatabasePassword()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabasePassword();

	/**
	 * Sets the value of the '{@link PSM.RESTfulServicePSM#getServiceDatabasePassword <em>Service Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database Password</em>' attribute.
	 * @see #getServiceDatabasePassword()
	 * @generated
	 */
	void setServiceDatabasePassword(String value);

} // RESTfulServicePSM
