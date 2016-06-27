/**
 */
package PSM.util;

import PSM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see PSM.PSMPackage
 * @generated
 */
public class PSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMSwitch() {
		if (modelPackage == null) {
			modelPackage = PSMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PSMPackage.RES_TFUL_SERVICE_PSM: {
				RESTfulServicePSM resTfulServicePSM = (RESTfulServicePSM)theEObject;
				T result = caseRESTfulServicePSM(resTfulServicePSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_RESOURCE_MODEL: {
				CSharpResourceModel cSharpResourceModel = (CSharpResourceModel)theEObject;
				T result = caseCSharpResourceModel(cSharpResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER: {
				CSharpResourceModelManager cSharpResourceModelManager = (CSharpResourceModelManager)theEObject;
				T result = caseCSharpResourceModelManager(cSharpResourceModelManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.PSM_COMPONENT_PROPERTY: {
				PSMComponentProperty psmComponentProperty = (PSMComponentProperty)theEObject;
				T result = casePSMComponentProperty(psmComponentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.ENTITY_ANNOTATION: {
				EntityAnnotation entityAnnotation = (EntityAnnotation)theEObject;
				T result = caseEntityAnnotation(entityAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.DATA_CONTRACT_ANNOTATION: {
				DataContractAnnotation dataContractAnnotation = (DataContractAnnotation)theEObject;
				T result = caseDataContractAnnotation(dataContractAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.FUNCTION_PARAMETER: {
				FunctionParameter functionParameter = (FunctionParameter)theEObject;
				T result = caseFunctionParameter(functionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_RESOURCE_CONTROLLER: {
				CSharpResourceController cSharpResourceController = (CSharpResourceController)theEObject;
				T result = caseCSharpResourceController(cSharpResourceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_RESOURCE_MANAGER_CONTROLLER: {
				CSharpResourceManagerController cSharpResourceManagerController = (CSharpResourceManagerController)theEObject;
				T result = caseCSharpResourceManagerController(cSharpResourceManagerController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.HTTP_ACTION: {
				HTTPAction httpAction = (HTTPAction)theEObject;
				T result = caseHTTPAction(httpAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.ATTRIBUTE_ROUTING_ANNOTATION: {
				AttributeRoutingAnnotation attributeRoutingAnnotation = (AttributeRoutingAnnotation)theEObject;
				T result = caseAttributeRoutingAnnotation(attributeRoutingAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.HTTP_ACTION_HANDLER: {
				HTTPActionHandler httpActionHandler = (HTTPActionHandler)theEObject;
				T result = caseHTTPActionHandler(httpActionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.ENTITY_ACTIVITY: {
				EntityActivity entityActivity = (EntityActivity)theEObject;
				T result = caseEntityActivity(entityActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.ENTITY_DATABASE_CONTROLLER: {
				EntityDatabaseController entityDatabaseController = (EntityDatabaseController)theEObject;
				T result = caseEntityDatabaseController(entityDatabaseController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CREATE_HYPERMEDIA_FUNCTION: {
				CreateHypermediaFunction createHypermediaFunction = (CreateHypermediaFunction)theEObject;
				T result = caseCreateHypermediaFunction(createHypermediaFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.PSM_HYPERMEDIA_LINK: {
				PSMHypermediaLink psmHypermediaLink = (PSMHypermediaLink)theEObject;
				T result = casePSMHypermediaLink(psmHypermediaLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL: {
				CSharpAlgoResourceModel cSharpAlgoResourceModel = (CSharpAlgoResourceModel)theEObject;
				T result = caseCSharpAlgoResourceModel(cSharpAlgoResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_ALGO_RESOURCE_CONTROLLER: {
				CSharpAlgoResourceController cSharpAlgoResourceController = (CSharpAlgoResourceController)theEObject;
				T result = caseCSharpAlgoResourceController(cSharpAlgoResourceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_PROPERTY_SETTER: {
				CSharpPropertySetter cSharpPropertySetter = (CSharpPropertySetter)theEObject;
				T result = caseCSharpPropertySetter(cSharpPropertySetter);
				if (result == null) result = caseCSharpPropertyAccessor(cSharpPropertySetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_PROPERTY_GETTER: {
				CSharpPropertyGetter cSharpPropertyGetter = (CSharpPropertyGetter)theEObject;
				T result = caseCSharpPropertyGetter(cSharpPropertyGetter);
				if (result == null) result = caseCSharpPropertyAccessor(cSharpPropertyGetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PSMPackage.CSHARP_PROPERTY_ACCESSOR: {
				CSharpPropertyAccessor cSharpPropertyAccessor = (CSharpPropertyAccessor)theEObject;
				T result = caseCSharpPropertyAccessor(cSharpPropertyAccessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RES Tful Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RES Tful Service PSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRESTfulServicePSM(RESTfulServicePSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpResourceModel(CSharpResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Resource Model Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpResourceModelManager(CSharpResourceModelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSMComponentProperty(PSMComponentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAnnotation(EntityAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Contract Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Contract Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataContractAnnotation(DataContractAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameter(FunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Resource Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpResourceController(CSharpResourceController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Resource Manager Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Resource Manager Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpResourceManagerController(CSharpResourceManagerController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPAction(HTTPAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Routing Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Routing Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRoutingAnnotation(AttributeRoutingAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Action Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Action Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPActionHandler(HTTPActionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityActivity(EntityActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Database Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Database Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDatabaseController(EntityDatabaseController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Hypermedia Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Hypermedia Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateHypermediaFunction(CreateHypermediaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypermedia Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypermedia Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSMHypermediaLink(PSMHypermediaLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Algo Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpAlgoResourceModel(CSharpAlgoResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Algo Resource Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpAlgoResourceController(CSharpAlgoResourceController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Property Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Property Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpPropertySetter(CSharpPropertySetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Property Getter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Property Getter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpPropertyGetter(CSharpPropertyGetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Property Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Property Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharpPropertyAccessor(CSharpPropertyAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PSMSwitch
