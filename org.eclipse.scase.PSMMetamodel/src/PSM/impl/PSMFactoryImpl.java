/**
 */
package PSM.impl;

import PSM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSMFactoryImpl extends EFactoryImpl implements PSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PSMFactory init() {
		try {
			PSMFactory thePSMFactory = (PSMFactory)EPackage.Registry.INSTANCE.getEFactory(PSMPackage.eNS_URI);
			if (thePSMFactory != null) {
				return thePSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PSMPackage.RES_TFUL_SERVICE_PSM: return createRESTfulServicePSM();
			case PSMPackage.CSHARP_RESOURCE_MODEL: return createCSharpResourceModel();
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER: return createCSharpResourceModelManager();
			case PSMPackage.PSM_COMPONENT_PROPERTY: return createPSMComponentProperty();
			case PSMPackage.ENTITY_ANNOTATION: return createEntityAnnotation();
			case PSMPackage.DATA_CONTRACT_ANNOTATION: return createDataContractAnnotation();
			case PSMPackage.FUNCTION_PARAMETER: return createFunctionParameter();
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER: return createCSharpResourceController();
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER: return createCSharpResourceManagerController();
			case PSMPackage.HTTP_ACTION: return createHTTPAction();
			case PSMPackage.ATTRIBUTE_ROUTING_ANNOTATION: return createAttributeRoutingAnnotation();
			case PSMPackage.HTTP_ACTION_HANDLER: return createHTTPActionHandler();
			case PSMPackage.ENTITY_ACTIVITY: return createEntityActivity();
			case PSMPackage.ENTITY_DATABASE_CONTROLLER: return createEntityDatabaseController();
			case PSMPackage.CREATE_HYPERMEDIA_FUNCTION: return createCreateHypermediaFunction();
			case PSMPackage.PSM_HYPERMEDIA_LINK: return createPSMHypermediaLink();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL: return createCSharpAlgoResourceModel();
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER: return createCSharpAlgoResourceController();
			case PSMPackage.CSHARP_PROPERTY_SETTER: return createCSharpPropertySetter();
			case PSMPackage.CSHARP_PROPERTY_GETTER: return createCSharpPropertyGetter();
			case PSMPackage.CSHARP_PROPERTY_ACCESSOR: return createCSharpPropertyAccessor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PSMPackage.LINK_TYPE:
				return createLinkTypeFromString(eDataType, initialValue);
			case PSMPackage.HTTP_VERB:
				return createHTTPVerbFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PSMPackage.LINK_TYPE:
				return convertLinkTypeToString(eDataType, instanceValue);
			case PSMPackage.HTTP_VERB:
				return convertHTTPVerbToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSM createRESTfulServicePSM() {
		RESTfulServicePSMImpl resTfulServicePSM = new RESTfulServicePSMImpl();
		return resTfulServicePSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModel createCSharpResourceModel() {
		CSharpResourceModelImpl cSharpResourceModel = new CSharpResourceModelImpl();
		return cSharpResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModelManager createCSharpResourceModelManager() {
		CSharpResourceModelManagerImpl cSharpResourceModelManager = new CSharpResourceModelManagerImpl();
		return cSharpResourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty createPSMComponentProperty() {
		PSMComponentPropertyImpl psmComponentProperty = new PSMComponentPropertyImpl();
		return psmComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAnnotation createEntityAnnotation() {
		EntityAnnotationImpl entityAnnotation = new EntityAnnotationImpl();
		return entityAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContractAnnotation createDataContractAnnotation() {
		DataContractAnnotationImpl dataContractAnnotation = new DataContractAnnotationImpl();
		return dataContractAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter createFunctionParameter() {
		FunctionParameterImpl functionParameter = new FunctionParameterImpl();
		return functionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceController createCSharpResourceController() {
		CSharpResourceControllerImpl cSharpResourceController = new CSharpResourceControllerImpl();
		return cSharpResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceManagerController createCSharpResourceManagerController() {
		CSharpResourceManagerControllerImpl cSharpResourceManagerController = new CSharpResourceManagerControllerImpl();
		return cSharpResourceManagerController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPAction createHTTPAction() {
		HTTPActionImpl httpAction = new HTTPActionImpl();
		return httpAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRoutingAnnotation createAttributeRoutingAnnotation() {
		AttributeRoutingAnnotationImpl attributeRoutingAnnotation = new AttributeRoutingAnnotationImpl();
		return attributeRoutingAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActionHandler createHTTPActionHandler() {
		HTTPActionHandlerImpl httpActionHandler = new HTTPActionHandlerImpl();
		return httpActionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityActivity createEntityActivity() {
		EntityActivityImpl entityActivity = new EntityActivityImpl();
		return entityActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDatabaseController createEntityDatabaseController() {
		EntityDatabaseControllerImpl entityDatabaseController = new EntityDatabaseControllerImpl();
		return entityDatabaseController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateHypermediaFunction createCreateHypermediaFunction() {
		CreateHypermediaFunctionImpl createHypermediaFunction = new CreateHypermediaFunctionImpl();
		return createHypermediaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMHypermediaLink createPSMHypermediaLink() {
		PSMHypermediaLinkImpl psmHypermediaLink = new PSMHypermediaLinkImpl();
		return psmHypermediaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpAlgoResourceModel createCSharpAlgoResourceModel() {
		CSharpAlgoResourceModelImpl cSharpAlgoResourceModel = new CSharpAlgoResourceModelImpl();
		return cSharpAlgoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpAlgoResourceController createCSharpAlgoResourceController() {
		CSharpAlgoResourceControllerImpl cSharpAlgoResourceController = new CSharpAlgoResourceControllerImpl();
		return cSharpAlgoResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpPropertySetter createCSharpPropertySetter() {
		CSharpPropertySetterImpl cSharpPropertySetter = new CSharpPropertySetterImpl();
		return cSharpPropertySetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpPropertyGetter createCSharpPropertyGetter() {
		CSharpPropertyGetterImpl cSharpPropertyGetter = new CSharpPropertyGetterImpl();
		return cSharpPropertyGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpPropertyAccessor createCSharpPropertyAccessor() {
		CSharpPropertyAccessorImpl cSharpPropertyAccessor = new CSharpPropertyAccessorImpl();
		return cSharpPropertyAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue) {
		LinkType result = LinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb createHTTPVerbFromString(EDataType eDataType, String initialValue) {
		HTTPVerb result = HTTPVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMPackage getPSMPackage() {
		return (PSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PSMPackage getPackage() {
		return PSMPackage.eINSTANCE;
	}

} //PSMFactoryImpl
