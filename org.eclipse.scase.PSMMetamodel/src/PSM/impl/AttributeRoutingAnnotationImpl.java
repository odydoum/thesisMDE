/**
 */
package PSM.impl;

import PSM.AttributeRoutingAnnotation;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Routing Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.AttributeRoutingAnnotationImpl#getAttributeRoutingAnnotationText <em>Attribute Routing Annotation Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeRoutingAnnotationImpl extends MinimalEObjectImpl.Container implements AttributeRoutingAnnotation {
	/**
	 * The default value of the '{@link #getAttributeRoutingAnnotationText() <em>Attribute Routing Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRoutingAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_ROUTING_ANNOTATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeRoutingAnnotationText() <em>Attribute Routing Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRoutingAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected String attributeRoutingAnnotationText = ATTRIBUTE_ROUTING_ANNOTATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRoutingAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.ATTRIBUTE_ROUTING_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeRoutingAnnotationText() {
		return attributeRoutingAnnotationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeRoutingAnnotationText(String newAttributeRoutingAnnotationText) {
		String oldAttributeRoutingAnnotationText = attributeRoutingAnnotationText;
		attributeRoutingAnnotationText = newAttributeRoutingAnnotationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT, oldAttributeRoutingAnnotationText, attributeRoutingAnnotationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT:
				return getAttributeRoutingAnnotationText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PSMPackage.ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT:
				setAttributeRoutingAnnotationText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PSMPackage.ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT:
				setAttributeRoutingAnnotationText(ATTRIBUTE_ROUTING_ANNOTATION_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PSMPackage.ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT:
				return ATTRIBUTE_ROUTING_ANNOTATION_TEXT_EDEFAULT == null ? attributeRoutingAnnotationText != null : !ATTRIBUTE_ROUTING_ANNOTATION_TEXT_EDEFAULT.equals(attributeRoutingAnnotationText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AttributeRoutingAnnotationText: ");
		result.append(attributeRoutingAnnotationText);
		result.append(')');
		return result.toString();
	}

} //AttributeRoutingAnnotationImpl
