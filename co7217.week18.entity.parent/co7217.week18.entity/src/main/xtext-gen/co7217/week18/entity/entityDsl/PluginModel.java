/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.week18.entity.entityDsl.PluginModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see co7217.week18.entity.entityDsl.EntityDslPackage#getPluginModel()
 * @model
 * @generated
 */
public interface PluginModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link co7217.week18.entity.entityDsl.Element}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getPluginModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // PluginModel