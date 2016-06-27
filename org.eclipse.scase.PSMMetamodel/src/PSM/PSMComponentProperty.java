/**
 */
package PSM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PSM.PSMComponentProperty#getName <em>Name</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#getType <em>Type</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#getPropertyHasDataAnnotation <em>Property Has Data Annotation</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#getPropertyHasEntityAnnotation <em>Property Has Entity Annotation</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#getCorrespondingField <em>Corresponding Field</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#isBIsForeignKey <em>BIs Foreign Key</em>}</li>
 *   <li>{@link PSM.PSMComponentProperty#isBIsNavigationProperty <em>BIs Navigation Property</em>}</li>
 * </ul>
 *
 * @see PSM.PSMPackage#getPSMComponentProperty()
 * @model
 * @generated
 */
public interface PSMComponentProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PSM.PSMPackage#getPSMComponentProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see PSM.PSMPackage#getPSMComponentProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Unique</em>' attribute.
	 * @see #setBIsUnique(boolean)
	 * @see PSM.PSMPackage#getPSMComponentProperty_BIsUnique()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isBIsUnique();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#isBIsUnique <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Unique</em>' attribute.
	 * @see #isBIsUnique()
	 * @generated
	 */
	void setBIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>BIs Primary Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Primary Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Primary Identifier</em>' attribute.
	 * @see #setBIsPrimaryIdentifier(boolean)
	 * @see PSM.PSMPackage#getPSMComponentProperty_BIsPrimaryIdentifier()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isBIsPrimaryIdentifier();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Primary Identifier</em>' attribute.
	 * @see #isBIsPrimaryIdentifier()
	 * @generated
	 */
	void setBIsPrimaryIdentifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Has Data Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Has Data Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Has Data Annotation</em>' containment reference.
	 * @see #setPropertyHasDataAnnotation(DataContractAnnotation)
	 * @see PSM.PSMPackage#getPSMComponentProperty_PropertyHasDataAnnotation()
	 * @model containment="true"
	 * @generated
	 */
	DataContractAnnotation getPropertyHasDataAnnotation();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#getPropertyHasDataAnnotation <em>Property Has Data Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Has Data Annotation</em>' containment reference.
	 * @see #getPropertyHasDataAnnotation()
	 * @generated
	 */
	void setPropertyHasDataAnnotation(DataContractAnnotation value);

	/**
	 * Returns the value of the '<em><b>Property Has Entity Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link PSM.EntityAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Has Entity Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Has Entity Annotation</em>' containment reference list.
	 * @see PSM.PSMPackage#getPSMComponentProperty_PropertyHasEntityAnnotation()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<EntityAnnotation> getPropertyHasEntityAnnotation();

	/**
	 * Returns the value of the '<em><b>Corresponding Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Field</em>' attribute.
	 * @see #setCorrespondingField(String)
	 * @see PSM.PSMPackage#getPSMComponentProperty_CorrespondingField()
	 * @model required="true"
	 * @generated
	 */
	String getCorrespondingField();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#getCorrespondingField <em>Corresponding Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Field</em>' attribute.
	 * @see #getCorrespondingField()
	 * @generated
	 */
	void setCorrespondingField(String value);

	/**
	 * Returns the value of the '<em><b>BIs Foreign Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Foreign Key</em>' attribute.
	 * @see #setBIsForeignKey(boolean)
	 * @see PSM.PSMPackage#getPSMComponentProperty_BIsForeignKey()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBIsForeignKey();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#isBIsForeignKey <em>BIs Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Foreign Key</em>' attribute.
	 * @see #isBIsForeignKey()
	 * @generated
	 */
	void setBIsForeignKey(boolean value);

	/**
	 * Returns the value of the '<em><b>BIs Navigation Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Navigation Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Navigation Property</em>' attribute.
	 * @see #setBIsNavigationProperty(boolean)
	 * @see PSM.PSMPackage#getPSMComponentProperty_BIsNavigationProperty()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBIsNavigationProperty();

	/**
	 * Sets the value of the '{@link PSM.PSMComponentProperty#isBIsNavigationProperty <em>BIs Navigation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Navigation Property</em>' attribute.
	 * @see #isBIsNavigationProperty()
	 * @generated
	 */
	void setBIsNavigationProperty(boolean value);

} // PSMComponentProperty
