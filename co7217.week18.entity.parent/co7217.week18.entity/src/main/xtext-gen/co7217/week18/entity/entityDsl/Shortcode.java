/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shortcode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.week18.entity.entityDsl.Shortcode#getShortcodeName <em>Shortcode Name</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.Shortcode#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see co7217.week18.entity.entityDsl.EntityDslPackage#getShortcode()
 * @model
 * @generated
 */
public interface Shortcode extends Element
{
  /**
   * Returns the value of the '<em><b>Shortcode Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shortcode Name</em>' attribute.
   * @see #setShortcodeName(String)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getShortcode_ShortcodeName()
   * @model
   * @generated
   */
  String getShortcodeName();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.Shortcode#getShortcodeName <em>Shortcode Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shortcode Name</em>' attribute.
   * @see #getShortcodeName()
   * @generated
   */
  void setShortcodeName(String value);

  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
   * The list contents are of type {@link co7217.week18.entity.entityDsl.Setting}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference list.
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getShortcode_Settings()
   * @model containment="true"
   * @generated
   */
  EList<Setting> getSettings();

} // Shortcode
