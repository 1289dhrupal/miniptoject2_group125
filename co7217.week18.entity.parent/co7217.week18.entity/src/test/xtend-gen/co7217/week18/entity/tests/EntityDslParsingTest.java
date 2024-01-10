package co7217.week18.entity.tests;

import co7217.week18.entity.entityDsl.PluginModel;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/* @ExtendWith(InjectionExtension.class.getClass())
@InjectWith(EntityDslInjectorProvider.class.getClass()) */@SuppressWarnings("all")
public class EntityDslParsingTest {
  @Inject
  private ParseHelper<PluginModel> parseHelper;

  @Test
  public void loadValidPluginModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Meta {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("name = \"SamplePlugin\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("version = \"1.0.0\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("description = \"A sample plugin\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("author = \"John Doe\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("license = \"MIT\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("prefix = \"sp\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("textDomain = \"sample-plugin\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("activate = \"true\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("deactivate = \"true\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("uninstall = \"false\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final PluginModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadPluginWithInvalidActivationValue() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Meta {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("name = \"InvalidActivationPlugin\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("version = \"1.0.0\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("activate = \"maybe\" // Invalid value");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final PluginModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      Assertions.assertFalse(errors.isEmpty(), "Expected errors for invalid activate value");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
