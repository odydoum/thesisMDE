/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.EntityAnnotation#getEntityAnnotationText <em>Entity Annotation Text</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getEntityAnnotation()
 * @model
 * @generated
 */
public interface EntityAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Annotation Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Annotation Text</em>' attribute.
	 * @see #setEntityAnnotationText(String)
	 * @see PSM.PSMPackage#getEntityAnnotation_EntityAnnotationText()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEntityAnnotationText();

	/**
	 * Sets the value of the '{@link PSM.EntityAnnotation#getEntityAnnotationText <em>Entity Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Annotation Text</em>' attribute.
	 * @see #getEntityAnnotationText()
	 * @generated
	 */
	void setEntityAnnotationText(String value);

} // EntityAnnotation
