/**
 */
package PSM.impl;

import PSM.AttributeRoutingAnnotation;
import PSM.CSharpResourceManagerController;
import PSM.CSharpResourceModelManager;
import PSM.HTTPAction;
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
 * An implementation of the model object '<em><b>CSharp Resource Manager Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpResourceManagerControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceManagerControllerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceManagerControllerImpl#getHasAssociatedCSharpRMManager <em>Has Associated CSharp RM Manager</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceManagerControllerImpl#getCSharpRMControllerHasARAnnotation <em>CSharp RM Controller Has AR Annotation</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceManagerControllerImpl#getCSharpRMControllerHasAction <em>CSharp RM Controller Has Action</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceManagerControllerImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpResourceManagerControllerImpl extends MinimalEObjectImpl.Container implements CSharpResourceManagerController {
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
	 * The default value of the '{@link #getControllerURI() <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerURI() <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerURI()
	 * @generated
	 * @ordered
	 */
	protected String controllerURI = CONTROLLER_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasAssociatedCSharpRMManager() <em>Has Associated CSharp RM Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedCSharpRMManager()
	 * @generated
	 * @ordered
	 */
	protected CSharpResourceModelManager hasAssociatedCSharpRMManager;

	/**
	 * The cached value of the '{@link #getCSharpRMControllerHasARAnnotation() <em>CSharp RM Controller Has AR Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRMControllerHasARAnnotation()
	 * @generated
	 * @ordered
	 */
	protected AttributeRoutingAnnotation cSharpRMControllerHasARAnnotation;

	/**
	 * The cached value of the '{@link #getCSharpRMControllerHasAction() <em>CSharp RM Controller Has Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRMControllerHasAction()
	 * @generated
	 * @ordered
	 */
	protected EList<HTTPAction> cSharpRMControllerHasAction;

	/**
	 * The default value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected String parentName = PARENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpResourceManagerControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_RESOURCE_MANAGER_CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllerURI() {
		return controllerURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerURI(String newControllerURI) {
		String oldControllerURI = controllerURI;
		controllerURI = newControllerURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI, oldControllerURI, controllerURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModelManager getHasAssociatedCSharpRMManager() {
		if (hasAssociatedCSharpRMManager != null && hasAssociatedCSharpRMManager.eIsProxy()) {
			InternalEObject oldHasAssociatedCSharpRMManager = (InternalEObject)hasAssociatedCSharpRMManager;
			hasAssociatedCSharpRMManager = (CSharpResourceModelManager)eResolveProxy(oldHasAssociatedCSharpRMManager);
			if (hasAssociatedCSharpRMManager != oldHasAssociatedCSharpRMManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER, oldHasAssociatedCSharpRMManager, hasAssociatedCSharpRMManager));
			}
		}
		return hasAssociatedCSharpRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModelManager basicGetHasAssociatedCSharpRMManager() {
		return hasAssociatedCSharpRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedCSharpRMManager(CSharpResourceModelManager newHasAssociatedCSharpRMManager) {
		CSharpResourceModelManager oldHasAssociatedCSharpRMManager = hasAssociatedCSharpRMManager;
		hasAssociatedCSharpRMManager = newHasAssociatedCSharpRMManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER, oldHasAssociatedCSharpRMManager, hasAssociatedCSharpRMManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRoutingAnnotation getCSharpRMControllerHasARAnnotation() {
		return cSharpRMControllerHasARAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRMControllerHasARAnnotation(AttributeRoutingAnnotation newCSharpRMControllerHasARAnnotation, NotificationChain msgs) {
		AttributeRoutingAnnotation oldCSharpRMControllerHasARAnnotation = cSharpRMControllerHasARAnnotation;
		cSharpRMControllerHasARAnnotation = newCSharpRMControllerHasARAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION, oldCSharpRMControllerHasARAnnotation, newCSharpRMControllerHasARAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRMControllerHasARAnnotation(AttributeRoutingAnnotation newCSharpRMControllerHasARAnnotation) {
		if (newCSharpRMControllerHasARAnnotation != cSharpRMControllerHasARAnnotation) {
			NotificationChain msgs = null;
			if (cSharpRMControllerHasARAnnotation != null)
				msgs = ((InternalEObject)cSharpRMControllerHasARAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION, null, msgs);
			if (newCSharpRMControllerHasARAnnotation != null)
				msgs = ((InternalEObject)newCSharpRMControllerHasARAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION, null, msgs);
			msgs = basicSetCSharpRMControllerHasARAnnotation(newCSharpRMControllerHasARAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION, newCSharpRMControllerHasARAnnotation, newCSharpRMControllerHasARAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HTTPAction> getCSharpRMControllerHasAction() {
		if (cSharpRMControllerHasAction == null) {
			cSharpRMControllerHasAction = new EObjectContainmentEList<HTTPAction>(HTTPAction.class, this, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION);
		}
		return cSharpRMControllerHasAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentName(String newParentName) {
		String oldParentName = parentName;
		parentName = newParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION:
				return basicSetCSharpRMControllerHasARAnnotation(null, msgs);
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION:
				return ((InternalEList<?>)getCSharpRMControllerHasAction()).basicRemove(otherEnd, msgs);
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
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME:
				return getName();
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI:
				return getControllerURI();
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER:
				if (resolve) return getHasAssociatedCSharpRMManager();
				return basicGetHasAssociatedCSharpRMManager();
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION:
				return getCSharpRMControllerHasARAnnotation();
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION:
				return getCSharpRMControllerHasAction();
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME:
				return getParentName();
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
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER:
				setHasAssociatedCSharpRMManager((CSharpResourceModelManager)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION:
				setCSharpRMControllerHasARAnnotation((AttributeRoutingAnnotation)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION:
				getCSharpRMControllerHasAction().clear();
				getCSharpRMControllerHasAction().addAll((Collection<? extends HTTPAction>)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME:
				setParentName((String)newValue);
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
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER:
				setHasAssociatedCSharpRMManager((CSharpResourceModelManager)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION:
				setCSharpRMControllerHasARAnnotation((AttributeRoutingAnnotation)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION:
				getCSharpRMControllerHasAction().clear();
				return;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
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
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER:
				return hasAssociatedCSharpRMManager != null;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION:
				return cSharpRMControllerHasARAnnotation != null;
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION:
				return cSharpRMControllerHasAction != null && !cSharpRMControllerHasAction.isEmpty();
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
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
		result.append(", controllerURI: ");
		result.append(controllerURI);
		result.append(", parentName: ");
		result.append(parentName);
		result.append(')');
		return result.toString();
	}

} //CSharpResourceManagerControllerImpl
