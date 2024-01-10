package co7217.week18.entity.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co7217.week18.entity.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'filter'", "'action'", "'Meta'", "'{'", "'name'", "'='", "'version'", "'description'", "'author'", "'license'", "'prefix'", "'textDomain'", "'activate'", "'deactivate'", "'uninstall'", "'}'", "'Widget'", "'widgetName'", "'widgetDescription'", "'Shortcode'", "'shortcodeName'", "'CustomPostType'", "'cptName'", "'cptSingularName'", "'cptSupports'", "'cptTaxonomies'", "'Setting'", "'settingName'", "'settingType'", "'defaultValue'", "'Hook'", "'hookType'", "'hookName'", "'callback'", "'priority'", "'acceptedArgs'", "','"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEntityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntityDsl.g"; }


    	private EntityDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePluginModel"
    // InternalEntityDsl.g:53:1: entryRulePluginModel : rulePluginModel EOF ;
    public final void entryRulePluginModel() throws RecognitionException {
        try {
            // InternalEntityDsl.g:54:1: ( rulePluginModel EOF )
            // InternalEntityDsl.g:55:1: rulePluginModel EOF
            {
             before(grammarAccess.getPluginModelRule()); 
            pushFollow(FOLLOW_1);
            rulePluginModel();

            state._fsp--;

             after(grammarAccess.getPluginModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePluginModel"


    // $ANTLR start "rulePluginModel"
    // InternalEntityDsl.g:62:1: rulePluginModel : ( ( rule__PluginModel__ElementsAssignment )* ) ;
    public final void rulePluginModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:66:2: ( ( ( rule__PluginModel__ElementsAssignment )* ) )
            // InternalEntityDsl.g:67:2: ( ( rule__PluginModel__ElementsAssignment )* )
            {
            // InternalEntityDsl.g:67:2: ( ( rule__PluginModel__ElementsAssignment )* )
            // InternalEntityDsl.g:68:3: ( rule__PluginModel__ElementsAssignment )*
            {
             before(grammarAccess.getPluginModelAccess().getElementsAssignment()); 
            // InternalEntityDsl.g:69:3: ( rule__PluginModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==27||LA1_0==30||LA1_0==32||LA1_0==37||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDsl.g:69:4: rule__PluginModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PluginModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPluginModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePluginModel"


    // $ANTLR start "entryRuleElement"
    // InternalEntityDsl.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalEntityDsl.g:79:1: ( ruleElement EOF )
            // InternalEntityDsl.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalEntityDsl.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalEntityDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalEntityDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalEntityDsl.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalEntityDsl.g:94:3: ( rule__Element__Alternatives )
            // InternalEntityDsl.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleMeta"
    // InternalEntityDsl.g:103:1: entryRuleMeta : ruleMeta EOF ;
    public final void entryRuleMeta() throws RecognitionException {
        try {
            // InternalEntityDsl.g:104:1: ( ruleMeta EOF )
            // InternalEntityDsl.g:105:1: ruleMeta EOF
            {
             before(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_1);
            ruleMeta();

            state._fsp--;

             after(grammarAccess.getMetaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // InternalEntityDsl.g:112:1: ruleMeta : ( ( rule__Meta__Group__0 ) ) ;
    public final void ruleMeta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:116:2: ( ( ( rule__Meta__Group__0 ) ) )
            // InternalEntityDsl.g:117:2: ( ( rule__Meta__Group__0 ) )
            {
            // InternalEntityDsl.g:117:2: ( ( rule__Meta__Group__0 ) )
            // InternalEntityDsl.g:118:3: ( rule__Meta__Group__0 )
            {
             before(grammarAccess.getMetaAccess().getGroup()); 
            // InternalEntityDsl.g:119:3: ( rule__Meta__Group__0 )
            // InternalEntityDsl.g:119:4: rule__Meta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleWidget"
    // InternalEntityDsl.g:128:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // InternalEntityDsl.g:129:1: ( ruleWidget EOF )
            // InternalEntityDsl.g:130:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalEntityDsl.g:137:1: ruleWidget : ( ( rule__Widget__Group__0 ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:141:2: ( ( ( rule__Widget__Group__0 ) ) )
            // InternalEntityDsl.g:142:2: ( ( rule__Widget__Group__0 ) )
            {
            // InternalEntityDsl.g:142:2: ( ( rule__Widget__Group__0 ) )
            // InternalEntityDsl.g:143:3: ( rule__Widget__Group__0 )
            {
             before(grammarAccess.getWidgetAccess().getGroup()); 
            // InternalEntityDsl.g:144:3: ( rule__Widget__Group__0 )
            // InternalEntityDsl.g:144:4: rule__Widget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleShortcode"
    // InternalEntityDsl.g:153:1: entryRuleShortcode : ruleShortcode EOF ;
    public final void entryRuleShortcode() throws RecognitionException {
        try {
            // InternalEntityDsl.g:154:1: ( ruleShortcode EOF )
            // InternalEntityDsl.g:155:1: ruleShortcode EOF
            {
             before(grammarAccess.getShortcodeRule()); 
            pushFollow(FOLLOW_1);
            ruleShortcode();

            state._fsp--;

             after(grammarAccess.getShortcodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShortcode"


    // $ANTLR start "ruleShortcode"
    // InternalEntityDsl.g:162:1: ruleShortcode : ( ( rule__Shortcode__Group__0 ) ) ;
    public final void ruleShortcode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:166:2: ( ( ( rule__Shortcode__Group__0 ) ) )
            // InternalEntityDsl.g:167:2: ( ( rule__Shortcode__Group__0 ) )
            {
            // InternalEntityDsl.g:167:2: ( ( rule__Shortcode__Group__0 ) )
            // InternalEntityDsl.g:168:3: ( rule__Shortcode__Group__0 )
            {
             before(grammarAccess.getShortcodeAccess().getGroup()); 
            // InternalEntityDsl.g:169:3: ( rule__Shortcode__Group__0 )
            // InternalEntityDsl.g:169:4: rule__Shortcode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShortcodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShortcode"


    // $ANTLR start "entryRuleCustomPostType"
    // InternalEntityDsl.g:178:1: entryRuleCustomPostType : ruleCustomPostType EOF ;
    public final void entryRuleCustomPostType() throws RecognitionException {
        try {
            // InternalEntityDsl.g:179:1: ( ruleCustomPostType EOF )
            // InternalEntityDsl.g:180:1: ruleCustomPostType EOF
            {
             before(grammarAccess.getCustomPostTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomPostType();

            state._fsp--;

             after(grammarAccess.getCustomPostTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomPostType"


    // $ANTLR start "ruleCustomPostType"
    // InternalEntityDsl.g:187:1: ruleCustomPostType : ( ( rule__CustomPostType__Group__0 ) ) ;
    public final void ruleCustomPostType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:191:2: ( ( ( rule__CustomPostType__Group__0 ) ) )
            // InternalEntityDsl.g:192:2: ( ( rule__CustomPostType__Group__0 ) )
            {
            // InternalEntityDsl.g:192:2: ( ( rule__CustomPostType__Group__0 ) )
            // InternalEntityDsl.g:193:3: ( rule__CustomPostType__Group__0 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getGroup()); 
            // InternalEntityDsl.g:194:3: ( rule__CustomPostType__Group__0 )
            // InternalEntityDsl.g:194:4: rule__CustomPostType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomPostTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomPostType"


    // $ANTLR start "entryRuleSetting"
    // InternalEntityDsl.g:203:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalEntityDsl.g:204:1: ( ruleSetting EOF )
            // InternalEntityDsl.g:205:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSettingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalEntityDsl.g:212:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:216:2: ( ( ( rule__Setting__Group__0 ) ) )
            // InternalEntityDsl.g:217:2: ( ( rule__Setting__Group__0 ) )
            {
            // InternalEntityDsl.g:217:2: ( ( rule__Setting__Group__0 ) )
            // InternalEntityDsl.g:218:3: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // InternalEntityDsl.g:219:3: ( rule__Setting__Group__0 )
            // InternalEntityDsl.g:219:4: rule__Setting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleHook"
    // InternalEntityDsl.g:228:1: entryRuleHook : ruleHook EOF ;
    public final void entryRuleHook() throws RecognitionException {
        try {
            // InternalEntityDsl.g:229:1: ( ruleHook EOF )
            // InternalEntityDsl.g:230:1: ruleHook EOF
            {
             before(grammarAccess.getHookRule()); 
            pushFollow(FOLLOW_1);
            ruleHook();

            state._fsp--;

             after(grammarAccess.getHookRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHook"


    // $ANTLR start "ruleHook"
    // InternalEntityDsl.g:237:1: ruleHook : ( ( rule__Hook__Group__0 ) ) ;
    public final void ruleHook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:241:2: ( ( ( rule__Hook__Group__0 ) ) )
            // InternalEntityDsl.g:242:2: ( ( rule__Hook__Group__0 ) )
            {
            // InternalEntityDsl.g:242:2: ( ( rule__Hook__Group__0 ) )
            // InternalEntityDsl.g:243:3: ( rule__Hook__Group__0 )
            {
             before(grammarAccess.getHookAccess().getGroup()); 
            // InternalEntityDsl.g:244:3: ( rule__Hook__Group__0 )
            // InternalEntityDsl.g:244:4: rule__Hook__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hook__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHookAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHook"


    // $ANTLR start "entryRuleStringList"
    // InternalEntityDsl.g:253:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // InternalEntityDsl.g:254:1: ( ruleStringList EOF )
            // InternalEntityDsl.g:255:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalEntityDsl.g:262:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:266:2: ( ( ( rule__StringList__Group__0 ) ) )
            // InternalEntityDsl.g:267:2: ( ( rule__StringList__Group__0 ) )
            {
            // InternalEntityDsl.g:267:2: ( ( rule__StringList__Group__0 ) )
            // InternalEntityDsl.g:268:3: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // InternalEntityDsl.g:269:3: ( rule__StringList__Group__0 )
            // InternalEntityDsl.g:269:4: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringList"


    // $ANTLR start "ruleHookType"
    // InternalEntityDsl.g:278:1: ruleHookType : ( ( rule__HookType__Alternatives ) ) ;
    public final void ruleHookType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:282:1: ( ( ( rule__HookType__Alternatives ) ) )
            // InternalEntityDsl.g:283:2: ( ( rule__HookType__Alternatives ) )
            {
            // InternalEntityDsl.g:283:2: ( ( rule__HookType__Alternatives ) )
            // InternalEntityDsl.g:284:3: ( rule__HookType__Alternatives )
            {
             before(grammarAccess.getHookTypeAccess().getAlternatives()); 
            // InternalEntityDsl.g:285:3: ( rule__HookType__Alternatives )
            // InternalEntityDsl.g:285:4: rule__HookType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HookType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHookTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHookType"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalEntityDsl.g:293:1: rule__Element__Alternatives : ( ( ruleMeta ) | ( ruleWidget ) | ( ruleShortcode ) | ( ruleCustomPostType ) | ( ruleSetting ) | ( ruleHook ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:297:1: ( ( ruleMeta ) | ( ruleWidget ) | ( ruleShortcode ) | ( ruleCustomPostType ) | ( ruleSetting ) | ( ruleHook ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 37:
                {
                alt2=5;
                }
                break;
            case 41:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:298:2: ( ruleMeta )
                    {
                    // InternalEntityDsl.g:298:2: ( ruleMeta )
                    // InternalEntityDsl.g:299:3: ruleMeta
                    {
                     before(grammarAccess.getElementAccess().getMetaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMeta();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMetaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:304:2: ( ruleWidget )
                    {
                    // InternalEntityDsl.g:304:2: ( ruleWidget )
                    // InternalEntityDsl.g:305:3: ruleWidget
                    {
                     before(grammarAccess.getElementAccess().getWidgetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWidget();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getWidgetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:310:2: ( ruleShortcode )
                    {
                    // InternalEntityDsl.g:310:2: ( ruleShortcode )
                    // InternalEntityDsl.g:311:3: ruleShortcode
                    {
                     before(grammarAccess.getElementAccess().getShortcodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleShortcode();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getShortcodeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:316:2: ( ruleCustomPostType )
                    {
                    // InternalEntityDsl.g:316:2: ( ruleCustomPostType )
                    // InternalEntityDsl.g:317:3: ruleCustomPostType
                    {
                     before(grammarAccess.getElementAccess().getCustomPostTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomPostType();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCustomPostTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEntityDsl.g:322:2: ( ruleSetting )
                    {
                    // InternalEntityDsl.g:322:2: ( ruleSetting )
                    // InternalEntityDsl.g:323:3: ruleSetting
                    {
                     before(grammarAccess.getElementAccess().getSettingParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSetting();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSettingParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEntityDsl.g:328:2: ( ruleHook )
                    {
                    // InternalEntityDsl.g:328:2: ( ruleHook )
                    // InternalEntityDsl.g:329:3: ruleHook
                    {
                     before(grammarAccess.getElementAccess().getHookParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleHook();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getHookParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__HookType__Alternatives"
    // InternalEntityDsl.g:338:1: rule__HookType__Alternatives : ( ( ( 'filter' ) ) | ( ( 'action' ) ) );
    public final void rule__HookType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:342:1: ( ( ( 'filter' ) ) | ( ( 'action' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:343:2: ( ( 'filter' ) )
                    {
                    // InternalEntityDsl.g:343:2: ( ( 'filter' ) )
                    // InternalEntityDsl.g:344:3: ( 'filter' )
                    {
                     before(grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0()); 
                    // InternalEntityDsl.g:345:3: ( 'filter' )
                    // InternalEntityDsl.g:345:4: 'filter'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:349:2: ( ( 'action' ) )
                    {
                    // InternalEntityDsl.g:349:2: ( ( 'action' ) )
                    // InternalEntityDsl.g:350:3: ( 'action' )
                    {
                     before(grammarAccess.getHookTypeAccess().getACTIONEnumLiteralDeclaration_1()); 
                    // InternalEntityDsl.g:351:3: ( 'action' )
                    // InternalEntityDsl.g:351:4: 'action'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHookTypeAccess().getACTIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HookType__Alternatives"


    // $ANTLR start "rule__Meta__Group__0"
    // InternalEntityDsl.g:359:1: rule__Meta__Group__0 : rule__Meta__Group__0__Impl rule__Meta__Group__1 ;
    public final void rule__Meta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:363:1: ( rule__Meta__Group__0__Impl rule__Meta__Group__1 )
            // InternalEntityDsl.g:364:2: rule__Meta__Group__0__Impl rule__Meta__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Meta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__0"


    // $ANTLR start "rule__Meta__Group__0__Impl"
    // InternalEntityDsl.g:371:1: rule__Meta__Group__0__Impl : ( 'Meta' ) ;
    public final void rule__Meta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:375:1: ( ( 'Meta' ) )
            // InternalEntityDsl.g:376:1: ( 'Meta' )
            {
            // InternalEntityDsl.g:376:1: ( 'Meta' )
            // InternalEntityDsl.g:377:2: 'Meta'
            {
             before(grammarAccess.getMetaAccess().getMetaKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getMetaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__0__Impl"


    // $ANTLR start "rule__Meta__Group__1"
    // InternalEntityDsl.g:386:1: rule__Meta__Group__1 : rule__Meta__Group__1__Impl rule__Meta__Group__2 ;
    public final void rule__Meta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:390:1: ( rule__Meta__Group__1__Impl rule__Meta__Group__2 )
            // InternalEntityDsl.g:391:2: rule__Meta__Group__1__Impl rule__Meta__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Meta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__1"


    // $ANTLR start "rule__Meta__Group__1__Impl"
    // InternalEntityDsl.g:398:1: rule__Meta__Group__1__Impl : ( '{' ) ;
    public final void rule__Meta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:402:1: ( ( '{' ) )
            // InternalEntityDsl.g:403:1: ( '{' )
            {
            // InternalEntityDsl.g:403:1: ( '{' )
            // InternalEntityDsl.g:404:2: '{'
            {
             before(grammarAccess.getMetaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__1__Impl"


    // $ANTLR start "rule__Meta__Group__2"
    // InternalEntityDsl.g:413:1: rule__Meta__Group__2 : rule__Meta__Group__2__Impl rule__Meta__Group__3 ;
    public final void rule__Meta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:417:1: ( rule__Meta__Group__2__Impl rule__Meta__Group__3 )
            // InternalEntityDsl.g:418:2: rule__Meta__Group__2__Impl rule__Meta__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__2"


    // $ANTLR start "rule__Meta__Group__2__Impl"
    // InternalEntityDsl.g:425:1: rule__Meta__Group__2__Impl : ( 'name' ) ;
    public final void rule__Meta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:429:1: ( ( 'name' ) )
            // InternalEntityDsl.g:430:1: ( 'name' )
            {
            // InternalEntityDsl.g:430:1: ( 'name' )
            // InternalEntityDsl.g:431:2: 'name'
            {
             before(grammarAccess.getMetaAccess().getNameKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__2__Impl"


    // $ANTLR start "rule__Meta__Group__3"
    // InternalEntityDsl.g:440:1: rule__Meta__Group__3 : rule__Meta__Group__3__Impl rule__Meta__Group__4 ;
    public final void rule__Meta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:444:1: ( rule__Meta__Group__3__Impl rule__Meta__Group__4 )
            // InternalEntityDsl.g:445:2: rule__Meta__Group__3__Impl rule__Meta__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__3"


    // $ANTLR start "rule__Meta__Group__3__Impl"
    // InternalEntityDsl.g:452:1: rule__Meta__Group__3__Impl : ( '=' ) ;
    public final void rule__Meta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:456:1: ( ( '=' ) )
            // InternalEntityDsl.g:457:1: ( '=' )
            {
            // InternalEntityDsl.g:457:1: ( '=' )
            // InternalEntityDsl.g:458:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__3__Impl"


    // $ANTLR start "rule__Meta__Group__4"
    // InternalEntityDsl.g:467:1: rule__Meta__Group__4 : rule__Meta__Group__4__Impl rule__Meta__Group__5 ;
    public final void rule__Meta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:471:1: ( rule__Meta__Group__4__Impl rule__Meta__Group__5 )
            // InternalEntityDsl.g:472:2: rule__Meta__Group__4__Impl rule__Meta__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Meta__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__4"


    // $ANTLR start "rule__Meta__Group__4__Impl"
    // InternalEntityDsl.g:479:1: rule__Meta__Group__4__Impl : ( ( rule__Meta__NameAssignment_4 ) ) ;
    public final void rule__Meta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:483:1: ( ( ( rule__Meta__NameAssignment_4 ) ) )
            // InternalEntityDsl.g:484:1: ( ( rule__Meta__NameAssignment_4 ) )
            {
            // InternalEntityDsl.g:484:1: ( ( rule__Meta__NameAssignment_4 ) )
            // InternalEntityDsl.g:485:2: ( rule__Meta__NameAssignment_4 )
            {
             before(grammarAccess.getMetaAccess().getNameAssignment_4()); 
            // InternalEntityDsl.g:486:2: ( rule__Meta__NameAssignment_4 )
            // InternalEntityDsl.g:486:3: rule__Meta__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Meta__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__4__Impl"


    // $ANTLR start "rule__Meta__Group__5"
    // InternalEntityDsl.g:494:1: rule__Meta__Group__5 : rule__Meta__Group__5__Impl rule__Meta__Group__6 ;
    public final void rule__Meta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:498:1: ( rule__Meta__Group__5__Impl rule__Meta__Group__6 )
            // InternalEntityDsl.g:499:2: rule__Meta__Group__5__Impl rule__Meta__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__5"


    // $ANTLR start "rule__Meta__Group__5__Impl"
    // InternalEntityDsl.g:506:1: rule__Meta__Group__5__Impl : ( 'version' ) ;
    public final void rule__Meta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:510:1: ( ( 'version' ) )
            // InternalEntityDsl.g:511:1: ( 'version' )
            {
            // InternalEntityDsl.g:511:1: ( 'version' )
            // InternalEntityDsl.g:512:2: 'version'
            {
             before(grammarAccess.getMetaAccess().getVersionKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getVersionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__5__Impl"


    // $ANTLR start "rule__Meta__Group__6"
    // InternalEntityDsl.g:521:1: rule__Meta__Group__6 : rule__Meta__Group__6__Impl rule__Meta__Group__7 ;
    public final void rule__Meta__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:525:1: ( rule__Meta__Group__6__Impl rule__Meta__Group__7 )
            // InternalEntityDsl.g:526:2: rule__Meta__Group__6__Impl rule__Meta__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__6"


    // $ANTLR start "rule__Meta__Group__6__Impl"
    // InternalEntityDsl.g:533:1: rule__Meta__Group__6__Impl : ( '=' ) ;
    public final void rule__Meta__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:537:1: ( ( '=' ) )
            // InternalEntityDsl.g:538:1: ( '=' )
            {
            // InternalEntityDsl.g:538:1: ( '=' )
            // InternalEntityDsl.g:539:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__6__Impl"


    // $ANTLR start "rule__Meta__Group__7"
    // InternalEntityDsl.g:548:1: rule__Meta__Group__7 : rule__Meta__Group__7__Impl rule__Meta__Group__8 ;
    public final void rule__Meta__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:552:1: ( rule__Meta__Group__7__Impl rule__Meta__Group__8 )
            // InternalEntityDsl.g:553:2: rule__Meta__Group__7__Impl rule__Meta__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Meta__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__7"


    // $ANTLR start "rule__Meta__Group__7__Impl"
    // InternalEntityDsl.g:560:1: rule__Meta__Group__7__Impl : ( ( rule__Meta__VersionAssignment_7 ) ) ;
    public final void rule__Meta__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:564:1: ( ( ( rule__Meta__VersionAssignment_7 ) ) )
            // InternalEntityDsl.g:565:1: ( ( rule__Meta__VersionAssignment_7 ) )
            {
            // InternalEntityDsl.g:565:1: ( ( rule__Meta__VersionAssignment_7 ) )
            // InternalEntityDsl.g:566:2: ( rule__Meta__VersionAssignment_7 )
            {
             before(grammarAccess.getMetaAccess().getVersionAssignment_7()); 
            // InternalEntityDsl.g:567:2: ( rule__Meta__VersionAssignment_7 )
            // InternalEntityDsl.g:567:3: rule__Meta__VersionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Meta__VersionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getVersionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__7__Impl"


    // $ANTLR start "rule__Meta__Group__8"
    // InternalEntityDsl.g:575:1: rule__Meta__Group__8 : rule__Meta__Group__8__Impl rule__Meta__Group__9 ;
    public final void rule__Meta__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:579:1: ( rule__Meta__Group__8__Impl rule__Meta__Group__9 )
            // InternalEntityDsl.g:580:2: rule__Meta__Group__8__Impl rule__Meta__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__8"


    // $ANTLR start "rule__Meta__Group__8__Impl"
    // InternalEntityDsl.g:587:1: rule__Meta__Group__8__Impl : ( 'description' ) ;
    public final void rule__Meta__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:591:1: ( ( 'description' ) )
            // InternalEntityDsl.g:592:1: ( 'description' )
            {
            // InternalEntityDsl.g:592:1: ( 'description' )
            // InternalEntityDsl.g:593:2: 'description'
            {
             before(grammarAccess.getMetaAccess().getDescriptionKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getDescriptionKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__8__Impl"


    // $ANTLR start "rule__Meta__Group__9"
    // InternalEntityDsl.g:602:1: rule__Meta__Group__9 : rule__Meta__Group__9__Impl rule__Meta__Group__10 ;
    public final void rule__Meta__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:606:1: ( rule__Meta__Group__9__Impl rule__Meta__Group__10 )
            // InternalEntityDsl.g:607:2: rule__Meta__Group__9__Impl rule__Meta__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__9"


    // $ANTLR start "rule__Meta__Group__9__Impl"
    // InternalEntityDsl.g:614:1: rule__Meta__Group__9__Impl : ( '=' ) ;
    public final void rule__Meta__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:618:1: ( ( '=' ) )
            // InternalEntityDsl.g:619:1: ( '=' )
            {
            // InternalEntityDsl.g:619:1: ( '=' )
            // InternalEntityDsl.g:620:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__9__Impl"


    // $ANTLR start "rule__Meta__Group__10"
    // InternalEntityDsl.g:629:1: rule__Meta__Group__10 : rule__Meta__Group__10__Impl rule__Meta__Group__11 ;
    public final void rule__Meta__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:633:1: ( rule__Meta__Group__10__Impl rule__Meta__Group__11 )
            // InternalEntityDsl.g:634:2: rule__Meta__Group__10__Impl rule__Meta__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Meta__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__10"


    // $ANTLR start "rule__Meta__Group__10__Impl"
    // InternalEntityDsl.g:641:1: rule__Meta__Group__10__Impl : ( ( rule__Meta__DescriptionAssignment_10 ) ) ;
    public final void rule__Meta__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:645:1: ( ( ( rule__Meta__DescriptionAssignment_10 ) ) )
            // InternalEntityDsl.g:646:1: ( ( rule__Meta__DescriptionAssignment_10 ) )
            {
            // InternalEntityDsl.g:646:1: ( ( rule__Meta__DescriptionAssignment_10 ) )
            // InternalEntityDsl.g:647:2: ( rule__Meta__DescriptionAssignment_10 )
            {
             before(grammarAccess.getMetaAccess().getDescriptionAssignment_10()); 
            // InternalEntityDsl.g:648:2: ( rule__Meta__DescriptionAssignment_10 )
            // InternalEntityDsl.g:648:3: rule__Meta__DescriptionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Meta__DescriptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getDescriptionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__10__Impl"


    // $ANTLR start "rule__Meta__Group__11"
    // InternalEntityDsl.g:656:1: rule__Meta__Group__11 : rule__Meta__Group__11__Impl rule__Meta__Group__12 ;
    public final void rule__Meta__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:660:1: ( rule__Meta__Group__11__Impl rule__Meta__Group__12 )
            // InternalEntityDsl.g:661:2: rule__Meta__Group__11__Impl rule__Meta__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__11"


    // $ANTLR start "rule__Meta__Group__11__Impl"
    // InternalEntityDsl.g:668:1: rule__Meta__Group__11__Impl : ( 'author' ) ;
    public final void rule__Meta__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:672:1: ( ( 'author' ) )
            // InternalEntityDsl.g:673:1: ( 'author' )
            {
            // InternalEntityDsl.g:673:1: ( 'author' )
            // InternalEntityDsl.g:674:2: 'author'
            {
             before(grammarAccess.getMetaAccess().getAuthorKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getAuthorKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__11__Impl"


    // $ANTLR start "rule__Meta__Group__12"
    // InternalEntityDsl.g:683:1: rule__Meta__Group__12 : rule__Meta__Group__12__Impl rule__Meta__Group__13 ;
    public final void rule__Meta__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:687:1: ( rule__Meta__Group__12__Impl rule__Meta__Group__13 )
            // InternalEntityDsl.g:688:2: rule__Meta__Group__12__Impl rule__Meta__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__12"


    // $ANTLR start "rule__Meta__Group__12__Impl"
    // InternalEntityDsl.g:695:1: rule__Meta__Group__12__Impl : ( '=' ) ;
    public final void rule__Meta__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:699:1: ( ( '=' ) )
            // InternalEntityDsl.g:700:1: ( '=' )
            {
            // InternalEntityDsl.g:700:1: ( '=' )
            // InternalEntityDsl.g:701:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__12__Impl"


    // $ANTLR start "rule__Meta__Group__13"
    // InternalEntityDsl.g:710:1: rule__Meta__Group__13 : rule__Meta__Group__13__Impl rule__Meta__Group__14 ;
    public final void rule__Meta__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:714:1: ( rule__Meta__Group__13__Impl rule__Meta__Group__14 )
            // InternalEntityDsl.g:715:2: rule__Meta__Group__13__Impl rule__Meta__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__Meta__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__13"


    // $ANTLR start "rule__Meta__Group__13__Impl"
    // InternalEntityDsl.g:722:1: rule__Meta__Group__13__Impl : ( ( rule__Meta__AuthorAssignment_13 ) ) ;
    public final void rule__Meta__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:726:1: ( ( ( rule__Meta__AuthorAssignment_13 ) ) )
            // InternalEntityDsl.g:727:1: ( ( rule__Meta__AuthorAssignment_13 ) )
            {
            // InternalEntityDsl.g:727:1: ( ( rule__Meta__AuthorAssignment_13 ) )
            // InternalEntityDsl.g:728:2: ( rule__Meta__AuthorAssignment_13 )
            {
             before(grammarAccess.getMetaAccess().getAuthorAssignment_13()); 
            // InternalEntityDsl.g:729:2: ( rule__Meta__AuthorAssignment_13 )
            // InternalEntityDsl.g:729:3: rule__Meta__AuthorAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Meta__AuthorAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getAuthorAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__13__Impl"


    // $ANTLR start "rule__Meta__Group__14"
    // InternalEntityDsl.g:737:1: rule__Meta__Group__14 : rule__Meta__Group__14__Impl rule__Meta__Group__15 ;
    public final void rule__Meta__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:741:1: ( rule__Meta__Group__14__Impl rule__Meta__Group__15 )
            // InternalEntityDsl.g:742:2: rule__Meta__Group__14__Impl rule__Meta__Group__15
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__14"


    // $ANTLR start "rule__Meta__Group__14__Impl"
    // InternalEntityDsl.g:749:1: rule__Meta__Group__14__Impl : ( 'license' ) ;
    public final void rule__Meta__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:753:1: ( ( 'license' ) )
            // InternalEntityDsl.g:754:1: ( 'license' )
            {
            // InternalEntityDsl.g:754:1: ( 'license' )
            // InternalEntityDsl.g:755:2: 'license'
            {
             before(grammarAccess.getMetaAccess().getLicenseKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getLicenseKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__14__Impl"


    // $ANTLR start "rule__Meta__Group__15"
    // InternalEntityDsl.g:764:1: rule__Meta__Group__15 : rule__Meta__Group__15__Impl rule__Meta__Group__16 ;
    public final void rule__Meta__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:768:1: ( rule__Meta__Group__15__Impl rule__Meta__Group__16 )
            // InternalEntityDsl.g:769:2: rule__Meta__Group__15__Impl rule__Meta__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__15"


    // $ANTLR start "rule__Meta__Group__15__Impl"
    // InternalEntityDsl.g:776:1: rule__Meta__Group__15__Impl : ( '=' ) ;
    public final void rule__Meta__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:780:1: ( ( '=' ) )
            // InternalEntityDsl.g:781:1: ( '=' )
            {
            // InternalEntityDsl.g:781:1: ( '=' )
            // InternalEntityDsl.g:782:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_15()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__15__Impl"


    // $ANTLR start "rule__Meta__Group__16"
    // InternalEntityDsl.g:791:1: rule__Meta__Group__16 : rule__Meta__Group__16__Impl rule__Meta__Group__17 ;
    public final void rule__Meta__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:795:1: ( rule__Meta__Group__16__Impl rule__Meta__Group__17 )
            // InternalEntityDsl.g:796:2: rule__Meta__Group__16__Impl rule__Meta__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__Meta__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__16"


    // $ANTLR start "rule__Meta__Group__16__Impl"
    // InternalEntityDsl.g:803:1: rule__Meta__Group__16__Impl : ( ( rule__Meta__LicenseAssignment_16 ) ) ;
    public final void rule__Meta__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:807:1: ( ( ( rule__Meta__LicenseAssignment_16 ) ) )
            // InternalEntityDsl.g:808:1: ( ( rule__Meta__LicenseAssignment_16 ) )
            {
            // InternalEntityDsl.g:808:1: ( ( rule__Meta__LicenseAssignment_16 ) )
            // InternalEntityDsl.g:809:2: ( rule__Meta__LicenseAssignment_16 )
            {
             before(grammarAccess.getMetaAccess().getLicenseAssignment_16()); 
            // InternalEntityDsl.g:810:2: ( rule__Meta__LicenseAssignment_16 )
            // InternalEntityDsl.g:810:3: rule__Meta__LicenseAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Meta__LicenseAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getLicenseAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__16__Impl"


    // $ANTLR start "rule__Meta__Group__17"
    // InternalEntityDsl.g:818:1: rule__Meta__Group__17 : rule__Meta__Group__17__Impl rule__Meta__Group__18 ;
    public final void rule__Meta__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:822:1: ( rule__Meta__Group__17__Impl rule__Meta__Group__18 )
            // InternalEntityDsl.g:823:2: rule__Meta__Group__17__Impl rule__Meta__Group__18
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__17"


    // $ANTLR start "rule__Meta__Group__17__Impl"
    // InternalEntityDsl.g:830:1: rule__Meta__Group__17__Impl : ( 'prefix' ) ;
    public final void rule__Meta__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:834:1: ( ( 'prefix' ) )
            // InternalEntityDsl.g:835:1: ( 'prefix' )
            {
            // InternalEntityDsl.g:835:1: ( 'prefix' )
            // InternalEntityDsl.g:836:2: 'prefix'
            {
             before(grammarAccess.getMetaAccess().getPrefixKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getPrefixKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__17__Impl"


    // $ANTLR start "rule__Meta__Group__18"
    // InternalEntityDsl.g:845:1: rule__Meta__Group__18 : rule__Meta__Group__18__Impl rule__Meta__Group__19 ;
    public final void rule__Meta__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:849:1: ( rule__Meta__Group__18__Impl rule__Meta__Group__19 )
            // InternalEntityDsl.g:850:2: rule__Meta__Group__18__Impl rule__Meta__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__18"


    // $ANTLR start "rule__Meta__Group__18__Impl"
    // InternalEntityDsl.g:857:1: rule__Meta__Group__18__Impl : ( '=' ) ;
    public final void rule__Meta__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:861:1: ( ( '=' ) )
            // InternalEntityDsl.g:862:1: ( '=' )
            {
            // InternalEntityDsl.g:862:1: ( '=' )
            // InternalEntityDsl.g:863:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_18()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__18__Impl"


    // $ANTLR start "rule__Meta__Group__19"
    // InternalEntityDsl.g:872:1: rule__Meta__Group__19 : rule__Meta__Group__19__Impl rule__Meta__Group__20 ;
    public final void rule__Meta__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:876:1: ( rule__Meta__Group__19__Impl rule__Meta__Group__20 )
            // InternalEntityDsl.g:877:2: rule__Meta__Group__19__Impl rule__Meta__Group__20
            {
            pushFollow(FOLLOW_13);
            rule__Meta__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__19"


    // $ANTLR start "rule__Meta__Group__19__Impl"
    // InternalEntityDsl.g:884:1: rule__Meta__Group__19__Impl : ( ( rule__Meta__PrefixAssignment_19 ) ) ;
    public final void rule__Meta__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:888:1: ( ( ( rule__Meta__PrefixAssignment_19 ) ) )
            // InternalEntityDsl.g:889:1: ( ( rule__Meta__PrefixAssignment_19 ) )
            {
            // InternalEntityDsl.g:889:1: ( ( rule__Meta__PrefixAssignment_19 ) )
            // InternalEntityDsl.g:890:2: ( rule__Meta__PrefixAssignment_19 )
            {
             before(grammarAccess.getMetaAccess().getPrefixAssignment_19()); 
            // InternalEntityDsl.g:891:2: ( rule__Meta__PrefixAssignment_19 )
            // InternalEntityDsl.g:891:3: rule__Meta__PrefixAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Meta__PrefixAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getPrefixAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__19__Impl"


    // $ANTLR start "rule__Meta__Group__20"
    // InternalEntityDsl.g:899:1: rule__Meta__Group__20 : rule__Meta__Group__20__Impl rule__Meta__Group__21 ;
    public final void rule__Meta__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:903:1: ( rule__Meta__Group__20__Impl rule__Meta__Group__21 )
            // InternalEntityDsl.g:904:2: rule__Meta__Group__20__Impl rule__Meta__Group__21
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__20"


    // $ANTLR start "rule__Meta__Group__20__Impl"
    // InternalEntityDsl.g:911:1: rule__Meta__Group__20__Impl : ( 'textDomain' ) ;
    public final void rule__Meta__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:915:1: ( ( 'textDomain' ) )
            // InternalEntityDsl.g:916:1: ( 'textDomain' )
            {
            // InternalEntityDsl.g:916:1: ( 'textDomain' )
            // InternalEntityDsl.g:917:2: 'textDomain'
            {
             before(grammarAccess.getMetaAccess().getTextDomainKeyword_20()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getTextDomainKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__20__Impl"


    // $ANTLR start "rule__Meta__Group__21"
    // InternalEntityDsl.g:926:1: rule__Meta__Group__21 : rule__Meta__Group__21__Impl rule__Meta__Group__22 ;
    public final void rule__Meta__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:930:1: ( rule__Meta__Group__21__Impl rule__Meta__Group__22 )
            // InternalEntityDsl.g:931:2: rule__Meta__Group__21__Impl rule__Meta__Group__22
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__21"


    // $ANTLR start "rule__Meta__Group__21__Impl"
    // InternalEntityDsl.g:938:1: rule__Meta__Group__21__Impl : ( '=' ) ;
    public final void rule__Meta__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:942:1: ( ( '=' ) )
            // InternalEntityDsl.g:943:1: ( '=' )
            {
            // InternalEntityDsl.g:943:1: ( '=' )
            // InternalEntityDsl.g:944:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_21()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__21__Impl"


    // $ANTLR start "rule__Meta__Group__22"
    // InternalEntityDsl.g:953:1: rule__Meta__Group__22 : rule__Meta__Group__22__Impl rule__Meta__Group__23 ;
    public final void rule__Meta__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:957:1: ( rule__Meta__Group__22__Impl rule__Meta__Group__23 )
            // InternalEntityDsl.g:958:2: rule__Meta__Group__22__Impl rule__Meta__Group__23
            {
            pushFollow(FOLLOW_14);
            rule__Meta__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__22"


    // $ANTLR start "rule__Meta__Group__22__Impl"
    // InternalEntityDsl.g:965:1: rule__Meta__Group__22__Impl : ( ( rule__Meta__TextDomainAssignment_22 ) ) ;
    public final void rule__Meta__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:969:1: ( ( ( rule__Meta__TextDomainAssignment_22 ) ) )
            // InternalEntityDsl.g:970:1: ( ( rule__Meta__TextDomainAssignment_22 ) )
            {
            // InternalEntityDsl.g:970:1: ( ( rule__Meta__TextDomainAssignment_22 ) )
            // InternalEntityDsl.g:971:2: ( rule__Meta__TextDomainAssignment_22 )
            {
             before(grammarAccess.getMetaAccess().getTextDomainAssignment_22()); 
            // InternalEntityDsl.g:972:2: ( rule__Meta__TextDomainAssignment_22 )
            // InternalEntityDsl.g:972:3: rule__Meta__TextDomainAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Meta__TextDomainAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getTextDomainAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__22__Impl"


    // $ANTLR start "rule__Meta__Group__23"
    // InternalEntityDsl.g:980:1: rule__Meta__Group__23 : rule__Meta__Group__23__Impl rule__Meta__Group__24 ;
    public final void rule__Meta__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:984:1: ( rule__Meta__Group__23__Impl rule__Meta__Group__24 )
            // InternalEntityDsl.g:985:2: rule__Meta__Group__23__Impl rule__Meta__Group__24
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__23"


    // $ANTLR start "rule__Meta__Group__23__Impl"
    // InternalEntityDsl.g:992:1: rule__Meta__Group__23__Impl : ( 'activate' ) ;
    public final void rule__Meta__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:996:1: ( ( 'activate' ) )
            // InternalEntityDsl.g:997:1: ( 'activate' )
            {
            // InternalEntityDsl.g:997:1: ( 'activate' )
            // InternalEntityDsl.g:998:2: 'activate'
            {
             before(grammarAccess.getMetaAccess().getActivateKeyword_23()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getActivateKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__23__Impl"


    // $ANTLR start "rule__Meta__Group__24"
    // InternalEntityDsl.g:1007:1: rule__Meta__Group__24 : rule__Meta__Group__24__Impl rule__Meta__Group__25 ;
    public final void rule__Meta__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1011:1: ( rule__Meta__Group__24__Impl rule__Meta__Group__25 )
            // InternalEntityDsl.g:1012:2: rule__Meta__Group__24__Impl rule__Meta__Group__25
            {
            pushFollow(FOLLOW_15);
            rule__Meta__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__24"


    // $ANTLR start "rule__Meta__Group__24__Impl"
    // InternalEntityDsl.g:1019:1: rule__Meta__Group__24__Impl : ( '=' ) ;
    public final void rule__Meta__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1023:1: ( ( '=' ) )
            // InternalEntityDsl.g:1024:1: ( '=' )
            {
            // InternalEntityDsl.g:1024:1: ( '=' )
            // InternalEntityDsl.g:1025:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_24()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__24__Impl"


    // $ANTLR start "rule__Meta__Group__25"
    // InternalEntityDsl.g:1034:1: rule__Meta__Group__25 : rule__Meta__Group__25__Impl rule__Meta__Group__26 ;
    public final void rule__Meta__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1038:1: ( rule__Meta__Group__25__Impl rule__Meta__Group__26 )
            // InternalEntityDsl.g:1039:2: rule__Meta__Group__25__Impl rule__Meta__Group__26
            {
            pushFollow(FOLLOW_15);
            rule__Meta__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__25"


    // $ANTLR start "rule__Meta__Group__25__Impl"
    // InternalEntityDsl.g:1046:1: rule__Meta__Group__25__Impl : ( ( rule__Meta__ActivateAssignment_25 )? ) ;
    public final void rule__Meta__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1050:1: ( ( ( rule__Meta__ActivateAssignment_25 )? ) )
            // InternalEntityDsl.g:1051:1: ( ( rule__Meta__ActivateAssignment_25 )? )
            {
            // InternalEntityDsl.g:1051:1: ( ( rule__Meta__ActivateAssignment_25 )? )
            // InternalEntityDsl.g:1052:2: ( rule__Meta__ActivateAssignment_25 )?
            {
             before(grammarAccess.getMetaAccess().getActivateAssignment_25()); 
            // InternalEntityDsl.g:1053:2: ( rule__Meta__ActivateAssignment_25 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:1053:3: rule__Meta__ActivateAssignment_25
                    {
                    pushFollow(FOLLOW_2);
                    rule__Meta__ActivateAssignment_25();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaAccess().getActivateAssignment_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__25__Impl"


    // $ANTLR start "rule__Meta__Group__26"
    // InternalEntityDsl.g:1061:1: rule__Meta__Group__26 : rule__Meta__Group__26__Impl rule__Meta__Group__27 ;
    public final void rule__Meta__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1065:1: ( rule__Meta__Group__26__Impl rule__Meta__Group__27 )
            // InternalEntityDsl.g:1066:2: rule__Meta__Group__26__Impl rule__Meta__Group__27
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__26"


    // $ANTLR start "rule__Meta__Group__26__Impl"
    // InternalEntityDsl.g:1073:1: rule__Meta__Group__26__Impl : ( 'deactivate' ) ;
    public final void rule__Meta__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1077:1: ( ( 'deactivate' ) )
            // InternalEntityDsl.g:1078:1: ( 'deactivate' )
            {
            // InternalEntityDsl.g:1078:1: ( 'deactivate' )
            // InternalEntityDsl.g:1079:2: 'deactivate'
            {
             before(grammarAccess.getMetaAccess().getDeactivateKeyword_26()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getDeactivateKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__26__Impl"


    // $ANTLR start "rule__Meta__Group__27"
    // InternalEntityDsl.g:1088:1: rule__Meta__Group__27 : rule__Meta__Group__27__Impl rule__Meta__Group__28 ;
    public final void rule__Meta__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1092:1: ( rule__Meta__Group__27__Impl rule__Meta__Group__28 )
            // InternalEntityDsl.g:1093:2: rule__Meta__Group__27__Impl rule__Meta__Group__28
            {
            pushFollow(FOLLOW_16);
            rule__Meta__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__27"


    // $ANTLR start "rule__Meta__Group__27__Impl"
    // InternalEntityDsl.g:1100:1: rule__Meta__Group__27__Impl : ( '=' ) ;
    public final void rule__Meta__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1104:1: ( ( '=' ) )
            // InternalEntityDsl.g:1105:1: ( '=' )
            {
            // InternalEntityDsl.g:1105:1: ( '=' )
            // InternalEntityDsl.g:1106:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_27()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__27__Impl"


    // $ANTLR start "rule__Meta__Group__28"
    // InternalEntityDsl.g:1115:1: rule__Meta__Group__28 : rule__Meta__Group__28__Impl rule__Meta__Group__29 ;
    public final void rule__Meta__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1119:1: ( rule__Meta__Group__28__Impl rule__Meta__Group__29 )
            // InternalEntityDsl.g:1120:2: rule__Meta__Group__28__Impl rule__Meta__Group__29
            {
            pushFollow(FOLLOW_16);
            rule__Meta__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__28"


    // $ANTLR start "rule__Meta__Group__28__Impl"
    // InternalEntityDsl.g:1127:1: rule__Meta__Group__28__Impl : ( ( rule__Meta__DeactivateAssignment_28 )? ) ;
    public final void rule__Meta__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1131:1: ( ( ( rule__Meta__DeactivateAssignment_28 )? ) )
            // InternalEntityDsl.g:1132:1: ( ( rule__Meta__DeactivateAssignment_28 )? )
            {
            // InternalEntityDsl.g:1132:1: ( ( rule__Meta__DeactivateAssignment_28 )? )
            // InternalEntityDsl.g:1133:2: ( rule__Meta__DeactivateAssignment_28 )?
            {
             before(grammarAccess.getMetaAccess().getDeactivateAssignment_28()); 
            // InternalEntityDsl.g:1134:2: ( rule__Meta__DeactivateAssignment_28 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:1134:3: rule__Meta__DeactivateAssignment_28
                    {
                    pushFollow(FOLLOW_2);
                    rule__Meta__DeactivateAssignment_28();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaAccess().getDeactivateAssignment_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__28__Impl"


    // $ANTLR start "rule__Meta__Group__29"
    // InternalEntityDsl.g:1142:1: rule__Meta__Group__29 : rule__Meta__Group__29__Impl rule__Meta__Group__30 ;
    public final void rule__Meta__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1146:1: ( rule__Meta__Group__29__Impl rule__Meta__Group__30 )
            // InternalEntityDsl.g:1147:2: rule__Meta__Group__29__Impl rule__Meta__Group__30
            {
            pushFollow(FOLLOW_6);
            rule__Meta__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__29"


    // $ANTLR start "rule__Meta__Group__29__Impl"
    // InternalEntityDsl.g:1154:1: rule__Meta__Group__29__Impl : ( 'uninstall' ) ;
    public final void rule__Meta__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1158:1: ( ( 'uninstall' ) )
            // InternalEntityDsl.g:1159:1: ( 'uninstall' )
            {
            // InternalEntityDsl.g:1159:1: ( 'uninstall' )
            // InternalEntityDsl.g:1160:2: 'uninstall'
            {
             before(grammarAccess.getMetaAccess().getUninstallKeyword_29()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getUninstallKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__29__Impl"


    // $ANTLR start "rule__Meta__Group__30"
    // InternalEntityDsl.g:1169:1: rule__Meta__Group__30 : rule__Meta__Group__30__Impl rule__Meta__Group__31 ;
    public final void rule__Meta__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1173:1: ( rule__Meta__Group__30__Impl rule__Meta__Group__31 )
            // InternalEntityDsl.g:1174:2: rule__Meta__Group__30__Impl rule__Meta__Group__31
            {
            pushFollow(FOLLOW_17);
            rule__Meta__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__30"


    // $ANTLR start "rule__Meta__Group__30__Impl"
    // InternalEntityDsl.g:1181:1: rule__Meta__Group__30__Impl : ( '=' ) ;
    public final void rule__Meta__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1185:1: ( ( '=' ) )
            // InternalEntityDsl.g:1186:1: ( '=' )
            {
            // InternalEntityDsl.g:1186:1: ( '=' )
            // InternalEntityDsl.g:1187:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_30()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__30__Impl"


    // $ANTLR start "rule__Meta__Group__31"
    // InternalEntityDsl.g:1196:1: rule__Meta__Group__31 : rule__Meta__Group__31__Impl rule__Meta__Group__32 ;
    public final void rule__Meta__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1200:1: ( rule__Meta__Group__31__Impl rule__Meta__Group__32 )
            // InternalEntityDsl.g:1201:2: rule__Meta__Group__31__Impl rule__Meta__Group__32
            {
            pushFollow(FOLLOW_17);
            rule__Meta__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__32();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__31"


    // $ANTLR start "rule__Meta__Group__31__Impl"
    // InternalEntityDsl.g:1208:1: rule__Meta__Group__31__Impl : ( ( rule__Meta__UninstallAssignment_31 )? ) ;
    public final void rule__Meta__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1212:1: ( ( ( rule__Meta__UninstallAssignment_31 )? ) )
            // InternalEntityDsl.g:1213:1: ( ( rule__Meta__UninstallAssignment_31 )? )
            {
            // InternalEntityDsl.g:1213:1: ( ( rule__Meta__UninstallAssignment_31 )? )
            // InternalEntityDsl.g:1214:2: ( rule__Meta__UninstallAssignment_31 )?
            {
             before(grammarAccess.getMetaAccess().getUninstallAssignment_31()); 
            // InternalEntityDsl.g:1215:2: ( rule__Meta__UninstallAssignment_31 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:1215:3: rule__Meta__UninstallAssignment_31
                    {
                    pushFollow(FOLLOW_2);
                    rule__Meta__UninstallAssignment_31();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaAccess().getUninstallAssignment_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__31__Impl"


    // $ANTLR start "rule__Meta__Group__32"
    // InternalEntityDsl.g:1223:1: rule__Meta__Group__32 : rule__Meta__Group__32__Impl ;
    public final void rule__Meta__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1227:1: ( rule__Meta__Group__32__Impl )
            // InternalEntityDsl.g:1228:2: rule__Meta__Group__32__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group__32__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__32"


    // $ANTLR start "rule__Meta__Group__32__Impl"
    // InternalEntityDsl.g:1234:1: rule__Meta__Group__32__Impl : ( '}' ) ;
    public final void rule__Meta__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1238:1: ( ( '}' ) )
            // InternalEntityDsl.g:1239:1: ( '}' )
            {
            // InternalEntityDsl.g:1239:1: ( '}' )
            // InternalEntityDsl.g:1240:2: '}'
            {
             before(grammarAccess.getMetaAccess().getRightCurlyBracketKeyword_32()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getRightCurlyBracketKeyword_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__32__Impl"


    // $ANTLR start "rule__Widget__Group__0"
    // InternalEntityDsl.g:1250:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1254:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalEntityDsl.g:1255:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Widget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__0"


    // $ANTLR start "rule__Widget__Group__0__Impl"
    // InternalEntityDsl.g:1262:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1266:1: ( ( 'Widget' ) )
            // InternalEntityDsl.g:1267:1: ( 'Widget' )
            {
            // InternalEntityDsl.g:1267:1: ( 'Widget' )
            // InternalEntityDsl.g:1268:2: 'Widget'
            {
             before(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__0__Impl"


    // $ANTLR start "rule__Widget__Group__1"
    // InternalEntityDsl.g:1277:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1281:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalEntityDsl.g:1282:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Widget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__1"


    // $ANTLR start "rule__Widget__Group__1__Impl"
    // InternalEntityDsl.g:1289:1: rule__Widget__Group__1__Impl : ( '{' ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1293:1: ( ( '{' ) )
            // InternalEntityDsl.g:1294:1: ( '{' )
            {
            // InternalEntityDsl.g:1294:1: ( '{' )
            // InternalEntityDsl.g:1295:2: '{'
            {
             before(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__1__Impl"


    // $ANTLR start "rule__Widget__Group__2"
    // InternalEntityDsl.g:1304:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1308:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalEntityDsl.g:1309:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Widget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__2"


    // $ANTLR start "rule__Widget__Group__2__Impl"
    // InternalEntityDsl.g:1316:1: rule__Widget__Group__2__Impl : ( 'widgetName' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1320:1: ( ( 'widgetName' ) )
            // InternalEntityDsl.g:1321:1: ( 'widgetName' )
            {
            // InternalEntityDsl.g:1321:1: ( 'widgetName' )
            // InternalEntityDsl.g:1322:2: 'widgetName'
            {
             before(grammarAccess.getWidgetAccess().getWidgetNameKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getWidgetNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__2__Impl"


    // $ANTLR start "rule__Widget__Group__3"
    // InternalEntityDsl.g:1331:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1335:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalEntityDsl.g:1336:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Widget__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__3"


    // $ANTLR start "rule__Widget__Group__3__Impl"
    // InternalEntityDsl.g:1343:1: rule__Widget__Group__3__Impl : ( '=' ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1347:1: ( ( '=' ) )
            // InternalEntityDsl.g:1348:1: ( '=' )
            {
            // InternalEntityDsl.g:1348:1: ( '=' )
            // InternalEntityDsl.g:1349:2: '='
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__3__Impl"


    // $ANTLR start "rule__Widget__Group__4"
    // InternalEntityDsl.g:1358:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1362:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalEntityDsl.g:1363:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Widget__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__4"


    // $ANTLR start "rule__Widget__Group__4__Impl"
    // InternalEntityDsl.g:1370:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__WidgetNameAssignment_4 ) ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1374:1: ( ( ( rule__Widget__WidgetNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1375:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1375:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            // InternalEntityDsl.g:1376:2: ( rule__Widget__WidgetNameAssignment_4 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetNameAssignment_4()); 
            // InternalEntityDsl.g:1377:2: ( rule__Widget__WidgetNameAssignment_4 )
            // InternalEntityDsl.g:1377:3: rule__Widget__WidgetNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgetNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__4__Impl"


    // $ANTLR start "rule__Widget__Group__5"
    // InternalEntityDsl.g:1385:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl rule__Widget__Group__6 ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1389:1: ( rule__Widget__Group__5__Impl rule__Widget__Group__6 )
            // InternalEntityDsl.g:1390:2: rule__Widget__Group__5__Impl rule__Widget__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Widget__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__5"


    // $ANTLR start "rule__Widget__Group__5__Impl"
    // InternalEntityDsl.g:1397:1: rule__Widget__Group__5__Impl : ( 'widgetDescription' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1401:1: ( ( 'widgetDescription' ) )
            // InternalEntityDsl.g:1402:1: ( 'widgetDescription' )
            {
            // InternalEntityDsl.g:1402:1: ( 'widgetDescription' )
            // InternalEntityDsl.g:1403:2: 'widgetDescription'
            {
             before(grammarAccess.getWidgetAccess().getWidgetDescriptionKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getWidgetDescriptionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__5__Impl"


    // $ANTLR start "rule__Widget__Group__6"
    // InternalEntityDsl.g:1412:1: rule__Widget__Group__6 : rule__Widget__Group__6__Impl rule__Widget__Group__7 ;
    public final void rule__Widget__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1416:1: ( rule__Widget__Group__6__Impl rule__Widget__Group__7 )
            // InternalEntityDsl.g:1417:2: rule__Widget__Group__6__Impl rule__Widget__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Widget__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__6"


    // $ANTLR start "rule__Widget__Group__6__Impl"
    // InternalEntityDsl.g:1424:1: rule__Widget__Group__6__Impl : ( '=' ) ;
    public final void rule__Widget__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1428:1: ( ( '=' ) )
            // InternalEntityDsl.g:1429:1: ( '=' )
            {
            // InternalEntityDsl.g:1429:1: ( '=' )
            // InternalEntityDsl.g:1430:2: '='
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__6__Impl"


    // $ANTLR start "rule__Widget__Group__7"
    // InternalEntityDsl.g:1439:1: rule__Widget__Group__7 : rule__Widget__Group__7__Impl rule__Widget__Group__8 ;
    public final void rule__Widget__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1443:1: ( rule__Widget__Group__7__Impl rule__Widget__Group__8 )
            // InternalEntityDsl.g:1444:2: rule__Widget__Group__7__Impl rule__Widget__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Widget__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__7"


    // $ANTLR start "rule__Widget__Group__7__Impl"
    // InternalEntityDsl.g:1451:1: rule__Widget__Group__7__Impl : ( ( rule__Widget__WidgetDescriptionAssignment_7 )? ) ;
    public final void rule__Widget__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1455:1: ( ( ( rule__Widget__WidgetDescriptionAssignment_7 )? ) )
            // InternalEntityDsl.g:1456:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 )? )
            {
            // InternalEntityDsl.g:1456:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 )? )
            // InternalEntityDsl.g:1457:2: ( rule__Widget__WidgetDescriptionAssignment_7 )?
            {
             before(grammarAccess.getWidgetAccess().getWidgetDescriptionAssignment_7()); 
            // InternalEntityDsl.g:1458:2: ( rule__Widget__WidgetDescriptionAssignment_7 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:1458:3: rule__Widget__WidgetDescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Widget__WidgetDescriptionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWidgetAccess().getWidgetDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__7__Impl"


    // $ANTLR start "rule__Widget__Group__8"
    // InternalEntityDsl.g:1466:1: rule__Widget__Group__8 : rule__Widget__Group__8__Impl rule__Widget__Group__9 ;
    public final void rule__Widget__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1470:1: ( rule__Widget__Group__8__Impl rule__Widget__Group__9 )
            // InternalEntityDsl.g:1471:2: rule__Widget__Group__8__Impl rule__Widget__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Widget__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__8"


    // $ANTLR start "rule__Widget__Group__8__Impl"
    // InternalEntityDsl.g:1478:1: rule__Widget__Group__8__Impl : ( ( rule__Widget__SettingsAssignment_8 )* ) ;
    public final void rule__Widget__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1482:1: ( ( ( rule__Widget__SettingsAssignment_8 )* ) )
            // InternalEntityDsl.g:1483:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            {
            // InternalEntityDsl.g:1483:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            // InternalEntityDsl.g:1484:2: ( rule__Widget__SettingsAssignment_8 )*
            {
             before(grammarAccess.getWidgetAccess().getSettingsAssignment_8()); 
            // InternalEntityDsl.g:1485:2: ( rule__Widget__SettingsAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:1485:3: rule__Widget__SettingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Widget__SettingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWidgetAccess().getSettingsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__8__Impl"


    // $ANTLR start "rule__Widget__Group__9"
    // InternalEntityDsl.g:1493:1: rule__Widget__Group__9 : rule__Widget__Group__9__Impl ;
    public final void rule__Widget__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1497:1: ( rule__Widget__Group__9__Impl )
            // InternalEntityDsl.g:1498:2: rule__Widget__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__9"


    // $ANTLR start "rule__Widget__Group__9__Impl"
    // InternalEntityDsl.g:1504:1: rule__Widget__Group__9__Impl : ( '}' ) ;
    public final void rule__Widget__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1508:1: ( ( '}' ) )
            // InternalEntityDsl.g:1509:1: ( '}' )
            {
            // InternalEntityDsl.g:1509:1: ( '}' )
            // InternalEntityDsl.g:1510:2: '}'
            {
             before(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__9__Impl"


    // $ANTLR start "rule__Shortcode__Group__0"
    // InternalEntityDsl.g:1520:1: rule__Shortcode__Group__0 : rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 ;
    public final void rule__Shortcode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1524:1: ( rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 )
            // InternalEntityDsl.g:1525:2: rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Shortcode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__0"


    // $ANTLR start "rule__Shortcode__Group__0__Impl"
    // InternalEntityDsl.g:1532:1: rule__Shortcode__Group__0__Impl : ( 'Shortcode' ) ;
    public final void rule__Shortcode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1536:1: ( ( 'Shortcode' ) )
            // InternalEntityDsl.g:1537:1: ( 'Shortcode' )
            {
            // InternalEntityDsl.g:1537:1: ( 'Shortcode' )
            // InternalEntityDsl.g:1538:2: 'Shortcode'
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getShortcodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__0__Impl"


    // $ANTLR start "rule__Shortcode__Group__1"
    // InternalEntityDsl.g:1547:1: rule__Shortcode__Group__1 : rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 ;
    public final void rule__Shortcode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1551:1: ( rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 )
            // InternalEntityDsl.g:1552:2: rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Shortcode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__1"


    // $ANTLR start "rule__Shortcode__Group__1__Impl"
    // InternalEntityDsl.g:1559:1: rule__Shortcode__Group__1__Impl : ( '{' ) ;
    public final void rule__Shortcode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1563:1: ( ( '{' ) )
            // InternalEntityDsl.g:1564:1: ( '{' )
            {
            // InternalEntityDsl.g:1564:1: ( '{' )
            // InternalEntityDsl.g:1565:2: '{'
            {
             before(grammarAccess.getShortcodeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__1__Impl"


    // $ANTLR start "rule__Shortcode__Group__2"
    // InternalEntityDsl.g:1574:1: rule__Shortcode__Group__2 : rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 ;
    public final void rule__Shortcode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1578:1: ( rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 )
            // InternalEntityDsl.g:1579:2: rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Shortcode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__2"


    // $ANTLR start "rule__Shortcode__Group__2__Impl"
    // InternalEntityDsl.g:1586:1: rule__Shortcode__Group__2__Impl : ( 'shortcodeName' ) ;
    public final void rule__Shortcode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1590:1: ( ( 'shortcodeName' ) )
            // InternalEntityDsl.g:1591:1: ( 'shortcodeName' )
            {
            // InternalEntityDsl.g:1591:1: ( 'shortcodeName' )
            // InternalEntityDsl.g:1592:2: 'shortcodeName'
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeNameKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getShortcodeNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__2__Impl"


    // $ANTLR start "rule__Shortcode__Group__3"
    // InternalEntityDsl.g:1601:1: rule__Shortcode__Group__3 : rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 ;
    public final void rule__Shortcode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1605:1: ( rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 )
            // InternalEntityDsl.g:1606:2: rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Shortcode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__3"


    // $ANTLR start "rule__Shortcode__Group__3__Impl"
    // InternalEntityDsl.g:1613:1: rule__Shortcode__Group__3__Impl : ( '=' ) ;
    public final void rule__Shortcode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1617:1: ( ( '=' ) )
            // InternalEntityDsl.g:1618:1: ( '=' )
            {
            // InternalEntityDsl.g:1618:1: ( '=' )
            // InternalEntityDsl.g:1619:2: '='
            {
             before(grammarAccess.getShortcodeAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__3__Impl"


    // $ANTLR start "rule__Shortcode__Group__4"
    // InternalEntityDsl.g:1628:1: rule__Shortcode__Group__4 : rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 ;
    public final void rule__Shortcode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1632:1: ( rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 )
            // InternalEntityDsl.g:1633:2: rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Shortcode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__4"


    // $ANTLR start "rule__Shortcode__Group__4__Impl"
    // InternalEntityDsl.g:1640:1: rule__Shortcode__Group__4__Impl : ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) ;
    public final void rule__Shortcode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1644:1: ( ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1645:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1645:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            // InternalEntityDsl.g:1646:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeNameAssignment_4()); 
            // InternalEntityDsl.g:1647:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            // InternalEntityDsl.g:1647:3: rule__Shortcode__ShortcodeNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Shortcode__ShortcodeNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getShortcodeAccess().getShortcodeNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__4__Impl"


    // $ANTLR start "rule__Shortcode__Group__5"
    // InternalEntityDsl.g:1655:1: rule__Shortcode__Group__5 : rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 ;
    public final void rule__Shortcode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1659:1: ( rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 )
            // InternalEntityDsl.g:1660:2: rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Shortcode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__5"


    // $ANTLR start "rule__Shortcode__Group__5__Impl"
    // InternalEntityDsl.g:1667:1: rule__Shortcode__Group__5__Impl : ( ( rule__Shortcode__SettingsAssignment_5 )* ) ;
    public final void rule__Shortcode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1671:1: ( ( ( rule__Shortcode__SettingsAssignment_5 )* ) )
            // InternalEntityDsl.g:1672:1: ( ( rule__Shortcode__SettingsAssignment_5 )* )
            {
            // InternalEntityDsl.g:1672:1: ( ( rule__Shortcode__SettingsAssignment_5 )* )
            // InternalEntityDsl.g:1673:2: ( rule__Shortcode__SettingsAssignment_5 )*
            {
             before(grammarAccess.getShortcodeAccess().getSettingsAssignment_5()); 
            // InternalEntityDsl.g:1674:2: ( rule__Shortcode__SettingsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:1674:3: rule__Shortcode__SettingsAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Shortcode__SettingsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getShortcodeAccess().getSettingsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__5__Impl"


    // $ANTLR start "rule__Shortcode__Group__6"
    // InternalEntityDsl.g:1682:1: rule__Shortcode__Group__6 : rule__Shortcode__Group__6__Impl ;
    public final void rule__Shortcode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1686:1: ( rule__Shortcode__Group__6__Impl )
            // InternalEntityDsl.g:1687:2: rule__Shortcode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__6"


    // $ANTLR start "rule__Shortcode__Group__6__Impl"
    // InternalEntityDsl.g:1693:1: rule__Shortcode__Group__6__Impl : ( '}' ) ;
    public final void rule__Shortcode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1697:1: ( ( '}' ) )
            // InternalEntityDsl.g:1698:1: ( '}' )
            {
            // InternalEntityDsl.g:1698:1: ( '}' )
            // InternalEntityDsl.g:1699:2: '}'
            {
             before(grammarAccess.getShortcodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__6__Impl"


    // $ANTLR start "rule__CustomPostType__Group__0"
    // InternalEntityDsl.g:1709:1: rule__CustomPostType__Group__0 : rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 ;
    public final void rule__CustomPostType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1713:1: ( rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 )
            // InternalEntityDsl.g:1714:2: rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CustomPostType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__0"


    // $ANTLR start "rule__CustomPostType__Group__0__Impl"
    // InternalEntityDsl.g:1721:1: rule__CustomPostType__Group__0__Impl : ( 'CustomPostType' ) ;
    public final void rule__CustomPostType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1725:1: ( ( 'CustomPostType' ) )
            // InternalEntityDsl.g:1726:1: ( 'CustomPostType' )
            {
            // InternalEntityDsl.g:1726:1: ( 'CustomPostType' )
            // InternalEntityDsl.g:1727:2: 'CustomPostType'
            {
             before(grammarAccess.getCustomPostTypeAccess().getCustomPostTypeKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getCustomPostTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__0__Impl"


    // $ANTLR start "rule__CustomPostType__Group__1"
    // InternalEntityDsl.g:1736:1: rule__CustomPostType__Group__1 : rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 ;
    public final void rule__CustomPostType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1740:1: ( rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 )
            // InternalEntityDsl.g:1741:2: rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__CustomPostType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__1"


    // $ANTLR start "rule__CustomPostType__Group__1__Impl"
    // InternalEntityDsl.g:1748:1: rule__CustomPostType__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomPostType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1752:1: ( ( '{' ) )
            // InternalEntityDsl.g:1753:1: ( '{' )
            {
            // InternalEntityDsl.g:1753:1: ( '{' )
            // InternalEntityDsl.g:1754:2: '{'
            {
             before(grammarAccess.getCustomPostTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__1__Impl"


    // $ANTLR start "rule__CustomPostType__Group__2"
    // InternalEntityDsl.g:1763:1: rule__CustomPostType__Group__2 : rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 ;
    public final void rule__CustomPostType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1767:1: ( rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 )
            // InternalEntityDsl.g:1768:2: rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CustomPostType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__2"


    // $ANTLR start "rule__CustomPostType__Group__2__Impl"
    // InternalEntityDsl.g:1775:1: rule__CustomPostType__Group__2__Impl : ( 'cptName' ) ;
    public final void rule__CustomPostType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1779:1: ( ( 'cptName' ) )
            // InternalEntityDsl.g:1780:1: ( 'cptName' )
            {
            // InternalEntityDsl.g:1780:1: ( 'cptName' )
            // InternalEntityDsl.g:1781:2: 'cptName'
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptNameKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getCptNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__2__Impl"


    // $ANTLR start "rule__CustomPostType__Group__3"
    // InternalEntityDsl.g:1790:1: rule__CustomPostType__Group__3 : rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 ;
    public final void rule__CustomPostType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1794:1: ( rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 )
            // InternalEntityDsl.g:1795:2: rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CustomPostType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__3"


    // $ANTLR start "rule__CustomPostType__Group__3__Impl"
    // InternalEntityDsl.g:1802:1: rule__CustomPostType__Group__3__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1806:1: ( ( '=' ) )
            // InternalEntityDsl.g:1807:1: ( '=' )
            {
            // InternalEntityDsl.g:1807:1: ( '=' )
            // InternalEntityDsl.g:1808:2: '='
            {
             before(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__3__Impl"


    // $ANTLR start "rule__CustomPostType__Group__4"
    // InternalEntityDsl.g:1817:1: rule__CustomPostType__Group__4 : rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 ;
    public final void rule__CustomPostType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1821:1: ( rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 )
            // InternalEntityDsl.g:1822:2: rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__CustomPostType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__4"


    // $ANTLR start "rule__CustomPostType__Group__4__Impl"
    // InternalEntityDsl.g:1829:1: rule__CustomPostType__Group__4__Impl : ( ( rule__CustomPostType__CptNameAssignment_4 ) ) ;
    public final void rule__CustomPostType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1833:1: ( ( ( rule__CustomPostType__CptNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1834:1: ( ( rule__CustomPostType__CptNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1834:1: ( ( rule__CustomPostType__CptNameAssignment_4 ) )
            // InternalEntityDsl.g:1835:2: ( rule__CustomPostType__CptNameAssignment_4 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptNameAssignment_4()); 
            // InternalEntityDsl.g:1836:2: ( rule__CustomPostType__CptNameAssignment_4 )
            // InternalEntityDsl.g:1836:3: rule__CustomPostType__CptNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CustomPostType__CptNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomPostTypeAccess().getCptNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__4__Impl"


    // $ANTLR start "rule__CustomPostType__Group__5"
    // InternalEntityDsl.g:1844:1: rule__CustomPostType__Group__5 : rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 ;
    public final void rule__CustomPostType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1848:1: ( rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 )
            // InternalEntityDsl.g:1849:2: rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__CustomPostType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__5"


    // $ANTLR start "rule__CustomPostType__Group__5__Impl"
    // InternalEntityDsl.g:1856:1: rule__CustomPostType__Group__5__Impl : ( 'cptSingularName' ) ;
    public final void rule__CustomPostType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1860:1: ( ( 'cptSingularName' ) )
            // InternalEntityDsl.g:1861:1: ( 'cptSingularName' )
            {
            // InternalEntityDsl.g:1861:1: ( 'cptSingularName' )
            // InternalEntityDsl.g:1862:2: 'cptSingularName'
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSingularNameKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getCptSingularNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__5__Impl"


    // $ANTLR start "rule__CustomPostType__Group__6"
    // InternalEntityDsl.g:1871:1: rule__CustomPostType__Group__6 : rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 ;
    public final void rule__CustomPostType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1875:1: ( rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 )
            // InternalEntityDsl.g:1876:2: rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__CustomPostType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__6"


    // $ANTLR start "rule__CustomPostType__Group__6__Impl"
    // InternalEntityDsl.g:1883:1: rule__CustomPostType__Group__6__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1887:1: ( ( '=' ) )
            // InternalEntityDsl.g:1888:1: ( '=' )
            {
            // InternalEntityDsl.g:1888:1: ( '=' )
            // InternalEntityDsl.g:1889:2: '='
            {
             before(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__6__Impl"


    // $ANTLR start "rule__CustomPostType__Group__7"
    // InternalEntityDsl.g:1898:1: rule__CustomPostType__Group__7 : rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 ;
    public final void rule__CustomPostType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1902:1: ( rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 )
            // InternalEntityDsl.g:1903:2: rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__CustomPostType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__7"


    // $ANTLR start "rule__CustomPostType__Group__7__Impl"
    // InternalEntityDsl.g:1910:1: rule__CustomPostType__Group__7__Impl : ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) ) ;
    public final void rule__CustomPostType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1914:1: ( ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) ) )
            // InternalEntityDsl.g:1915:1: ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) )
            {
            // InternalEntityDsl.g:1915:1: ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) )
            // InternalEntityDsl.g:1916:2: ( rule__CustomPostType__CptSingularNameAssignment_7 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSingularNameAssignment_7()); 
            // InternalEntityDsl.g:1917:2: ( rule__CustomPostType__CptSingularNameAssignment_7 )
            // InternalEntityDsl.g:1917:3: rule__CustomPostType__CptSingularNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CustomPostType__CptSingularNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCustomPostTypeAccess().getCptSingularNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__7__Impl"


    // $ANTLR start "rule__CustomPostType__Group__8"
    // InternalEntityDsl.g:1925:1: rule__CustomPostType__Group__8 : rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 ;
    public final void rule__CustomPostType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1929:1: ( rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 )
            // InternalEntityDsl.g:1930:2: rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__CustomPostType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__8"


    // $ANTLR start "rule__CustomPostType__Group__8__Impl"
    // InternalEntityDsl.g:1937:1: rule__CustomPostType__Group__8__Impl : ( 'cptSupports' ) ;
    public final void rule__CustomPostType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1941:1: ( ( 'cptSupports' ) )
            // InternalEntityDsl.g:1942:1: ( 'cptSupports' )
            {
            // InternalEntityDsl.g:1942:1: ( 'cptSupports' )
            // InternalEntityDsl.g:1943:2: 'cptSupports'
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSupportsKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getCptSupportsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__8__Impl"


    // $ANTLR start "rule__CustomPostType__Group__9"
    // InternalEntityDsl.g:1952:1: rule__CustomPostType__Group__9 : rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 ;
    public final void rule__CustomPostType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1956:1: ( rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 )
            // InternalEntityDsl.g:1957:2: rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__CustomPostType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__9"


    // $ANTLR start "rule__CustomPostType__Group__9__Impl"
    // InternalEntityDsl.g:1964:1: rule__CustomPostType__Group__9__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1968:1: ( ( '=' ) )
            // InternalEntityDsl.g:1969:1: ( '=' )
            {
            // InternalEntityDsl.g:1969:1: ( '=' )
            // InternalEntityDsl.g:1970:2: '='
            {
             before(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__9__Impl"


    // $ANTLR start "rule__CustomPostType__Group__10"
    // InternalEntityDsl.g:1979:1: rule__CustomPostType__Group__10 : rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 ;
    public final void rule__CustomPostType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1983:1: ( rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 )
            // InternalEntityDsl.g:1984:2: rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__CustomPostType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__10"


    // $ANTLR start "rule__CustomPostType__Group__10__Impl"
    // InternalEntityDsl.g:1991:1: rule__CustomPostType__Group__10__Impl : ( ( rule__CustomPostType__CptSupportsAssignment_10 )? ) ;
    public final void rule__CustomPostType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1995:1: ( ( ( rule__CustomPostType__CptSupportsAssignment_10 )? ) )
            // InternalEntityDsl.g:1996:1: ( ( rule__CustomPostType__CptSupportsAssignment_10 )? )
            {
            // InternalEntityDsl.g:1996:1: ( ( rule__CustomPostType__CptSupportsAssignment_10 )? )
            // InternalEntityDsl.g:1997:2: ( rule__CustomPostType__CptSupportsAssignment_10 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSupportsAssignment_10()); 
            // InternalEntityDsl.g:1998:2: ( rule__CustomPostType__CptSupportsAssignment_10 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEntityDsl.g:1998:3: rule__CustomPostType__CptSupportsAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomPostType__CptSupportsAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomPostTypeAccess().getCptSupportsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__10__Impl"


    // $ANTLR start "rule__CustomPostType__Group__11"
    // InternalEntityDsl.g:2006:1: rule__CustomPostType__Group__11 : rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12 ;
    public final void rule__CustomPostType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2010:1: ( rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12 )
            // InternalEntityDsl.g:2011:2: rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__CustomPostType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__11"


    // $ANTLR start "rule__CustomPostType__Group__11__Impl"
    // InternalEntityDsl.g:2018:1: rule__CustomPostType__Group__11__Impl : ( 'cptTaxonomies' ) ;
    public final void rule__CustomPostType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2022:1: ( ( 'cptTaxonomies' ) )
            // InternalEntityDsl.g:2023:1: ( 'cptTaxonomies' )
            {
            // InternalEntityDsl.g:2023:1: ( 'cptTaxonomies' )
            // InternalEntityDsl.g:2024:2: 'cptTaxonomies'
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesKeyword_11()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__11__Impl"


    // $ANTLR start "rule__CustomPostType__Group__12"
    // InternalEntityDsl.g:2033:1: rule__CustomPostType__Group__12 : rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13 ;
    public final void rule__CustomPostType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2037:1: ( rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13 )
            // InternalEntityDsl.g:2038:2: rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13
            {
            pushFollow(FOLLOW_17);
            rule__CustomPostType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__12"


    // $ANTLR start "rule__CustomPostType__Group__12__Impl"
    // InternalEntityDsl.g:2045:1: rule__CustomPostType__Group__12__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2049:1: ( ( '=' ) )
            // InternalEntityDsl.g:2050:1: ( '=' )
            {
            // InternalEntityDsl.g:2050:1: ( '=' )
            // InternalEntityDsl.g:2051:2: '='
            {
             before(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__12__Impl"


    // $ANTLR start "rule__CustomPostType__Group__13"
    // InternalEntityDsl.g:2060:1: rule__CustomPostType__Group__13 : rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14 ;
    public final void rule__CustomPostType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2064:1: ( rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14 )
            // InternalEntityDsl.g:2065:2: rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14
            {
            pushFollow(FOLLOW_17);
            rule__CustomPostType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__13"


    // $ANTLR start "rule__CustomPostType__Group__13__Impl"
    // InternalEntityDsl.g:2072:1: rule__CustomPostType__Group__13__Impl : ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? ) ;
    public final void rule__CustomPostType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2076:1: ( ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? ) )
            // InternalEntityDsl.g:2077:1: ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? )
            {
            // InternalEntityDsl.g:2077:1: ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? )
            // InternalEntityDsl.g:2078:2: ( rule__CustomPostType__CptTaxonomiesAssignment_13 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesAssignment_13()); 
            // InternalEntityDsl.g:2079:2: ( rule__CustomPostType__CptTaxonomiesAssignment_13 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEntityDsl.g:2079:3: rule__CustomPostType__CptTaxonomiesAssignment_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomPostType__CptTaxonomiesAssignment_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__13__Impl"


    // $ANTLR start "rule__CustomPostType__Group__14"
    // InternalEntityDsl.g:2087:1: rule__CustomPostType__Group__14 : rule__CustomPostType__Group__14__Impl ;
    public final void rule__CustomPostType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2091:1: ( rule__CustomPostType__Group__14__Impl )
            // InternalEntityDsl.g:2092:2: rule__CustomPostType__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__14"


    // $ANTLR start "rule__CustomPostType__Group__14__Impl"
    // InternalEntityDsl.g:2098:1: rule__CustomPostType__Group__14__Impl : ( '}' ) ;
    public final void rule__CustomPostType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2102:1: ( ( '}' ) )
            // InternalEntityDsl.g:2103:1: ( '}' )
            {
            // InternalEntityDsl.g:2103:1: ( '}' )
            // InternalEntityDsl.g:2104:2: '}'
            {
             before(grammarAccess.getCustomPostTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__Group__14__Impl"


    // $ANTLR start "rule__Setting__Group__0"
    // InternalEntityDsl.g:2114:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2118:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalEntityDsl.g:2119:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Setting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0"


    // $ANTLR start "rule__Setting__Group__0__Impl"
    // InternalEntityDsl.g:2126:1: rule__Setting__Group__0__Impl : ( 'Setting' ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2130:1: ( ( 'Setting' ) )
            // InternalEntityDsl.g:2131:1: ( 'Setting' )
            {
            // InternalEntityDsl.g:2131:1: ( 'Setting' )
            // InternalEntityDsl.g:2132:2: 'Setting'
            {
             before(grammarAccess.getSettingAccess().getSettingKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSettingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0__Impl"


    // $ANTLR start "rule__Setting__Group__1"
    // InternalEntityDsl.g:2141:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2145:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalEntityDsl.g:2146:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Setting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1"


    // $ANTLR start "rule__Setting__Group__1__Impl"
    // InternalEntityDsl.g:2153:1: rule__Setting__Group__1__Impl : ( '{' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2157:1: ( ( '{' ) )
            // InternalEntityDsl.g:2158:1: ( '{' )
            {
            // InternalEntityDsl.g:2158:1: ( '{' )
            // InternalEntityDsl.g:2159:2: '{'
            {
             before(grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1__Impl"


    // $ANTLR start "rule__Setting__Group__2"
    // InternalEntityDsl.g:2168:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl rule__Setting__Group__3 ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2172:1: ( rule__Setting__Group__2__Impl rule__Setting__Group__3 )
            // InternalEntityDsl.g:2173:2: rule__Setting__Group__2__Impl rule__Setting__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Setting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2"


    // $ANTLR start "rule__Setting__Group__2__Impl"
    // InternalEntityDsl.g:2180:1: rule__Setting__Group__2__Impl : ( 'settingName' ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2184:1: ( ( 'settingName' ) )
            // InternalEntityDsl.g:2185:1: ( 'settingName' )
            {
            // InternalEntityDsl.g:2185:1: ( 'settingName' )
            // InternalEntityDsl.g:2186:2: 'settingName'
            {
             before(grammarAccess.getSettingAccess().getSettingNameKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSettingNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2__Impl"


    // $ANTLR start "rule__Setting__Group__3"
    // InternalEntityDsl.g:2195:1: rule__Setting__Group__3 : rule__Setting__Group__3__Impl rule__Setting__Group__4 ;
    public final void rule__Setting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2199:1: ( rule__Setting__Group__3__Impl rule__Setting__Group__4 )
            // InternalEntityDsl.g:2200:2: rule__Setting__Group__3__Impl rule__Setting__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Setting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__3"


    // $ANTLR start "rule__Setting__Group__3__Impl"
    // InternalEntityDsl.g:2207:1: rule__Setting__Group__3__Impl : ( '=' ) ;
    public final void rule__Setting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2211:1: ( ( '=' ) )
            // InternalEntityDsl.g:2212:1: ( '=' )
            {
            // InternalEntityDsl.g:2212:1: ( '=' )
            // InternalEntityDsl.g:2213:2: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__3__Impl"


    // $ANTLR start "rule__Setting__Group__4"
    // InternalEntityDsl.g:2222:1: rule__Setting__Group__4 : rule__Setting__Group__4__Impl rule__Setting__Group__5 ;
    public final void rule__Setting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2226:1: ( rule__Setting__Group__4__Impl rule__Setting__Group__5 )
            // InternalEntityDsl.g:2227:2: rule__Setting__Group__4__Impl rule__Setting__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Setting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__4"


    // $ANTLR start "rule__Setting__Group__4__Impl"
    // InternalEntityDsl.g:2234:1: rule__Setting__Group__4__Impl : ( ( rule__Setting__SettingNameAssignment_4 ) ) ;
    public final void rule__Setting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2238:1: ( ( ( rule__Setting__SettingNameAssignment_4 ) ) )
            // InternalEntityDsl.g:2239:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:2239:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            // InternalEntityDsl.g:2240:2: ( rule__Setting__SettingNameAssignment_4 )
            {
             before(grammarAccess.getSettingAccess().getSettingNameAssignment_4()); 
            // InternalEntityDsl.g:2241:2: ( rule__Setting__SettingNameAssignment_4 )
            // InternalEntityDsl.g:2241:3: rule__Setting__SettingNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Setting__SettingNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getSettingNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__4__Impl"


    // $ANTLR start "rule__Setting__Group__5"
    // InternalEntityDsl.g:2249:1: rule__Setting__Group__5 : rule__Setting__Group__5__Impl rule__Setting__Group__6 ;
    public final void rule__Setting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2253:1: ( rule__Setting__Group__5__Impl rule__Setting__Group__6 )
            // InternalEntityDsl.g:2254:2: rule__Setting__Group__5__Impl rule__Setting__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Setting__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__5"


    // $ANTLR start "rule__Setting__Group__5__Impl"
    // InternalEntityDsl.g:2261:1: rule__Setting__Group__5__Impl : ( 'settingType' ) ;
    public final void rule__Setting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2265:1: ( ( 'settingType' ) )
            // InternalEntityDsl.g:2266:1: ( 'settingType' )
            {
            // InternalEntityDsl.g:2266:1: ( 'settingType' )
            // InternalEntityDsl.g:2267:2: 'settingType'
            {
             before(grammarAccess.getSettingAccess().getSettingTypeKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSettingTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__5__Impl"


    // $ANTLR start "rule__Setting__Group__6"
    // InternalEntityDsl.g:2276:1: rule__Setting__Group__6 : rule__Setting__Group__6__Impl rule__Setting__Group__7 ;
    public final void rule__Setting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2280:1: ( rule__Setting__Group__6__Impl rule__Setting__Group__7 )
            // InternalEntityDsl.g:2281:2: rule__Setting__Group__6__Impl rule__Setting__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Setting__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__6"


    // $ANTLR start "rule__Setting__Group__6__Impl"
    // InternalEntityDsl.g:2288:1: rule__Setting__Group__6__Impl : ( '=' ) ;
    public final void rule__Setting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2292:1: ( ( '=' ) )
            // InternalEntityDsl.g:2293:1: ( '=' )
            {
            // InternalEntityDsl.g:2293:1: ( '=' )
            // InternalEntityDsl.g:2294:2: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__6__Impl"


    // $ANTLR start "rule__Setting__Group__7"
    // InternalEntityDsl.g:2303:1: rule__Setting__Group__7 : rule__Setting__Group__7__Impl rule__Setting__Group__8 ;
    public final void rule__Setting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2307:1: ( rule__Setting__Group__7__Impl rule__Setting__Group__8 )
            // InternalEntityDsl.g:2308:2: rule__Setting__Group__7__Impl rule__Setting__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Setting__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__7"


    // $ANTLR start "rule__Setting__Group__7__Impl"
    // InternalEntityDsl.g:2315:1: rule__Setting__Group__7__Impl : ( ( rule__Setting__SettingTypeAssignment_7 ) ) ;
    public final void rule__Setting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2319:1: ( ( ( rule__Setting__SettingTypeAssignment_7 ) ) )
            // InternalEntityDsl.g:2320:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            {
            // InternalEntityDsl.g:2320:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            // InternalEntityDsl.g:2321:2: ( rule__Setting__SettingTypeAssignment_7 )
            {
             before(grammarAccess.getSettingAccess().getSettingTypeAssignment_7()); 
            // InternalEntityDsl.g:2322:2: ( rule__Setting__SettingTypeAssignment_7 )
            // InternalEntityDsl.g:2322:3: rule__Setting__SettingTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Setting__SettingTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getSettingTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__7__Impl"


    // $ANTLR start "rule__Setting__Group__8"
    // InternalEntityDsl.g:2330:1: rule__Setting__Group__8 : rule__Setting__Group__8__Impl rule__Setting__Group__9 ;
    public final void rule__Setting__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2334:1: ( rule__Setting__Group__8__Impl rule__Setting__Group__9 )
            // InternalEntityDsl.g:2335:2: rule__Setting__Group__8__Impl rule__Setting__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Setting__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__8"


    // $ANTLR start "rule__Setting__Group__8__Impl"
    // InternalEntityDsl.g:2342:1: rule__Setting__Group__8__Impl : ( 'defaultValue' ) ;
    public final void rule__Setting__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2346:1: ( ( 'defaultValue' ) )
            // InternalEntityDsl.g:2347:1: ( 'defaultValue' )
            {
            // InternalEntityDsl.g:2347:1: ( 'defaultValue' )
            // InternalEntityDsl.g:2348:2: 'defaultValue'
            {
             before(grammarAccess.getSettingAccess().getDefaultValueKeyword_8()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getDefaultValueKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__8__Impl"


    // $ANTLR start "rule__Setting__Group__9"
    // InternalEntityDsl.g:2357:1: rule__Setting__Group__9 : rule__Setting__Group__9__Impl rule__Setting__Group__10 ;
    public final void rule__Setting__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2361:1: ( rule__Setting__Group__9__Impl rule__Setting__Group__10 )
            // InternalEntityDsl.g:2362:2: rule__Setting__Group__9__Impl rule__Setting__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Setting__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__9"


    // $ANTLR start "rule__Setting__Group__9__Impl"
    // InternalEntityDsl.g:2369:1: rule__Setting__Group__9__Impl : ( '=' ) ;
    public final void rule__Setting__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2373:1: ( ( '=' ) )
            // InternalEntityDsl.g:2374:1: ( '=' )
            {
            // InternalEntityDsl.g:2374:1: ( '=' )
            // InternalEntityDsl.g:2375:2: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__9__Impl"


    // $ANTLR start "rule__Setting__Group__10"
    // InternalEntityDsl.g:2384:1: rule__Setting__Group__10 : rule__Setting__Group__10__Impl rule__Setting__Group__11 ;
    public final void rule__Setting__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2388:1: ( rule__Setting__Group__10__Impl rule__Setting__Group__11 )
            // InternalEntityDsl.g:2389:2: rule__Setting__Group__10__Impl rule__Setting__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Setting__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__10"


    // $ANTLR start "rule__Setting__Group__10__Impl"
    // InternalEntityDsl.g:2396:1: rule__Setting__Group__10__Impl : ( ( rule__Setting__DefaultValueAssignment_10 )? ) ;
    public final void rule__Setting__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2400:1: ( ( ( rule__Setting__DefaultValueAssignment_10 )? ) )
            // InternalEntityDsl.g:2401:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            {
            // InternalEntityDsl.g:2401:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            // InternalEntityDsl.g:2402:2: ( rule__Setting__DefaultValueAssignment_10 )?
            {
             before(grammarAccess.getSettingAccess().getDefaultValueAssignment_10()); 
            // InternalEntityDsl.g:2403:2: ( rule__Setting__DefaultValueAssignment_10 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEntityDsl.g:2403:3: rule__Setting__DefaultValueAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Setting__DefaultValueAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSettingAccess().getDefaultValueAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__10__Impl"


    // $ANTLR start "rule__Setting__Group__11"
    // InternalEntityDsl.g:2411:1: rule__Setting__Group__11 : rule__Setting__Group__11__Impl ;
    public final void rule__Setting__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2415:1: ( rule__Setting__Group__11__Impl )
            // InternalEntityDsl.g:2416:2: rule__Setting__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__11"


    // $ANTLR start "rule__Setting__Group__11__Impl"
    // InternalEntityDsl.g:2422:1: rule__Setting__Group__11__Impl : ( '}' ) ;
    public final void rule__Setting__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2426:1: ( ( '}' ) )
            // InternalEntityDsl.g:2427:1: ( '}' )
            {
            // InternalEntityDsl.g:2427:1: ( '}' )
            // InternalEntityDsl.g:2428:2: '}'
            {
             before(grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__11__Impl"


    // $ANTLR start "rule__Hook__Group__0"
    // InternalEntityDsl.g:2438:1: rule__Hook__Group__0 : rule__Hook__Group__0__Impl rule__Hook__Group__1 ;
    public final void rule__Hook__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2442:1: ( rule__Hook__Group__0__Impl rule__Hook__Group__1 )
            // InternalEntityDsl.g:2443:2: rule__Hook__Group__0__Impl rule__Hook__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Hook__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__0"


    // $ANTLR start "rule__Hook__Group__0__Impl"
    // InternalEntityDsl.g:2450:1: rule__Hook__Group__0__Impl : ( 'Hook' ) ;
    public final void rule__Hook__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2454:1: ( ( 'Hook' ) )
            // InternalEntityDsl.g:2455:1: ( 'Hook' )
            {
            // InternalEntityDsl.g:2455:1: ( 'Hook' )
            // InternalEntityDsl.g:2456:2: 'Hook'
            {
             before(grammarAccess.getHookAccess().getHookKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getHookKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__0__Impl"


    // $ANTLR start "rule__Hook__Group__1"
    // InternalEntityDsl.g:2465:1: rule__Hook__Group__1 : rule__Hook__Group__1__Impl rule__Hook__Group__2 ;
    public final void rule__Hook__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2469:1: ( rule__Hook__Group__1__Impl rule__Hook__Group__2 )
            // InternalEntityDsl.g:2470:2: rule__Hook__Group__1__Impl rule__Hook__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Hook__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__1"


    // $ANTLR start "rule__Hook__Group__1__Impl"
    // InternalEntityDsl.g:2477:1: rule__Hook__Group__1__Impl : ( '{' ) ;
    public final void rule__Hook__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2481:1: ( ( '{' ) )
            // InternalEntityDsl.g:2482:1: ( '{' )
            {
            // InternalEntityDsl.g:2482:1: ( '{' )
            // InternalEntityDsl.g:2483:2: '{'
            {
             before(grammarAccess.getHookAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__1__Impl"


    // $ANTLR start "rule__Hook__Group__2"
    // InternalEntityDsl.g:2492:1: rule__Hook__Group__2 : rule__Hook__Group__2__Impl rule__Hook__Group__3 ;
    public final void rule__Hook__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2496:1: ( rule__Hook__Group__2__Impl rule__Hook__Group__3 )
            // InternalEntityDsl.g:2497:2: rule__Hook__Group__2__Impl rule__Hook__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Hook__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__2"


    // $ANTLR start "rule__Hook__Group__2__Impl"
    // InternalEntityDsl.g:2504:1: rule__Hook__Group__2__Impl : ( 'hookType' ) ;
    public final void rule__Hook__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2508:1: ( ( 'hookType' ) )
            // InternalEntityDsl.g:2509:1: ( 'hookType' )
            {
            // InternalEntityDsl.g:2509:1: ( 'hookType' )
            // InternalEntityDsl.g:2510:2: 'hookType'
            {
             before(grammarAccess.getHookAccess().getHookTypeKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getHookTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__2__Impl"


    // $ANTLR start "rule__Hook__Group__3"
    // InternalEntityDsl.g:2519:1: rule__Hook__Group__3 : rule__Hook__Group__3__Impl rule__Hook__Group__4 ;
    public final void rule__Hook__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2523:1: ( rule__Hook__Group__3__Impl rule__Hook__Group__4 )
            // InternalEntityDsl.g:2524:2: rule__Hook__Group__3__Impl rule__Hook__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Hook__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__3"


    // $ANTLR start "rule__Hook__Group__3__Impl"
    // InternalEntityDsl.g:2531:1: rule__Hook__Group__3__Impl : ( '=' ) ;
    public final void rule__Hook__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2535:1: ( ( '=' ) )
            // InternalEntityDsl.g:2536:1: ( '=' )
            {
            // InternalEntityDsl.g:2536:1: ( '=' )
            // InternalEntityDsl.g:2537:2: '='
            {
             before(grammarAccess.getHookAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__3__Impl"


    // $ANTLR start "rule__Hook__Group__4"
    // InternalEntityDsl.g:2546:1: rule__Hook__Group__4 : rule__Hook__Group__4__Impl rule__Hook__Group__5 ;
    public final void rule__Hook__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2550:1: ( rule__Hook__Group__4__Impl rule__Hook__Group__5 )
            // InternalEntityDsl.g:2551:2: rule__Hook__Group__4__Impl rule__Hook__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Hook__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__4"


    // $ANTLR start "rule__Hook__Group__4__Impl"
    // InternalEntityDsl.g:2558:1: rule__Hook__Group__4__Impl : ( ( rule__Hook__HookTypeAssignment_4 ) ) ;
    public final void rule__Hook__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2562:1: ( ( ( rule__Hook__HookTypeAssignment_4 ) ) )
            // InternalEntityDsl.g:2563:1: ( ( rule__Hook__HookTypeAssignment_4 ) )
            {
            // InternalEntityDsl.g:2563:1: ( ( rule__Hook__HookTypeAssignment_4 ) )
            // InternalEntityDsl.g:2564:2: ( rule__Hook__HookTypeAssignment_4 )
            {
             before(grammarAccess.getHookAccess().getHookTypeAssignment_4()); 
            // InternalEntityDsl.g:2565:2: ( rule__Hook__HookTypeAssignment_4 )
            // InternalEntityDsl.g:2565:3: rule__Hook__HookTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Hook__HookTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHookAccess().getHookTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__4__Impl"


    // $ANTLR start "rule__Hook__Group__5"
    // InternalEntityDsl.g:2573:1: rule__Hook__Group__5 : rule__Hook__Group__5__Impl rule__Hook__Group__6 ;
    public final void rule__Hook__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2577:1: ( rule__Hook__Group__5__Impl rule__Hook__Group__6 )
            // InternalEntityDsl.g:2578:2: rule__Hook__Group__5__Impl rule__Hook__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Hook__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__5"


    // $ANTLR start "rule__Hook__Group__5__Impl"
    // InternalEntityDsl.g:2585:1: rule__Hook__Group__5__Impl : ( 'hookName' ) ;
    public final void rule__Hook__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2589:1: ( ( 'hookName' ) )
            // InternalEntityDsl.g:2590:1: ( 'hookName' )
            {
            // InternalEntityDsl.g:2590:1: ( 'hookName' )
            // InternalEntityDsl.g:2591:2: 'hookName'
            {
             before(grammarAccess.getHookAccess().getHookNameKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getHookNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__5__Impl"


    // $ANTLR start "rule__Hook__Group__6"
    // InternalEntityDsl.g:2600:1: rule__Hook__Group__6 : rule__Hook__Group__6__Impl rule__Hook__Group__7 ;
    public final void rule__Hook__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2604:1: ( rule__Hook__Group__6__Impl rule__Hook__Group__7 )
            // InternalEntityDsl.g:2605:2: rule__Hook__Group__6__Impl rule__Hook__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Hook__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__6"


    // $ANTLR start "rule__Hook__Group__6__Impl"
    // InternalEntityDsl.g:2612:1: rule__Hook__Group__6__Impl : ( '=' ) ;
    public final void rule__Hook__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2616:1: ( ( '=' ) )
            // InternalEntityDsl.g:2617:1: ( '=' )
            {
            // InternalEntityDsl.g:2617:1: ( '=' )
            // InternalEntityDsl.g:2618:2: '='
            {
             before(grammarAccess.getHookAccess().getEqualsSignKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__6__Impl"


    // $ANTLR start "rule__Hook__Group__7"
    // InternalEntityDsl.g:2627:1: rule__Hook__Group__7 : rule__Hook__Group__7__Impl rule__Hook__Group__8 ;
    public final void rule__Hook__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2631:1: ( rule__Hook__Group__7__Impl rule__Hook__Group__8 )
            // InternalEntityDsl.g:2632:2: rule__Hook__Group__7__Impl rule__Hook__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__Hook__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__7"


    // $ANTLR start "rule__Hook__Group__7__Impl"
    // InternalEntityDsl.g:2639:1: rule__Hook__Group__7__Impl : ( ( rule__Hook__HookNameAssignment_7 ) ) ;
    public final void rule__Hook__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2643:1: ( ( ( rule__Hook__HookNameAssignment_7 ) ) )
            // InternalEntityDsl.g:2644:1: ( ( rule__Hook__HookNameAssignment_7 ) )
            {
            // InternalEntityDsl.g:2644:1: ( ( rule__Hook__HookNameAssignment_7 ) )
            // InternalEntityDsl.g:2645:2: ( rule__Hook__HookNameAssignment_7 )
            {
             before(grammarAccess.getHookAccess().getHookNameAssignment_7()); 
            // InternalEntityDsl.g:2646:2: ( rule__Hook__HookNameAssignment_7 )
            // InternalEntityDsl.g:2646:3: rule__Hook__HookNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Hook__HookNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getHookAccess().getHookNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__7__Impl"


    // $ANTLR start "rule__Hook__Group__8"
    // InternalEntityDsl.g:2654:1: rule__Hook__Group__8 : rule__Hook__Group__8__Impl rule__Hook__Group__9 ;
    public final void rule__Hook__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2658:1: ( rule__Hook__Group__8__Impl rule__Hook__Group__9 )
            // InternalEntityDsl.g:2659:2: rule__Hook__Group__8__Impl rule__Hook__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Hook__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__8"


    // $ANTLR start "rule__Hook__Group__8__Impl"
    // InternalEntityDsl.g:2666:1: rule__Hook__Group__8__Impl : ( 'callback' ) ;
    public final void rule__Hook__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2670:1: ( ( 'callback' ) )
            // InternalEntityDsl.g:2671:1: ( 'callback' )
            {
            // InternalEntityDsl.g:2671:1: ( 'callback' )
            // InternalEntityDsl.g:2672:2: 'callback'
            {
             before(grammarAccess.getHookAccess().getCallbackKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getCallbackKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__8__Impl"


    // $ANTLR start "rule__Hook__Group__9"
    // InternalEntityDsl.g:2681:1: rule__Hook__Group__9 : rule__Hook__Group__9__Impl rule__Hook__Group__10 ;
    public final void rule__Hook__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2685:1: ( rule__Hook__Group__9__Impl rule__Hook__Group__10 )
            // InternalEntityDsl.g:2686:2: rule__Hook__Group__9__Impl rule__Hook__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Hook__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__9"


    // $ANTLR start "rule__Hook__Group__9__Impl"
    // InternalEntityDsl.g:2693:1: rule__Hook__Group__9__Impl : ( '=' ) ;
    public final void rule__Hook__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2697:1: ( ( '=' ) )
            // InternalEntityDsl.g:2698:1: ( '=' )
            {
            // InternalEntityDsl.g:2698:1: ( '=' )
            // InternalEntityDsl.g:2699:2: '='
            {
             before(grammarAccess.getHookAccess().getEqualsSignKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__9__Impl"


    // $ANTLR start "rule__Hook__Group__10"
    // InternalEntityDsl.g:2708:1: rule__Hook__Group__10 : rule__Hook__Group__10__Impl rule__Hook__Group__11 ;
    public final void rule__Hook__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2712:1: ( rule__Hook__Group__10__Impl rule__Hook__Group__11 )
            // InternalEntityDsl.g:2713:2: rule__Hook__Group__10__Impl rule__Hook__Group__11
            {
            pushFollow(FOLLOW_35);
            rule__Hook__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__10"


    // $ANTLR start "rule__Hook__Group__10__Impl"
    // InternalEntityDsl.g:2720:1: rule__Hook__Group__10__Impl : ( ( rule__Hook__CallbackAssignment_10 ) ) ;
    public final void rule__Hook__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2724:1: ( ( ( rule__Hook__CallbackAssignment_10 ) ) )
            // InternalEntityDsl.g:2725:1: ( ( rule__Hook__CallbackAssignment_10 ) )
            {
            // InternalEntityDsl.g:2725:1: ( ( rule__Hook__CallbackAssignment_10 ) )
            // InternalEntityDsl.g:2726:2: ( rule__Hook__CallbackAssignment_10 )
            {
             before(grammarAccess.getHookAccess().getCallbackAssignment_10()); 
            // InternalEntityDsl.g:2727:2: ( rule__Hook__CallbackAssignment_10 )
            // InternalEntityDsl.g:2727:3: rule__Hook__CallbackAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Hook__CallbackAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getHookAccess().getCallbackAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__10__Impl"


    // $ANTLR start "rule__Hook__Group__11"
    // InternalEntityDsl.g:2735:1: rule__Hook__Group__11 : rule__Hook__Group__11__Impl rule__Hook__Group__12 ;
    public final void rule__Hook__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2739:1: ( rule__Hook__Group__11__Impl rule__Hook__Group__12 )
            // InternalEntityDsl.g:2740:2: rule__Hook__Group__11__Impl rule__Hook__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Hook__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__11"


    // $ANTLR start "rule__Hook__Group__11__Impl"
    // InternalEntityDsl.g:2747:1: rule__Hook__Group__11__Impl : ( 'priority' ) ;
    public final void rule__Hook__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2751:1: ( ( 'priority' ) )
            // InternalEntityDsl.g:2752:1: ( 'priority' )
            {
            // InternalEntityDsl.g:2752:1: ( 'priority' )
            // InternalEntityDsl.g:2753:2: 'priority'
            {
             before(grammarAccess.getHookAccess().getPriorityKeyword_11()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getPriorityKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__11__Impl"


    // $ANTLR start "rule__Hook__Group__12"
    // InternalEntityDsl.g:2762:1: rule__Hook__Group__12 : rule__Hook__Group__12__Impl rule__Hook__Group__13 ;
    public final void rule__Hook__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2766:1: ( rule__Hook__Group__12__Impl rule__Hook__Group__13 )
            // InternalEntityDsl.g:2767:2: rule__Hook__Group__12__Impl rule__Hook__Group__13
            {
            pushFollow(FOLLOW_36);
            rule__Hook__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__12"


    // $ANTLR start "rule__Hook__Group__12__Impl"
    // InternalEntityDsl.g:2774:1: rule__Hook__Group__12__Impl : ( '=' ) ;
    public final void rule__Hook__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2778:1: ( ( '=' ) )
            // InternalEntityDsl.g:2779:1: ( '=' )
            {
            // InternalEntityDsl.g:2779:1: ( '=' )
            // InternalEntityDsl.g:2780:2: '='
            {
             before(grammarAccess.getHookAccess().getEqualsSignKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__12__Impl"


    // $ANTLR start "rule__Hook__Group__13"
    // InternalEntityDsl.g:2789:1: rule__Hook__Group__13 : rule__Hook__Group__13__Impl rule__Hook__Group__14 ;
    public final void rule__Hook__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2793:1: ( rule__Hook__Group__13__Impl rule__Hook__Group__14 )
            // InternalEntityDsl.g:2794:2: rule__Hook__Group__13__Impl rule__Hook__Group__14
            {
            pushFollow(FOLLOW_36);
            rule__Hook__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__13"


    // $ANTLR start "rule__Hook__Group__13__Impl"
    // InternalEntityDsl.g:2801:1: rule__Hook__Group__13__Impl : ( ( rule__Hook__PriorityAssignment_13 )? ) ;
    public final void rule__Hook__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2805:1: ( ( ( rule__Hook__PriorityAssignment_13 )? ) )
            // InternalEntityDsl.g:2806:1: ( ( rule__Hook__PriorityAssignment_13 )? )
            {
            // InternalEntityDsl.g:2806:1: ( ( rule__Hook__PriorityAssignment_13 )? )
            // InternalEntityDsl.g:2807:2: ( rule__Hook__PriorityAssignment_13 )?
            {
             before(grammarAccess.getHookAccess().getPriorityAssignment_13()); 
            // InternalEntityDsl.g:2808:2: ( rule__Hook__PriorityAssignment_13 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEntityDsl.g:2808:3: rule__Hook__PriorityAssignment_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hook__PriorityAssignment_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHookAccess().getPriorityAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__13__Impl"


    // $ANTLR start "rule__Hook__Group__14"
    // InternalEntityDsl.g:2816:1: rule__Hook__Group__14 : rule__Hook__Group__14__Impl rule__Hook__Group__15 ;
    public final void rule__Hook__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2820:1: ( rule__Hook__Group__14__Impl rule__Hook__Group__15 )
            // InternalEntityDsl.g:2821:2: rule__Hook__Group__14__Impl rule__Hook__Group__15
            {
            pushFollow(FOLLOW_6);
            rule__Hook__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__14"


    // $ANTLR start "rule__Hook__Group__14__Impl"
    // InternalEntityDsl.g:2828:1: rule__Hook__Group__14__Impl : ( 'acceptedArgs' ) ;
    public final void rule__Hook__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2832:1: ( ( 'acceptedArgs' ) )
            // InternalEntityDsl.g:2833:1: ( 'acceptedArgs' )
            {
            // InternalEntityDsl.g:2833:1: ( 'acceptedArgs' )
            // InternalEntityDsl.g:2834:2: 'acceptedArgs'
            {
             before(grammarAccess.getHookAccess().getAcceptedArgsKeyword_14()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getAcceptedArgsKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__14__Impl"


    // $ANTLR start "rule__Hook__Group__15"
    // InternalEntityDsl.g:2843:1: rule__Hook__Group__15 : rule__Hook__Group__15__Impl rule__Hook__Group__16 ;
    public final void rule__Hook__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2847:1: ( rule__Hook__Group__15__Impl rule__Hook__Group__16 )
            // InternalEntityDsl.g:2848:2: rule__Hook__Group__15__Impl rule__Hook__Group__16
            {
            pushFollow(FOLLOW_37);
            rule__Hook__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__15"


    // $ANTLR start "rule__Hook__Group__15__Impl"
    // InternalEntityDsl.g:2855:1: rule__Hook__Group__15__Impl : ( '=' ) ;
    public final void rule__Hook__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2859:1: ( ( '=' ) )
            // InternalEntityDsl.g:2860:1: ( '=' )
            {
            // InternalEntityDsl.g:2860:1: ( '=' )
            // InternalEntityDsl.g:2861:2: '='
            {
             before(grammarAccess.getHookAccess().getEqualsSignKeyword_15()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getEqualsSignKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__15__Impl"


    // $ANTLR start "rule__Hook__Group__16"
    // InternalEntityDsl.g:2870:1: rule__Hook__Group__16 : rule__Hook__Group__16__Impl rule__Hook__Group__17 ;
    public final void rule__Hook__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2874:1: ( rule__Hook__Group__16__Impl rule__Hook__Group__17 )
            // InternalEntityDsl.g:2875:2: rule__Hook__Group__16__Impl rule__Hook__Group__17
            {
            pushFollow(FOLLOW_37);
            rule__Hook__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hook__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__16"


    // $ANTLR start "rule__Hook__Group__16__Impl"
    // InternalEntityDsl.g:2882:1: rule__Hook__Group__16__Impl : ( ( rule__Hook__AcceptedArgsAssignment_16 )? ) ;
    public final void rule__Hook__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2886:1: ( ( ( rule__Hook__AcceptedArgsAssignment_16 )? ) )
            // InternalEntityDsl.g:2887:1: ( ( rule__Hook__AcceptedArgsAssignment_16 )? )
            {
            // InternalEntityDsl.g:2887:1: ( ( rule__Hook__AcceptedArgsAssignment_16 )? )
            // InternalEntityDsl.g:2888:2: ( rule__Hook__AcceptedArgsAssignment_16 )?
            {
             before(grammarAccess.getHookAccess().getAcceptedArgsAssignment_16()); 
            // InternalEntityDsl.g:2889:2: ( rule__Hook__AcceptedArgsAssignment_16 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEntityDsl.g:2889:3: rule__Hook__AcceptedArgsAssignment_16
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hook__AcceptedArgsAssignment_16();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHookAccess().getAcceptedArgsAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__16__Impl"


    // $ANTLR start "rule__Hook__Group__17"
    // InternalEntityDsl.g:2897:1: rule__Hook__Group__17 : rule__Hook__Group__17__Impl ;
    public final void rule__Hook__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2901:1: ( rule__Hook__Group__17__Impl )
            // InternalEntityDsl.g:2902:2: rule__Hook__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hook__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__17"


    // $ANTLR start "rule__Hook__Group__17__Impl"
    // InternalEntityDsl.g:2908:1: rule__Hook__Group__17__Impl : ( '}' ) ;
    public final void rule__Hook__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2912:1: ( ( '}' ) )
            // InternalEntityDsl.g:2913:1: ( '}' )
            {
            // InternalEntityDsl.g:2913:1: ( '}' )
            // InternalEntityDsl.g:2914:2: '}'
            {
             before(grammarAccess.getHookAccess().getRightCurlyBracketKeyword_17()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__Group__17__Impl"


    // $ANTLR start "rule__StringList__Group__0"
    // InternalEntityDsl.g:2924:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2928:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // InternalEntityDsl.g:2929:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0"


    // $ANTLR start "rule__StringList__Group__0__Impl"
    // InternalEntityDsl.g:2936:1: rule__StringList__Group__0__Impl : ( ( rule__StringList__ValuesAssignment_0 ) ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2940:1: ( ( ( rule__StringList__ValuesAssignment_0 ) ) )
            // InternalEntityDsl.g:2941:1: ( ( rule__StringList__ValuesAssignment_0 ) )
            {
            // InternalEntityDsl.g:2941:1: ( ( rule__StringList__ValuesAssignment_0 ) )
            // InternalEntityDsl.g:2942:2: ( rule__StringList__ValuesAssignment_0 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_0()); 
            // InternalEntityDsl.g:2943:2: ( rule__StringList__ValuesAssignment_0 )
            // InternalEntityDsl.g:2943:3: rule__StringList__ValuesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringList__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0__Impl"


    // $ANTLR start "rule__StringList__Group__1"
    // InternalEntityDsl.g:2951:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2955:1: ( rule__StringList__Group__1__Impl )
            // InternalEntityDsl.g:2956:2: rule__StringList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1"


    // $ANTLR start "rule__StringList__Group__1__Impl"
    // InternalEntityDsl.g:2962:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__Group_1__0 )* ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2966:1: ( ( ( rule__StringList__Group_1__0 )* ) )
            // InternalEntityDsl.g:2967:1: ( ( rule__StringList__Group_1__0 )* )
            {
            // InternalEntityDsl.g:2967:1: ( ( rule__StringList__Group_1__0 )* )
            // InternalEntityDsl.g:2968:2: ( rule__StringList__Group_1__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_1()); 
            // InternalEntityDsl.g:2969:2: ( rule__StringList__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEntityDsl.g:2969:3: rule__StringList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__StringList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStringListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1__Impl"


    // $ANTLR start "rule__StringList__Group_1__0"
    // InternalEntityDsl.g:2978:1: rule__StringList__Group_1__0 : rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1 ;
    public final void rule__StringList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2982:1: ( rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1 )
            // InternalEntityDsl.g:2983:2: rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__StringList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__0"


    // $ANTLR start "rule__StringList__Group_1__0__Impl"
    // InternalEntityDsl.g:2990:1: rule__StringList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2994:1: ( ( ',' ) )
            // InternalEntityDsl.g:2995:1: ( ',' )
            {
            // InternalEntityDsl.g:2995:1: ( ',' )
            // InternalEntityDsl.g:2996:2: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__0__Impl"


    // $ANTLR start "rule__StringList__Group_1__1"
    // InternalEntityDsl.g:3005:1: rule__StringList__Group_1__1 : rule__StringList__Group_1__1__Impl ;
    public final void rule__StringList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3009:1: ( rule__StringList__Group_1__1__Impl )
            // InternalEntityDsl.g:3010:2: rule__StringList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__1"


    // $ANTLR start "rule__StringList__Group_1__1__Impl"
    // InternalEntityDsl.g:3016:1: rule__StringList__Group_1__1__Impl : ( ( rule__StringList__ValuesAssignment_1_1 ) ) ;
    public final void rule__StringList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3020:1: ( ( ( rule__StringList__ValuesAssignment_1_1 ) ) )
            // InternalEntityDsl.g:3021:1: ( ( rule__StringList__ValuesAssignment_1_1 ) )
            {
            // InternalEntityDsl.g:3021:1: ( ( rule__StringList__ValuesAssignment_1_1 ) )
            // InternalEntityDsl.g:3022:2: ( rule__StringList__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1_1()); 
            // InternalEntityDsl.g:3023:2: ( rule__StringList__ValuesAssignment_1_1 )
            // InternalEntityDsl.g:3023:3: rule__StringList__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringList__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__1__Impl"


    // $ANTLR start "rule__PluginModel__ElementsAssignment"
    // InternalEntityDsl.g:3032:1: rule__PluginModel__ElementsAssignment : ( ruleElement ) ;
    public final void rule__PluginModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3036:1: ( ( ruleElement ) )
            // InternalEntityDsl.g:3037:2: ( ruleElement )
            {
            // InternalEntityDsl.g:3037:2: ( ruleElement )
            // InternalEntityDsl.g:3038:3: ruleElement
            {
             before(grammarAccess.getPluginModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPluginModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluginModel__ElementsAssignment"


    // $ANTLR start "rule__Meta__NameAssignment_4"
    // InternalEntityDsl.g:3047:1: rule__Meta__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Meta__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3051:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3052:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3052:2: ( RULE_STRING )
            // InternalEntityDsl.g:3053:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__NameAssignment_4"


    // $ANTLR start "rule__Meta__VersionAssignment_7"
    // InternalEntityDsl.g:3062:1: rule__Meta__VersionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Meta__VersionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3066:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3067:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3067:2: ( RULE_STRING )
            // InternalEntityDsl.g:3068:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getVersionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getVersionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__VersionAssignment_7"


    // $ANTLR start "rule__Meta__DescriptionAssignment_10"
    // InternalEntityDsl.g:3077:1: rule__Meta__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Meta__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3081:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3082:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3082:2: ( RULE_STRING )
            // InternalEntityDsl.g:3083:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__DescriptionAssignment_10"


    // $ANTLR start "rule__Meta__AuthorAssignment_13"
    // InternalEntityDsl.g:3092:1: rule__Meta__AuthorAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Meta__AuthorAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3096:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3097:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3097:2: ( RULE_STRING )
            // InternalEntityDsl.g:3098:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getAuthorSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getAuthorSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__AuthorAssignment_13"


    // $ANTLR start "rule__Meta__LicenseAssignment_16"
    // InternalEntityDsl.g:3107:1: rule__Meta__LicenseAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Meta__LicenseAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3111:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3112:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3112:2: ( RULE_STRING )
            // InternalEntityDsl.g:3113:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getLicenseSTRINGTerminalRuleCall_16_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getLicenseSTRINGTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__LicenseAssignment_16"


    // $ANTLR start "rule__Meta__PrefixAssignment_19"
    // InternalEntityDsl.g:3122:1: rule__Meta__PrefixAssignment_19 : ( RULE_STRING ) ;
    public final void rule__Meta__PrefixAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3126:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3127:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3127:2: ( RULE_STRING )
            // InternalEntityDsl.g:3128:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getPrefixSTRINGTerminalRuleCall_19_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getPrefixSTRINGTerminalRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__PrefixAssignment_19"


    // $ANTLR start "rule__Meta__TextDomainAssignment_22"
    // InternalEntityDsl.g:3137:1: rule__Meta__TextDomainAssignment_22 : ( RULE_STRING ) ;
    public final void rule__Meta__TextDomainAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3141:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3142:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3142:2: ( RULE_STRING )
            // InternalEntityDsl.g:3143:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getTextDomainSTRINGTerminalRuleCall_22_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getTextDomainSTRINGTerminalRuleCall_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__TextDomainAssignment_22"


    // $ANTLR start "rule__Meta__ActivateAssignment_25"
    // InternalEntityDsl.g:3152:1: rule__Meta__ActivateAssignment_25 : ( RULE_STRING ) ;
    public final void rule__Meta__ActivateAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3156:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3157:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3157:2: ( RULE_STRING )
            // InternalEntityDsl.g:3158:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getActivateSTRINGTerminalRuleCall_25_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getActivateSTRINGTerminalRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__ActivateAssignment_25"


    // $ANTLR start "rule__Meta__DeactivateAssignment_28"
    // InternalEntityDsl.g:3167:1: rule__Meta__DeactivateAssignment_28 : ( RULE_STRING ) ;
    public final void rule__Meta__DeactivateAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3171:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3172:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3172:2: ( RULE_STRING )
            // InternalEntityDsl.g:3173:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getDeactivateSTRINGTerminalRuleCall_28_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getDeactivateSTRINGTerminalRuleCall_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__DeactivateAssignment_28"


    // $ANTLR start "rule__Meta__UninstallAssignment_31"
    // InternalEntityDsl.g:3182:1: rule__Meta__UninstallAssignment_31 : ( RULE_STRING ) ;
    public final void rule__Meta__UninstallAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3186:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3187:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3187:2: ( RULE_STRING )
            // InternalEntityDsl.g:3188:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getUninstallSTRINGTerminalRuleCall_31_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getUninstallSTRINGTerminalRuleCall_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__UninstallAssignment_31"


    // $ANTLR start "rule__Widget__WidgetNameAssignment_4"
    // InternalEntityDsl.g:3197:1: rule__Widget__WidgetNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3201:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3202:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3202:2: ( RULE_STRING )
            // InternalEntityDsl.g:3203:3: RULE_STRING
            {
             before(grammarAccess.getWidgetAccess().getWidgetNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getWidgetNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__WidgetNameAssignment_4"


    // $ANTLR start "rule__Widget__WidgetDescriptionAssignment_7"
    // InternalEntityDsl.g:3212:1: rule__Widget__WidgetDescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetDescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3216:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3217:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3217:2: ( RULE_STRING )
            // InternalEntityDsl.g:3218:3: RULE_STRING
            {
             before(grammarAccess.getWidgetAccess().getWidgetDescriptionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getWidgetDescriptionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__WidgetDescriptionAssignment_7"


    // $ANTLR start "rule__Widget__SettingsAssignment_8"
    // InternalEntityDsl.g:3227:1: rule__Widget__SettingsAssignment_8 : ( ruleSetting ) ;
    public final void rule__Widget__SettingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3231:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3232:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3232:2: ( ruleSetting )
            // InternalEntityDsl.g:3233:3: ruleSetting
            {
             before(grammarAccess.getWidgetAccess().getSettingsSettingParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getSettingsSettingParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__SettingsAssignment_8"


    // $ANTLR start "rule__Shortcode__ShortcodeNameAssignment_4"
    // InternalEntityDsl.g:3242:1: rule__Shortcode__ShortcodeNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Shortcode__ShortcodeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3246:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3247:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3247:2: ( RULE_STRING )
            // InternalEntityDsl.g:3248:3: RULE_STRING
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getShortcodeNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__ShortcodeNameAssignment_4"


    // $ANTLR start "rule__Shortcode__SettingsAssignment_5"
    // InternalEntityDsl.g:3257:1: rule__Shortcode__SettingsAssignment_5 : ( ruleSetting ) ;
    public final void rule__Shortcode__SettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3261:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3262:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3262:2: ( ruleSetting )
            // InternalEntityDsl.g:3263:3: ruleSetting
            {
             before(grammarAccess.getShortcodeAccess().getSettingsSettingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getShortcodeAccess().getSettingsSettingParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__SettingsAssignment_5"


    // $ANTLR start "rule__CustomPostType__CptNameAssignment_4"
    // InternalEntityDsl.g:3272:1: rule__CustomPostType__CptNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__CptNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3276:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3277:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3277:2: ( RULE_STRING )
            // InternalEntityDsl.g:3278:3: RULE_STRING
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getCptNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__CptNameAssignment_4"


    // $ANTLR start "rule__CustomPostType__CptSingularNameAssignment_7"
    // InternalEntityDsl.g:3287:1: rule__CustomPostType__CptSingularNameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__CptSingularNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3291:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3292:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3292:2: ( RULE_STRING )
            // InternalEntityDsl.g:3293:3: RULE_STRING
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSingularNameSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getCptSingularNameSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__CptSingularNameAssignment_7"


    // $ANTLR start "rule__CustomPostType__CptSupportsAssignment_10"
    // InternalEntityDsl.g:3302:1: rule__CustomPostType__CptSupportsAssignment_10 : ( ruleStringList ) ;
    public final void rule__CustomPostType__CptSupportsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3306:1: ( ( ruleStringList ) )
            // InternalEntityDsl.g:3307:2: ( ruleStringList )
            {
            // InternalEntityDsl.g:3307:2: ( ruleStringList )
            // InternalEntityDsl.g:3308:3: ruleStringList
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSupportsStringListParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getCustomPostTypeAccess().getCptSupportsStringListParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__CptSupportsAssignment_10"


    // $ANTLR start "rule__CustomPostType__CptTaxonomiesAssignment_13"
    // InternalEntityDsl.g:3317:1: rule__CustomPostType__CptTaxonomiesAssignment_13 : ( ruleStringList ) ;
    public final void rule__CustomPostType__CptTaxonomiesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3321:1: ( ( ruleStringList ) )
            // InternalEntityDsl.g:3322:2: ( ruleStringList )
            {
            // InternalEntityDsl.g:3322:2: ( ruleStringList )
            // InternalEntityDsl.g:3323:3: ruleStringList
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesStringListParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesStringListParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__CptTaxonomiesAssignment_13"


    // $ANTLR start "rule__Setting__SettingNameAssignment_4"
    // InternalEntityDsl.g:3332:1: rule__Setting__SettingNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3336:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3337:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3337:2: ( RULE_STRING )
            // InternalEntityDsl.g:3338:3: RULE_STRING
            {
             before(grammarAccess.getSettingAccess().getSettingNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSettingNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__SettingNameAssignment_4"


    // $ANTLR start "rule__Setting__SettingTypeAssignment_7"
    // InternalEntityDsl.g:3347:1: rule__Setting__SettingTypeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3351:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3352:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3352:2: ( RULE_STRING )
            // InternalEntityDsl.g:3353:3: RULE_STRING
            {
             before(grammarAccess.getSettingAccess().getSettingTypeSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSettingTypeSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__SettingTypeAssignment_7"


    // $ANTLR start "rule__Setting__DefaultValueAssignment_10"
    // InternalEntityDsl.g:3362:1: rule__Setting__DefaultValueAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Setting__DefaultValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3366:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3367:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3367:2: ( RULE_STRING )
            // InternalEntityDsl.g:3368:3: RULE_STRING
            {
             before(grammarAccess.getSettingAccess().getDefaultValueSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getDefaultValueSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__DefaultValueAssignment_10"


    // $ANTLR start "rule__Hook__HookTypeAssignment_4"
    // InternalEntityDsl.g:3377:1: rule__Hook__HookTypeAssignment_4 : ( ruleHookType ) ;
    public final void rule__Hook__HookTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3381:1: ( ( ruleHookType ) )
            // InternalEntityDsl.g:3382:2: ( ruleHookType )
            {
            // InternalEntityDsl.g:3382:2: ( ruleHookType )
            // InternalEntityDsl.g:3383:3: ruleHookType
            {
             before(grammarAccess.getHookAccess().getHookTypeHookTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHookType();

            state._fsp--;

             after(grammarAccess.getHookAccess().getHookTypeHookTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__HookTypeAssignment_4"


    // $ANTLR start "rule__Hook__HookNameAssignment_7"
    // InternalEntityDsl.g:3392:1: rule__Hook__HookNameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Hook__HookNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3396:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3397:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3397:2: ( RULE_STRING )
            // InternalEntityDsl.g:3398:3: RULE_STRING
            {
             before(grammarAccess.getHookAccess().getHookNameSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getHookNameSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__HookNameAssignment_7"


    // $ANTLR start "rule__Hook__CallbackAssignment_10"
    // InternalEntityDsl.g:3407:1: rule__Hook__CallbackAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Hook__CallbackAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3411:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3412:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3412:2: ( RULE_STRING )
            // InternalEntityDsl.g:3413:3: RULE_STRING
            {
             before(grammarAccess.getHookAccess().getCallbackSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getCallbackSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__CallbackAssignment_10"


    // $ANTLR start "rule__Hook__PriorityAssignment_13"
    // InternalEntityDsl.g:3422:1: rule__Hook__PriorityAssignment_13 : ( RULE_INT ) ;
    public final void rule__Hook__PriorityAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3426:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:3427:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:3427:2: ( RULE_INT )
            // InternalEntityDsl.g:3428:3: RULE_INT
            {
             before(grammarAccess.getHookAccess().getPriorityINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getPriorityINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__PriorityAssignment_13"


    // $ANTLR start "rule__Hook__AcceptedArgsAssignment_16"
    // InternalEntityDsl.g:3437:1: rule__Hook__AcceptedArgsAssignment_16 : ( RULE_INT ) ;
    public final void rule__Hook__AcceptedArgsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3441:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:3442:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:3442:2: ( RULE_INT )
            // InternalEntityDsl.g:3443:3: RULE_INT
            {
             before(grammarAccess.getHookAccess().getAcceptedArgsINTTerminalRuleCall_16_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getAcceptedArgsINTTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__AcceptedArgsAssignment_16"


    // $ANTLR start "rule__StringList__ValuesAssignment_0"
    // InternalEntityDsl.g:3452:1: rule__StringList__ValuesAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3456:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3457:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3457:2: ( RULE_STRING )
            // InternalEntityDsl.g:3458:3: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_0"


    // $ANTLR start "rule__StringList__ValuesAssignment_1_1"
    // InternalEntityDsl.g:3467:1: rule__StringList__ValuesAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3471:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3472:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3472:2: ( RULE_STRING )
            // InternalEntityDsl.g:3473:3: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000022148002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002004000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000002L});

}