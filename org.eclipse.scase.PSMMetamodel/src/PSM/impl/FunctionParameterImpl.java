/**
 */
package PSM.impl;

import PSM.FunctionParameter;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.FunctionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.FunctionParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link PSM.impl.FunctionParameterImpl#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link PSM.impl.FunctionParameterImpl#isBIsReturnParameter <em>BIs Return Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionParameterImpl extends MinimalEObjectImpl.Container implements FunctionParameter {
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * The default value of the '{@link #isBIsReturnParameter() <em>BIs Return Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsReturnParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_RETURN_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsReturnParameter() <em>BIs Return Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsReturnParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsReturnParameter = BIS_RETURN_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.FUNCTION_PARAMETER;
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.FUNCTION_PARAMETER__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PSMPackage.FUNCTION_PARAMETER__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.FUNCTION_PARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.FUNCTION_PARAMETER__BIS_UNIQUE, oldBIsUnique, bIsUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsReturnParameter() {
		return bIsReturnParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsReturnParameter(boolean newBIsReturnParameter) {
		boolean oldBIsReturnParameter = bIsReturnParameter;
		bIsReturnParameter = newBIsReturnParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER, oldBIsReturnParameter, bIsReturnParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.FUNCTION_PARAMETER__NAME:
				return getName();
			case PSMPackage.FUNCTION_PARAMETER__TYPE:
				return getType();
			case PSMPackage.FUNCTION_PARAMETER__BIS_UNIQUE:
				return isBIsUnique();
			case PSMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				return isBIsReturnParameter();
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
			case PSMPackage.FUNCTION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.FUNCTION_PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case PSMPackage.FUNCTION_PARAMETER__BIS_UNIQUE:
				setBIsUnique((Boolean)newValue);
				return;
			case PSMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				setBIsReturnParameter((Boolean)newValue);
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
			case PSMPackage.FUNCTION_PARAMETER__NAME:
				unsetName();
				return;
			case PSMPackage.FUNCTION_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PSMPackage.FUNCTION_PARAMETER__BIS_UNIQUE:
				setBIsUnique(BIS_UNIQUE_EDEFAULT);
				return;
			case PSMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				setBIsReturnParameter(BIS_RETURN_PARAMETER_EDEFAULT);
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
			case PSMPackage.FUNCTION_PARAMETER__NAME:
				return isSetName();
			case PSMPackage.FUNCTION_PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PSMPackage.FUNCTION_PARAMETER__BIS_UNIQUE:
				return bIsUnique != BIS_UNIQUE_EDEFAULT;
			case PSMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				return bIsReturnParameter != BIS_RETURN_PARAMETER_EDEFAULT;
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
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", bIsUnique: ");
		result.append(bIsUnique);
		result.append(", bIsReturnParameter: ");
		result.append(bIsReturnParameter);
		result.append(')');
		return result.toString();
	}

} //FunctionParameterImpl
