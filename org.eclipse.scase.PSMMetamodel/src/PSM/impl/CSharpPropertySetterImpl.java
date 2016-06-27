/**
 */
package PSM.impl;

import PSM.CSharpPropertySetter;
import PSM.PSMComponentProperty;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSharp Property Setter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpPropertySetterImpl#getSetsProperty <em>Sets Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpPropertySetterImpl extends CSharpPropertyAccessorImpl implements CSharpPropertySetter {
	/**
	 * The cached value of the '{@link #getSetsProperty() <em>Sets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetsProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty setsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpPropertySetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_PROPERTY_SETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getSetsProperty() {
		if (setsProperty != null && setsProperty.eIsProxy()) {
			InternalEObject oldSetsProperty = (InternalEObject)setsProperty;
			setsProperty = (PSMComponentProperty)eResolveProxy(oldSetsProperty);
			if (setsProperty != oldSetsProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.CSHARP_PROPERTY_SETTER__SETS_PROPERTY, oldSetsProperty, setsProperty));
			}
		}
		return setsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty basicGetSetsProperty() {
		return setsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetsProperty(PSMComponentProperty newSetsProperty) {
		PSMComponentProperty oldSetsProperty = setsProperty;
		setsProperty = newSetsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_PROPERTY_SETTER__SETS_PROPERTY, oldSetsProperty, setsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.CSHARP_PROPERTY_SETTER__SETS_PROPERTY:
				if (resolve) return getSetsProperty();
				return basicGetSetsProperty();
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
			case PSMPackage.CSHARP_PROPERTY_SETTER__SETS_PROPERTY:
				setSetsProperty((PSMComponentProperty)newValue);
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
			case PSMPackage.CSHARP_PROPERTY_SETTER__SETS_PROPERTY:
				setSetsProperty((PSMComponentProperty)null);
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
			case PSMPackage.CSHARP_PROPERTY_SETTER__SETS_PROPERTY:
				return setsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //CSharpPropertySetterImpl
