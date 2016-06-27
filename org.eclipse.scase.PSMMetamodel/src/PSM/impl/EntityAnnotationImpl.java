/**
 */
package PSM.impl;

import PSM.EntityAnnotation;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.EntityAnnotationImpl#getEntityAnnotationText <em>Entity Annotation Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityAnnotationImpl extends MinimalEObjectImpl.Container implements EntityAnnotation {
	/**
	 * The default value of the '{@link #getEntityAnnotationText() <em>Entity Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_ANNOTATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityAnnotationText() <em>Entity Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected String entityAnnotationText = ENTITY_ANNOTATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.ENTITY_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityAnnotationText() {
		return entityAnnotationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityAnnotationText(String newEntityAnnotationText) {
		String oldEntityAnnotationText = entityAnnotationText;
		entityAnnotationText = newEntityAnnotationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT, oldEntityAnnotationText, entityAnnotationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT:
				return getEntityAnnotationText();
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
			case PSMPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT:
				setEntityAnnotationText((String)newValue);
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
			case PSMPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT:
				setEntityAnnotationText(ENTITY_ANNOTATION_TEXT_EDEFAULT);
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
			case PSMPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT:
				return ENTITY_ANNOTATION_TEXT_EDEFAULT == null ? entityAnnotationText != null : !ENTITY_ANNOTATION_TEXT_EDEFAULT.equals(entityAnnotationText);
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
		result.append(" (EntityAnnotationText: ");
		result.append(entityAnnotationText);
		result.append(')');
		return result.toString();
	}

} //EntityAnnotationImpl
