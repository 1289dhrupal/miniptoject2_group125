package co7217.week18.entity.tests;

import co7217.week18.entity.entityDsl.PluginModel
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension.class)
@InjectWith(EntityDslInjectorProvider.class)
class EntityDslParsingTest {
    
    @Inject
    ParseHelper<PluginModel> parseHelper;

    @Test
    def void loadValidPluginModel() {
        val result = parseHelper.parse('''
        Meta {
            name = "SamplePlugin"
            version = "1.0.0"
            description = "A sample plugin"
            author = "John Doe"
            license = "MIT"
            prefix = "sp"
            textDomain = "sample-plugin"
            activate = "true"
            deactivate = "true"
            uninstall = "false"
        }
        ''');
        Assertions.assertNotNull(result);
        val errors = result.eResource.errors;
        Assertions.assertTrue(errors.isEmpty(), '''Unexpected errors: «errors.join(", ")»''');
    }

    @Test
    def void loadPluginWithInvalidActivationValue() {
        val result = parseHelper.parse('''
        Meta {
            name = "InvalidActivationPlugin"
            version = "1.0.0"
            activate = "maybe" // Invalid value
        }
        ''');
        Assertions.assertNotNull(result);
        val errors = result.eResource.errors;
        Assertions.assertFalse(errors.isEmpty(), "Expected errors for invalid activate value");
    }

    // Additional test cases for other entities like Widget, Shortcode, etc.
}
