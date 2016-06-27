/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSharp Resource Model Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.CSharpResourceModelManager#getName <em>Name</em>}</li>
 *   <li>{@link PSM.CSharpResourceModelManager#getHasRelatedCSharpRModel <em>Has Related CSharp RModel</em>}</li>
 *   <li>{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasProperty <em>CSharp RM Manager Has Property</em>}</li>
 *   <li>{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasDataAnnotation <em>CSharp RM Manager Has Data Annotation</em>}</li>
 *   <li>{@link PSM.CSharpResourceModelManager#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasGetter <em>CSharp RM Manager Has Getter</em>}</li>
 *   <li>{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasSetter <em>CSharp RM Manager Has Setter</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getCSharpResourceModelManager()
 * @model
 * @generated
 */
public interface CSharpResourceModelManager extends EObject {
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
	 * @see PSM.PSMPackage#getCSharpResourceModelManager_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModelManager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Related CSharp RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related CSharp RModel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related CSharp RModel</em>' reference.
	 * @see #setHasRelatedCSharpRModel(CSharpResourceModel)
	 * @see PSM.PSMPackage#getCSharpResourceModelManager_HasRelatedCSharpRModel()
	 * @model required="true"
	 * @generated
	 */
	CSharpResourceModel getHasRelatedCSharpRModel();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModelManager#getHasRelatedCSharpRModel <em>Has Related CSharp RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Related CSharp RModel</em>' reference.
	 * @see #getHasRelatedCSharpRModel()
	 * @generated
	 */
	void setHasRelatedCSharpRModel(CSharpResourceModel value);

	/**
	 * Returns the value of the '<em><b>CSharp RM Manager Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RM Manager Has Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RM Manager Has Property</em>' containment reference.
	 * @see #setCSharpRMManagerHasProperty(PSMComponentProperty)
	 * @see PSM.PSMPackage#getCSharpResourceModelManager_CSharpRMManagerHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PSMComponentProperty getCSharpRMManagerHasProperty();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasProperty <em>CSharp RM Manager Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp RM Manager Has Property</em>' containment reference.
	 * @see #getCSharpRMManagerHasProperty()
	 * @generated
	 */
	void setCSharpRMManagerHasProperty(PSMComponentProperty value);

	/**
	 * Returns the value of the '<em><b>CSharp RM Manager Has Data Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RM Manager Has Data Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RM Manager Has Data Annotation</em>' containment reference.
	 * @see #setCSharpRMManagerHasDataAnnotation(DataContractAnnotation)
	 * @see PSM.PSMPackage#getCSharpResourceModelManager_CSharpRMManagerHasDataAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataContractAnnotation getCSharpRMManagerHasDataAnnotation();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasDataAnnotation <em>CSharp RM Manager Has Data Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp RM Manager Has Data Annotation</em>' containment reference.
	 * @see #getCSharpRMManagerHasDataAnnotation()
	 * @generated
	 */
	void setCSharpRMManagerHasDataAnnotation(DataContractAnnotation value);

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
	 * @see PSM.PSMPackage#getCSharpResourceModelManager_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModelManager#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>CSharp RM Manager Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RM Manager Has Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RM Manager Has Getter</em>' containment reference.
	 * @see #setCSharpRMManagerHasGetter(CSharpPropertyGetter)
	 * @see PSM.PSMPackage#getCSharpResourceModelManager_CSharpRMManagerHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CSharpPropertyGetter getCSharpRMManagerHasGetter();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasGetter <em>CSharp RM Manager Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp RM Manager Has Getter</em>' containment reference.
	 * @see #getCSharpRMManagerHasGetter()
	 * @generated
	 */
	void setCSharpRMManagerHasGetter(CSharpPropertyGetter value);

	/**
	 * Returns the value of the '<em><b>CSharp RM Manager Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RM Manager Has Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RM Manager Has Setter</em>' containment reference.
	 * @see #setCSharpRMManagerHasSetter(CSharpPropertySetter)
	 * @see PSM.PSMPackage#getCSharpResourceModelManager_CSharpRMManagerHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CSharpPropertySetter getCSharpRMManagerHasSetter();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasSetter <em>CSharp RM Manager Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp RM Manager Has Setter</em>' containment reference.
	 * @see #getCSharpRMManagerHasSetter()
	 * @generated
	 */
	void setCSharpRMManagerHasSetter(CSharpPropertySetter value);

} // CSharpResourceModelManager
