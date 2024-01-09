/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Post Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.week18.entity.entityDsl.CustomPostType#getPostTypeName <em>Post Type Name</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.CustomPostType#getSupports <em>Supports</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.CustomPostType#getTaxonomies <em>Taxonomies</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.CustomPostType#getHooks <em>Hooks</em>}</li>
 * </ul>
 *
 * @see co7217.week18.entity.entityDsl.EntityDslPackage#getCustomPostType()
 * @model
 * @generated
 */
public interface CustomPostType extends EObject
{
  /**
   * Returns the value of the '<em><b>Post Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Type Name</em>' attribute.
   * @see #setPostTypeName(String)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getCustomPostType_PostTypeName()
   * @model
   * @generated
   */
  String getPostTypeName();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.CustomPostType#getPostTypeName <em>Post Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Type Name</em>' attribute.
   * @see #getPostTypeName()
   * @generated
   */
  void setPostTypeName(String value);

  /**
   * Returns the value of the '<em><b>Supports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supports</em>' attribute.
   * @see #setSupports(String)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getCustomPostType_Supports()
   * @model
   * @generated
   */
  String getSupports();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.CustomPostType#getSupports <em>Supports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supports</em>' attribute.
   * @see #getSupports()
   * @generated
   */
  void setSupports(String value);

  /**
   * Returns the value of the '<em><b>Taxonomies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Taxonomies</em>' attribute.
   * @see #setTaxonomies(String)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getCustomPostType_Taxonomies()
   * @model
   * @generated
   */
  String getTaxonomies();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.CustomPostType#getTaxonomies <em>Taxonomies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Taxonomies</em>' attribute.
   * @see #getTaxonomies()
   * @generated
   */
  void setTaxonomies(String value);

  /**
   * Returns the value of the '<em><b>Hooks</b></em>' containment reference list.
   * The list contents are of type {@link co7217.week18.entity.entityDsl.Hook}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hooks</em>' containment reference list.
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getCustomPostType_Hooks()
   * @model containment="true"
   * @generated
   */
  EList<Hook> getHooks();

} // CustomPostType
