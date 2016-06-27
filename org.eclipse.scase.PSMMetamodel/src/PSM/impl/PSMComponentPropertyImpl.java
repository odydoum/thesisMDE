/**
 */
package PSM.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#getPropertyHasDataAnnotation <em>Property Has Data Annotation</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#getPropertyHasEntityAnnotation <em>Property Has Entity Annotation</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#getCorrespondingField <em>Corresponding Field</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#isBIsForeignKey <em>BIs Foreign Key</em>}</li>
 *   <li>{@link PSM.impl.PSMComponentPropertyImpl#isBIsNavigationProperty <em>BIs Navigation Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSMComponentPropertyImpl extends MinimalEObjectImpl.Container implements PSMComponentProperty {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBIsUnique() <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsUnique() <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsUnique = BIS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBIsPrimaryIdentifier() <em>BIs Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsPrimaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_PRIMARY_IDENTIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsPrimaryIdentifier() <em>BIs Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsPrimaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsPrimaryIdentifier = BIS_PRIMARY_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyHasDataAnnotation() <em>Property Has Data Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyHasDataAnnotation()
	 * @generated
	 * @ordered
	 */
	protected DataContractAnnotation propertyHasDataAnnotation;

	/**
	 * The cached value of the '{@link #getPropertyHasEntityAnnotation() <em>Property Has Entity Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyHasEntityAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAnnotation> propertyHasEntityAnnotation;

	/**
	 * The default value of the '{@link #getCorrespondingField() <em>Corresponding Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingField()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRESPONDING_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrespondingField() <em>Corresponding Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingField()
	 * @generated
	 * @ordered
	 */
	protected String correspondingField = CORRESPONDING_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #isBIsForeignKey() <em>BIs Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_FOREIGN_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsForeignKey() <em>BIs Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsForeignKey = BIS_FOREIGN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isBIsNavigationProperty() <em>BIs Navigation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsNavigationProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_NAVIGATION_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsNavigationProperty() <em>BIs Navigation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsNavigationProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsNavigationProperty = BIS_NAVIGATION_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSMComponentPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.PSM_COMPONENT_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsUnique() {
		return bIsUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsUnique(boolean newBIsUnique) {
		boolean oldBIsUnique = bIsUnique;
		bIsUnique = newBIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE, oldBIsUnique, bIsUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsPrimaryIdentifier() {
		return bIsPrimaryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsPrimaryIdentifier(boolean newBIsPrimaryIdentifier) {
		boolean oldBIsPrimaryIdentifier = bIsPrimaryIdentifier;
		bIsPrimaryIdentifier = newBIsPrimaryIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER, oldBIsPrimaryIdentifier, bIsPrimaryIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContractAnnotation getPropertyHasDataAnnotation() {
		return propertyHasDataAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyHasDataAnnotation(DataContractAnnotation newPropertyHasDataAnnotation, NotificationChain msgs) {
		DataContractAnnotation oldPropertyHasDataAnnotation = propertyHasDataAnnotation;
		propertyHasDataAnnotation = newPropertyHasDataAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION, oldPropertyHasDataAnnotation, newPropertyHasDataAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyHasDataAnnotation(DataContractAnnotation newPropertyHasDataAnnotation) {
		if (newPropertyHasDataAnnotation != propertyHasDataAnnotation) {
			NotificationChain msgs = null;
			if (propertyHasDataAnnotation != null)
				msgs = ((InternalEObject)propertyHasDataAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION, null, msgs);
			if (newPropertyHasDataAnnotation != null)
				msgs = ((InternalEObject)newPropertyHasDataAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION, null, msgs);
			msgs = basicSetPropertyHasDataAnnotation(newPropertyHasDataAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION, newPropertyHasDataAnnotation, newPropertyHasDataAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityAnnotation> getPropertyHasEntityAnnotation() {
		if (propertyHasEntityAnnotation == null) {
			propertyHasEntityAnnotation = new EObjectContainmentEList<EntityAnnotation>(EntityAnnotation.class, this, PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION);
		}
		return propertyHasEntityAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrespondingField() {
		return correspondingField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingField(String newCorrespondingField) {
		String oldCorrespondingField = correspondingField;
		correspondingField = newCorrespondingField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD, oldCorrespondingField, correspondingField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsForeignKey() {
		return bIsForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsForeignKey(boolean newBIsForeignKey) {
		boolean oldBIsForeignKey = bIsForeignKey;
		bIsForeignKey = newBIsForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY, oldBIsForeignKey, bIsForeignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsNavigationProperty() {
		return bIsNavigationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsNavigationProperty(boolean newBIsNavigationProperty) {
		boolean oldBIsNavigationProperty = bIsNavigationProperty;
		bIsNavigationProperty = newBIsNavigationProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY, oldBIsNavigationProperty, bIsNavigationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION:
				return basicSetPropertyHasDataAnnotation(null, msgs);
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION:
				return ((InternalEList<?>)getPropertyHasEntityAnnotation()).basicRemove(otherEnd, msgs);
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
			case PSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				return getName();
			case PSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				return getType();
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				return isBIsUnique();
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				return isBIsPrimaryIdentifier();
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION:
				return getPropertyHasDataAnnotation();
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION:
				return getPropertyHasEntityAnnotation();
			case PSMPackage.PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD:
				return getCorrespondingField();
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY:
				return isBIsForeignKey();
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY:
				return isBIsNavigationProperty();
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
			case PSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				setBIsUnique((Boolean)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				setBIsPrimaryIdentifier((Boolean)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION:
				setPropertyHasDataAnnotation((DataContractAnnotation)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION:
				getPropertyHasEntityAnnotation().clear();
				getPropertyHasEntityAnnotation().addAll((Collection<? extends EntityAnnotation>)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD:
				setCorrespondingField((String)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY:
				setBIsForeignKey((Boolean)newValue);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY:
				setBIsNavigationProperty((Boolean)newValue);
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
			case PSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				setBIsUnique(BIS_UNIQUE_EDEFAULT);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				setBIsPrimaryIdentifier(BIS_PRIMARY_IDENTIFIER_EDEFAULT);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION:
				setPropertyHasDataAnnotation((DataContractAnnotation)null);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION:
				getPropertyHasEntityAnnotation().clear();
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD:
				setCorrespondingField(CORRESPONDING_FIELD_EDEFAULT);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY:
				setBIsForeignKey(BIS_FOREIGN_KEY_EDEFAULT);
				return;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY:
				setBIsNavigationProperty(BIS_NAVIGATION_PROPERTY_EDEFAULT);
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
			case PSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				return bIsUnique != BIS_UNIQUE_EDEFAULT;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				return bIsPrimaryIdentifier != BIS_PRIMARY_IDENTIFIER_EDEFAULT;
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_DATA_ANNOTATION:
				return propertyHasDataAnnotation != null;
			case PSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_ENTITY_ANNOTATION:
				return propertyHasEntityAnnotation != null && !propertyHasEntityAnnotation.isEmpty();
			case PSMPackage.PSM_COMPONENT_PROPERTY__CORRESPONDING_FIELD:
				return CORRESPONDING_FIELD_EDEFAULT == null ? correspondingField != null : !CORRESPONDING_FIELD_EDEFAULT.equals(correspondingField);
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_FOREIGN_KEY:
				return bIsForeignKey != BIS_FOREIGN_KEY_EDEFAULT;
			case PSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAVIGATION_PROPERTY:
				return bIsNavigationProperty != BIS_NAVIGATION_PROPERTY_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", bIsUnique: ");
		result.append(bIsUnique);
		result.append(", bIsPrimaryIdentifier: ");
		result.append(bIsPrimaryIdentifier);
		result.append(", correspondingField: ");
		result.append(correspondingField);
		result.append(", bIsForeignKey: ");
		result.append(bIsForeignKey);
		result.append(", bIsNavigationProperty: ");
		result.append(bIsNavigationProperty);
		result.append(')');
		return result.toString();
	}

} //PSMComponentPropertyImpl
