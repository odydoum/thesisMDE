/**
 */
package PSM.impl;

import PSM.EntityActivity;
import PSM.EntityDatabaseController;
import PSM.PSMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Database Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.EntityDatabaseControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.EntityDatabaseControllerImpl#getHasEntityActivity <em>Has Entity Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityDatabaseControllerImpl extends MinimalEObjectImpl.Container implements EntityDatabaseController {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getHasEntityActivity() <em>Has Entity Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntityActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityActivity> hasEntityActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityDatabaseControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.ENTITY_DATABASE_CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.ENTITY_DATABASE_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityActivity> getHasEntityActivity() {
		if (hasEntityActivity == null) {
			hasEntityActivity = new EObjectContainmentEList<EntityActivity>(EntityActivity.class, this, PSMPackage.ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY);
		}
		return hasEntityActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY:
				return ((InternalEList<?>)getHasEntityActivity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__NAME:
				return getName();
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY:
				return getHasEntityActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY:
				getHasEntityActivity().clear();
				getHasEntityActivity().addAll((Collection<? extends EntityActivity>)newValue);
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
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY:
				getHasEntityActivity().clear();
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
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY:
				return hasEntityActivity != null && !hasEntityActivity.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EntityDatabaseControllerImpl
