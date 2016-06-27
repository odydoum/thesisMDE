/**
 */
package PSM.impl;

import PSM.CSharpPropertyGetter;
import PSM.PSMComponentProperty;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSharp Property Getter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpPropertyGetterImpl#getGetsProperty <em>Gets Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpPropertyGetterImpl extends CSharpPropertyAccessorImpl implements CSharpPropertyGetter {
	/**
	 * The cached value of the '{@link #getGetsProperty() <em>Gets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetsProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty getsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpPropertyGetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_PROPERTY_GETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getGetsProperty() {
		if (getsProperty != null && getsProperty.eIsProxy()) {
			InternalEObject oldGetsProperty = (InternalEObject)getsProperty;
			getsProperty = (PSMComponentProperty)eResolveProxy(oldGetsProperty);
			if (getsProperty != oldGetsProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.CSHARP_PROPERTY_GETTER__GETS_PROPERTY, oldGetsProperty, getsProperty));
			}
		}
		return getsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty basicGetGetsProperty() {
		return getsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetsProperty(PSMComponentProperty newGetsProperty) {
		PSMComponentProperty oldGetsProperty = getsProperty;
		getsProperty = newGetsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_PROPERTY_GETTER__GETS_PROPERTY, oldGetsProperty, getsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.CSHARP_PROPERTY_GETTER__GETS_PROPERTY:
				if (resolve) return getGetsProperty();
				return basicGetGetsProperty();
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
			case PSMPackage.CSHARP_PROPERTY_GETTER__GETS_PROPERTY:
				setGetsProperty((PSMComponentProperty)newValue);
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
			case PSMPackage.CSHARP_PROPERTY_GETTER__GETS_PROPERTY:
				setGetsProperty((PSMComponentProperty)null);
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
			case PSMPackage.CSHARP_PROPERTY_GETTER__GETS_PROPERTY:
				return getsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //CSharpPropertyGetterImpl
