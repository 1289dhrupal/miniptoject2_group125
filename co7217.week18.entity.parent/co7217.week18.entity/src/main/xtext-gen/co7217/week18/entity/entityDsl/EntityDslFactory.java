/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co7217.week18.entity.entityDsl.EntityDslPackage
 * @generated
 */
public interface EntityDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntityDslFactory eINSTANCE = co7217.week18.entity.entityDsl.impl.EntityDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Plugin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin</em>'.
   * @generated
   */
  Plugin createPlugin();

  /**
   * Returns a new object of class '<em>Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Widget</em>'.
   * @generated
   */
  Widget createWidget();

  /**
   * Returns a new object of class '<em>Setting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setting</em>'.
   * @generated
   */
  Setting createSetting();

  /**
   * Returns a new object of class '<em>Shortcode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shortcode</em>'.
   * @generated
   */
  Shortcode createShortcode();

  /**
   * Returns a new object of class '<em>Custom Post Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Post Type</em>'.
   * @generated
   */
  CustomPostType createCustomPostType();

  /**
   * Returns a new object of class '<em>Hook</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hook</em>'.
   * @generated
   */
  Hook createHook();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EntityDslPackage getEntityDslPackage();

} //EntityDslFactory
