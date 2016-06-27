/**
 */
package PSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSharp Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasProperty <em>CSharp Algo Model Has Property</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getName <em>Name</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasGetter <em>CSharp Algo Model Has Getter</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasSetter <em>CSharp Algo Model Has Setter</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoRModelHasDataContractAnnotation <em>CSharp Algo RModel Has Data Contract Annotation</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getHasRelatedCSharpAlgoModel <em>Has Related CSharp Algo Model</em>}</li>
 *   <li>{@link PSM.CSharpAlgoResourceModel#getIsRelatedCSharpAlgoModel <em>Is Related CSharp Algo Model</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getCSharpAlgoResourceModel()
 * @model
 * @generated
 */
public interface CSharpAlgoResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>CSharp Algo Model Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp Algo Model Has Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp Algo Model Has Property</em>' containment reference.
	 * @see #setCSharpAlgoModelHasProperty(PSMComponentProperty)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_CSharpAlgoModelHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PSMComponentProperty getCSharpAlgoModelHasProperty();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasProperty <em>CSharp Algo Model Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp Algo Model Has Property</em>' containment reference.
	 * @see #getCSharpAlgoModelHasProperty()
	 * @generated
	 */
	void setCSharpAlgoModelHasProperty(PSMComponentProperty value);

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
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceModel#getName <em>Name</em>}' attribute.
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
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceModel#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>CSharp Algo Model Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp Algo Model Has Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp Algo Model Has Getter</em>' containment reference.
	 * @see #setCSharpAlgoModelHasGetter(CSharpPropertyGetter)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_CSharpAlgoModelHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CSharpPropertyGetter getCSharpAlgoModelHasGetter();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasGetter <em>CSharp Algo Model Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp Algo Model Has Getter</em>' containment reference.
	 * @see #getCSharpAlgoModelHasGetter()
	 * @generated
	 */
	void setCSharpAlgoModelHasGetter(CSharpPropertyGetter value);

	/**
	 * Returns the value of the '<em><b>CSharp Algo Model Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp Algo Model Has Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp Algo Model Has Setter</em>' containment reference.
	 * @see #setCSharpAlgoModelHasSetter(CSharpPropertySetter)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_CSharpAlgoModelHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CSharpPropertySetter getCSharpAlgoModelHasSetter();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasSetter <em>CSharp Algo Model Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp Algo Model Has Setter</em>' containment reference.
	 * @see #getCSharpAlgoModelHasSetter()
	 * @generated
	 */
	void setCSharpAlgoModelHasSetter(CSharpPropertySetter value);

	/**
	 * Returns the value of the '<em><b>CSharp Algo RModel Has Data Contract Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSharp Algo RModel Has Data Contract Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSharp Algo RModel Has Data Contract Annotation</em>' containment reference.
	 * @see #setCSharpAlgoRModelHasDataContractAnnotation(DataContractAnnotation)
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_CSharpAlgoRModelHasDataContractAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataContractAnnotation getCSharpAlgoRModelHasDataContractAnnotation();

	/**
	 * Sets the value of the '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoRModelHasDataContractAnnotation <em>CSharp Algo RModel Has Data Contract Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSharp Algo RModel Has Data Contract Annotation</em>' containment reference.
	 * @see #getCSharpAlgoRModelHasDataContractAnnotation()
	 * @generated
	 */
	void setCSharpAlgoRModelHasDataContractAnnotation(DataContractAnnotation value);

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
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_HasRelatedCSharpAlgoModel()
	 * @model
	 * @generated
	 */
	EList<CSharpAlgoResourceModel> getHasRelatedCSharpAlgoModel();

	/**
	 * Returns the value of the '<em><b>Is Related CSharp Algo Model</b></em>' reference list.
	 * The list contents are of type {@link PSM.CSharpAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related CSharp Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related CSharp Algo Model</em>' reference list.
	 * @see PSM.PSMPackage#getCSharpAlgoResourceModel_IsRelatedCSharpAlgoModel()
	 * @model
	 * @generated
	 */
	EList<CSharpAlgoResourceModel> getIsRelatedCSharpAlgoModel();

} // CSharpAlgoResourceModel
