/**
 */
package PSM.impl;

import PSM.CSharpPropertyGetter;
import PSM.CSharpPropertySetter;
import PSM.CSharpResourceModel;
import PSM.CSharpResourceModelManager;
import PSM.DataContractAnnotation;
import PSM.PSMComponentProperty;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSharp Resource Model Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CSharpResourceModelManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelManagerImpl#getHasRelatedCSharpRModel <em>Has Related CSharp RModel</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelManagerImpl#getCSharpRMManagerHasProperty <em>CSharp RM Manager Has Property</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelManagerImpl#getCSharpRMManagerHasDataAnnotation <em>CSharp RM Manager Has Data Annotation</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelManagerImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelManagerImpl#getCSharpRMManagerHasGetter <em>CSharp RM Manager Has Getter</em>}</li>
 *   <li>{@link PSM.impl.CSharpResourceModelManagerImpl#getCSharpRMManagerHasSetter <em>CSharp RM Manager Has Setter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSharpResourceModelManagerImpl extends MinimalEObjectImpl.Container implements CSharpResourceModelManager {
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
	 * The cached value of the '{@link #getHasRelatedCSharpRModel() <em>Has Related CSharp RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedCSharpRModel()
	 * @generated
	 * @ordered
	 */
	protected CSharpResourceModel hasRelatedCSharpRModel;

	/**
	 * The cached value of the '{@link #getCSharpRMManagerHasProperty() <em>CSharp RM Manager Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRMManagerHasProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty cSharpRMManagerHasProperty;

	/**
	 * The cached value of the '{@link #getCSharpRMManagerHasDataAnnotation() <em>CSharp RM Manager Has Data Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRMManagerHasDataAnnotation()
	 * @generated
	 * @ordered
	 */
	protected DataContractAnnotation cSharpRMManagerHasDataAnnotation;

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
	 * The cached value of the '{@link #getCSharpRMManagerHasGetter() <em>CSharp RM Manager Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRMManagerHasGetter()
	 * @generated
	 * @ordered
	 */
	protected CSharpPropertyGetter cSharpRMManagerHasGetter;

	/**
	 * The cached value of the '{@link #getCSharpRMManagerHasSetter() <em>CSharp RM Manager Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSharpRMManagerHasSetter()
	 * @generated
	 * @ordered
	 */
	protected CSharpPropertySetter cSharpRMManagerHasSetter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpResourceModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CSHARP_RESOURCE_MODEL_MANAGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModel getHasRelatedCSharpRModel() {
		if (hasRelatedCSharpRModel != null && hasRelatedCSharpRModel.eIsProxy()) {
			InternalEObject oldHasRelatedCSharpRModel = (InternalEObject)hasRelatedCSharpRModel;
			hasRelatedCSharpRModel = (CSharpResourceModel)eResolveProxy(oldHasRelatedCSharpRModel);
			if (hasRelatedCSharpRModel != oldHasRelatedCSharpRModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL, oldHasRelatedCSharpRModel, hasRelatedCSharpRModel));
			}
		}
		return hasRelatedCSharpRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceModel basicGetHasRelatedCSharpRModel() {
		return hasRelatedCSharpRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRelatedCSharpRModel(CSharpResourceModel newHasRelatedCSharpRModel) {
		CSharpResourceModel oldHasRelatedCSharpRModel = hasRelatedCSharpRModel;
		hasRelatedCSharpRModel = newHasRelatedCSharpRModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL, oldHasRelatedCSharpRModel, hasRelatedCSharpRModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getCSharpRMManagerHasProperty() {
		return cSharpRMManagerHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRMManagerHasProperty(PSMComponentProperty newCSharpRMManagerHasProperty, NotificationChain msgs) {
		PSMComponentProperty oldCSharpRMManagerHasProperty = cSharpRMManagerHasProperty;
		cSharpRMManagerHasProperty = newCSharpRMManagerHasProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY, oldCSharpRMManagerHasProperty, newCSharpRMManagerHasProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRMManagerHasProperty(PSMComponentProperty newCSharpRMManagerHasProperty) {
		if (newCSharpRMManagerHasProperty != cSharpRMManagerHasProperty) {
			NotificationChain msgs = null;
			if (cSharpRMManagerHasProperty != null)
				msgs = ((InternalEObject)cSharpRMManagerHasProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY, null, msgs);
			if (newCSharpRMManagerHasProperty != null)
				msgs = ((InternalEObject)newCSharpRMManagerHasProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY, null, msgs);
			msgs = basicSetCSharpRMManagerHasProperty(newCSharpRMManagerHasProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY, newCSharpRMManagerHasProperty, newCSharpRMManagerHasProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContractAnnotation getCSharpRMManagerHasDataAnnotation() {
		return cSharpRMManagerHasDataAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRMManagerHasDataAnnotation(DataContractAnnotation newCSharpRMManagerHasDataAnnotation, NotificationChain msgs) {
		DataContractAnnotation oldCSharpRMManagerHasDataAnnotation = cSharpRMManagerHasDataAnnotation;
		cSharpRMManagerHasDataAnnotation = newCSharpRMManagerHasDataAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION, oldCSharpRMManagerHasDataAnnotation, newCSharpRMManagerHasDataAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRMManagerHasDataAnnotation(DataContractAnnotation newCSharpRMManagerHasDataAnnotation) {
		if (newCSharpRMManagerHasDataAnnotation != cSharpRMManagerHasDataAnnotation) {
			NotificationChain msgs = null;
			if (cSharpRMManagerHasDataAnnotation != null)
				msgs = ((InternalEObject)cSharpRMManagerHasDataAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION, null, msgs);
			if (newCSharpRMManagerHasDataAnnotation != null)
				msgs = ((InternalEObject)newCSharpRMManagerHasDataAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION, null, msgs);
			msgs = basicSetCSharpRMManagerHasDataAnnotation(newCSharpRMManagerHasDataAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION, newCSharpRMManagerHasDataAnnotation, newCSharpRMManagerHasDataAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpPropertyGetter getCSharpRMManagerHasGetter() {
		return cSharpRMManagerHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRMManagerHasGetter(CSharpPropertyGetter newCSharpRMManagerHasGetter, NotificationChain msgs) {
		CSharpPropertyGetter oldCSharpRMManagerHasGetter = cSharpRMManagerHasGetter;
		cSharpRMManagerHasGetter = newCSharpRMManagerHasGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER, oldCSharpRMManagerHasGetter, newCSharpRMManagerHasGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRMManagerHasGetter(CSharpPropertyGetter newCSharpRMManagerHasGetter) {
		if (newCSharpRMManagerHasGetter != cSharpRMManagerHasGetter) {
			NotificationChain msgs = null;
			if (cSharpRMManagerHasGetter != null)
				msgs = ((InternalEObject)cSharpRMManagerHasGetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER, null, msgs);
			if (newCSharpRMManagerHasGetter != null)
				msgs = ((InternalEObject)newCSharpRMManagerHasGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER, null, msgs);
			msgs = basicSetCSharpRMManagerHasGetter(newCSharpRMManagerHasGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER, newCSharpRMManagerHasGetter, newCSharpRMManagerHasGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpPropertySetter getCSharpRMManagerHasSetter() {
		return cSharpRMManagerHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSharpRMManagerHasSetter(CSharpPropertySetter newCSharpRMManagerHasSetter, NotificationChain msgs) {
		CSharpPropertySetter oldCSharpRMManagerHasSetter = cSharpRMManagerHasSetter;
		cSharpRMManagerHasSetter = newCSharpRMManagerHasSetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER, oldCSharpRMManagerHasSetter, newCSharpRMManagerHasSetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSharpRMManagerHasSetter(CSharpPropertySetter newCSharpRMManagerHasSetter) {
		if (newCSharpRMManagerHasSetter != cSharpRMManagerHasSetter) {
			NotificationChain msgs = null;
			if (cSharpRMManagerHasSetter != null)
				msgs = ((InternalEObject)cSharpRMManagerHasSetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER, null, msgs);
			if (newCSharpRMManagerHasSetter != null)
				msgs = ((InternalEObject)newCSharpRMManagerHasSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER, null, msgs);
			msgs = basicSetCSharpRMManagerHasSetter(newCSharpRMManagerHasSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER, newCSharpRMManagerHasSetter, newCSharpRMManagerHasSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY:
				return basicSetCSharpRMManagerHasProperty(null, msgs);
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION:
				return basicSetCSharpRMManagerHasDataAnnotation(null, msgs);
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER:
				return basicSetCSharpRMManagerHasGetter(null, msgs);
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER:
				return basicSetCSharpRMManagerHasSetter(null, msgs);
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
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__NAME:
				return getName();
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL:
				if (resolve) return getHasRelatedCSharpRModel();
				return basicGetHasRelatedCSharpRModel();
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY:
				return getCSharpRMManagerHasProperty();
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION:
				return getCSharpRMManagerHasDataAnnotation();
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				return getParentName();
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER:
				return getCSharpRMManagerHasGetter();
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER:
				return getCSharpRMManagerHasSetter();
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
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL:
				setHasRelatedCSharpRModel((CSharpResourceModel)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY:
				setCSharpRMManagerHasProperty((PSMComponentProperty)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION:
				setCSharpRMManagerHasDataAnnotation((DataContractAnnotation)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER:
				setCSharpRMManagerHasGetter((CSharpPropertyGetter)newValue);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER:
				setCSharpRMManagerHasSetter((CSharpPropertySetter)newValue);
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
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL:
				setHasRelatedCSharpRModel((CSharpResourceModel)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY:
				setCSharpRMManagerHasProperty((PSMComponentProperty)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION:
				setCSharpRMManagerHasDataAnnotation((DataContractAnnotation)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER:
				setCSharpRMManagerHasGetter((CSharpPropertyGetter)null);
				return;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER:
				setCSharpRMManagerHasSetter((CSharpPropertySetter)null);
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
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__HAS_RELATED_CSHARP_RMODEL:
				return hasRelatedCSharpRModel != null;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_PROPERTY:
				return cSharpRMManagerHasProperty != null;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_DATA_ANNOTATION:
				return cSharpRMManagerHasDataAnnotation != null;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_GETTER:
				return cSharpRMManagerHasGetter != null;
			case PSMPackage.CSHARP_RESOURCE_MODEL_MANAGER__CSHARP_RM_MANAGER_HAS_SETTER:
				return cSharpRMManagerHasSetter != null;
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

} //CSharpResourceModelManagerImpl
