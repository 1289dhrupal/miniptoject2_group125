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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'filter'", "'action'", "'Plugin'", "'{'", "'name'", "'='", "'version'", "'description'", "'author'", "'license'", "'prefix'", "'textDomain'", "'activate'", "'deactivate'", "'uninstall'", "'}'", "'Widget'", "'widgetName'", "'widgetDescription'", "'Shortcode'", "'shortcodeName'", "'CustomPostType'", "'cptName'", "'cptSingularName'", "'cptSupports'", "'cptTaxonomies'", "'Setting'", "'settingName'", "'settingType'", "'defaultValue'", "'Hook'", "'hookType'", "'hookName'", "'callback'", "'priority'", "'acceptedArgs'", "','"
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



    // $ANTLR start "entryRulePlugin"
    // InternalEntityDsl.g:53:1: entryRulePlugin : rulePlugin EOF ;
    public final void entryRulePlugin() throws RecognitionException {
        try {
            // InternalEntityDsl.g:54:1: ( rulePlugin EOF )
            // InternalEntityDsl.g:55:1: rulePlugin EOF
            {
             before(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_1);
            rulePlugin();

            state._fsp--;

             after(grammarAccess.getPluginRule()); 
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
    // $ANTLR end "entryRulePlugin"


    // $ANTLR start "rulePlugin"
    // InternalEntityDsl.g:62:1: rulePlugin : ( ( rule__Plugin__Group__0 ) ) ;
    public final void rulePlugin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:66:2: ( ( ( rule__Plugin__Group__0 ) ) )
            // InternalEntityDsl.g:67:2: ( ( rule__Plugin__Group__0 ) )
            {
            // InternalEntityDsl.g:67:2: ( ( rule__Plugin__Group__0 ) )
            // InternalEntityDsl.g:68:3: ( rule__Plugin__Group__0 )
            {
             before(grammarAccess.getPluginAccess().getGroup()); 
            // InternalEntityDsl.g:69:3: ( rule__Plugin__Group__0 )
            // InternalEntityDsl.g:69:4: rule__Plugin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getGroup()); 

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
    // $ANTLR end "rulePlugin"


    // $ANTLR start "entryRuleWidget"
    // InternalEntityDsl.g:78:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // InternalEntityDsl.g:79:1: ( ruleWidget EOF )
            // InternalEntityDsl.g:80:1: ruleWidget EOF
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
    // InternalEntityDsl.g:87:1: ruleWidget : ( ( rule__Widget__Group__0 ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:91:2: ( ( ( rule__Widget__Group__0 ) ) )
            // InternalEntityDsl.g:92:2: ( ( rule__Widget__Group__0 ) )
            {
            // InternalEntityDsl.g:92:2: ( ( rule__Widget__Group__0 ) )
            // InternalEntityDsl.g:93:3: ( rule__Widget__Group__0 )
            {
             before(grammarAccess.getWidgetAccess().getGroup()); 
            // InternalEntityDsl.g:94:3: ( rule__Widget__Group__0 )
            // InternalEntityDsl.g:94:4: rule__Widget__Group__0
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
    // InternalEntityDsl.g:103:1: entryRuleShortcode : ruleShortcode EOF ;
    public final void entryRuleShortcode() throws RecognitionException {
        try {
            // InternalEntityDsl.g:104:1: ( ruleShortcode EOF )
            // InternalEntityDsl.g:105:1: ruleShortcode EOF
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
    // InternalEntityDsl.g:112:1: ruleShortcode : ( ( rule__Shortcode__Group__0 ) ) ;
    public final void ruleShortcode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:116:2: ( ( ( rule__Shortcode__Group__0 ) ) )
            // InternalEntityDsl.g:117:2: ( ( rule__Shortcode__Group__0 ) )
            {
            // InternalEntityDsl.g:117:2: ( ( rule__Shortcode__Group__0 ) )
            // InternalEntityDsl.g:118:3: ( rule__Shortcode__Group__0 )
            {
             before(grammarAccess.getShortcodeAccess().getGroup()); 
            // InternalEntityDsl.g:119:3: ( rule__Shortcode__Group__0 )
            // InternalEntityDsl.g:119:4: rule__Shortcode__Group__0
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
    // InternalEntityDsl.g:128:1: entryRuleCustomPostType : ruleCustomPostType EOF ;
    public final void entryRuleCustomPostType() throws RecognitionException {
        try {
            // InternalEntityDsl.g:129:1: ( ruleCustomPostType EOF )
            // InternalEntityDsl.g:130:1: ruleCustomPostType EOF
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
    // InternalEntityDsl.g:137:1: ruleCustomPostType : ( ( rule__CustomPostType__Group__0 ) ) ;
    public final void ruleCustomPostType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:141:2: ( ( ( rule__CustomPostType__Group__0 ) ) )
            // InternalEntityDsl.g:142:2: ( ( rule__CustomPostType__Group__0 ) )
            {
            // InternalEntityDsl.g:142:2: ( ( rule__CustomPostType__Group__0 ) )
            // InternalEntityDsl.g:143:3: ( rule__CustomPostType__Group__0 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getGroup()); 
            // InternalEntityDsl.g:144:3: ( rule__CustomPostType__Group__0 )
            // InternalEntityDsl.g:144:4: rule__CustomPostType__Group__0
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
    // InternalEntityDsl.g:153:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalEntityDsl.g:154:1: ( ruleSetting EOF )
            // InternalEntityDsl.g:155:1: ruleSetting EOF
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
    // InternalEntityDsl.g:162:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:166:2: ( ( ( rule__Setting__Group__0 ) ) )
            // InternalEntityDsl.g:167:2: ( ( rule__Setting__Group__0 ) )
            {
            // InternalEntityDsl.g:167:2: ( ( rule__Setting__Group__0 ) )
            // InternalEntityDsl.g:168:3: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // InternalEntityDsl.g:169:3: ( rule__Setting__Group__0 )
            // InternalEntityDsl.g:169:4: rule__Setting__Group__0
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
    // InternalEntityDsl.g:178:1: entryRuleHook : ruleHook EOF ;
    public final void entryRuleHook() throws RecognitionException {
        try {
            // InternalEntityDsl.g:179:1: ( ruleHook EOF )
            // InternalEntityDsl.g:180:1: ruleHook EOF
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
    // InternalEntityDsl.g:187:1: ruleHook : ( ( rule__Hook__Group__0 ) ) ;
    public final void ruleHook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:191:2: ( ( ( rule__Hook__Group__0 ) ) )
            // InternalEntityDsl.g:192:2: ( ( rule__Hook__Group__0 ) )
            {
            // InternalEntityDsl.g:192:2: ( ( rule__Hook__Group__0 ) )
            // InternalEntityDsl.g:193:3: ( rule__Hook__Group__0 )
            {
             before(grammarAccess.getHookAccess().getGroup()); 
            // InternalEntityDsl.g:194:3: ( rule__Hook__Group__0 )
            // InternalEntityDsl.g:194:4: rule__Hook__Group__0
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
    // InternalEntityDsl.g:203:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // InternalEntityDsl.g:204:1: ( ruleStringList EOF )
            // InternalEntityDsl.g:205:1: ruleStringList EOF
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
    // InternalEntityDsl.g:212:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:216:2: ( ( ( rule__StringList__Group__0 ) ) )
            // InternalEntityDsl.g:217:2: ( ( rule__StringList__Group__0 ) )
            {
            // InternalEntityDsl.g:217:2: ( ( rule__StringList__Group__0 ) )
            // InternalEntityDsl.g:218:3: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // InternalEntityDsl.g:219:3: ( rule__StringList__Group__0 )
            // InternalEntityDsl.g:219:4: rule__StringList__Group__0
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
    // InternalEntityDsl.g:228:1: ruleHookType : ( ( rule__HookType__Alternatives ) ) ;
    public final void ruleHookType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:232:1: ( ( ( rule__HookType__Alternatives ) ) )
            // InternalEntityDsl.g:233:2: ( ( rule__HookType__Alternatives ) )
            {
            // InternalEntityDsl.g:233:2: ( ( rule__HookType__Alternatives ) )
            // InternalEntityDsl.g:234:3: ( rule__HookType__Alternatives )
            {
             before(grammarAccess.getHookTypeAccess().getAlternatives()); 
            // InternalEntityDsl.g:235:3: ( rule__HookType__Alternatives )
            // InternalEntityDsl.g:235:4: rule__HookType__Alternatives
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


    // $ANTLR start "rule__HookType__Alternatives"
    // InternalEntityDsl.g:243:1: rule__HookType__Alternatives : ( ( ( 'filter' ) ) | ( ( 'action' ) ) );
    public final void rule__HookType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:247:1: ( ( ( 'filter' ) ) | ( ( 'action' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEntityDsl.g:248:2: ( ( 'filter' ) )
                    {
                    // InternalEntityDsl.g:248:2: ( ( 'filter' ) )
                    // InternalEntityDsl.g:249:3: ( 'filter' )
                    {
                     before(grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0()); 
                    // InternalEntityDsl.g:250:3: ( 'filter' )
                    // InternalEntityDsl.g:250:4: 'filter'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:254:2: ( ( 'action' ) )
                    {
                    // InternalEntityDsl.g:254:2: ( ( 'action' ) )
                    // InternalEntityDsl.g:255:3: ( 'action' )
                    {
                     before(grammarAccess.getHookTypeAccess().getACTIONEnumLiteralDeclaration_1()); 
                    // InternalEntityDsl.g:256:3: ( 'action' )
                    // InternalEntityDsl.g:256:4: 'action'
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


    // $ANTLR start "rule__Plugin__Group__0"
    // InternalEntityDsl.g:264:1: rule__Plugin__Group__0 : rule__Plugin__Group__0__Impl rule__Plugin__Group__1 ;
    public final void rule__Plugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:268:1: ( rule__Plugin__Group__0__Impl rule__Plugin__Group__1 )
            // InternalEntityDsl.g:269:2: rule__Plugin__Group__0__Impl rule__Plugin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Plugin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__1();

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
    // $ANTLR end "rule__Plugin__Group__0"


    // $ANTLR start "rule__Plugin__Group__0__Impl"
    // InternalEntityDsl.g:276:1: rule__Plugin__Group__0__Impl : ( 'Plugin' ) ;
    public final void rule__Plugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:280:1: ( ( 'Plugin' ) )
            // InternalEntityDsl.g:281:1: ( 'Plugin' )
            {
            // InternalEntityDsl.g:281:1: ( 'Plugin' )
            // InternalEntityDsl.g:282:2: 'Plugin'
            {
             before(grammarAccess.getPluginAccess().getPluginKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getPluginKeyword_0()); 

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
    // $ANTLR end "rule__Plugin__Group__0__Impl"


    // $ANTLR start "rule__Plugin__Group__1"
    // InternalEntityDsl.g:291:1: rule__Plugin__Group__1 : rule__Plugin__Group__1__Impl rule__Plugin__Group__2 ;
    public final void rule__Plugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:295:1: ( rule__Plugin__Group__1__Impl rule__Plugin__Group__2 )
            // InternalEntityDsl.g:296:2: rule__Plugin__Group__1__Impl rule__Plugin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Plugin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__2();

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
    // $ANTLR end "rule__Plugin__Group__1"


    // $ANTLR start "rule__Plugin__Group__1__Impl"
    // InternalEntityDsl.g:303:1: rule__Plugin__Group__1__Impl : ( '{' ) ;
    public final void rule__Plugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:307:1: ( ( '{' ) )
            // InternalEntityDsl.g:308:1: ( '{' )
            {
            // InternalEntityDsl.g:308:1: ( '{' )
            // InternalEntityDsl.g:309:2: '{'
            {
             before(grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Plugin__Group__1__Impl"


    // $ANTLR start "rule__Plugin__Group__2"
    // InternalEntityDsl.g:318:1: rule__Plugin__Group__2 : rule__Plugin__Group__2__Impl rule__Plugin__Group__3 ;
    public final void rule__Plugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:322:1: ( rule__Plugin__Group__2__Impl rule__Plugin__Group__3 )
            // InternalEntityDsl.g:323:2: rule__Plugin__Group__2__Impl rule__Plugin__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__3();

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
    // $ANTLR end "rule__Plugin__Group__2"


    // $ANTLR start "rule__Plugin__Group__2__Impl"
    // InternalEntityDsl.g:330:1: rule__Plugin__Group__2__Impl : ( 'name' ) ;
    public final void rule__Plugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:334:1: ( ( 'name' ) )
            // InternalEntityDsl.g:335:1: ( 'name' )
            {
            // InternalEntityDsl.g:335:1: ( 'name' )
            // InternalEntityDsl.g:336:2: 'name'
            {
             before(grammarAccess.getPluginAccess().getNameKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getNameKeyword_2()); 

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
    // $ANTLR end "rule__Plugin__Group__2__Impl"


    // $ANTLR start "rule__Plugin__Group__3"
    // InternalEntityDsl.g:345:1: rule__Plugin__Group__3 : rule__Plugin__Group__3__Impl rule__Plugin__Group__4 ;
    public final void rule__Plugin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:349:1: ( rule__Plugin__Group__3__Impl rule__Plugin__Group__4 )
            // InternalEntityDsl.g:350:2: rule__Plugin__Group__3__Impl rule__Plugin__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Plugin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__4();

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
    // $ANTLR end "rule__Plugin__Group__3"


    // $ANTLR start "rule__Plugin__Group__3__Impl"
    // InternalEntityDsl.g:357:1: rule__Plugin__Group__3__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:361:1: ( ( '=' ) )
            // InternalEntityDsl.g:362:1: ( '=' )
            {
            // InternalEntityDsl.g:362:1: ( '=' )
            // InternalEntityDsl.g:363:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Plugin__Group__3__Impl"


    // $ANTLR start "rule__Plugin__Group__4"
    // InternalEntityDsl.g:372:1: rule__Plugin__Group__4 : rule__Plugin__Group__4__Impl rule__Plugin__Group__5 ;
    public final void rule__Plugin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:376:1: ( rule__Plugin__Group__4__Impl rule__Plugin__Group__5 )
            // InternalEntityDsl.g:377:2: rule__Plugin__Group__4__Impl rule__Plugin__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Plugin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__5();

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
    // $ANTLR end "rule__Plugin__Group__4"


    // $ANTLR start "rule__Plugin__Group__4__Impl"
    // InternalEntityDsl.g:384:1: rule__Plugin__Group__4__Impl : ( ( rule__Plugin__NameAssignment_4 ) ) ;
    public final void rule__Plugin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:388:1: ( ( ( rule__Plugin__NameAssignment_4 ) ) )
            // InternalEntityDsl.g:389:1: ( ( rule__Plugin__NameAssignment_4 ) )
            {
            // InternalEntityDsl.g:389:1: ( ( rule__Plugin__NameAssignment_4 ) )
            // InternalEntityDsl.g:390:2: ( rule__Plugin__NameAssignment_4 )
            {
             before(grammarAccess.getPluginAccess().getNameAssignment_4()); 
            // InternalEntityDsl.g:391:2: ( rule__Plugin__NameAssignment_4 )
            // InternalEntityDsl.g:391:3: rule__Plugin__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Plugin__Group__4__Impl"


    // $ANTLR start "rule__Plugin__Group__5"
    // InternalEntityDsl.g:399:1: rule__Plugin__Group__5 : rule__Plugin__Group__5__Impl rule__Plugin__Group__6 ;
    public final void rule__Plugin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:403:1: ( rule__Plugin__Group__5__Impl rule__Plugin__Group__6 )
            // InternalEntityDsl.g:404:2: rule__Plugin__Group__5__Impl rule__Plugin__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__6();

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
    // $ANTLR end "rule__Plugin__Group__5"


    // $ANTLR start "rule__Plugin__Group__5__Impl"
    // InternalEntityDsl.g:411:1: rule__Plugin__Group__5__Impl : ( 'version' ) ;
    public final void rule__Plugin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:415:1: ( ( 'version' ) )
            // InternalEntityDsl.g:416:1: ( 'version' )
            {
            // InternalEntityDsl.g:416:1: ( 'version' )
            // InternalEntityDsl.g:417:2: 'version'
            {
             before(grammarAccess.getPluginAccess().getVersionKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getVersionKeyword_5()); 

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
    // $ANTLR end "rule__Plugin__Group__5__Impl"


    // $ANTLR start "rule__Plugin__Group__6"
    // InternalEntityDsl.g:426:1: rule__Plugin__Group__6 : rule__Plugin__Group__6__Impl rule__Plugin__Group__7 ;
    public final void rule__Plugin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:430:1: ( rule__Plugin__Group__6__Impl rule__Plugin__Group__7 )
            // InternalEntityDsl.g:431:2: rule__Plugin__Group__6__Impl rule__Plugin__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Plugin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__7();

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
    // $ANTLR end "rule__Plugin__Group__6"


    // $ANTLR start "rule__Plugin__Group__6__Impl"
    // InternalEntityDsl.g:438:1: rule__Plugin__Group__6__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:442:1: ( ( '=' ) )
            // InternalEntityDsl.g:443:1: ( '=' )
            {
            // InternalEntityDsl.g:443:1: ( '=' )
            // InternalEntityDsl.g:444:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__Plugin__Group__6__Impl"


    // $ANTLR start "rule__Plugin__Group__7"
    // InternalEntityDsl.g:453:1: rule__Plugin__Group__7 : rule__Plugin__Group__7__Impl rule__Plugin__Group__8 ;
    public final void rule__Plugin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:457:1: ( rule__Plugin__Group__7__Impl rule__Plugin__Group__8 )
            // InternalEntityDsl.g:458:2: rule__Plugin__Group__7__Impl rule__Plugin__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Plugin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__8();

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
    // $ANTLR end "rule__Plugin__Group__7"


    // $ANTLR start "rule__Plugin__Group__7__Impl"
    // InternalEntityDsl.g:465:1: rule__Plugin__Group__7__Impl : ( ( rule__Plugin__VersionAssignment_7 ) ) ;
    public final void rule__Plugin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:469:1: ( ( ( rule__Plugin__VersionAssignment_7 ) ) )
            // InternalEntityDsl.g:470:1: ( ( rule__Plugin__VersionAssignment_7 ) )
            {
            // InternalEntityDsl.g:470:1: ( ( rule__Plugin__VersionAssignment_7 ) )
            // InternalEntityDsl.g:471:2: ( rule__Plugin__VersionAssignment_7 )
            {
             before(grammarAccess.getPluginAccess().getVersionAssignment_7()); 
            // InternalEntityDsl.g:472:2: ( rule__Plugin__VersionAssignment_7 )
            // InternalEntityDsl.g:472:3: rule__Plugin__VersionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__VersionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getVersionAssignment_7()); 

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
    // $ANTLR end "rule__Plugin__Group__7__Impl"


    // $ANTLR start "rule__Plugin__Group__8"
    // InternalEntityDsl.g:480:1: rule__Plugin__Group__8 : rule__Plugin__Group__8__Impl rule__Plugin__Group__9 ;
    public final void rule__Plugin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:484:1: ( rule__Plugin__Group__8__Impl rule__Plugin__Group__9 )
            // InternalEntityDsl.g:485:2: rule__Plugin__Group__8__Impl rule__Plugin__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__9();

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
    // $ANTLR end "rule__Plugin__Group__8"


    // $ANTLR start "rule__Plugin__Group__8__Impl"
    // InternalEntityDsl.g:492:1: rule__Plugin__Group__8__Impl : ( 'description' ) ;
    public final void rule__Plugin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:496:1: ( ( 'description' ) )
            // InternalEntityDsl.g:497:1: ( 'description' )
            {
            // InternalEntityDsl.g:497:1: ( 'description' )
            // InternalEntityDsl.g:498:2: 'description'
            {
             before(grammarAccess.getPluginAccess().getDescriptionKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getDescriptionKeyword_8()); 

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
    // $ANTLR end "rule__Plugin__Group__8__Impl"


    // $ANTLR start "rule__Plugin__Group__9"
    // InternalEntityDsl.g:507:1: rule__Plugin__Group__9 : rule__Plugin__Group__9__Impl rule__Plugin__Group__10 ;
    public final void rule__Plugin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:511:1: ( rule__Plugin__Group__9__Impl rule__Plugin__Group__10 )
            // InternalEntityDsl.g:512:2: rule__Plugin__Group__9__Impl rule__Plugin__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Plugin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__10();

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
    // $ANTLR end "rule__Plugin__Group__9"


    // $ANTLR start "rule__Plugin__Group__9__Impl"
    // InternalEntityDsl.g:519:1: rule__Plugin__Group__9__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:523:1: ( ( '=' ) )
            // InternalEntityDsl.g:524:1: ( '=' )
            {
            // InternalEntityDsl.g:524:1: ( '=' )
            // InternalEntityDsl.g:525:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_9()); 

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
    // $ANTLR end "rule__Plugin__Group__9__Impl"


    // $ANTLR start "rule__Plugin__Group__10"
    // InternalEntityDsl.g:534:1: rule__Plugin__Group__10 : rule__Plugin__Group__10__Impl rule__Plugin__Group__11 ;
    public final void rule__Plugin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:538:1: ( rule__Plugin__Group__10__Impl rule__Plugin__Group__11 )
            // InternalEntityDsl.g:539:2: rule__Plugin__Group__10__Impl rule__Plugin__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Plugin__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__11();

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
    // $ANTLR end "rule__Plugin__Group__10"


    // $ANTLR start "rule__Plugin__Group__10__Impl"
    // InternalEntityDsl.g:546:1: rule__Plugin__Group__10__Impl : ( ( rule__Plugin__DescriptionAssignment_10 ) ) ;
    public final void rule__Plugin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:550:1: ( ( ( rule__Plugin__DescriptionAssignment_10 ) ) )
            // InternalEntityDsl.g:551:1: ( ( rule__Plugin__DescriptionAssignment_10 ) )
            {
            // InternalEntityDsl.g:551:1: ( ( rule__Plugin__DescriptionAssignment_10 ) )
            // InternalEntityDsl.g:552:2: ( rule__Plugin__DescriptionAssignment_10 )
            {
             before(grammarAccess.getPluginAccess().getDescriptionAssignment_10()); 
            // InternalEntityDsl.g:553:2: ( rule__Plugin__DescriptionAssignment_10 )
            // InternalEntityDsl.g:553:3: rule__Plugin__DescriptionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__DescriptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getDescriptionAssignment_10()); 

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
    // $ANTLR end "rule__Plugin__Group__10__Impl"


    // $ANTLR start "rule__Plugin__Group__11"
    // InternalEntityDsl.g:561:1: rule__Plugin__Group__11 : rule__Plugin__Group__11__Impl rule__Plugin__Group__12 ;
    public final void rule__Plugin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:565:1: ( rule__Plugin__Group__11__Impl rule__Plugin__Group__12 )
            // InternalEntityDsl.g:566:2: rule__Plugin__Group__11__Impl rule__Plugin__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__12();

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
    // $ANTLR end "rule__Plugin__Group__11"


    // $ANTLR start "rule__Plugin__Group__11__Impl"
    // InternalEntityDsl.g:573:1: rule__Plugin__Group__11__Impl : ( 'author' ) ;
    public final void rule__Plugin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:577:1: ( ( 'author' ) )
            // InternalEntityDsl.g:578:1: ( 'author' )
            {
            // InternalEntityDsl.g:578:1: ( 'author' )
            // InternalEntityDsl.g:579:2: 'author'
            {
             before(grammarAccess.getPluginAccess().getAuthorKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getAuthorKeyword_11()); 

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
    // $ANTLR end "rule__Plugin__Group__11__Impl"


    // $ANTLR start "rule__Plugin__Group__12"
    // InternalEntityDsl.g:588:1: rule__Plugin__Group__12 : rule__Plugin__Group__12__Impl rule__Plugin__Group__13 ;
    public final void rule__Plugin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:592:1: ( rule__Plugin__Group__12__Impl rule__Plugin__Group__13 )
            // InternalEntityDsl.g:593:2: rule__Plugin__Group__12__Impl rule__Plugin__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__Plugin__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__13();

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
    // $ANTLR end "rule__Plugin__Group__12"


    // $ANTLR start "rule__Plugin__Group__12__Impl"
    // InternalEntityDsl.g:600:1: rule__Plugin__Group__12__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:604:1: ( ( '=' ) )
            // InternalEntityDsl.g:605:1: ( '=' )
            {
            // InternalEntityDsl.g:605:1: ( '=' )
            // InternalEntityDsl.g:606:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_12()); 

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
    // $ANTLR end "rule__Plugin__Group__12__Impl"


    // $ANTLR start "rule__Plugin__Group__13"
    // InternalEntityDsl.g:615:1: rule__Plugin__Group__13 : rule__Plugin__Group__13__Impl rule__Plugin__Group__14 ;
    public final void rule__Plugin__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:619:1: ( rule__Plugin__Group__13__Impl rule__Plugin__Group__14 )
            // InternalEntityDsl.g:620:2: rule__Plugin__Group__13__Impl rule__Plugin__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Plugin__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__14();

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
    // $ANTLR end "rule__Plugin__Group__13"


    // $ANTLR start "rule__Plugin__Group__13__Impl"
    // InternalEntityDsl.g:627:1: rule__Plugin__Group__13__Impl : ( ( rule__Plugin__AuthorAssignment_13 ) ) ;
    public final void rule__Plugin__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:631:1: ( ( ( rule__Plugin__AuthorAssignment_13 ) ) )
            // InternalEntityDsl.g:632:1: ( ( rule__Plugin__AuthorAssignment_13 ) )
            {
            // InternalEntityDsl.g:632:1: ( ( rule__Plugin__AuthorAssignment_13 ) )
            // InternalEntityDsl.g:633:2: ( rule__Plugin__AuthorAssignment_13 )
            {
             before(grammarAccess.getPluginAccess().getAuthorAssignment_13()); 
            // InternalEntityDsl.g:634:2: ( rule__Plugin__AuthorAssignment_13 )
            // InternalEntityDsl.g:634:3: rule__Plugin__AuthorAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__AuthorAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getAuthorAssignment_13()); 

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
    // $ANTLR end "rule__Plugin__Group__13__Impl"


    // $ANTLR start "rule__Plugin__Group__14"
    // InternalEntityDsl.g:642:1: rule__Plugin__Group__14 : rule__Plugin__Group__14__Impl rule__Plugin__Group__15 ;
    public final void rule__Plugin__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:646:1: ( rule__Plugin__Group__14__Impl rule__Plugin__Group__15 )
            // InternalEntityDsl.g:647:2: rule__Plugin__Group__14__Impl rule__Plugin__Group__15
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__15();

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
    // $ANTLR end "rule__Plugin__Group__14"


    // $ANTLR start "rule__Plugin__Group__14__Impl"
    // InternalEntityDsl.g:654:1: rule__Plugin__Group__14__Impl : ( 'license' ) ;
    public final void rule__Plugin__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:658:1: ( ( 'license' ) )
            // InternalEntityDsl.g:659:1: ( 'license' )
            {
            // InternalEntityDsl.g:659:1: ( 'license' )
            // InternalEntityDsl.g:660:2: 'license'
            {
             before(grammarAccess.getPluginAccess().getLicenseKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getLicenseKeyword_14()); 

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
    // $ANTLR end "rule__Plugin__Group__14__Impl"


    // $ANTLR start "rule__Plugin__Group__15"
    // InternalEntityDsl.g:669:1: rule__Plugin__Group__15 : rule__Plugin__Group__15__Impl rule__Plugin__Group__16 ;
    public final void rule__Plugin__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:673:1: ( rule__Plugin__Group__15__Impl rule__Plugin__Group__16 )
            // InternalEntityDsl.g:674:2: rule__Plugin__Group__15__Impl rule__Plugin__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__Plugin__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__16();

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
    // $ANTLR end "rule__Plugin__Group__15"


    // $ANTLR start "rule__Plugin__Group__15__Impl"
    // InternalEntityDsl.g:681:1: rule__Plugin__Group__15__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:685:1: ( ( '=' ) )
            // InternalEntityDsl.g:686:1: ( '=' )
            {
            // InternalEntityDsl.g:686:1: ( '=' )
            // InternalEntityDsl.g:687:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_15()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_15()); 

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
    // $ANTLR end "rule__Plugin__Group__15__Impl"


    // $ANTLR start "rule__Plugin__Group__16"
    // InternalEntityDsl.g:696:1: rule__Plugin__Group__16 : rule__Plugin__Group__16__Impl rule__Plugin__Group__17 ;
    public final void rule__Plugin__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:700:1: ( rule__Plugin__Group__16__Impl rule__Plugin__Group__17 )
            // InternalEntityDsl.g:701:2: rule__Plugin__Group__16__Impl rule__Plugin__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__Plugin__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__17();

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
    // $ANTLR end "rule__Plugin__Group__16"


    // $ANTLR start "rule__Plugin__Group__16__Impl"
    // InternalEntityDsl.g:708:1: rule__Plugin__Group__16__Impl : ( ( rule__Plugin__LicenseAssignment_16 ) ) ;
    public final void rule__Plugin__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:712:1: ( ( ( rule__Plugin__LicenseAssignment_16 ) ) )
            // InternalEntityDsl.g:713:1: ( ( rule__Plugin__LicenseAssignment_16 ) )
            {
            // InternalEntityDsl.g:713:1: ( ( rule__Plugin__LicenseAssignment_16 ) )
            // InternalEntityDsl.g:714:2: ( rule__Plugin__LicenseAssignment_16 )
            {
             before(grammarAccess.getPluginAccess().getLicenseAssignment_16()); 
            // InternalEntityDsl.g:715:2: ( rule__Plugin__LicenseAssignment_16 )
            // InternalEntityDsl.g:715:3: rule__Plugin__LicenseAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__LicenseAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getLicenseAssignment_16()); 

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
    // $ANTLR end "rule__Plugin__Group__16__Impl"


    // $ANTLR start "rule__Plugin__Group__17"
    // InternalEntityDsl.g:723:1: rule__Plugin__Group__17 : rule__Plugin__Group__17__Impl rule__Plugin__Group__18 ;
    public final void rule__Plugin__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:727:1: ( rule__Plugin__Group__17__Impl rule__Plugin__Group__18 )
            // InternalEntityDsl.g:728:2: rule__Plugin__Group__17__Impl rule__Plugin__Group__18
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__18();

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
    // $ANTLR end "rule__Plugin__Group__17"


    // $ANTLR start "rule__Plugin__Group__17__Impl"
    // InternalEntityDsl.g:735:1: rule__Plugin__Group__17__Impl : ( 'prefix' ) ;
    public final void rule__Plugin__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:739:1: ( ( 'prefix' ) )
            // InternalEntityDsl.g:740:1: ( 'prefix' )
            {
            // InternalEntityDsl.g:740:1: ( 'prefix' )
            // InternalEntityDsl.g:741:2: 'prefix'
            {
             before(grammarAccess.getPluginAccess().getPrefixKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getPrefixKeyword_17()); 

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
    // $ANTLR end "rule__Plugin__Group__17__Impl"


    // $ANTLR start "rule__Plugin__Group__18"
    // InternalEntityDsl.g:750:1: rule__Plugin__Group__18 : rule__Plugin__Group__18__Impl rule__Plugin__Group__19 ;
    public final void rule__Plugin__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:754:1: ( rule__Plugin__Group__18__Impl rule__Plugin__Group__19 )
            // InternalEntityDsl.g:755:2: rule__Plugin__Group__18__Impl rule__Plugin__Group__19
            {
            pushFollow(FOLLOW_6);
            rule__Plugin__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__19();

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
    // $ANTLR end "rule__Plugin__Group__18"


    // $ANTLR start "rule__Plugin__Group__18__Impl"
    // InternalEntityDsl.g:762:1: rule__Plugin__Group__18__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:766:1: ( ( '=' ) )
            // InternalEntityDsl.g:767:1: ( '=' )
            {
            // InternalEntityDsl.g:767:1: ( '=' )
            // InternalEntityDsl.g:768:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_18()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_18()); 

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
    // $ANTLR end "rule__Plugin__Group__18__Impl"


    // $ANTLR start "rule__Plugin__Group__19"
    // InternalEntityDsl.g:777:1: rule__Plugin__Group__19 : rule__Plugin__Group__19__Impl rule__Plugin__Group__20 ;
    public final void rule__Plugin__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:781:1: ( rule__Plugin__Group__19__Impl rule__Plugin__Group__20 )
            // InternalEntityDsl.g:782:2: rule__Plugin__Group__19__Impl rule__Plugin__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__Plugin__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__20();

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
    // $ANTLR end "rule__Plugin__Group__19"


    // $ANTLR start "rule__Plugin__Group__19__Impl"
    // InternalEntityDsl.g:789:1: rule__Plugin__Group__19__Impl : ( ( rule__Plugin__PrefixAssignment_19 ) ) ;
    public final void rule__Plugin__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:793:1: ( ( ( rule__Plugin__PrefixAssignment_19 ) ) )
            // InternalEntityDsl.g:794:1: ( ( rule__Plugin__PrefixAssignment_19 ) )
            {
            // InternalEntityDsl.g:794:1: ( ( rule__Plugin__PrefixAssignment_19 ) )
            // InternalEntityDsl.g:795:2: ( rule__Plugin__PrefixAssignment_19 )
            {
             before(grammarAccess.getPluginAccess().getPrefixAssignment_19()); 
            // InternalEntityDsl.g:796:2: ( rule__Plugin__PrefixAssignment_19 )
            // InternalEntityDsl.g:796:3: rule__Plugin__PrefixAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__PrefixAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getPrefixAssignment_19()); 

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
    // $ANTLR end "rule__Plugin__Group__19__Impl"


    // $ANTLR start "rule__Plugin__Group__20"
    // InternalEntityDsl.g:804:1: rule__Plugin__Group__20 : rule__Plugin__Group__20__Impl rule__Plugin__Group__21 ;
    public final void rule__Plugin__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:808:1: ( rule__Plugin__Group__20__Impl rule__Plugin__Group__21 )
            // InternalEntityDsl.g:809:2: rule__Plugin__Group__20__Impl rule__Plugin__Group__21
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__21();

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
    // $ANTLR end "rule__Plugin__Group__20"


    // $ANTLR start "rule__Plugin__Group__20__Impl"
    // InternalEntityDsl.g:816:1: rule__Plugin__Group__20__Impl : ( 'textDomain' ) ;
    public final void rule__Plugin__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:820:1: ( ( 'textDomain' ) )
            // InternalEntityDsl.g:821:1: ( 'textDomain' )
            {
            // InternalEntityDsl.g:821:1: ( 'textDomain' )
            // InternalEntityDsl.g:822:2: 'textDomain'
            {
             before(grammarAccess.getPluginAccess().getTextDomainKeyword_20()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getTextDomainKeyword_20()); 

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
    // $ANTLR end "rule__Plugin__Group__20__Impl"


    // $ANTLR start "rule__Plugin__Group__21"
    // InternalEntityDsl.g:831:1: rule__Plugin__Group__21 : rule__Plugin__Group__21__Impl rule__Plugin__Group__22 ;
    public final void rule__Plugin__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:835:1: ( rule__Plugin__Group__21__Impl rule__Plugin__Group__22 )
            // InternalEntityDsl.g:836:2: rule__Plugin__Group__21__Impl rule__Plugin__Group__22
            {
            pushFollow(FOLLOW_6);
            rule__Plugin__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__22();

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
    // $ANTLR end "rule__Plugin__Group__21"


    // $ANTLR start "rule__Plugin__Group__21__Impl"
    // InternalEntityDsl.g:843:1: rule__Plugin__Group__21__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:847:1: ( ( '=' ) )
            // InternalEntityDsl.g:848:1: ( '=' )
            {
            // InternalEntityDsl.g:848:1: ( '=' )
            // InternalEntityDsl.g:849:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_21()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_21()); 

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
    // $ANTLR end "rule__Plugin__Group__21__Impl"


    // $ANTLR start "rule__Plugin__Group__22"
    // InternalEntityDsl.g:858:1: rule__Plugin__Group__22 : rule__Plugin__Group__22__Impl rule__Plugin__Group__23 ;
    public final void rule__Plugin__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:862:1: ( rule__Plugin__Group__22__Impl rule__Plugin__Group__23 )
            // InternalEntityDsl.g:863:2: rule__Plugin__Group__22__Impl rule__Plugin__Group__23
            {
            pushFollow(FOLLOW_13);
            rule__Plugin__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__23();

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
    // $ANTLR end "rule__Plugin__Group__22"


    // $ANTLR start "rule__Plugin__Group__22__Impl"
    // InternalEntityDsl.g:870:1: rule__Plugin__Group__22__Impl : ( ( rule__Plugin__TextDomainAssignment_22 ) ) ;
    public final void rule__Plugin__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:874:1: ( ( ( rule__Plugin__TextDomainAssignment_22 ) ) )
            // InternalEntityDsl.g:875:1: ( ( rule__Plugin__TextDomainAssignment_22 ) )
            {
            // InternalEntityDsl.g:875:1: ( ( rule__Plugin__TextDomainAssignment_22 ) )
            // InternalEntityDsl.g:876:2: ( rule__Plugin__TextDomainAssignment_22 )
            {
             before(grammarAccess.getPluginAccess().getTextDomainAssignment_22()); 
            // InternalEntityDsl.g:877:2: ( rule__Plugin__TextDomainAssignment_22 )
            // InternalEntityDsl.g:877:3: rule__Plugin__TextDomainAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__TextDomainAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getTextDomainAssignment_22()); 

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
    // $ANTLR end "rule__Plugin__Group__22__Impl"


    // $ANTLR start "rule__Plugin__Group__23"
    // InternalEntityDsl.g:885:1: rule__Plugin__Group__23 : rule__Plugin__Group__23__Impl rule__Plugin__Group__24 ;
    public final void rule__Plugin__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:889:1: ( rule__Plugin__Group__23__Impl rule__Plugin__Group__24 )
            // InternalEntityDsl.g:890:2: rule__Plugin__Group__23__Impl rule__Plugin__Group__24
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__24();

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
    // $ANTLR end "rule__Plugin__Group__23"


    // $ANTLR start "rule__Plugin__Group__23__Impl"
    // InternalEntityDsl.g:897:1: rule__Plugin__Group__23__Impl : ( 'activate' ) ;
    public final void rule__Plugin__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:901:1: ( ( 'activate' ) )
            // InternalEntityDsl.g:902:1: ( 'activate' )
            {
            // InternalEntityDsl.g:902:1: ( 'activate' )
            // InternalEntityDsl.g:903:2: 'activate'
            {
             before(grammarAccess.getPluginAccess().getActivateKeyword_23()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getActivateKeyword_23()); 

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
    // $ANTLR end "rule__Plugin__Group__23__Impl"


    // $ANTLR start "rule__Plugin__Group__24"
    // InternalEntityDsl.g:912:1: rule__Plugin__Group__24 : rule__Plugin__Group__24__Impl rule__Plugin__Group__25 ;
    public final void rule__Plugin__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:916:1: ( rule__Plugin__Group__24__Impl rule__Plugin__Group__25 )
            // InternalEntityDsl.g:917:2: rule__Plugin__Group__24__Impl rule__Plugin__Group__25
            {
            pushFollow(FOLLOW_14);
            rule__Plugin__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__25();

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
    // $ANTLR end "rule__Plugin__Group__24"


    // $ANTLR start "rule__Plugin__Group__24__Impl"
    // InternalEntityDsl.g:924:1: rule__Plugin__Group__24__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:928:1: ( ( '=' ) )
            // InternalEntityDsl.g:929:1: ( '=' )
            {
            // InternalEntityDsl.g:929:1: ( '=' )
            // InternalEntityDsl.g:930:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_24()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_24()); 

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
    // $ANTLR end "rule__Plugin__Group__24__Impl"


    // $ANTLR start "rule__Plugin__Group__25"
    // InternalEntityDsl.g:939:1: rule__Plugin__Group__25 : rule__Plugin__Group__25__Impl rule__Plugin__Group__26 ;
    public final void rule__Plugin__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:943:1: ( rule__Plugin__Group__25__Impl rule__Plugin__Group__26 )
            // InternalEntityDsl.g:944:2: rule__Plugin__Group__25__Impl rule__Plugin__Group__26
            {
            pushFollow(FOLLOW_14);
            rule__Plugin__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__26();

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
    // $ANTLR end "rule__Plugin__Group__25"


    // $ANTLR start "rule__Plugin__Group__25__Impl"
    // InternalEntityDsl.g:951:1: rule__Plugin__Group__25__Impl : ( ( rule__Plugin__ActivateAssignment_25 )? ) ;
    public final void rule__Plugin__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:955:1: ( ( ( rule__Plugin__ActivateAssignment_25 )? ) )
            // InternalEntityDsl.g:956:1: ( ( rule__Plugin__ActivateAssignment_25 )? )
            {
            // InternalEntityDsl.g:956:1: ( ( rule__Plugin__ActivateAssignment_25 )? )
            // InternalEntityDsl.g:957:2: ( rule__Plugin__ActivateAssignment_25 )?
            {
             before(grammarAccess.getPluginAccess().getActivateAssignment_25()); 
            // InternalEntityDsl.g:958:2: ( rule__Plugin__ActivateAssignment_25 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:958:3: rule__Plugin__ActivateAssignment_25
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__ActivateAssignment_25();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginAccess().getActivateAssignment_25()); 

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
    // $ANTLR end "rule__Plugin__Group__25__Impl"


    // $ANTLR start "rule__Plugin__Group__26"
    // InternalEntityDsl.g:966:1: rule__Plugin__Group__26 : rule__Plugin__Group__26__Impl rule__Plugin__Group__27 ;
    public final void rule__Plugin__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:970:1: ( rule__Plugin__Group__26__Impl rule__Plugin__Group__27 )
            // InternalEntityDsl.g:971:2: rule__Plugin__Group__26__Impl rule__Plugin__Group__27
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__27();

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
    // $ANTLR end "rule__Plugin__Group__26"


    // $ANTLR start "rule__Plugin__Group__26__Impl"
    // InternalEntityDsl.g:978:1: rule__Plugin__Group__26__Impl : ( 'deactivate' ) ;
    public final void rule__Plugin__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:982:1: ( ( 'deactivate' ) )
            // InternalEntityDsl.g:983:1: ( 'deactivate' )
            {
            // InternalEntityDsl.g:983:1: ( 'deactivate' )
            // InternalEntityDsl.g:984:2: 'deactivate'
            {
             before(grammarAccess.getPluginAccess().getDeactivateKeyword_26()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getDeactivateKeyword_26()); 

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
    // $ANTLR end "rule__Plugin__Group__26__Impl"


    // $ANTLR start "rule__Plugin__Group__27"
    // InternalEntityDsl.g:993:1: rule__Plugin__Group__27 : rule__Plugin__Group__27__Impl rule__Plugin__Group__28 ;
    public final void rule__Plugin__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:997:1: ( rule__Plugin__Group__27__Impl rule__Plugin__Group__28 )
            // InternalEntityDsl.g:998:2: rule__Plugin__Group__27__Impl rule__Plugin__Group__28
            {
            pushFollow(FOLLOW_15);
            rule__Plugin__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__28();

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
    // $ANTLR end "rule__Plugin__Group__27"


    // $ANTLR start "rule__Plugin__Group__27__Impl"
    // InternalEntityDsl.g:1005:1: rule__Plugin__Group__27__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1009:1: ( ( '=' ) )
            // InternalEntityDsl.g:1010:1: ( '=' )
            {
            // InternalEntityDsl.g:1010:1: ( '=' )
            // InternalEntityDsl.g:1011:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_27()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_27()); 

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
    // $ANTLR end "rule__Plugin__Group__27__Impl"


    // $ANTLR start "rule__Plugin__Group__28"
    // InternalEntityDsl.g:1020:1: rule__Plugin__Group__28 : rule__Plugin__Group__28__Impl rule__Plugin__Group__29 ;
    public final void rule__Plugin__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1024:1: ( rule__Plugin__Group__28__Impl rule__Plugin__Group__29 )
            // InternalEntityDsl.g:1025:2: rule__Plugin__Group__28__Impl rule__Plugin__Group__29
            {
            pushFollow(FOLLOW_15);
            rule__Plugin__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__29();

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
    // $ANTLR end "rule__Plugin__Group__28"


    // $ANTLR start "rule__Plugin__Group__28__Impl"
    // InternalEntityDsl.g:1032:1: rule__Plugin__Group__28__Impl : ( ( rule__Plugin__DeactivateAssignment_28 )? ) ;
    public final void rule__Plugin__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1036:1: ( ( ( rule__Plugin__DeactivateAssignment_28 )? ) )
            // InternalEntityDsl.g:1037:1: ( ( rule__Plugin__DeactivateAssignment_28 )? )
            {
            // InternalEntityDsl.g:1037:1: ( ( rule__Plugin__DeactivateAssignment_28 )? )
            // InternalEntityDsl.g:1038:2: ( rule__Plugin__DeactivateAssignment_28 )?
            {
             before(grammarAccess.getPluginAccess().getDeactivateAssignment_28()); 
            // InternalEntityDsl.g:1039:2: ( rule__Plugin__DeactivateAssignment_28 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:1039:3: rule__Plugin__DeactivateAssignment_28
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__DeactivateAssignment_28();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginAccess().getDeactivateAssignment_28()); 

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
    // $ANTLR end "rule__Plugin__Group__28__Impl"


    // $ANTLR start "rule__Plugin__Group__29"
    // InternalEntityDsl.g:1047:1: rule__Plugin__Group__29 : rule__Plugin__Group__29__Impl rule__Plugin__Group__30 ;
    public final void rule__Plugin__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1051:1: ( rule__Plugin__Group__29__Impl rule__Plugin__Group__30 )
            // InternalEntityDsl.g:1052:2: rule__Plugin__Group__29__Impl rule__Plugin__Group__30
            {
            pushFollow(FOLLOW_5);
            rule__Plugin__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__30();

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
    // $ANTLR end "rule__Plugin__Group__29"


    // $ANTLR start "rule__Plugin__Group__29__Impl"
    // InternalEntityDsl.g:1059:1: rule__Plugin__Group__29__Impl : ( 'uninstall' ) ;
    public final void rule__Plugin__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1063:1: ( ( 'uninstall' ) )
            // InternalEntityDsl.g:1064:1: ( 'uninstall' )
            {
            // InternalEntityDsl.g:1064:1: ( 'uninstall' )
            // InternalEntityDsl.g:1065:2: 'uninstall'
            {
             before(grammarAccess.getPluginAccess().getUninstallKeyword_29()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getUninstallKeyword_29()); 

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
    // $ANTLR end "rule__Plugin__Group__29__Impl"


    // $ANTLR start "rule__Plugin__Group__30"
    // InternalEntityDsl.g:1074:1: rule__Plugin__Group__30 : rule__Plugin__Group__30__Impl rule__Plugin__Group__31 ;
    public final void rule__Plugin__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1078:1: ( rule__Plugin__Group__30__Impl rule__Plugin__Group__31 )
            // InternalEntityDsl.g:1079:2: rule__Plugin__Group__30__Impl rule__Plugin__Group__31
            {
            pushFollow(FOLLOW_16);
            rule__Plugin__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__31();

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
    // $ANTLR end "rule__Plugin__Group__30"


    // $ANTLR start "rule__Plugin__Group__30__Impl"
    // InternalEntityDsl.g:1086:1: rule__Plugin__Group__30__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1090:1: ( ( '=' ) )
            // InternalEntityDsl.g:1091:1: ( '=' )
            {
            // InternalEntityDsl.g:1091:1: ( '=' )
            // InternalEntityDsl.g:1092:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_30()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getEqualsSignKeyword_30()); 

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
    // $ANTLR end "rule__Plugin__Group__30__Impl"


    // $ANTLR start "rule__Plugin__Group__31"
    // InternalEntityDsl.g:1101:1: rule__Plugin__Group__31 : rule__Plugin__Group__31__Impl rule__Plugin__Group__32 ;
    public final void rule__Plugin__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1105:1: ( rule__Plugin__Group__31__Impl rule__Plugin__Group__32 )
            // InternalEntityDsl.g:1106:2: rule__Plugin__Group__31__Impl rule__Plugin__Group__32
            {
            pushFollow(FOLLOW_16);
            rule__Plugin__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__32();

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
    // $ANTLR end "rule__Plugin__Group__31"


    // $ANTLR start "rule__Plugin__Group__31__Impl"
    // InternalEntityDsl.g:1113:1: rule__Plugin__Group__31__Impl : ( ( rule__Plugin__UninstallAssignment_31 )? ) ;
    public final void rule__Plugin__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1117:1: ( ( ( rule__Plugin__UninstallAssignment_31 )? ) )
            // InternalEntityDsl.g:1118:1: ( ( rule__Plugin__UninstallAssignment_31 )? )
            {
            // InternalEntityDsl.g:1118:1: ( ( rule__Plugin__UninstallAssignment_31 )? )
            // InternalEntityDsl.g:1119:2: ( rule__Plugin__UninstallAssignment_31 )?
            {
             before(grammarAccess.getPluginAccess().getUninstallAssignment_31()); 
            // InternalEntityDsl.g:1120:2: ( rule__Plugin__UninstallAssignment_31 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:1120:3: rule__Plugin__UninstallAssignment_31
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__UninstallAssignment_31();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginAccess().getUninstallAssignment_31()); 

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
    // $ANTLR end "rule__Plugin__Group__31__Impl"


    // $ANTLR start "rule__Plugin__Group__32"
    // InternalEntityDsl.g:1128:1: rule__Plugin__Group__32 : rule__Plugin__Group__32__Impl rule__Plugin__Group__33 ;
    public final void rule__Plugin__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1132:1: ( rule__Plugin__Group__32__Impl rule__Plugin__Group__33 )
            // InternalEntityDsl.g:1133:2: rule__Plugin__Group__32__Impl rule__Plugin__Group__33
            {
            pushFollow(FOLLOW_16);
            rule__Plugin__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__33();

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
    // $ANTLR end "rule__Plugin__Group__32"


    // $ANTLR start "rule__Plugin__Group__32__Impl"
    // InternalEntityDsl.g:1140:1: rule__Plugin__Group__32__Impl : ( ( rule__Plugin__WidgetsAssignment_32 )* ) ;
    public final void rule__Plugin__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1144:1: ( ( ( rule__Plugin__WidgetsAssignment_32 )* ) )
            // InternalEntityDsl.g:1145:1: ( ( rule__Plugin__WidgetsAssignment_32 )* )
            {
            // InternalEntityDsl.g:1145:1: ( ( rule__Plugin__WidgetsAssignment_32 )* )
            // InternalEntityDsl.g:1146:2: ( rule__Plugin__WidgetsAssignment_32 )*
            {
             before(grammarAccess.getPluginAccess().getWidgetsAssignment_32()); 
            // InternalEntityDsl.g:1147:2: ( rule__Plugin__WidgetsAssignment_32 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEntityDsl.g:1147:3: rule__Plugin__WidgetsAssignment_32
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Plugin__WidgetsAssignment_32();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getWidgetsAssignment_32()); 

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
    // $ANTLR end "rule__Plugin__Group__32__Impl"


    // $ANTLR start "rule__Plugin__Group__33"
    // InternalEntityDsl.g:1155:1: rule__Plugin__Group__33 : rule__Plugin__Group__33__Impl rule__Plugin__Group__34 ;
    public final void rule__Plugin__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1159:1: ( rule__Plugin__Group__33__Impl rule__Plugin__Group__34 )
            // InternalEntityDsl.g:1160:2: rule__Plugin__Group__33__Impl rule__Plugin__Group__34
            {
            pushFollow(FOLLOW_16);
            rule__Plugin__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__34();

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
    // $ANTLR end "rule__Plugin__Group__33"


    // $ANTLR start "rule__Plugin__Group__33__Impl"
    // InternalEntityDsl.g:1167:1: rule__Plugin__Group__33__Impl : ( ( rule__Plugin__ShortcodesAssignment_33 )* ) ;
    public final void rule__Plugin__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1171:1: ( ( ( rule__Plugin__ShortcodesAssignment_33 )* ) )
            // InternalEntityDsl.g:1172:1: ( ( rule__Plugin__ShortcodesAssignment_33 )* )
            {
            // InternalEntityDsl.g:1172:1: ( ( rule__Plugin__ShortcodesAssignment_33 )* )
            // InternalEntityDsl.g:1173:2: ( rule__Plugin__ShortcodesAssignment_33 )*
            {
             before(grammarAccess.getPluginAccess().getShortcodesAssignment_33()); 
            // InternalEntityDsl.g:1174:2: ( rule__Plugin__ShortcodesAssignment_33 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEntityDsl.g:1174:3: rule__Plugin__ShortcodesAssignment_33
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Plugin__ShortcodesAssignment_33();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getShortcodesAssignment_33()); 

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
    // $ANTLR end "rule__Plugin__Group__33__Impl"


    // $ANTLR start "rule__Plugin__Group__34"
    // InternalEntityDsl.g:1182:1: rule__Plugin__Group__34 : rule__Plugin__Group__34__Impl rule__Plugin__Group__35 ;
    public final void rule__Plugin__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1186:1: ( rule__Plugin__Group__34__Impl rule__Plugin__Group__35 )
            // InternalEntityDsl.g:1187:2: rule__Plugin__Group__34__Impl rule__Plugin__Group__35
            {
            pushFollow(FOLLOW_16);
            rule__Plugin__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__35();

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
    // $ANTLR end "rule__Plugin__Group__34"


    // $ANTLR start "rule__Plugin__Group__34__Impl"
    // InternalEntityDsl.g:1194:1: rule__Plugin__Group__34__Impl : ( ( rule__Plugin__CustomPostTypesAssignment_34 )* ) ;
    public final void rule__Plugin__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1198:1: ( ( ( rule__Plugin__CustomPostTypesAssignment_34 )* ) )
            // InternalEntityDsl.g:1199:1: ( ( rule__Plugin__CustomPostTypesAssignment_34 )* )
            {
            // InternalEntityDsl.g:1199:1: ( ( rule__Plugin__CustomPostTypesAssignment_34 )* )
            // InternalEntityDsl.g:1200:2: ( rule__Plugin__CustomPostTypesAssignment_34 )*
            {
             before(grammarAccess.getPluginAccess().getCustomPostTypesAssignment_34()); 
            // InternalEntityDsl.g:1201:2: ( rule__Plugin__CustomPostTypesAssignment_34 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEntityDsl.g:1201:3: rule__Plugin__CustomPostTypesAssignment_34
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Plugin__CustomPostTypesAssignment_34();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getCustomPostTypesAssignment_34()); 

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
    // $ANTLR end "rule__Plugin__Group__34__Impl"


    // $ANTLR start "rule__Plugin__Group__35"
    // InternalEntityDsl.g:1209:1: rule__Plugin__Group__35 : rule__Plugin__Group__35__Impl rule__Plugin__Group__36 ;
    public final void rule__Plugin__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1213:1: ( rule__Plugin__Group__35__Impl rule__Plugin__Group__36 )
            // InternalEntityDsl.g:1214:2: rule__Plugin__Group__35__Impl rule__Plugin__Group__36
            {
            pushFollow(FOLLOW_16);
            rule__Plugin__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__36();

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
    // $ANTLR end "rule__Plugin__Group__35"


    // $ANTLR start "rule__Plugin__Group__35__Impl"
    // InternalEntityDsl.g:1221:1: rule__Plugin__Group__35__Impl : ( ( rule__Plugin__SettingsAssignment_35 )* ) ;
    public final void rule__Plugin__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1225:1: ( ( ( rule__Plugin__SettingsAssignment_35 )* ) )
            // InternalEntityDsl.g:1226:1: ( ( rule__Plugin__SettingsAssignment_35 )* )
            {
            // InternalEntityDsl.g:1226:1: ( ( rule__Plugin__SettingsAssignment_35 )* )
            // InternalEntityDsl.g:1227:2: ( rule__Plugin__SettingsAssignment_35 )*
            {
             before(grammarAccess.getPluginAccess().getSettingsAssignment_35()); 
            // InternalEntityDsl.g:1228:2: ( rule__Plugin__SettingsAssignment_35 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:1228:3: rule__Plugin__SettingsAssignment_35
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Plugin__SettingsAssignment_35();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getSettingsAssignment_35()); 

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
    // $ANTLR end "rule__Plugin__Group__35__Impl"


    // $ANTLR start "rule__Plugin__Group__36"
    // InternalEntityDsl.g:1236:1: rule__Plugin__Group__36 : rule__Plugin__Group__36__Impl rule__Plugin__Group__37 ;
    public final void rule__Plugin__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1240:1: ( rule__Plugin__Group__36__Impl rule__Plugin__Group__37 )
            // InternalEntityDsl.g:1241:2: rule__Plugin__Group__36__Impl rule__Plugin__Group__37
            {
            pushFollow(FOLLOW_16);
            rule__Plugin__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__37();

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
    // $ANTLR end "rule__Plugin__Group__36"


    // $ANTLR start "rule__Plugin__Group__36__Impl"
    // InternalEntityDsl.g:1248:1: rule__Plugin__Group__36__Impl : ( ( rule__Plugin__HooksAssignment_36 )* ) ;
    public final void rule__Plugin__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1252:1: ( ( ( rule__Plugin__HooksAssignment_36 )* ) )
            // InternalEntityDsl.g:1253:1: ( ( rule__Plugin__HooksAssignment_36 )* )
            {
            // InternalEntityDsl.g:1253:1: ( ( rule__Plugin__HooksAssignment_36 )* )
            // InternalEntityDsl.g:1254:2: ( rule__Plugin__HooksAssignment_36 )*
            {
             before(grammarAccess.getPluginAccess().getHooksAssignment_36()); 
            // InternalEntityDsl.g:1255:2: ( rule__Plugin__HooksAssignment_36 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:1255:3: rule__Plugin__HooksAssignment_36
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Plugin__HooksAssignment_36();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getHooksAssignment_36()); 

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
    // $ANTLR end "rule__Plugin__Group__36__Impl"


    // $ANTLR start "rule__Plugin__Group__37"
    // InternalEntityDsl.g:1263:1: rule__Plugin__Group__37 : rule__Plugin__Group__37__Impl ;
    public final void rule__Plugin__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1267:1: ( rule__Plugin__Group__37__Impl )
            // InternalEntityDsl.g:1268:2: rule__Plugin__Group__37__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__Group__37__Impl();

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
    // $ANTLR end "rule__Plugin__Group__37"


    // $ANTLR start "rule__Plugin__Group__37__Impl"
    // InternalEntityDsl.g:1274:1: rule__Plugin__Group__37__Impl : ( '}' ) ;
    public final void rule__Plugin__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1278:1: ( ( '}' ) )
            // InternalEntityDsl.g:1279:1: ( '}' )
            {
            // InternalEntityDsl.g:1279:1: ( '}' )
            // InternalEntityDsl.g:1280:2: '}'
            {
             before(grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_37()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_37()); 

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
    // $ANTLR end "rule__Plugin__Group__37__Impl"


    // $ANTLR start "rule__Widget__Group__0"
    // InternalEntityDsl.g:1290:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1294:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalEntityDsl.g:1295:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEntityDsl.g:1302:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1306:1: ( ( 'Widget' ) )
            // InternalEntityDsl.g:1307:1: ( 'Widget' )
            {
            // InternalEntityDsl.g:1307:1: ( 'Widget' )
            // InternalEntityDsl.g:1308:2: 'Widget'
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
    // InternalEntityDsl.g:1317:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1321:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalEntityDsl.g:1322:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalEntityDsl.g:1329:1: rule__Widget__Group__1__Impl : ( '{' ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1333:1: ( ( '{' ) )
            // InternalEntityDsl.g:1334:1: ( '{' )
            {
            // InternalEntityDsl.g:1334:1: ( '{' )
            // InternalEntityDsl.g:1335:2: '{'
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
    // InternalEntityDsl.g:1344:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1348:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalEntityDsl.g:1349:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:1356:1: rule__Widget__Group__2__Impl : ( 'widgetName' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1360:1: ( ( 'widgetName' ) )
            // InternalEntityDsl.g:1361:1: ( 'widgetName' )
            {
            // InternalEntityDsl.g:1361:1: ( 'widgetName' )
            // InternalEntityDsl.g:1362:2: 'widgetName'
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
    // InternalEntityDsl.g:1371:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1375:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalEntityDsl.g:1376:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:1383:1: rule__Widget__Group__3__Impl : ( '=' ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1387:1: ( ( '=' ) )
            // InternalEntityDsl.g:1388:1: ( '=' )
            {
            // InternalEntityDsl.g:1388:1: ( '=' )
            // InternalEntityDsl.g:1389:2: '='
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
    // InternalEntityDsl.g:1398:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1402:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalEntityDsl.g:1403:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalEntityDsl.g:1410:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__WidgetNameAssignment_4 ) ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1414:1: ( ( ( rule__Widget__WidgetNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1415:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1415:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            // InternalEntityDsl.g:1416:2: ( rule__Widget__WidgetNameAssignment_4 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetNameAssignment_4()); 
            // InternalEntityDsl.g:1417:2: ( rule__Widget__WidgetNameAssignment_4 )
            // InternalEntityDsl.g:1417:3: rule__Widget__WidgetNameAssignment_4
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
    // InternalEntityDsl.g:1425:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl rule__Widget__Group__6 ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1429:1: ( rule__Widget__Group__5__Impl rule__Widget__Group__6 )
            // InternalEntityDsl.g:1430:2: rule__Widget__Group__5__Impl rule__Widget__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:1437:1: rule__Widget__Group__5__Impl : ( 'widgetDescription' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1441:1: ( ( 'widgetDescription' ) )
            // InternalEntityDsl.g:1442:1: ( 'widgetDescription' )
            {
            // InternalEntityDsl.g:1442:1: ( 'widgetDescription' )
            // InternalEntityDsl.g:1443:2: 'widgetDescription'
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
    // InternalEntityDsl.g:1452:1: rule__Widget__Group__6 : rule__Widget__Group__6__Impl rule__Widget__Group__7 ;
    public final void rule__Widget__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1456:1: ( rule__Widget__Group__6__Impl rule__Widget__Group__7 )
            // InternalEntityDsl.g:1457:2: rule__Widget__Group__6__Impl rule__Widget__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalEntityDsl.g:1464:1: rule__Widget__Group__6__Impl : ( '=' ) ;
    public final void rule__Widget__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1468:1: ( ( '=' ) )
            // InternalEntityDsl.g:1469:1: ( '=' )
            {
            // InternalEntityDsl.g:1469:1: ( '=' )
            // InternalEntityDsl.g:1470:2: '='
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
    // InternalEntityDsl.g:1479:1: rule__Widget__Group__7 : rule__Widget__Group__7__Impl rule__Widget__Group__8 ;
    public final void rule__Widget__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1483:1: ( rule__Widget__Group__7__Impl rule__Widget__Group__8 )
            // InternalEntityDsl.g:1484:2: rule__Widget__Group__7__Impl rule__Widget__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalEntityDsl.g:1491:1: rule__Widget__Group__7__Impl : ( ( rule__Widget__WidgetDescriptionAssignment_7 )? ) ;
    public final void rule__Widget__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1495:1: ( ( ( rule__Widget__WidgetDescriptionAssignment_7 )? ) )
            // InternalEntityDsl.g:1496:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 )? )
            {
            // InternalEntityDsl.g:1496:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 )? )
            // InternalEntityDsl.g:1497:2: ( rule__Widget__WidgetDescriptionAssignment_7 )?
            {
             before(grammarAccess.getWidgetAccess().getWidgetDescriptionAssignment_7()); 
            // InternalEntityDsl.g:1498:2: ( rule__Widget__WidgetDescriptionAssignment_7 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEntityDsl.g:1498:3: rule__Widget__WidgetDescriptionAssignment_7
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
    // InternalEntityDsl.g:1506:1: rule__Widget__Group__8 : rule__Widget__Group__8__Impl rule__Widget__Group__9 ;
    public final void rule__Widget__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1510:1: ( rule__Widget__Group__8__Impl rule__Widget__Group__9 )
            // InternalEntityDsl.g:1511:2: rule__Widget__Group__8__Impl rule__Widget__Group__9
            {
            pushFollow(FOLLOW_24);
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
    // InternalEntityDsl.g:1518:1: rule__Widget__Group__8__Impl : ( ( rule__Widget__SettingsAssignment_8 )* ) ;
    public final void rule__Widget__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1522:1: ( ( ( rule__Widget__SettingsAssignment_8 )* ) )
            // InternalEntityDsl.g:1523:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            {
            // InternalEntityDsl.g:1523:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            // InternalEntityDsl.g:1524:2: ( rule__Widget__SettingsAssignment_8 )*
            {
             before(grammarAccess.getWidgetAccess().getSettingsAssignment_8()); 
            // InternalEntityDsl.g:1525:2: ( rule__Widget__SettingsAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEntityDsl.g:1525:3: rule__Widget__SettingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Widget__SettingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalEntityDsl.g:1533:1: rule__Widget__Group__9 : rule__Widget__Group__9__Impl ;
    public final void rule__Widget__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1537:1: ( rule__Widget__Group__9__Impl )
            // InternalEntityDsl.g:1538:2: rule__Widget__Group__9__Impl
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
    // InternalEntityDsl.g:1544:1: rule__Widget__Group__9__Impl : ( '}' ) ;
    public final void rule__Widget__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1548:1: ( ( '}' ) )
            // InternalEntityDsl.g:1549:1: ( '}' )
            {
            // InternalEntityDsl.g:1549:1: ( '}' )
            // InternalEntityDsl.g:1550:2: '}'
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
    // InternalEntityDsl.g:1560:1: rule__Shortcode__Group__0 : rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 ;
    public final void rule__Shortcode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1564:1: ( rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 )
            // InternalEntityDsl.g:1565:2: rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEntityDsl.g:1572:1: rule__Shortcode__Group__0__Impl : ( 'Shortcode' ) ;
    public final void rule__Shortcode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1576:1: ( ( 'Shortcode' ) )
            // InternalEntityDsl.g:1577:1: ( 'Shortcode' )
            {
            // InternalEntityDsl.g:1577:1: ( 'Shortcode' )
            // InternalEntityDsl.g:1578:2: 'Shortcode'
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
    // InternalEntityDsl.g:1587:1: rule__Shortcode__Group__1 : rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 ;
    public final void rule__Shortcode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1591:1: ( rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 )
            // InternalEntityDsl.g:1592:2: rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalEntityDsl.g:1599:1: rule__Shortcode__Group__1__Impl : ( '{' ) ;
    public final void rule__Shortcode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1603:1: ( ( '{' ) )
            // InternalEntityDsl.g:1604:1: ( '{' )
            {
            // InternalEntityDsl.g:1604:1: ( '{' )
            // InternalEntityDsl.g:1605:2: '{'
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
    // InternalEntityDsl.g:1614:1: rule__Shortcode__Group__2 : rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 ;
    public final void rule__Shortcode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1618:1: ( rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 )
            // InternalEntityDsl.g:1619:2: rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:1626:1: rule__Shortcode__Group__2__Impl : ( 'shortcodeName' ) ;
    public final void rule__Shortcode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1630:1: ( ( 'shortcodeName' ) )
            // InternalEntityDsl.g:1631:1: ( 'shortcodeName' )
            {
            // InternalEntityDsl.g:1631:1: ( 'shortcodeName' )
            // InternalEntityDsl.g:1632:2: 'shortcodeName'
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
    // InternalEntityDsl.g:1641:1: rule__Shortcode__Group__3 : rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 ;
    public final void rule__Shortcode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1645:1: ( rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 )
            // InternalEntityDsl.g:1646:2: rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:1653:1: rule__Shortcode__Group__3__Impl : ( '=' ) ;
    public final void rule__Shortcode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1657:1: ( ( '=' ) )
            // InternalEntityDsl.g:1658:1: ( '=' )
            {
            // InternalEntityDsl.g:1658:1: ( '=' )
            // InternalEntityDsl.g:1659:2: '='
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
    // InternalEntityDsl.g:1668:1: rule__Shortcode__Group__4 : rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 ;
    public final void rule__Shortcode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1672:1: ( rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 )
            // InternalEntityDsl.g:1673:2: rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalEntityDsl.g:1680:1: rule__Shortcode__Group__4__Impl : ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) ;
    public final void rule__Shortcode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1684:1: ( ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1685:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1685:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            // InternalEntityDsl.g:1686:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeNameAssignment_4()); 
            // InternalEntityDsl.g:1687:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            // InternalEntityDsl.g:1687:3: rule__Shortcode__ShortcodeNameAssignment_4
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
    // InternalEntityDsl.g:1695:1: rule__Shortcode__Group__5 : rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 ;
    public final void rule__Shortcode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1699:1: ( rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 )
            // InternalEntityDsl.g:1700:2: rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalEntityDsl.g:1707:1: rule__Shortcode__Group__5__Impl : ( ( rule__Shortcode__SettingsAssignment_5 )* ) ;
    public final void rule__Shortcode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1711:1: ( ( ( rule__Shortcode__SettingsAssignment_5 )* ) )
            // InternalEntityDsl.g:1712:1: ( ( rule__Shortcode__SettingsAssignment_5 )* )
            {
            // InternalEntityDsl.g:1712:1: ( ( rule__Shortcode__SettingsAssignment_5 )* )
            // InternalEntityDsl.g:1713:2: ( rule__Shortcode__SettingsAssignment_5 )*
            {
             before(grammarAccess.getShortcodeAccess().getSettingsAssignment_5()); 
            // InternalEntityDsl.g:1714:2: ( rule__Shortcode__SettingsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDsl.g:1714:3: rule__Shortcode__SettingsAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Shortcode__SettingsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalEntityDsl.g:1722:1: rule__Shortcode__Group__6 : rule__Shortcode__Group__6__Impl ;
    public final void rule__Shortcode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1726:1: ( rule__Shortcode__Group__6__Impl )
            // InternalEntityDsl.g:1727:2: rule__Shortcode__Group__6__Impl
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
    // InternalEntityDsl.g:1733:1: rule__Shortcode__Group__6__Impl : ( '}' ) ;
    public final void rule__Shortcode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1737:1: ( ( '}' ) )
            // InternalEntityDsl.g:1738:1: ( '}' )
            {
            // InternalEntityDsl.g:1738:1: ( '}' )
            // InternalEntityDsl.g:1739:2: '}'
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
    // InternalEntityDsl.g:1749:1: rule__CustomPostType__Group__0 : rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 ;
    public final void rule__CustomPostType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1753:1: ( rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 )
            // InternalEntityDsl.g:1754:2: rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEntityDsl.g:1761:1: rule__CustomPostType__Group__0__Impl : ( 'CustomPostType' ) ;
    public final void rule__CustomPostType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1765:1: ( ( 'CustomPostType' ) )
            // InternalEntityDsl.g:1766:1: ( 'CustomPostType' )
            {
            // InternalEntityDsl.g:1766:1: ( 'CustomPostType' )
            // InternalEntityDsl.g:1767:2: 'CustomPostType'
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
    // InternalEntityDsl.g:1776:1: rule__CustomPostType__Group__1 : rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 ;
    public final void rule__CustomPostType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1780:1: ( rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 )
            // InternalEntityDsl.g:1781:2: rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalEntityDsl.g:1788:1: rule__CustomPostType__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomPostType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1792:1: ( ( '{' ) )
            // InternalEntityDsl.g:1793:1: ( '{' )
            {
            // InternalEntityDsl.g:1793:1: ( '{' )
            // InternalEntityDsl.g:1794:2: '{'
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
    // InternalEntityDsl.g:1803:1: rule__CustomPostType__Group__2 : rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 ;
    public final void rule__CustomPostType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1807:1: ( rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 )
            // InternalEntityDsl.g:1808:2: rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:1815:1: rule__CustomPostType__Group__2__Impl : ( 'cptName' ) ;
    public final void rule__CustomPostType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1819:1: ( ( 'cptName' ) )
            // InternalEntityDsl.g:1820:1: ( 'cptName' )
            {
            // InternalEntityDsl.g:1820:1: ( 'cptName' )
            // InternalEntityDsl.g:1821:2: 'cptName'
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
    // InternalEntityDsl.g:1830:1: rule__CustomPostType__Group__3 : rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 ;
    public final void rule__CustomPostType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1834:1: ( rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 )
            // InternalEntityDsl.g:1835:2: rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:1842:1: rule__CustomPostType__Group__3__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1846:1: ( ( '=' ) )
            // InternalEntityDsl.g:1847:1: ( '=' )
            {
            // InternalEntityDsl.g:1847:1: ( '=' )
            // InternalEntityDsl.g:1848:2: '='
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
    // InternalEntityDsl.g:1857:1: rule__CustomPostType__Group__4 : rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 ;
    public final void rule__CustomPostType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1861:1: ( rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 )
            // InternalEntityDsl.g:1862:2: rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalEntityDsl.g:1869:1: rule__CustomPostType__Group__4__Impl : ( ( rule__CustomPostType__CptNameAssignment_4 ) ) ;
    public final void rule__CustomPostType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1873:1: ( ( ( rule__CustomPostType__CptNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1874:1: ( ( rule__CustomPostType__CptNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1874:1: ( ( rule__CustomPostType__CptNameAssignment_4 ) )
            // InternalEntityDsl.g:1875:2: ( rule__CustomPostType__CptNameAssignment_4 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptNameAssignment_4()); 
            // InternalEntityDsl.g:1876:2: ( rule__CustomPostType__CptNameAssignment_4 )
            // InternalEntityDsl.g:1876:3: rule__CustomPostType__CptNameAssignment_4
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
    // InternalEntityDsl.g:1884:1: rule__CustomPostType__Group__5 : rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 ;
    public final void rule__CustomPostType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1888:1: ( rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 )
            // InternalEntityDsl.g:1889:2: rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:1896:1: rule__CustomPostType__Group__5__Impl : ( 'cptSingularName' ) ;
    public final void rule__CustomPostType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1900:1: ( ( 'cptSingularName' ) )
            // InternalEntityDsl.g:1901:1: ( 'cptSingularName' )
            {
            // InternalEntityDsl.g:1901:1: ( 'cptSingularName' )
            // InternalEntityDsl.g:1902:2: 'cptSingularName'
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
    // InternalEntityDsl.g:1911:1: rule__CustomPostType__Group__6 : rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 ;
    public final void rule__CustomPostType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1915:1: ( rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 )
            // InternalEntityDsl.g:1916:2: rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:1923:1: rule__CustomPostType__Group__6__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1927:1: ( ( '=' ) )
            // InternalEntityDsl.g:1928:1: ( '=' )
            {
            // InternalEntityDsl.g:1928:1: ( '=' )
            // InternalEntityDsl.g:1929:2: '='
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
    // InternalEntityDsl.g:1938:1: rule__CustomPostType__Group__7 : rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 ;
    public final void rule__CustomPostType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1942:1: ( rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 )
            // InternalEntityDsl.g:1943:2: rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalEntityDsl.g:1950:1: rule__CustomPostType__Group__7__Impl : ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) ) ;
    public final void rule__CustomPostType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1954:1: ( ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) ) )
            // InternalEntityDsl.g:1955:1: ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) )
            {
            // InternalEntityDsl.g:1955:1: ( ( rule__CustomPostType__CptSingularNameAssignment_7 ) )
            // InternalEntityDsl.g:1956:2: ( rule__CustomPostType__CptSingularNameAssignment_7 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSingularNameAssignment_7()); 
            // InternalEntityDsl.g:1957:2: ( rule__CustomPostType__CptSingularNameAssignment_7 )
            // InternalEntityDsl.g:1957:3: rule__CustomPostType__CptSingularNameAssignment_7
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
    // InternalEntityDsl.g:1965:1: rule__CustomPostType__Group__8 : rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 ;
    public final void rule__CustomPostType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1969:1: ( rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 )
            // InternalEntityDsl.g:1970:2: rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:1977:1: rule__CustomPostType__Group__8__Impl : ( 'cptSupports' ) ;
    public final void rule__CustomPostType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1981:1: ( ( 'cptSupports' ) )
            // InternalEntityDsl.g:1982:1: ( 'cptSupports' )
            {
            // InternalEntityDsl.g:1982:1: ( 'cptSupports' )
            // InternalEntityDsl.g:1983:2: 'cptSupports'
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
    // InternalEntityDsl.g:1992:1: rule__CustomPostType__Group__9 : rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 ;
    public final void rule__CustomPostType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1996:1: ( rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 )
            // InternalEntityDsl.g:1997:2: rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10
            {
            pushFollow(FOLLOW_30);
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
    // InternalEntityDsl.g:2004:1: rule__CustomPostType__Group__9__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2008:1: ( ( '=' ) )
            // InternalEntityDsl.g:2009:1: ( '=' )
            {
            // InternalEntityDsl.g:2009:1: ( '=' )
            // InternalEntityDsl.g:2010:2: '='
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
    // InternalEntityDsl.g:2019:1: rule__CustomPostType__Group__10 : rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 ;
    public final void rule__CustomPostType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2023:1: ( rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 )
            // InternalEntityDsl.g:2024:2: rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11
            {
            pushFollow(FOLLOW_30);
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
    // InternalEntityDsl.g:2031:1: rule__CustomPostType__Group__10__Impl : ( ( rule__CustomPostType__CptSupportsAssignment_10 )? ) ;
    public final void rule__CustomPostType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2035:1: ( ( ( rule__CustomPostType__CptSupportsAssignment_10 )? ) )
            // InternalEntityDsl.g:2036:1: ( ( rule__CustomPostType__CptSupportsAssignment_10 )? )
            {
            // InternalEntityDsl.g:2036:1: ( ( rule__CustomPostType__CptSupportsAssignment_10 )? )
            // InternalEntityDsl.g:2037:2: ( rule__CustomPostType__CptSupportsAssignment_10 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptSupportsAssignment_10()); 
            // InternalEntityDsl.g:2038:2: ( rule__CustomPostType__CptSupportsAssignment_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEntityDsl.g:2038:3: rule__CustomPostType__CptSupportsAssignment_10
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
    // InternalEntityDsl.g:2046:1: rule__CustomPostType__Group__11 : rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12 ;
    public final void rule__CustomPostType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2050:1: ( rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12 )
            // InternalEntityDsl.g:2051:2: rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2058:1: rule__CustomPostType__Group__11__Impl : ( 'cptTaxonomies' ) ;
    public final void rule__CustomPostType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2062:1: ( ( 'cptTaxonomies' ) )
            // InternalEntityDsl.g:2063:1: ( 'cptTaxonomies' )
            {
            // InternalEntityDsl.g:2063:1: ( 'cptTaxonomies' )
            // InternalEntityDsl.g:2064:2: 'cptTaxonomies'
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
    // InternalEntityDsl.g:2073:1: rule__CustomPostType__Group__12 : rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13 ;
    public final void rule__CustomPostType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2077:1: ( rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13 )
            // InternalEntityDsl.g:2078:2: rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13
            {
            pushFollow(FOLLOW_31);
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
    // InternalEntityDsl.g:2085:1: rule__CustomPostType__Group__12__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2089:1: ( ( '=' ) )
            // InternalEntityDsl.g:2090:1: ( '=' )
            {
            // InternalEntityDsl.g:2090:1: ( '=' )
            // InternalEntityDsl.g:2091:2: '='
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
    // InternalEntityDsl.g:2100:1: rule__CustomPostType__Group__13 : rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14 ;
    public final void rule__CustomPostType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2104:1: ( rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14 )
            // InternalEntityDsl.g:2105:2: rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14
            {
            pushFollow(FOLLOW_31);
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
    // InternalEntityDsl.g:2112:1: rule__CustomPostType__Group__13__Impl : ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? ) ;
    public final void rule__CustomPostType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2116:1: ( ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? ) )
            // InternalEntityDsl.g:2117:1: ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? )
            {
            // InternalEntityDsl.g:2117:1: ( ( rule__CustomPostType__CptTaxonomiesAssignment_13 )? )
            // InternalEntityDsl.g:2118:2: ( rule__CustomPostType__CptTaxonomiesAssignment_13 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesAssignment_13()); 
            // InternalEntityDsl.g:2119:2: ( rule__CustomPostType__CptTaxonomiesAssignment_13 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEntityDsl.g:2119:3: rule__CustomPostType__CptTaxonomiesAssignment_13
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
    // InternalEntityDsl.g:2127:1: rule__CustomPostType__Group__14 : rule__CustomPostType__Group__14__Impl ;
    public final void rule__CustomPostType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2131:1: ( rule__CustomPostType__Group__14__Impl )
            // InternalEntityDsl.g:2132:2: rule__CustomPostType__Group__14__Impl
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
    // InternalEntityDsl.g:2138:1: rule__CustomPostType__Group__14__Impl : ( '}' ) ;
    public final void rule__CustomPostType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2142:1: ( ( '}' ) )
            // InternalEntityDsl.g:2143:1: ( '}' )
            {
            // InternalEntityDsl.g:2143:1: ( '}' )
            // InternalEntityDsl.g:2144:2: '}'
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
    // InternalEntityDsl.g:2154:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2158:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalEntityDsl.g:2159:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEntityDsl.g:2166:1: rule__Setting__Group__0__Impl : ( 'Setting' ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2170:1: ( ( 'Setting' ) )
            // InternalEntityDsl.g:2171:1: ( 'Setting' )
            {
            // InternalEntityDsl.g:2171:1: ( 'Setting' )
            // InternalEntityDsl.g:2172:2: 'Setting'
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
    // InternalEntityDsl.g:2181:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2185:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalEntityDsl.g:2186:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalEntityDsl.g:2193:1: rule__Setting__Group__1__Impl : ( '{' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2197:1: ( ( '{' ) )
            // InternalEntityDsl.g:2198:1: ( '{' )
            {
            // InternalEntityDsl.g:2198:1: ( '{' )
            // InternalEntityDsl.g:2199:2: '{'
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
    // InternalEntityDsl.g:2208:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl rule__Setting__Group__3 ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2212:1: ( rule__Setting__Group__2__Impl rule__Setting__Group__3 )
            // InternalEntityDsl.g:2213:2: rule__Setting__Group__2__Impl rule__Setting__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2220:1: rule__Setting__Group__2__Impl : ( 'settingName' ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2224:1: ( ( 'settingName' ) )
            // InternalEntityDsl.g:2225:1: ( 'settingName' )
            {
            // InternalEntityDsl.g:2225:1: ( 'settingName' )
            // InternalEntityDsl.g:2226:2: 'settingName'
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
    // InternalEntityDsl.g:2235:1: rule__Setting__Group__3 : rule__Setting__Group__3__Impl rule__Setting__Group__4 ;
    public final void rule__Setting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2239:1: ( rule__Setting__Group__3__Impl rule__Setting__Group__4 )
            // InternalEntityDsl.g:2240:2: rule__Setting__Group__3__Impl rule__Setting__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:2247:1: rule__Setting__Group__3__Impl : ( '=' ) ;
    public final void rule__Setting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2251:1: ( ( '=' ) )
            // InternalEntityDsl.g:2252:1: ( '=' )
            {
            // InternalEntityDsl.g:2252:1: ( '=' )
            // InternalEntityDsl.g:2253:2: '='
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
    // InternalEntityDsl.g:2262:1: rule__Setting__Group__4 : rule__Setting__Group__4__Impl rule__Setting__Group__5 ;
    public final void rule__Setting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2266:1: ( rule__Setting__Group__4__Impl rule__Setting__Group__5 )
            // InternalEntityDsl.g:2267:2: rule__Setting__Group__4__Impl rule__Setting__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalEntityDsl.g:2274:1: rule__Setting__Group__4__Impl : ( ( rule__Setting__SettingNameAssignment_4 ) ) ;
    public final void rule__Setting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2278:1: ( ( ( rule__Setting__SettingNameAssignment_4 ) ) )
            // InternalEntityDsl.g:2279:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:2279:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            // InternalEntityDsl.g:2280:2: ( rule__Setting__SettingNameAssignment_4 )
            {
             before(grammarAccess.getSettingAccess().getSettingNameAssignment_4()); 
            // InternalEntityDsl.g:2281:2: ( rule__Setting__SettingNameAssignment_4 )
            // InternalEntityDsl.g:2281:3: rule__Setting__SettingNameAssignment_4
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
    // InternalEntityDsl.g:2289:1: rule__Setting__Group__5 : rule__Setting__Group__5__Impl rule__Setting__Group__6 ;
    public final void rule__Setting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2293:1: ( rule__Setting__Group__5__Impl rule__Setting__Group__6 )
            // InternalEntityDsl.g:2294:2: rule__Setting__Group__5__Impl rule__Setting__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2301:1: rule__Setting__Group__5__Impl : ( 'settingType' ) ;
    public final void rule__Setting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2305:1: ( ( 'settingType' ) )
            // InternalEntityDsl.g:2306:1: ( 'settingType' )
            {
            // InternalEntityDsl.g:2306:1: ( 'settingType' )
            // InternalEntityDsl.g:2307:2: 'settingType'
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
    // InternalEntityDsl.g:2316:1: rule__Setting__Group__6 : rule__Setting__Group__6__Impl rule__Setting__Group__7 ;
    public final void rule__Setting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2320:1: ( rule__Setting__Group__6__Impl rule__Setting__Group__7 )
            // InternalEntityDsl.g:2321:2: rule__Setting__Group__6__Impl rule__Setting__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:2328:1: rule__Setting__Group__6__Impl : ( '=' ) ;
    public final void rule__Setting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2332:1: ( ( '=' ) )
            // InternalEntityDsl.g:2333:1: ( '=' )
            {
            // InternalEntityDsl.g:2333:1: ( '=' )
            // InternalEntityDsl.g:2334:2: '='
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
    // InternalEntityDsl.g:2343:1: rule__Setting__Group__7 : rule__Setting__Group__7__Impl rule__Setting__Group__8 ;
    public final void rule__Setting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2347:1: ( rule__Setting__Group__7__Impl rule__Setting__Group__8 )
            // InternalEntityDsl.g:2348:2: rule__Setting__Group__7__Impl rule__Setting__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalEntityDsl.g:2355:1: rule__Setting__Group__7__Impl : ( ( rule__Setting__SettingTypeAssignment_7 ) ) ;
    public final void rule__Setting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2359:1: ( ( ( rule__Setting__SettingTypeAssignment_7 ) ) )
            // InternalEntityDsl.g:2360:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            {
            // InternalEntityDsl.g:2360:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            // InternalEntityDsl.g:2361:2: ( rule__Setting__SettingTypeAssignment_7 )
            {
             before(grammarAccess.getSettingAccess().getSettingTypeAssignment_7()); 
            // InternalEntityDsl.g:2362:2: ( rule__Setting__SettingTypeAssignment_7 )
            // InternalEntityDsl.g:2362:3: rule__Setting__SettingTypeAssignment_7
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
    // InternalEntityDsl.g:2370:1: rule__Setting__Group__8 : rule__Setting__Group__8__Impl rule__Setting__Group__9 ;
    public final void rule__Setting__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2374:1: ( rule__Setting__Group__8__Impl rule__Setting__Group__9 )
            // InternalEntityDsl.g:2375:2: rule__Setting__Group__8__Impl rule__Setting__Group__9
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2382:1: rule__Setting__Group__8__Impl : ( 'defaultValue' ) ;
    public final void rule__Setting__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2386:1: ( ( 'defaultValue' ) )
            // InternalEntityDsl.g:2387:1: ( 'defaultValue' )
            {
            // InternalEntityDsl.g:2387:1: ( 'defaultValue' )
            // InternalEntityDsl.g:2388:2: 'defaultValue'
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
    // InternalEntityDsl.g:2397:1: rule__Setting__Group__9 : rule__Setting__Group__9__Impl rule__Setting__Group__10 ;
    public final void rule__Setting__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2401:1: ( rule__Setting__Group__9__Impl rule__Setting__Group__10 )
            // InternalEntityDsl.g:2402:2: rule__Setting__Group__9__Impl rule__Setting__Group__10
            {
            pushFollow(FOLLOW_31);
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
    // InternalEntityDsl.g:2409:1: rule__Setting__Group__9__Impl : ( '=' ) ;
    public final void rule__Setting__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2413:1: ( ( '=' ) )
            // InternalEntityDsl.g:2414:1: ( '=' )
            {
            // InternalEntityDsl.g:2414:1: ( '=' )
            // InternalEntityDsl.g:2415:2: '='
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
    // InternalEntityDsl.g:2424:1: rule__Setting__Group__10 : rule__Setting__Group__10__Impl rule__Setting__Group__11 ;
    public final void rule__Setting__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2428:1: ( rule__Setting__Group__10__Impl rule__Setting__Group__11 )
            // InternalEntityDsl.g:2429:2: rule__Setting__Group__10__Impl rule__Setting__Group__11
            {
            pushFollow(FOLLOW_31);
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
    // InternalEntityDsl.g:2436:1: rule__Setting__Group__10__Impl : ( ( rule__Setting__DefaultValueAssignment_10 )? ) ;
    public final void rule__Setting__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2440:1: ( ( ( rule__Setting__DefaultValueAssignment_10 )? ) )
            // InternalEntityDsl.g:2441:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            {
            // InternalEntityDsl.g:2441:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            // InternalEntityDsl.g:2442:2: ( rule__Setting__DefaultValueAssignment_10 )?
            {
             before(grammarAccess.getSettingAccess().getDefaultValueAssignment_10()); 
            // InternalEntityDsl.g:2443:2: ( rule__Setting__DefaultValueAssignment_10 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEntityDsl.g:2443:3: rule__Setting__DefaultValueAssignment_10
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
    // InternalEntityDsl.g:2451:1: rule__Setting__Group__11 : rule__Setting__Group__11__Impl ;
    public final void rule__Setting__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2455:1: ( rule__Setting__Group__11__Impl )
            // InternalEntityDsl.g:2456:2: rule__Setting__Group__11__Impl
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
    // InternalEntityDsl.g:2462:1: rule__Setting__Group__11__Impl : ( '}' ) ;
    public final void rule__Setting__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2466:1: ( ( '}' ) )
            // InternalEntityDsl.g:2467:1: ( '}' )
            {
            // InternalEntityDsl.g:2467:1: ( '}' )
            // InternalEntityDsl.g:2468:2: '}'
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
    // InternalEntityDsl.g:2478:1: rule__Hook__Group__0 : rule__Hook__Group__0__Impl rule__Hook__Group__1 ;
    public final void rule__Hook__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2482:1: ( rule__Hook__Group__0__Impl rule__Hook__Group__1 )
            // InternalEntityDsl.g:2483:2: rule__Hook__Group__0__Impl rule__Hook__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEntityDsl.g:2490:1: rule__Hook__Group__0__Impl : ( 'Hook' ) ;
    public final void rule__Hook__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2494:1: ( ( 'Hook' ) )
            // InternalEntityDsl.g:2495:1: ( 'Hook' )
            {
            // InternalEntityDsl.g:2495:1: ( 'Hook' )
            // InternalEntityDsl.g:2496:2: 'Hook'
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
    // InternalEntityDsl.g:2505:1: rule__Hook__Group__1 : rule__Hook__Group__1__Impl rule__Hook__Group__2 ;
    public final void rule__Hook__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2509:1: ( rule__Hook__Group__1__Impl rule__Hook__Group__2 )
            // InternalEntityDsl.g:2510:2: rule__Hook__Group__1__Impl rule__Hook__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalEntityDsl.g:2517:1: rule__Hook__Group__1__Impl : ( '{' ) ;
    public final void rule__Hook__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2521:1: ( ( '{' ) )
            // InternalEntityDsl.g:2522:1: ( '{' )
            {
            // InternalEntityDsl.g:2522:1: ( '{' )
            // InternalEntityDsl.g:2523:2: '{'
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
    // InternalEntityDsl.g:2532:1: rule__Hook__Group__2 : rule__Hook__Group__2__Impl rule__Hook__Group__3 ;
    public final void rule__Hook__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2536:1: ( rule__Hook__Group__2__Impl rule__Hook__Group__3 )
            // InternalEntityDsl.g:2537:2: rule__Hook__Group__2__Impl rule__Hook__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2544:1: rule__Hook__Group__2__Impl : ( 'hookType' ) ;
    public final void rule__Hook__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2548:1: ( ( 'hookType' ) )
            // InternalEntityDsl.g:2549:1: ( 'hookType' )
            {
            // InternalEntityDsl.g:2549:1: ( 'hookType' )
            // InternalEntityDsl.g:2550:2: 'hookType'
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
    // InternalEntityDsl.g:2559:1: rule__Hook__Group__3 : rule__Hook__Group__3__Impl rule__Hook__Group__4 ;
    public final void rule__Hook__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2563:1: ( rule__Hook__Group__3__Impl rule__Hook__Group__4 )
            // InternalEntityDsl.g:2564:2: rule__Hook__Group__3__Impl rule__Hook__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalEntityDsl.g:2571:1: rule__Hook__Group__3__Impl : ( '=' ) ;
    public final void rule__Hook__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2575:1: ( ( '=' ) )
            // InternalEntityDsl.g:2576:1: ( '=' )
            {
            // InternalEntityDsl.g:2576:1: ( '=' )
            // InternalEntityDsl.g:2577:2: '='
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
    // InternalEntityDsl.g:2586:1: rule__Hook__Group__4 : rule__Hook__Group__4__Impl rule__Hook__Group__5 ;
    public final void rule__Hook__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2590:1: ( rule__Hook__Group__4__Impl rule__Hook__Group__5 )
            // InternalEntityDsl.g:2591:2: rule__Hook__Group__4__Impl rule__Hook__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalEntityDsl.g:2598:1: rule__Hook__Group__4__Impl : ( ( rule__Hook__HookTypeAssignment_4 ) ) ;
    public final void rule__Hook__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2602:1: ( ( ( rule__Hook__HookTypeAssignment_4 ) ) )
            // InternalEntityDsl.g:2603:1: ( ( rule__Hook__HookTypeAssignment_4 ) )
            {
            // InternalEntityDsl.g:2603:1: ( ( rule__Hook__HookTypeAssignment_4 ) )
            // InternalEntityDsl.g:2604:2: ( rule__Hook__HookTypeAssignment_4 )
            {
             before(grammarAccess.getHookAccess().getHookTypeAssignment_4()); 
            // InternalEntityDsl.g:2605:2: ( rule__Hook__HookTypeAssignment_4 )
            // InternalEntityDsl.g:2605:3: rule__Hook__HookTypeAssignment_4
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
    // InternalEntityDsl.g:2613:1: rule__Hook__Group__5 : rule__Hook__Group__5__Impl rule__Hook__Group__6 ;
    public final void rule__Hook__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2617:1: ( rule__Hook__Group__5__Impl rule__Hook__Group__6 )
            // InternalEntityDsl.g:2618:2: rule__Hook__Group__5__Impl rule__Hook__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2625:1: rule__Hook__Group__5__Impl : ( 'hookName' ) ;
    public final void rule__Hook__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2629:1: ( ( 'hookName' ) )
            // InternalEntityDsl.g:2630:1: ( 'hookName' )
            {
            // InternalEntityDsl.g:2630:1: ( 'hookName' )
            // InternalEntityDsl.g:2631:2: 'hookName'
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
    // InternalEntityDsl.g:2640:1: rule__Hook__Group__6 : rule__Hook__Group__6__Impl rule__Hook__Group__7 ;
    public final void rule__Hook__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2644:1: ( rule__Hook__Group__6__Impl rule__Hook__Group__7 )
            // InternalEntityDsl.g:2645:2: rule__Hook__Group__6__Impl rule__Hook__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:2652:1: rule__Hook__Group__6__Impl : ( '=' ) ;
    public final void rule__Hook__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2656:1: ( ( '=' ) )
            // InternalEntityDsl.g:2657:1: ( '=' )
            {
            // InternalEntityDsl.g:2657:1: ( '=' )
            // InternalEntityDsl.g:2658:2: '='
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
    // InternalEntityDsl.g:2667:1: rule__Hook__Group__7 : rule__Hook__Group__7__Impl rule__Hook__Group__8 ;
    public final void rule__Hook__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2671:1: ( rule__Hook__Group__7__Impl rule__Hook__Group__8 )
            // InternalEntityDsl.g:2672:2: rule__Hook__Group__7__Impl rule__Hook__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalEntityDsl.g:2679:1: rule__Hook__Group__7__Impl : ( ( rule__Hook__HookNameAssignment_7 ) ) ;
    public final void rule__Hook__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2683:1: ( ( ( rule__Hook__HookNameAssignment_7 ) ) )
            // InternalEntityDsl.g:2684:1: ( ( rule__Hook__HookNameAssignment_7 ) )
            {
            // InternalEntityDsl.g:2684:1: ( ( rule__Hook__HookNameAssignment_7 ) )
            // InternalEntityDsl.g:2685:2: ( rule__Hook__HookNameAssignment_7 )
            {
             before(grammarAccess.getHookAccess().getHookNameAssignment_7()); 
            // InternalEntityDsl.g:2686:2: ( rule__Hook__HookNameAssignment_7 )
            // InternalEntityDsl.g:2686:3: rule__Hook__HookNameAssignment_7
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
    // InternalEntityDsl.g:2694:1: rule__Hook__Group__8 : rule__Hook__Group__8__Impl rule__Hook__Group__9 ;
    public final void rule__Hook__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2698:1: ( rule__Hook__Group__8__Impl rule__Hook__Group__9 )
            // InternalEntityDsl.g:2699:2: rule__Hook__Group__8__Impl rule__Hook__Group__9
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2706:1: rule__Hook__Group__8__Impl : ( 'callback' ) ;
    public final void rule__Hook__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2710:1: ( ( 'callback' ) )
            // InternalEntityDsl.g:2711:1: ( 'callback' )
            {
            // InternalEntityDsl.g:2711:1: ( 'callback' )
            // InternalEntityDsl.g:2712:2: 'callback'
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
    // InternalEntityDsl.g:2721:1: rule__Hook__Group__9 : rule__Hook__Group__9__Impl rule__Hook__Group__10 ;
    public final void rule__Hook__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2725:1: ( rule__Hook__Group__9__Impl rule__Hook__Group__10 )
            // InternalEntityDsl.g:2726:2: rule__Hook__Group__9__Impl rule__Hook__Group__10
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:2733:1: rule__Hook__Group__9__Impl : ( '=' ) ;
    public final void rule__Hook__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2737:1: ( ( '=' ) )
            // InternalEntityDsl.g:2738:1: ( '=' )
            {
            // InternalEntityDsl.g:2738:1: ( '=' )
            // InternalEntityDsl.g:2739:2: '='
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
    // InternalEntityDsl.g:2748:1: rule__Hook__Group__10 : rule__Hook__Group__10__Impl rule__Hook__Group__11 ;
    public final void rule__Hook__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2752:1: ( rule__Hook__Group__10__Impl rule__Hook__Group__11 )
            // InternalEntityDsl.g:2753:2: rule__Hook__Group__10__Impl rule__Hook__Group__11
            {
            pushFollow(FOLLOW_39);
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
    // InternalEntityDsl.g:2760:1: rule__Hook__Group__10__Impl : ( ( rule__Hook__CallbackAssignment_10 ) ) ;
    public final void rule__Hook__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2764:1: ( ( ( rule__Hook__CallbackAssignment_10 ) ) )
            // InternalEntityDsl.g:2765:1: ( ( rule__Hook__CallbackAssignment_10 ) )
            {
            // InternalEntityDsl.g:2765:1: ( ( rule__Hook__CallbackAssignment_10 ) )
            // InternalEntityDsl.g:2766:2: ( rule__Hook__CallbackAssignment_10 )
            {
             before(grammarAccess.getHookAccess().getCallbackAssignment_10()); 
            // InternalEntityDsl.g:2767:2: ( rule__Hook__CallbackAssignment_10 )
            // InternalEntityDsl.g:2767:3: rule__Hook__CallbackAssignment_10
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
    // InternalEntityDsl.g:2775:1: rule__Hook__Group__11 : rule__Hook__Group__11__Impl rule__Hook__Group__12 ;
    public final void rule__Hook__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2779:1: ( rule__Hook__Group__11__Impl rule__Hook__Group__12 )
            // InternalEntityDsl.g:2780:2: rule__Hook__Group__11__Impl rule__Hook__Group__12
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2787:1: rule__Hook__Group__11__Impl : ( 'priority' ) ;
    public final void rule__Hook__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2791:1: ( ( 'priority' ) )
            // InternalEntityDsl.g:2792:1: ( 'priority' )
            {
            // InternalEntityDsl.g:2792:1: ( 'priority' )
            // InternalEntityDsl.g:2793:2: 'priority'
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
    // InternalEntityDsl.g:2802:1: rule__Hook__Group__12 : rule__Hook__Group__12__Impl rule__Hook__Group__13 ;
    public final void rule__Hook__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2806:1: ( rule__Hook__Group__12__Impl rule__Hook__Group__13 )
            // InternalEntityDsl.g:2807:2: rule__Hook__Group__12__Impl rule__Hook__Group__13
            {
            pushFollow(FOLLOW_40);
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
    // InternalEntityDsl.g:2814:1: rule__Hook__Group__12__Impl : ( '=' ) ;
    public final void rule__Hook__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2818:1: ( ( '=' ) )
            // InternalEntityDsl.g:2819:1: ( '=' )
            {
            // InternalEntityDsl.g:2819:1: ( '=' )
            // InternalEntityDsl.g:2820:2: '='
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
    // InternalEntityDsl.g:2829:1: rule__Hook__Group__13 : rule__Hook__Group__13__Impl rule__Hook__Group__14 ;
    public final void rule__Hook__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2833:1: ( rule__Hook__Group__13__Impl rule__Hook__Group__14 )
            // InternalEntityDsl.g:2834:2: rule__Hook__Group__13__Impl rule__Hook__Group__14
            {
            pushFollow(FOLLOW_40);
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
    // InternalEntityDsl.g:2841:1: rule__Hook__Group__13__Impl : ( ( rule__Hook__PriorityAssignment_13 )? ) ;
    public final void rule__Hook__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2845:1: ( ( ( rule__Hook__PriorityAssignment_13 )? ) )
            // InternalEntityDsl.g:2846:1: ( ( rule__Hook__PriorityAssignment_13 )? )
            {
            // InternalEntityDsl.g:2846:1: ( ( rule__Hook__PriorityAssignment_13 )? )
            // InternalEntityDsl.g:2847:2: ( rule__Hook__PriorityAssignment_13 )?
            {
             before(grammarAccess.getHookAccess().getPriorityAssignment_13()); 
            // InternalEntityDsl.g:2848:2: ( rule__Hook__PriorityAssignment_13 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEntityDsl.g:2848:3: rule__Hook__PriorityAssignment_13
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
    // InternalEntityDsl.g:2856:1: rule__Hook__Group__14 : rule__Hook__Group__14__Impl rule__Hook__Group__15 ;
    public final void rule__Hook__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2860:1: ( rule__Hook__Group__14__Impl rule__Hook__Group__15 )
            // InternalEntityDsl.g:2861:2: rule__Hook__Group__14__Impl rule__Hook__Group__15
            {
            pushFollow(FOLLOW_5);
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
    // InternalEntityDsl.g:2868:1: rule__Hook__Group__14__Impl : ( 'acceptedArgs' ) ;
    public final void rule__Hook__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2872:1: ( ( 'acceptedArgs' ) )
            // InternalEntityDsl.g:2873:1: ( 'acceptedArgs' )
            {
            // InternalEntityDsl.g:2873:1: ( 'acceptedArgs' )
            // InternalEntityDsl.g:2874:2: 'acceptedArgs'
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
    // InternalEntityDsl.g:2883:1: rule__Hook__Group__15 : rule__Hook__Group__15__Impl rule__Hook__Group__16 ;
    public final void rule__Hook__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2887:1: ( rule__Hook__Group__15__Impl rule__Hook__Group__16 )
            // InternalEntityDsl.g:2888:2: rule__Hook__Group__15__Impl rule__Hook__Group__16
            {
            pushFollow(FOLLOW_41);
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
    // InternalEntityDsl.g:2895:1: rule__Hook__Group__15__Impl : ( '=' ) ;
    public final void rule__Hook__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2899:1: ( ( '=' ) )
            // InternalEntityDsl.g:2900:1: ( '=' )
            {
            // InternalEntityDsl.g:2900:1: ( '=' )
            // InternalEntityDsl.g:2901:2: '='
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
    // InternalEntityDsl.g:2910:1: rule__Hook__Group__16 : rule__Hook__Group__16__Impl rule__Hook__Group__17 ;
    public final void rule__Hook__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2914:1: ( rule__Hook__Group__16__Impl rule__Hook__Group__17 )
            // InternalEntityDsl.g:2915:2: rule__Hook__Group__16__Impl rule__Hook__Group__17
            {
            pushFollow(FOLLOW_41);
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
    // InternalEntityDsl.g:2922:1: rule__Hook__Group__16__Impl : ( ( rule__Hook__AcceptedArgsAssignment_16 )? ) ;
    public final void rule__Hook__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2926:1: ( ( ( rule__Hook__AcceptedArgsAssignment_16 )? ) )
            // InternalEntityDsl.g:2927:1: ( ( rule__Hook__AcceptedArgsAssignment_16 )? )
            {
            // InternalEntityDsl.g:2927:1: ( ( rule__Hook__AcceptedArgsAssignment_16 )? )
            // InternalEntityDsl.g:2928:2: ( rule__Hook__AcceptedArgsAssignment_16 )?
            {
             before(grammarAccess.getHookAccess().getAcceptedArgsAssignment_16()); 
            // InternalEntityDsl.g:2929:2: ( rule__Hook__AcceptedArgsAssignment_16 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEntityDsl.g:2929:3: rule__Hook__AcceptedArgsAssignment_16
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
    // InternalEntityDsl.g:2937:1: rule__Hook__Group__17 : rule__Hook__Group__17__Impl ;
    public final void rule__Hook__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2941:1: ( rule__Hook__Group__17__Impl )
            // InternalEntityDsl.g:2942:2: rule__Hook__Group__17__Impl
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
    // InternalEntityDsl.g:2948:1: rule__Hook__Group__17__Impl : ( '}' ) ;
    public final void rule__Hook__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2952:1: ( ( '}' ) )
            // InternalEntityDsl.g:2953:1: ( '}' )
            {
            // InternalEntityDsl.g:2953:1: ( '}' )
            // InternalEntityDsl.g:2954:2: '}'
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
    // InternalEntityDsl.g:2964:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2968:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // InternalEntityDsl.g:2969:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalEntityDsl.g:2976:1: rule__StringList__Group__0__Impl : ( ( rule__StringList__ValuesAssignment_0 ) ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2980:1: ( ( ( rule__StringList__ValuesAssignment_0 ) ) )
            // InternalEntityDsl.g:2981:1: ( ( rule__StringList__ValuesAssignment_0 ) )
            {
            // InternalEntityDsl.g:2981:1: ( ( rule__StringList__ValuesAssignment_0 ) )
            // InternalEntityDsl.g:2982:2: ( rule__StringList__ValuesAssignment_0 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_0()); 
            // InternalEntityDsl.g:2983:2: ( rule__StringList__ValuesAssignment_0 )
            // InternalEntityDsl.g:2983:3: rule__StringList__ValuesAssignment_0
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
    // InternalEntityDsl.g:2991:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2995:1: ( rule__StringList__Group__1__Impl )
            // InternalEntityDsl.g:2996:2: rule__StringList__Group__1__Impl
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
    // InternalEntityDsl.g:3002:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__Group_1__0 )* ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3006:1: ( ( ( rule__StringList__Group_1__0 )* ) )
            // InternalEntityDsl.g:3007:1: ( ( rule__StringList__Group_1__0 )* )
            {
            // InternalEntityDsl.g:3007:1: ( ( rule__StringList__Group_1__0 )* )
            // InternalEntityDsl.g:3008:2: ( rule__StringList__Group_1__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_1()); 
            // InternalEntityDsl.g:3009:2: ( rule__StringList__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==47) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEntityDsl.g:3009:3: rule__StringList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__StringList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalEntityDsl.g:3018:1: rule__StringList__Group_1__0 : rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1 ;
    public final void rule__StringList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3022:1: ( rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1 )
            // InternalEntityDsl.g:3023:2: rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:3030:1: rule__StringList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3034:1: ( ( ',' ) )
            // InternalEntityDsl.g:3035:1: ( ',' )
            {
            // InternalEntityDsl.g:3035:1: ( ',' )
            // InternalEntityDsl.g:3036:2: ','
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
    // InternalEntityDsl.g:3045:1: rule__StringList__Group_1__1 : rule__StringList__Group_1__1__Impl ;
    public final void rule__StringList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3049:1: ( rule__StringList__Group_1__1__Impl )
            // InternalEntityDsl.g:3050:2: rule__StringList__Group_1__1__Impl
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
    // InternalEntityDsl.g:3056:1: rule__StringList__Group_1__1__Impl : ( ( rule__StringList__ValuesAssignment_1_1 ) ) ;
    public final void rule__StringList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3060:1: ( ( ( rule__StringList__ValuesAssignment_1_1 ) ) )
            // InternalEntityDsl.g:3061:1: ( ( rule__StringList__ValuesAssignment_1_1 ) )
            {
            // InternalEntityDsl.g:3061:1: ( ( rule__StringList__ValuesAssignment_1_1 ) )
            // InternalEntityDsl.g:3062:2: ( rule__StringList__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1_1()); 
            // InternalEntityDsl.g:3063:2: ( rule__StringList__ValuesAssignment_1_1 )
            // InternalEntityDsl.g:3063:3: rule__StringList__ValuesAssignment_1_1
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


    // $ANTLR start "rule__Plugin__NameAssignment_4"
    // InternalEntityDsl.g:3072:1: rule__Plugin__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Plugin__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3076:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3077:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3077:2: ( RULE_STRING )
            // InternalEntityDsl.g:3078:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getNameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Plugin__NameAssignment_4"


    // $ANTLR start "rule__Plugin__VersionAssignment_7"
    // InternalEntityDsl.g:3087:1: rule__Plugin__VersionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Plugin__VersionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3091:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3092:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3092:2: ( RULE_STRING )
            // InternalEntityDsl.g:3093:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getVersionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getVersionSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Plugin__VersionAssignment_7"


    // $ANTLR start "rule__Plugin__DescriptionAssignment_10"
    // InternalEntityDsl.g:3102:1: rule__Plugin__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Plugin__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3106:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3107:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3107:2: ( RULE_STRING )
            // InternalEntityDsl.g:3108:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Plugin__DescriptionAssignment_10"


    // $ANTLR start "rule__Plugin__AuthorAssignment_13"
    // InternalEntityDsl.g:3117:1: rule__Plugin__AuthorAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Plugin__AuthorAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3121:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3122:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3122:2: ( RULE_STRING )
            // InternalEntityDsl.g:3123:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getAuthorSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getAuthorSTRINGTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__Plugin__AuthorAssignment_13"


    // $ANTLR start "rule__Plugin__LicenseAssignment_16"
    // InternalEntityDsl.g:3132:1: rule__Plugin__LicenseAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Plugin__LicenseAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3136:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3137:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3137:2: ( RULE_STRING )
            // InternalEntityDsl.g:3138:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getLicenseSTRINGTerminalRuleCall_16_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getLicenseSTRINGTerminalRuleCall_16_0()); 

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
    // $ANTLR end "rule__Plugin__LicenseAssignment_16"


    // $ANTLR start "rule__Plugin__PrefixAssignment_19"
    // InternalEntityDsl.g:3147:1: rule__Plugin__PrefixAssignment_19 : ( RULE_STRING ) ;
    public final void rule__Plugin__PrefixAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3151:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3152:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3152:2: ( RULE_STRING )
            // InternalEntityDsl.g:3153:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getPrefixSTRINGTerminalRuleCall_19_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getPrefixSTRINGTerminalRuleCall_19_0()); 

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
    // $ANTLR end "rule__Plugin__PrefixAssignment_19"


    // $ANTLR start "rule__Plugin__TextDomainAssignment_22"
    // InternalEntityDsl.g:3162:1: rule__Plugin__TextDomainAssignment_22 : ( RULE_STRING ) ;
    public final void rule__Plugin__TextDomainAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3166:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3167:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3167:2: ( RULE_STRING )
            // InternalEntityDsl.g:3168:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getTextDomainSTRINGTerminalRuleCall_22_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getTextDomainSTRINGTerminalRuleCall_22_0()); 

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
    // $ANTLR end "rule__Plugin__TextDomainAssignment_22"


    // $ANTLR start "rule__Plugin__ActivateAssignment_25"
    // InternalEntityDsl.g:3177:1: rule__Plugin__ActivateAssignment_25 : ( RULE_STRING ) ;
    public final void rule__Plugin__ActivateAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3181:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3182:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3182:2: ( RULE_STRING )
            // InternalEntityDsl.g:3183:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getActivateSTRINGTerminalRuleCall_25_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getActivateSTRINGTerminalRuleCall_25_0()); 

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
    // $ANTLR end "rule__Plugin__ActivateAssignment_25"


    // $ANTLR start "rule__Plugin__DeactivateAssignment_28"
    // InternalEntityDsl.g:3192:1: rule__Plugin__DeactivateAssignment_28 : ( RULE_STRING ) ;
    public final void rule__Plugin__DeactivateAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3196:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3197:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3197:2: ( RULE_STRING )
            // InternalEntityDsl.g:3198:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getDeactivateSTRINGTerminalRuleCall_28_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getDeactivateSTRINGTerminalRuleCall_28_0()); 

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
    // $ANTLR end "rule__Plugin__DeactivateAssignment_28"


    // $ANTLR start "rule__Plugin__UninstallAssignment_31"
    // InternalEntityDsl.g:3207:1: rule__Plugin__UninstallAssignment_31 : ( RULE_STRING ) ;
    public final void rule__Plugin__UninstallAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3211:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3212:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3212:2: ( RULE_STRING )
            // InternalEntityDsl.g:3213:3: RULE_STRING
            {
             before(grammarAccess.getPluginAccess().getUninstallSTRINGTerminalRuleCall_31_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getUninstallSTRINGTerminalRuleCall_31_0()); 

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
    // $ANTLR end "rule__Plugin__UninstallAssignment_31"


    // $ANTLR start "rule__Plugin__WidgetsAssignment_32"
    // InternalEntityDsl.g:3222:1: rule__Plugin__WidgetsAssignment_32 : ( ruleWidget ) ;
    public final void rule__Plugin__WidgetsAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3226:1: ( ( ruleWidget ) )
            // InternalEntityDsl.g:3227:2: ( ruleWidget )
            {
            // InternalEntityDsl.g:3227:2: ( ruleWidget )
            // InternalEntityDsl.g:3228:3: ruleWidget
            {
             before(grammarAccess.getPluginAccess().getWidgetsWidgetParserRuleCall_32_0()); 
            pushFollow(FOLLOW_2);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getWidgetsWidgetParserRuleCall_32_0()); 

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
    // $ANTLR end "rule__Plugin__WidgetsAssignment_32"


    // $ANTLR start "rule__Plugin__ShortcodesAssignment_33"
    // InternalEntityDsl.g:3237:1: rule__Plugin__ShortcodesAssignment_33 : ( ruleShortcode ) ;
    public final void rule__Plugin__ShortcodesAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3241:1: ( ( ruleShortcode ) )
            // InternalEntityDsl.g:3242:2: ( ruleShortcode )
            {
            // InternalEntityDsl.g:3242:2: ( ruleShortcode )
            // InternalEntityDsl.g:3243:3: ruleShortcode
            {
             before(grammarAccess.getPluginAccess().getShortcodesShortcodeParserRuleCall_33_0()); 
            pushFollow(FOLLOW_2);
            ruleShortcode();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getShortcodesShortcodeParserRuleCall_33_0()); 

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
    // $ANTLR end "rule__Plugin__ShortcodesAssignment_33"


    // $ANTLR start "rule__Plugin__CustomPostTypesAssignment_34"
    // InternalEntityDsl.g:3252:1: rule__Plugin__CustomPostTypesAssignment_34 : ( ruleCustomPostType ) ;
    public final void rule__Plugin__CustomPostTypesAssignment_34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3256:1: ( ( ruleCustomPostType ) )
            // InternalEntityDsl.g:3257:2: ( ruleCustomPostType )
            {
            // InternalEntityDsl.g:3257:2: ( ruleCustomPostType )
            // InternalEntityDsl.g:3258:3: ruleCustomPostType
            {
             before(grammarAccess.getPluginAccess().getCustomPostTypesCustomPostTypeParserRuleCall_34_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomPostType();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getCustomPostTypesCustomPostTypeParserRuleCall_34_0()); 

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
    // $ANTLR end "rule__Plugin__CustomPostTypesAssignment_34"


    // $ANTLR start "rule__Plugin__SettingsAssignment_35"
    // InternalEntityDsl.g:3267:1: rule__Plugin__SettingsAssignment_35 : ( ruleSetting ) ;
    public final void rule__Plugin__SettingsAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3271:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3272:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3272:2: ( ruleSetting )
            // InternalEntityDsl.g:3273:3: ruleSetting
            {
             before(grammarAccess.getPluginAccess().getSettingsSettingParserRuleCall_35_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getSettingsSettingParserRuleCall_35_0()); 

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
    // $ANTLR end "rule__Plugin__SettingsAssignment_35"


    // $ANTLR start "rule__Plugin__HooksAssignment_36"
    // InternalEntityDsl.g:3282:1: rule__Plugin__HooksAssignment_36 : ( ruleHook ) ;
    public final void rule__Plugin__HooksAssignment_36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3286:1: ( ( ruleHook ) )
            // InternalEntityDsl.g:3287:2: ( ruleHook )
            {
            // InternalEntityDsl.g:3287:2: ( ruleHook )
            // InternalEntityDsl.g:3288:3: ruleHook
            {
             before(grammarAccess.getPluginAccess().getHooksHookParserRuleCall_36_0()); 
            pushFollow(FOLLOW_2);
            ruleHook();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getHooksHookParserRuleCall_36_0()); 

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
    // $ANTLR end "rule__Plugin__HooksAssignment_36"


    // $ANTLR start "rule__Widget__WidgetNameAssignment_4"
    // InternalEntityDsl.g:3297:1: rule__Widget__WidgetNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3301:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3302:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3302:2: ( RULE_STRING )
            // InternalEntityDsl.g:3303:3: RULE_STRING
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
    // InternalEntityDsl.g:3312:1: rule__Widget__WidgetDescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetDescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3316:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3317:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3317:2: ( RULE_STRING )
            // InternalEntityDsl.g:3318:3: RULE_STRING
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
    // InternalEntityDsl.g:3327:1: rule__Widget__SettingsAssignment_8 : ( ruleSetting ) ;
    public final void rule__Widget__SettingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3331:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3332:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3332:2: ( ruleSetting )
            // InternalEntityDsl.g:3333:3: ruleSetting
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
    // InternalEntityDsl.g:3342:1: rule__Shortcode__ShortcodeNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Shortcode__ShortcodeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3346:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3347:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3347:2: ( RULE_STRING )
            // InternalEntityDsl.g:3348:3: RULE_STRING
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
    // InternalEntityDsl.g:3357:1: rule__Shortcode__SettingsAssignment_5 : ( ruleSetting ) ;
    public final void rule__Shortcode__SettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3361:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3362:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3362:2: ( ruleSetting )
            // InternalEntityDsl.g:3363:3: ruleSetting
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
    // InternalEntityDsl.g:3372:1: rule__CustomPostType__CptNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__CptNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3376:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3377:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3377:2: ( RULE_STRING )
            // InternalEntityDsl.g:3378:3: RULE_STRING
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
    // InternalEntityDsl.g:3387:1: rule__CustomPostType__CptSingularNameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__CptSingularNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3391:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3392:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3392:2: ( RULE_STRING )
            // InternalEntityDsl.g:3393:3: RULE_STRING
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
    // InternalEntityDsl.g:3402:1: rule__CustomPostType__CptSupportsAssignment_10 : ( ruleStringList ) ;
    public final void rule__CustomPostType__CptSupportsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3406:1: ( ( ruleStringList ) )
            // InternalEntityDsl.g:3407:2: ( ruleStringList )
            {
            // InternalEntityDsl.g:3407:2: ( ruleStringList )
            // InternalEntityDsl.g:3408:3: ruleStringList
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
    // InternalEntityDsl.g:3417:1: rule__CustomPostType__CptTaxonomiesAssignment_13 : ( ruleStringList ) ;
    public final void rule__CustomPostType__CptTaxonomiesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3421:1: ( ( ruleStringList ) )
            // InternalEntityDsl.g:3422:2: ( ruleStringList )
            {
            // InternalEntityDsl.g:3422:2: ( ruleStringList )
            // InternalEntityDsl.g:3423:3: ruleStringList
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
    // InternalEntityDsl.g:3432:1: rule__Setting__SettingNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3436:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3437:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3437:2: ( RULE_STRING )
            // InternalEntityDsl.g:3438:3: RULE_STRING
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
    // InternalEntityDsl.g:3447:1: rule__Setting__SettingTypeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3451:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3452:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3452:2: ( RULE_STRING )
            // InternalEntityDsl.g:3453:3: RULE_STRING
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
    // InternalEntityDsl.g:3462:1: rule__Setting__DefaultValueAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Setting__DefaultValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3466:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3467:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3467:2: ( RULE_STRING )
            // InternalEntityDsl.g:3468:3: RULE_STRING
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
    // InternalEntityDsl.g:3477:1: rule__Hook__HookTypeAssignment_4 : ( ruleHookType ) ;
    public final void rule__Hook__HookTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3481:1: ( ( ruleHookType ) )
            // InternalEntityDsl.g:3482:2: ( ruleHookType )
            {
            // InternalEntityDsl.g:3482:2: ( ruleHookType )
            // InternalEntityDsl.g:3483:3: ruleHookType
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
    // InternalEntityDsl.g:3492:1: rule__Hook__HookNameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Hook__HookNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3496:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3497:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3497:2: ( RULE_STRING )
            // InternalEntityDsl.g:3498:3: RULE_STRING
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
    // InternalEntityDsl.g:3507:1: rule__Hook__CallbackAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Hook__CallbackAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3511:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3512:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3512:2: ( RULE_STRING )
            // InternalEntityDsl.g:3513:3: RULE_STRING
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
    // InternalEntityDsl.g:3522:1: rule__Hook__PriorityAssignment_13 : ( RULE_INT ) ;
    public final void rule__Hook__PriorityAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3526:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:3527:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:3527:2: ( RULE_INT )
            // InternalEntityDsl.g:3528:3: RULE_INT
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
    // InternalEntityDsl.g:3537:1: rule__Hook__AcceptedArgsAssignment_16 : ( RULE_INT ) ;
    public final void rule__Hook__AcceptedArgsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3541:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:3542:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:3542:2: ( RULE_INT )
            // InternalEntityDsl.g:3543:3: RULE_INT
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
    // InternalEntityDsl.g:3552:1: rule__StringList__ValuesAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3556:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3557:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3557:2: ( RULE_STRING )
            // InternalEntityDsl.g:3558:3: RULE_STRING
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
    // InternalEntityDsl.g:3567:1: rule__StringList__ValuesAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3571:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3572:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3572:2: ( RULE_STRING )
            // InternalEntityDsl.g:3573:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000002214C000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002004000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000002L});

}