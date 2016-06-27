/**
 */
package PSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.FunctionParameter#getName <em>Name</em>}</li>
 *   <li>{@link PSM.FunctionParameter#getType <em>Type</em>}</li>
 *   <li>{@link PSM.FunctionParameter#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link PSM.FunctionParameter#isBIsReturnParameter <em>BIs Return Parameter</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getFunctionParameter()
 * @model
 * @generated
 */
public interface FunctionParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see PSM.PSMPackage#getFunctionParameter_Name()
	 * @model unsettable="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.FunctionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link PSM.FunctionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link PSM.FunctionParameter#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see PSM.PSMPackage#getFunctionParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link PSM.FunctionParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>BIs Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Unique</em>' attribute.
	 * @see #setBIsUnique(boolean)
	 * @see PSM.PSMPackage#getFunctionParameter_BIsUnique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBIsUnique();

	/**
	 * Sets the value of the '{@link PSM.FunctionParameter#isBIsUnique <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Unique</em>' attribute.
	 * @see #isBIsUnique()
	 * @generated
	 */
	void setBIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>BIs Return Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Return Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Return Parameter</em>' attribute.
	 * @see #setBIsReturnParameter(boolean)
	 * @see PSM.PSMPackage#getFunctionParameter_BIsReturnParameter()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsReturnParameter();

	/**
	 * Sets the value of the '{@link PSM.FunctionParameter#isBIsReturnParameter <em>BIs Return Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Return Parameter</em>' attribute.
	 * @see #isBIsReturnParameter()
	 * @generated
	 */
	void setBIsReturnParameter(boolean value);

} // FunctionParameter
