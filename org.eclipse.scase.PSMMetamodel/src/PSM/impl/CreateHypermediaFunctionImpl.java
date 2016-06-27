/**
 */
package PSM.impl;

import PSM.CreateHypermediaFunction;
import PSM.PSMHypermediaLink;
import PSM.PSMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Hypermedia Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.CreateHypermediaFunctionImpl#getHasPSMHypermediaLink <em>Has PSM Hypermedia Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateHypermediaFunctionImpl extends MinimalEObjectImpl.Container implements CreateHypermediaFunction {
	/**
	 * The cached value of the '{@link #getHasPSMHypermediaLink() <em>Has PSM Hypermedia Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPSMHypermediaLink()
	 * @generated
	 * @ordered
	 */
	protected EList<PSMHypermediaLink> hasPSMHypermediaLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateHypermediaFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.CREATE_HYPERMEDIA_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSMHypermediaLink> getHasPSMHypermediaLink() {
		if (hasPSMHypermediaLink == null) {
			hasPSMHypermediaLink = new EObjectContainmentEList<PSMHypermediaLink>(PSMHypermediaLink.class, this, PSMPackage.CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK);
		}
		return hasPSMHypermediaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK:
				return ((InternalEList<?>)getHasPSMHypermediaLink()).basicRemove(otherEnd, msgs);
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
			case PSMPackage.CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK:
				return getHasPSMHypermediaLink();
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
			case PSMPackage.CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK:
				getHasPSMHypermediaLink().clear();
				getHasPSMHypermediaLink().addAll((Collection<? extends PSMHypermediaLink>)newValue);
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
			case PSMPackage.CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK:
				getHasPSMHypermediaLink().clear();
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
			case PSMPackage.CREATE_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK:
				return hasPSMHypermediaLink != null && !hasPSMHypermediaLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CreateHypermediaFunctionImpl
