/**
 */
package PSM.impl;

import PSM.DataContractAnnotation;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Contract Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.DataContractAnnotationImpl#getDataContractAnnotationText <em>Data Contract Annotation Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataContractAnnotationImpl extends MinimalEObjectImpl.Container implements DataContractAnnotation {
	/**
	 * The default value of the '{@link #getDataContractAnnotationText() <em>Data Contract Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataContractAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_CONTRACT_ANNOTATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataContractAnnotationText() <em>Data Contract Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataContractAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected String dataContractAnnotationText = DATA_CONTRACT_ANNOTATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataContractAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.DATA_CONTRACT_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataContractAnnotationText() {
		return dataContractAnnotationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataContractAnnotationText(String newDataContractAnnotationText) {
		String oldDataContractAnnotationText = dataContractAnnotationText;
		dataContractAnnotationText = newDataContractAnnotationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT, oldDataContractAnnotationText, dataContractAnnotationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT:
				return getDataContractAnnotationText();
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
			case PSMPackage.DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT:
				setDataContractAnnotationText((String)newValue);
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
			case PSMPackage.DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT:
				setDataContractAnnotationText(DATA_CONTRACT_ANNOTATION_TEXT_EDEFAULT);
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
			case PSMPackage.DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT:
				return DATA_CONTRACT_ANNOTATION_TEXT_EDEFAULT == null ? dataContractAnnotationText != null : !DATA_CONTRACT_ANNOTATION_TEXT_EDEFAULT.equals(dataContractAnnotationText);
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
		result.append(" (dataContractAnnotationText: ");
		result.append(dataContractAnnotationText);
		result.append(')');
		return result.toString();
	}

} //DataContractAnnotationImpl
