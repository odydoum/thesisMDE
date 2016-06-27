/**
 */
package PSM.impl;

import PSM.CSharpAlgoResourceController;
import PSM.CSharpAlgoResourceModel;
import PSM.CSharpResourceController;
import PSM.CSharpResourceManagerController;
import PSM.CSharpResourceModel;
import PSM.CSharpResourceModelManager;
import PSM.EntityDatabaseController;
import PSM.PSMPackage;
import PSM.RESTfulServicePSM;

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
 * An implementation of the model object '<em><b>RES Tful Service PSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getHasCSharpRModel <em>Has CSharp RModel</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getHasCSharpRMManager <em>Has CSharp RM Manager</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getHasCSharpRMController <em>Has CSharp RM Controller</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getHasCSharpRController <em>Has CSharp RController</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getHasEntityDatabaseController <em>Has Entity Database Controller</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getHasCSharpAlgoRController <em>Has CSharp Algo RController</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getHasCSharpAlgoResourceModel <em>Has CSharp Algo Resource Model</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getServiceOutputPath <em>Service Output Path</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getServiceDatabaseIP <em>Service Database IP</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getServiceDatabasePort <em>Service Database Port</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getServiceDatabaseUsername <em>Service Database Username</em>}</li>
 *   <li>{@link PSM.impl.RESTfulServicePSMImpl#getServiceDatabasePassword <em>Service Database Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RESTfulServicePSMImpl extends MinimalEObjectImpl.Container implements RESTfulServicePSM {
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
	 * The cached value of the '{@link #getHasCSharpRModel() <em>Has CSharp RModel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCSharpRModel()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpResourceModel> hasCSharpRModel;

	/**
	 * The cached value of the '{@link #getHasCSharpRMManager() <em>Has CSharp RM Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCSharpRMManager()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpResourceModelManager> hasCSharpRMManager;

	/**
	 * The cached value of the '{@link #getHasCSharpRMController() <em>Has CSharp RM Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCSharpRMController()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpResourceManagerController> hasCSharpRMController;

	/**
	 * The cached value of the '{@link #getHasCSharpRController() <em>Has CSharp RController</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCSharpRController()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpResourceController> hasCSharpRController;

	/**
	 * The cached value of the '{@link #getHasEntityDatabaseController() <em>Has Entity Database Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntityDatabaseController()
	 * @generated
	 * @ordered
	 */
	protected EntityDatabaseController hasEntityDatabaseController;

	/**
	 * The cached value of the '{@link #getHasCSharpAlgoRController() <em>Has CSharp Algo RController</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCSharpAlgoRController()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpAlgoResourceController> hasCSharpAlgoRController;

	/**
	 * The cached value of the '{@link #getHasCSharpAlgoResourceModel() <em>Has CSharp Algo Resource Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCSharpAlgoResourceModel()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpAlgoResourceModel> hasCSharpAlgoResourceModel;

	/**
	 * The default value of the '{@link #getServiceOutputPath() <em>Service Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOutputPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_OUTPUT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceOutputPath() <em>Service Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOutputPath()
	 * @generated
	 * @ordered
	 */
	protected String serviceOutputPath = SERVICE_OUTPUT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabaseIP() <em>Service Database IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseIP()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabaseIP() <em>Service Database IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseIP()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabaseIP = SERVICE_DATABASE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabasePort() <em>Service Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabasePort() <em>Service Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabasePort = SERVICE_DATABASE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabaseUsername() <em>Service Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabaseUsername() <em>Service Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabaseUsername = SERVICE_DATABASE_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabasePassword() <em>Service Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabasePassword() <em>Service Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabasePassword = SERVICE_DATABASE_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTfulServicePSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.RES_TFUL_SERVICE_PSM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpResourceModel> getHasCSharpRModel() {
		if (hasCSharpRModel == null) {
			hasCSharpRModel = new EObjectContainmentEList<CSharpResourceModel>(CSharpResourceModel.class, this, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL);
		}
		return hasCSharpRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpResourceModelManager> getHasCSharpRMManager() {
		if (hasCSharpRMManager == null) {
			hasCSharpRMManager = new EObjectContainmentEList<CSharpResourceModelManager>(CSharpResourceModelManager.class, this, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER);
		}
		return hasCSharpRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpResourceManagerController> getHasCSharpRMController() {
		if (hasCSharpRMController == null) {
			hasCSharpRMController = new EObjectContainmentEList<CSharpResourceManagerController>(CSharpResourceManagerController.class, this, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER);
		}
		return hasCSharpRMController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpResourceController> getHasCSharpRController() {
		if (hasCSharpRController == null) {
			hasCSharpRController = new EObjectContainmentEList<CSharpResourceController>(CSharpResourceController.class, this, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER);
		}
		return hasCSharpRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDatabaseController getHasEntityDatabaseController() {
		return hasEntityDatabaseController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasEntityDatabaseController(EntityDatabaseController newHasEntityDatabaseController, NotificationChain msgs) {
		EntityDatabaseController oldHasEntityDatabaseController = hasEntityDatabaseController;
		hasEntityDatabaseController = newHasEntityDatabaseController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER, oldHasEntityDatabaseController, newHasEntityDatabaseController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasEntityDatabaseController(EntityDatabaseController newHasEntityDatabaseController) {
		if (newHasEntityDatabaseController != hasEntityDatabaseController) {
			NotificationChain msgs = null;
			if (hasEntityDatabaseController != null)
				msgs = ((InternalEObject)hasEntityDatabaseController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER, null, msgs);
			if (newHasEntityDatabaseController != null)
				msgs = ((InternalEObject)newHasEntityDatabaseController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER, null, msgs);
			msgs = basicSetHasEntityDatabaseController(newHasEntityDatabaseController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER, newHasEntityDatabaseController, newHasEntityDatabaseController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpAlgoResourceController> getHasCSharpAlgoRController() {
		if (hasCSharpAlgoRController == null) {
			hasCSharpAlgoRController = new EObjectContainmentEList<CSharpAlgoResourceController>(CSharpAlgoResourceController.class, this, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER);
		}
		return hasCSharpAlgoRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpAlgoResourceModel> getHasCSharpAlgoResourceModel() {
		if (hasCSharpAlgoResourceModel == null) {
			hasCSharpAlgoResourceModel = new EObjectContainmentEList<CSharpAlgoResourceModel>(CSharpAlgoResourceModel.class, this, PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL);
		}
		return hasCSharpAlgoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceOutputPath() {
		return serviceOutputPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceOutputPath(String newServiceOutputPath) {
		String oldServiceOutputPath = serviceOutputPath;
		serviceOutputPath = newServiceOutputPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH, oldServiceOutputPath, serviceOutputPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabaseIP() {
		return serviceDatabaseIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabaseIP(String newServiceDatabaseIP) {
		String oldServiceDatabaseIP = serviceDatabaseIP;
		serviceDatabaseIP = newServiceDatabaseIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP, oldServiceDatabaseIP, serviceDatabaseIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabasePort() {
		return serviceDatabasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabasePort(String newServiceDatabasePort) {
		String oldServiceDatabasePort = serviceDatabasePort;
		serviceDatabasePort = newServiceDatabasePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT, oldServiceDatabasePort, serviceDatabasePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabaseUsername() {
		return serviceDatabaseUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabaseUsername(String newServiceDatabaseUsername) {
		String oldServiceDatabaseUsername = serviceDatabaseUsername;
		serviceDatabaseUsername = newServiceDatabaseUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME, oldServiceDatabaseUsername, serviceDatabaseUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabasePassword() {
		return serviceDatabasePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabasePassword(String newServiceDatabasePassword) {
		String oldServiceDatabasePassword = serviceDatabasePassword;
		serviceDatabasePassword = newServiceDatabasePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD, oldServiceDatabasePassword, serviceDatabasePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL:
				return ((InternalEList<?>)getHasCSharpRModel()).basicRemove(otherEnd, msgs);
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER:
				return ((InternalEList<?>)getHasCSharpRMManager()).basicRemove(otherEnd, msgs);
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER:
				return ((InternalEList<?>)getHasCSharpRMController()).basicRemove(otherEnd, msgs);
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER:
				return ((InternalEList<?>)getHasCSharpRController()).basicRemove(otherEnd, msgs);
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER:
				return basicSetHasEntityDatabaseController(null, msgs);
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER:
				return ((InternalEList<?>)getHasCSharpAlgoRController()).basicRemove(otherEnd, msgs);
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL:
				return ((InternalEList<?>)getHasCSharpAlgoResourceModel()).basicRemove(otherEnd, msgs);
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
			case PSMPackage.RES_TFUL_SERVICE_PSM__NAME:
				return getName();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL:
				return getHasCSharpRModel();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER:
				return getHasCSharpRMManager();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER:
				return getHasCSharpRMController();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER:
				return getHasCSharpRController();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER:
				return getHasEntityDatabaseController();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER:
				return getHasCSharpAlgoRController();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL:
				return getHasCSharpAlgoResourceModel();
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH:
				return getServiceOutputPath();
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP:
				return getServiceDatabaseIP();
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT:
				return getServiceDatabasePort();
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				return getServiceDatabaseUsername();
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				return getServiceDatabasePassword();
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
			case PSMPackage.RES_TFUL_SERVICE_PSM__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL:
				getHasCSharpRModel().clear();
				getHasCSharpRModel().addAll((Collection<? extends CSharpResourceModel>)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER:
				getHasCSharpRMManager().clear();
				getHasCSharpRMManager().addAll((Collection<? extends CSharpResourceModelManager>)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER:
				getHasCSharpRMController().clear();
				getHasCSharpRMController().addAll((Collection<? extends CSharpResourceManagerController>)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER:
				getHasCSharpRController().clear();
				getHasCSharpRController().addAll((Collection<? extends CSharpResourceController>)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER:
				setHasEntityDatabaseController((EntityDatabaseController)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER:
				getHasCSharpAlgoRController().clear();
				getHasCSharpAlgoRController().addAll((Collection<? extends CSharpAlgoResourceController>)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL:
				getHasCSharpAlgoResourceModel().clear();
				getHasCSharpAlgoResourceModel().addAll((Collection<? extends CSharpAlgoResourceModel>)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH:
				setServiceOutputPath((String)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP:
				setServiceDatabaseIP((String)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT:
				setServiceDatabasePort((String)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				setServiceDatabaseUsername((String)newValue);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				setServiceDatabasePassword((String)newValue);
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
			case PSMPackage.RES_TFUL_SERVICE_PSM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL:
				getHasCSharpRModel().clear();
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER:
				getHasCSharpRMManager().clear();
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER:
				getHasCSharpRMController().clear();
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER:
				getHasCSharpRController().clear();
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER:
				setHasEntityDatabaseController((EntityDatabaseController)null);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER:
				getHasCSharpAlgoRController().clear();
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL:
				getHasCSharpAlgoResourceModel().clear();
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH:
				setServiceOutputPath(SERVICE_OUTPUT_PATH_EDEFAULT);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP:
				setServiceDatabaseIP(SERVICE_DATABASE_IP_EDEFAULT);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT:
				setServiceDatabasePort(SERVICE_DATABASE_PORT_EDEFAULT);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				setServiceDatabaseUsername(SERVICE_DATABASE_USERNAME_EDEFAULT);
				return;
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				setServiceDatabasePassword(SERVICE_DATABASE_PASSWORD_EDEFAULT);
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
			case PSMPackage.RES_TFUL_SERVICE_PSM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL:
				return hasCSharpRModel != null && !hasCSharpRModel.isEmpty();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER:
				return hasCSharpRMManager != null && !hasCSharpRMManager.isEmpty();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER:
				return hasCSharpRMController != null && !hasCSharpRMController.isEmpty();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER:
				return hasCSharpRController != null && !hasCSharpRController.isEmpty();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER:
				return hasEntityDatabaseController != null;
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER:
				return hasCSharpAlgoRController != null && !hasCSharpAlgoRController.isEmpty();
			case PSMPackage.RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL:
				return hasCSharpAlgoResourceModel != null && !hasCSharpAlgoResourceModel.isEmpty();
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH:
				return SERVICE_OUTPUT_PATH_EDEFAULT == null ? serviceOutputPath != null : !SERVICE_OUTPUT_PATH_EDEFAULT.equals(serviceOutputPath);
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP:
				return SERVICE_DATABASE_IP_EDEFAULT == null ? serviceDatabaseIP != null : !SERVICE_DATABASE_IP_EDEFAULT.equals(serviceDatabaseIP);
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT:
				return SERVICE_DATABASE_PORT_EDEFAULT == null ? serviceDatabasePort != null : !SERVICE_DATABASE_PORT_EDEFAULT.equals(serviceDatabasePort);
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				return SERVICE_DATABASE_USERNAME_EDEFAULT == null ? serviceDatabaseUsername != null : !SERVICE_DATABASE_USERNAME_EDEFAULT.equals(serviceDatabaseUsername);
			case PSMPackage.RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				return SERVICE_DATABASE_PASSWORD_EDEFAULT == null ? serviceDatabasePassword != null : !SERVICE_DATABASE_PASSWORD_EDEFAULT.equals(serviceDatabasePassword);
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
		result.append(", serviceOutputPath: ");
		result.append(serviceOutputPath);
		result.append(", serviceDatabaseIP: ");
		result.append(serviceDatabaseIP);
		result.append(", serviceDatabasePort: ");
		result.append(serviceDatabasePort);
		result.append(", serviceDatabaseUsername: ");
		result.append(serviceDatabaseUsername);
		result.append(", serviceDatabasePassword: ");
		result.append(serviceDatabasePassword);
		result.append(')');
		return result.toString();
	}

} //RESTfulServicePSMImpl
