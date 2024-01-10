/*
 * generated by Xtext 2.32.0
 */
package co7217.week18.entity.parser.antlr;

import co7217.week18.entity.parser.antlr.internal.InternalEntityDslParser;
import co7217.week18.entity.services.EntityDslGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EntityDslParser extends AbstractAntlrParser {

	@Inject
	private EntityDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEntityDslParser createParser(XtextTokenStream stream) {
		return new InternalEntityDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "PluginModel";
	}

	public EntityDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
