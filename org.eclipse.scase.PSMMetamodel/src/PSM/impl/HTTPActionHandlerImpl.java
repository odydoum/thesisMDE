/**
 */
package PSM.impl;

import PSM.CreateHypermediaFunction;
import PSM.EntityActivity;
import PSM.HTTPActionHandler;
import PSM.HTTPVerb;
import PSM.PSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP Action Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.HTTPActionHandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionHandlerImpl#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionHandlerImpl#getUsesEntityActivity <em>Uses Entity Activity</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionHandlerImpl#getHasHypermediaFunction <em>Has Hypermedia Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPActionHandlerImpl extends MinimalEObjectImpl.Container implements HTTPActionHandler {
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
	 * The default value of the '{@link #getHandlerHTTPVerb() <em>Handler HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb HANDLER_HTTP_VERB_EDEFAULT = HTTPVerb.GET;

	/**
	 * The cached value of the '{@link #getHandlerHTTPVerb() <em>Handler HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb handlerHTTPVerb = HANDLER_HTTP_VERB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsesEntityActivity() <em>Uses Entity Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEntityActivity()
	 * @generated
	 * @ordered
	 */
	protected EntityActivity usesEntityActivity;

	/**
	 * The cached value of the '{@link #getHasHypermediaFunction() <em>Has Hypermedia Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHypermediaFunction()
	 * @generated
	 * @ordered
	 */
	protected CreateHypermediaFunction hasHypermediaFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPActionHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.HTTP_ACTION_HANDLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION_HANDLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getHandlerHTTPVerb() {
		return handlerHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerHTTPVerb(HTTPVerb newHandlerHTTPVerb) {
		HTTPVerb oldHandlerHTTPVerb = handlerHTTPVerb;
		handlerHTTPVerb = newHandlerHTTPVerb == null ? HANDLER_HTTP_VERB_EDEFAULT : newHandlerHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB, oldHandlerHTTPVerb, handlerHTTPVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityActivity getUsesEntityActivity() {
		if (usesEntityActivity != null && usesEntityActivity.eIsProxy()) {
			InternalEObject oldUsesEntityActivity = (InternalEObject)usesEntityActivity;
			usesEntityActivity = (EntityActivity)eResolveProxy(oldUsesEntityActivity);
			if (usesEntityActivity != oldUsesEntityActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PSMPackage.HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY, oldUsesEntityActivity, usesEntityActivity));
			}
		}
		return usesEntityActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityActivity basicGetUsesEntityActivity() {
		return usesEntityActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesEntityActivity(EntityActivity newUsesEntityActivity) {
		EntityActivity oldUsesEntityActivity = usesEntityActivity;
		usesEntityActivity = newUsesEntityActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY, oldUsesEntityActivity, usesEntityActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateHypermediaFunction getHasHypermediaFunction() {
		return hasHypermediaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasHypermediaFunction(CreateHypermediaFunction newHasHypermediaFunction, NotificationChain msgs) {
		CreateHypermediaFunction oldHasHypermediaFunction = hasHypermediaFunction;
		hasHypermediaFunction = newHasHypermediaFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION, oldHasHypermediaFunction, newHasHypermediaFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHypermediaFunction(CreateHypermediaFunction newHasHypermediaFunction) {
		if (newHasHypermediaFunction != hasHypermediaFunction) {
			NotificationChain msgs = null;
			if (hasHypermediaFunction != null)
				msgs = ((InternalEObject)hasHypermediaFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION, null, msgs);
			if (newHasHypermediaFunction != null)
				msgs = ((InternalEObject)newHasHypermediaFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION, null, msgs);
			msgs = basicSetHasHypermediaFunction(newHasHypermediaFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION, newHasHypermediaFunction, newHasHypermediaFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return basicSetHasHypermediaFunction(null, msgs);
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
			case PSMPackage.HTTP_ACTION_HANDLER__NAME:
				return getName();
			case PSMPackage.HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB:
				return getHandlerHTTPVerb();
			case PSMPackage.HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY:
				if (resolve) return getUsesEntityActivity();
				return basicGetUsesEntityActivity();
			case PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return getHasHypermediaFunction();
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
			case PSMPackage.HTTP_ACTION_HANDLER__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB:
				setHandlerHTTPVerb((HTTPVerb)newValue);
				return;
			case PSMPackage.HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY:
				setUsesEntityActivity((EntityActivity)newValue);
				return;
			case PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				setHasHypermediaFunction((CreateHypermediaFunction)newValue);
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
			case PSMPackage.HTTP_ACTION_HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB:
				setHandlerHTTPVerb(HANDLER_HTTP_VERB_EDEFAULT);
				return;
			case PSMPackage.HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY:
				setUsesEntityActivity((EntityActivity)null);
				return;
			case PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				setHasHypermediaFunction((CreateHypermediaFunction)null);
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
			case PSMPackage.HTTP_ACTION_HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.HTTP_ACTION_HANDLER__HANDLER_HTTP_VERB:
				return handlerHTTPVerb != HANDLER_HTTP_VERB_EDEFAULT;
			case PSMPackage.HTTP_ACTION_HANDLER__USES_ENTITY_ACTIVITY:
				return usesEntityActivity != null;
			case PSMPackage.HTTP_ACTION_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return hasHypermediaFunction != null;
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
		result.append(", HandlerHTTPVerb: ");
		result.append(handlerHTTPVerb);
		result.append(')');
		return result.toString();
	}

} //HTTPActionHandlerImpl
