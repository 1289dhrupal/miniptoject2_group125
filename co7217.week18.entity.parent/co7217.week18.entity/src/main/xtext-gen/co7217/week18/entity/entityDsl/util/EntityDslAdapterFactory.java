/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl.util;

import co7217.week18.entity.entityDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co7217.week18.entity.entityDsl.EntityDslPackage
 * @generated
 */
public class EntityDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EntityDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EntityDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityDslSwitch<Adapter> modelSwitch =
    new EntityDslSwitch<Adapter>()
    {
      @Override
      public Adapter casePlugin(Plugin object)
      {
        return createPluginAdapter();
      }
      @Override
      public Adapter caseWidget(Widget object)
      {
        return createWidgetAdapter();
      }
      @Override
      public Adapter caseSetting(Setting object)
      {
        return createSettingAdapter();
      }
      @Override
      public Adapter caseShortcode(Shortcode object)
      {
        return createShortcodeAdapter();
      }
      @Override
      public Adapter caseCustomPostType(CustomPostType object)
      {
        return createCustomPostTypeAdapter();
      }
      @Override
      public Adapter caseHook(Hook object)
      {
        return createHookAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link co7217.week18.entity.entityDsl.Plugin <em>Plugin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co7217.week18.entity.entityDsl.Plugin
   * @generated
   */
  public Adapter createPluginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co7217.week18.entity.entityDsl.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co7217.week18.entity.entityDsl.Widget
   * @generated
   */
  public Adapter createWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co7217.week18.entity.entityDsl.Setting <em>Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co7217.week18.entity.entityDsl.Setting
   * @generated
   */
  public Adapter createSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co7217.week18.entity.entityDsl.Shortcode <em>Shortcode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co7217.week18.entity.entityDsl.Shortcode
   * @generated
   */
  public Adapter createShortcodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co7217.week18.entity.entityDsl.CustomPostType <em>Custom Post Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co7217.week18.entity.entityDsl.CustomPostType
   * @generated
   */
  public Adapter createCustomPostTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co7217.week18.entity.entityDsl.Hook <em>Hook</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co7217.week18.entity.entityDsl.Hook
   * @generated
   */
  public Adapter createHookAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EntityDslAdapterFactory
