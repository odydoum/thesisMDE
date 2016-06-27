/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Contract Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.DataContractAnnotation#getDataContractAnnotationText <em>Data Contract Annotation Text</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getDataContractAnnotation()
 * @model
 * @generated
 */
public interface DataContractAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Contract Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Contract Annotation Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Contract Annotation Text</em>' attribute.
	 * @see #setDataContractAnnotationText(String)
	 * @see PSM.PSMPackage#getDataContractAnnotation_DataContractAnnotationText()
	 * @model required="true"
	 * @generated
	 */
	String getDataContractAnnotationText();

	/**
	 * Sets the value of the '{@link PSM.DataContractAnnotation#getDataContractAnnotationText <em>Data Contract Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Contract Annotation Text</em>' attribute.
	 * @see #getDataContractAnnotationText()
	 * @generated
	 */
	void setDataContractAnnotationText(String value);

} // DataContractAnnotation
