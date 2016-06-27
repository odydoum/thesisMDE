/**
 */
package PSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSharp Property Getter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.CSharpPropertyGetter#getGetsProperty <em>Gets Property</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getCSharpPropertyGetter()
 * @model
 * @generated
 */
public interface CSharpPropertyGetter extends CSharpPropertyAccessor {
	/**
	 * Returns the value of the '<em><b>Gets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gets Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gets Property</em>' reference.
	 * @see #setGetsProperty(PSMComponentProperty)
	 * @see PSM.PSMPackage#getCSharpPropertyGetter_GetsProperty()
	 * @model required="true"
	 * @generated
	 */
	PSMComponentProperty getGetsProperty();

	/**
	 * Sets the value of the '{@link PSM.CSharpPropertyGetter#getGetsProperty <em>Gets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gets Property</em>' reference.
	 * @see #getGetsProperty()
	 * @generated
	 */
	void setGetsProperty(PSMComponentProperty value);

} // CSharpPropertyGetter
