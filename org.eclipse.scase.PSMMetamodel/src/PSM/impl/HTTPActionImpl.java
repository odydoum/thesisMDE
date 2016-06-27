/**
 */
package PSM.impl;

import PSM.AttributeRoutingAnnotation;
import PSM.FunctionParameter;
import PSM.HTTPAction;
import PSM.HTTPActionHandler;
import PSM.HTTPVerb;
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
 * An implementation of the model object '<em><b>HTTP Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PSM.impl.HTTPActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionImpl#getActionHTTPVerb <em>Action HTTP Verb</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionImpl#getHTTPActionURI <em>HTTP Action URI</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionImpl#getHTTPActionHasARAnnotation <em>HTTP Action Has AR Annotation</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionImpl#getHTTPActionHasParameter <em>HTTP Action Has Parameter</em>}</li>
 *   <li>{@link PSM.impl.HTTPActionImpl#getHasHTTPActionHandler <em>Has HTTP Action Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPActionImpl extends MinimalEObjectImpl.Container implements HTTPAction {
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
	 * The default value of the '{@link #getActionHTTPVerb() <em>Action HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb ACTION_HTTP_VERB_EDEFAULT = HTTPVerb.GET;

	/**
	 * The cached value of the '{@link #getActionHTTPVerb() <em>Action HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb actionHTTPVerb = ACTION_HTTP_VERB_EDEFAULT;

	/**
	 * The default value of the '{@link #getHTTPActionURI() <em>HTTP Action URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActionURI()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_ACTION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHTTPActionURI() <em>HTTP Action URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActionURI()
	 * @generated
	 * @ordered
	 */
	protected String httpActionURI = HTTP_ACTION_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHTTPActionHasARAnnotation() <em>HTTP Action Has AR Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActionHasARAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRoutingAnnotation> httpActionHasARAnnotation;

	/**
	 * The cached value of the '{@link #getHTTPActionHasParameter() <em>HTTP Action Has Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActionHasParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionParameter> httpActionHasParameter;

	/**
	 * The cached value of the '{@link #getHasHTTPActionHandler() <em>Has HTTP Action Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHTTPActionHandler()
	 * @generated
	 * @ordered
	 */
	protected HTTPActionHandler hasHTTPActionHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PSMPackage.Literals.HTTP_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getActionHTTPVerb() {
		return actionHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionHTTPVerb(HTTPVerb newActionHTTPVerb) {
		HTTPVerb oldActionHTTPVerb = actionHTTPVerb;
		actionHTTPVerb = newActionHTTPVerb == null ? ACTION_HTTP_VERB_EDEFAULT : newActionHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION__ACTION_HTTP_VERB, oldActionHTTPVerb, actionHTTPVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHTTPActionURI() {
		return httpActionURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTTPActionURI(String newHTTPActionURI) {
		String oldHTTPActionURI = httpActionURI;
		httpActionURI = newHTTPActionURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION__HTTP_ACTION_URI, oldHTTPActionURI, httpActionURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeRoutingAnnotation> getHTTPActionHasARAnnotation() {
		if (httpActionHasARAnnotation == null) {
			httpActionHasARAnnotation = new EObjectContainmentEList<AttributeRoutingAnnotation>(AttributeRoutingAnnotation.class, this, PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION);
		}
		return httpActionHasARAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionParameter> getHTTPActionHasParameter() {
		if (httpActionHasParameter == null) {
			httpActionHasParameter = new EObjectContainmentEList<FunctionParameter>(FunctionParameter.class, this, PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER);
		}
		return httpActionHasParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActionHandler getHasHTTPActionHandler() {
		return hasHTTPActionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasHTTPActionHandler(HTTPActionHandler newHasHTTPActionHandler, NotificationChain msgs) {
		HTTPActionHandler oldHasHTTPActionHandler = hasHTTPActionHandler;
		hasHTTPActionHandler = newHasHTTPActionHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER, oldHasHTTPActionHandler, newHasHTTPActionHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHTTPActionHandler(HTTPActionHandler newHasHTTPActionHandler) {
		if (newHasHTTPActionHandler != hasHTTPActionHandler) {
			NotificationChain msgs = null;
			if (hasHTTPActionHandler != null)
				msgs = ((InternalEObject)hasHTTPActionHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER, null, msgs);
			if (newHasHTTPActionHandler != null)
				msgs = ((InternalEObject)newHasHTTPActionHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER, null, msgs);
			msgs = basicSetHasHTTPActionHandler(newHasHTTPActionHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER, newHasHTTPActionHandler, newHasHTTPActionHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION:
				return ((InternalEList<?>)getHTTPActionHasARAnnotation()).basicRemove(otherEnd, msgs);
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER:
				return ((InternalEList<?>)getHTTPActionHasParameter()).basicRemove(otherEnd, msgs);
			case PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER:
				return basicSetHasHTTPActionHandler(null, msgs);
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
			case PSMPackage.HTTP_ACTION__NAME:
				return getName();
			case PSMPackage.HTTP_ACTION__ACTION_HTTP_VERB:
				return getActionHTTPVerb();
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_URI:
				return getHTTPActionURI();
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION:
				return getHTTPActionHasARAnnotation();
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER:
				return getHTTPActionHasParameter();
			case PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER:
				return getHasHTTPActionHandler();
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
			case PSMPackage.HTTP_ACTION__NAME:
				setName((String)newValue);
				return;
			case PSMPackage.HTTP_ACTION__ACTION_HTTP_VERB:
				setActionHTTPVerb((HTTPVerb)newValue);
				return;
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_URI:
				setHTTPActionURI((String)newValue);
				return;
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION:
				getHTTPActionHasARAnnotation().clear();
				getHTTPActionHasARAnnotation().addAll((Collection<? extends AttributeRoutingAnnotation>)newValue);
				return;
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER:
				getHTTPActionHasParameter().clear();
				getHTTPActionHasParameter().addAll((Collection<? extends FunctionParameter>)newValue);
				return;
			case PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER:
				setHasHTTPActionHandler((HTTPActionHandler)newValue);
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
			case PSMPackage.HTTP_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PSMPackage.HTTP_ACTION__ACTION_HTTP_VERB:
				setActionHTTPVerb(ACTION_HTTP_VERB_EDEFAULT);
				return;
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_URI:
				setHTTPActionURI(HTTP_ACTION_URI_EDEFAULT);
				return;
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION:
				getHTTPActionHasARAnnotation().clear();
				return;
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER:
				getHTTPActionHasParameter().clear();
				return;
			case PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER:
				setHasHTTPActionHandler((HTTPActionHandler)null);
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
			case PSMPackage.HTTP_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PSMPackage.HTTP_ACTION__ACTION_HTTP_VERB:
				return actionHTTPVerb != ACTION_HTTP_VERB_EDEFAULT;
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_URI:
				return HTTP_ACTION_URI_EDEFAULT == null ? httpActionURI != null : !HTTP_ACTION_URI_EDEFAULT.equals(httpActionURI);
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_AR_ANNOTATION:
				return httpActionHasARAnnotation != null && !httpActionHasARAnnotation.isEmpty();
			case PSMPackage.HTTP_ACTION__HTTP_ACTION_HAS_PARAMETER:
				return httpActionHasParameter != null && !httpActionHasParameter.isEmpty();
			case PSMPackage.HTTP_ACTION__HAS_HTTP_ACTION_HANDLER:
				return hasHTTPActionHandler != null;
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
		result.append(", ActionHTTPVerb: ");
		result.append(actionHTTPVerb);
		result.append(", HTTPActionURI: ");
		result.append(httpActionURI);
		result.append(')');
		return result.toString();
	}

} //HTTPActionImpl
