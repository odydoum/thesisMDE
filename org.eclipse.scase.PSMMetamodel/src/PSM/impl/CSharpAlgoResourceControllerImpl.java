/**
 */
package PSM.impl;

import PSM.AttributeRoutingAnnotation;
import PSM.CSharpAlgoResourceController;
import PSM.CSharpAlgoResourceModel;
import PSM.HTTPAction;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSharp Algo Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpAlgoResourceControllerImpl#getHasAssociatedCSharpAlgoModel <em>Has Associated CSharp Algo Model</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceControllerImpl#getCSharpAlgoRChasHTTPAction <em>CSharp Algo RChas HTTP Action</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceControllerImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceControllerImpl#getCSharpAlgoRControllerHasARAnnotation <em>CSharp Algo RController Has AR Annotation</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceControllerImpl#getControllerURI <em>Controller URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpAlgoResourceControllerImpl extends MinimalEObjectImpl.Container implements CSharpAlgoResourceController {
	/**
	 * The cached value of the '{@link #getHasAssociatedCSharpAlgoModel() <em>Has Associated CSharp Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedCSharpAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected CSharpAlgoResourceModel hasAssociatedCSharpAlgoModel;

	/**
	 * The cached value of the '{@link #getCSharpAlgoRChasHTTPAction() <em>CSharp Algo RChas HTTP Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpAlgoRChasHTTPAction()
	 * @generated
	 * @ordered
	 */
	protected HTTPAction cSharpAlgoRChasHTTPAction;

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
	 * The cached value of the '{@link #getCSharpAlgoRControllerHasARAnnotation() <em>CSharp Algo RController Has AR Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpAlgoRControllerHasARAnnotation()
	 * @generated
	 * @ordered
	 */
	protected AttributeRoutingAnnotation cSharpAlgoRControllerHasARAnnotation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpAlgoResourceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_ALGO_RESOURCE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpAlgoResourceModel getHasAssociatedCSharpAlgoModel() {
		if (hasAssociatedCSharpAlgoModel != null && hasAssociatedCSharpAlgoModel.eIsProxy()) {
			InternalEObject oldHasAssociatedCSharpAlgoModel = (InternalEObject)hasAssociatedCSharpAlgoModel;
			hasAssociatedCSharpAlgoModel = (CSharpAlgoResourceModel)eResolveProxy(oldHasAssociatedCSharpAlgoModel);
			if (hasAssociatedCSharpAlgoModel != oldHasAssociatedCSharpAlgoModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL, oldHasAssociatedCSharpAlgoModel, hasAssociatedCSharpAlgoModel));
			}
		}
		return hasAssociatedCSharpAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpAlgoResourceModel basicGetHasAssociatedCSharpAlgoModel() {
		return hasAssociatedCSharpAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedCSharpAlgoModel(CSharpAlgoResourceModel newHasAssociatedCSharpAlgoModel) {
		CSharpAlgoResourceModel oldHasAssociatedCSharpAlgoModel = hasAssociatedCSharpAlgoModel;
		hasAssociatedCSharpAlgoModel = newHasAssociatedCSharpAlgoModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL, oldHasAssociatedCSharpAlgoModel, hasAssociatedCSharpAlgoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPAction getCSharpAlgoRChasHTTPAction() {
		return cSharpAlgoRChasHTTPAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpAlgoRChasHTTPAction(HTTPAction newCSharpAlgoRChasHTTPAction, NotificationChain msgs) {
		HTTPAction oldCSharpAlgoRChasHTTPAction = cSharpAlgoRChasHTTPAction;
		cSharpAlgoRChasHTTPAction = newCSharpAlgoRChasHTTPAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION, oldCSharpAlgoRChasHTTPAction, newCSharpAlgoRChasHTTPAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpAlgoRChasHTTPAction(HTTPAction newCSharpAlgoRChasHTTPAction) {
		if (newCSharpAlgoRChasHTTPAction != cSharpAlgoRChasHTTPAction) {
			NotificationChain msgs = null;
			if (cSharpAlgoRChasHTTPAction != null)
				msgs = ((InternalEObject)cSharpAlgoRChasHTTPAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION, null, msgs);
			if (newCSharpAlgoRChasHTTPAction != null)
				msgs = ((InternalEObject)newCSharpAlgoRChasHTTPAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION, null, msgs);
			msgs = basicSetCSharpAlgoRChasHTTPAction(newCSharpAlgoRChasHTTPAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION, newCSharpAlgoRChasHTTPAction, newCSharpAlgoRChasHTTPAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRoutingAnnotation getCSharpAlgoRControllerHasARAnnotation() {
		return cSharpAlgoRControllerHasARAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpAlgoRControllerHasARAnnotation(AttributeRoutingAnnotation newCSharpAlgoRControllerHasARAnnotation, NotificationChain msgs) {
		AttributeRoutingAnnotation oldCSharpAlgoRControllerHasARAnnotation = cSharpAlgoRControllerHasARAnnotation;
		cSharpAlgoRControllerHasARAnnotation = newCSharpAlgoRControllerHasARAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION, oldCSharpAlgoRControllerHasARAnnotation, newCSharpAlgoRControllerHasARAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpAlgoRControllerHasARAnnotation(AttributeRoutingAnnotation newCSharpAlgoRControllerHasARAnnotation) {
		if (newCSharpAlgoRControllerHasARAnnotation != cSharpAlgoRControllerHasARAnnotation) {
			NotificationChain msgs = null;
			if (cSharpAlgoRControllerHasARAnnotation != null)
				msgs = ((InternalEObject)cSharpAlgoRControllerHasARAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION, null, msgs);
			if (newCSharpAlgoRControllerHasARAnnotation != null)
				msgs = ((InternalEObject)newCSharpAlgoRControllerHasARAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION, null, msgs);
			msgs = basicSetCSharpAlgoRControllerHasARAnnotation(newCSharpAlgoRControllerHasARAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION, newCSharpAlgoRControllerHasARAnnotation, newCSharpAlgoRControllerHasARAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI, oldControllerURI, controllerURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION:
				return basicSetCSharpAlgoRChasHTTPAction(null, msgs);
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION:
				return basicSetCSharpAlgoRControllerHasARAnnotation(null, msgs);
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL:
				if (resolve) return getHasAssociatedCSharpAlgoModel();
				return basicGetHasAssociatedCSharpAlgoModel();
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION:
				return getCSharpAlgoRChasHTTPAction();
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__NAME:
				return getName();
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				return getParentName();
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION:
				return getCSharpAlgoRControllerHasARAnnotation();
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return getControllerURI();
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL:
				setHasAssociatedCSharpAlgoModel((CSharpAlgoResourceModel)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION:
				setCSharpAlgoRChasHTTPAction((HTTPAction)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION:
				setCSharpAlgoRControllerHasARAnnotation((AttributeRoutingAnnotation)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI((String)newValue);
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL:
				setHasAssociatedCSharpAlgoModel((CSharpAlgoResourceModel)null);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION:
				setCSharpAlgoRChasHTTPAction((HTTPAction)null);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION:
				setCSharpAlgoRControllerHasARAnnotation((AttributeRoutingAnnotation)null);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL:
				return hasAssociatedCSharpAlgoModel != null;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION:
				return cSharpAlgoRChasHTTPAction != null;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION:
				return cSharpAlgoRControllerHasARAnnotation != null;
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
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
		result.append(", parentName: ");
		result.append(parentName);
		result.append(", controllerURI: ");
		result.append(controllerURI);
		result.append(')');
		return result.toString();
	}

} //CSharpAlgoResourceControllerImpl
