/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.week18.entity.entityDsl.StringList#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see co7217.week18.entity.entityDsl.EntityDslPackage#getStringList()
 * @model
 * @generated
 */
public interface StringList extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getStringList_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // StringList
