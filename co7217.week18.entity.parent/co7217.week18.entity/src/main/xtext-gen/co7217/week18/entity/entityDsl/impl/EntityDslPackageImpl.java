/**
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.entityDsl.impl;

import co7217.week18.entity.entityDsl.CustomPostType;
import co7217.week18.entity.entityDsl.EntityDslFactory;
import co7217.week18.entity.entityDsl.EntityDslPackage;
import co7217.week18.entity.entityDsl.Hook;
import co7217.week18.entity.entityDsl.HookType;
import co7217.week18.entity.entityDsl.Plugin;
import co7217.week18.entity.entityDsl.Setting;
import co7217.week18.entity.entityDsl.Shortcode;
import co7217.week18.entity.entityDsl.Widget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityDslPackageImpl extends EPackageImpl implements EntityDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortcodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customPostTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass settingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hookEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum hookTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see co7217.week18.entity.entityDsl.EntityDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EntityDslPackageImpl()
  {
    super(eNS_URI, EntityDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link EntityDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EntityDslPackage init()
  {
    if (isInited) return (EntityDslPackage)EPackage.Registry.INSTANCE.getEPackage(EntityDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredEntityDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    EntityDslPackageImpl theEntityDslPackage = registeredEntityDslPackage instanceof EntityDslPackageImpl ? (EntityDslPackageImpl)registeredEntityDslPackage : new EntityDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theEntityDslPackage.createPackageContents();

    // Initialize created meta-data
    theEntityDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEntityDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EntityDslPackage.eNS_URI, theEntityDslPackage);
    return theEntityDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlugin()
  {
    return pluginEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Name()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Version()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Description()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Author()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_License()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Prefix()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_TextDomain()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Activate()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Deactivate()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlugin_Uninstall()
  {
    return (EAttribute)pluginEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlugin_Widgets()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlugin_Shortcodes()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlugin_CustomPostTypes()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlugin_Settings()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlugin_Hooks()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWidget()
  {
    return widgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWidget_WidgetName()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWidget_WidgetDescription()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWidget_Settings()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getShortcode()
  {
    return shortcodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getShortcode_ShortcodeName()
  {
    return (EAttribute)shortcodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getShortcode_Settings()
  {
    return (EReference)shortcodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCustomPostType()
  {
    return customPostTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCustomPostType_PostTypeName()
  {
    return (EAttribute)customPostTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCustomPostType_Supports()
  {
    return (EAttribute)customPostTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCustomPostType_Taxonomies()
  {
    return (EAttribute)customPostTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSetting()
  {
    return settingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetting_SettingName()
  {
    return (EAttribute)settingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetting_SettingType()
  {
    return (EAttribute)settingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetting_DefaultValue()
  {
    return (EAttribute)settingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHook()
  {
    return hookEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHook_HookType()
  {
    return (EAttribute)hookEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHook_HookName()
  {
    return (EAttribute)hookEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHook_Callback()
  {
    return (EAttribute)hookEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHook_Priority()
  {
    return (EAttribute)hookEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHook_AcceptedArgs()
  {
    return (EAttribute)hookEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getHookType()
  {
    return hookTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityDslFactory getEntityDslFactory()
  {
    return (EntityDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pluginEClass = createEClass(PLUGIN);
    createEAttribute(pluginEClass, PLUGIN__NAME);
    createEAttribute(pluginEClass, PLUGIN__VERSION);
    createEAttribute(pluginEClass, PLUGIN__DESCRIPTION);
    createEAttribute(pluginEClass, PLUGIN__AUTHOR);
    createEAttribute(pluginEClass, PLUGIN__LICENSE);
    createEAttribute(pluginEClass, PLUGIN__PREFIX);
    createEAttribute(pluginEClass, PLUGIN__TEXT_DOMAIN);
    createEAttribute(pluginEClass, PLUGIN__ACTIVATE);
    createEAttribute(pluginEClass, PLUGIN__DEACTIVATE);
    createEAttribute(pluginEClass, PLUGIN__UNINSTALL);
    createEReference(pluginEClass, PLUGIN__WIDGETS);
    createEReference(pluginEClass, PLUGIN__SHORTCODES);
    createEReference(pluginEClass, PLUGIN__CUSTOM_POST_TYPES);
    createEReference(pluginEClass, PLUGIN__SETTINGS);
    createEReference(pluginEClass, PLUGIN__HOOKS);

    widgetEClass = createEClass(WIDGET);
    createEAttribute(widgetEClass, WIDGET__WIDGET_NAME);
    createEAttribute(widgetEClass, WIDGET__WIDGET_DESCRIPTION);
    createEReference(widgetEClass, WIDGET__SETTINGS);

    shortcodeEClass = createEClass(SHORTCODE);
    createEAttribute(shortcodeEClass, SHORTCODE__SHORTCODE_NAME);
    createEReference(shortcodeEClass, SHORTCODE__SETTINGS);

    customPostTypeEClass = createEClass(CUSTOM_POST_TYPE);
    createEAttribute(customPostTypeEClass, CUSTOM_POST_TYPE__POST_TYPE_NAME);
    createEAttribute(customPostTypeEClass, CUSTOM_POST_TYPE__SUPPORTS);
    createEAttribute(customPostTypeEClass, CUSTOM_POST_TYPE__TAXONOMIES);

    settingEClass = createEClass(SETTING);
    createEAttribute(settingEClass, SETTING__SETTING_NAME);
    createEAttribute(settingEClass, SETTING__SETTING_TYPE);
    createEAttribute(settingEClass, SETTING__DEFAULT_VALUE);

    hookEClass = createEClass(HOOK);
    createEAttribute(hookEClass, HOOK__HOOK_TYPE);
    createEAttribute(hookEClass, HOOK__HOOK_NAME);
    createEAttribute(hookEClass, HOOK__CALLBACK);
    createEAttribute(hookEClass, HOOK__PRIORITY);
    createEAttribute(hookEClass, HOOK__ACCEPTED_ARGS);

    // Create enums
    hookTypeEEnum = createEEnum(HOOK_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlugin_Name(), ecorePackage.getEString(), "name", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Version(), ecorePackage.getEString(), "version", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Description(), ecorePackage.getEString(), "description", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Author(), ecorePackage.getEString(), "author", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_License(), ecorePackage.getEString(), "license", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_TextDomain(), ecorePackage.getEString(), "textDomain", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Activate(), ecorePackage.getEString(), "activate", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Deactivate(), ecorePackage.getEString(), "deactivate", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Uninstall(), ecorePackage.getEString(), "uninstall", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Shortcodes(), this.getShortcode(), null, "shortcodes", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_CustomPostTypes(), this.getCustomPostType(), null, "customPostTypes", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Settings(), this.getSetting(), null, "settings", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Hooks(), this.getHook(), null, "hooks", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWidget_WidgetName(), ecorePackage.getEString(), "widgetName", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWidget_WidgetDescription(), ecorePackage.getEString(), "widgetDescription", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_Settings(), this.getSetting(), null, "settings", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shortcodeEClass, Shortcode.class, "Shortcode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShortcode_ShortcodeName(), ecorePackage.getEString(), "shortcodeName", null, 0, 1, Shortcode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShortcode_Settings(), this.getSetting(), null, "settings", null, 0, -1, Shortcode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customPostTypeEClass, CustomPostType.class, "CustomPostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomPostType_PostTypeName(), ecorePackage.getEString(), "postTypeName", null, 0, 1, CustomPostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomPostType_Supports(), ecorePackage.getEString(), "supports", null, 0, 1, CustomPostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomPostType_Taxonomies(), ecorePackage.getEString(), "taxonomies", null, 0, 1, CustomPostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(settingEClass, Setting.class, "Setting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetting_SettingName(), ecorePackage.getEString(), "settingName", null, 0, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetting_SettingType(), ecorePackage.getEString(), "settingType", null, 0, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetting_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hookEClass, Hook.class, "Hook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHook_HookType(), this.getHookType(), "hookType", null, 0, 1, Hook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHook_HookName(), ecorePackage.getEString(), "hookName", null, 0, 1, Hook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHook_Callback(), ecorePackage.getEString(), "callback", null, 0, 1, Hook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHook_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Hook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHook_AcceptedArgs(), ecorePackage.getEInt(), "acceptedArgs", null, 0, 1, Hook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(hookTypeEEnum, HookType.class, "HookType");
    addEEnumLiteral(hookTypeEEnum, HookType.FILTER);
    addEEnumLiteral(hookTypeEEnum, HookType.ACTION);

    // Create resource
    createResource(eNS_URI);
  }

} //EntityDslPackageImpl
