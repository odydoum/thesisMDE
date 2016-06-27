/**
 */
package PSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PSM.PSMPackage
 * @generated
 */
public interface PSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PSMFactory eINSTANCE = PSM.impl.PSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RES Tful Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RES Tful Service PSM</em>'.
	 * @generated
	 */
	RESTfulServicePSM createRESTfulServicePSM();

	/**
	 * Returns a new object of class '<em>CSharp Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Resource Model</em>'.
	 * @generated
	 */
	CSharpResourceModel createCSharpResourceModel();

	/**
	 * Returns a new object of class '<em>CSharp Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Resource Model Manager</em>'.
	 * @generated
	 */
	CSharpResourceModelManager createCSharpResourceModelManager();

	/**
	 * Returns a new object of class '<em>Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Property</em>'.
	 * @generated
	 */
	PSMComponentProperty createPSMComponentProperty();

	/**
	 * Returns a new object of class '<em>Entity Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Annotation</em>'.
	 * @generated
	 */
	EntityAnnotation createEntityAnnotation();

	/**
	 * Returns a new object of class '<em>Data Contract Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Contract Annotation</em>'.
	 * @generated
	 */
	DataContractAnnotation createDataContractAnnotation();

	/**
	 * Returns a new object of class '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Parameter</em>'.
	 * @generated
	 */
	FunctionParameter createFunctionParameter();

	/**
	 * Returns a new object of class '<em>CSharp Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Resource Controller</em>'.
	 * @generated
	 */
	CSharpResourceController createCSharpResourceController();

	/**
	 * Returns a new object of class '<em>CSharp Resource Manager Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Resource Manager Controller</em>'.
	 * @generated
	 */
	CSharpResourceManagerController createCSharpResourceManagerController();

	/**
	 * Returns a new object of class '<em>HTTP Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Action</em>'.
	 * @generated
	 */
	HTTPAction createHTTPAction();

	/**
	 * Returns a new object of class '<em>Attribute Routing Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Routing Annotation</em>'.
	 * @generated
	 */
	AttributeRoutingAnnotation createAttributeRoutingAnnotation();

	/**
	 * Returns a new object of class '<em>HTTP Action Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Action Handler</em>'.
	 * @generated
	 */
	HTTPActionHandler createHTTPActionHandler();

	/**
	 * Returns a new object of class '<em>Entity Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Activity</em>'.
	 * @generated
	 */
	EntityActivity createEntityActivity();

	/**
	 * Returns a new object of class '<em>Entity Database Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Database Controller</em>'.
	 * @generated
	 */
	EntityDatabaseController createEntityDatabaseController();

	/**
	 * Returns a new object of class '<em>Create Hypermedia Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Hypermedia Function</em>'.
	 * @generated
	 */
	CreateHypermediaFunction createCreateHypermediaFunction();

	/**
	 * Returns a new object of class '<em>Hypermedia Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypermedia Link</em>'.
	 * @generated
	 */
	PSMHypermediaLink createPSMHypermediaLink();

	/**
	 * Returns a new object of class '<em>CSharp Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Algo Resource Model</em>'.
	 * @generated
	 */
	CSharpAlgoResourceModel createCSharpAlgoResourceModel();

	/**
	 * Returns a new object of class '<em>CSharp Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Algo Resource Controller</em>'.
	 * @generated
	 */
	CSharpAlgoResourceController createCSharpAlgoResourceController();

	/**
	 * Returns a new object of class '<em>CSharp Property Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Property Setter</em>'.
	 * @generated
	 */
	CSharpPropertySetter createCSharpPropertySetter();

	/**
	 * Returns a new object of class '<em>CSharp Property Getter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Property Getter</em>'.
	 * @generated
	 */
	CSharpPropertyGetter createCSharpPropertyGetter();

	/**
	 * Returns a new object of class '<em>CSharp Property Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Property Accessor</em>'.
	 * @generated
	 */
	CSharpPropertyAccessor createCSharpPropertyAccessor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PSMPackage getPSMPackage();

} //PSMFactory
