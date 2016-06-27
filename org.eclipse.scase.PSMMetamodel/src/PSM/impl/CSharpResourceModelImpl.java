/**
 */
package PSM.impl;

import PSM.CSharpAlgoResourceModel;
import PSM.CSharpPropertyGetter;
import PSM.CSharpPropertySetter;
import PSM.CSharpResourceModel;
import PSM.CSharpResourceModelManager;
import PSM.DataContractAnnotation;
import PSM.EntityAnnotation;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSharp Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getHasRelatedCSharpRMManager <em>Has Related CSharp RM Manager</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getCSharpRModelHasProperty <em>CSharp RModel Has Property</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getCSharpRModelHasDataAnnotation <em>CSharp RModel Has Data Annotation</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getCSharpRModelHasEntityAnnotation <em>CSharp RModel Has Entity Annotation</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getCSharpRModelHasGetter <em>CSharp RModel Has Getter</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getCSharpRModelHasSetter <em>CSharp RModel Has Setter</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelImpl#getHasRelatedCSharpAlgoModel <em>Has Related CSharp Algo Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpResourceModelImpl extends MinimalEObjectImpl.Container implements CSharpResourceModel {
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
	 * The cached value of the '{@link #getHasRelatedCSharpRMManager() <em>Has Related CSharp RM Manager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedCSharpRMManager()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpResourceModelManager> hasRelatedCSharpRMManager;

	/**
	 * The cached value of the '{@link #getCSharpRModelHasProperty() <em>CSharp RModel Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRModelHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PSMComponentProperty> cSharpRModelHasProperty;

	/**
	 * The cached value of the '{@link #getCSharpRModelHasDataAnnotation() <em>CSharp RModel Has Data Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRModelHasDataAnnotation()
	 * @generated
	 * @ordered
	 */
	protected DataContractAnnotation cSharpRModelHasDataAnnotation;

	/**
	 * The cached value of the '{@link #getCSharpRModelHasEntityAnnotation() <em>CSharp RModel Has Entity Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRModelHasEntityAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EntityAnnotation cSharpRModelHasEntityAnnotation;

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
	 * The cached value of the '{@link #getCSharpRModelHasGetter() <em>CSharp RModel Has Getter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRModelHasGetter()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpPropertyGetter> cSharpRModelHasGetter;

	/**
	 * The cached value of the '{@link #getCSharpRModelHasSetter() <em>CSharp RModel Has Setter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRModelHasSetter()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharpPropertySetter> cSharpRModelHasSetter;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_RESOURCE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpResourceModelManager> getHasRelatedCSharpRMManager() {
		if (hasRelatedCSharpRMManager == null) {
			hasRelatedCSharpRMManager = new EObjectResolvingEList<CSharpResourceModelManager>(CSharpResourceModelManager.class, this, PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER);
		}
		return hasRelatedCSharpRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSMComponentProperty> getCSharpRModelHasProperty() {
		if (cSharpRModelHasProperty == null) {
			cSharpRModelHasProperty = new EObjectContainmentEList<PSMComponentProperty>(PSMComponentProperty.class, this, PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY);
		}
		return cSharpRModelHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContractAnnotation getCSharpRModelHasDataAnnotation() {
		return cSharpRModelHasDataAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRModelHasDataAnnotation(DataContractAnnotation newCSharpRModelHasDataAnnotation, NotificationChain msgs) {
		DataContractAnnotation oldCSharpRModelHasDataAnnotation = cSharpRModelHasDataAnnotation;
		cSharpRModelHasDataAnnotation = newCSharpRModelHasDataAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION, oldCSharpRModelHasDataAnnotation, newCSharpRModelHasDataAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRModelHasDataAnnotation(DataContractAnnotation newCSharpRModelHasDataAnnotation) {
		if (newCSharpRModelHasDataAnnotation != cSharpRModelHasDataAnnotation) {
			NotificationChain msgs = null;
			if (cSharpRModelHasDataAnnotation != null)
				msgs = ((InternalEObject)cSharpRModelHasDataAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION, null, msgs);
			if (newCSharpRModelHasDataAnnotation != null)
				msgs = ((InternalEObject)newCSharpRModelHasDataAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION, null, msgs);
			msgs = basicSetCSharpRModelHasDataAnnotation(newCSharpRModelHasDataAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION, newCSharpRModelHasDataAnnotation, newCSharpRModelHasDataAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAnnotation getCSharpRModelHasEntityAnnotation() {
		return cSharpRModelHasEntityAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRModelHasEntityAnnotation(EntityAnnotation newCSharpRModelHasEntityAnnotation, NotificationChain msgs) {
		EntityAnnotation oldCSharpRModelHasEntityAnnotation = cSharpRModelHasEntityAnnotation;
		cSharpRModelHasEntityAnnotation = newCSharpRModelHasEntityAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION, oldCSharpRModelHasEntityAnnotation, newCSharpRModelHasEntityAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRModelHasEntityAnnotation(EntityAnnotation newCSharpRModelHasEntityAnnotation) {
		if (newCSharpRModelHasEntityAnnotation != cSharpRModelHasEntityAnnotation) {
			NotificationChain msgs = null;
			if (cSharpRModelHasEntityAnnotation != null)
				msgs = ((InternalEObject)cSharpRModelHasEntityAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION, null, msgs);
			if (newCSharpRModelHasEntityAnnotation != null)
				msgs = ((InternalEObject)newCSharpRModelHasEntityAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION, null, msgs);
			msgs = basicSetCSharpRModelHasEntityAnnotation(newCSharpRModelHasEntityAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION, newCSharpRModelHasEntityAnnotation, newCSharpRModelHasEntityAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpPropertyGetter> getCSharpRModelHasGetter() {
		if (cSharpRModelHasGetter == null) {
			cSharpRModelHasGetter = new EObjectContainmentEList<CSharpPropertyGetter>(CSharpPropertyGetter.class, this, PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER);
		}
		return cSharpRModelHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpPropertySetter> getCSharpRModelHasSetter() {
		if (cSharpRModelHasSetter == null) {
			cSharpRModelHasSetter = new EObjectContainmentEList<CSharpPropertySetter>(CSharpPropertySetter.class, this, PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER);
		}
		return cSharpRModelHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharpAlgoResourceModel> getHasRelatedCSharpAlgoModel() {
		if (hasRelatedCSharpAlgoModel == null) {
			hasRelatedCSharpAlgoModel = new EObjectResolvingEList<CSharpAlgoResourceModel>(CSharpAlgoResourceModel.class, this, PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL);
		}
		return hasRelatedCSharpAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY:
				return ((InternalEList<?>)getCSharpRModelHasProperty()).basicRemove(otherEnd, msgs);
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION:
				return basicSetCSharpRModelHasDataAnnotation(null, msgs);
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION:
				return basicSetCSharpRModelHasEntityAnnotation(null, msgs);
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER:
				return ((InternalEList<?>)getCSharpRModelHasGetter()).basicRemove(otherEnd, msgs);
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER:
				return ((InternalEList<?>)getCSharpRModelHasSetter()).basicRemove(otherEnd, msgs);
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
			case PSMPackage.CSHARP_RESOURCE_MODEL__NAME:
				return getName();
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER:
				return getHasRelatedCSharpRMManager();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY:
				return getCSharpRModelHasProperty();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION:
				return getCSharpRModelHasDataAnnotation();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION:
				return getCSharpRModelHasEntityAnnotation();
			case PSMPackage.CSHARP_RESOURCE_MODEL__PARENT_NAME:
				return getParentName();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER:
				return getCSharpRModelHasGetter();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER:
				return getCSharpRModelHasSetter();
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				return getHasRelatedCSharpAlgoModel();
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
			case PSMPackage.CSHARP_RESOURCE_MODEL__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER:
				getHasRelatedCSharpRMManager().clear();
				getHasRelatedCSharpRMManager().addAll((Collection<? extends CSharpResourceModelManager>)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY:
				getCSharpRModelHasProperty().clear();
				getCSharpRModelHasProperty().addAll((Collection<? extends PSMComponentProperty>)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION:
				setCSharpRModelHasDataAnnotation((DataContractAnnotation)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION:
				setCSharpRModelHasEntityAnnotation((EntityAnnotation)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER:
				getCSharpRModelHasGetter().clear();
				getCSharpRModelHasGetter().addAll((Collection<? extends CSharpPropertyGetter>)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER:
				getCSharpRModelHasSetter().clear();
				getCSharpRModelHasSetter().addAll((Collection<? extends CSharpPropertySetter>)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				getHasRelatedCSharpAlgoModel().clear();
				getHasRelatedCSharpAlgoModel().addAll((Collection<? extends CSharpAlgoResourceModel>)newValue);
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
			case PSMPackage.CSHARP_RESOURCE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER:
				getHasRelatedCSharpRMManager().clear();
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY:
				getCSharpRModelHasProperty().clear();
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION:
				setCSharpRModelHasDataAnnotation((DataContractAnnotation)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION:
				setCSharpRModelHasEntityAnnotation((EntityAnnotation)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER:
				getCSharpRModelHasGetter().clear();
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER:
				getCSharpRModelHasSetter().clear();
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				getHasRelatedCSharpAlgoModel().clear();
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
			case PSMPackage.CSHARP_RESOURCE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_RM_MANAGER:
				return hasRelatedCSharpRMManager != null && !hasRelatedCSharpRMManager.isEmpty();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_PROPERTY:
				return cSharpRModelHasProperty != null && !cSharpRModelHasProperty.isEmpty();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_DATA_ANNOTATION:
				return cSharpRModelHasDataAnnotation != null;
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_ENTITY_ANNOTATION:
				return cSharpRModelHasEntityAnnotation != null;
			case PSMPackage.CSHARP_RESOURCE_MODEL__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_GETTER:
				return cSharpRModelHasGetter != null && !cSharpRModelHasGetter.isEmpty();
			case PSMPackage.CSHARP_RESOURCE_MODEL__CSHARP_RMODEL_HAS_SETTER:
				return cSharpRModelHasSetter != null && !cSharpRModelHasSetter.isEmpty();
			case PSMPackage.CSHARP_RESOURCE_MODEL__HAS_RELATED_CSHARP_ALGO_MODEL:
				return hasRelatedCSharpAlgoModel != null && !hasRelatedCSharpAlgoModel.isEmpty();
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

} //CSharpResourceModelImpl
