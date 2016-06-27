/**
 */
package PSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSharp Property Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.CSharpPropertySetter#getSetsProperty <em>Sets Property</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getCSharpPropertySetter()
 * @model
 * @generated
 */
public interface CSharpPropertySetter extends CSharpPropertyAccessor {
	/**
	 * Returns the value of the '<em><b>Sets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets Property</em>' reference.
	 * @see #setSetsProperty(PSMComponentProperty)
	 * @see PSM.PSMPackage#getCSharpPropertySetter_SetsProperty()
	 * @model required="true"
	 * @generated
	 */
	PSMComponentProperty getSetsProperty();

	/**
	 * Sets the value of the '{@link PSM.CSharpPropertySetter#getSetsProperty <em>Sets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sets Property</em>' reference.
	 * @see #getSetsProperty()
	 * @generated
	 */
	void setSetsProperty(PSMComponentProperty value);

} // CSharpPropertySetter
