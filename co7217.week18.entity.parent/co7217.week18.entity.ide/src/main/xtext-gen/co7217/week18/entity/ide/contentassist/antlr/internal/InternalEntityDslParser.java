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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'filter'", "'action'", "'Plugin'", "'{'", "'name'", "'='", "'version'", "'description'", "'author'", "'license'", "'prefix'", "'textDomain'", "'activate'", "'deactivate'", "'uninstall'", "'}'", "'Widget'", "'widgetName'", "'widgetDescription'", "'Shortcode'", "'shortcodeName'", "'CustomPostType'", "'postTypeName'", "'supports'", "'taxonomies'", "'Setting'", "'settingName'", "'settingType'", "'defaultValue'", "'Hook'", "'hookType'", "'hookName'", "'callback'", "'priority'", "'acceptedArgs'"
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


    // $ANTLR start "ruleHookType"
    // InternalEntityDsl.g:203:1: ruleHookType : ( ( rule__HookType__Alternatives ) ) ;
    public final void ruleHookType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:207:1: ( ( ( rule__HookType__Alternatives ) ) )
            // InternalEntityDsl.g:208:2: ( ( rule__HookType__Alternatives ) )
            {
            // InternalEntityDsl.g:208:2: ( ( rule__HookType__Alternatives ) )
            // InternalEntityDsl.g:209:3: ( rule__HookType__Alternatives )
            {
             before(grammarAccess.getHookTypeAccess().getAlternatives()); 
            // InternalEntityDsl.g:210:3: ( rule__HookType__Alternatives )
            // InternalEntityDsl.g:210:4: rule__HookType__Alternatives
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
    // InternalEntityDsl.g:218:1: rule__HookType__Alternatives : ( ( ( 'filter' ) ) | ( ( 'action' ) ) );
    public final void rule__HookType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:222:1: ( ( ( 'filter' ) ) | ( ( 'action' ) ) )
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
                    // InternalEntityDsl.g:223:2: ( ( 'filter' ) )
                    {
                    // InternalEntityDsl.g:223:2: ( ( 'filter' ) )
                    // InternalEntityDsl.g:224:3: ( 'filter' )
                    {
                     before(grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0()); 
                    // InternalEntityDsl.g:225:3: ( 'filter' )
                    // InternalEntityDsl.g:225:4: 'filter'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:229:2: ( ( 'action' ) )
                    {
                    // InternalEntityDsl.g:229:2: ( ( 'action' ) )
                    // InternalEntityDsl.g:230:3: ( 'action' )
                    {
                     before(grammarAccess.getHookTypeAccess().getACTIONEnumLiteralDeclaration_1()); 
                    // InternalEntityDsl.g:231:3: ( 'action' )
                    // InternalEntityDsl.g:231:4: 'action'
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
    // InternalEntityDsl.g:239:1: rule__Plugin__Group__0 : rule__Plugin__Group__0__Impl rule__Plugin__Group__1 ;
    public final void rule__Plugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:243:1: ( rule__Plugin__Group__0__Impl rule__Plugin__Group__1 )
            // InternalEntityDsl.g:244:2: rule__Plugin__Group__0__Impl rule__Plugin__Group__1
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
    // InternalEntityDsl.g:251:1: rule__Plugin__Group__0__Impl : ( 'Plugin' ) ;
    public final void rule__Plugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:255:1: ( ( 'Plugin' ) )
            // InternalEntityDsl.g:256:1: ( 'Plugin' )
            {
            // InternalEntityDsl.g:256:1: ( 'Plugin' )
            // InternalEntityDsl.g:257:2: 'Plugin'
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
    // InternalEntityDsl.g:266:1: rule__Plugin__Group__1 : rule__Plugin__Group__1__Impl rule__Plugin__Group__2 ;
    public final void rule__Plugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:270:1: ( rule__Plugin__Group__1__Impl rule__Plugin__Group__2 )
            // InternalEntityDsl.g:271:2: rule__Plugin__Group__1__Impl rule__Plugin__Group__2
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
    // InternalEntityDsl.g:278:1: rule__Plugin__Group__1__Impl : ( '{' ) ;
    public final void rule__Plugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:282:1: ( ( '{' ) )
            // InternalEntityDsl.g:283:1: ( '{' )
            {
            // InternalEntityDsl.g:283:1: ( '{' )
            // InternalEntityDsl.g:284:2: '{'
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
    // InternalEntityDsl.g:293:1: rule__Plugin__Group__2 : rule__Plugin__Group__2__Impl rule__Plugin__Group__3 ;
    public final void rule__Plugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:297:1: ( rule__Plugin__Group__2__Impl rule__Plugin__Group__3 )
            // InternalEntityDsl.g:298:2: rule__Plugin__Group__2__Impl rule__Plugin__Group__3
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
    // InternalEntityDsl.g:305:1: rule__Plugin__Group__2__Impl : ( 'name' ) ;
    public final void rule__Plugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:309:1: ( ( 'name' ) )
            // InternalEntityDsl.g:310:1: ( 'name' )
            {
            // InternalEntityDsl.g:310:1: ( 'name' )
            // InternalEntityDsl.g:311:2: 'name'
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
    // InternalEntityDsl.g:320:1: rule__Plugin__Group__3 : rule__Plugin__Group__3__Impl rule__Plugin__Group__4 ;
    public final void rule__Plugin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:324:1: ( rule__Plugin__Group__3__Impl rule__Plugin__Group__4 )
            // InternalEntityDsl.g:325:2: rule__Plugin__Group__3__Impl rule__Plugin__Group__4
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
    // InternalEntityDsl.g:332:1: rule__Plugin__Group__3__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:336:1: ( ( '=' ) )
            // InternalEntityDsl.g:337:1: ( '=' )
            {
            // InternalEntityDsl.g:337:1: ( '=' )
            // InternalEntityDsl.g:338:2: '='
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
    // InternalEntityDsl.g:347:1: rule__Plugin__Group__4 : rule__Plugin__Group__4__Impl rule__Plugin__Group__5 ;
    public final void rule__Plugin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:351:1: ( rule__Plugin__Group__4__Impl rule__Plugin__Group__5 )
            // InternalEntityDsl.g:352:2: rule__Plugin__Group__4__Impl rule__Plugin__Group__5
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
    // InternalEntityDsl.g:359:1: rule__Plugin__Group__4__Impl : ( ( rule__Plugin__NameAssignment_4 ) ) ;
    public final void rule__Plugin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:363:1: ( ( ( rule__Plugin__NameAssignment_4 ) ) )
            // InternalEntityDsl.g:364:1: ( ( rule__Plugin__NameAssignment_4 ) )
            {
            // InternalEntityDsl.g:364:1: ( ( rule__Plugin__NameAssignment_4 ) )
            // InternalEntityDsl.g:365:2: ( rule__Plugin__NameAssignment_4 )
            {
             before(grammarAccess.getPluginAccess().getNameAssignment_4()); 
            // InternalEntityDsl.g:366:2: ( rule__Plugin__NameAssignment_4 )
            // InternalEntityDsl.g:366:3: rule__Plugin__NameAssignment_4
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
    // InternalEntityDsl.g:374:1: rule__Plugin__Group__5 : rule__Plugin__Group__5__Impl rule__Plugin__Group__6 ;
    public final void rule__Plugin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:378:1: ( rule__Plugin__Group__5__Impl rule__Plugin__Group__6 )
            // InternalEntityDsl.g:379:2: rule__Plugin__Group__5__Impl rule__Plugin__Group__6
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
    // InternalEntityDsl.g:386:1: rule__Plugin__Group__5__Impl : ( 'version' ) ;
    public final void rule__Plugin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:390:1: ( ( 'version' ) )
            // InternalEntityDsl.g:391:1: ( 'version' )
            {
            // InternalEntityDsl.g:391:1: ( 'version' )
            // InternalEntityDsl.g:392:2: 'version'
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
    // InternalEntityDsl.g:401:1: rule__Plugin__Group__6 : rule__Plugin__Group__6__Impl rule__Plugin__Group__7 ;
    public final void rule__Plugin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:405:1: ( rule__Plugin__Group__6__Impl rule__Plugin__Group__7 )
            // InternalEntityDsl.g:406:2: rule__Plugin__Group__6__Impl rule__Plugin__Group__7
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
    // InternalEntityDsl.g:413:1: rule__Plugin__Group__6__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:417:1: ( ( '=' ) )
            // InternalEntityDsl.g:418:1: ( '=' )
            {
            // InternalEntityDsl.g:418:1: ( '=' )
            // InternalEntityDsl.g:419:2: '='
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
    // InternalEntityDsl.g:428:1: rule__Plugin__Group__7 : rule__Plugin__Group__7__Impl rule__Plugin__Group__8 ;
    public final void rule__Plugin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:432:1: ( rule__Plugin__Group__7__Impl rule__Plugin__Group__8 )
            // InternalEntityDsl.g:433:2: rule__Plugin__Group__7__Impl rule__Plugin__Group__8
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
    // InternalEntityDsl.g:440:1: rule__Plugin__Group__7__Impl : ( ( rule__Plugin__VersionAssignment_7 ) ) ;
    public final void rule__Plugin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:444:1: ( ( ( rule__Plugin__VersionAssignment_7 ) ) )
            // InternalEntityDsl.g:445:1: ( ( rule__Plugin__VersionAssignment_7 ) )
            {
            // InternalEntityDsl.g:445:1: ( ( rule__Plugin__VersionAssignment_7 ) )
            // InternalEntityDsl.g:446:2: ( rule__Plugin__VersionAssignment_7 )
            {
             before(grammarAccess.getPluginAccess().getVersionAssignment_7()); 
            // InternalEntityDsl.g:447:2: ( rule__Plugin__VersionAssignment_7 )
            // InternalEntityDsl.g:447:3: rule__Plugin__VersionAssignment_7
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
    // InternalEntityDsl.g:455:1: rule__Plugin__Group__8 : rule__Plugin__Group__8__Impl rule__Plugin__Group__9 ;
    public final void rule__Plugin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:459:1: ( rule__Plugin__Group__8__Impl rule__Plugin__Group__9 )
            // InternalEntityDsl.g:460:2: rule__Plugin__Group__8__Impl rule__Plugin__Group__9
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
    // InternalEntityDsl.g:467:1: rule__Plugin__Group__8__Impl : ( 'description' ) ;
    public final void rule__Plugin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:471:1: ( ( 'description' ) )
            // InternalEntityDsl.g:472:1: ( 'description' )
            {
            // InternalEntityDsl.g:472:1: ( 'description' )
            // InternalEntityDsl.g:473:2: 'description'
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
    // InternalEntityDsl.g:482:1: rule__Plugin__Group__9 : rule__Plugin__Group__9__Impl rule__Plugin__Group__10 ;
    public final void rule__Plugin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:486:1: ( rule__Plugin__Group__9__Impl rule__Plugin__Group__10 )
            // InternalEntityDsl.g:487:2: rule__Plugin__Group__9__Impl rule__Plugin__Group__10
            {
            pushFollow(FOLLOW_9);
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
    // InternalEntityDsl.g:494:1: rule__Plugin__Group__9__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:498:1: ( ( '=' ) )
            // InternalEntityDsl.g:499:1: ( '=' )
            {
            // InternalEntityDsl.g:499:1: ( '=' )
            // InternalEntityDsl.g:500:2: '='
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
    // InternalEntityDsl.g:509:1: rule__Plugin__Group__10 : rule__Plugin__Group__10__Impl rule__Plugin__Group__11 ;
    public final void rule__Plugin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:513:1: ( rule__Plugin__Group__10__Impl rule__Plugin__Group__11 )
            // InternalEntityDsl.g:514:2: rule__Plugin__Group__10__Impl rule__Plugin__Group__11
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
    // InternalEntityDsl.g:521:1: rule__Plugin__Group__10__Impl : ( ( rule__Plugin__DescriptionAssignment_10 )? ) ;
    public final void rule__Plugin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:525:1: ( ( ( rule__Plugin__DescriptionAssignment_10 )? ) )
            // InternalEntityDsl.g:526:1: ( ( rule__Plugin__DescriptionAssignment_10 )? )
            {
            // InternalEntityDsl.g:526:1: ( ( rule__Plugin__DescriptionAssignment_10 )? )
            // InternalEntityDsl.g:527:2: ( rule__Plugin__DescriptionAssignment_10 )?
            {
             before(grammarAccess.getPluginAccess().getDescriptionAssignment_10()); 
            // InternalEntityDsl.g:528:2: ( rule__Plugin__DescriptionAssignment_10 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:528:3: rule__Plugin__DescriptionAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__DescriptionAssignment_10();

                    state._fsp--;


                    }
                    break;

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
    // InternalEntityDsl.g:536:1: rule__Plugin__Group__11 : rule__Plugin__Group__11__Impl rule__Plugin__Group__12 ;
    public final void rule__Plugin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:540:1: ( rule__Plugin__Group__11__Impl rule__Plugin__Group__12 )
            // InternalEntityDsl.g:541:2: rule__Plugin__Group__11__Impl rule__Plugin__Group__12
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
    // InternalEntityDsl.g:548:1: rule__Plugin__Group__11__Impl : ( 'author' ) ;
    public final void rule__Plugin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:552:1: ( ( 'author' ) )
            // InternalEntityDsl.g:553:1: ( 'author' )
            {
            // InternalEntityDsl.g:553:1: ( 'author' )
            // InternalEntityDsl.g:554:2: 'author'
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
    // InternalEntityDsl.g:563:1: rule__Plugin__Group__12 : rule__Plugin__Group__12__Impl rule__Plugin__Group__13 ;
    public final void rule__Plugin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:567:1: ( rule__Plugin__Group__12__Impl rule__Plugin__Group__13 )
            // InternalEntityDsl.g:568:2: rule__Plugin__Group__12__Impl rule__Plugin__Group__13
            {
            pushFollow(FOLLOW_10);
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
    // InternalEntityDsl.g:575:1: rule__Plugin__Group__12__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:579:1: ( ( '=' ) )
            // InternalEntityDsl.g:580:1: ( '=' )
            {
            // InternalEntityDsl.g:580:1: ( '=' )
            // InternalEntityDsl.g:581:2: '='
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
    // InternalEntityDsl.g:590:1: rule__Plugin__Group__13 : rule__Plugin__Group__13__Impl rule__Plugin__Group__14 ;
    public final void rule__Plugin__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:594:1: ( rule__Plugin__Group__13__Impl rule__Plugin__Group__14 )
            // InternalEntityDsl.g:595:2: rule__Plugin__Group__13__Impl rule__Plugin__Group__14
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
    // InternalEntityDsl.g:602:1: rule__Plugin__Group__13__Impl : ( ( rule__Plugin__AuthorAssignment_13 )? ) ;
    public final void rule__Plugin__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:606:1: ( ( ( rule__Plugin__AuthorAssignment_13 )? ) )
            // InternalEntityDsl.g:607:1: ( ( rule__Plugin__AuthorAssignment_13 )? )
            {
            // InternalEntityDsl.g:607:1: ( ( rule__Plugin__AuthorAssignment_13 )? )
            // InternalEntityDsl.g:608:2: ( rule__Plugin__AuthorAssignment_13 )?
            {
             before(grammarAccess.getPluginAccess().getAuthorAssignment_13()); 
            // InternalEntityDsl.g:609:2: ( rule__Plugin__AuthorAssignment_13 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:609:3: rule__Plugin__AuthorAssignment_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__AuthorAssignment_13();

                    state._fsp--;


                    }
                    break;

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
    // InternalEntityDsl.g:617:1: rule__Plugin__Group__14 : rule__Plugin__Group__14__Impl rule__Plugin__Group__15 ;
    public final void rule__Plugin__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:621:1: ( rule__Plugin__Group__14__Impl rule__Plugin__Group__15 )
            // InternalEntityDsl.g:622:2: rule__Plugin__Group__14__Impl rule__Plugin__Group__15
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
    // InternalEntityDsl.g:629:1: rule__Plugin__Group__14__Impl : ( 'license' ) ;
    public final void rule__Plugin__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:633:1: ( ( 'license' ) )
            // InternalEntityDsl.g:634:1: ( 'license' )
            {
            // InternalEntityDsl.g:634:1: ( 'license' )
            // InternalEntityDsl.g:635:2: 'license'
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
    // InternalEntityDsl.g:644:1: rule__Plugin__Group__15 : rule__Plugin__Group__15__Impl rule__Plugin__Group__16 ;
    public final void rule__Plugin__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:648:1: ( rule__Plugin__Group__15__Impl rule__Plugin__Group__16 )
            // InternalEntityDsl.g:649:2: rule__Plugin__Group__15__Impl rule__Plugin__Group__16
            {
            pushFollow(FOLLOW_11);
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
    // InternalEntityDsl.g:656:1: rule__Plugin__Group__15__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:660:1: ( ( '=' ) )
            // InternalEntityDsl.g:661:1: ( '=' )
            {
            // InternalEntityDsl.g:661:1: ( '=' )
            // InternalEntityDsl.g:662:2: '='
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
    // InternalEntityDsl.g:671:1: rule__Plugin__Group__16 : rule__Plugin__Group__16__Impl rule__Plugin__Group__17 ;
    public final void rule__Plugin__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:675:1: ( rule__Plugin__Group__16__Impl rule__Plugin__Group__17 )
            // InternalEntityDsl.g:676:2: rule__Plugin__Group__16__Impl rule__Plugin__Group__17
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
    // InternalEntityDsl.g:683:1: rule__Plugin__Group__16__Impl : ( ( rule__Plugin__LicenseAssignment_16 )? ) ;
    public final void rule__Plugin__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:687:1: ( ( ( rule__Plugin__LicenseAssignment_16 )? ) )
            // InternalEntityDsl.g:688:1: ( ( rule__Plugin__LicenseAssignment_16 )? )
            {
            // InternalEntityDsl.g:688:1: ( ( rule__Plugin__LicenseAssignment_16 )? )
            // InternalEntityDsl.g:689:2: ( rule__Plugin__LicenseAssignment_16 )?
            {
             before(grammarAccess.getPluginAccess().getLicenseAssignment_16()); 
            // InternalEntityDsl.g:690:2: ( rule__Plugin__LicenseAssignment_16 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:690:3: rule__Plugin__LicenseAssignment_16
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__LicenseAssignment_16();

                    state._fsp--;


                    }
                    break;

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
    // InternalEntityDsl.g:698:1: rule__Plugin__Group__17 : rule__Plugin__Group__17__Impl rule__Plugin__Group__18 ;
    public final void rule__Plugin__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:702:1: ( rule__Plugin__Group__17__Impl rule__Plugin__Group__18 )
            // InternalEntityDsl.g:703:2: rule__Plugin__Group__17__Impl rule__Plugin__Group__18
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
    // InternalEntityDsl.g:710:1: rule__Plugin__Group__17__Impl : ( 'prefix' ) ;
    public final void rule__Plugin__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:714:1: ( ( 'prefix' ) )
            // InternalEntityDsl.g:715:1: ( 'prefix' )
            {
            // InternalEntityDsl.g:715:1: ( 'prefix' )
            // InternalEntityDsl.g:716:2: 'prefix'
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
    // InternalEntityDsl.g:725:1: rule__Plugin__Group__18 : rule__Plugin__Group__18__Impl rule__Plugin__Group__19 ;
    public final void rule__Plugin__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:729:1: ( rule__Plugin__Group__18__Impl rule__Plugin__Group__19 )
            // InternalEntityDsl.g:730:2: rule__Plugin__Group__18__Impl rule__Plugin__Group__19
            {
            pushFollow(FOLLOW_12);
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
    // InternalEntityDsl.g:737:1: rule__Plugin__Group__18__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:741:1: ( ( '=' ) )
            // InternalEntityDsl.g:742:1: ( '=' )
            {
            // InternalEntityDsl.g:742:1: ( '=' )
            // InternalEntityDsl.g:743:2: '='
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
    // InternalEntityDsl.g:752:1: rule__Plugin__Group__19 : rule__Plugin__Group__19__Impl rule__Plugin__Group__20 ;
    public final void rule__Plugin__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:756:1: ( rule__Plugin__Group__19__Impl rule__Plugin__Group__20 )
            // InternalEntityDsl.g:757:2: rule__Plugin__Group__19__Impl rule__Plugin__Group__20
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
    // InternalEntityDsl.g:764:1: rule__Plugin__Group__19__Impl : ( ( rule__Plugin__PrefixAssignment_19 )? ) ;
    public final void rule__Plugin__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:768:1: ( ( ( rule__Plugin__PrefixAssignment_19 )? ) )
            // InternalEntityDsl.g:769:1: ( ( rule__Plugin__PrefixAssignment_19 )? )
            {
            // InternalEntityDsl.g:769:1: ( ( rule__Plugin__PrefixAssignment_19 )? )
            // InternalEntityDsl.g:770:2: ( rule__Plugin__PrefixAssignment_19 )?
            {
             before(grammarAccess.getPluginAccess().getPrefixAssignment_19()); 
            // InternalEntityDsl.g:771:2: ( rule__Plugin__PrefixAssignment_19 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:771:3: rule__Plugin__PrefixAssignment_19
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__PrefixAssignment_19();

                    state._fsp--;


                    }
                    break;

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
    // InternalEntityDsl.g:779:1: rule__Plugin__Group__20 : rule__Plugin__Group__20__Impl rule__Plugin__Group__21 ;
    public final void rule__Plugin__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:783:1: ( rule__Plugin__Group__20__Impl rule__Plugin__Group__21 )
            // InternalEntityDsl.g:784:2: rule__Plugin__Group__20__Impl rule__Plugin__Group__21
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
    // InternalEntityDsl.g:791:1: rule__Plugin__Group__20__Impl : ( 'textDomain' ) ;
    public final void rule__Plugin__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:795:1: ( ( 'textDomain' ) )
            // InternalEntityDsl.g:796:1: ( 'textDomain' )
            {
            // InternalEntityDsl.g:796:1: ( 'textDomain' )
            // InternalEntityDsl.g:797:2: 'textDomain'
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
    // InternalEntityDsl.g:806:1: rule__Plugin__Group__21 : rule__Plugin__Group__21__Impl rule__Plugin__Group__22 ;
    public final void rule__Plugin__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:810:1: ( rule__Plugin__Group__21__Impl rule__Plugin__Group__22 )
            // InternalEntityDsl.g:811:2: rule__Plugin__Group__21__Impl rule__Plugin__Group__22
            {
            pushFollow(FOLLOW_13);
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
    // InternalEntityDsl.g:818:1: rule__Plugin__Group__21__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:822:1: ( ( '=' ) )
            // InternalEntityDsl.g:823:1: ( '=' )
            {
            // InternalEntityDsl.g:823:1: ( '=' )
            // InternalEntityDsl.g:824:2: '='
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
    // InternalEntityDsl.g:833:1: rule__Plugin__Group__22 : rule__Plugin__Group__22__Impl rule__Plugin__Group__23 ;
    public final void rule__Plugin__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:837:1: ( rule__Plugin__Group__22__Impl rule__Plugin__Group__23 )
            // InternalEntityDsl.g:838:2: rule__Plugin__Group__22__Impl rule__Plugin__Group__23
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
    // InternalEntityDsl.g:845:1: rule__Plugin__Group__22__Impl : ( ( rule__Plugin__TextDomainAssignment_22 )? ) ;
    public final void rule__Plugin__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:849:1: ( ( ( rule__Plugin__TextDomainAssignment_22 )? ) )
            // InternalEntityDsl.g:850:1: ( ( rule__Plugin__TextDomainAssignment_22 )? )
            {
            // InternalEntityDsl.g:850:1: ( ( rule__Plugin__TextDomainAssignment_22 )? )
            // InternalEntityDsl.g:851:2: ( rule__Plugin__TextDomainAssignment_22 )?
            {
             before(grammarAccess.getPluginAccess().getTextDomainAssignment_22()); 
            // InternalEntityDsl.g:852:2: ( rule__Plugin__TextDomainAssignment_22 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:852:3: rule__Plugin__TextDomainAssignment_22
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__TextDomainAssignment_22();

                    state._fsp--;


                    }
                    break;

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
    // InternalEntityDsl.g:860:1: rule__Plugin__Group__23 : rule__Plugin__Group__23__Impl rule__Plugin__Group__24 ;
    public final void rule__Plugin__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:864:1: ( rule__Plugin__Group__23__Impl rule__Plugin__Group__24 )
            // InternalEntityDsl.g:865:2: rule__Plugin__Group__23__Impl rule__Plugin__Group__24
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
    // InternalEntityDsl.g:872:1: rule__Plugin__Group__23__Impl : ( 'activate' ) ;
    public final void rule__Plugin__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:876:1: ( ( 'activate' ) )
            // InternalEntityDsl.g:877:1: ( 'activate' )
            {
            // InternalEntityDsl.g:877:1: ( 'activate' )
            // InternalEntityDsl.g:878:2: 'activate'
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
    // InternalEntityDsl.g:887:1: rule__Plugin__Group__24 : rule__Plugin__Group__24__Impl rule__Plugin__Group__25 ;
    public final void rule__Plugin__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:891:1: ( rule__Plugin__Group__24__Impl rule__Plugin__Group__25 )
            // InternalEntityDsl.g:892:2: rule__Plugin__Group__24__Impl rule__Plugin__Group__25
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
    // InternalEntityDsl.g:899:1: rule__Plugin__Group__24__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:903:1: ( ( '=' ) )
            // InternalEntityDsl.g:904:1: ( '=' )
            {
            // InternalEntityDsl.g:904:1: ( '=' )
            // InternalEntityDsl.g:905:2: '='
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
    // InternalEntityDsl.g:914:1: rule__Plugin__Group__25 : rule__Plugin__Group__25__Impl rule__Plugin__Group__26 ;
    public final void rule__Plugin__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:918:1: ( rule__Plugin__Group__25__Impl rule__Plugin__Group__26 )
            // InternalEntityDsl.g:919:2: rule__Plugin__Group__25__Impl rule__Plugin__Group__26
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
    // InternalEntityDsl.g:926:1: rule__Plugin__Group__25__Impl : ( ( rule__Plugin__ActivateAssignment_25 )? ) ;
    public final void rule__Plugin__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:930:1: ( ( ( rule__Plugin__ActivateAssignment_25 )? ) )
            // InternalEntityDsl.g:931:1: ( ( rule__Plugin__ActivateAssignment_25 )? )
            {
            // InternalEntityDsl.g:931:1: ( ( rule__Plugin__ActivateAssignment_25 )? )
            // InternalEntityDsl.g:932:2: ( rule__Plugin__ActivateAssignment_25 )?
            {
             before(grammarAccess.getPluginAccess().getActivateAssignment_25()); 
            // InternalEntityDsl.g:933:2: ( rule__Plugin__ActivateAssignment_25 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:933:3: rule__Plugin__ActivateAssignment_25
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
    // InternalEntityDsl.g:941:1: rule__Plugin__Group__26 : rule__Plugin__Group__26__Impl rule__Plugin__Group__27 ;
    public final void rule__Plugin__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:945:1: ( rule__Plugin__Group__26__Impl rule__Plugin__Group__27 )
            // InternalEntityDsl.g:946:2: rule__Plugin__Group__26__Impl rule__Plugin__Group__27
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
    // InternalEntityDsl.g:953:1: rule__Plugin__Group__26__Impl : ( 'deactivate' ) ;
    public final void rule__Plugin__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:957:1: ( ( 'deactivate' ) )
            // InternalEntityDsl.g:958:1: ( 'deactivate' )
            {
            // InternalEntityDsl.g:958:1: ( 'deactivate' )
            // InternalEntityDsl.g:959:2: 'deactivate'
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
    // InternalEntityDsl.g:968:1: rule__Plugin__Group__27 : rule__Plugin__Group__27__Impl rule__Plugin__Group__28 ;
    public final void rule__Plugin__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:972:1: ( rule__Plugin__Group__27__Impl rule__Plugin__Group__28 )
            // InternalEntityDsl.g:973:2: rule__Plugin__Group__27__Impl rule__Plugin__Group__28
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
    // InternalEntityDsl.g:980:1: rule__Plugin__Group__27__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:984:1: ( ( '=' ) )
            // InternalEntityDsl.g:985:1: ( '=' )
            {
            // InternalEntityDsl.g:985:1: ( '=' )
            // InternalEntityDsl.g:986:2: '='
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
    // InternalEntityDsl.g:995:1: rule__Plugin__Group__28 : rule__Plugin__Group__28__Impl rule__Plugin__Group__29 ;
    public final void rule__Plugin__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:999:1: ( rule__Plugin__Group__28__Impl rule__Plugin__Group__29 )
            // InternalEntityDsl.g:1000:2: rule__Plugin__Group__28__Impl rule__Plugin__Group__29
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
    // InternalEntityDsl.g:1007:1: rule__Plugin__Group__28__Impl : ( ( rule__Plugin__DeactivateAssignment_28 )? ) ;
    public final void rule__Plugin__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1011:1: ( ( ( rule__Plugin__DeactivateAssignment_28 )? ) )
            // InternalEntityDsl.g:1012:1: ( ( rule__Plugin__DeactivateAssignment_28 )? )
            {
            // InternalEntityDsl.g:1012:1: ( ( rule__Plugin__DeactivateAssignment_28 )? )
            // InternalEntityDsl.g:1013:2: ( rule__Plugin__DeactivateAssignment_28 )?
            {
             before(grammarAccess.getPluginAccess().getDeactivateAssignment_28()); 
            // InternalEntityDsl.g:1014:2: ( rule__Plugin__DeactivateAssignment_28 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntityDsl.g:1014:3: rule__Plugin__DeactivateAssignment_28
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
    // InternalEntityDsl.g:1022:1: rule__Plugin__Group__29 : rule__Plugin__Group__29__Impl rule__Plugin__Group__30 ;
    public final void rule__Plugin__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1026:1: ( rule__Plugin__Group__29__Impl rule__Plugin__Group__30 )
            // InternalEntityDsl.g:1027:2: rule__Plugin__Group__29__Impl rule__Plugin__Group__30
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
    // InternalEntityDsl.g:1034:1: rule__Plugin__Group__29__Impl : ( 'uninstall' ) ;
    public final void rule__Plugin__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1038:1: ( ( 'uninstall' ) )
            // InternalEntityDsl.g:1039:1: ( 'uninstall' )
            {
            // InternalEntityDsl.g:1039:1: ( 'uninstall' )
            // InternalEntityDsl.g:1040:2: 'uninstall'
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
    // InternalEntityDsl.g:1049:1: rule__Plugin__Group__30 : rule__Plugin__Group__30__Impl rule__Plugin__Group__31 ;
    public final void rule__Plugin__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1053:1: ( rule__Plugin__Group__30__Impl rule__Plugin__Group__31 )
            // InternalEntityDsl.g:1054:2: rule__Plugin__Group__30__Impl rule__Plugin__Group__31
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
    // InternalEntityDsl.g:1061:1: rule__Plugin__Group__30__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1065:1: ( ( '=' ) )
            // InternalEntityDsl.g:1066:1: ( '=' )
            {
            // InternalEntityDsl.g:1066:1: ( '=' )
            // InternalEntityDsl.g:1067:2: '='
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
    // InternalEntityDsl.g:1076:1: rule__Plugin__Group__31 : rule__Plugin__Group__31__Impl rule__Plugin__Group__32 ;
    public final void rule__Plugin__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1080:1: ( rule__Plugin__Group__31__Impl rule__Plugin__Group__32 )
            // InternalEntityDsl.g:1081:2: rule__Plugin__Group__31__Impl rule__Plugin__Group__32
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
    // InternalEntityDsl.g:1088:1: rule__Plugin__Group__31__Impl : ( ( rule__Plugin__UninstallAssignment_31 )? ) ;
    public final void rule__Plugin__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1092:1: ( ( ( rule__Plugin__UninstallAssignment_31 )? ) )
            // InternalEntityDsl.g:1093:1: ( ( rule__Plugin__UninstallAssignment_31 )? )
            {
            // InternalEntityDsl.g:1093:1: ( ( rule__Plugin__UninstallAssignment_31 )? )
            // InternalEntityDsl.g:1094:2: ( rule__Plugin__UninstallAssignment_31 )?
            {
             before(grammarAccess.getPluginAccess().getUninstallAssignment_31()); 
            // InternalEntityDsl.g:1095:2: ( rule__Plugin__UninstallAssignment_31 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEntityDsl.g:1095:3: rule__Plugin__UninstallAssignment_31
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
    // InternalEntityDsl.g:1103:1: rule__Plugin__Group__32 : rule__Plugin__Group__32__Impl rule__Plugin__Group__33 ;
    public final void rule__Plugin__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1107:1: ( rule__Plugin__Group__32__Impl rule__Plugin__Group__33 )
            // InternalEntityDsl.g:1108:2: rule__Plugin__Group__32__Impl rule__Plugin__Group__33
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
    // InternalEntityDsl.g:1115:1: rule__Plugin__Group__32__Impl : ( ( rule__Plugin__WidgetsAssignment_32 )* ) ;
    public final void rule__Plugin__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1119:1: ( ( ( rule__Plugin__WidgetsAssignment_32 )* ) )
            // InternalEntityDsl.g:1120:1: ( ( rule__Plugin__WidgetsAssignment_32 )* )
            {
            // InternalEntityDsl.g:1120:1: ( ( rule__Plugin__WidgetsAssignment_32 )* )
            // InternalEntityDsl.g:1121:2: ( rule__Plugin__WidgetsAssignment_32 )*
            {
             before(grammarAccess.getPluginAccess().getWidgetsAssignment_32()); 
            // InternalEntityDsl.g:1122:2: ( rule__Plugin__WidgetsAssignment_32 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEntityDsl.g:1122:3: rule__Plugin__WidgetsAssignment_32
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Plugin__WidgetsAssignment_32();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalEntityDsl.g:1130:1: rule__Plugin__Group__33 : rule__Plugin__Group__33__Impl rule__Plugin__Group__34 ;
    public final void rule__Plugin__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1134:1: ( rule__Plugin__Group__33__Impl rule__Plugin__Group__34 )
            // InternalEntityDsl.g:1135:2: rule__Plugin__Group__33__Impl rule__Plugin__Group__34
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
    // InternalEntityDsl.g:1142:1: rule__Plugin__Group__33__Impl : ( ( rule__Plugin__ShortcodesAssignment_33 )* ) ;
    public final void rule__Plugin__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1146:1: ( ( ( rule__Plugin__ShortcodesAssignment_33 )* ) )
            // InternalEntityDsl.g:1147:1: ( ( rule__Plugin__ShortcodesAssignment_33 )* )
            {
            // InternalEntityDsl.g:1147:1: ( ( rule__Plugin__ShortcodesAssignment_33 )* )
            // InternalEntityDsl.g:1148:2: ( rule__Plugin__ShortcodesAssignment_33 )*
            {
             before(grammarAccess.getPluginAccess().getShortcodesAssignment_33()); 
            // InternalEntityDsl.g:1149:2: ( rule__Plugin__ShortcodesAssignment_33 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEntityDsl.g:1149:3: rule__Plugin__ShortcodesAssignment_33
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Plugin__ShortcodesAssignment_33();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalEntityDsl.g:1157:1: rule__Plugin__Group__34 : rule__Plugin__Group__34__Impl rule__Plugin__Group__35 ;
    public final void rule__Plugin__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1161:1: ( rule__Plugin__Group__34__Impl rule__Plugin__Group__35 )
            // InternalEntityDsl.g:1162:2: rule__Plugin__Group__34__Impl rule__Plugin__Group__35
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
    // InternalEntityDsl.g:1169:1: rule__Plugin__Group__34__Impl : ( ( rule__Plugin__CustomPostTypesAssignment_34 )* ) ;
    public final void rule__Plugin__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1173:1: ( ( ( rule__Plugin__CustomPostTypesAssignment_34 )* ) )
            // InternalEntityDsl.g:1174:1: ( ( rule__Plugin__CustomPostTypesAssignment_34 )* )
            {
            // InternalEntityDsl.g:1174:1: ( ( rule__Plugin__CustomPostTypesAssignment_34 )* )
            // InternalEntityDsl.g:1175:2: ( rule__Plugin__CustomPostTypesAssignment_34 )*
            {
             before(grammarAccess.getPluginAccess().getCustomPostTypesAssignment_34()); 
            // InternalEntityDsl.g:1176:2: ( rule__Plugin__CustomPostTypesAssignment_34 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDsl.g:1176:3: rule__Plugin__CustomPostTypesAssignment_34
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Plugin__CustomPostTypesAssignment_34();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalEntityDsl.g:1184:1: rule__Plugin__Group__35 : rule__Plugin__Group__35__Impl rule__Plugin__Group__36 ;
    public final void rule__Plugin__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1188:1: ( rule__Plugin__Group__35__Impl rule__Plugin__Group__36 )
            // InternalEntityDsl.g:1189:2: rule__Plugin__Group__35__Impl rule__Plugin__Group__36
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
    // InternalEntityDsl.g:1196:1: rule__Plugin__Group__35__Impl : ( ( rule__Plugin__SettingsAssignment_35 )* ) ;
    public final void rule__Plugin__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1200:1: ( ( ( rule__Plugin__SettingsAssignment_35 )* ) )
            // InternalEntityDsl.g:1201:1: ( ( rule__Plugin__SettingsAssignment_35 )* )
            {
            // InternalEntityDsl.g:1201:1: ( ( rule__Plugin__SettingsAssignment_35 )* )
            // InternalEntityDsl.g:1202:2: ( rule__Plugin__SettingsAssignment_35 )*
            {
             before(grammarAccess.getPluginAccess().getSettingsAssignment_35()); 
            // InternalEntityDsl.g:1203:2: ( rule__Plugin__SettingsAssignment_35 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEntityDsl.g:1203:3: rule__Plugin__SettingsAssignment_35
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Plugin__SettingsAssignment_35();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalEntityDsl.g:1211:1: rule__Plugin__Group__36 : rule__Plugin__Group__36__Impl rule__Plugin__Group__37 ;
    public final void rule__Plugin__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1215:1: ( rule__Plugin__Group__36__Impl rule__Plugin__Group__37 )
            // InternalEntityDsl.g:1216:2: rule__Plugin__Group__36__Impl rule__Plugin__Group__37
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
    // InternalEntityDsl.g:1223:1: rule__Plugin__Group__36__Impl : ( ( rule__Plugin__HooksAssignment_36 )* ) ;
    public final void rule__Plugin__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1227:1: ( ( ( rule__Plugin__HooksAssignment_36 )* ) )
            // InternalEntityDsl.g:1228:1: ( ( rule__Plugin__HooksAssignment_36 )* )
            {
            // InternalEntityDsl.g:1228:1: ( ( rule__Plugin__HooksAssignment_36 )* )
            // InternalEntityDsl.g:1229:2: ( rule__Plugin__HooksAssignment_36 )*
            {
             before(grammarAccess.getPluginAccess().getHooksAssignment_36()); 
            // InternalEntityDsl.g:1230:2: ( rule__Plugin__HooksAssignment_36 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEntityDsl.g:1230:3: rule__Plugin__HooksAssignment_36
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Plugin__HooksAssignment_36();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalEntityDsl.g:1238:1: rule__Plugin__Group__37 : rule__Plugin__Group__37__Impl ;
    public final void rule__Plugin__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1242:1: ( rule__Plugin__Group__37__Impl )
            // InternalEntityDsl.g:1243:2: rule__Plugin__Group__37__Impl
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
    // InternalEntityDsl.g:1249:1: rule__Plugin__Group__37__Impl : ( '}' ) ;
    public final void rule__Plugin__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1253:1: ( ( '}' ) )
            // InternalEntityDsl.g:1254:1: ( '}' )
            {
            // InternalEntityDsl.g:1254:1: ( '}' )
            // InternalEntityDsl.g:1255:2: '}'
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
    // InternalEntityDsl.g:1265:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1269:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalEntityDsl.g:1270:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
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
    // InternalEntityDsl.g:1277:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1281:1: ( ( 'Widget' ) )
            // InternalEntityDsl.g:1282:1: ( 'Widget' )
            {
            // InternalEntityDsl.g:1282:1: ( 'Widget' )
            // InternalEntityDsl.g:1283:2: 'Widget'
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
    // InternalEntityDsl.g:1292:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1296:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalEntityDsl.g:1297:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
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
    // InternalEntityDsl.g:1304:1: rule__Widget__Group__1__Impl : ( '{' ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1308:1: ( ( '{' ) )
            // InternalEntityDsl.g:1309:1: ( '{' )
            {
            // InternalEntityDsl.g:1309:1: ( '{' )
            // InternalEntityDsl.g:1310:2: '{'
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
    // InternalEntityDsl.g:1319:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1323:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalEntityDsl.g:1324:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
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
    // InternalEntityDsl.g:1331:1: rule__Widget__Group__2__Impl : ( 'widgetName' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1335:1: ( ( 'widgetName' ) )
            // InternalEntityDsl.g:1336:1: ( 'widgetName' )
            {
            // InternalEntityDsl.g:1336:1: ( 'widgetName' )
            // InternalEntityDsl.g:1337:2: 'widgetName'
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
    // InternalEntityDsl.g:1346:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1350:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalEntityDsl.g:1351:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
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
    // InternalEntityDsl.g:1358:1: rule__Widget__Group__3__Impl : ( '=' ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1362:1: ( ( '=' ) )
            // InternalEntityDsl.g:1363:1: ( '=' )
            {
            // InternalEntityDsl.g:1363:1: ( '=' )
            // InternalEntityDsl.g:1364:2: '='
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
    // InternalEntityDsl.g:1373:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1377:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalEntityDsl.g:1378:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
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
    // InternalEntityDsl.g:1385:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__WidgetNameAssignment_4 ) ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1389:1: ( ( ( rule__Widget__WidgetNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1390:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1390:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            // InternalEntityDsl.g:1391:2: ( rule__Widget__WidgetNameAssignment_4 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetNameAssignment_4()); 
            // InternalEntityDsl.g:1392:2: ( rule__Widget__WidgetNameAssignment_4 )
            // InternalEntityDsl.g:1392:3: rule__Widget__WidgetNameAssignment_4
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
    // InternalEntityDsl.g:1400:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl rule__Widget__Group__6 ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1404:1: ( rule__Widget__Group__5__Impl rule__Widget__Group__6 )
            // InternalEntityDsl.g:1405:2: rule__Widget__Group__5__Impl rule__Widget__Group__6
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
    // InternalEntityDsl.g:1412:1: rule__Widget__Group__5__Impl : ( 'widgetDescription' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1416:1: ( ( 'widgetDescription' ) )
            // InternalEntityDsl.g:1417:1: ( 'widgetDescription' )
            {
            // InternalEntityDsl.g:1417:1: ( 'widgetDescription' )
            // InternalEntityDsl.g:1418:2: 'widgetDescription'
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
    // InternalEntityDsl.g:1427:1: rule__Widget__Group__6 : rule__Widget__Group__6__Impl rule__Widget__Group__7 ;
    public final void rule__Widget__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1431:1: ( rule__Widget__Group__6__Impl rule__Widget__Group__7 )
            // InternalEntityDsl.g:1432:2: rule__Widget__Group__6__Impl rule__Widget__Group__7
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
    // InternalEntityDsl.g:1439:1: rule__Widget__Group__6__Impl : ( '=' ) ;
    public final void rule__Widget__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1443:1: ( ( '=' ) )
            // InternalEntityDsl.g:1444:1: ( '=' )
            {
            // InternalEntityDsl.g:1444:1: ( '=' )
            // InternalEntityDsl.g:1445:2: '='
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
    // InternalEntityDsl.g:1454:1: rule__Widget__Group__7 : rule__Widget__Group__7__Impl rule__Widget__Group__8 ;
    public final void rule__Widget__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1458:1: ( rule__Widget__Group__7__Impl rule__Widget__Group__8 )
            // InternalEntityDsl.g:1459:2: rule__Widget__Group__7__Impl rule__Widget__Group__8
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
    // InternalEntityDsl.g:1466:1: rule__Widget__Group__7__Impl : ( ( rule__Widget__WidgetDescriptionAssignment_7 )? ) ;
    public final void rule__Widget__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1470:1: ( ( ( rule__Widget__WidgetDescriptionAssignment_7 )? ) )
            // InternalEntityDsl.g:1471:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 )? )
            {
            // InternalEntityDsl.g:1471:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 )? )
            // InternalEntityDsl.g:1472:2: ( rule__Widget__WidgetDescriptionAssignment_7 )?
            {
             before(grammarAccess.getWidgetAccess().getWidgetDescriptionAssignment_7()); 
            // InternalEntityDsl.g:1473:2: ( rule__Widget__WidgetDescriptionAssignment_7 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEntityDsl.g:1473:3: rule__Widget__WidgetDescriptionAssignment_7
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
    // InternalEntityDsl.g:1481:1: rule__Widget__Group__8 : rule__Widget__Group__8__Impl rule__Widget__Group__9 ;
    public final void rule__Widget__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1485:1: ( rule__Widget__Group__8__Impl rule__Widget__Group__9 )
            // InternalEntityDsl.g:1486:2: rule__Widget__Group__8__Impl rule__Widget__Group__9
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
    // InternalEntityDsl.g:1493:1: rule__Widget__Group__8__Impl : ( ( rule__Widget__SettingsAssignment_8 )* ) ;
    public final void rule__Widget__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1497:1: ( ( ( rule__Widget__SettingsAssignment_8 )* ) )
            // InternalEntityDsl.g:1498:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            {
            // InternalEntityDsl.g:1498:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            // InternalEntityDsl.g:1499:2: ( rule__Widget__SettingsAssignment_8 )*
            {
             before(grammarAccess.getWidgetAccess().getSettingsAssignment_8()); 
            // InternalEntityDsl.g:1500:2: ( rule__Widget__SettingsAssignment_8 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEntityDsl.g:1500:3: rule__Widget__SettingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Widget__SettingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalEntityDsl.g:1508:1: rule__Widget__Group__9 : rule__Widget__Group__9__Impl ;
    public final void rule__Widget__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1512:1: ( rule__Widget__Group__9__Impl )
            // InternalEntityDsl.g:1513:2: rule__Widget__Group__9__Impl
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
    // InternalEntityDsl.g:1519:1: rule__Widget__Group__9__Impl : ( '}' ) ;
    public final void rule__Widget__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1523:1: ( ( '}' ) )
            // InternalEntityDsl.g:1524:1: ( '}' )
            {
            // InternalEntityDsl.g:1524:1: ( '}' )
            // InternalEntityDsl.g:1525:2: '}'
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
    // InternalEntityDsl.g:1535:1: rule__Shortcode__Group__0 : rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 ;
    public final void rule__Shortcode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1539:1: ( rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 )
            // InternalEntityDsl.g:1540:2: rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1
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
    // InternalEntityDsl.g:1547:1: rule__Shortcode__Group__0__Impl : ( 'Shortcode' ) ;
    public final void rule__Shortcode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1551:1: ( ( 'Shortcode' ) )
            // InternalEntityDsl.g:1552:1: ( 'Shortcode' )
            {
            // InternalEntityDsl.g:1552:1: ( 'Shortcode' )
            // InternalEntityDsl.g:1553:2: 'Shortcode'
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
    // InternalEntityDsl.g:1562:1: rule__Shortcode__Group__1 : rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 ;
    public final void rule__Shortcode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1566:1: ( rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 )
            // InternalEntityDsl.g:1567:2: rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2
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
    // InternalEntityDsl.g:1574:1: rule__Shortcode__Group__1__Impl : ( '{' ) ;
    public final void rule__Shortcode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1578:1: ( ( '{' ) )
            // InternalEntityDsl.g:1579:1: ( '{' )
            {
            // InternalEntityDsl.g:1579:1: ( '{' )
            // InternalEntityDsl.g:1580:2: '{'
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
    // InternalEntityDsl.g:1589:1: rule__Shortcode__Group__2 : rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 ;
    public final void rule__Shortcode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1593:1: ( rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 )
            // InternalEntityDsl.g:1594:2: rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3
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
    // InternalEntityDsl.g:1601:1: rule__Shortcode__Group__2__Impl : ( 'shortcodeName' ) ;
    public final void rule__Shortcode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1605:1: ( ( 'shortcodeName' ) )
            // InternalEntityDsl.g:1606:1: ( 'shortcodeName' )
            {
            // InternalEntityDsl.g:1606:1: ( 'shortcodeName' )
            // InternalEntityDsl.g:1607:2: 'shortcodeName'
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
    // InternalEntityDsl.g:1616:1: rule__Shortcode__Group__3 : rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 ;
    public final void rule__Shortcode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1620:1: ( rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 )
            // InternalEntityDsl.g:1621:2: rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4
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
    // InternalEntityDsl.g:1628:1: rule__Shortcode__Group__3__Impl : ( '=' ) ;
    public final void rule__Shortcode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1632:1: ( ( '=' ) )
            // InternalEntityDsl.g:1633:1: ( '=' )
            {
            // InternalEntityDsl.g:1633:1: ( '=' )
            // InternalEntityDsl.g:1634:2: '='
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
    // InternalEntityDsl.g:1643:1: rule__Shortcode__Group__4 : rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 ;
    public final void rule__Shortcode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1647:1: ( rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 )
            // InternalEntityDsl.g:1648:2: rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5
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
    // InternalEntityDsl.g:1655:1: rule__Shortcode__Group__4__Impl : ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) ;
    public final void rule__Shortcode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1659:1: ( ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1660:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1660:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            // InternalEntityDsl.g:1661:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeNameAssignment_4()); 
            // InternalEntityDsl.g:1662:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            // InternalEntityDsl.g:1662:3: rule__Shortcode__ShortcodeNameAssignment_4
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
    // InternalEntityDsl.g:1670:1: rule__Shortcode__Group__5 : rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 ;
    public final void rule__Shortcode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1674:1: ( rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 )
            // InternalEntityDsl.g:1675:2: rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6
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
    // InternalEntityDsl.g:1682:1: rule__Shortcode__Group__5__Impl : ( ( rule__Shortcode__SettingsAssignment_5 )* ) ;
    public final void rule__Shortcode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1686:1: ( ( ( rule__Shortcode__SettingsAssignment_5 )* ) )
            // InternalEntityDsl.g:1687:1: ( ( rule__Shortcode__SettingsAssignment_5 )* )
            {
            // InternalEntityDsl.g:1687:1: ( ( rule__Shortcode__SettingsAssignment_5 )* )
            // InternalEntityDsl.g:1688:2: ( rule__Shortcode__SettingsAssignment_5 )*
            {
             before(grammarAccess.getShortcodeAccess().getSettingsAssignment_5()); 
            // InternalEntityDsl.g:1689:2: ( rule__Shortcode__SettingsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEntityDsl.g:1689:3: rule__Shortcode__SettingsAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Shortcode__SettingsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalEntityDsl.g:1697:1: rule__Shortcode__Group__6 : rule__Shortcode__Group__6__Impl ;
    public final void rule__Shortcode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1701:1: ( rule__Shortcode__Group__6__Impl )
            // InternalEntityDsl.g:1702:2: rule__Shortcode__Group__6__Impl
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
    // InternalEntityDsl.g:1708:1: rule__Shortcode__Group__6__Impl : ( '}' ) ;
    public final void rule__Shortcode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1712:1: ( ( '}' ) )
            // InternalEntityDsl.g:1713:1: ( '}' )
            {
            // InternalEntityDsl.g:1713:1: ( '}' )
            // InternalEntityDsl.g:1714:2: '}'
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
    // InternalEntityDsl.g:1724:1: rule__CustomPostType__Group__0 : rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 ;
    public final void rule__CustomPostType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1728:1: ( rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 )
            // InternalEntityDsl.g:1729:2: rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1
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
    // InternalEntityDsl.g:1736:1: rule__CustomPostType__Group__0__Impl : ( 'CustomPostType' ) ;
    public final void rule__CustomPostType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1740:1: ( ( 'CustomPostType' ) )
            // InternalEntityDsl.g:1741:1: ( 'CustomPostType' )
            {
            // InternalEntityDsl.g:1741:1: ( 'CustomPostType' )
            // InternalEntityDsl.g:1742:2: 'CustomPostType'
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
    // InternalEntityDsl.g:1751:1: rule__CustomPostType__Group__1 : rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 ;
    public final void rule__CustomPostType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1755:1: ( rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 )
            // InternalEntityDsl.g:1756:2: rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2
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
    // InternalEntityDsl.g:1763:1: rule__CustomPostType__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomPostType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1767:1: ( ( '{' ) )
            // InternalEntityDsl.g:1768:1: ( '{' )
            {
            // InternalEntityDsl.g:1768:1: ( '{' )
            // InternalEntityDsl.g:1769:2: '{'
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
    // InternalEntityDsl.g:1778:1: rule__CustomPostType__Group__2 : rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 ;
    public final void rule__CustomPostType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1782:1: ( rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 )
            // InternalEntityDsl.g:1783:2: rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3
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
    // InternalEntityDsl.g:1790:1: rule__CustomPostType__Group__2__Impl : ( 'postTypeName' ) ;
    public final void rule__CustomPostType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1794:1: ( ( 'postTypeName' ) )
            // InternalEntityDsl.g:1795:1: ( 'postTypeName' )
            {
            // InternalEntityDsl.g:1795:1: ( 'postTypeName' )
            // InternalEntityDsl.g:1796:2: 'postTypeName'
            {
             before(grammarAccess.getCustomPostTypeAccess().getPostTypeNameKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getPostTypeNameKeyword_2()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1805:1: rule__CustomPostType__Group__3 : rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 ;
    public final void rule__CustomPostType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1809:1: ( rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 )
            // InternalEntityDsl.g:1810:2: rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4
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
    // InternalEntityDsl.g:1817:1: rule__CustomPostType__Group__3__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1821:1: ( ( '=' ) )
            // InternalEntityDsl.g:1822:1: ( '=' )
            {
            // InternalEntityDsl.g:1822:1: ( '=' )
            // InternalEntityDsl.g:1823:2: '='
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
    // InternalEntityDsl.g:1832:1: rule__CustomPostType__Group__4 : rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 ;
    public final void rule__CustomPostType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1836:1: ( rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 )
            // InternalEntityDsl.g:1837:2: rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5
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
    // InternalEntityDsl.g:1844:1: rule__CustomPostType__Group__4__Impl : ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) ) ;
    public final void rule__CustomPostType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1848:1: ( ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1849:1: ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1849:1: ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) )
            // InternalEntityDsl.g:1850:2: ( rule__CustomPostType__PostTypeNameAssignment_4 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getPostTypeNameAssignment_4()); 
            // InternalEntityDsl.g:1851:2: ( rule__CustomPostType__PostTypeNameAssignment_4 )
            // InternalEntityDsl.g:1851:3: rule__CustomPostType__PostTypeNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CustomPostType__PostTypeNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomPostTypeAccess().getPostTypeNameAssignment_4()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1859:1: rule__CustomPostType__Group__5 : rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 ;
    public final void rule__CustomPostType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1863:1: ( rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 )
            // InternalEntityDsl.g:1864:2: rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6
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
    // InternalEntityDsl.g:1871:1: rule__CustomPostType__Group__5__Impl : ( 'supports' ) ;
    public final void rule__CustomPostType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1875:1: ( ( 'supports' ) )
            // InternalEntityDsl.g:1876:1: ( 'supports' )
            {
            // InternalEntityDsl.g:1876:1: ( 'supports' )
            // InternalEntityDsl.g:1877:2: 'supports'
            {
             before(grammarAccess.getCustomPostTypeAccess().getSupportsKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getSupportsKeyword_5()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1886:1: rule__CustomPostType__Group__6 : rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 ;
    public final void rule__CustomPostType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1890:1: ( rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 )
            // InternalEntityDsl.g:1891:2: rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalEntityDsl.g:1898:1: rule__CustomPostType__Group__6__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1902:1: ( ( '=' ) )
            // InternalEntityDsl.g:1903:1: ( '=' )
            {
            // InternalEntityDsl.g:1903:1: ( '=' )
            // InternalEntityDsl.g:1904:2: '='
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
    // InternalEntityDsl.g:1913:1: rule__CustomPostType__Group__7 : rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 ;
    public final void rule__CustomPostType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1917:1: ( rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 )
            // InternalEntityDsl.g:1918:2: rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8
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
    // InternalEntityDsl.g:1925:1: rule__CustomPostType__Group__7__Impl : ( ( rule__CustomPostType__SupportsAssignment_7 )? ) ;
    public final void rule__CustomPostType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1929:1: ( ( ( rule__CustomPostType__SupportsAssignment_7 )? ) )
            // InternalEntityDsl.g:1930:1: ( ( rule__CustomPostType__SupportsAssignment_7 )? )
            {
            // InternalEntityDsl.g:1930:1: ( ( rule__CustomPostType__SupportsAssignment_7 )? )
            // InternalEntityDsl.g:1931:2: ( rule__CustomPostType__SupportsAssignment_7 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getSupportsAssignment_7()); 
            // InternalEntityDsl.g:1932:2: ( rule__CustomPostType__SupportsAssignment_7 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEntityDsl.g:1932:3: rule__CustomPostType__SupportsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomPostType__SupportsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomPostTypeAccess().getSupportsAssignment_7()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1940:1: rule__CustomPostType__Group__8 : rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 ;
    public final void rule__CustomPostType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1944:1: ( rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 )
            // InternalEntityDsl.g:1945:2: rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9
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
    // InternalEntityDsl.g:1952:1: rule__CustomPostType__Group__8__Impl : ( 'taxonomies' ) ;
    public final void rule__CustomPostType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1956:1: ( ( 'taxonomies' ) )
            // InternalEntityDsl.g:1957:1: ( 'taxonomies' )
            {
            // InternalEntityDsl.g:1957:1: ( 'taxonomies' )
            // InternalEntityDsl.g:1958:2: 'taxonomies'
            {
             before(grammarAccess.getCustomPostTypeAccess().getTaxonomiesKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getTaxonomiesKeyword_8()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1967:1: rule__CustomPostType__Group__9 : rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 ;
    public final void rule__CustomPostType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1971:1: ( rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 )
            // InternalEntityDsl.g:1972:2: rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10
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
    // InternalEntityDsl.g:1979:1: rule__CustomPostType__Group__9__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1983:1: ( ( '=' ) )
            // InternalEntityDsl.g:1984:1: ( '=' )
            {
            // InternalEntityDsl.g:1984:1: ( '=' )
            // InternalEntityDsl.g:1985:2: '='
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
    // InternalEntityDsl.g:1994:1: rule__CustomPostType__Group__10 : rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 ;
    public final void rule__CustomPostType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1998:1: ( rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 )
            // InternalEntityDsl.g:1999:2: rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11
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
    // InternalEntityDsl.g:2006:1: rule__CustomPostType__Group__10__Impl : ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? ) ;
    public final void rule__CustomPostType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2010:1: ( ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? ) )
            // InternalEntityDsl.g:2011:1: ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? )
            {
            // InternalEntityDsl.g:2011:1: ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? )
            // InternalEntityDsl.g:2012:2: ( rule__CustomPostType__TaxonomiesAssignment_10 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getTaxonomiesAssignment_10()); 
            // InternalEntityDsl.g:2013:2: ( rule__CustomPostType__TaxonomiesAssignment_10 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEntityDsl.g:2013:3: rule__CustomPostType__TaxonomiesAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomPostType__TaxonomiesAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomPostTypeAccess().getTaxonomiesAssignment_10()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2021:1: rule__CustomPostType__Group__11 : rule__CustomPostType__Group__11__Impl ;
    public final void rule__CustomPostType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2025:1: ( rule__CustomPostType__Group__11__Impl )
            // InternalEntityDsl.g:2026:2: rule__CustomPostType__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomPostType__Group__11__Impl();

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
    // InternalEntityDsl.g:2032:1: rule__CustomPostType__Group__11__Impl : ( '}' ) ;
    public final void rule__CustomPostType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2036:1: ( ( '}' ) )
            // InternalEntityDsl.g:2037:1: ( '}' )
            {
            // InternalEntityDsl.g:2037:1: ( '}' )
            // InternalEntityDsl.g:2038:2: '}'
            {
             before(grammarAccess.getCustomPostTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Setting__Group__0"
    // InternalEntityDsl.g:2048:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2052:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalEntityDsl.g:2053:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
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
    // InternalEntityDsl.g:2060:1: rule__Setting__Group__0__Impl : ( 'Setting' ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2064:1: ( ( 'Setting' ) )
            // InternalEntityDsl.g:2065:1: ( 'Setting' )
            {
            // InternalEntityDsl.g:2065:1: ( 'Setting' )
            // InternalEntityDsl.g:2066:2: 'Setting'
            {
             before(grammarAccess.getSettingAccess().getSettingKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalEntityDsl.g:2075:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2079:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalEntityDsl.g:2080:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalEntityDsl.g:2087:1: rule__Setting__Group__1__Impl : ( '{' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2091:1: ( ( '{' ) )
            // InternalEntityDsl.g:2092:1: ( '{' )
            {
            // InternalEntityDsl.g:2092:1: ( '{' )
            // InternalEntityDsl.g:2093:2: '{'
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
    // InternalEntityDsl.g:2102:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl rule__Setting__Group__3 ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2106:1: ( rule__Setting__Group__2__Impl rule__Setting__Group__3 )
            // InternalEntityDsl.g:2107:2: rule__Setting__Group__2__Impl rule__Setting__Group__3
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
    // InternalEntityDsl.g:2114:1: rule__Setting__Group__2__Impl : ( 'settingName' ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2118:1: ( ( 'settingName' ) )
            // InternalEntityDsl.g:2119:1: ( 'settingName' )
            {
            // InternalEntityDsl.g:2119:1: ( 'settingName' )
            // InternalEntityDsl.g:2120:2: 'settingName'
            {
             before(grammarAccess.getSettingAccess().getSettingNameKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalEntityDsl.g:2129:1: rule__Setting__Group__3 : rule__Setting__Group__3__Impl rule__Setting__Group__4 ;
    public final void rule__Setting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2133:1: ( rule__Setting__Group__3__Impl rule__Setting__Group__4 )
            // InternalEntityDsl.g:2134:2: rule__Setting__Group__3__Impl rule__Setting__Group__4
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
    // InternalEntityDsl.g:2141:1: rule__Setting__Group__3__Impl : ( '=' ) ;
    public final void rule__Setting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2145:1: ( ( '=' ) )
            // InternalEntityDsl.g:2146:1: ( '=' )
            {
            // InternalEntityDsl.g:2146:1: ( '=' )
            // InternalEntityDsl.g:2147:2: '='
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
    // InternalEntityDsl.g:2156:1: rule__Setting__Group__4 : rule__Setting__Group__4__Impl rule__Setting__Group__5 ;
    public final void rule__Setting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2160:1: ( rule__Setting__Group__4__Impl rule__Setting__Group__5 )
            // InternalEntityDsl.g:2161:2: rule__Setting__Group__4__Impl rule__Setting__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalEntityDsl.g:2168:1: rule__Setting__Group__4__Impl : ( ( rule__Setting__SettingNameAssignment_4 ) ) ;
    public final void rule__Setting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2172:1: ( ( ( rule__Setting__SettingNameAssignment_4 ) ) )
            // InternalEntityDsl.g:2173:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:2173:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            // InternalEntityDsl.g:2174:2: ( rule__Setting__SettingNameAssignment_4 )
            {
             before(grammarAccess.getSettingAccess().getSettingNameAssignment_4()); 
            // InternalEntityDsl.g:2175:2: ( rule__Setting__SettingNameAssignment_4 )
            // InternalEntityDsl.g:2175:3: rule__Setting__SettingNameAssignment_4
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
    // InternalEntityDsl.g:2183:1: rule__Setting__Group__5 : rule__Setting__Group__5__Impl rule__Setting__Group__6 ;
    public final void rule__Setting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2187:1: ( rule__Setting__Group__5__Impl rule__Setting__Group__6 )
            // InternalEntityDsl.g:2188:2: rule__Setting__Group__5__Impl rule__Setting__Group__6
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
    // InternalEntityDsl.g:2195:1: rule__Setting__Group__5__Impl : ( 'settingType' ) ;
    public final void rule__Setting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2199:1: ( ( 'settingType' ) )
            // InternalEntityDsl.g:2200:1: ( 'settingType' )
            {
            // InternalEntityDsl.g:2200:1: ( 'settingType' )
            // InternalEntityDsl.g:2201:2: 'settingType'
            {
             before(grammarAccess.getSettingAccess().getSettingTypeKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalEntityDsl.g:2210:1: rule__Setting__Group__6 : rule__Setting__Group__6__Impl rule__Setting__Group__7 ;
    public final void rule__Setting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2214:1: ( rule__Setting__Group__6__Impl rule__Setting__Group__7 )
            // InternalEntityDsl.g:2215:2: rule__Setting__Group__6__Impl rule__Setting__Group__7
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
    // InternalEntityDsl.g:2222:1: rule__Setting__Group__6__Impl : ( '=' ) ;
    public final void rule__Setting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2226:1: ( ( '=' ) )
            // InternalEntityDsl.g:2227:1: ( '=' )
            {
            // InternalEntityDsl.g:2227:1: ( '=' )
            // InternalEntityDsl.g:2228:2: '='
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
    // InternalEntityDsl.g:2237:1: rule__Setting__Group__7 : rule__Setting__Group__7__Impl rule__Setting__Group__8 ;
    public final void rule__Setting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2241:1: ( rule__Setting__Group__7__Impl rule__Setting__Group__8 )
            // InternalEntityDsl.g:2242:2: rule__Setting__Group__7__Impl rule__Setting__Group__8
            {
            pushFollow(FOLLOW_33);
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
    // InternalEntityDsl.g:2249:1: rule__Setting__Group__7__Impl : ( ( rule__Setting__SettingTypeAssignment_7 ) ) ;
    public final void rule__Setting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2253:1: ( ( ( rule__Setting__SettingTypeAssignment_7 ) ) )
            // InternalEntityDsl.g:2254:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            {
            // InternalEntityDsl.g:2254:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            // InternalEntityDsl.g:2255:2: ( rule__Setting__SettingTypeAssignment_7 )
            {
             before(grammarAccess.getSettingAccess().getSettingTypeAssignment_7()); 
            // InternalEntityDsl.g:2256:2: ( rule__Setting__SettingTypeAssignment_7 )
            // InternalEntityDsl.g:2256:3: rule__Setting__SettingTypeAssignment_7
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
    // InternalEntityDsl.g:2264:1: rule__Setting__Group__8 : rule__Setting__Group__8__Impl rule__Setting__Group__9 ;
    public final void rule__Setting__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2268:1: ( rule__Setting__Group__8__Impl rule__Setting__Group__9 )
            // InternalEntityDsl.g:2269:2: rule__Setting__Group__8__Impl rule__Setting__Group__9
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
    // InternalEntityDsl.g:2276:1: rule__Setting__Group__8__Impl : ( 'defaultValue' ) ;
    public final void rule__Setting__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2280:1: ( ( 'defaultValue' ) )
            // InternalEntityDsl.g:2281:1: ( 'defaultValue' )
            {
            // InternalEntityDsl.g:2281:1: ( 'defaultValue' )
            // InternalEntityDsl.g:2282:2: 'defaultValue'
            {
             before(grammarAccess.getSettingAccess().getDefaultValueKeyword_8()); 
            match(input,39,FOLLOW_2); 
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
    // InternalEntityDsl.g:2291:1: rule__Setting__Group__9 : rule__Setting__Group__9__Impl rule__Setting__Group__10 ;
    public final void rule__Setting__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2295:1: ( rule__Setting__Group__9__Impl rule__Setting__Group__10 )
            // InternalEntityDsl.g:2296:2: rule__Setting__Group__9__Impl rule__Setting__Group__10
            {
            pushFollow(FOLLOW_30);
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
    // InternalEntityDsl.g:2303:1: rule__Setting__Group__9__Impl : ( '=' ) ;
    public final void rule__Setting__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2307:1: ( ( '=' ) )
            // InternalEntityDsl.g:2308:1: ( '=' )
            {
            // InternalEntityDsl.g:2308:1: ( '=' )
            // InternalEntityDsl.g:2309:2: '='
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
    // InternalEntityDsl.g:2318:1: rule__Setting__Group__10 : rule__Setting__Group__10__Impl rule__Setting__Group__11 ;
    public final void rule__Setting__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2322:1: ( rule__Setting__Group__10__Impl rule__Setting__Group__11 )
            // InternalEntityDsl.g:2323:2: rule__Setting__Group__10__Impl rule__Setting__Group__11
            {
            pushFollow(FOLLOW_30);
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
    // InternalEntityDsl.g:2330:1: rule__Setting__Group__10__Impl : ( ( rule__Setting__DefaultValueAssignment_10 )? ) ;
    public final void rule__Setting__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2334:1: ( ( ( rule__Setting__DefaultValueAssignment_10 )? ) )
            // InternalEntityDsl.g:2335:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            {
            // InternalEntityDsl.g:2335:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            // InternalEntityDsl.g:2336:2: ( rule__Setting__DefaultValueAssignment_10 )?
            {
             before(grammarAccess.getSettingAccess().getDefaultValueAssignment_10()); 
            // InternalEntityDsl.g:2337:2: ( rule__Setting__DefaultValueAssignment_10 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEntityDsl.g:2337:3: rule__Setting__DefaultValueAssignment_10
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
    // InternalEntityDsl.g:2345:1: rule__Setting__Group__11 : rule__Setting__Group__11__Impl ;
    public final void rule__Setting__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2349:1: ( rule__Setting__Group__11__Impl )
            // InternalEntityDsl.g:2350:2: rule__Setting__Group__11__Impl
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
    // InternalEntityDsl.g:2356:1: rule__Setting__Group__11__Impl : ( '}' ) ;
    public final void rule__Setting__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2360:1: ( ( '}' ) )
            // InternalEntityDsl.g:2361:1: ( '}' )
            {
            // InternalEntityDsl.g:2361:1: ( '}' )
            // InternalEntityDsl.g:2362:2: '}'
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
    // InternalEntityDsl.g:2372:1: rule__Hook__Group__0 : rule__Hook__Group__0__Impl rule__Hook__Group__1 ;
    public final void rule__Hook__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2376:1: ( rule__Hook__Group__0__Impl rule__Hook__Group__1 )
            // InternalEntityDsl.g:2377:2: rule__Hook__Group__0__Impl rule__Hook__Group__1
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
    // InternalEntityDsl.g:2384:1: rule__Hook__Group__0__Impl : ( 'Hook' ) ;
    public final void rule__Hook__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2388:1: ( ( 'Hook' ) )
            // InternalEntityDsl.g:2389:1: ( 'Hook' )
            {
            // InternalEntityDsl.g:2389:1: ( 'Hook' )
            // InternalEntityDsl.g:2390:2: 'Hook'
            {
             before(grammarAccess.getHookAccess().getHookKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalEntityDsl.g:2399:1: rule__Hook__Group__1 : rule__Hook__Group__1__Impl rule__Hook__Group__2 ;
    public final void rule__Hook__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2403:1: ( rule__Hook__Group__1__Impl rule__Hook__Group__2 )
            // InternalEntityDsl.g:2404:2: rule__Hook__Group__1__Impl rule__Hook__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalEntityDsl.g:2411:1: rule__Hook__Group__1__Impl : ( '{' ) ;
    public final void rule__Hook__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2415:1: ( ( '{' ) )
            // InternalEntityDsl.g:2416:1: ( '{' )
            {
            // InternalEntityDsl.g:2416:1: ( '{' )
            // InternalEntityDsl.g:2417:2: '{'
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
    // InternalEntityDsl.g:2426:1: rule__Hook__Group__2 : rule__Hook__Group__2__Impl rule__Hook__Group__3 ;
    public final void rule__Hook__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2430:1: ( rule__Hook__Group__2__Impl rule__Hook__Group__3 )
            // InternalEntityDsl.g:2431:2: rule__Hook__Group__2__Impl rule__Hook__Group__3
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
    // InternalEntityDsl.g:2438:1: rule__Hook__Group__2__Impl : ( 'hookType' ) ;
    public final void rule__Hook__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2442:1: ( ( 'hookType' ) )
            // InternalEntityDsl.g:2443:1: ( 'hookType' )
            {
            // InternalEntityDsl.g:2443:1: ( 'hookType' )
            // InternalEntityDsl.g:2444:2: 'hookType'
            {
             before(grammarAccess.getHookAccess().getHookTypeKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalEntityDsl.g:2453:1: rule__Hook__Group__3 : rule__Hook__Group__3__Impl rule__Hook__Group__4 ;
    public final void rule__Hook__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2457:1: ( rule__Hook__Group__3__Impl rule__Hook__Group__4 )
            // InternalEntityDsl.g:2458:2: rule__Hook__Group__3__Impl rule__Hook__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalEntityDsl.g:2465:1: rule__Hook__Group__3__Impl : ( '=' ) ;
    public final void rule__Hook__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2469:1: ( ( '=' ) )
            // InternalEntityDsl.g:2470:1: ( '=' )
            {
            // InternalEntityDsl.g:2470:1: ( '=' )
            // InternalEntityDsl.g:2471:2: '='
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
    // InternalEntityDsl.g:2480:1: rule__Hook__Group__4 : rule__Hook__Group__4__Impl rule__Hook__Group__5 ;
    public final void rule__Hook__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2484:1: ( rule__Hook__Group__4__Impl rule__Hook__Group__5 )
            // InternalEntityDsl.g:2485:2: rule__Hook__Group__4__Impl rule__Hook__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalEntityDsl.g:2492:1: rule__Hook__Group__4__Impl : ( ( rule__Hook__HookTypeAssignment_4 ) ) ;
    public final void rule__Hook__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2496:1: ( ( ( rule__Hook__HookTypeAssignment_4 ) ) )
            // InternalEntityDsl.g:2497:1: ( ( rule__Hook__HookTypeAssignment_4 ) )
            {
            // InternalEntityDsl.g:2497:1: ( ( rule__Hook__HookTypeAssignment_4 ) )
            // InternalEntityDsl.g:2498:2: ( rule__Hook__HookTypeAssignment_4 )
            {
             before(grammarAccess.getHookAccess().getHookTypeAssignment_4()); 
            // InternalEntityDsl.g:2499:2: ( rule__Hook__HookTypeAssignment_4 )
            // InternalEntityDsl.g:2499:3: rule__Hook__HookTypeAssignment_4
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
    // InternalEntityDsl.g:2507:1: rule__Hook__Group__5 : rule__Hook__Group__5__Impl rule__Hook__Group__6 ;
    public final void rule__Hook__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2511:1: ( rule__Hook__Group__5__Impl rule__Hook__Group__6 )
            // InternalEntityDsl.g:2512:2: rule__Hook__Group__5__Impl rule__Hook__Group__6
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
    // InternalEntityDsl.g:2519:1: rule__Hook__Group__5__Impl : ( 'hookName' ) ;
    public final void rule__Hook__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2523:1: ( ( 'hookName' ) )
            // InternalEntityDsl.g:2524:1: ( 'hookName' )
            {
            // InternalEntityDsl.g:2524:1: ( 'hookName' )
            // InternalEntityDsl.g:2525:2: 'hookName'
            {
             before(grammarAccess.getHookAccess().getHookNameKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalEntityDsl.g:2534:1: rule__Hook__Group__6 : rule__Hook__Group__6__Impl rule__Hook__Group__7 ;
    public final void rule__Hook__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2538:1: ( rule__Hook__Group__6__Impl rule__Hook__Group__7 )
            // InternalEntityDsl.g:2539:2: rule__Hook__Group__6__Impl rule__Hook__Group__7
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
    // InternalEntityDsl.g:2546:1: rule__Hook__Group__6__Impl : ( '=' ) ;
    public final void rule__Hook__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2550:1: ( ( '=' ) )
            // InternalEntityDsl.g:2551:1: ( '=' )
            {
            // InternalEntityDsl.g:2551:1: ( '=' )
            // InternalEntityDsl.g:2552:2: '='
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
    // InternalEntityDsl.g:2561:1: rule__Hook__Group__7 : rule__Hook__Group__7__Impl rule__Hook__Group__8 ;
    public final void rule__Hook__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2565:1: ( rule__Hook__Group__7__Impl rule__Hook__Group__8 )
            // InternalEntityDsl.g:2566:2: rule__Hook__Group__7__Impl rule__Hook__Group__8
            {
            pushFollow(FOLLOW_37);
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
    // InternalEntityDsl.g:2573:1: rule__Hook__Group__7__Impl : ( ( rule__Hook__HookNameAssignment_7 ) ) ;
    public final void rule__Hook__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2577:1: ( ( ( rule__Hook__HookNameAssignment_7 ) ) )
            // InternalEntityDsl.g:2578:1: ( ( rule__Hook__HookNameAssignment_7 ) )
            {
            // InternalEntityDsl.g:2578:1: ( ( rule__Hook__HookNameAssignment_7 ) )
            // InternalEntityDsl.g:2579:2: ( rule__Hook__HookNameAssignment_7 )
            {
             before(grammarAccess.getHookAccess().getHookNameAssignment_7()); 
            // InternalEntityDsl.g:2580:2: ( rule__Hook__HookNameAssignment_7 )
            // InternalEntityDsl.g:2580:3: rule__Hook__HookNameAssignment_7
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
    // InternalEntityDsl.g:2588:1: rule__Hook__Group__8 : rule__Hook__Group__8__Impl rule__Hook__Group__9 ;
    public final void rule__Hook__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2592:1: ( rule__Hook__Group__8__Impl rule__Hook__Group__9 )
            // InternalEntityDsl.g:2593:2: rule__Hook__Group__8__Impl rule__Hook__Group__9
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
    // InternalEntityDsl.g:2600:1: rule__Hook__Group__8__Impl : ( 'callback' ) ;
    public final void rule__Hook__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2604:1: ( ( 'callback' ) )
            // InternalEntityDsl.g:2605:1: ( 'callback' )
            {
            // InternalEntityDsl.g:2605:1: ( 'callback' )
            // InternalEntityDsl.g:2606:2: 'callback'
            {
             before(grammarAccess.getHookAccess().getCallbackKeyword_8()); 
            match(input,43,FOLLOW_2); 
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
    // InternalEntityDsl.g:2615:1: rule__Hook__Group__9 : rule__Hook__Group__9__Impl rule__Hook__Group__10 ;
    public final void rule__Hook__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2619:1: ( rule__Hook__Group__9__Impl rule__Hook__Group__10 )
            // InternalEntityDsl.g:2620:2: rule__Hook__Group__9__Impl rule__Hook__Group__10
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
    // InternalEntityDsl.g:2627:1: rule__Hook__Group__9__Impl : ( '=' ) ;
    public final void rule__Hook__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2631:1: ( ( '=' ) )
            // InternalEntityDsl.g:2632:1: ( '=' )
            {
            // InternalEntityDsl.g:2632:1: ( '=' )
            // InternalEntityDsl.g:2633:2: '='
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
    // InternalEntityDsl.g:2642:1: rule__Hook__Group__10 : rule__Hook__Group__10__Impl rule__Hook__Group__11 ;
    public final void rule__Hook__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2646:1: ( rule__Hook__Group__10__Impl rule__Hook__Group__11 )
            // InternalEntityDsl.g:2647:2: rule__Hook__Group__10__Impl rule__Hook__Group__11
            {
            pushFollow(FOLLOW_38);
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
    // InternalEntityDsl.g:2654:1: rule__Hook__Group__10__Impl : ( ( rule__Hook__CallbackAssignment_10 ) ) ;
    public final void rule__Hook__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2658:1: ( ( ( rule__Hook__CallbackAssignment_10 ) ) )
            // InternalEntityDsl.g:2659:1: ( ( rule__Hook__CallbackAssignment_10 ) )
            {
            // InternalEntityDsl.g:2659:1: ( ( rule__Hook__CallbackAssignment_10 ) )
            // InternalEntityDsl.g:2660:2: ( rule__Hook__CallbackAssignment_10 )
            {
             before(grammarAccess.getHookAccess().getCallbackAssignment_10()); 
            // InternalEntityDsl.g:2661:2: ( rule__Hook__CallbackAssignment_10 )
            // InternalEntityDsl.g:2661:3: rule__Hook__CallbackAssignment_10
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
    // InternalEntityDsl.g:2669:1: rule__Hook__Group__11 : rule__Hook__Group__11__Impl rule__Hook__Group__12 ;
    public final void rule__Hook__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2673:1: ( rule__Hook__Group__11__Impl rule__Hook__Group__12 )
            // InternalEntityDsl.g:2674:2: rule__Hook__Group__11__Impl rule__Hook__Group__12
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
    // InternalEntityDsl.g:2681:1: rule__Hook__Group__11__Impl : ( 'priority' ) ;
    public final void rule__Hook__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2685:1: ( ( 'priority' ) )
            // InternalEntityDsl.g:2686:1: ( 'priority' )
            {
            // InternalEntityDsl.g:2686:1: ( 'priority' )
            // InternalEntityDsl.g:2687:2: 'priority'
            {
             before(grammarAccess.getHookAccess().getPriorityKeyword_11()); 
            match(input,44,FOLLOW_2); 
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
    // InternalEntityDsl.g:2696:1: rule__Hook__Group__12 : rule__Hook__Group__12__Impl rule__Hook__Group__13 ;
    public final void rule__Hook__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2700:1: ( rule__Hook__Group__12__Impl rule__Hook__Group__13 )
            // InternalEntityDsl.g:2701:2: rule__Hook__Group__12__Impl rule__Hook__Group__13
            {
            pushFollow(FOLLOW_39);
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
    // InternalEntityDsl.g:2708:1: rule__Hook__Group__12__Impl : ( '=' ) ;
    public final void rule__Hook__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2712:1: ( ( '=' ) )
            // InternalEntityDsl.g:2713:1: ( '=' )
            {
            // InternalEntityDsl.g:2713:1: ( '=' )
            // InternalEntityDsl.g:2714:2: '='
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
    // InternalEntityDsl.g:2723:1: rule__Hook__Group__13 : rule__Hook__Group__13__Impl rule__Hook__Group__14 ;
    public final void rule__Hook__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2727:1: ( rule__Hook__Group__13__Impl rule__Hook__Group__14 )
            // InternalEntityDsl.g:2728:2: rule__Hook__Group__13__Impl rule__Hook__Group__14
            {
            pushFollow(FOLLOW_39);
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
    // InternalEntityDsl.g:2735:1: rule__Hook__Group__13__Impl : ( ( rule__Hook__PriorityAssignment_13 )? ) ;
    public final void rule__Hook__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2739:1: ( ( ( rule__Hook__PriorityAssignment_13 )? ) )
            // InternalEntityDsl.g:2740:1: ( ( rule__Hook__PriorityAssignment_13 )? )
            {
            // InternalEntityDsl.g:2740:1: ( ( rule__Hook__PriorityAssignment_13 )? )
            // InternalEntityDsl.g:2741:2: ( rule__Hook__PriorityAssignment_13 )?
            {
             before(grammarAccess.getHookAccess().getPriorityAssignment_13()); 
            // InternalEntityDsl.g:2742:2: ( rule__Hook__PriorityAssignment_13 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEntityDsl.g:2742:3: rule__Hook__PriorityAssignment_13
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
    // InternalEntityDsl.g:2750:1: rule__Hook__Group__14 : rule__Hook__Group__14__Impl rule__Hook__Group__15 ;
    public final void rule__Hook__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2754:1: ( rule__Hook__Group__14__Impl rule__Hook__Group__15 )
            // InternalEntityDsl.g:2755:2: rule__Hook__Group__14__Impl rule__Hook__Group__15
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
    // InternalEntityDsl.g:2762:1: rule__Hook__Group__14__Impl : ( 'acceptedArgs' ) ;
    public final void rule__Hook__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2766:1: ( ( 'acceptedArgs' ) )
            // InternalEntityDsl.g:2767:1: ( 'acceptedArgs' )
            {
            // InternalEntityDsl.g:2767:1: ( 'acceptedArgs' )
            // InternalEntityDsl.g:2768:2: 'acceptedArgs'
            {
             before(grammarAccess.getHookAccess().getAcceptedArgsKeyword_14()); 
            match(input,45,FOLLOW_2); 
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
    // InternalEntityDsl.g:2777:1: rule__Hook__Group__15 : rule__Hook__Group__15__Impl rule__Hook__Group__16 ;
    public final void rule__Hook__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2781:1: ( rule__Hook__Group__15__Impl rule__Hook__Group__16 )
            // InternalEntityDsl.g:2782:2: rule__Hook__Group__15__Impl rule__Hook__Group__16
            {
            pushFollow(FOLLOW_40);
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
    // InternalEntityDsl.g:2789:1: rule__Hook__Group__15__Impl : ( '=' ) ;
    public final void rule__Hook__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2793:1: ( ( '=' ) )
            // InternalEntityDsl.g:2794:1: ( '=' )
            {
            // InternalEntityDsl.g:2794:1: ( '=' )
            // InternalEntityDsl.g:2795:2: '='
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
    // InternalEntityDsl.g:2804:1: rule__Hook__Group__16 : rule__Hook__Group__16__Impl rule__Hook__Group__17 ;
    public final void rule__Hook__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2808:1: ( rule__Hook__Group__16__Impl rule__Hook__Group__17 )
            // InternalEntityDsl.g:2809:2: rule__Hook__Group__16__Impl rule__Hook__Group__17
            {
            pushFollow(FOLLOW_40);
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
    // InternalEntityDsl.g:2816:1: rule__Hook__Group__16__Impl : ( ( rule__Hook__AcceptedArgsAssignment_16 )? ) ;
    public final void rule__Hook__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2820:1: ( ( ( rule__Hook__AcceptedArgsAssignment_16 )? ) )
            // InternalEntityDsl.g:2821:1: ( ( rule__Hook__AcceptedArgsAssignment_16 )? )
            {
            // InternalEntityDsl.g:2821:1: ( ( rule__Hook__AcceptedArgsAssignment_16 )? )
            // InternalEntityDsl.g:2822:2: ( rule__Hook__AcceptedArgsAssignment_16 )?
            {
             before(grammarAccess.getHookAccess().getAcceptedArgsAssignment_16()); 
            // InternalEntityDsl.g:2823:2: ( rule__Hook__AcceptedArgsAssignment_16 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEntityDsl.g:2823:3: rule__Hook__AcceptedArgsAssignment_16
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
    // InternalEntityDsl.g:2831:1: rule__Hook__Group__17 : rule__Hook__Group__17__Impl ;
    public final void rule__Hook__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2835:1: ( rule__Hook__Group__17__Impl )
            // InternalEntityDsl.g:2836:2: rule__Hook__Group__17__Impl
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
    // InternalEntityDsl.g:2842:1: rule__Hook__Group__17__Impl : ( '}' ) ;
    public final void rule__Hook__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2846:1: ( ( '}' ) )
            // InternalEntityDsl.g:2847:1: ( '}' )
            {
            // InternalEntityDsl.g:2847:1: ( '}' )
            // InternalEntityDsl.g:2848:2: '}'
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


    // $ANTLR start "rule__Plugin__NameAssignment_4"
    // InternalEntityDsl.g:2858:1: rule__Plugin__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Plugin__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2862:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2863:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2863:2: ( RULE_STRING )
            // InternalEntityDsl.g:2864:3: RULE_STRING
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
    // InternalEntityDsl.g:2873:1: rule__Plugin__VersionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Plugin__VersionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2877:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2878:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2878:2: ( RULE_STRING )
            // InternalEntityDsl.g:2879:3: RULE_STRING
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
    // InternalEntityDsl.g:2888:1: rule__Plugin__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Plugin__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2892:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2893:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2893:2: ( RULE_STRING )
            // InternalEntityDsl.g:2894:3: RULE_STRING
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
    // InternalEntityDsl.g:2903:1: rule__Plugin__AuthorAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Plugin__AuthorAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2907:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2908:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2908:2: ( RULE_STRING )
            // InternalEntityDsl.g:2909:3: RULE_STRING
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
    // InternalEntityDsl.g:2918:1: rule__Plugin__LicenseAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Plugin__LicenseAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2922:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2923:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2923:2: ( RULE_STRING )
            // InternalEntityDsl.g:2924:3: RULE_STRING
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
    // InternalEntityDsl.g:2933:1: rule__Plugin__PrefixAssignment_19 : ( RULE_STRING ) ;
    public final void rule__Plugin__PrefixAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2937:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2938:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2938:2: ( RULE_STRING )
            // InternalEntityDsl.g:2939:3: RULE_STRING
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
    // InternalEntityDsl.g:2948:1: rule__Plugin__TextDomainAssignment_22 : ( RULE_STRING ) ;
    public final void rule__Plugin__TextDomainAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2952:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2953:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2953:2: ( RULE_STRING )
            // InternalEntityDsl.g:2954:3: RULE_STRING
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
    // InternalEntityDsl.g:2963:1: rule__Plugin__ActivateAssignment_25 : ( RULE_STRING ) ;
    public final void rule__Plugin__ActivateAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2967:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2968:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2968:2: ( RULE_STRING )
            // InternalEntityDsl.g:2969:3: RULE_STRING
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
    // InternalEntityDsl.g:2978:1: rule__Plugin__DeactivateAssignment_28 : ( RULE_STRING ) ;
    public final void rule__Plugin__DeactivateAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2982:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2983:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2983:2: ( RULE_STRING )
            // InternalEntityDsl.g:2984:3: RULE_STRING
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
    // InternalEntityDsl.g:2993:1: rule__Plugin__UninstallAssignment_31 : ( RULE_STRING ) ;
    public final void rule__Plugin__UninstallAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2997:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2998:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2998:2: ( RULE_STRING )
            // InternalEntityDsl.g:2999:3: RULE_STRING
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
    // InternalEntityDsl.g:3008:1: rule__Plugin__WidgetsAssignment_32 : ( ruleWidget ) ;
    public final void rule__Plugin__WidgetsAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3012:1: ( ( ruleWidget ) )
            // InternalEntityDsl.g:3013:2: ( ruleWidget )
            {
            // InternalEntityDsl.g:3013:2: ( ruleWidget )
            // InternalEntityDsl.g:3014:3: ruleWidget
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
    // InternalEntityDsl.g:3023:1: rule__Plugin__ShortcodesAssignment_33 : ( ruleShortcode ) ;
    public final void rule__Plugin__ShortcodesAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3027:1: ( ( ruleShortcode ) )
            // InternalEntityDsl.g:3028:2: ( ruleShortcode )
            {
            // InternalEntityDsl.g:3028:2: ( ruleShortcode )
            // InternalEntityDsl.g:3029:3: ruleShortcode
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
    // InternalEntityDsl.g:3038:1: rule__Plugin__CustomPostTypesAssignment_34 : ( ruleCustomPostType ) ;
    public final void rule__Plugin__CustomPostTypesAssignment_34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3042:1: ( ( ruleCustomPostType ) )
            // InternalEntityDsl.g:3043:2: ( ruleCustomPostType )
            {
            // InternalEntityDsl.g:3043:2: ( ruleCustomPostType )
            // InternalEntityDsl.g:3044:3: ruleCustomPostType
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
    // InternalEntityDsl.g:3053:1: rule__Plugin__SettingsAssignment_35 : ( ruleSetting ) ;
    public final void rule__Plugin__SettingsAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3057:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3058:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3058:2: ( ruleSetting )
            // InternalEntityDsl.g:3059:3: ruleSetting
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
    // InternalEntityDsl.g:3068:1: rule__Plugin__HooksAssignment_36 : ( ruleHook ) ;
    public final void rule__Plugin__HooksAssignment_36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3072:1: ( ( ruleHook ) )
            // InternalEntityDsl.g:3073:2: ( ruleHook )
            {
            // InternalEntityDsl.g:3073:2: ( ruleHook )
            // InternalEntityDsl.g:3074:3: ruleHook
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
    // InternalEntityDsl.g:3083:1: rule__Widget__WidgetNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3087:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3088:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3088:2: ( RULE_STRING )
            // InternalEntityDsl.g:3089:3: RULE_STRING
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
    // InternalEntityDsl.g:3098:1: rule__Widget__WidgetDescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetDescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3102:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3103:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3103:2: ( RULE_STRING )
            // InternalEntityDsl.g:3104:3: RULE_STRING
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
    // InternalEntityDsl.g:3113:1: rule__Widget__SettingsAssignment_8 : ( ruleSetting ) ;
    public final void rule__Widget__SettingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3117:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3118:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3118:2: ( ruleSetting )
            // InternalEntityDsl.g:3119:3: ruleSetting
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
    // InternalEntityDsl.g:3128:1: rule__Shortcode__ShortcodeNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Shortcode__ShortcodeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3132:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3133:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3133:2: ( RULE_STRING )
            // InternalEntityDsl.g:3134:3: RULE_STRING
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
    // InternalEntityDsl.g:3143:1: rule__Shortcode__SettingsAssignment_5 : ( ruleSetting ) ;
    public final void rule__Shortcode__SettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3147:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:3148:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:3148:2: ( ruleSetting )
            // InternalEntityDsl.g:3149:3: ruleSetting
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


    // $ANTLR start "rule__CustomPostType__PostTypeNameAssignment_4"
    // InternalEntityDsl.g:3158:1: rule__CustomPostType__PostTypeNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__PostTypeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3162:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3163:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3163:2: ( RULE_STRING )
            // InternalEntityDsl.g:3164:3: RULE_STRING
            {
             before(grammarAccess.getCustomPostTypeAccess().getPostTypeNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getPostTypeNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__PostTypeNameAssignment_4"


    // $ANTLR start "rule__CustomPostType__SupportsAssignment_7"
    // InternalEntityDsl.g:3173:1: rule__CustomPostType__SupportsAssignment_7 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__SupportsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3177:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3178:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3178:2: ( RULE_STRING )
            // InternalEntityDsl.g:3179:3: RULE_STRING
            {
             before(grammarAccess.getCustomPostTypeAccess().getSupportsSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getSupportsSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__SupportsAssignment_7"


    // $ANTLR start "rule__CustomPostType__TaxonomiesAssignment_10"
    // InternalEntityDsl.g:3188:1: rule__CustomPostType__TaxonomiesAssignment_10 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__TaxonomiesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3192:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3193:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3193:2: ( RULE_STRING )
            // InternalEntityDsl.g:3194:3: RULE_STRING
            {
             before(grammarAccess.getCustomPostTypeAccess().getTaxonomiesSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getTaxonomiesSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__TaxonomiesAssignment_10"


    // $ANTLR start "rule__Setting__SettingNameAssignment_4"
    // InternalEntityDsl.g:3203:1: rule__Setting__SettingNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3207:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3208:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3208:2: ( RULE_STRING )
            // InternalEntityDsl.g:3209:3: RULE_STRING
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
    // InternalEntityDsl.g:3218:1: rule__Setting__SettingTypeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3222:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3223:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3223:2: ( RULE_STRING )
            // InternalEntityDsl.g:3224:3: RULE_STRING
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
    // InternalEntityDsl.g:3233:1: rule__Setting__DefaultValueAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Setting__DefaultValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3237:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3238:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3238:2: ( RULE_STRING )
            // InternalEntityDsl.g:3239:3: RULE_STRING
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
    // InternalEntityDsl.g:3248:1: rule__Hook__HookTypeAssignment_4 : ( ruleHookType ) ;
    public final void rule__Hook__HookTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3252:1: ( ( ruleHookType ) )
            // InternalEntityDsl.g:3253:2: ( ruleHookType )
            {
            // InternalEntityDsl.g:3253:2: ( ruleHookType )
            // InternalEntityDsl.g:3254:3: ruleHookType
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
    // InternalEntityDsl.g:3263:1: rule__Hook__HookNameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Hook__HookNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3267:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3268:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3268:2: ( RULE_STRING )
            // InternalEntityDsl.g:3269:3: RULE_STRING
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
    // InternalEntityDsl.g:3278:1: rule__Hook__CallbackAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Hook__CallbackAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3282:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3283:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3283:2: ( RULE_STRING )
            // InternalEntityDsl.g:3284:3: RULE_STRING
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
    // InternalEntityDsl.g:3293:1: rule__Hook__PriorityAssignment_13 : ( RULE_INT ) ;
    public final void rule__Hook__PriorityAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3297:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:3298:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:3298:2: ( RULE_INT )
            // InternalEntityDsl.g:3299:3: RULE_INT
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
    // InternalEntityDsl.g:3308:1: rule__Hook__AcceptedArgsAssignment_16 : ( RULE_INT ) ;
    public final void rule__Hook__AcceptedArgsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3312:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:3313:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:3313:2: ( RULE_INT )
            // InternalEntityDsl.g:3314:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000001114C000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001004000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000004000020L});

}