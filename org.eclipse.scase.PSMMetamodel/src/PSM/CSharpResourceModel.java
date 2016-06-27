/**
 */
package PSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSharp Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.CSharpResourceModel#getName <em>Name</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getHasRelatedCSharpRMManager <em>Has Related CSharp RM Manager</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getCSharpRModelHasProperty <em>CSharp RModel Has Property</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getCSharpRModelHasDataAnnotation <em>CSharp RModel Has Data Annotation</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getCSharpRModelHasEntityAnnotation <em>CSharp RModel Has Entity Annotation</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getCSharpRModelHasGetter <em>CSharp RModel Has Getter</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getCSharpRModelHasSetter <em>CSharp RModel Has Setter</em>}</li>
 *   <li>{@link PSM.CSharpResourceModel#getHasRelatedCSharpAlgoModel <em>Has Related CSharp Algo Model</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getCSharpResourceModel()
 * @model
 * @generated
 */
public interface CSharpResourceModel extends EObject {
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
	 * @see PSM.PSMPackage#getCSharpResourceModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Related CSharp RM Manager</b></em>' reference list.
	 * The list contents are of type {@link PSM.CSharpResourceModelManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related CSharp RM Manager</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related CSharp RM Manager</em>' reference list.
	 * @see PSM.PSMPackage#getCSharpResourceModel_HasRelatedCSharpRMManager()
	 * @model
	 * @generated
	 */
	EList<CSharpResourceModelManager> getHasRelatedCSharpRMManager();

	/**
	 * Returns the value of the '<em><b>CSharp RModel Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.PSMComponentProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RModel Has Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RModel Has Property</em>' containment reference list.
	 * @see PSM.PSMPackage#getCSharpResourceModel_CSharpRModelHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PSMComponentProperty> getCSharpRModelHasProperty();

	/**
	 * Returns the value of the '<em><b>CSharp RModel Has Data Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RModel Has Data Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RModel Has Data Annotation</em>' containment reference.
	 * @see #setCSharpRModelHasDataAnnotation(DataContractAnnotation)
	 * @see PSM.PSMPackage#getCSharpResourceModel_CSharpRModelHasDataAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataContractAnnotation getCSharpRModelHasDataAnnotation();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModel#getCSharpRModelHasDataAnnotation <em>CSharp RModel Has Data Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp RModel Has Data Annotation</em>' containment reference.
	 * @see #getCSharpRModelHasDataAnnotation()
	 * @generated
	 */
	void setCSharpRModelHasDataAnnotation(DataContractAnnotation value);

	/**
	 * Returns the value of the '<em><b>CSharp RModel Has Entity Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RModel Has Entity Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RModel Has Entity Annotation</em>' containment reference.
	 * @see #setCSharpRModelHasEntityAnnotation(EntityAnnotation)
	 * @see PSM.PSMPackage#getCSharpResourceModel_CSharpRModelHasEntityAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntityAnnotation getCSharpRModelHasEntityAnnotation();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModel#getCSharpRModelHasEntityAnnotation <em>CSharp RModel Has Entity Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp RModel Has Entity Annotation</em>' containment reference.
	 * @see #getCSharpRModelHasEntityAnnotation()
	 * @generated
	 */
	void setCSharpRModelHasEntityAnnotation(EntityAnnotation value);

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
	 * @see PSM.PSMPackage#getCSharpResourceModel_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link PSM.CSharpResourceModel#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>CSharp RModel Has Getter</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpPropertyGetter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RModel Has Getter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RModel Has Getter</em>' containment reference list.
	 * @see PSM.PSMPackage#getCSharpResourceModel_CSharpRModelHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CSharpPropertyGetter> getCSharpRModelHasGetter();

	/**
	 * Returns the value of the '<em><b>CSharp RModel Has Setter</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.CSharpPropertySetter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp RModel Has Setter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp RModel Has Setter</em>' containment reference list.
	 * @see PSM.PSMPackage#getCSharpResourceModel_CSharpRModelHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CSharpPropertySetter> getCSharpRModelHasSetter();

	/**
	 * Returns the value of the '<em><b>Has Related CSharp Algo Model</b></em>' reference list.
	 * The list contents are of type {@link PSM.CSharpAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related CSharp Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related CSharp Algo Model</em>' reference list.
	 * @see PSM.PSMPackage#getCSharpResourceModel_HasRelatedCSharpAlgoModel()
	 * @model
	 * @generated
	 */
	EList<CSharpAlgoResourceModel> getHasRelatedCSharpAlgoModel();

} // CSharpResourceModel
