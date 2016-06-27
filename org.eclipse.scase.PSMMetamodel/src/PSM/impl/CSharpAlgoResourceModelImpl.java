/**
 */
package PSM.impl;

import PSM.CSharpAlgoResourceModel;
import PSM.CSharpPropertyGetter;
import PSM.CSharpPropertySetter;
import PSM.DataContractAnnotation;
import PSM.PSMComponentProperty;
import PSM.PSMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSharp Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getCSharpAlgoModelHasProperty <em>CSharp Algo Model Has Property</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getCSharpAlgoModelHasGetter <em>CSharp Algo Model Has Getter</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getCSharpAlgoModelHasSetter <em>CSharp Algo Model Has Setter</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getCSharpAlgoRModelHasDataContractAnnotation <em>CSharp Algo RModel Has Data Contract Annotation</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getHasRelatedCSharpAlgoModel <em>Has Related CSharp Algo Model</em>}</li>
 *   <li>{@link PSM.impl.CSharpAlgoResourceModelImpl#getIsRelatedCSharpAlgoModel <em>Is Related CSharp Algo Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpAlgoResourceModelImpl extends MinimalEObjectImpl.Container implements CSharpAlgoResourceModel {
	/**
	 * The cached value of the '{@link #getCSharpAlgoModelHasProperty() <em>CSharp Algo Model Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpAlgoModelHasProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty cSharpAlgoModelHasProperty;

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
	 * The cached value of the '{@link #getCSharpAlgoModelHasGetter() <em>CSharp Algo Model Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpAlgoModelHasGetter()
	 * @generated
	 * @ordered
	 */
	protected CSharpPropertyGetter cSharpAlgoModelHasGetter;

	/**
	 * The cached value of the '{@link #getCSharpAlgoModelHasSetter() <em>CSharp Algo Model Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpAlgoModelHasSetter()
	 * @generated
	 * @ordered
	 */
	protected CSharpPropertySetter cSharpAlgoModelHasSetter;

	/**
	 * The cached value of the '{@link #getCSharpAlgoRModelHasDataContractAnnotation() <em>CSharp Algo RModel Has Data Contract Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpAlgoRModelHasDataContractAnnotation()
	 * @generated
	 * @ordered
	 */
	protected DataContractAnnotation cSharpAlgoRModelHasDataContractAnnotation;

	/**
	 * The cached value of the '{@link #getHasRelatedCSharpAlgoModel() <em>Has Related CSharp Algo Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedCSharpAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpAlgoResourceModel> hasRelatedCSharpAlgoModel;

	/**
	 * The cached value of the '{@link #getIsRelatedCSharpAlgoModel() <em>Is Related CSharp Algo Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedCSharpAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpAlgoResourceModel> isRelatedCSharpAlgoModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpAlgoResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_ALGO_RESOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getCSharpAlgoModelHasProperty() {
		return cSharpAlgoModelHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpAlgoModelHasProperty(PSMComponentProperty newCSharpAlgoModelHasProperty, NotificationChain msgs) {
		PSMComponentProperty oldCSharpAlgoModelHasProperty = cSharpAlgoModelHasProperty;
		cSharpAlgoModelHasProperty = newCSharpAlgoModelHasProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY, oldCSharpAlgoModelHasProperty, newCSharpAlgoModelHasProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpAlgoModelHasProperty(PSMComponentProperty newCSharpAlgoModelHasProperty) {
		if (newCSharpAlgoModelHasProperty != cSharpAlgoModelHasProperty) {
			NotificationChain msgs = null;
			if (cSharpAlgoModelHasProperty != null)
				msgs = ((InternalEObject)cSharpAlgoModelHasProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY, null, msgs);
			if (newCSharpAlgoModelHasProperty != null)
				msgs = ((InternalEObject)newCSharpAlgoModelHasProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY, null, msgs);
			msgs = basicSetCSharpAlgoModelHasProperty(newCSharpAlgoModelHasProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY, newCSharpAlgoModelHasProperty, newCSharpAlgoModelHasProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpPropertyGetter getCSharpAlgoModelHasGetter() {
		return cSharpAlgoModelHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpAlgoModelHasGetter(CSharpPropertyGetter newCSharpAlgoModelHasGetter, NotificationChain msgs) {
		CSharpPropertyGetter oldCSharpAlgoModelHasGetter = cSharpAlgoModelHasGetter;
		cSharpAlgoModelHasGetter = newCSharpAlgoModelHasGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER, oldCSharpAlgoModelHasGetter, newCSharpAlgoModelHasGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpAlgoModelHasGetter(CSharpPropertyGetter newCSharpAlgoModelHasGetter) {
		if (newCSharpAlgoModelHasGetter != cSharpAlgoModelHasGetter) {
			NotificationChain msgs = null;
			if (cSharpAlgoModelHasGetter != null)
				msgs = ((InternalEObject)cSharpAlgoModelHasGetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER, null, msgs);
			if (newCSharpAlgoModelHasGetter != null)
				msgs = ((InternalEObject)newCSharpAlgoModelHasGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER, null, msgs);
			msgs = basicSetCSharpAlgoModelHasGetter(newCSharpAlgoModelHasGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER, newCSharpAlgoModelHasGetter, newCSharpAlgoModelHasGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpPropertySetter getCSharpAlgoModelHasSetter() {
		return cSharpAlgoModelHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpAlgoModelHasSetter(CSharpPropertySetter newCSharpAlgoModelHasSetter, NotificationChain msgs) {
		CSharpPropertySetter oldCSharpAlgoModelHasSetter = cSharpAlgoModelHasSetter;
		cSharpAlgoModelHasSetter = newCSharpAlgoModelHasSetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER, oldCSharpAlgoModelHasSetter, newCSharpAlgoModelHasSetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpAlgoModelHasSetter(CSharpPropertySetter newCSharpAlgoModelHasSetter) {
		if (newCSharpAlgoModelHasSetter != cSharpAlgoModelHasSetter) {
			NotificationChain msgs = null;
			if (cSharpAlgoModelHasSetter != null)
				msgs = ((InternalEObject)cSharpAlgoModelHasSetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER, null, msgs);
			if (newCSharpAlgoModelHasSetter != null)
				msgs = ((InternalEObject)newCSharpAlgoModelHasSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER, null, msgs);
			msgs = basicSetCSharpAlgoModelHasSetter(newCSharpAlgoModelHasSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER, newCSharpAlgoModelHasSetter, newCSharpAlgoModelHasSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContractAnnotation getCSharpAlgoRModelHasDataContractAnnotation() {
		return cSharpAlgoRModelHasDataContractAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpAlgoRModelHasDataContractAnnotation(DataContractAnnotation newCSharpAlgoRModelHasDataContractAnnotation, NotificationChain msgs) {
		DataContractAnnotation oldCSharpAlgoRModelHasDataContractAnnotation = cSharpAlgoRModelHasDataContractAnnotation;
		cSharpAlgoRModelHasDataContractAnnotation = newCSharpAlgoRModelHasDataContractAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION, oldCSharpAlgoRModelHasDataContractAnnotation, newCSharpAlgoRModelHasDataContractAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpAlgoRModelHasDataContractAnnotation(DataContractAnnotation newCSharpAlgoRModelHasDataContractAnnotation) {
		if (newCSharpAlgoRModelHasDataContractAnnotation != cSharpAlgoRModelHasDataContractAnnotation) {
			NotificationChain msgs = null;
			if (cSharpAlgoRModelHasDataContractAnnotation != null)
				msgs = ((InternalEObject)cSharpAlgoRModelHasDataContractAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION, null, msgs);
			if (newCSharpAlgoRModelHasDataContractAnnotation != null)
				msgs = ((InternalEObject)newCSharpAlgoRModelHasDataContractAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION, null, msgs);
			msgs = basicSetCSharpAlgoRModelHasDataContractAnnotation(newCSharpAlgoRModelHasDataContractAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION, newCSharpAlgoRModelHasDataContractAnnotation, newCSharpAlgoRModelHasDataContractAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpAlgoResourceModel> getHasRelatedCSharpAlgoModel() {
		if (hasRelatedCSharpAlgoModel == null) {
			hasRelatedCSharpAlgoModel = new EObjectResolvingEList<CSharpAlgoResourceModel>(CSharpAlgoResourceModel.class, this, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL);
		}
		return hasRelatedCSharpAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpAlgoResourceModel> getIsRelatedCSharpAlgoModel() {
		if (isRelatedCSharpAlgoModel == null) {
			isRelatedCSharpAlgoModel = new EObjectResolvingEList<CSharpAlgoResourceModel>(CSharpAlgoResourceModel.class, this, PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL);
		}
		return isRelatedCSharpAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY:
				return basicSetCSharpAlgoModelHasProperty(null, msgs);
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER:
				return basicSetCSharpAlgoModelHasGetter(null, msgs);
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER:
				return basicSetCSharpAlgoModelHasSetter(null, msgs);
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION:
				return basicSetCSharpAlgoRModelHasDataContractAnnotation(null, msgs);
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY:
				return getCSharpAlgoModelHasProperty();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__NAME:
				return getName();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME:
				return getParentName();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER:
				return getCSharpAlgoModelHasGetter();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER:
				return getCSharpAlgoModelHasSetter();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION:
				return getCSharpAlgoRModelHasDataContractAnnotation();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				return getHasRelatedCSharpAlgoModel();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL:
				return getIsRelatedCSharpAlgoModel();
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY:
				setCSharpAlgoModelHasProperty((PSMComponentProperty)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER:
				setCSharpAlgoModelHasGetter((CSharpPropertyGetter)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER:
				setCSharpAlgoModelHasSetter((CSharpPropertySetter)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION:
				setCSharpAlgoRModelHasDataContractAnnotation((DataContractAnnotation)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				getHasRelatedCSharpAlgoModel().clear();
				getHasRelatedCSharpAlgoModel().addAll((Collection<? extends CSharpAlgoResourceModel>)newValue);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL:
				getIsRelatedCSharpAlgoModel().clear();
				getIsRelatedCSharpAlgoModel().addAll((Collection<? extends CSharpAlgoResourceModel>)newValue);
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY:
				setCSharpAlgoModelHasProperty((PSMComponentProperty)null);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER:
				setCSharpAlgoModelHasGetter((CSharpPropertyGetter)null);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER:
				setCSharpAlgoModelHasSetter((CSharpPropertySetter)null);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION:
				setCSharpAlgoRModelHasDataContractAnnotation((DataContractAnnotation)null);
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				getHasRelatedCSharpAlgoModel().clear();
				return;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL:
				getIsRelatedCSharpAlgoModel().clear();
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
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_PROPERTY:
				return cSharpAlgoModelHasProperty != null;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_GETTER:
				return cSharpAlgoModelHasGetter != null;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_MODEL_HAS_SETTER:
				return cSharpAlgoModelHasSetter != null;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__CSHARP_ALGO_RMODEL_HAS_DATA_CONTRACT_ANNOTATION:
				return cSharpAlgoRModelHasDataContractAnnotation != null;
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				return hasRelatedCSharpAlgoModel != null && !hasRelatedCSharpAlgoModel.isEmpty();
			case PSMPackage.CSHARP_ALGO_RESOURCE_MODEL__IS_RELATED_CSHARP_ALGO_MODEL:
				return isRelatedCSharpAlgoModel != null && !isRelatedCSharpAlgoModel.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CSharpAlgoResourceModelImpl
