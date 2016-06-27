/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Routing Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.AttributeRoutingAnnotation#getAttributeRoutingAnnotationText <em>Attribute Routing Annotation Text</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getAttributeRoutingAnnotation()
 * @model
 * @generated
 */
public interface AttributeRoutingAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Routing Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Routing Annotation Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Routing Annotation Text</em>' attribute.
	 * @see #setAttributeRoutingAnnotationText(String)
	 * @see PSM.PSMPackage#getAttributeRoutingAnnotation_AttributeRoutingAnnotationText()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAttributeRoutingAnnotationText();

	/**
	 * Sets the value of the '{@link PSM.AttributeRoutingAnnotation#getAttributeRoutingAnnotationText <em>Attribute Routing Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Routing Annotation Text</em>' attribute.
	 * @see #getAttributeRoutingAnnotationText()
	 * @generated
	 */
	void setAttributeRoutingAnnotationText(String value);

} // AttributeRoutingAnnotation
