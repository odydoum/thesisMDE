/**
 */
package PSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PSM.PSMFactory
 * @model kind="package"
 * @generated
 */
public interface PSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/scase/PSM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.scase.PSM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PSMPackage eINSTANCE = PSM.impl.PSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link PSM.impl.RESTfulServicePSMImpl <em>RES Tful Service PSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.RESTfulServicePSMImpl
	 * @see PSM.impl.PSMPackageImpl#getRESTfulServicePSM()
	 * @generated
	 */
	int RES_TFUL_SERVICE_PSM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has CSharp RModel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL = 1;

	/**
	 * The feature id for the '<em><b>Has CSharp RM Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Has CSharp RM Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Has CSharp RController</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Has Entity Database Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Has CSharp Algo RController</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Has CSharp Algo Resource Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Service Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH = 8;

	/**
	 * The feature id for the '<em><b>Service Database IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP = 9;

	/**
	 * The feature id for the '<em><b>Service Database Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT = 10;

	/**
	 * The feature id for the '<em><b>Service Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME = 11;

	/**
	 * The feature id for the '<em><b>Service Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD = 12;

	/**
	 * The number of structural features of the '<em>RES Tful Service PSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>RES Tful Service PSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpResourceModelImpl <em>CSharp Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpResourceModelImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpResourceModel()
	 * @generated
	 */
	int CSHARP_RESOURCE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Related CSharp RM Manager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>CSharp RModel Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>CSharp RModel Has Data Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>CSharp RModel Has Entity Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__PARENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>CSharp RModel Has Getter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER = 6;

	/**
	 * The feature id for the '<em><b>CSharp RModel Has Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER = 7;

	/**
	 * The feature id for the '<em><b>Has Related CSharp Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL = 8;

	/**
	 * The number of structural features of the '<em>CSharp Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>CSharp Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpResourceModelManagerImpl <em>CSharp Resource Model Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpResourceModelManagerImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpResourceModelManager()
	 * @generated
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Related CSharp RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL = 1;

	/**
	 * The feature id for the '<em><b>CSharp RM Manager Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>CSharp RM Manager Has Data Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME = 4;

	/**
	 * The feature id for the '<em><b>CSharp RM Manager Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER = 5;

	/**
	 * The feature id for the '<em><b>CSharp RM Manager Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER = 6;

	/**
	 * The number of structural features of the '<em>CSharp Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>CSharp Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MODEL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.PSMComponentPropertyImpl <em>Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.PSMComponentPropertyImpl
	 * @see PSM.impl.PSMPackageImpl#getPSMComponentProperty()
	 * @generated
	 */
	int PSM_COMPONENT_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__BIS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>BIs Primary Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Property Has Data Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Property Has Entity Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Corresponding Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD = 6;

	/**
	 * The feature id for the '<em><b>BIs Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY = 7;

	/**
	 * The feature id for the '<em><b>BIs Navigation Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY = 8;

	/**
	 * The number of structural features of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.EntityAnnotationImpl <em>Entity Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.EntityAnnotationImpl
	 * @see PSM.impl.PSMPackageImpl#getEntityAnnotation()
	 * @generated
	 */
	int ENTITY_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Entity Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Entity Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.DataContractAnnotationImpl <em>Data Contract Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.DataContractAnnotationImpl
	 * @see PSM.impl.PSMPackageImpl#getDataContractAnnotation()
	 * @generated
	 */
	int DATA_CONTRACT_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Data Contract Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Data Contract Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Contract Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.FunctionParameterImpl
	 * @see PSM.impl.PSMPackageImpl#getFunctionParameter()
	 * @generated
	 */
	int FUNCTION_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__BIS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>BIs Return Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__BIS_RETURN_PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpResourceControllerImpl <em>CSharp Resource Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpResourceControllerImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpResourceController()
	 * @generated
	 */
	int CSHARP_RESOURCE_CONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI = 1;

	/**
	 * The feature id for the '<em><b>Has Associated CSharp RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL = 2;

	/**
	 * The feature id for the '<em><b>CSharp RController Has AR Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>CSharp RController Has Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER__PARENT_NAME = 5;

	/**
	 * The number of structural features of the '<em>CSharp Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>CSharp Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpResourceManagerControllerImpl <em>CSharp Resource Manager Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpResourceManagerControllerImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpResourceManagerController()
	 * @generated
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI = 1;

	/**
	 * The feature id for the '<em><b>Has Associated CSharp RM Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>CSharp RM Controller Has AR Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>CSharp RM Controller Has Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME = 5;

	/**
	 * The number of structural features of the '<em>CSharp Resource Manager Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>CSharp Resource Manager Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_RESOURCE_MANAGER_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.HTTPActionImpl <em>HTTP Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.HTTPActionImpl
	 * @see PSM.impl.PSMPackageImpl#getHTTPAction()
	 * @generated
	 */
	int HTTP_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION__ACTION_HTTP_VERB = 1;

	/**
	 * The feature id for the '<em><b>HTTP Action URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION__HTTP_ACTION_URI = 2;

	/**
	 * The feature id for the '<em><b>HTTP Action Has AR Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>HTTP Action Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Has HTTP Action Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION__HAS_HTTP_ACTION_HANDLER = 5;

	/**
	 * The number of structural features of the '<em>HTTP Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>HTTP Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.AttributeRoutingAnnotationImpl <em>Attribute Routing Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.AttributeRoutingAnnotationImpl
	 * @see PSM.impl.PSMPackageImpl#getAttributeRoutingAnnotation()
	 * @generated
	 */
	int ATTRIBUTE_ROUTING_ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Attribute Routing Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Attribute Routing Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ROUTING_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Routing Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ROUTING_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.HTTPActionHandlerImpl <em>HTTP Action Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.HTTPActionHandlerImpl
	 * @see PSM.impl.PSMPackageImpl#getHTTPActionHandler()
	 * @generated
	 */
	int HTTP_ACTION_HANDLER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_HANDLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Handler HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB = 1;

	/**
	 * The feature id for the '<em><b>Uses Entity Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Has Hypermedia Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION = 3;

	/**
	 * The number of structural features of the '<em>HTTP Action Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_HANDLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>HTTP Action Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTION_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.EntityActivityImpl <em>Entity Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.EntityActivityImpl
	 * @see PSM.impl.PSMPackageImpl#getEntityActivity()
	 * @generated
	 */
	int ENTITY_ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity Activity HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB = 1;

	/**
	 * The number of structural features of the '<em>Entity Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.EntityDatabaseControllerImpl <em>Entity Database Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.EntityDatabaseControllerImpl
	 * @see PSM.impl.PSMPackageImpl#getEntityDatabaseController()
	 * @generated
	 */
	int ENTITY_DATABASE_CONTROLLER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATABASE_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Entity Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Entity Database Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATABASE_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity Database Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATABASE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CreateHypermediaFunctionImpl <em>Create Hypermedia Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CreateHypermediaFunctionImpl
	 * @see PSM.impl.PSMPackageImpl#getCreateHypermediaFunction()
	 * @generated
	 */
	int CREATE_HYPERMEDIA_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Has PSM Hypermedia Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK = 0;

	/**
	 * The number of structural features of the '<em>Create Hypermedia Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HYPERMEDIA_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Create Hypermedia Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HYPERMEDIA_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.PSMHypermediaLinkImpl <em>Hypermedia Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.PSMHypermediaLinkImpl
	 * @see PSM.impl.PSMPackageImpl#getPSMHypermediaLink()
	 * @generated
	 */
	int PSM_HYPERMEDIA_LINK = 15;

	/**
	 * The feature id for the '<em><b>Link HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB = 0;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__LINK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Has Target CSharp RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Has Target CSharp RM Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Has Target CSharp Algo RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER = 4;

	/**
	 * The number of structural features of the '<em>Hypermedia Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Hypermedia Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpAlgoResourceModelImpl <em>CSharp Algo Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpAlgoResourceModelImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpAlgoResourceModel()
	 * @generated
	 */
	int CSHARP_ALGO_RESOURCE_MODEL = 16;

	/**
	 * The feature id for the '<em><b>CSharp Algo Model Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME = 2;

	/**
	 * The feature id for the '<em><b>CSharp Algo Model Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER = 3;

	/**
	 * The feature id for the '<em><b>CSharp Algo Model Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER = 4;

	/**
	 * The feature id for the '<em><b>CSharp Algo RModel Has Data Contract Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Has Related CSharp Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Is Related CSharp Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL = 7;

	/**
	 * The number of structural features of the '<em>CSharp Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>CSharp Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpAlgoResourceControllerImpl <em>CSharp Algo Resource Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpAlgoResourceControllerImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpAlgoResourceController()
	 * @generated
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER = 17;

	/**
	 * The feature id for the '<em><b>Has Associated CSharp Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL = 0;

	/**
	 * The feature id for the '<em><b>CSharp Algo RChas HTTP Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME = 3;

	/**
	 * The feature id for the '<em><b>CSharp Algo RController Has AR Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI = 5;

	/**
	 * The number of structural features of the '<em>CSharp Algo Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>CSharp Algo Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_ALGO_RESOURCE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpPropertyAccessorImpl <em>CSharp Property Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpPropertyAccessorImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpPropertyAccessor()
	 * @generated
	 */
	int CSHARP_PROPERTY_ACCESSOR = 20;

	/**
	 * The number of structural features of the '<em>CSharp Property Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_ACCESSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>CSharp Property Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_ACCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpPropertySetterImpl <em>CSharp Property Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpPropertySetterImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpPropertySetter()
	 * @generated
	 */
	int CSHARP_PROPERTY_SETTER = 18;

	/**
	 * The feature id for the '<em><b>Sets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_SETTER__SETS_PROPERTY = CSHARP_PROPERTY_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CSharp Property Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_SETTER_FEATURE_COUNT = CSHARP_PROPERTY_ACCESSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CSharp Property Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_SETTER_OPERATION_COUNT = CSHARP_PROPERTY_ACCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PSM.impl.CSharpPropertyGetterImpl <em>CSharp Property Getter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.impl.CSharpPropertyGetterImpl
	 * @see PSM.impl.PSMPackageImpl#getCSharpPropertyGetter()
	 * @generated
	 */
	int CSHARP_PROPERTY_GETTER = 19;

	/**
	 * The feature id for the '<em><b>Gets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_GETTER__GETS_PROPERTY = CSHARP_PROPERTY_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CSharp Property Getter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_GETTER_FEATURE_COUNT = CSHARP_PROPERTY_ACCESSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CSharp Property Getter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_PROPERTY_GETTER_OPERATION_COUNT = CSHARP_PROPERTY_ACCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PSM.LinkType <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.LinkType
	 * @see PSM.impl.PSMPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 21;

	/**
	 * The meta object id for the '{@link PSM.HTTPVerb <em>HTTP Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PSM.HTTPVerb
	 * @see PSM.impl.PSMPackageImpl#getHTTPVerb()
	 * @generated
	 */
	int HTTP_VERB = 22;


	/**
	 * Returns the meta object for class '{@link PSM.RESTfulServicePSM <em>RES Tful Service PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RES Tful Service PSM</em>'.
	 * @see PSM.RESTfulServicePSM
	 * @generated
	 */
	EClass getRESTfulServicePSM();

	/**
	 * Returns the meta object for the attribute '{@link PSM.RESTfulServicePSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.RESTfulServicePSM#getName()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EAttribute getRESTfulServicePSM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.RESTfulServicePSM#getHasCSharpRModel <em>Has CSharp RModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CSharp RModel</em>'.
	 * @see PSM.RESTfulServicePSM#getHasCSharpRModel()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EReference getRESTfulServicePSM_HasCSharpRModel();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.RESTfulServicePSM#getHasCSharpRMManager <em>Has CSharp RM Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CSharp RM Manager</em>'.
	 * @see PSM.RESTfulServicePSM#getHasCSharpRMManager()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EReference getRESTfulServicePSM_HasCSharpRMManager();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.RESTfulServicePSM#getHasCSharpRMController <em>Has CSharp RM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CSharp RM Controller</em>'.
	 * @see PSM.RESTfulServicePSM#getHasCSharpRMController()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EReference getRESTfulServicePSM_HasCSharpRMController();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.RESTfulServicePSM#getHasCSharpRController <em>Has CSharp RController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CSharp RController</em>'.
	 * @see PSM.RESTfulServicePSM#getHasCSharpRController()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EReference getRESTfulServicePSM_HasCSharpRController();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.RESTfulServicePSM#getHasEntityDatabaseController <em>Has Entity Database Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Entity Database Controller</em>'.
	 * @see PSM.RESTfulServicePSM#getHasEntityDatabaseController()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EReference getRESTfulServicePSM_HasEntityDatabaseController();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.RESTfulServicePSM#getHasCSharpAlgoRController <em>Has CSharp Algo RController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CSharp Algo RController</em>'.
	 * @see PSM.RESTfulServicePSM#getHasCSharpAlgoRController()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EReference getRESTfulServicePSM_HasCSharpAlgoRController();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.RESTfulServicePSM#getHasCSharpAlgoResourceModel <em>Has CSharp Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CSharp Algo Resource Model</em>'.
	 * @see PSM.RESTfulServicePSM#getHasCSharpAlgoResourceModel()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EReference getRESTfulServicePSM_HasCSharpAlgoResourceModel();

	/**
	 * Returns the meta object for the attribute '{@link PSM.RESTfulServicePSM#getServiceOutputPath <em>Service Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Output Path</em>'.
	 * @see PSM.RESTfulServicePSM#getServiceOutputPath()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EAttribute getRESTfulServicePSM_ServiceOutputPath();

	/**
	 * Returns the meta object for the attribute '{@link PSM.RESTfulServicePSM#getServiceDatabaseIP <em>Service Database IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database IP</em>'.
	 * @see PSM.RESTfulServicePSM#getServiceDatabaseIP()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EAttribute getRESTfulServicePSM_ServiceDatabaseIP();

	/**
	 * Returns the meta object for the attribute '{@link PSM.RESTfulServicePSM#getServiceDatabasePort <em>Service Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Port</em>'.
	 * @see PSM.RESTfulServicePSM#getServiceDatabasePort()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EAttribute getRESTfulServicePSM_ServiceDatabasePort();

	/**
	 * Returns the meta object for the attribute '{@link PSM.RESTfulServicePSM#getServiceDatabaseUsername <em>Service Database Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Username</em>'.
	 * @see PSM.RESTfulServicePSM#getServiceDatabaseUsername()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EAttribute getRESTfulServicePSM_ServiceDatabaseUsername();

	/**
	 * Returns the meta object for the attribute '{@link PSM.RESTfulServicePSM#getServiceDatabasePassword <em>Service Database Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Password</em>'.
	 * @see PSM.RESTfulServicePSM#getServiceDatabasePassword()
	 * @see #getRESTfulServicePSM()
	 * @generated
	 */
	EAttribute getRESTfulServicePSM_ServiceDatabasePassword();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpResourceModel <em>CSharp Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Resource Model</em>'.
	 * @see PSM.CSharpResourceModel
	 * @generated
	 */
	EClass getCSharpResourceModel();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.CSharpResourceModel#getName()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EAttribute getCSharpResourceModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link PSM.CSharpResourceModel#getHasRelatedCSharpRMManager <em>Has Related CSharp RM Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related CSharp RM Manager</em>'.
	 * @see PSM.CSharpResourceModel#getHasRelatedCSharpRMManager()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EReference getCSharpResourceModel_HasRelatedCSharpRMManager();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.CSharpResourceModel#getCSharpRModelHasProperty <em>CSharp RModel Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CSharp RModel Has Property</em>'.
	 * @see PSM.CSharpResourceModel#getCSharpRModelHasProperty()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EReference getCSharpResourceModel_CSharpRModelHasProperty();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceModel#getCSharpRModelHasDataAnnotation <em>CSharp RModel Has Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RModel Has Data Annotation</em>'.
	 * @see PSM.CSharpResourceModel#getCSharpRModelHasDataAnnotation()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EReference getCSharpResourceModel_CSharpRModelHasDataAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceModel#getCSharpRModelHasEntityAnnotation <em>CSharp RModel Has Entity Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RModel Has Entity Annotation</em>'.
	 * @see PSM.CSharpResourceModel#getCSharpRModelHasEntityAnnotation()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EReference getCSharpResourceModel_CSharpRModelHasEntityAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceModel#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see PSM.CSharpResourceModel#getParentName()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EAttribute getCSharpResourceModel_ParentName();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.CSharpResourceModel#getCSharpRModelHasGetter <em>CSharp RModel Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CSharp RModel Has Getter</em>'.
	 * @see PSM.CSharpResourceModel#getCSharpRModelHasGetter()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EReference getCSharpResourceModel_CSharpRModelHasGetter();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.CSharpResourceModel#getCSharpRModelHasSetter <em>CSharp RModel Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CSharp RModel Has Setter</em>'.
	 * @see PSM.CSharpResourceModel#getCSharpRModelHasSetter()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EReference getCSharpResourceModel_CSharpRModelHasSetter();

	/**
	 * Returns the meta object for the reference list '{@link PSM.CSharpResourceModel#getHasRelatedCSharpAlgoModel <em>Has Related CSharp Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related CSharp Algo Model</em>'.
	 * @see PSM.CSharpResourceModel#getHasRelatedCSharpAlgoModel()
	 * @see #getCSharpResourceModel()
	 * @generated
	 */
	EReference getCSharpResourceModel_HasRelatedCSharpAlgoModel();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpResourceModelManager <em>CSharp Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Resource Model Manager</em>'.
	 * @see PSM.CSharpResourceModelManager
	 * @generated
	 */
	EClass getCSharpResourceModelManager();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceModelManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.CSharpResourceModelManager#getName()
	 * @see #getCSharpResourceModelManager()
	 * @generated
	 */
	EAttribute getCSharpResourceModelManager_Name();

	/**
	 * Returns the meta object for the reference '{@link PSM.CSharpResourceModelManager#getHasRelatedCSharpRModel <em>Has Related CSharp RModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Related CSharp RModel</em>'.
	 * @see PSM.CSharpResourceModelManager#getHasRelatedCSharpRModel()
	 * @see #getCSharpResourceModelManager()
	 * @generated
	 */
	EReference getCSharpResourceModelManager_HasRelatedCSharpRModel();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasProperty <em>CSharp RM Manager Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RM Manager Has Property</em>'.
	 * @see PSM.CSharpResourceModelManager#getCSharpRMManagerHasProperty()
	 * @see #getCSharpResourceModelManager()
	 * @generated
	 */
	EReference getCSharpResourceModelManager_CSharpRMManagerHasProperty();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasDataAnnotation <em>CSharp RM Manager Has Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RM Manager Has Data Annotation</em>'.
	 * @see PSM.CSharpResourceModelManager#getCSharpRMManagerHasDataAnnotation()
	 * @see #getCSharpResourceModelManager()
	 * @generated
	 */
	EReference getCSharpResourceModelManager_CSharpRMManagerHasDataAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceModelManager#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see PSM.CSharpResourceModelManager#getParentName()
	 * @see #getCSharpResourceModelManager()
	 * @generated
	 */
	EAttribute getCSharpResourceModelManager_ParentName();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasGetter <em>CSharp RM Manager Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RM Manager Has Getter</em>'.
	 * @see PSM.CSharpResourceModelManager#getCSharpRMManagerHasGetter()
	 * @see #getCSharpResourceModelManager()
	 * @generated
	 */
	EReference getCSharpResourceModelManager_CSharpRMManagerHasGetter();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceModelManager#getCSharpRMManagerHasSetter <em>CSharp RM Manager Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RM Manager Has Setter</em>'.
	 * @see PSM.CSharpResourceModelManager#getCSharpRMManagerHasSetter()
	 * @see #getCSharpResourceModelManager()
	 * @generated
	 */
	EReference getCSharpResourceModelManager_CSharpRMManagerHasSetter();

	/**
	 * Returns the meta object for class '{@link PSM.PSMComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Property</em>'.
	 * @see PSM.PSMComponentProperty
	 * @generated
	 */
	EClass getPSMComponentProperty();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMComponentProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.PSMComponentProperty#getName()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMComponentProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PSM.PSMComponentProperty#getType()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMComponentProperty#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see PSM.PSMComponentProperty#isBIsUnique()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_BIsUnique();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMComponentProperty#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Primary Identifier</em>'.
	 * @see PSM.PSMComponentProperty#isBIsPrimaryIdentifier()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_BIsPrimaryIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.PSMComponentProperty#getPropertyHasDataAnnotation <em>Property Has Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Has Data Annotation</em>'.
	 * @see PSM.PSMComponentProperty#getPropertyHasDataAnnotation()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EReference getPSMComponentProperty_PropertyHasDataAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.PSMComponentProperty#getPropertyHasEntityAnnotation <em>Property Has Entity Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Has Entity Annotation</em>'.
	 * @see PSM.PSMComponentProperty#getPropertyHasEntityAnnotation()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EReference getPSMComponentProperty_PropertyHasEntityAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMComponentProperty#getCorrespondingField <em>Corresponding Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Field</em>'.
	 * @see PSM.PSMComponentProperty#getCorrespondingField()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_CorrespondingField();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMComponentProperty#isBIsForeignKey <em>BIs Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Foreign Key</em>'.
	 * @see PSM.PSMComponentProperty#isBIsForeignKey()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_BIsForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMComponentProperty#isBIsNavigationProperty <em>BIs Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Navigation Property</em>'.
	 * @see PSM.PSMComponentProperty#isBIsNavigationProperty()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_BIsNavigationProperty();

	/**
	 * Returns the meta object for class '{@link PSM.EntityAnnotation <em>Entity Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Annotation</em>'.
	 * @see PSM.EntityAnnotation
	 * @generated
	 */
	EClass getEntityAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link PSM.EntityAnnotation#getEntityAnnotationText <em>Entity Annotation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Annotation Text</em>'.
	 * @see PSM.EntityAnnotation#getEntityAnnotationText()
	 * @see #getEntityAnnotation()
	 * @generated
	 */
	EAttribute getEntityAnnotation_EntityAnnotationText();

	/**
	 * Returns the meta object for class '{@link PSM.DataContractAnnotation <em>Data Contract Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Contract Annotation</em>'.
	 * @see PSM.DataContractAnnotation
	 * @generated
	 */
	EClass getDataContractAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link PSM.DataContractAnnotation#getDataContractAnnotationText <em>Data Contract Annotation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Contract Annotation Text</em>'.
	 * @see PSM.DataContractAnnotation#getDataContractAnnotationText()
	 * @see #getDataContractAnnotation()
	 * @generated
	 */
	EAttribute getDataContractAnnotation_DataContractAnnotationText();

	/**
	 * Returns the meta object for class '{@link PSM.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see PSM.FunctionParameter
	 * @generated
	 */
	EClass getFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link PSM.FunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.FunctionParameter#getName()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.FunctionParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PSM.FunctionParameter#getType()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link PSM.FunctionParameter#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see PSM.FunctionParameter#isBIsUnique()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_BIsUnique();

	/**
	 * Returns the meta object for the attribute '{@link PSM.FunctionParameter#isBIsReturnParameter <em>BIs Return Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Return Parameter</em>'.
	 * @see PSM.FunctionParameter#isBIsReturnParameter()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_BIsReturnParameter();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpResourceController <em>CSharp Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Resource Controller</em>'.
	 * @see PSM.CSharpResourceController
	 * @generated
	 */
	EClass getCSharpResourceController();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.CSharpResourceController#getName()
	 * @see #getCSharpResourceController()
	 * @generated
	 */
	EAttribute getCSharpResourceController_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceController#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see PSM.CSharpResourceController#getControllerURI()
	 * @see #getCSharpResourceController()
	 * @generated
	 */
	EAttribute getCSharpResourceController_ControllerURI();

	/**
	 * Returns the meta object for the reference '{@link PSM.CSharpResourceController#getHasAssociatedCSharpRModel <em>Has Associated CSharp RModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated CSharp RModel</em>'.
	 * @see PSM.CSharpResourceController#getHasAssociatedCSharpRModel()
	 * @see #getCSharpResourceController()
	 * @generated
	 */
	EReference getCSharpResourceController_HasAssociatedCSharpRModel();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceController#getCSharpRControllerHasARAnnotation <em>CSharp RController Has AR Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RController Has AR Annotation</em>'.
	 * @see PSM.CSharpResourceController#getCSharpRControllerHasARAnnotation()
	 * @see #getCSharpResourceController()
	 * @generated
	 */
	EReference getCSharpResourceController_CSharpRControllerHasARAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.CSharpResourceController#getCSharpRControllerHasAction <em>CSharp RController Has Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CSharp RController Has Action</em>'.
	 * @see PSM.CSharpResourceController#getCSharpRControllerHasAction()
	 * @see #getCSharpResourceController()
	 * @generated
	 */
	EReference getCSharpResourceController_CSharpRControllerHasAction();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceController#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see PSM.CSharpResourceController#getParentName()
	 * @see #getCSharpResourceController()
	 * @generated
	 */
	EAttribute getCSharpResourceController_ParentName();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpResourceManagerController <em>CSharp Resource Manager Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Resource Manager Controller</em>'.
	 * @see PSM.CSharpResourceManagerController
	 * @generated
	 */
	EClass getCSharpResourceManagerController();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceManagerController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.CSharpResourceManagerController#getName()
	 * @see #getCSharpResourceManagerController()
	 * @generated
	 */
	EAttribute getCSharpResourceManagerController_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceManagerController#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see PSM.CSharpResourceManagerController#getControllerURI()
	 * @see #getCSharpResourceManagerController()
	 * @generated
	 */
	EAttribute getCSharpResourceManagerController_ControllerURI();

	/**
	 * Returns the meta object for the reference '{@link PSM.CSharpResourceManagerController#getHasAssociatedCSharpRMManager <em>Has Associated CSharp RM Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated CSharp RM Manager</em>'.
	 * @see PSM.CSharpResourceManagerController#getHasAssociatedCSharpRMManager()
	 * @see #getCSharpResourceManagerController()
	 * @generated
	 */
	EReference getCSharpResourceManagerController_HasAssociatedCSharpRMManager();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpResourceManagerController#getCSharpRMControllerHasARAnnotation <em>CSharp RM Controller Has AR Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp RM Controller Has AR Annotation</em>'.
	 * @see PSM.CSharpResourceManagerController#getCSharpRMControllerHasARAnnotation()
	 * @see #getCSharpResourceManagerController()
	 * @generated
	 */
	EReference getCSharpResourceManagerController_CSharpRMControllerHasARAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.CSharpResourceManagerController#getCSharpRMControllerHasAction <em>CSharp RM Controller Has Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CSharp RM Controller Has Action</em>'.
	 * @see PSM.CSharpResourceManagerController#getCSharpRMControllerHasAction()
	 * @see #getCSharpResourceManagerController()
	 * @generated
	 */
	EReference getCSharpResourceManagerController_CSharpRMControllerHasAction();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpResourceManagerController#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see PSM.CSharpResourceManagerController#getParentName()
	 * @see #getCSharpResourceManagerController()
	 * @generated
	 */
	EAttribute getCSharpResourceManagerController_ParentName();

	/**
	 * Returns the meta object for class '{@link PSM.HTTPAction <em>HTTP Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Action</em>'.
	 * @see PSM.HTTPAction
	 * @generated
	 */
	EClass getHTTPAction();

	/**
	 * Returns the meta object for the attribute '{@link PSM.HTTPAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.HTTPAction#getName()
	 * @see #getHTTPAction()
	 * @generated
	 */
	EAttribute getHTTPAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.HTTPAction#getActionHTTPVerb <em>Action HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action HTTP Verb</em>'.
	 * @see PSM.HTTPAction#getActionHTTPVerb()
	 * @see #getHTTPAction()
	 * @generated
	 */
	EAttribute getHTTPAction_ActionHTTPVerb();

	/**
	 * Returns the meta object for the attribute '{@link PSM.HTTPAction#getHTTPActionURI <em>HTTP Action URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HTTP Action URI</em>'.
	 * @see PSM.HTTPAction#getHTTPActionURI()
	 * @see #getHTTPAction()
	 * @generated
	 */
	EAttribute getHTTPAction_HTTPActionURI();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.HTTPAction#getHTTPActionHasARAnnotation <em>HTTP Action Has AR Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HTTP Action Has AR Annotation</em>'.
	 * @see PSM.HTTPAction#getHTTPActionHasARAnnotation()
	 * @see #getHTTPAction()
	 * @generated
	 */
	EReference getHTTPAction_HTTPActionHasARAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.HTTPAction#getHTTPActionHasParameter <em>HTTP Action Has Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HTTP Action Has Parameter</em>'.
	 * @see PSM.HTTPAction#getHTTPActionHasParameter()
	 * @see #getHTTPAction()
	 * @generated
	 */
	EReference getHTTPAction_HTTPActionHasParameter();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.HTTPAction#getHasHTTPActionHandler <em>Has HTTP Action Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has HTTP Action Handler</em>'.
	 * @see PSM.HTTPAction#getHasHTTPActionHandler()
	 * @see #getHTTPAction()
	 * @generated
	 */
	EReference getHTTPAction_HasHTTPActionHandler();

	/**
	 * Returns the meta object for class '{@link PSM.AttributeRoutingAnnotation <em>Attribute Routing Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Routing Annotation</em>'.
	 * @see PSM.AttributeRoutingAnnotation
	 * @generated
	 */
	EClass getAttributeRoutingAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link PSM.AttributeRoutingAnnotation#getAttributeRoutingAnnotationText <em>Attribute Routing Annotation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Routing Annotation Text</em>'.
	 * @see PSM.AttributeRoutingAnnotation#getAttributeRoutingAnnotationText()
	 * @see #getAttributeRoutingAnnotation()
	 * @generated
	 */
	EAttribute getAttributeRoutingAnnotation_AttributeRoutingAnnotationText();

	/**
	 * Returns the meta object for class '{@link PSM.HTTPActionHandler <em>HTTP Action Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Action Handler</em>'.
	 * @see PSM.HTTPActionHandler
	 * @generated
	 */
	EClass getHTTPActionHandler();

	/**
	 * Returns the meta object for the attribute '{@link PSM.HTTPActionHandler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.HTTPActionHandler#getName()
	 * @see #getHTTPActionHandler()
	 * @generated
	 */
	EAttribute getHTTPActionHandler_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.HTTPActionHandler#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler HTTP Verb</em>'.
	 * @see PSM.HTTPActionHandler#getHandlerHTTPVerb()
	 * @see #getHTTPActionHandler()
	 * @generated
	 */
	EAttribute getHTTPActionHandler_HandlerHTTPVerb();

	/**
	 * Returns the meta object for the reference '{@link PSM.HTTPActionHandler#getUsesEntityActivity <em>Uses Entity Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses Entity Activity</em>'.
	 * @see PSM.HTTPActionHandler#getUsesEntityActivity()
	 * @see #getHTTPActionHandler()
	 * @generated
	 */
	EReference getHTTPActionHandler_UsesEntityActivity();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.HTTPActionHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Hypermedia Function</em>'.
	 * @see PSM.HTTPActionHandler#getHasHypermediaFunction()
	 * @see #getHTTPActionHandler()
	 * @generated
	 */
	EReference getHTTPActionHandler_HasHypermediaFunction();

	/**
	 * Returns the meta object for class '{@link PSM.EntityActivity <em>Entity Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Activity</em>'.
	 * @see PSM.EntityActivity
	 * @generated
	 */
	EClass getEntityActivity();

	/**
	 * Returns the meta object for the attribute '{@link PSM.EntityActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.EntityActivity#getName()
	 * @see #getEntityActivity()
	 * @generated
	 */
	EAttribute getEntityActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.EntityActivity#getEntityActivityHTTPVerb <em>Entity Activity HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Activity HTTP Verb</em>'.
	 * @see PSM.EntityActivity#getEntityActivityHTTPVerb()
	 * @see #getEntityActivity()
	 * @generated
	 */
	EAttribute getEntityActivity_EntityActivityHTTPVerb();

	/**
	 * Returns the meta object for class '{@link PSM.EntityDatabaseController <em>Entity Database Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Database Controller</em>'.
	 * @see PSM.EntityDatabaseController
	 * @generated
	 */
	EClass getEntityDatabaseController();

	/**
	 * Returns the meta object for the attribute '{@link PSM.EntityDatabaseController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.EntityDatabaseController#getName()
	 * @see #getEntityDatabaseController()
	 * @generated
	 */
	EAttribute getEntityDatabaseController_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.EntityDatabaseController#getHasEntityActivity <em>Has Entity Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Entity Activity</em>'.
	 * @see PSM.EntityDatabaseController#getHasEntityActivity()
	 * @see #getEntityDatabaseController()
	 * @generated
	 */
	EReference getEntityDatabaseController_HasEntityActivity();

	/**
	 * Returns the meta object for class '{@link PSM.CreateHypermediaFunction <em>Create Hypermedia Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Hypermedia Function</em>'.
	 * @see PSM.CreateHypermediaFunction
	 * @generated
	 */
	EClass getCreateHypermediaFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link PSM.CreateHypermediaFunction#getHasPSMHypermediaLink <em>Has PSM Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has PSM Hypermedia Link</em>'.
	 * @see PSM.CreateHypermediaFunction#getHasPSMHypermediaLink()
	 * @see #getCreateHypermediaFunction()
	 * @generated
	 */
	EReference getCreateHypermediaFunction_HasPSMHypermediaLink();

	/**
	 * Returns the meta object for class '{@link PSM.PSMHypermediaLink <em>Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypermedia Link</em>'.
	 * @see PSM.PSMHypermediaLink
	 * @generated
	 */
	EClass getPSMHypermediaLink();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMHypermediaLink#getLinkHTTPVerb <em>Link HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link HTTP Verb</em>'.
	 * @see PSM.PSMHypermediaLink#getLinkHTTPVerb()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EAttribute getPSMHypermediaLink_LinkHTTPVerb();

	/**
	 * Returns the meta object for the attribute '{@link PSM.PSMHypermediaLink#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type</em>'.
	 * @see PSM.PSMHypermediaLink#getLinkType()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EAttribute getPSMHypermediaLink_LinkType();

	/**
	 * Returns the meta object for the reference '{@link PSM.PSMHypermediaLink#getHasTargetCSharpRController <em>Has Target CSharp RController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target CSharp RController</em>'.
	 * @see PSM.PSMHypermediaLink#getHasTargetCSharpRController()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EReference getPSMHypermediaLink_HasTargetCSharpRController();

	/**
	 * Returns the meta object for the reference '{@link PSM.PSMHypermediaLink#getHasTargetCSharpRMController <em>Has Target CSharp RM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target CSharp RM Controller</em>'.
	 * @see PSM.PSMHypermediaLink#getHasTargetCSharpRMController()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EReference getPSMHypermediaLink_HasTargetCSharpRMController();

	/**
	 * Returns the meta object for the reference '{@link PSM.PSMHypermediaLink#getHasTargetCSharpAlgoRController <em>Has Target CSharp Algo RController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target CSharp Algo RController</em>'.
	 * @see PSM.PSMHypermediaLink#getHasTargetCSharpAlgoRController()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EReference getPSMHypermediaLink_HasTargetCSharpAlgoRController();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpAlgoResourceModel <em>CSharp Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Algo Resource Model</em>'.
	 * @see PSM.CSharpAlgoResourceModel
	 * @generated
	 */
	EClass getCSharpAlgoResourceModel();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasProperty <em>CSharp Algo Model Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp Algo Model Has Property</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasProperty()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EReference getCSharpAlgoResourceModel_CSharpAlgoModelHasProperty();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpAlgoResourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getName()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EAttribute getCSharpAlgoResourceModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpAlgoResourceModel#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getParentName()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EAttribute getCSharpAlgoResourceModel_ParentName();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasGetter <em>CSharp Algo Model Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp Algo Model Has Getter</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasGetter()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EReference getCSharpAlgoResourceModel_CSharpAlgoModelHasGetter();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasSetter <em>CSharp Algo Model Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp Algo Model Has Setter</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getCSharpAlgoModelHasSetter()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EReference getCSharpAlgoResourceModel_CSharpAlgoModelHasSetter();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpAlgoResourceModel#getCSharpAlgoRModelHasDataContractAnnotation <em>CSharp Algo RModel Has Data Contract Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp Algo RModel Has Data Contract Annotation</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getCSharpAlgoRModelHasDataContractAnnotation()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EReference getCSharpAlgoResourceModel_CSharpAlgoRModelHasDataContractAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link PSM.CSharpAlgoResourceModel#getHasRelatedCSharpAlgoModel <em>Has Related CSharp Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related CSharp Algo Model</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getHasRelatedCSharpAlgoModel()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EReference getCSharpAlgoResourceModel_HasRelatedCSharpAlgoModel();

	/**
	 * Returns the meta object for the reference list '{@link PSM.CSharpAlgoResourceModel#getIsRelatedCSharpAlgoModel <em>Is Related CSharp Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Related CSharp Algo Model</em>'.
	 * @see PSM.CSharpAlgoResourceModel#getIsRelatedCSharpAlgoModel()
	 * @see #getCSharpAlgoResourceModel()
	 * @generated
	 */
	EReference getCSharpAlgoResourceModel_IsRelatedCSharpAlgoModel();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpAlgoResourceController <em>CSharp Algo Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Algo Resource Controller</em>'.
	 * @see PSM.CSharpAlgoResourceController
	 * @generated
	 */
	EClass getCSharpAlgoResourceController();

	/**
	 * Returns the meta object for the reference '{@link PSM.CSharpAlgoResourceController#getHasAssociatedCSharpAlgoModel <em>Has Associated CSharp Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated CSharp Algo Model</em>'.
	 * @see PSM.CSharpAlgoResourceController#getHasAssociatedCSharpAlgoModel()
	 * @see #getCSharpAlgoResourceController()
	 * @generated
	 */
	EReference getCSharpAlgoResourceController_HasAssociatedCSharpAlgoModel();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpAlgoResourceController#getCSharpAlgoRChasHTTPAction <em>CSharp Algo RChas HTTP Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp Algo RChas HTTP Action</em>'.
	 * @see PSM.CSharpAlgoResourceController#getCSharpAlgoRChasHTTPAction()
	 * @see #getCSharpAlgoResourceController()
	 * @generated
	 */
	EReference getCSharpAlgoResourceController_CSharpAlgoRChasHTTPAction();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpAlgoResourceController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PSM.CSharpAlgoResourceController#getName()
	 * @see #getCSharpAlgoResourceController()
	 * @generated
	 */
	EAttribute getCSharpAlgoResourceController_Name();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpAlgoResourceController#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see PSM.CSharpAlgoResourceController#getParentName()
	 * @see #getCSharpAlgoResourceController()
	 * @generated
	 */
	EAttribute getCSharpAlgoResourceController_ParentName();

	/**
	 * Returns the meta object for the containment reference '{@link PSM.CSharpAlgoResourceController#getCSharpAlgoRControllerHasARAnnotation <em>CSharp Algo RController Has AR Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSharp Algo RController Has AR Annotation</em>'.
	 * @see PSM.CSharpAlgoResourceController#getCSharpAlgoRControllerHasARAnnotation()
	 * @see #getCSharpAlgoResourceController()
	 * @generated
	 */
	EReference getCSharpAlgoResourceController_CSharpAlgoRControllerHasARAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link PSM.CSharpAlgoResourceController#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see PSM.CSharpAlgoResourceController#getControllerURI()
	 * @see #getCSharpAlgoResourceController()
	 * @generated
	 */
	EAttribute getCSharpAlgoResourceController_ControllerURI();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpPropertySetter <em>CSharp Property Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Property Setter</em>'.
	 * @see PSM.CSharpPropertySetter
	 * @generated
	 */
	EClass getCSharpPropertySetter();

	/**
	 * Returns the meta object for the reference '{@link PSM.CSharpPropertySetter#getSetsProperty <em>Sets Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sets Property</em>'.
	 * @see PSM.CSharpPropertySetter#getSetsProperty()
	 * @see #getCSharpPropertySetter()
	 * @generated
	 */
	EReference getCSharpPropertySetter_SetsProperty();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpPropertyGetter <em>CSharp Property Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Property Getter</em>'.
	 * @see PSM.CSharpPropertyGetter
	 * @generated
	 */
	EClass getCSharpPropertyGetter();

	/**
	 * Returns the meta object for the reference '{@link PSM.CSharpPropertyGetter#getGetsProperty <em>Gets Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gets Property</em>'.
	 * @see PSM.CSharpPropertyGetter#getGetsProperty()
	 * @see #getCSharpPropertyGetter()
	 * @generated
	 */
	EReference getCSharpPropertyGetter_GetsProperty();

	/**
	 * Returns the meta object for class '{@link PSM.CSharpPropertyAccessor <em>CSharp Property Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Property Accessor</em>'.
	 * @see PSM.CSharpPropertyAccessor
	 * @generated
	 */
	EClass getCSharpPropertyAccessor();

	/**
	 * Returns the meta object for enum '{@link PSM.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see PSM.LinkType
	 * @generated
	 */
	EEnum getLinkType();

	/**
	 * Returns the meta object for enum '{@link PSM.HTTPVerb <em>HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Verb</em>'.
	 * @see PSM.HTTPVerb
	 * @generated
	 */
	EEnum getHTTPVerb();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PSMFactory getPSMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PSM.impl.RESTfulServicePSMImpl <em>RES Tful Service PSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.RESTfulServicePSMImpl
		 * @see PSM.impl.PSMPackageImpl#getRESTfulServicePSM()
		 * @generated
		 */
		EClass RES_TFUL_SERVICE_PSM = eINSTANCE.getRESTfulServicePSM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PSM__NAME = eINSTANCE.getRESTfulServicePSM_Name();

		/**
		 * The meta object literal for the '<em><b>Has CSharp RModel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PSM__HAS_CSHARP_RMODEL = eINSTANCE.getRESTfulServicePSM_HasCSharpRModel();

		/**
		 * The meta object literal for the '<em><b>Has CSharp RM Manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_MANAGER = eINSTANCE.getRESTfulServicePSM_HasCSharpRMManager();

		/**
		 * The meta object literal for the '<em><b>Has CSharp RM Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PSM__HAS_CSHARP_RM_CONTROLLER = eINSTANCE.getRESTfulServicePSM_HasCSharpRMController();

		/**
		 * The meta object literal for the '<em><b>Has CSharp RController</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PSM__HAS_CSHARP_RCONTROLLER = eINSTANCE.getRESTfulServicePSM_HasCSharpRController();

		/**
		 * The meta object literal for the '<em><b>Has Entity Database Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PSM__HAS_ENTITY_DATABASE_CONTROLLER = eINSTANCE.getRESTfulServicePSM_HasEntityDatabaseController();

		/**
		 * The meta object literal for the '<em><b>Has CSharp Algo RController</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RCONTROLLER = eINSTANCE.getRESTfulServicePSM_HasCSharpAlgoRController();

		/**
		 * The meta object literal for the '<em><b>Has CSharp Algo Resource Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PSM__HAS_CSHARP_ALGO_RESOURCE_MODEL = eINSTANCE.getRESTfulServicePSM_HasCSharpAlgoResourceModel();

		/**
		 * The meta object literal for the '<em><b>Service Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PSM__SERVICE_OUTPUT_PATH = eINSTANCE.getRESTfulServicePSM_ServiceOutputPath();

		/**
		 * The meta object literal for the '<em><b>Service Database IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_IP = eINSTANCE.getRESTfulServicePSM_ServiceDatabaseIP();

		/**
		 * The meta object literal for the '<em><b>Service Database Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PORT = eINSTANCE.getRESTfulServicePSM_ServiceDatabasePort();

		/**
		 * The meta object literal for the '<em><b>Service Database Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_USERNAME = eINSTANCE.getRESTfulServicePSM_ServiceDatabaseUsername();

		/**
		 * The meta object literal for the '<em><b>Service Database Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PSM__SERVICE_DATABASE_PASSWORD = eINSTANCE.getRESTfulServicePSM_ServiceDatabasePassword();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpResourceModelImpl <em>CSharp Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpResourceModelImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpResourceModel()
		 * @generated
		 */
		EClass CSHARP_RESOURCE_MODEL = eINSTANCE.getCSharpResourceModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_MODEL__NAME = eINSTANCE.getCSharpResourceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Has Related CSharp RM Manager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER = eINSTANCE.getCSharpResourceModel_HasRelatedCSharpRMManager();

		/**
		 * The meta object literal for the '<em><b>CSharp RModel Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY = eINSTANCE.getCSharpResourceModel_CSharpRModelHasProperty();

		/**
		 * The meta object literal for the '<em><b>CSharp RModel Has Data Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION = eINSTANCE.getCSharpResourceModel_CSharpRModelHasDataAnnotation();

		/**
		 * The meta object literal for the '<em><b>CSharp RModel Has Entity Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION = eINSTANCE.getCSharpResourceModel_CSharpRModelHasEntityAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_MODEL__PARENT_NAME = eINSTANCE.getCSharpResourceModel_ParentName();

		/**
		 * The meta object literal for the '<em><b>CSharp RModel Has Getter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER = eINSTANCE.getCSharpResourceModel_CSharpRModelHasGetter();

		/**
		 * The meta object literal for the '<em><b>CSharp RModel Has Setter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER = eINSTANCE.getCSharpResourceModel_CSharpRModelHasSetter();

		/**
		 * The meta object literal for the '<em><b>Has Related CSharp Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL = eINSTANCE.getCSharpResourceModel_HasRelatedCSharpAlgoModel();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpResourceModelManagerImpl <em>CSharp Resource Model Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpResourceModelManagerImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpResourceModelManager()
		 * @generated
		 */
		EClass CSHARP_RESOURCE_MODEL_MANAGER = eINSTANCE.getCSharpResourceModelManager();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_MODEL_MANAGER__NAME = eINSTANCE.getCSharpResourceModelManager_Name();

		/**
		 * The meta object literal for the '<em><b>Has Related CSharp RModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL = eINSTANCE.getCSharpResourceModelManager_HasRelatedCSharpRModel();

		/**
		 * The meta object literal for the '<em><b>CSharp RM Manager Has Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY = eINSTANCE.getCSharpResourceModelManager_CSharpRMManagerHasProperty();

		/**
		 * The meta object literal for the '<em><b>CSharp RM Manager Has Data Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION = eINSTANCE.getCSharpResourceModelManager_CSharpRMManagerHasDataAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME = eINSTANCE.getCSharpResourceModelManager_ParentName();

		/**
		 * The meta object literal for the '<em><b>CSharp RM Manager Has Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER = eINSTANCE.getCSharpResourceModelManager_CSharpRMManagerHasGetter();

		/**
		 * The meta object literal for the '<em><b>CSharp RM Manager Has Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER = eINSTANCE.getCSharpResourceModelManager_CSharpRMManagerHasSetter();

		/**
		 * The meta object literal for the '{@link PSM.impl.PSMComponentPropertyImpl <em>Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.PSMComponentPropertyImpl
		 * @see PSM.impl.PSMPackageImpl#getPSMComponentProperty()
		 * @generated
		 */
		EClass PSM_COMPONENT_PROPERTY = eINSTANCE.getPSMComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__NAME = eINSTANCE.getPSMComponentProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__TYPE = eINSTANCE.getPSMComponentProperty_Type();

		/**
		 * The meta object literal for the '<em><b>BIs Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__BIS_UNIQUE = eINSTANCE.getPSMComponentProperty_BIsUnique();

		/**
		 * The meta object literal for the '<em><b>BIs Primary Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER = eINSTANCE.getPSMComponentProperty_BIsPrimaryIdentifier();

		/**
		 * The meta object literal for the '<em><b>Property Has Data Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION = eINSTANCE.getPSMComponentProperty_PropertyHasDataAnnotation();

		/**
		 * The meta object literal for the '<em><b>Property Has Entity Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION = eINSTANCE.getPSMComponentProperty_PropertyHasEntityAnnotation();

		/**
		 * The meta object literal for the '<em><b>Corresponding Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD = eINSTANCE.getPSMComponentProperty_CorrespondingField();

		/**
		 * The meta object literal for the '<em><b>BIs Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY = eINSTANCE.getPSMComponentProperty_BIsForeignKey();

		/**
		 * The meta object literal for the '<em><b>BIs Navigation Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY = eINSTANCE.getPSMComponentProperty_BIsNavigationProperty();

		/**
		 * The meta object literal for the '{@link PSM.impl.EntityAnnotationImpl <em>Entity Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.EntityAnnotationImpl
		 * @see PSM.impl.PSMPackageImpl#getEntityAnnotation()
		 * @generated
		 */
		EClass ENTITY_ANNOTATION = eINSTANCE.getEntityAnnotation();

		/**
		 * The meta object literal for the '<em><b>Entity Annotation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ANNOTATION__ENTITY_ANNOTATION_TEXT = eINSTANCE.getEntityAnnotation_EntityAnnotationText();

		/**
		 * The meta object literal for the '{@link PSM.impl.DataContractAnnotationImpl <em>Data Contract Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.DataContractAnnotationImpl
		 * @see PSM.impl.PSMPackageImpl#getDataContractAnnotation()
		 * @generated
		 */
		EClass DATA_CONTRACT_ANNOTATION = eINSTANCE.getDataContractAnnotation();

		/**
		 * The meta object literal for the '<em><b>Data Contract Annotation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTRACT_ANNOTATION__DATA_CONTRACT_ANNOTATION_TEXT = eINSTANCE.getDataContractAnnotation_DataContractAnnotationText();

		/**
		 * The meta object literal for the '{@link PSM.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.FunctionParameterImpl
		 * @see PSM.impl.PSMPackageImpl#getFunctionParameter()
		 * @generated
		 */
		EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__NAME = eINSTANCE.getFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__TYPE = eINSTANCE.getFunctionParameter_Type();

		/**
		 * The meta object literal for the '<em><b>BIs Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__BIS_UNIQUE = eINSTANCE.getFunctionParameter_BIsUnique();

		/**
		 * The meta object literal for the '<em><b>BIs Return Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__BIS_RETURN_PARAMETER = eINSTANCE.getFunctionParameter_BIsReturnParameter();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpResourceControllerImpl <em>CSharp Resource Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpResourceControllerImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpResourceController()
		 * @generated
		 */
		EClass CSHARP_RESOURCE_CONTROLLER = eINSTANCE.getCSharpResourceController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_CONTROLLER__NAME = eINSTANCE.getCSharpResourceController_Name();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_CONTROLLER__CONTROLLER_URI = eINSTANCE.getCSharpResourceController_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Has Associated CSharp RModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_RMODEL = eINSTANCE.getCSharpResourceController_HasAssociatedCSharpRModel();

		/**
		 * The meta object literal for the '<em><b>CSharp RController Has AR Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_AR_ANNOTATION = eINSTANCE.getCSharpResourceController_CSharpRControllerHasARAnnotation();

		/**
		 * The meta object literal for the '<em><b>CSharp RController Has Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_CONTROLLER__CSHARP_RCONTROLLER_HAS_ACTION = eINSTANCE.getCSharpResourceController_CSharpRControllerHasAction();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_CONTROLLER__PARENT_NAME = eINSTANCE.getCSharpResourceController_ParentName();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpResourceManagerControllerImpl <em>CSharp Resource Manager Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpResourceManagerControllerImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpResourceManagerController()
		 * @generated
		 */
		EClass CSHARP_RESOURCE_MANAGER_CONTROLLER = eINSTANCE.getCSharpResourceManagerController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_MANAGER_CONTROLLER__NAME = eINSTANCE.getCSharpResourceManagerController_Name();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_MANAGER_CONTROLLER__CONTROLLER_URI = eINSTANCE.getCSharpResourceManagerController_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Has Associated CSharp RM Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MANAGER_CONTROLLER__HAS_ASSOCIATED_CSHARP_RM_MANAGER = eINSTANCE.getCSharpResourceManagerController_HasAssociatedCSharpRMManager();

		/**
		 * The meta object literal for the '<em><b>CSharp RM Controller Has AR Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_AR_ANNOTATION = eINSTANCE.getCSharpResourceManagerController_CSharpRMControllerHasARAnnotation();

		/**
		 * The meta object literal for the '<em><b>CSharp RM Controller Has Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_RESOURCE_MANAGER_CONTROLLER__CSHARP_RM_CONTROLLER_HAS_ACTION = eINSTANCE.getCSharpResourceManagerController_CSharpRMControllerHasAction();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_RESOURCE_MANAGER_CONTROLLER__PARENT_NAME = eINSTANCE.getCSharpResourceManagerController_ParentName();

		/**
		 * The meta object literal for the '{@link PSM.impl.HTTPActionImpl <em>HTTP Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.HTTPActionImpl
		 * @see PSM.impl.PSMPackageImpl#getHTTPAction()
		 * @generated
		 */
		EClass HTTP_ACTION = eINSTANCE.getHTTPAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTION__NAME = eINSTANCE.getHTTPAction_Name();

		/**
		 * The meta object literal for the '<em><b>Action HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTION__ACTION_HTTP_VERB = eINSTANCE.getHTTPAction_ActionHTTPVerb();

		/**
		 * The meta object literal for the '<em><b>HTTP Action URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTION__HTTP_ACTION_URI = eINSTANCE.getHTTPAction_HTTPActionURI();

		/**
		 * The meta object literal for the '<em><b>HTTP Action Has AR Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION = eINSTANCE.getHTTPAction_HTTPActionHasARAnnotation();

		/**
		 * The meta object literal for the '<em><b>HTTP Action Has Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER = eINSTANCE.getHTTPAction_HTTPActionHasParameter();

		/**
		 * The meta object literal for the '<em><b>Has HTTP Action Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTION__HAS_HTTP_ACTION_HANDLER = eINSTANCE.getHTTPAction_HasHTTPActionHandler();

		/**
		 * The meta object literal for the '{@link PSM.impl.AttributeRoutingAnnotationImpl <em>Attribute Routing Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.AttributeRoutingAnnotationImpl
		 * @see PSM.impl.PSMPackageImpl#getAttributeRoutingAnnotation()
		 * @generated
		 */
		EClass ATTRIBUTE_ROUTING_ANNOTATION = eINSTANCE.getAttributeRoutingAnnotation();

		/**
		 * The meta object literal for the '<em><b>Attribute Routing Annotation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ROUTING_ANNOTATION__ATTRIBUTE_ROUTING_ANNOTATION_TEXT = eINSTANCE.getAttributeRoutingAnnotation_AttributeRoutingAnnotationText();

		/**
		 * The meta object literal for the '{@link PSM.impl.HTTPActionHandlerImpl <em>HTTP Action Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.HTTPActionHandlerImpl
		 * @see PSM.impl.PSMPackageImpl#getHTTPActionHandler()
		 * @generated
		 */
		EClass HTTP_ACTION_HANDLER = eINSTANCE.getHTTPActionHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTION_HANDLER__NAME = eINSTANCE.getHTTPActionHandler_Name();

		/**
		 * The meta object literal for the '<em><b>Handler HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB = eINSTANCE.getHTTPActionHandler_HandlerHTTPVerb();

		/**
		 * The meta object literal for the '<em><b>Uses Entity Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY = eINSTANCE.getHTTPActionHandler_UsesEntityActivity();

		/**
		 * The meta object literal for the '<em><b>Has Hypermedia Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION = eINSTANCE.getHTTPActionHandler_HasHypermediaFunction();

		/**
		 * The meta object literal for the '{@link PSM.impl.EntityActivityImpl <em>Entity Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.EntityActivityImpl
		 * @see PSM.impl.PSMPackageImpl#getEntityActivity()
		 * @generated
		 */
		EClass ENTITY_ACTIVITY = eINSTANCE.getEntityActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ACTIVITY__NAME = eINSTANCE.getEntityActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Entity Activity HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ACTIVITY__ENTITY_ACTIVITY_HTTP_VERB = eINSTANCE.getEntityActivity_EntityActivityHTTPVerb();

		/**
		 * The meta object literal for the '{@link PSM.impl.EntityDatabaseControllerImpl <em>Entity Database Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.EntityDatabaseControllerImpl
		 * @see PSM.impl.PSMPackageImpl#getEntityDatabaseController()
		 * @generated
		 */
		EClass ENTITY_DATABASE_CONTROLLER = eINSTANCE.getEntityDatabaseController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_DATABASE_CONTROLLER__NAME = eINSTANCE.getEntityDatabaseController_Name();

		/**
		 * The meta object literal for the '<em><b>Has Entity Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DATABASE_CONTROLLER__HAS_ENTITY_ACTIVITY = eINSTANCE.getEntityDatabaseController_HasEntityActivity();

		/**
		 * The meta object literal for the '{@link PSM.impl.CreateHypermediaFunctionImpl <em>Create Hypermedia Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CreateHypermediaFunctionImpl
		 * @see PSM.impl.PSMPackageImpl#getCreateHypermediaFunction()
		 * @generated
		 */
		EClass CREATE_HYPERMEDIA_FUNCTION = eINSTANCE.getCreateHypermediaFunction();

		/**
		 * The meta object literal for the '<em><b>Has PSM Hypermedia Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK = eINSTANCE.getCreateHypermediaFunction_HasPSMHypermediaLink();

		/**
		 * The meta object literal for the '{@link PSM.impl.PSMHypermediaLinkImpl <em>Hypermedia Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.PSMHypermediaLinkImpl
		 * @see PSM.impl.PSMPackageImpl#getPSMHypermediaLink()
		 * @generated
		 */
		EClass PSM_HYPERMEDIA_LINK = eINSTANCE.getPSMHypermediaLink();

		/**
		 * The meta object literal for the '<em><b>Link HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB = eINSTANCE.getPSMHypermediaLink_LinkHTTPVerb();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_HYPERMEDIA_LINK__LINK_TYPE = eINSTANCE.getPSMHypermediaLink_LinkType();

		/**
		 * The meta object literal for the '<em><b>Has Target CSharp RController</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER = eINSTANCE.getPSMHypermediaLink_HasTargetCSharpRController();

		/**
		 * The meta object literal for the '<em><b>Has Target CSharp RM Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER = eINSTANCE.getPSMHypermediaLink_HasTargetCSharpRMController();

		/**
		 * The meta object literal for the '<em><b>Has Target CSharp Algo RController</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER = eINSTANCE.getPSMHypermediaLink_HasTargetCSharpAlgoRController();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpAlgoResourceModelImpl <em>CSharp Algo Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpAlgoResourceModelImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpAlgoResourceModel()
		 * @generated
		 */
		EClass CSHARP_ALGO_RESOURCE_MODEL = eINSTANCE.getCSharpAlgoResourceModel();

		/**
		 * The meta object literal for the '<em><b>CSharp Algo Model Has Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY = eINSTANCE.getCSharpAlgoResourceModel_CSharpAlgoModelHasProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_ALGO_RESOURCE_MODEL__NAME = eINSTANCE.getCSharpAlgoResourceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME = eINSTANCE.getCSharpAlgoResourceModel_ParentName();

		/**
		 * The meta object literal for the '<em><b>CSharp Algo Model Has Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER = eINSTANCE.getCSharpAlgoResourceModel_CSharpAlgoModelHasGetter();

		/**
		 * The meta object literal for the '<em><b>CSharp Algo Model Has Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER = eINSTANCE.getCSharpAlgoResourceModel_CSharpAlgoModelHasSetter();

		/**
		 * The meta object literal for the '<em><b>CSharp Algo RModel Has Data Contract Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION = eINSTANCE.getCSharpAlgoResourceModel_CSharpAlgoRModelHasDataContractAnnotation();

		/**
		 * The meta object literal for the '<em><b>Has Related CSharp Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL = eINSTANCE.getCSharpAlgoResourceModel_HasRelatedCSharpAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Is Related CSharp Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL = eINSTANCE.getCSharpAlgoResourceModel_IsRelatedCSharpAlgoModel();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpAlgoResourceControllerImpl <em>CSharp Algo Resource Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpAlgoResourceControllerImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpAlgoResourceController()
		 * @generated
		 */
		EClass CSHARP_ALGO_RESOURCE_CONTROLLER = eINSTANCE.getCSharpAlgoResourceController();

		/**
		 * The meta object literal for the '<em><b>Has Associated CSharp Algo Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_CSHARP_ALGO_MODEL = eINSTANCE.getCSharpAlgoResourceController_HasAssociatedCSharpAlgoModel();

		/**
		 * The meta object literal for the '<em><b>CSharp Algo RChas HTTP Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCHAS_HTTP_ACTION = eINSTANCE.getCSharpAlgoResourceController_CSharpAlgoRChasHTTPAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_ALGO_RESOURCE_CONTROLLER__NAME = eINSTANCE.getCSharpAlgoResourceController_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_ALGO_RESOURCE_CONTROLLER__PARENT_NAME = eINSTANCE.getCSharpAlgoResourceController_ParentName();

		/**
		 * The meta object literal for the '<em><b>CSharp Algo RController Has AR Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_ALGO_RESOURCE_CONTROLLER__CSHARP_ALGO_RCONTROLLER_HAS_AR_ANNOTATION = eINSTANCE.getCSharpAlgoResourceController_CSharpAlgoRControllerHasARAnnotation();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSHARP_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI = eINSTANCE.getCSharpAlgoResourceController_ControllerURI();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpPropertySetterImpl <em>CSharp Property Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpPropertySetterImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpPropertySetter()
		 * @generated
		 */
		EClass CSHARP_PROPERTY_SETTER = eINSTANCE.getCSharpPropertySetter();

		/**
		 * The meta object literal for the '<em><b>Sets Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_PROPERTY_SETTER__SETS_PROPERTY = eINSTANCE.getCSharpPropertySetter_SetsProperty();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpPropertyGetterImpl <em>CSharp Property Getter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpPropertyGetterImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpPropertyGetter()
		 * @generated
		 */
		EClass CSHARP_PROPERTY_GETTER = eINSTANCE.getCSharpPropertyGetter();

		/**
		 * The meta object literal for the '<em><b>Gets Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSHARP_PROPERTY_GETTER__GETS_PROPERTY = eINSTANCE.getCSharpPropertyGetter_GetsProperty();

		/**
		 * The meta object literal for the '{@link PSM.impl.CSharpPropertyAccessorImpl <em>CSharp Property Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.impl.CSharpPropertyAccessorImpl
		 * @see PSM.impl.PSMPackageImpl#getCSharpPropertyAccessor()
		 * @generated
		 */
		EClass CSHARP_PROPERTY_ACCESSOR = eINSTANCE.getCSharpPropertyAccessor();

		/**
		 * The meta object literal for the '{@link PSM.LinkType <em>Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.LinkType
		 * @see PSM.impl.PSMPackageImpl#getLinkType()
		 * @generated
		 */
		EEnum LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '{@link PSM.HTTPVerb <em>HTTP Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PSM.HTTPVerb
		 * @see PSM.impl.PSMPackageImpl#getHTTPVerb()
		 * @generated
		 */
		EEnum HTTP_VERB = eINSTANCE.getHTTPVerb();

	}

} //PSMPackage
