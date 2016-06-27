/**
 */
package PSM.util;

import PSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PSM.PSMPackage
 * @generated
 */
public class PSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PSMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSMSwitch<Adapter> modelSwitch =
		new PSMSwitch<Adapter>() {
			@Override
			public Adapter caseRESTfulServicePSM(RESTfulServicePSM object) {
				return createRESTfulServicePSMAdapter();
			}
			@Override
			public Adapter caseCSharpResourceModel(CSharpResourceModel object) {
				return createCSharpResourceModelAdapter();
			}
			@Override
			public Adapter caseCSharpResourceModelManager(CSharpResourceModelManager object) {
				return createCSharpResourceModelManagerAdapter();
			}
			@Override
			public Adapter casePSMComponentProperty(PSMComponentProperty object) {
				return createPSMComponentPropertyAdapter();
			}
			@Override
			public Adapter caseEntityAnnotation(EntityAnnotation object) {
				return createEntityAnnotationAdapter();
			}
			@Override
			public Adapter caseDataContractAnnotation(DataContractAnnotation object) {
				return createDataContractAnnotationAdapter();
			}
			@Override
			public Adapter caseFunctionParameter(FunctionParameter object) {
				return createFunctionParameterAdapter();
			}
			@Override
			public Adapter caseCSharpResourceController(CSharpResourceController object) {
				return createCSharpResourceControllerAdapter();
			}
			@Override
			public Adapter caseCSharpResourceManagerController(CSharpResourceManagerController object) {
				return createCSharpResourceManagerControllerAdapter();
			}
			@Override
			public Adapter caseHTTPAction(HTTPAction object) {
				return createHTTPActionAdapter();
			}
			@Override
			public Adapter caseAttributeRoutingAnnotation(AttributeRoutingAnnotation object) {
				return createAttributeRoutingAnnotationAdapter();
			}
			@Override
			public Adapter caseHTTPActionHandler(HTTPActionHandler object) {
				return createHTTPActionHandlerAdapter();
			}
			@Override
			public Adapter caseEntityActivity(EntityActivity object) {
				return createEntityActivityAdapter();
			}
			@Override
			public Adapter caseEntityDatabaseController(EntityDatabaseController object) {
				return createEntityDatabaseControllerAdapter();
			}
			@Override
			public Adapter caseCreateHypermediaFunction(CreateHypermediaFunction object) {
				return createCreateHypermediaFunctionAdapter();
			}
			@Override
			public Adapter casePSMHypermediaLink(PSMHypermediaLink object) {
				return createPSMHypermediaLinkAdapter();
			}
			@Override
			public Adapter caseCSharpAlgoResourceModel(CSharpAlgoResourceModel object) {
				return createCSharpAlgoResourceModelAdapter();
			}
			@Override
			public Adapter caseCSharpAlgoResourceController(CSharpAlgoResourceController object) {
				return createCSharpAlgoResourceControllerAdapter();
			}
			@Override
			public Adapter caseCSharpPropertySetter(CSharpPropertySetter object) {
				return createCSharpPropertySetterAdapter();
			}
			@Override
			public Adapter caseCSharpPropertyGetter(CSharpPropertyGetter object) {
				return createCSharpPropertyGetterAdapter();
			}
			@Override
			public Adapter caseCSharpPropertyAccessor(CSharpPropertyAccessor object) {
				return createCSharpPropertyAccessorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link PSM.RESTfulServicePSM <em>RES Tful Service PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.RESTfulServicePSM
	 * @generated
	 */
	public Adapter createRESTfulServicePSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpResourceModel <em>CSharp Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpResourceModel
	 * @generated
	 */
	public Adapter createCSharpResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpResourceModelManager <em>CSharp Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpResourceModelManager
	 * @generated
	 */
	public Adapter createCSharpResourceModelManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.PSMComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.PSMComponentProperty
	 * @generated
	 */
	public Adapter createPSMComponentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.EntityAnnotation <em>Entity Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.EntityAnnotation
	 * @generated
	 */
	public Adapter createEntityAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.DataContractAnnotation <em>Data Contract Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.DataContractAnnotation
	 * @generated
	 */
	public Adapter createDataContractAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.FunctionParameter
	 * @generated
	 */
	public Adapter createFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpResourceController <em>CSharp Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpResourceController
	 * @generated
	 */
	public Adapter createCSharpResourceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpResourceManagerController <em>CSharp Resource Manager Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpResourceManagerController
	 * @generated
	 */
	public Adapter createCSharpResourceManagerControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.HTTPAction <em>HTTP Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.HTTPAction
	 * @generated
	 */
	public Adapter createHTTPActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.AttributeRoutingAnnotation <em>Attribute Routing Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.AttributeRoutingAnnotation
	 * @generated
	 */
	public Adapter createAttributeRoutingAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.HTTPActionHandler <em>HTTP Action Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.HTTPActionHandler
	 * @generated
	 */
	public Adapter createHTTPActionHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.EntityActivity <em>Entity Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.EntityActivity
	 * @generated
	 */
	public Adapter createEntityActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.EntityDatabaseController <em>Entity Database Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.EntityDatabaseController
	 * @generated
	 */
	public Adapter createEntityDatabaseControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CreateHypermediaFunction <em>Create Hypermedia Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CreateHypermediaFunction
	 * @generated
	 */
	public Adapter createCreateHypermediaFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.PSMHypermediaLink <em>Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.PSMHypermediaLink
	 * @generated
	 */
	public Adapter createPSMHypermediaLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpAlgoResourceModel <em>CSharp Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpAlgoResourceModel
	 * @generated
	 */
	public Adapter createCSharpAlgoResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpAlgoResourceController <em>CSharp Algo Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpAlgoResourceController
	 * @generated
	 */
	public Adapter createCSharpAlgoResourceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpPropertySetter <em>CSharp Property Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpPropertySetter
	 * @generated
	 */
	public Adapter createCSharpPropertySetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpPropertyGetter <em>CSharp Property Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpPropertyGetter
	 * @generated
	 */
	public Adapter createCSharpPropertyGetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PSM.CSharpPropertyAccessor <em>CSharp Property Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PSM.CSharpPropertyAccessor
	 * @generated
	 */
	public Adapter createCSharpPropertyAccessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PSMAdapterFactory
