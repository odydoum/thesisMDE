/**
 */
package PSM.impl;

import PSM.AttributeRoutingAnnotation;
import PSM.CSharpAlgoResourceController;
import PSM.CSharpAlgoResourceModel;
import PSM.CSharpPropertyAccessor;
import PSM.CSharpPropertyGetter;
import PSM.CSharpPropertySetter;
import PSM.CSharpResourceController;
import PSM.CSharpResourceManagerController;
import PSM.CSharpResourceModel;
import PSM.CSharpResourceModelManager;
import PSM.CreateHypermediaFunction;
import PSM.DataContractAnnotation;
import PSM.EntityActivity;
import PSM.EntityAnnotation;
import PSM.EntityDatabaseController;
import PSM.FunctionParameter;
import PSM.HTTPAction;
import PSM.HTTPActionHandler;
import PSM.HTTPVerb;
import PSM.LinkType;
import PSM.PSMComponentProperty;
import PSM.PSMFactory;
import PSM.PSMHypermediaLink;
import PSM.PSMPackage;
import PSM.RESTfulServicePSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSMPackageImpl extends EPackageImpl implements PSMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resTfulServicePSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpResourceModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psmComponentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContractAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpResourceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpResourceManagerControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRoutingAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpActionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDatabaseControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createHypermediaFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psmHypermediaLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpAlgoResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpAlgoResourceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpPropertySetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpPropertyGetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpPropertyAccessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see PSM.PSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PSMPackageImpl() {
		super(eNS_URI, PSMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PSMPackage init() {
		if (isInited) return (PSMPackage)EPackage.Registry.INSTANCE.getEPackage(PSMPackage.eNS_URI);

		// Obtain or create and register package
		PSMPackageImpl thePSMPackage = (PSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PSMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePSMPackage.createPackageContents();

		// Initialize created meta-data
		thePSMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PSMPackage.eNS_URI, thePSMPackage);
		return thePSMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRESTfulServicePSM() {
		return resTfulServicePSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServicePSM_Name() {
		return (EAttribute)resTfulServicePSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePSM_HasCSharpRModel() {
		return (EReference)resTfulServicePSMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePSM_HasCSharpRMManager() {
		return (EReference)resTfulServicePSMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePSM_HasCSharpRMController() {
		return (EReference)resTfulServicePSMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePSM_HasCSharpRController() {
		return (EReference)resTfulServicePSMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePSM_HasEntityDatabaseController() {
		return (EReference)resTfulServicePSMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePSM_HasCSharpAlgoRController() {
		return (EReference)resTfulServicePSMEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePSM_HasCSharpAlgoResourceModel() {
		return (EReference)resTfulServicePSMEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServicePSM_ServiceOutputPath() {
		return (EAttribute)resTfulServicePSMEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServicePSM_ServiceDatabaseIP() {
		return (EAttribute)resTfulServicePSMEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServicePSM_ServiceDatabasePort() {
		return (EAttribute)resTfulServicePSMEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServicePSM_ServiceDatabaseUsername() {
		return (EAttribute)resTfulServicePSMEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServicePSM_ServiceDatabasePassword() {
		return (EAttribute)resTfulServicePSMEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpResourceModel() {
		return cSharpResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceModel_Name() {
		return (EAttribute)cSharpResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModel_HasRelatedCSharpRMManager() {
		return (EReference)cSharpResourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModel_CSharpRModelHasProperty() {
		return (EReference)cSharpResourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModel_CSharpRModelHasDataAnnotation() {
		return (EReference)cSharpResourceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModel_CSharpRModelHasEntityAnnotation() {
		return (EReference)cSharpResourceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceModel_ParentName() {
		return (EAttribute)cSharpResourceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModel_CSharpRModelHasGetter() {
		return (EReference)cSharpResourceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModel_CSharpRModelHasSetter() {
		return (EReference)cSharpResourceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModel_HasRelatedCSharpAlgoModel() {
		return (EReference)cSharpResourceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpResourceModelManager() {
		return cSharpResourceModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceModelManager_Name() {
		return (EAttribute)cSharpResourceModelManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModelManager_HasRelatedCSharpRModel() {
		return (EReference)cSharpResourceModelManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModelManager_CSharpRMManagerHasProperty() {
		return (EReference)cSharpResourceModelManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModelManager_CSharpRMManagerHasDataAnnotation() {
		return (EReference)cSharpResourceModelManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceModelManager_ParentName() {
		return (EAttribute)cSharpResourceModelManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModelManager_CSharpRMManagerHasGetter() {
		return (EReference)cSharpResourceModelManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceModelManager_CSharpRMManagerHasSetter() {
		return (EReference)cSharpResourceModelManagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSMComponentProperty() {
		return psmComponentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_Name() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_Type() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_BIsUnique() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_BIsPrimaryIdentifier() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMComponentProperty_PropertyHasDataAnnotation() {
		return (EReference)psmComponentPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMComponentProperty_PropertyHasEntityAnnotation() {
		return (EReference)psmComponentPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_CorrespondingField() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_BIsForeignKey() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_BIsNavigationProperty() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityAnnotation() {
		return entityAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAnnotation_EntityAnnotationText() {
		return (EAttribute)entityAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataContractAnnotation() {
		return dataContractAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataContractAnnotation_DataContractAnnotationText() {
		return (EAttribute)dataContractAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameter() {
		return functionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_Name() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_Type() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_BIsUnique() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_BIsReturnParameter() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpResourceController() {
		return cSharpResourceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceController_Name() {
		return (EAttribute)cSharpResourceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceController_ControllerURI() {
		return (EAttribute)cSharpResourceControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceController_HasAssociatedCSharpRModel() {
		return (EReference)cSharpResourceControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceController_CSharpRControllerHasARAnnotation() {
		return (EReference)cSharpResourceControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceController_CSharpRControllerHasAction() {
		return (EReference)cSharpResourceControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceController_ParentName() {
		return (EAttribute)cSharpResourceControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpResourceManagerController() {
		return cSharpResourceManagerControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceManagerController_Name() {
		return (EAttribute)cSharpResourceManagerControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceManagerController_ControllerURI() {
		return (EAttribute)cSharpResourceManagerControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceManagerController_HasAssociatedCSharpRMManager() {
		return (EReference)cSharpResourceManagerControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceManagerController_CSharpRMControllerHasARAnnotation() {
		return (EReference)cSharpResourceManagerControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpResourceManagerController_CSharpRMControllerHasAction() {
		return (EReference)cSharpResourceManagerControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpResourceManagerController_ParentName() {
		return (EAttribute)cSharpResourceManagerControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPAction() {
		return httpActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPAction_Name() {
		return (EAttribute)httpActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPAction_ActionHTTPVerb() {
		return (EAttribute)httpActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPAction_HTTPActionURI() {
		return (EAttribute)httpActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPAction_HTTPActionHasARAnnotation() {
		return (EReference)httpActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPAction_HTTPActionHasParameter() {
		return (EReference)httpActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPAction_HasHTTPActionHandler() {
		return (EReference)httpActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRoutingAnnotation() {
		return attributeRoutingAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeRoutingAnnotation_AttributeRoutingAnnotationText() {
		return (EAttribute)attributeRoutingAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPActionHandler() {
		return httpActionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPActionHandler_Name() {
		return (EAttribute)httpActionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPActionHandler_HandlerHTTPVerb() {
		return (EAttribute)httpActionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActionHandler_UsesEntityActivity() {
		return (EReference)httpActionHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActionHandler_HasHypermediaFunction() {
		return (EReference)httpActionHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityActivity() {
		return entityActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityActivity_Name() {
		return (EAttribute)entityActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityActivity_EntityActivityHTTPVerb() {
		return (EAttribute)entityActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityDatabaseController() {
		return entityDatabaseControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityDatabaseController_Name() {
		return (EAttribute)entityDatabaseControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityDatabaseController_HasEntityActivity() {
		return (EReference)entityDatabaseControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateHypermediaFunction() {
		return createHypermediaFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateHypermediaFunction_HasPSMHypermediaLink() {
		return (EReference)createHypermediaFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSMHypermediaLink() {
		return psmHypermediaLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMHypermediaLink_LinkHTTPVerb() {
		return (EAttribute)psmHypermediaLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMHypermediaLink_LinkType() {
		return (EAttribute)psmHypermediaLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMHypermediaLink_HasTargetCSharpRController() {
		return (EReference)psmHypermediaLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMHypermediaLink_HasTargetCSharpRMController() {
		return (EReference)psmHypermediaLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMHypermediaLink_HasTargetCSharpAlgoRController() {
		return (EReference)psmHypermediaLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpAlgoResourceModel() {
		return cSharpAlgoResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceModel_CSharpAlgoModelHasProperty() {
		return (EReference)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpAlgoResourceModel_Name() {
		return (EAttribute)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpAlgoResourceModel_ParentName() {
		return (EAttribute)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceModel_CSharpAlgoModelHasGetter() {
		return (EReference)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceModel_CSharpAlgoModelHasSetter() {
		return (EReference)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceModel_CSharpAlgoRModelHasDataContractAnnotation() {
		return (EReference)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceModel_HasRelatedCSharpAlgoModel() {
		return (EReference)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceModel_IsRelatedCSharpAlgoModel() {
		return (EReference)cSharpAlgoResourceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpAlgoResourceController() {
		return cSharpAlgoResourceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceController_HasAssociatedCSharpAlgoModel() {
		return (EReference)cSharpAlgoResourceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceController_CSharpAlgoRChasHTTPAction() {
		return (EReference)cSharpAlgoResourceControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpAlgoResourceController_Name() {
		return (EAttribute)cSharpAlgoResourceControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpAlgoResourceController_ParentName() {
		return (EAttribute)cSharpAlgoResourceControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpAlgoResourceController_CSharpAlgoRControllerHasARAnnotation() {
		return (EReference)cSharpAlgoResourceControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSharpAlgoResourceController_ControllerURI() {
		return (EAttribute)cSharpAlgoResourceControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpPropertySetter() {
		return cSharpPropertySetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpPropertySetter_SetsProperty() {
		return (EReference)cSharpPropertySetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpPropertyGetter() {
		return cSharpPropertyGetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSharpPropertyGetter_GetsProperty() {
		return (EReference)cSharpPropertyGetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpPropertyAccessor() {
		return cSharpPropertyAccessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkType() {
		return linkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHTTPVerb() {
		return httpVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMFactory getPSMFactory() {
		return (PSMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resTfulServicePSMEClass = createEClass(RES_TFUL_SERVICE_PSM);
		createEAttribute(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__NAME);
		createEReference(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL);
		createEReference(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER);
		createEReference(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER);
		createEReference(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER);
		createEReference(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER);
		createEReference(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER);
		createEReference(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL);
		createEAttribute(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH);
		createEAttribute(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP);
		createEAttribute(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT);
		createEAttribute(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME);
		createEAttribute(resTfulServicePSMEClass, RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD);

		cSharpResourceModelEClass = createEClass(CSHARP_RESOURCE_MODEL);
		createEAttribute(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__NAME);
		createEReference(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER);
		createEReference(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY);
		createEReference(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION);
		createEReference(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION);
		createEAttribute(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__PARENT_NAME);
		createEReference(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER);
		createEReference(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER);
		createEReference(cSharpResourceModelEClass, CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL);

		cSharpResourceModelManagerEClass = createEClass(CSHARP_RESOURCE_MODEL_MANAGER);
		createEAttribute(cSharpResourceModelManagerEClass, CSHARP_RESOURCE_MODEL_MANAGER__NAME);
		createEReference(cSharpResourceModelManagerEClass, CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL);
		createEReference(cSharpResourceModelManagerEClass, CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY);
		createEReference(cSharpResourceModelManagerEClass, CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION);
		createEAttribute(cSharpResourceModelManagerEClass, CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME);
		createEReference(cSharpResourceModelManagerEClass, CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER);
		createEReference(cSharpResourceModelManagerEClass, CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER);

		psmComponentPropertyEClass = createEClass(PSM_COMPONENT_PROPERTY);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__NAME);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__TYPE);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__BIS_UNIQUE);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER);
		createEReference(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION);
		createEReference(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY);

		entityAnnotationEClass = createEClass(ENTITY_ANNOTATION);
		createEAttribute(entityAnnotationEClass, ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT);

		dataContractAnnotationEClass = createEClass(DATA_CONTRACT_ANNOTATION);
		createEAttribute(dataContractAnnotationEClass, DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT);

		functionParameterEClass = createEClass(FUNCTION_PARAMETER);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__NAME);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__TYPE);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__BIS_UNIQUE);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__BIS_RETURN_PARAMETER);

		cSharpResourceControllerEClass = createEClass(CSHARP_RESOURCE_CONTROLLER);
		createEAttribute(cSharpResourceControllerEClass, CSHARP_RESOURCE_CONTROLLER__NAME);
		createEAttribute(cSharpResourceControllerEClass, CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI);
		createEReference(cSharpResourceControllerEClass, CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL);
		createEReference(cSharpResourceControllerEClass, CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION);
		createEReference(cSharpResourceControllerEClass, CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION);
		createEAttribute(cSharpResourceControllerEClass, CSHARP_RESOURCE_CONTROLLER__PARENT_NAME);

		cSharpResourceManagerControllerEClass = createEClass(CSHARP_RESOURCE_MANAGER_CONTROLLER);
		createEAttribute(cSharpResourceManagerControllerEClass, CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME);
		createEAttribute(cSharpResourceManagerControllerEClass, CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI);
		createEReference(cSharpResourceManagerControllerEClass, CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER);
		createEReference(cSharpResourceManagerControllerEClass, CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION);
		createEReference(cSharpResourceManagerControllerEClass, CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION);
		createEAttribute(cSharpResourceManagerControllerEClass, CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME);

		httpActionEClass = createEClass(HTTP_ACTION);
		createEAttribute(httpActionEClass, HTTP_ACTION__NAME);
		createEAttribute(httpActionEClass, HTTP_ACTION__ACTION_HTTP_VERB);
		createEAttribute(httpActionEClass, HTTP_ACTION__HTTP_ACTION_URI);
		createEReference(httpActionEClass, HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION);
		createEReference(httpActionEClass, HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER);
		createEReference(httpActionEClass, HTTP_ACTION__HAS_HTTP_ACTION_HANDLER);

		attributeRoutingAnnotationEClass = createEClass(ATTRIBUTE_ROUTING_ANNOTATION);
		createEAttribute(attributeRoutingAnnotationEClass, ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT);

		httpActionHandlerEClass = createEClass(HTTP_ACTION_HANDLER);
		createEAttribute(httpActionHandlerEClass, HTTP_ACTION_HANDLER__NAME);
		createEAttribute(httpActionHandlerEClass, HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB);
		createEReference(httpActionHandlerEClass, HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY);
		createEReference(httpActionHandlerEClass, HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION);

		entityActivityEClass = createEClass(ENTITY_ACTIVITY);
		createEAttribute(entityActivityEClass, ENTITY_ACTIVITY__NAME);
		createEAttribute(entityActivityEClass, ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB);

		entityDatabaseControllerEClass = createEClass(ENTITY_DATABASE_CONTROLLER);
		createEAttribute(entityDatabaseControllerEClass, ENTITY_DATABASE_CONTROLLER__NAME);
		createEReference(entityDatabaseControllerEClass, ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY);

		createHypermediaFunctionEClass = createEClass(CREATE_HYPERMEDIA_FUNCTION);
		createEReference(createHypermediaFunctionEClass, CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK);

		psmHypermediaLinkEClass = createEClass(PSM_HYPERMEDIA_LINK);
		createEAttribute(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB);
		createEAttribute(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__LINK_TYPE);
		createEReference(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER);
		createEReference(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER);
		createEReference(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER);

		cSharpAlgoResourceModelEClass = createEClass(CSHARP_ALGO_RESOURCE_MODEL);
		createEReference(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY);
		createEAttribute(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__NAME);
		createEAttribute(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME);
		createEReference(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER);
		createEReference(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER);
		createEReference(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION);
		createEReference(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL);
		createEReference(cSharpAlgoResourceModelEClass, CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL);

		cSharpAlgoResourceControllerEClass = createEClass(CSHARP_ALGO_RESOURCE_CONTROLLER);
		createEReference(cSharpAlgoResourceControllerEClass, CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL);
		createEReference(cSharpAlgoResourceControllerEClass, CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION);
		createEAttribute(cSharpAlgoResourceControllerEClass, CSHARP_ALGO_RESOURCE_CONTROLLER__NAME);
		createEAttribute(cSharpAlgoResourceControllerEClass, CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME);
		createEReference(cSharpAlgoResourceControllerEClass, CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION);
		createEAttribute(cSharpAlgoResourceControllerEClass, CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI);

		cSharpPropertySetterEClass = createEClass(CSHARP_PROPERTY_SETTER);
		createEReference(cSharpPropertySetterEClass, CSHARP_PROPERTY_SETTER__SETS_PROPERTY);

		cSharpPropertyGetterEClass = createEClass(CSHARP_PROPERTY_GETTER);
		createEReference(cSharpPropertyGetterEClass, CSHARP_PROPERTY_GETTER__GETS_PROPERTY);

		cSharpPropertyAccessorEClass = createEClass(CSHARP_PROPERTY_ACCESSOR);

		// Create enums
		linkTypeEEnum = createEEnum(LINK_TYPE);
		httpVerbEEnum = createEEnum(HTTP_VERB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cSharpPropertySetterEClass.getESuperTypes().add(this.getCSharpPropertyAccessor());
		cSharpPropertyGetterEClass.getESuperTypes().add(this.getCSharpPropertyAccessor());

		// Initialize classes, features, and operations; add parameters
		initEClass(resTfulServicePSMEClass, RESTfulServicePSM.class, "RESTfulServicePSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRESTfulServicePSM_Name(), ecorePackage.getEString(), "name", null, 1, 1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePSM_HasCSharpRModel(), this.getCSharpResourceModel(), null, "hasCSharpRModel", null, 0, -1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePSM_HasCSharpRMManager(), this.getCSharpResourceModelManager(), null, "hasCSharpRMManager", null, 0, -1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePSM_HasCSharpRMController(), this.getCSharpResourceManagerController(), null, "hasCSharpRMController", null, 0, -1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePSM_HasCSharpRController(), this.getCSharpResourceController(), null, "hasCSharpRController", null, 0, -1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePSM_HasEntityDatabaseController(), this.getEntityDatabaseController(), null, "hasEntityDatabaseController", null, 1, 1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePSM_HasCSharpAlgoRController(), this.getCSharpAlgoResourceController(), null, "hasCSharpAlgoRController", null, 0, -1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePSM_HasCSharpAlgoResourceModel(), this.getCSharpAlgoResourceModel(), null, "hasCSharpAlgoResourceModel", null, 0, -1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServicePSM_ServiceOutputPath(), ecorePackage.getEString(), "serviceOutputPath", null, 1, 1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServicePSM_ServiceDatabaseIP(), ecorePackage.getEString(), "serviceDatabaseIP", null, 1, 1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServicePSM_ServiceDatabasePort(), ecorePackage.getEString(), "serviceDatabasePort", null, 1, 1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServicePSM_ServiceDatabaseUsername(), ecorePackage.getEString(), "serviceDatabaseUsername", null, 1, 1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServicePSM_ServiceDatabasePassword(), ecorePackage.getEString(), "serviceDatabasePassword", null, 1, 1, RESTfulServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpResourceModelEClass, CSharpResourceModel.class, "CSharpResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSharpResourceModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModel_HasRelatedCSharpRMManager(), this.getCSharpResourceModelManager(), null, "hasRelatedCSharpRMManager", null, 0, -1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModel_CSharpRModelHasProperty(), this.getPSMComponentProperty(), null, "CSharpRModelHasProperty", null, 1, -1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModel_CSharpRModelHasDataAnnotation(), this.getDataContractAnnotation(), null, "CSharpRModelHasDataAnnotation", null, 1, 1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModel_CSharpRModelHasEntityAnnotation(), this.getEntityAnnotation(), null, "CSharpRModelHasEntityAnnotation", null, 1, 1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpResourceModel_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModel_CSharpRModelHasGetter(), this.getCSharpPropertyGetter(), null, "CSharpRModelHasGetter", null, 1, -1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModel_CSharpRModelHasSetter(), this.getCSharpPropertySetter(), null, "CSharpRModelHasSetter", null, 1, -1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModel_HasRelatedCSharpAlgoModel(), this.getCSharpAlgoResourceModel(), null, "hasRelatedCSharpAlgoModel", null, 0, -1, CSharpResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpResourceModelManagerEClass, CSharpResourceModelManager.class, "CSharpResourceModelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSharpResourceModelManager_Name(), ecorePackage.getEString(), "name", null, 1, 1, CSharpResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModelManager_HasRelatedCSharpRModel(), this.getCSharpResourceModel(), null, "hasRelatedCSharpRModel", null, 1, 1, CSharpResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModelManager_CSharpRMManagerHasProperty(), this.getPSMComponentProperty(), null, "CSharpRMManagerHasProperty", null, 1, 1, CSharpResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModelManager_CSharpRMManagerHasDataAnnotation(), this.getDataContractAnnotation(), null, "CSharpRMManagerHasDataAnnotation", null, 1, 1, CSharpResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpResourceModelManager_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, CSharpResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModelManager_CSharpRMManagerHasGetter(), this.getCSharpPropertyGetter(), null, "CSharpRMManagerHasGetter", null, 1, 1, CSharpResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceModelManager_CSharpRMManagerHasSetter(), this.getCSharpPropertySetter(), null, "CSharpRMManagerHasSetter", null, 1, 1, CSharpResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psmComponentPropertyEClass, PSMComponentProperty.class, "PSMComponentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSMComponentProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_BIsUnique(), ecorePackage.getEBoolean(), "bIsUnique", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPSMComponentProperty_BIsPrimaryIdentifier(), ecorePackage.getEBoolean(), "bIsPrimaryIdentifier", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPSMComponentProperty_PropertyHasDataAnnotation(), this.getDataContractAnnotation(), null, "PropertyHasDataAnnotation", null, 0, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMComponentProperty_PropertyHasEntityAnnotation(), this.getEntityAnnotation(), null, "PropertyHasEntityAnnotation", null, 0, 2, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_CorrespondingField(), ecorePackage.getEString(), "correspondingField", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_BIsForeignKey(), ecorePackage.getEBoolean(), "bIsForeignKey", "false", 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_BIsNavigationProperty(), ecorePackage.getEBoolean(), "bIsNavigationProperty", "false", 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityAnnotationEClass, EntityAnnotation.class, "EntityAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityAnnotation_EntityAnnotationText(), ecorePackage.getEString(), "EntityAnnotationText", null, 1, 1, EntityAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataContractAnnotationEClass, DataContractAnnotation.class, "DataContractAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataContractAnnotation_DataContractAnnotationText(), ecorePackage.getEString(), "dataContractAnnotationText", null, 1, 1, DataContractAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionParameterEClass, FunctionParameter.class, "FunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFunctionParameter_Type(), ecorePackage.getEString(), "type", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_BIsUnique(), ecorePackage.getEBoolean(), "bIsUnique", "false", 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_BIsReturnParameter(), ecorePackage.getEBoolean(), "bIsReturnParameter", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpResourceControllerEClass, CSharpResourceController.class, "CSharpResourceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSharpResourceController_Name(), ecorePackage.getEString(), "name", "", 1, 1, CSharpResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSharpResourceController_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, CSharpResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceController_HasAssociatedCSharpRModel(), this.getCSharpResourceModel(), null, "hasAssociatedCSharpRModel", null, 1, 1, CSharpResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceController_CSharpRControllerHasARAnnotation(), this.getAttributeRoutingAnnotation(), null, "CSharpRControllerHasARAnnotation", null, 1, 1, CSharpResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceController_CSharpRControllerHasAction(), this.getHTTPAction(), null, "CSharpRControllerHasAction", null, 1, -1, CSharpResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpResourceController_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, CSharpResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpResourceManagerControllerEClass, CSharpResourceManagerController.class, "CSharpResourceManagerController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSharpResourceManagerController_Name(), ecorePackage.getEString(), "name", null, 1, 1, CSharpResourceManagerController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSharpResourceManagerController_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, CSharpResourceManagerController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceManagerController_HasAssociatedCSharpRMManager(), this.getCSharpResourceModelManager(), null, "hasAssociatedCSharpRMManager", null, 1, 1, CSharpResourceManagerController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceManagerController_CSharpRMControllerHasARAnnotation(), this.getAttributeRoutingAnnotation(), null, "CSharpRMControllerHasARAnnotation", null, 1, 1, CSharpResourceManagerController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpResourceManagerController_CSharpRMControllerHasAction(), this.getHTTPAction(), null, "CSharpRMControllerHasAction", null, 2, -1, CSharpResourceManagerController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpResourceManagerController_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, CSharpResourceManagerController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpActionEClass, HTTPAction.class, "HTTPAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPAction_Name(), ecorePackage.getEString(), "name", null, 1, 1, HTTPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHTTPAction_ActionHTTPVerb(), this.getHTTPVerb(), "ActionHTTPVerb", "GET", 1, 1, HTTPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPAction_HTTPActionURI(), ecorePackage.getEString(), "HTTPActionURI", null, 1, 1, HTTPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHTTPAction_HTTPActionHasARAnnotation(), this.getAttributeRoutingAnnotation(), null, "HTTPActionHasARAnnotation", null, 1, 3, HTTPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPAction_HTTPActionHasParameter(), this.getFunctionParameter(), null, "HTTPActionHasParameter", null, 0, -1, HTTPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPAction_HasHTTPActionHandler(), this.getHTTPActionHandler(), null, "hasHTTPActionHandler", null, 1, 1, HTTPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeRoutingAnnotationEClass, AttributeRoutingAnnotation.class, "AttributeRoutingAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeRoutingAnnotation_AttributeRoutingAnnotationText(), ecorePackage.getEString(), "AttributeRoutingAnnotationText", null, 1, 1, AttributeRoutingAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(httpActionHandlerEClass, HTTPActionHandler.class, "HTTPActionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPActionHandler_Name(), ecorePackage.getEString(), "name", null, 1, 1, HTTPActionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHTTPActionHandler_HandlerHTTPVerb(), this.getHTTPVerb(), "HandlerHTTPVerb", "GET", 1, 1, HTTPActionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPActionHandler_UsesEntityActivity(), this.getEntityActivity(), null, "usesEntityActivity", null, 0, 1, HTTPActionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPActionHandler_HasHypermediaFunction(), this.getCreateHypermediaFunction(), null, "hasHypermediaFunction", null, 1, 1, HTTPActionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityActivityEClass, EntityActivity.class, "EntityActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, EntityActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEntityActivity_EntityActivityHTTPVerb(), this.getHTTPVerb(), "EntityActivityHTTPVerb", "GET", 1, 1, EntityActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDatabaseControllerEClass, EntityDatabaseController.class, "EntityDatabaseController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityDatabaseController_Name(), ecorePackage.getEString(), "name", "", 1, 1, EntityDatabaseController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityDatabaseController_HasEntityActivity(), this.getEntityActivity(), null, "hasEntityActivity", null, 1, -1, EntityDatabaseController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createHypermediaFunctionEClass, CreateHypermediaFunction.class, "CreateHypermediaFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateHypermediaFunction_HasPSMHypermediaLink(), this.getPSMHypermediaLink(), null, "hasPSMHypermediaLink", null, 1, -1, CreateHypermediaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psmHypermediaLinkEClass, PSMHypermediaLink.class, "PSMHypermediaLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSMHypermediaLink_LinkHTTPVerb(), this.getHTTPVerb(), "linkHTTPVerb", "GET", 1, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPSMHypermediaLink_LinkType(), this.getLinkType(), "linkType", "Child", 1, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPSMHypermediaLink_HasTargetCSharpRController(), this.getCSharpResourceController(), null, "hasTargetCSharpRController", null, 0, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMHypermediaLink_HasTargetCSharpRMController(), this.getCSharpResourceManagerController(), null, "hasTargetCSharpRMController", null, 0, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMHypermediaLink_HasTargetCSharpAlgoRController(), this.getCSharpAlgoResourceController(), null, "hasTargetCSharpAlgoRController", null, 0, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpAlgoResourceModelEClass, CSharpAlgoResourceModel.class, "CSharpAlgoResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSharpAlgoResourceModel_CSharpAlgoModelHasProperty(), this.getPSMComponentProperty(), null, "CSharpAlgoModelHasProperty", null, 1, 1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpAlgoResourceModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpAlgoResourceModel_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpAlgoResourceModel_CSharpAlgoModelHasGetter(), this.getCSharpPropertyGetter(), null, "CSharpAlgoModelHasGetter", null, 1, 1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpAlgoResourceModel_CSharpAlgoModelHasSetter(), this.getCSharpPropertySetter(), null, "CSharpAlgoModelHasSetter", null, 1, 1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpAlgoResourceModel_CSharpAlgoRModelHasDataContractAnnotation(), this.getDataContractAnnotation(), null, "CSharpAlgoRModelHasDataContractAnnotation", null, 1, 1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpAlgoResourceModel_HasRelatedCSharpAlgoModel(), this.getCSharpAlgoResourceModel(), null, "hasRelatedCSharpAlgoModel", null, 0, -1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpAlgoResourceModel_IsRelatedCSharpAlgoModel(), this.getCSharpAlgoResourceModel(), null, "isRelatedCSharpAlgoModel", null, 0, -1, CSharpAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpAlgoResourceControllerEClass, CSharpAlgoResourceController.class, "CSharpAlgoResourceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSharpAlgoResourceController_HasAssociatedCSharpAlgoModel(), this.getCSharpAlgoResourceModel(), null, "hasAssociatedCSharpAlgoModel", null, 1, 1, CSharpAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpAlgoResourceController_CSharpAlgoRChasHTTPAction(), this.getHTTPAction(), null, "CSharpAlgoRChasHTTPAction", null, 1, 1, CSharpAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpAlgoResourceController_Name(), ecorePackage.getEString(), "name", null, 1, 1, CSharpAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpAlgoResourceController_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, CSharpAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSharpAlgoResourceController_CSharpAlgoRControllerHasARAnnotation(), this.getAttributeRoutingAnnotation(), null, "CSharpAlgoRControllerHasARAnnotation", null, 1, 1, CSharpAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSharpAlgoResourceController_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, CSharpAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpPropertySetterEClass, CSharpPropertySetter.class, "CSharpPropertySetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSharpPropertySetter_SetsProperty(), this.getPSMComponentProperty(), null, "setsProperty", null, 1, 1, CSharpPropertySetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpPropertyGetterEClass, CSharpPropertyGetter.class, "CSharpPropertyGetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSharpPropertyGetter_GetsProperty(), this.getPSMComponentProperty(), null, "getsProperty", null, 1, 1, CSharpPropertyGetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpPropertyAccessorEClass, CSharpPropertyAccessor.class, "CSharpPropertyAccessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
		addEEnumLiteral(linkTypeEEnum, LinkType.PARENT);
		addEEnumLiteral(linkTypeEEnum, LinkType.SIBLING);
		addEEnumLiteral(linkTypeEEnum, LinkType.CHILD);

		initEEnum(httpVerbEEnum, HTTPVerb.class, "HTTPVerb");
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.GET);
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.PUT);
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.POST);
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.DELETE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (cSharpResourceModelEClass, 
		   source, 
		   new String[] {
		   });
	}

} //PSMPackageImpl
