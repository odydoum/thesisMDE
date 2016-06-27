/**
 */
package PSM.impl;

import PSM.EntityActivity;
import PSM.HTTPVerb;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.EntityActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.EntityActivityImpl#getEntityActivityHTTPVerb <em>Entity Activity HTTP Verb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityActivityImpl extends MinimalEObjectImpl.Container implements EntityActivity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityActivityHTTPVerb() <em>Entity Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityActivityHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb ENTITY_ACTIVITY_HTTP_VERB_EDEFAULT = HTTPVerb.GET;

	/**
	 * The cached value of the '{@link #getEntityActivityHTTPVerb() <em>Entity Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityActivityHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb entityActivityHTTPVerb = ENTITY_ACTIVITY_HTTP_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.ENTITY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.ENTITY_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getEntityActivityHTTPVerb() {
		return entityActivityHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityActivityHTTPVerb(HTTPVerb newEntityActivityHTTPVerb) {
		HTTPVerb oldEntityActivityHTTPVerb = entityActivityHTTPVerb;
		entityActivityHTTPVerb = newEntityActivityHTTPVerb == null ? ENTITY_ACTIVITY_HTTP_VERB_EDEFAULT : newEntityActivityHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB, oldEntityActivityHTTPVerb, entityActivityHTTPVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.ENTITY_ACTIVITY__NAME:
				return getName();
			case PSMPackage.ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB:
				return getEntityActivityHTTPVerb();
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
			case PSMPackage.ENTITY_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB:
				setEntityActivityHTTPVerb((HTTPVerb)newValue);
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
			case PSMPackage.ENTITY_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB:
				setEntityActivityHTTPVerb(ENTITY_ACTIVITY_HTTP_VERB_EDEFAULT);
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
			case PSMPackage.ENTITY_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB:
				return entityActivityHTTPVerb != ENTITY_ACTIVITY_HTTP_VERB_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", EntityActivityHTTPVerb: ");
		result.append(entityActivityHTTPVerb);
		result.append(')');
		return result.toString();
	}

} //EntityActivityImpl
