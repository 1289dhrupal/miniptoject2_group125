/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.week18.entity.entityDsl.Hook#getHookType <em>Hook Type</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.Hook#getHookName <em>Hook Name</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.Hook#getCallback <em>Callback</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.Hook#getPriority <em>Priority</em>}</li>
 *   <li>{@link co7217.week18.entity.entityDsl.Hook#getAcceptedArgs <em>Accepted Args</em>}</li>
 * </ul>
 *
 * @see co7217.week18.entity.entityDsl.EntityDslPackage#getHook()
 * @model
 * @generated
 */
public interface Hook extends EObject
{
  /**
   * Returns the value of the '<em><b>Hook Type</b></em>' attribute.
   * The literals are from the enumeration {@link co7217.week18.entity.entityDsl.HookType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hook Type</em>' attribute.
   * @see co7217.week18.entity.entityDsl.HookType
   * @see #setHookType(HookType)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getHook_HookType()
   * @model
   * @generated
   */
  HookType getHookType();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.Hook#getHookType <em>Hook Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hook Type</em>' attribute.
   * @see co7217.week18.entity.entityDsl.HookType
   * @see #getHookType()
   * @generated
   */
  void setHookType(HookType value);

  /**
   * Returns the value of the '<em><b>Hook Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hook Name</em>' attribute.
   * @see #setHookName(String)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getHook_HookName()
   * @model
   * @generated
   */
  String getHookName();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.Hook#getHookName <em>Hook Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hook Name</em>' attribute.
   * @see #getHookName()
   * @generated
   */
  void setHookName(String value);

  /**
   * Returns the value of the '<em><b>Callback</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callback</em>' attribute.
   * @see #setCallback(String)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getHook_Callback()
   * @model
   * @generated
   */
  String getCallback();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.Hook#getCallback <em>Callback</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callback</em>' attribute.
   * @see #getCallback()
   * @generated
   */
  void setCallback(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getHook_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.Hook#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

  /**
   * Returns the value of the '<em><b>Accepted Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accepted Args</em>' attribute.
   * @see #setAcceptedArgs(int)
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#getHook_AcceptedArgs()
   * @model
   * @generated
   */
  int getAcceptedArgs();

  /**
   * Sets the value of the '{@link co7217.week18.entity.entityDsl.Hook#getAcceptedArgs <em>Accepted Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accepted Args</em>' attribute.
   * @see #getAcceptedArgs()
   * @generated
   */
  void setAcceptedArgs(int value);

} // Hook
