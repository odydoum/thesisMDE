/**
 */
package PSM.impl;

import PSM.CSharpAlgoResourceController;
import PSM.CSharpResourceController;
import PSM.CSharpResourceManagerController;
import PSM.HTTPVerb;
import PSM.LinkType;
import PSM.PSMHypermediaLink;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypermedia Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.PSMHypermediaLinkImpl#getLinkHTTPVerb <em>Link HTTP Verb</em>}</li>
 *   <li>{@link PSM.impl.PSMHypermediaLinkImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link PSM.impl.PSMHypermediaLinkImpl#getHasTargetCSharpRController <em>Has Target CSharp RController</em>}</li>
 *   <li>{@link PSM.impl.PSMHypermediaLinkImpl#getHasTargetCSharpRMController <em>Has Target CSharp RM Controller</em>}</li>
 *   <li>{@link PSM.impl.PSMHypermediaLinkImpl#getHasTargetCSharpAlgoRController <em>Has Target CSharp Algo RController</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSMHypermediaLinkImpl extends MinimalEObjectImpl.Container implements PSMHypermediaLink {
	/**
	 * The default value of the '{@link #getLinkHTTPVerb() <em>Link HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb LINK_HTTP_VERB_EDEFAULT = HTTPVerb.GET;

	/**
	 * The cached value of the '{@link #getLinkHTTPVerb() <em>Link HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb linkHTTPVerb = LINK_HTTP_VERB_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final LinkType LINK_TYPE_EDEFAULT = LinkType.CHILD;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected LinkType linkType = LINK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasTargetCSharpRController() <em>Has Target CSharp RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetCSharpRController()
	 * @generated
	 * @ordered
	 */
	protected CSharpResourceController hasTargetCSharpRController;

	/**
	 * The cached value of the '{@link #getHasTargetCSharpRMController() <em>Has Target CSharp RM Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetCSharpRMController()
	 * @generated
	 * @ordered
	 */
	protected CSharpResourceManagerController hasTargetCSharpRMController;

	/**
	 * The cached value of the '{@link #getHasTargetCSharpAlgoRController() <em>Has Target CSharp Algo RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetCSharpAlgoRController()
	 * @generated
	 * @ordered
	 */
	protected CSharpAlgoResourceController hasTargetCSharpAlgoRController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSMHypermediaLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.PSM_HYPERMEDIA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getLinkHTTPVerb() {
		return linkHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkHTTPVerb(HTTPVerb newLinkHTTPVerb) {
		HTTPVerb oldLinkHTTPVerb = linkHTTPVerb;
		linkHTTPVerb = newLinkHTTPVerb == null ? LINK_HTTP_VERB_EDEFAULT : newLinkHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB, oldLinkHTTPVerb, linkHTTPVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkType(LinkType newLinkType) {
		LinkType oldLinkType = linkType;
		linkType = newLinkType == null ? LINK_TYPE_EDEFAULT : newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE, oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceController getHasTargetCSharpRController() {
		if (hasTargetCSharpRController != null && hasTargetCSharpRController.eIsProxy()) {
			InternalEObject oldHasTargetCSharpRController = (InternalEObject)hasTargetCSharpRController;
			hasTargetCSharpRController = (CSharpResourceController)eResolveProxy(oldHasTargetCSharpRController);
			if (hasTargetCSharpRController != oldHasTargetCSharpRController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER, oldHasTargetCSharpRController, hasTargetCSharpRController));
			}
		}
		return hasTargetCSharpRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceController basicGetHasTargetCSharpRController() {
		return hasTargetCSharpRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetCSharpRController(CSharpResourceController newHasTargetCSharpRController) {
		CSharpResourceController oldHasTargetCSharpRController = hasTargetCSharpRController;
		hasTargetCSharpRController = newHasTargetCSharpRController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER, oldHasTargetCSharpRController, hasTargetCSharpRController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceManagerController getHasTargetCSharpRMController() {
		if (hasTargetCSharpRMController != null && hasTargetCSharpRMController.eIsProxy()) {
			InternalEObject oldHasTargetCSharpRMController = (InternalEObject)hasTargetCSharpRMController;
			hasTargetCSharpRMController = (CSharpResourceManagerController)eResolveProxy(oldHasTargetCSharpRMController);
			if (hasTargetCSharpRMController != oldHasTargetCSharpRMController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER, oldHasTargetCSharpRMController, hasTargetCSharpRMController));
			}
		}
		return hasTargetCSharpRMController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpResourceManagerController basicGetHasTargetCSharpRMController() {
		return hasTargetCSharpRMController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetCSharpRMController(CSharpResourceManagerController newHasTargetCSharpRMController) {
		CSharpResourceManagerController oldHasTargetCSharpRMController = hasTargetCSharpRMController;
		hasTargetCSharpRMController = newHasTargetCSharpRMController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER, oldHasTargetCSharpRMController, hasTargetCSharpRMController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpAlgoResourceController getHasTargetCSharpAlgoRController() {
		if (hasTargetCSharpAlgoRController != null && hasTargetCSharpAlgoRController.eIsProxy()) {
			InternalEObject oldHasTargetCSharpAlgoRController = (InternalEObject)hasTargetCSharpAlgoRController;
			hasTargetCSharpAlgoRController = (CSharpAlgoResourceController)eResolveProxy(oldHasTargetCSharpAlgoRController);
			if (hasTargetCSharpAlgoRController != oldHasTargetCSharpAlgoRController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER, oldHasTargetCSharpAlgoRController, hasTargetCSharpAlgoRController));
			}
		}
		return hasTargetCSharpAlgoRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpAlgoResourceController basicGetHasTargetCSharpAlgoRController() {
		return hasTargetCSharpAlgoRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetCSharpAlgoRController(CSharpAlgoResourceController newHasTargetCSharpAlgoRController) {
		CSharpAlgoResourceController oldHasTargetCSharpAlgoRController = hasTargetCSharpAlgoRController;
		hasTargetCSharpAlgoRController = newHasTargetCSharpAlgoRController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER, oldHasTargetCSharpAlgoRController, hasTargetCSharpAlgoRController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				return getLinkHTTPVerb();
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				return getLinkType();
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER:
				if (resolve) return getHasTargetCSharpRController();
				return basicGetHasTargetCSharpRController();
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER:
				if (resolve) return getHasTargetCSharpRMController();
				return basicGetHasTargetCSharpRMController();
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER:
				if (resolve) return getHasTargetCSharpAlgoRController();
				return basicGetHasTargetCSharpAlgoRController();
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
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				setLinkHTTPVerb((HTTPVerb)newValue);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				setLinkType((LinkType)newValue);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER:
				setHasTargetCSharpRController((CSharpResourceController)newValue);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER:
				setHasTargetCSharpRMController((CSharpResourceManagerController)newValue);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER:
				setHasTargetCSharpAlgoRController((CSharpAlgoResourceController)newValue);
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
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				setLinkHTTPVerb(LINK_HTTP_VERB_EDEFAULT);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				setLinkType(LINK_TYPE_EDEFAULT);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER:
				setHasTargetCSharpRController((CSharpResourceController)null);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER:
				setHasTargetCSharpRMController((CSharpResourceManagerController)null);
				return;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER:
				setHasTargetCSharpAlgoRController((CSharpAlgoResourceController)null);
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
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				return linkHTTPVerb != LINK_HTTP_VERB_EDEFAULT;
			case PSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				return linkType != LINK_TYPE_EDEFAULT;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RCONTROLLER:
				return hasTargetCSharpRController != null;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_RM_CONTROLLER:
				return hasTargetCSharpRMController != null;
			case PSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_CSHARP_ALGO_RCONTROLLER:
				return hasTargetCSharpAlgoRController != null;
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
		result.append(" (linkHTTPVerb: ");
		result.append(linkHTTPVerb);
		result.append(", linkType: ");
		result.append(linkType);
		result.append(')');
		return result.toString();
	}

} //PSMHypermediaLinkImpl
