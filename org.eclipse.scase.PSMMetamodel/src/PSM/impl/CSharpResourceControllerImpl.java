/**
 */
package PSM.impl;

import PSM.AttributeRoutingAnnotation;
import PSM.CSharpResourceController;
import PSM.CSharpResourceModel;
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
 * An implementation of the model object '<em><b>CSharp Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpResourceControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceControllerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceControllerImpl#getHasAssociatedCSharpRModel <em>Has Associated CSharp RModel</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceControllerImpl#getCSharpRControllerHasARAnnotation <em>CSharp RController Has AR Annotation</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceControllerImpl#getCSharpRControllerHasAction <em>CSharp RController Has Action</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceControllerImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpResourceControllerImpl extends MinimalEObjectImpl.Container implements CSharpResourceController {
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
	 * The cached value of the '{@link #getHasAssociatedCSharpRModel() <em>Has Associated CSharp RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedCSharpRModel()
	 * @generated
	 * @ordered
	 */
	protected CSharpResourceModel hasAssociatedCSharpRModel;

	/**
	 * The cached value of the '{@link #getCSharpRControllerHasARAnnotation() <em>CSharp RController Has AR Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRControllerHasARAnnotation()
	 * @generated
	 * @ordered
	 */
	protected AttributeRoutingAnnotation cSharpRControllerHasARAnnotation;

	/**
	 * The cached value of the '{@link #getCSharpRControllerHasAction() <em>CSharp RController Has Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRControllerHasAction()
	 * @generated
	 * @ordered
	 */
	protected EList<HTTPAction> cSharpRControllerHasAction;

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
	protected CSharpResourceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_RESOURCE_CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_CONTROLLER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI, oldControllerURI, controllerURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModel getHasAssociatedCSharpRModel() {
		if (hasAssociatedCSharpRModel != null && hasAssociatedCSharpRModel.eIsProxy()) {
			InternalEObject oldHasAssociatedCSharpRModel = (InternalEObject)hasAssociatedCSharpRModel;
			hasAssociatedCSharpRModel = (CSharpResourceModel)eResolveProxy(oldHasAssociatedCSharpRModel);
			if (hasAssociatedCSharpRModel != oldHasAssociatedCSharpRModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL, oldHasAssociatedCSharpRModel, hasAssociatedCSharpRModel));
			}
		}
		return hasAssociatedCSharpRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModel basicGetHasAssociatedCSharpRModel() {
		return hasAssociatedCSharpRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedCSharpRModel(CSharpResourceModel newHasAssociatedCSharpRModel) {
		CSharpResourceModel oldHasAssociatedCSharpRModel = hasAssociatedCSharpRModel;
		hasAssociatedCSharpRModel = newHasAssociatedCSharpRModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL, oldHasAssociatedCSharpRModel, hasAssociatedCSharpRModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRoutingAnnotation getCSharpRControllerHasARAnnotation() {
		return cSharpRControllerHasARAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRControllerHasARAnnotation(AttributeRoutingAnnotation newCSharpRControllerHasARAnnotation, NotificationChain msgs) {
		AttributeRoutingAnnotation oldCSharpRControllerHasARAnnotation = cSharpRControllerHasARAnnotation;
		cSharpRControllerHasARAnnotation = newCSharpRControllerHasARAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION, oldCSharpRControllerHasARAnnotation, newCSharpRControllerHasARAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRControllerHasARAnnotation(AttributeRoutingAnnotation newCSharpRControllerHasARAnnotation) {
		if (newCSharpRControllerHasARAnnotation != cSharpRControllerHasARAnnotation) {
			NotificationChain msgs = null;
			if (cSharpRControllerHasARAnnotation != null)
				msgs = ((InternalEObject)cSharpRControllerHasARAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION, null, msgs);
			if (newCSharpRControllerHasARAnnotation != null)
				msgs = ((InternalEObject)newCSharpRControllerHasARAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION, null, msgs);
			msgs = basicSetCSharpRControllerHasARAnnotation(newCSharpRControllerHasARAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION, newCSharpRControllerHasARAnnotation, newCSharpRControllerHasARAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HTTPAction> getCSharpRControllerHasAction() {
		if (cSharpRControllerHasAction == null) {
			cSharpRControllerHasAction = new EObjectContainmentEList<HTTPAction>(HTTPAction.class, this, PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION);
		}
		return cSharpRControllerHasAction;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_CONTROLLER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION:
				return basicSetCSharpRControllerHasARAnnotation(null, msgs);
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION:
				return ((InternalEList<?>)getCSharpRControllerHasAction()).basicRemove(otherEnd, msgs);
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
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__NAME:
				return getName();
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return getControllerURI();
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL:
				if (resolve) return getHasAssociatedCSharpRModel();
				return basicGetHasAssociatedCSharpRModel();
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION:
				return getCSharpRControllerHasARAnnotation();
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION:
				return getCSharpRControllerHasAction();
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__PARENT_NAME:
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
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL:
				setHasAssociatedCSharpRModel((CSharpResourceModel)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION:
				setCSharpRControllerHasARAnnotation((AttributeRoutingAnnotation)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION:
				getCSharpRControllerHasAction().clear();
				getCSharpRControllerHasAction().addAll((Collection<? extends HTTPAction>)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__PARENT_NAME:
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
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL:
				setHasAssociatedCSharpRModel((CSharpResourceModel)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION:
				setCSharpRControllerHasARAnnotation((AttributeRoutingAnnotation)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION:
				getCSharpRControllerHasAction().clear();
				return;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__PARENT_NAME:
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
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL:
				return hasAssociatedCSharpRModel != null;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION:
				return cSharpRControllerHasARAnnotation != null;
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION:
				return cSharpRControllerHasAction != null && !cSharpRControllerHasAction.isEmpty();
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER__PARENT_NAME:
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

} //CSharpResourceControllerImpl
