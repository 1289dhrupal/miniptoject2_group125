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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Plugin'", "'{'", "'name'", "'='", "'version'", "'description'", "'author'", "'license'", "'prefix'", "'textDomain'", "'activate'", "'deactivate'", "'}'", "'Widget'", "'widgetName'", "'widgetDescription'", "'Setting'", "'settingName'", "'settingType'", "'defaultValue'", "'Shortcode'", "'shortcodeName'", "'addShortcode()'", "'executeShortcode()'", "'CustomPostType'", "'postTypeName'", "'supports'", "'taxonomies'", "'registerPostType()'", "'configurePostType()'", "'Hook'", "'hookName'", "'callbackFunction'", "'addAction()'", "'addFilter()'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


    // $ANTLR start "entryRuleSetting"
    // InternalEntityDsl.g:103:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalEntityDsl.g:104:1: ( ruleSetting EOF )
            // InternalEntityDsl.g:105:1: ruleSetting EOF
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
    // InternalEntityDsl.g:112:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:116:2: ( ( ( rule__Setting__Group__0 ) ) )
            // InternalEntityDsl.g:117:2: ( ( rule__Setting__Group__0 ) )
            {
            // InternalEntityDsl.g:117:2: ( ( rule__Setting__Group__0 ) )
            // InternalEntityDsl.g:118:3: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // InternalEntityDsl.g:119:3: ( rule__Setting__Group__0 )
            // InternalEntityDsl.g:119:4: rule__Setting__Group__0
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


    // $ANTLR start "entryRuleShortcode"
    // InternalEntityDsl.g:128:1: entryRuleShortcode : ruleShortcode EOF ;
    public final void entryRuleShortcode() throws RecognitionException {
        try {
            // InternalEntityDsl.g:129:1: ( ruleShortcode EOF )
            // InternalEntityDsl.g:130:1: ruleShortcode EOF
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
    // InternalEntityDsl.g:137:1: ruleShortcode : ( ( rule__Shortcode__Group__0 ) ) ;
    public final void ruleShortcode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:141:2: ( ( ( rule__Shortcode__Group__0 ) ) )
            // InternalEntityDsl.g:142:2: ( ( rule__Shortcode__Group__0 ) )
            {
            // InternalEntityDsl.g:142:2: ( ( rule__Shortcode__Group__0 ) )
            // InternalEntityDsl.g:143:3: ( rule__Shortcode__Group__0 )
            {
             before(grammarAccess.getShortcodeAccess().getGroup()); 
            // InternalEntityDsl.g:144:3: ( rule__Shortcode__Group__0 )
            // InternalEntityDsl.g:144:4: rule__Shortcode__Group__0
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
    // InternalEntityDsl.g:153:1: entryRuleCustomPostType : ruleCustomPostType EOF ;
    public final void entryRuleCustomPostType() throws RecognitionException {
        try {
            // InternalEntityDsl.g:154:1: ( ruleCustomPostType EOF )
            // InternalEntityDsl.g:155:1: ruleCustomPostType EOF
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
    // InternalEntityDsl.g:162:1: ruleCustomPostType : ( ( rule__CustomPostType__Group__0 ) ) ;
    public final void ruleCustomPostType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:166:2: ( ( ( rule__CustomPostType__Group__0 ) ) )
            // InternalEntityDsl.g:167:2: ( ( rule__CustomPostType__Group__0 ) )
            {
            // InternalEntityDsl.g:167:2: ( ( rule__CustomPostType__Group__0 ) )
            // InternalEntityDsl.g:168:3: ( rule__CustomPostType__Group__0 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getGroup()); 
            // InternalEntityDsl.g:169:3: ( rule__CustomPostType__Group__0 )
            // InternalEntityDsl.g:169:4: rule__CustomPostType__Group__0
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


    // $ANTLR start "rule__Plugin__Group__0"
    // InternalEntityDsl.g:202:1: rule__Plugin__Group__0 : rule__Plugin__Group__0__Impl rule__Plugin__Group__1 ;
    public final void rule__Plugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:206:1: ( rule__Plugin__Group__0__Impl rule__Plugin__Group__1 )
            // InternalEntityDsl.g:207:2: rule__Plugin__Group__0__Impl rule__Plugin__Group__1
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
    // InternalEntityDsl.g:214:1: rule__Plugin__Group__0__Impl : ( 'Plugin' ) ;
    public final void rule__Plugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:218:1: ( ( 'Plugin' ) )
            // InternalEntityDsl.g:219:1: ( 'Plugin' )
            {
            // InternalEntityDsl.g:219:1: ( 'Plugin' )
            // InternalEntityDsl.g:220:2: 'Plugin'
            {
             before(grammarAccess.getPluginAccess().getPluginKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalEntityDsl.g:229:1: rule__Plugin__Group__1 : rule__Plugin__Group__1__Impl rule__Plugin__Group__2 ;
    public final void rule__Plugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:233:1: ( rule__Plugin__Group__1__Impl rule__Plugin__Group__2 )
            // InternalEntityDsl.g:234:2: rule__Plugin__Group__1__Impl rule__Plugin__Group__2
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
    // InternalEntityDsl.g:241:1: rule__Plugin__Group__1__Impl : ( '{' ) ;
    public final void rule__Plugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:245:1: ( ( '{' ) )
            // InternalEntityDsl.g:246:1: ( '{' )
            {
            // InternalEntityDsl.g:246:1: ( '{' )
            // InternalEntityDsl.g:247:2: '{'
            {
             before(grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEntityDsl.g:256:1: rule__Plugin__Group__2 : rule__Plugin__Group__2__Impl rule__Plugin__Group__3 ;
    public final void rule__Plugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:260:1: ( rule__Plugin__Group__2__Impl rule__Plugin__Group__3 )
            // InternalEntityDsl.g:261:2: rule__Plugin__Group__2__Impl rule__Plugin__Group__3
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
    // InternalEntityDsl.g:268:1: rule__Plugin__Group__2__Impl : ( 'name' ) ;
    public final void rule__Plugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:272:1: ( ( 'name' ) )
            // InternalEntityDsl.g:273:1: ( 'name' )
            {
            // InternalEntityDsl.g:273:1: ( 'name' )
            // InternalEntityDsl.g:274:2: 'name'
            {
             before(grammarAccess.getPluginAccess().getNameKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEntityDsl.g:283:1: rule__Plugin__Group__3 : rule__Plugin__Group__3__Impl rule__Plugin__Group__4 ;
    public final void rule__Plugin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:287:1: ( rule__Plugin__Group__3__Impl rule__Plugin__Group__4 )
            // InternalEntityDsl.g:288:2: rule__Plugin__Group__3__Impl rule__Plugin__Group__4
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
    // InternalEntityDsl.g:295:1: rule__Plugin__Group__3__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:299:1: ( ( '=' ) )
            // InternalEntityDsl.g:300:1: ( '=' )
            {
            // InternalEntityDsl.g:300:1: ( '=' )
            // InternalEntityDsl.g:301:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:310:1: rule__Plugin__Group__4 : rule__Plugin__Group__4__Impl rule__Plugin__Group__5 ;
    public final void rule__Plugin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:314:1: ( rule__Plugin__Group__4__Impl rule__Plugin__Group__5 )
            // InternalEntityDsl.g:315:2: rule__Plugin__Group__4__Impl rule__Plugin__Group__5
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
    // InternalEntityDsl.g:322:1: rule__Plugin__Group__4__Impl : ( ( rule__Plugin__NameAssignment_4 ) ) ;
    public final void rule__Plugin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:326:1: ( ( ( rule__Plugin__NameAssignment_4 ) ) )
            // InternalEntityDsl.g:327:1: ( ( rule__Plugin__NameAssignment_4 ) )
            {
            // InternalEntityDsl.g:327:1: ( ( rule__Plugin__NameAssignment_4 ) )
            // InternalEntityDsl.g:328:2: ( rule__Plugin__NameAssignment_4 )
            {
             before(grammarAccess.getPluginAccess().getNameAssignment_4()); 
            // InternalEntityDsl.g:329:2: ( rule__Plugin__NameAssignment_4 )
            // InternalEntityDsl.g:329:3: rule__Plugin__NameAssignment_4
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
    // InternalEntityDsl.g:337:1: rule__Plugin__Group__5 : rule__Plugin__Group__5__Impl rule__Plugin__Group__6 ;
    public final void rule__Plugin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:341:1: ( rule__Plugin__Group__5__Impl rule__Plugin__Group__6 )
            // InternalEntityDsl.g:342:2: rule__Plugin__Group__5__Impl rule__Plugin__Group__6
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
    // InternalEntityDsl.g:349:1: rule__Plugin__Group__5__Impl : ( 'version' ) ;
    public final void rule__Plugin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:353:1: ( ( 'version' ) )
            // InternalEntityDsl.g:354:1: ( 'version' )
            {
            // InternalEntityDsl.g:354:1: ( 'version' )
            // InternalEntityDsl.g:355:2: 'version'
            {
             before(grammarAccess.getPluginAccess().getVersionKeyword_5()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEntityDsl.g:364:1: rule__Plugin__Group__6 : rule__Plugin__Group__6__Impl rule__Plugin__Group__7 ;
    public final void rule__Plugin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:368:1: ( rule__Plugin__Group__6__Impl rule__Plugin__Group__7 )
            // InternalEntityDsl.g:369:2: rule__Plugin__Group__6__Impl rule__Plugin__Group__7
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
    // InternalEntityDsl.g:376:1: rule__Plugin__Group__6__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:380:1: ( ( '=' ) )
            // InternalEntityDsl.g:381:1: ( '=' )
            {
            // InternalEntityDsl.g:381:1: ( '=' )
            // InternalEntityDsl.g:382:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:391:1: rule__Plugin__Group__7 : rule__Plugin__Group__7__Impl rule__Plugin__Group__8 ;
    public final void rule__Plugin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:395:1: ( rule__Plugin__Group__7__Impl rule__Plugin__Group__8 )
            // InternalEntityDsl.g:396:2: rule__Plugin__Group__7__Impl rule__Plugin__Group__8
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
    // InternalEntityDsl.g:403:1: rule__Plugin__Group__7__Impl : ( ( rule__Plugin__VersionAssignment_7 ) ) ;
    public final void rule__Plugin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:407:1: ( ( ( rule__Plugin__VersionAssignment_7 ) ) )
            // InternalEntityDsl.g:408:1: ( ( rule__Plugin__VersionAssignment_7 ) )
            {
            // InternalEntityDsl.g:408:1: ( ( rule__Plugin__VersionAssignment_7 ) )
            // InternalEntityDsl.g:409:2: ( rule__Plugin__VersionAssignment_7 )
            {
             before(grammarAccess.getPluginAccess().getVersionAssignment_7()); 
            // InternalEntityDsl.g:410:2: ( rule__Plugin__VersionAssignment_7 )
            // InternalEntityDsl.g:410:3: rule__Plugin__VersionAssignment_7
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
    // InternalEntityDsl.g:418:1: rule__Plugin__Group__8 : rule__Plugin__Group__8__Impl rule__Plugin__Group__9 ;
    public final void rule__Plugin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:422:1: ( rule__Plugin__Group__8__Impl rule__Plugin__Group__9 )
            // InternalEntityDsl.g:423:2: rule__Plugin__Group__8__Impl rule__Plugin__Group__9
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
    // InternalEntityDsl.g:430:1: rule__Plugin__Group__8__Impl : ( 'description' ) ;
    public final void rule__Plugin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:434:1: ( ( 'description' ) )
            // InternalEntityDsl.g:435:1: ( 'description' )
            {
            // InternalEntityDsl.g:435:1: ( 'description' )
            // InternalEntityDsl.g:436:2: 'description'
            {
             before(grammarAccess.getPluginAccess().getDescriptionKeyword_8()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEntityDsl.g:445:1: rule__Plugin__Group__9 : rule__Plugin__Group__9__Impl rule__Plugin__Group__10 ;
    public final void rule__Plugin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:449:1: ( rule__Plugin__Group__9__Impl rule__Plugin__Group__10 )
            // InternalEntityDsl.g:450:2: rule__Plugin__Group__9__Impl rule__Plugin__Group__10
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
    // InternalEntityDsl.g:457:1: rule__Plugin__Group__9__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:461:1: ( ( '=' ) )
            // InternalEntityDsl.g:462:1: ( '=' )
            {
            // InternalEntityDsl.g:462:1: ( '=' )
            // InternalEntityDsl.g:463:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_9()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:472:1: rule__Plugin__Group__10 : rule__Plugin__Group__10__Impl rule__Plugin__Group__11 ;
    public final void rule__Plugin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:476:1: ( rule__Plugin__Group__10__Impl rule__Plugin__Group__11 )
            // InternalEntityDsl.g:477:2: rule__Plugin__Group__10__Impl rule__Plugin__Group__11
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
    // InternalEntityDsl.g:484:1: rule__Plugin__Group__10__Impl : ( ( rule__Plugin__DescriptionAssignment_10 )? ) ;
    public final void rule__Plugin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:488:1: ( ( ( rule__Plugin__DescriptionAssignment_10 )? ) )
            // InternalEntityDsl.g:489:1: ( ( rule__Plugin__DescriptionAssignment_10 )? )
            {
            // InternalEntityDsl.g:489:1: ( ( rule__Plugin__DescriptionAssignment_10 )? )
            // InternalEntityDsl.g:490:2: ( rule__Plugin__DescriptionAssignment_10 )?
            {
             before(grammarAccess.getPluginAccess().getDescriptionAssignment_10()); 
            // InternalEntityDsl.g:491:2: ( rule__Plugin__DescriptionAssignment_10 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEntityDsl.g:491:3: rule__Plugin__DescriptionAssignment_10
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
    // InternalEntityDsl.g:499:1: rule__Plugin__Group__11 : rule__Plugin__Group__11__Impl rule__Plugin__Group__12 ;
    public final void rule__Plugin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:503:1: ( rule__Plugin__Group__11__Impl rule__Plugin__Group__12 )
            // InternalEntityDsl.g:504:2: rule__Plugin__Group__11__Impl rule__Plugin__Group__12
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
    // InternalEntityDsl.g:511:1: rule__Plugin__Group__11__Impl : ( 'author' ) ;
    public final void rule__Plugin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:515:1: ( ( 'author' ) )
            // InternalEntityDsl.g:516:1: ( 'author' )
            {
            // InternalEntityDsl.g:516:1: ( 'author' )
            // InternalEntityDsl.g:517:2: 'author'
            {
             before(grammarAccess.getPluginAccess().getAuthorKeyword_11()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEntityDsl.g:526:1: rule__Plugin__Group__12 : rule__Plugin__Group__12__Impl rule__Plugin__Group__13 ;
    public final void rule__Plugin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:530:1: ( rule__Plugin__Group__12__Impl rule__Plugin__Group__13 )
            // InternalEntityDsl.g:531:2: rule__Plugin__Group__12__Impl rule__Plugin__Group__13
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
    // InternalEntityDsl.g:538:1: rule__Plugin__Group__12__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:542:1: ( ( '=' ) )
            // InternalEntityDsl.g:543:1: ( '=' )
            {
            // InternalEntityDsl.g:543:1: ( '=' )
            // InternalEntityDsl.g:544:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_12()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:553:1: rule__Plugin__Group__13 : rule__Plugin__Group__13__Impl rule__Plugin__Group__14 ;
    public final void rule__Plugin__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:557:1: ( rule__Plugin__Group__13__Impl rule__Plugin__Group__14 )
            // InternalEntityDsl.g:558:2: rule__Plugin__Group__13__Impl rule__Plugin__Group__14
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
    // InternalEntityDsl.g:565:1: rule__Plugin__Group__13__Impl : ( ( rule__Plugin__AuthorAssignment_13 )? ) ;
    public final void rule__Plugin__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:569:1: ( ( ( rule__Plugin__AuthorAssignment_13 )? ) )
            // InternalEntityDsl.g:570:1: ( ( rule__Plugin__AuthorAssignment_13 )? )
            {
            // InternalEntityDsl.g:570:1: ( ( rule__Plugin__AuthorAssignment_13 )? )
            // InternalEntityDsl.g:571:2: ( rule__Plugin__AuthorAssignment_13 )?
            {
             before(grammarAccess.getPluginAccess().getAuthorAssignment_13()); 
            // InternalEntityDsl.g:572:2: ( rule__Plugin__AuthorAssignment_13 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:572:3: rule__Plugin__AuthorAssignment_13
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
    // InternalEntityDsl.g:580:1: rule__Plugin__Group__14 : rule__Plugin__Group__14__Impl rule__Plugin__Group__15 ;
    public final void rule__Plugin__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:584:1: ( rule__Plugin__Group__14__Impl rule__Plugin__Group__15 )
            // InternalEntityDsl.g:585:2: rule__Plugin__Group__14__Impl rule__Plugin__Group__15
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
    // InternalEntityDsl.g:592:1: rule__Plugin__Group__14__Impl : ( 'license' ) ;
    public final void rule__Plugin__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:596:1: ( ( 'license' ) )
            // InternalEntityDsl.g:597:1: ( 'license' )
            {
            // InternalEntityDsl.g:597:1: ( 'license' )
            // InternalEntityDsl.g:598:2: 'license'
            {
             before(grammarAccess.getPluginAccess().getLicenseKeyword_14()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEntityDsl.g:607:1: rule__Plugin__Group__15 : rule__Plugin__Group__15__Impl rule__Plugin__Group__16 ;
    public final void rule__Plugin__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:611:1: ( rule__Plugin__Group__15__Impl rule__Plugin__Group__16 )
            // InternalEntityDsl.g:612:2: rule__Plugin__Group__15__Impl rule__Plugin__Group__16
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
    // InternalEntityDsl.g:619:1: rule__Plugin__Group__15__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:623:1: ( ( '=' ) )
            // InternalEntityDsl.g:624:1: ( '=' )
            {
            // InternalEntityDsl.g:624:1: ( '=' )
            // InternalEntityDsl.g:625:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_15()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:634:1: rule__Plugin__Group__16 : rule__Plugin__Group__16__Impl rule__Plugin__Group__17 ;
    public final void rule__Plugin__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:638:1: ( rule__Plugin__Group__16__Impl rule__Plugin__Group__17 )
            // InternalEntityDsl.g:639:2: rule__Plugin__Group__16__Impl rule__Plugin__Group__17
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
    // InternalEntityDsl.g:646:1: rule__Plugin__Group__16__Impl : ( ( rule__Plugin__LicenseAssignment_16 )? ) ;
    public final void rule__Plugin__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:650:1: ( ( ( rule__Plugin__LicenseAssignment_16 )? ) )
            // InternalEntityDsl.g:651:1: ( ( rule__Plugin__LicenseAssignment_16 )? )
            {
            // InternalEntityDsl.g:651:1: ( ( rule__Plugin__LicenseAssignment_16 )? )
            // InternalEntityDsl.g:652:2: ( rule__Plugin__LicenseAssignment_16 )?
            {
             before(grammarAccess.getPluginAccess().getLicenseAssignment_16()); 
            // InternalEntityDsl.g:653:2: ( rule__Plugin__LicenseAssignment_16 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:653:3: rule__Plugin__LicenseAssignment_16
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
    // InternalEntityDsl.g:661:1: rule__Plugin__Group__17 : rule__Plugin__Group__17__Impl rule__Plugin__Group__18 ;
    public final void rule__Plugin__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:665:1: ( rule__Plugin__Group__17__Impl rule__Plugin__Group__18 )
            // InternalEntityDsl.g:666:2: rule__Plugin__Group__17__Impl rule__Plugin__Group__18
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
    // InternalEntityDsl.g:673:1: rule__Plugin__Group__17__Impl : ( 'prefix' ) ;
    public final void rule__Plugin__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:677:1: ( ( 'prefix' ) )
            // InternalEntityDsl.g:678:1: ( 'prefix' )
            {
            // InternalEntityDsl.g:678:1: ( 'prefix' )
            // InternalEntityDsl.g:679:2: 'prefix'
            {
             before(grammarAccess.getPluginAccess().getPrefixKeyword_17()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEntityDsl.g:688:1: rule__Plugin__Group__18 : rule__Plugin__Group__18__Impl rule__Plugin__Group__19 ;
    public final void rule__Plugin__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:692:1: ( rule__Plugin__Group__18__Impl rule__Plugin__Group__19 )
            // InternalEntityDsl.g:693:2: rule__Plugin__Group__18__Impl rule__Plugin__Group__19
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
    // InternalEntityDsl.g:700:1: rule__Plugin__Group__18__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:704:1: ( ( '=' ) )
            // InternalEntityDsl.g:705:1: ( '=' )
            {
            // InternalEntityDsl.g:705:1: ( '=' )
            // InternalEntityDsl.g:706:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_18()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:715:1: rule__Plugin__Group__19 : rule__Plugin__Group__19__Impl rule__Plugin__Group__20 ;
    public final void rule__Plugin__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:719:1: ( rule__Plugin__Group__19__Impl rule__Plugin__Group__20 )
            // InternalEntityDsl.g:720:2: rule__Plugin__Group__19__Impl rule__Plugin__Group__20
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
    // InternalEntityDsl.g:727:1: rule__Plugin__Group__19__Impl : ( ( rule__Plugin__PrefixAssignment_19 )? ) ;
    public final void rule__Plugin__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:731:1: ( ( ( rule__Plugin__PrefixAssignment_19 )? ) )
            // InternalEntityDsl.g:732:1: ( ( rule__Plugin__PrefixAssignment_19 )? )
            {
            // InternalEntityDsl.g:732:1: ( ( rule__Plugin__PrefixAssignment_19 )? )
            // InternalEntityDsl.g:733:2: ( rule__Plugin__PrefixAssignment_19 )?
            {
             before(grammarAccess.getPluginAccess().getPrefixAssignment_19()); 
            // InternalEntityDsl.g:734:2: ( rule__Plugin__PrefixAssignment_19 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:734:3: rule__Plugin__PrefixAssignment_19
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
    // InternalEntityDsl.g:742:1: rule__Plugin__Group__20 : rule__Plugin__Group__20__Impl rule__Plugin__Group__21 ;
    public final void rule__Plugin__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:746:1: ( rule__Plugin__Group__20__Impl rule__Plugin__Group__21 )
            // InternalEntityDsl.g:747:2: rule__Plugin__Group__20__Impl rule__Plugin__Group__21
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
    // InternalEntityDsl.g:754:1: rule__Plugin__Group__20__Impl : ( 'textDomain' ) ;
    public final void rule__Plugin__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:758:1: ( ( 'textDomain' ) )
            // InternalEntityDsl.g:759:1: ( 'textDomain' )
            {
            // InternalEntityDsl.g:759:1: ( 'textDomain' )
            // InternalEntityDsl.g:760:2: 'textDomain'
            {
             before(grammarAccess.getPluginAccess().getTextDomainKeyword_20()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEntityDsl.g:769:1: rule__Plugin__Group__21 : rule__Plugin__Group__21__Impl rule__Plugin__Group__22 ;
    public final void rule__Plugin__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:773:1: ( rule__Plugin__Group__21__Impl rule__Plugin__Group__22 )
            // InternalEntityDsl.g:774:2: rule__Plugin__Group__21__Impl rule__Plugin__Group__22
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
    // InternalEntityDsl.g:781:1: rule__Plugin__Group__21__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:785:1: ( ( '=' ) )
            // InternalEntityDsl.g:786:1: ( '=' )
            {
            // InternalEntityDsl.g:786:1: ( '=' )
            // InternalEntityDsl.g:787:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_21()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:796:1: rule__Plugin__Group__22 : rule__Plugin__Group__22__Impl rule__Plugin__Group__23 ;
    public final void rule__Plugin__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:800:1: ( rule__Plugin__Group__22__Impl rule__Plugin__Group__23 )
            // InternalEntityDsl.g:801:2: rule__Plugin__Group__22__Impl rule__Plugin__Group__23
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
    // InternalEntityDsl.g:808:1: rule__Plugin__Group__22__Impl : ( ( rule__Plugin__TextDomainAssignment_22 )? ) ;
    public final void rule__Plugin__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:812:1: ( ( ( rule__Plugin__TextDomainAssignment_22 )? ) )
            // InternalEntityDsl.g:813:1: ( ( rule__Plugin__TextDomainAssignment_22 )? )
            {
            // InternalEntityDsl.g:813:1: ( ( rule__Plugin__TextDomainAssignment_22 )? )
            // InternalEntityDsl.g:814:2: ( rule__Plugin__TextDomainAssignment_22 )?
            {
             before(grammarAccess.getPluginAccess().getTextDomainAssignment_22()); 
            // InternalEntityDsl.g:815:2: ( rule__Plugin__TextDomainAssignment_22 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:815:3: rule__Plugin__TextDomainAssignment_22
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
    // InternalEntityDsl.g:823:1: rule__Plugin__Group__23 : rule__Plugin__Group__23__Impl rule__Plugin__Group__24 ;
    public final void rule__Plugin__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:827:1: ( rule__Plugin__Group__23__Impl rule__Plugin__Group__24 )
            // InternalEntityDsl.g:828:2: rule__Plugin__Group__23__Impl rule__Plugin__Group__24
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
    // InternalEntityDsl.g:835:1: rule__Plugin__Group__23__Impl : ( 'activate' ) ;
    public final void rule__Plugin__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:839:1: ( ( 'activate' ) )
            // InternalEntityDsl.g:840:1: ( 'activate' )
            {
            // InternalEntityDsl.g:840:1: ( 'activate' )
            // InternalEntityDsl.g:841:2: 'activate'
            {
             before(grammarAccess.getPluginAccess().getActivateKeyword_23()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEntityDsl.g:850:1: rule__Plugin__Group__24 : rule__Plugin__Group__24__Impl rule__Plugin__Group__25 ;
    public final void rule__Plugin__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:854:1: ( rule__Plugin__Group__24__Impl rule__Plugin__Group__25 )
            // InternalEntityDsl.g:855:2: rule__Plugin__Group__24__Impl rule__Plugin__Group__25
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
    // InternalEntityDsl.g:862:1: rule__Plugin__Group__24__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:866:1: ( ( '=' ) )
            // InternalEntityDsl.g:867:1: ( '=' )
            {
            // InternalEntityDsl.g:867:1: ( '=' )
            // InternalEntityDsl.g:868:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_24()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:877:1: rule__Plugin__Group__25 : rule__Plugin__Group__25__Impl rule__Plugin__Group__26 ;
    public final void rule__Plugin__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:881:1: ( rule__Plugin__Group__25__Impl rule__Plugin__Group__26 )
            // InternalEntityDsl.g:882:2: rule__Plugin__Group__25__Impl rule__Plugin__Group__26
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
    // InternalEntityDsl.g:889:1: rule__Plugin__Group__25__Impl : ( ( rule__Plugin__ActivateAssignment_25 )? ) ;
    public final void rule__Plugin__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:893:1: ( ( ( rule__Plugin__ActivateAssignment_25 )? ) )
            // InternalEntityDsl.g:894:1: ( ( rule__Plugin__ActivateAssignment_25 )? )
            {
            // InternalEntityDsl.g:894:1: ( ( rule__Plugin__ActivateAssignment_25 )? )
            // InternalEntityDsl.g:895:2: ( rule__Plugin__ActivateAssignment_25 )?
            {
             before(grammarAccess.getPluginAccess().getActivateAssignment_25()); 
            // InternalEntityDsl.g:896:2: ( rule__Plugin__ActivateAssignment_25 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:896:3: rule__Plugin__ActivateAssignment_25
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
    // InternalEntityDsl.g:904:1: rule__Plugin__Group__26 : rule__Plugin__Group__26__Impl rule__Plugin__Group__27 ;
    public final void rule__Plugin__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:908:1: ( rule__Plugin__Group__26__Impl rule__Plugin__Group__27 )
            // InternalEntityDsl.g:909:2: rule__Plugin__Group__26__Impl rule__Plugin__Group__27
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
    // InternalEntityDsl.g:916:1: rule__Plugin__Group__26__Impl : ( 'deactivate' ) ;
    public final void rule__Plugin__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:920:1: ( ( 'deactivate' ) )
            // InternalEntityDsl.g:921:1: ( 'deactivate' )
            {
            // InternalEntityDsl.g:921:1: ( 'deactivate' )
            // InternalEntityDsl.g:922:2: 'deactivate'
            {
             before(grammarAccess.getPluginAccess().getDeactivateKeyword_26()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEntityDsl.g:931:1: rule__Plugin__Group__27 : rule__Plugin__Group__27__Impl rule__Plugin__Group__28 ;
    public final void rule__Plugin__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:935:1: ( rule__Plugin__Group__27__Impl rule__Plugin__Group__28 )
            // InternalEntityDsl.g:936:2: rule__Plugin__Group__27__Impl rule__Plugin__Group__28
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
    // InternalEntityDsl.g:943:1: rule__Plugin__Group__27__Impl : ( '=' ) ;
    public final void rule__Plugin__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:947:1: ( ( '=' ) )
            // InternalEntityDsl.g:948:1: ( '=' )
            {
            // InternalEntityDsl.g:948:1: ( '=' )
            // InternalEntityDsl.g:949:2: '='
            {
             before(grammarAccess.getPluginAccess().getEqualsSignKeyword_27()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:958:1: rule__Plugin__Group__28 : rule__Plugin__Group__28__Impl rule__Plugin__Group__29 ;
    public final void rule__Plugin__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:962:1: ( rule__Plugin__Group__28__Impl rule__Plugin__Group__29 )
            // InternalEntityDsl.g:963:2: rule__Plugin__Group__28__Impl rule__Plugin__Group__29
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
    // InternalEntityDsl.g:970:1: rule__Plugin__Group__28__Impl : ( ( rule__Plugin__DeactivateAssignment_28 )? ) ;
    public final void rule__Plugin__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:974:1: ( ( ( rule__Plugin__DeactivateAssignment_28 )? ) )
            // InternalEntityDsl.g:975:1: ( ( rule__Plugin__DeactivateAssignment_28 )? )
            {
            // InternalEntityDsl.g:975:1: ( ( rule__Plugin__DeactivateAssignment_28 )? )
            // InternalEntityDsl.g:976:2: ( rule__Plugin__DeactivateAssignment_28 )?
            {
             before(grammarAccess.getPluginAccess().getDeactivateAssignment_28()); 
            // InternalEntityDsl.g:977:2: ( rule__Plugin__DeactivateAssignment_28 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:977:3: rule__Plugin__DeactivateAssignment_28
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
    // InternalEntityDsl.g:985:1: rule__Plugin__Group__29 : rule__Plugin__Group__29__Impl rule__Plugin__Group__30 ;
    public final void rule__Plugin__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:989:1: ( rule__Plugin__Group__29__Impl rule__Plugin__Group__30 )
            // InternalEntityDsl.g:990:2: rule__Plugin__Group__29__Impl rule__Plugin__Group__30
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:997:1: rule__Plugin__Group__29__Impl : ( ( rule__Plugin__WidgetsAssignment_29 )* ) ;
    public final void rule__Plugin__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1001:1: ( ( ( rule__Plugin__WidgetsAssignment_29 )* ) )
            // InternalEntityDsl.g:1002:1: ( ( rule__Plugin__WidgetsAssignment_29 )* )
            {
            // InternalEntityDsl.g:1002:1: ( ( rule__Plugin__WidgetsAssignment_29 )* )
            // InternalEntityDsl.g:1003:2: ( rule__Plugin__WidgetsAssignment_29 )*
            {
             before(grammarAccess.getPluginAccess().getWidgetsAssignment_29()); 
            // InternalEntityDsl.g:1004:2: ( rule__Plugin__WidgetsAssignment_29 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:1004:3: rule__Plugin__WidgetsAssignment_29
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Plugin__WidgetsAssignment_29();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getWidgetsAssignment_29()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1012:1: rule__Plugin__Group__30 : rule__Plugin__Group__30__Impl rule__Plugin__Group__31 ;
    public final void rule__Plugin__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1016:1: ( rule__Plugin__Group__30__Impl rule__Plugin__Group__31 )
            // InternalEntityDsl.g:1017:2: rule__Plugin__Group__30__Impl rule__Plugin__Group__31
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:1024:1: rule__Plugin__Group__30__Impl : ( ( rule__Plugin__ShortcodesAssignment_30 )* ) ;
    public final void rule__Plugin__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1028:1: ( ( ( rule__Plugin__ShortcodesAssignment_30 )* ) )
            // InternalEntityDsl.g:1029:1: ( ( rule__Plugin__ShortcodesAssignment_30 )* )
            {
            // InternalEntityDsl.g:1029:1: ( ( rule__Plugin__ShortcodesAssignment_30 )* )
            // InternalEntityDsl.g:1030:2: ( rule__Plugin__ShortcodesAssignment_30 )*
            {
             before(grammarAccess.getPluginAccess().getShortcodesAssignment_30()); 
            // InternalEntityDsl.g:1031:2: ( rule__Plugin__ShortcodesAssignment_30 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:1031:3: rule__Plugin__ShortcodesAssignment_30
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Plugin__ShortcodesAssignment_30();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getShortcodesAssignment_30()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1039:1: rule__Plugin__Group__31 : rule__Plugin__Group__31__Impl rule__Plugin__Group__32 ;
    public final void rule__Plugin__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1043:1: ( rule__Plugin__Group__31__Impl rule__Plugin__Group__32 )
            // InternalEntityDsl.g:1044:2: rule__Plugin__Group__31__Impl rule__Plugin__Group__32
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:1051:1: rule__Plugin__Group__31__Impl : ( ( rule__Plugin__CustomPostTypesAssignment_31 )* ) ;
    public final void rule__Plugin__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1055:1: ( ( ( rule__Plugin__CustomPostTypesAssignment_31 )* ) )
            // InternalEntityDsl.g:1056:1: ( ( rule__Plugin__CustomPostTypesAssignment_31 )* )
            {
            // InternalEntityDsl.g:1056:1: ( ( rule__Plugin__CustomPostTypesAssignment_31 )* )
            // InternalEntityDsl.g:1057:2: ( rule__Plugin__CustomPostTypesAssignment_31 )*
            {
             before(grammarAccess.getPluginAccess().getCustomPostTypesAssignment_31()); 
            // InternalEntityDsl.g:1058:2: ( rule__Plugin__CustomPostTypesAssignment_31 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEntityDsl.g:1058:3: rule__Plugin__CustomPostTypesAssignment_31
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Plugin__CustomPostTypesAssignment_31();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getCustomPostTypesAssignment_31()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1066:1: rule__Plugin__Group__32 : rule__Plugin__Group__32__Impl rule__Plugin__Group__33 ;
    public final void rule__Plugin__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1070:1: ( rule__Plugin__Group__32__Impl rule__Plugin__Group__33 )
            // InternalEntityDsl.g:1071:2: rule__Plugin__Group__32__Impl rule__Plugin__Group__33
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:1078:1: rule__Plugin__Group__32__Impl : ( ( rule__Plugin__SettingsAssignment_32 )* ) ;
    public final void rule__Plugin__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1082:1: ( ( ( rule__Plugin__SettingsAssignment_32 )* ) )
            // InternalEntityDsl.g:1083:1: ( ( rule__Plugin__SettingsAssignment_32 )* )
            {
            // InternalEntityDsl.g:1083:1: ( ( rule__Plugin__SettingsAssignment_32 )* )
            // InternalEntityDsl.g:1084:2: ( rule__Plugin__SettingsAssignment_32 )*
            {
             before(grammarAccess.getPluginAccess().getSettingsAssignment_32()); 
            // InternalEntityDsl.g:1085:2: ( rule__Plugin__SettingsAssignment_32 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEntityDsl.g:1085:3: rule__Plugin__SettingsAssignment_32
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Plugin__SettingsAssignment_32();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getSettingsAssignment_32()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1093:1: rule__Plugin__Group__33 : rule__Plugin__Group__33__Impl ;
    public final void rule__Plugin__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1097:1: ( rule__Plugin__Group__33__Impl )
            // InternalEntityDsl.g:1098:2: rule__Plugin__Group__33__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__Group__33__Impl();

            state._fsp--;


            }

        }
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
    // InternalEntityDsl.g:1104:1: rule__Plugin__Group__33__Impl : ( '}' ) ;
    public final void rule__Plugin__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1108:1: ( ( '}' ) )
            // InternalEntityDsl.g:1109:1: ( '}' )
            {
            // InternalEntityDsl.g:1109:1: ( '}' )
            // InternalEntityDsl.g:1110:2: '}'
            {
             before(grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_33()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_33()); 

            }


            }

        }
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


    // $ANTLR start "rule__Widget__Group__0"
    // InternalEntityDsl.g:1120:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1124:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalEntityDsl.g:1125:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
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
    // InternalEntityDsl.g:1132:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1136:1: ( ( 'Widget' ) )
            // InternalEntityDsl.g:1137:1: ( 'Widget' )
            {
            // InternalEntityDsl.g:1137:1: ( 'Widget' )
            // InternalEntityDsl.g:1138:2: 'Widget'
            {
             before(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEntityDsl.g:1147:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1151:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalEntityDsl.g:1152:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalEntityDsl.g:1159:1: rule__Widget__Group__1__Impl : ( '{' ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1163:1: ( ( '{' ) )
            // InternalEntityDsl.g:1164:1: ( '{' )
            {
            // InternalEntityDsl.g:1164:1: ( '{' )
            // InternalEntityDsl.g:1165:2: '{'
            {
             before(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEntityDsl.g:1174:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1178:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalEntityDsl.g:1179:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
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
    // InternalEntityDsl.g:1186:1: rule__Widget__Group__2__Impl : ( 'widgetName' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1190:1: ( ( 'widgetName' ) )
            // InternalEntityDsl.g:1191:1: ( 'widgetName' )
            {
            // InternalEntityDsl.g:1191:1: ( 'widgetName' )
            // InternalEntityDsl.g:1192:2: 'widgetName'
            {
             before(grammarAccess.getWidgetAccess().getWidgetNameKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEntityDsl.g:1201:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1205:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalEntityDsl.g:1206:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
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
    // InternalEntityDsl.g:1213:1: rule__Widget__Group__3__Impl : ( '=' ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1217:1: ( ( '=' ) )
            // InternalEntityDsl.g:1218:1: ( '=' )
            {
            // InternalEntityDsl.g:1218:1: ( '=' )
            // InternalEntityDsl.g:1219:2: '='
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:1228:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1232:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalEntityDsl.g:1233:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalEntityDsl.g:1240:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__WidgetNameAssignment_4 ) ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1244:1: ( ( ( rule__Widget__WidgetNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1245:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1245:1: ( ( rule__Widget__WidgetNameAssignment_4 ) )
            // InternalEntityDsl.g:1246:2: ( rule__Widget__WidgetNameAssignment_4 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetNameAssignment_4()); 
            // InternalEntityDsl.g:1247:2: ( rule__Widget__WidgetNameAssignment_4 )
            // InternalEntityDsl.g:1247:3: rule__Widget__WidgetNameAssignment_4
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
    // InternalEntityDsl.g:1255:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl rule__Widget__Group__6 ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1259:1: ( rule__Widget__Group__5__Impl rule__Widget__Group__6 )
            // InternalEntityDsl.g:1260:2: rule__Widget__Group__5__Impl rule__Widget__Group__6
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
    // InternalEntityDsl.g:1267:1: rule__Widget__Group__5__Impl : ( 'widgetDescription' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1271:1: ( ( 'widgetDescription' ) )
            // InternalEntityDsl.g:1272:1: ( 'widgetDescription' )
            {
            // InternalEntityDsl.g:1272:1: ( 'widgetDescription' )
            // InternalEntityDsl.g:1273:2: 'widgetDescription'
            {
             before(grammarAccess.getWidgetAccess().getWidgetDescriptionKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEntityDsl.g:1282:1: rule__Widget__Group__6 : rule__Widget__Group__6__Impl rule__Widget__Group__7 ;
    public final void rule__Widget__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1286:1: ( rule__Widget__Group__6__Impl rule__Widget__Group__7 )
            // InternalEntityDsl.g:1287:2: rule__Widget__Group__6__Impl rule__Widget__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:1294:1: rule__Widget__Group__6__Impl : ( '=' ) ;
    public final void rule__Widget__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1298:1: ( ( '=' ) )
            // InternalEntityDsl.g:1299:1: ( '=' )
            {
            // InternalEntityDsl.g:1299:1: ( '=' )
            // InternalEntityDsl.g:1300:2: '='
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:1309:1: rule__Widget__Group__7 : rule__Widget__Group__7__Impl rule__Widget__Group__8 ;
    public final void rule__Widget__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1313:1: ( rule__Widget__Group__7__Impl rule__Widget__Group__8 )
            // InternalEntityDsl.g:1314:2: rule__Widget__Group__7__Impl rule__Widget__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalEntityDsl.g:1321:1: rule__Widget__Group__7__Impl : ( ( rule__Widget__WidgetDescriptionAssignment_7 ) ) ;
    public final void rule__Widget__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1325:1: ( ( ( rule__Widget__WidgetDescriptionAssignment_7 ) ) )
            // InternalEntityDsl.g:1326:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 ) )
            {
            // InternalEntityDsl.g:1326:1: ( ( rule__Widget__WidgetDescriptionAssignment_7 ) )
            // InternalEntityDsl.g:1327:2: ( rule__Widget__WidgetDescriptionAssignment_7 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetDescriptionAssignment_7()); 
            // InternalEntityDsl.g:1328:2: ( rule__Widget__WidgetDescriptionAssignment_7 )
            // InternalEntityDsl.g:1328:3: rule__Widget__WidgetDescriptionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetDescriptionAssignment_7();

            state._fsp--;


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
    // InternalEntityDsl.g:1336:1: rule__Widget__Group__8 : rule__Widget__Group__8__Impl rule__Widget__Group__9 ;
    public final void rule__Widget__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1340:1: ( rule__Widget__Group__8__Impl rule__Widget__Group__9 )
            // InternalEntityDsl.g:1341:2: rule__Widget__Group__8__Impl rule__Widget__Group__9
            {
            pushFollow(FOLLOW_22);
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
    // InternalEntityDsl.g:1348:1: rule__Widget__Group__8__Impl : ( ( rule__Widget__SettingsAssignment_8 )* ) ;
    public final void rule__Widget__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1352:1: ( ( ( rule__Widget__SettingsAssignment_8 )* ) )
            // InternalEntityDsl.g:1353:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            {
            // InternalEntityDsl.g:1353:1: ( ( rule__Widget__SettingsAssignment_8 )* )
            // InternalEntityDsl.g:1354:2: ( rule__Widget__SettingsAssignment_8 )*
            {
             before(grammarAccess.getWidgetAccess().getSettingsAssignment_8()); 
            // InternalEntityDsl.g:1355:2: ( rule__Widget__SettingsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDsl.g:1355:3: rule__Widget__SettingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Widget__SettingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalEntityDsl.g:1363:1: rule__Widget__Group__9 : rule__Widget__Group__9__Impl ;
    public final void rule__Widget__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1367:1: ( rule__Widget__Group__9__Impl )
            // InternalEntityDsl.g:1368:2: rule__Widget__Group__9__Impl
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
    // InternalEntityDsl.g:1374:1: rule__Widget__Group__9__Impl : ( '}' ) ;
    public final void rule__Widget__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1378:1: ( ( '}' ) )
            // InternalEntityDsl.g:1379:1: ( '}' )
            {
            // InternalEntityDsl.g:1379:1: ( '}' )
            // InternalEntityDsl.g:1380:2: '}'
            {
             before(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Setting__Group__0"
    // InternalEntityDsl.g:1390:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1394:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalEntityDsl.g:1395:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
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
    // InternalEntityDsl.g:1402:1: rule__Setting__Group__0__Impl : ( 'Setting' ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1406:1: ( ( 'Setting' ) )
            // InternalEntityDsl.g:1407:1: ( 'Setting' )
            {
            // InternalEntityDsl.g:1407:1: ( 'Setting' )
            // InternalEntityDsl.g:1408:2: 'Setting'
            {
             before(grammarAccess.getSettingAccess().getSettingKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEntityDsl.g:1417:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1421:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalEntityDsl.g:1422:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalEntityDsl.g:1429:1: rule__Setting__Group__1__Impl : ( '{' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1433:1: ( ( '{' ) )
            // InternalEntityDsl.g:1434:1: ( '{' )
            {
            // InternalEntityDsl.g:1434:1: ( '{' )
            // InternalEntityDsl.g:1435:2: '{'
            {
             before(grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEntityDsl.g:1444:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl rule__Setting__Group__3 ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1448:1: ( rule__Setting__Group__2__Impl rule__Setting__Group__3 )
            // InternalEntityDsl.g:1449:2: rule__Setting__Group__2__Impl rule__Setting__Group__3
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
    // InternalEntityDsl.g:1456:1: rule__Setting__Group__2__Impl : ( 'settingName' ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1460:1: ( ( 'settingName' ) )
            // InternalEntityDsl.g:1461:1: ( 'settingName' )
            {
            // InternalEntityDsl.g:1461:1: ( 'settingName' )
            // InternalEntityDsl.g:1462:2: 'settingName'
            {
             before(grammarAccess.getSettingAccess().getSettingNameKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEntityDsl.g:1471:1: rule__Setting__Group__3 : rule__Setting__Group__3__Impl rule__Setting__Group__4 ;
    public final void rule__Setting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1475:1: ( rule__Setting__Group__3__Impl rule__Setting__Group__4 )
            // InternalEntityDsl.g:1476:2: rule__Setting__Group__3__Impl rule__Setting__Group__4
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
    // InternalEntityDsl.g:1483:1: rule__Setting__Group__3__Impl : ( '=' ) ;
    public final void rule__Setting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1487:1: ( ( '=' ) )
            // InternalEntityDsl.g:1488:1: ( '=' )
            {
            // InternalEntityDsl.g:1488:1: ( '=' )
            // InternalEntityDsl.g:1489:2: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:1498:1: rule__Setting__Group__4 : rule__Setting__Group__4__Impl rule__Setting__Group__5 ;
    public final void rule__Setting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1502:1: ( rule__Setting__Group__4__Impl rule__Setting__Group__5 )
            // InternalEntityDsl.g:1503:2: rule__Setting__Group__4__Impl rule__Setting__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalEntityDsl.g:1510:1: rule__Setting__Group__4__Impl : ( ( rule__Setting__SettingNameAssignment_4 ) ) ;
    public final void rule__Setting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1514:1: ( ( ( rule__Setting__SettingNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1515:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1515:1: ( ( rule__Setting__SettingNameAssignment_4 ) )
            // InternalEntityDsl.g:1516:2: ( rule__Setting__SettingNameAssignment_4 )
            {
             before(grammarAccess.getSettingAccess().getSettingNameAssignment_4()); 
            // InternalEntityDsl.g:1517:2: ( rule__Setting__SettingNameAssignment_4 )
            // InternalEntityDsl.g:1517:3: rule__Setting__SettingNameAssignment_4
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
    // InternalEntityDsl.g:1525:1: rule__Setting__Group__5 : rule__Setting__Group__5__Impl rule__Setting__Group__6 ;
    public final void rule__Setting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1529:1: ( rule__Setting__Group__5__Impl rule__Setting__Group__6 )
            // InternalEntityDsl.g:1530:2: rule__Setting__Group__5__Impl rule__Setting__Group__6
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
    // InternalEntityDsl.g:1537:1: rule__Setting__Group__5__Impl : ( 'settingType' ) ;
    public final void rule__Setting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1541:1: ( ( 'settingType' ) )
            // InternalEntityDsl.g:1542:1: ( 'settingType' )
            {
            // InternalEntityDsl.g:1542:1: ( 'settingType' )
            // InternalEntityDsl.g:1543:2: 'settingType'
            {
             before(grammarAccess.getSettingAccess().getSettingTypeKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalEntityDsl.g:1552:1: rule__Setting__Group__6 : rule__Setting__Group__6__Impl rule__Setting__Group__7 ;
    public final void rule__Setting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1556:1: ( rule__Setting__Group__6__Impl rule__Setting__Group__7 )
            // InternalEntityDsl.g:1557:2: rule__Setting__Group__6__Impl rule__Setting__Group__7
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
    // InternalEntityDsl.g:1564:1: rule__Setting__Group__6__Impl : ( '=' ) ;
    public final void rule__Setting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1568:1: ( ( '=' ) )
            // InternalEntityDsl.g:1569:1: ( '=' )
            {
            // InternalEntityDsl.g:1569:1: ( '=' )
            // InternalEntityDsl.g:1570:2: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:1579:1: rule__Setting__Group__7 : rule__Setting__Group__7__Impl rule__Setting__Group__8 ;
    public final void rule__Setting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1583:1: ( rule__Setting__Group__7__Impl rule__Setting__Group__8 )
            // InternalEntityDsl.g:1584:2: rule__Setting__Group__7__Impl rule__Setting__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalEntityDsl.g:1591:1: rule__Setting__Group__7__Impl : ( ( rule__Setting__SettingTypeAssignment_7 ) ) ;
    public final void rule__Setting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1595:1: ( ( ( rule__Setting__SettingTypeAssignment_7 ) ) )
            // InternalEntityDsl.g:1596:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            {
            // InternalEntityDsl.g:1596:1: ( ( rule__Setting__SettingTypeAssignment_7 ) )
            // InternalEntityDsl.g:1597:2: ( rule__Setting__SettingTypeAssignment_7 )
            {
             before(grammarAccess.getSettingAccess().getSettingTypeAssignment_7()); 
            // InternalEntityDsl.g:1598:2: ( rule__Setting__SettingTypeAssignment_7 )
            // InternalEntityDsl.g:1598:3: rule__Setting__SettingTypeAssignment_7
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
    // InternalEntityDsl.g:1606:1: rule__Setting__Group__8 : rule__Setting__Group__8__Impl rule__Setting__Group__9 ;
    public final void rule__Setting__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1610:1: ( rule__Setting__Group__8__Impl rule__Setting__Group__9 )
            // InternalEntityDsl.g:1611:2: rule__Setting__Group__8__Impl rule__Setting__Group__9
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
    // InternalEntityDsl.g:1618:1: rule__Setting__Group__8__Impl : ( 'defaultValue' ) ;
    public final void rule__Setting__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1622:1: ( ( 'defaultValue' ) )
            // InternalEntityDsl.g:1623:1: ( 'defaultValue' )
            {
            // InternalEntityDsl.g:1623:1: ( 'defaultValue' )
            // InternalEntityDsl.g:1624:2: 'defaultValue'
            {
             before(grammarAccess.getSettingAccess().getDefaultValueKeyword_8()); 
            match(input,30,FOLLOW_2); 
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
    // InternalEntityDsl.g:1633:1: rule__Setting__Group__9 : rule__Setting__Group__9__Impl rule__Setting__Group__10 ;
    public final void rule__Setting__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1637:1: ( rule__Setting__Group__9__Impl rule__Setting__Group__10 )
            // InternalEntityDsl.g:1638:2: rule__Setting__Group__9__Impl rule__Setting__Group__10
            {
            pushFollow(FOLLOW_26);
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
    // InternalEntityDsl.g:1645:1: rule__Setting__Group__9__Impl : ( '=' ) ;
    public final void rule__Setting__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1649:1: ( ( '=' ) )
            // InternalEntityDsl.g:1650:1: ( '=' )
            {
            // InternalEntityDsl.g:1650:1: ( '=' )
            // InternalEntityDsl.g:1651:2: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_9()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:1660:1: rule__Setting__Group__10 : rule__Setting__Group__10__Impl rule__Setting__Group__11 ;
    public final void rule__Setting__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1664:1: ( rule__Setting__Group__10__Impl rule__Setting__Group__11 )
            // InternalEntityDsl.g:1665:2: rule__Setting__Group__10__Impl rule__Setting__Group__11
            {
            pushFollow(FOLLOW_26);
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
    // InternalEntityDsl.g:1672:1: rule__Setting__Group__10__Impl : ( ( rule__Setting__DefaultValueAssignment_10 )? ) ;
    public final void rule__Setting__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1676:1: ( ( ( rule__Setting__DefaultValueAssignment_10 )? ) )
            // InternalEntityDsl.g:1677:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            {
            // InternalEntityDsl.g:1677:1: ( ( rule__Setting__DefaultValueAssignment_10 )? )
            // InternalEntityDsl.g:1678:2: ( rule__Setting__DefaultValueAssignment_10 )?
            {
             before(grammarAccess.getSettingAccess().getDefaultValueAssignment_10()); 
            // InternalEntityDsl.g:1679:2: ( rule__Setting__DefaultValueAssignment_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEntityDsl.g:1679:3: rule__Setting__DefaultValueAssignment_10
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
    // InternalEntityDsl.g:1687:1: rule__Setting__Group__11 : rule__Setting__Group__11__Impl ;
    public final void rule__Setting__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1691:1: ( rule__Setting__Group__11__Impl )
            // InternalEntityDsl.g:1692:2: rule__Setting__Group__11__Impl
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
    // InternalEntityDsl.g:1698:1: rule__Setting__Group__11__Impl : ( '}' ) ;
    public final void rule__Setting__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1702:1: ( ( '}' ) )
            // InternalEntityDsl.g:1703:1: ( '}' )
            {
            // InternalEntityDsl.g:1703:1: ( '}' )
            // InternalEntityDsl.g:1704:2: '}'
            {
             before(grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Shortcode__Group__0"
    // InternalEntityDsl.g:1714:1: rule__Shortcode__Group__0 : rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 ;
    public final void rule__Shortcode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1718:1: ( rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1 )
            // InternalEntityDsl.g:1719:2: rule__Shortcode__Group__0__Impl rule__Shortcode__Group__1
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
    // InternalEntityDsl.g:1726:1: rule__Shortcode__Group__0__Impl : ( 'Shortcode' ) ;
    public final void rule__Shortcode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1730:1: ( ( 'Shortcode' ) )
            // InternalEntityDsl.g:1731:1: ( 'Shortcode' )
            {
            // InternalEntityDsl.g:1731:1: ( 'Shortcode' )
            // InternalEntityDsl.g:1732:2: 'Shortcode'
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalEntityDsl.g:1741:1: rule__Shortcode__Group__1 : rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 ;
    public final void rule__Shortcode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1745:1: ( rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2 )
            // InternalEntityDsl.g:1746:2: rule__Shortcode__Group__1__Impl rule__Shortcode__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalEntityDsl.g:1753:1: rule__Shortcode__Group__1__Impl : ( '{' ) ;
    public final void rule__Shortcode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1757:1: ( ( '{' ) )
            // InternalEntityDsl.g:1758:1: ( '{' )
            {
            // InternalEntityDsl.g:1758:1: ( '{' )
            // InternalEntityDsl.g:1759:2: '{'
            {
             before(grammarAccess.getShortcodeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEntityDsl.g:1768:1: rule__Shortcode__Group__2 : rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 ;
    public final void rule__Shortcode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1772:1: ( rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3 )
            // InternalEntityDsl.g:1773:2: rule__Shortcode__Group__2__Impl rule__Shortcode__Group__3
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
    // InternalEntityDsl.g:1780:1: rule__Shortcode__Group__2__Impl : ( 'shortcodeName' ) ;
    public final void rule__Shortcode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1784:1: ( ( 'shortcodeName' ) )
            // InternalEntityDsl.g:1785:1: ( 'shortcodeName' )
            {
            // InternalEntityDsl.g:1785:1: ( 'shortcodeName' )
            // InternalEntityDsl.g:1786:2: 'shortcodeName'
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalEntityDsl.g:1795:1: rule__Shortcode__Group__3 : rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 ;
    public final void rule__Shortcode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1799:1: ( rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4 )
            // InternalEntityDsl.g:1800:2: rule__Shortcode__Group__3__Impl rule__Shortcode__Group__4
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
    // InternalEntityDsl.g:1807:1: rule__Shortcode__Group__3__Impl : ( '=' ) ;
    public final void rule__Shortcode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1811:1: ( ( '=' ) )
            // InternalEntityDsl.g:1812:1: ( '=' )
            {
            // InternalEntityDsl.g:1812:1: ( '=' )
            // InternalEntityDsl.g:1813:2: '='
            {
             before(grammarAccess.getShortcodeAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:1822:1: rule__Shortcode__Group__4 : rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 ;
    public final void rule__Shortcode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1826:1: ( rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5 )
            // InternalEntityDsl.g:1827:2: rule__Shortcode__Group__4__Impl rule__Shortcode__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalEntityDsl.g:1834:1: rule__Shortcode__Group__4__Impl : ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) ;
    public final void rule__Shortcode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1838:1: ( ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) ) )
            // InternalEntityDsl.g:1839:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:1839:1: ( ( rule__Shortcode__ShortcodeNameAssignment_4 ) )
            // InternalEntityDsl.g:1840:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            {
             before(grammarAccess.getShortcodeAccess().getShortcodeNameAssignment_4()); 
            // InternalEntityDsl.g:1841:2: ( rule__Shortcode__ShortcodeNameAssignment_4 )
            // InternalEntityDsl.g:1841:3: rule__Shortcode__ShortcodeNameAssignment_4
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
    // InternalEntityDsl.g:1849:1: rule__Shortcode__Group__5 : rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 ;
    public final void rule__Shortcode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1853:1: ( rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6 )
            // InternalEntityDsl.g:1854:2: rule__Shortcode__Group__5__Impl rule__Shortcode__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalEntityDsl.g:1861:1: rule__Shortcode__Group__5__Impl : ( 'addShortcode()' ) ;
    public final void rule__Shortcode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1865:1: ( ( 'addShortcode()' ) )
            // InternalEntityDsl.g:1866:1: ( 'addShortcode()' )
            {
            // InternalEntityDsl.g:1866:1: ( 'addShortcode()' )
            // InternalEntityDsl.g:1867:2: 'addShortcode()'
            {
             before(grammarAccess.getShortcodeAccess().getAddShortcodeKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getAddShortcodeKeyword_5()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1876:1: rule__Shortcode__Group__6 : rule__Shortcode__Group__6__Impl rule__Shortcode__Group__7 ;
    public final void rule__Shortcode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1880:1: ( rule__Shortcode__Group__6__Impl rule__Shortcode__Group__7 )
            // InternalEntityDsl.g:1881:2: rule__Shortcode__Group__6__Impl rule__Shortcode__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Shortcode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__7();

            state._fsp--;


            }

        }
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
    // InternalEntityDsl.g:1888:1: rule__Shortcode__Group__6__Impl : ( 'executeShortcode()' ) ;
    public final void rule__Shortcode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1892:1: ( ( 'executeShortcode()' ) )
            // InternalEntityDsl.g:1893:1: ( 'executeShortcode()' )
            {
            // InternalEntityDsl.g:1893:1: ( 'executeShortcode()' )
            // InternalEntityDsl.g:1894:2: 'executeShortcode()'
            {
             before(grammarAccess.getShortcodeAccess().getExecuteShortcodeKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getExecuteShortcodeKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Shortcode__Group__7"
    // InternalEntityDsl.g:1903:1: rule__Shortcode__Group__7 : rule__Shortcode__Group__7__Impl rule__Shortcode__Group__8 ;
    public final void rule__Shortcode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1907:1: ( rule__Shortcode__Group__7__Impl rule__Shortcode__Group__8 )
            // InternalEntityDsl.g:1908:2: rule__Shortcode__Group__7__Impl rule__Shortcode__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Shortcode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__7"


    // $ANTLR start "rule__Shortcode__Group__7__Impl"
    // InternalEntityDsl.g:1915:1: rule__Shortcode__Group__7__Impl : ( ( rule__Shortcode__HooksAssignment_7 )* ) ;
    public final void rule__Shortcode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1919:1: ( ( ( rule__Shortcode__HooksAssignment_7 )* ) )
            // InternalEntityDsl.g:1920:1: ( ( rule__Shortcode__HooksAssignment_7 )* )
            {
            // InternalEntityDsl.g:1920:1: ( ( rule__Shortcode__HooksAssignment_7 )* )
            // InternalEntityDsl.g:1921:2: ( rule__Shortcode__HooksAssignment_7 )*
            {
             before(grammarAccess.getShortcodeAccess().getHooksAssignment_7()); 
            // InternalEntityDsl.g:1922:2: ( rule__Shortcode__HooksAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEntityDsl.g:1922:3: rule__Shortcode__HooksAssignment_7
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Shortcode__HooksAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getShortcodeAccess().getHooksAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__7__Impl"


    // $ANTLR start "rule__Shortcode__Group__8"
    // InternalEntityDsl.g:1930:1: rule__Shortcode__Group__8 : rule__Shortcode__Group__8__Impl ;
    public final void rule__Shortcode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1934:1: ( rule__Shortcode__Group__8__Impl )
            // InternalEntityDsl.g:1935:2: rule__Shortcode__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shortcode__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__8"


    // $ANTLR start "rule__Shortcode__Group__8__Impl"
    // InternalEntityDsl.g:1941:1: rule__Shortcode__Group__8__Impl : ( '}' ) ;
    public final void rule__Shortcode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1945:1: ( ( '}' ) )
            // InternalEntityDsl.g:1946:1: ( '}' )
            {
            // InternalEntityDsl.g:1946:1: ( '}' )
            // InternalEntityDsl.g:1947:2: '}'
            {
             before(grammarAccess.getShortcodeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getShortcodeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__Group__8__Impl"


    // $ANTLR start "rule__CustomPostType__Group__0"
    // InternalEntityDsl.g:1957:1: rule__CustomPostType__Group__0 : rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 ;
    public final void rule__CustomPostType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1961:1: ( rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1 )
            // InternalEntityDsl.g:1962:2: rule__CustomPostType__Group__0__Impl rule__CustomPostType__Group__1
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
    // InternalEntityDsl.g:1969:1: rule__CustomPostType__Group__0__Impl : ( 'CustomPostType' ) ;
    public final void rule__CustomPostType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1973:1: ( ( 'CustomPostType' ) )
            // InternalEntityDsl.g:1974:1: ( 'CustomPostType' )
            {
            // InternalEntityDsl.g:1974:1: ( 'CustomPostType' )
            // InternalEntityDsl.g:1975:2: 'CustomPostType'
            {
             before(grammarAccess.getCustomPostTypeAccess().getCustomPostTypeKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalEntityDsl.g:1984:1: rule__CustomPostType__Group__1 : rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 ;
    public final void rule__CustomPostType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1988:1: ( rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2 )
            // InternalEntityDsl.g:1989:2: rule__CustomPostType__Group__1__Impl rule__CustomPostType__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalEntityDsl.g:1996:1: rule__CustomPostType__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomPostType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2000:1: ( ( '{' ) )
            // InternalEntityDsl.g:2001:1: ( '{' )
            {
            // InternalEntityDsl.g:2001:1: ( '{' )
            // InternalEntityDsl.g:2002:2: '{'
            {
             before(grammarAccess.getCustomPostTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEntityDsl.g:2011:1: rule__CustomPostType__Group__2 : rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 ;
    public final void rule__CustomPostType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2015:1: ( rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3 )
            // InternalEntityDsl.g:2016:2: rule__CustomPostType__Group__2__Impl rule__CustomPostType__Group__3
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
    // InternalEntityDsl.g:2023:1: rule__CustomPostType__Group__2__Impl : ( 'postTypeName' ) ;
    public final void rule__CustomPostType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2027:1: ( ( 'postTypeName' ) )
            // InternalEntityDsl.g:2028:1: ( 'postTypeName' )
            {
            // InternalEntityDsl.g:2028:1: ( 'postTypeName' )
            // InternalEntityDsl.g:2029:2: 'postTypeName'
            {
             before(grammarAccess.getCustomPostTypeAccess().getPostTypeNameKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalEntityDsl.g:2038:1: rule__CustomPostType__Group__3 : rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 ;
    public final void rule__CustomPostType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2042:1: ( rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4 )
            // InternalEntityDsl.g:2043:2: rule__CustomPostType__Group__3__Impl rule__CustomPostType__Group__4
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
    // InternalEntityDsl.g:2050:1: rule__CustomPostType__Group__3__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2054:1: ( ( '=' ) )
            // InternalEntityDsl.g:2055:1: ( '=' )
            {
            // InternalEntityDsl.g:2055:1: ( '=' )
            // InternalEntityDsl.g:2056:2: '='
            {
             before(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:2065:1: rule__CustomPostType__Group__4 : rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 ;
    public final void rule__CustomPostType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2069:1: ( rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5 )
            // InternalEntityDsl.g:2070:2: rule__CustomPostType__Group__4__Impl rule__CustomPostType__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalEntityDsl.g:2077:1: rule__CustomPostType__Group__4__Impl : ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) ) ;
    public final void rule__CustomPostType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2081:1: ( ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) ) )
            // InternalEntityDsl.g:2082:1: ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:2082:1: ( ( rule__CustomPostType__PostTypeNameAssignment_4 ) )
            // InternalEntityDsl.g:2083:2: ( rule__CustomPostType__PostTypeNameAssignment_4 )
            {
             before(grammarAccess.getCustomPostTypeAccess().getPostTypeNameAssignment_4()); 
            // InternalEntityDsl.g:2084:2: ( rule__CustomPostType__PostTypeNameAssignment_4 )
            // InternalEntityDsl.g:2084:3: rule__CustomPostType__PostTypeNameAssignment_4
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
    // InternalEntityDsl.g:2092:1: rule__CustomPostType__Group__5 : rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 ;
    public final void rule__CustomPostType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2096:1: ( rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6 )
            // InternalEntityDsl.g:2097:2: rule__CustomPostType__Group__5__Impl rule__CustomPostType__Group__6
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
    // InternalEntityDsl.g:2104:1: rule__CustomPostType__Group__5__Impl : ( 'supports' ) ;
    public final void rule__CustomPostType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2108:1: ( ( 'supports' ) )
            // InternalEntityDsl.g:2109:1: ( 'supports' )
            {
            // InternalEntityDsl.g:2109:1: ( 'supports' )
            // InternalEntityDsl.g:2110:2: 'supports'
            {
             before(grammarAccess.getCustomPostTypeAccess().getSupportsKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalEntityDsl.g:2119:1: rule__CustomPostType__Group__6 : rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 ;
    public final void rule__CustomPostType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2123:1: ( rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7 )
            // InternalEntityDsl.g:2124:2: rule__CustomPostType__Group__6__Impl rule__CustomPostType__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalEntityDsl.g:2131:1: rule__CustomPostType__Group__6__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2135:1: ( ( '=' ) )
            // InternalEntityDsl.g:2136:1: ( '=' )
            {
            // InternalEntityDsl.g:2136:1: ( '=' )
            // InternalEntityDsl.g:2137:2: '='
            {
             before(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:2146:1: rule__CustomPostType__Group__7 : rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 ;
    public final void rule__CustomPostType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2150:1: ( rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8 )
            // InternalEntityDsl.g:2151:2: rule__CustomPostType__Group__7__Impl rule__CustomPostType__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalEntityDsl.g:2158:1: rule__CustomPostType__Group__7__Impl : ( ( rule__CustomPostType__SupportsAssignment_7 )? ) ;
    public final void rule__CustomPostType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2162:1: ( ( ( rule__CustomPostType__SupportsAssignment_7 )? ) )
            // InternalEntityDsl.g:2163:1: ( ( rule__CustomPostType__SupportsAssignment_7 )? )
            {
            // InternalEntityDsl.g:2163:1: ( ( rule__CustomPostType__SupportsAssignment_7 )? )
            // InternalEntityDsl.g:2164:2: ( rule__CustomPostType__SupportsAssignment_7 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getSupportsAssignment_7()); 
            // InternalEntityDsl.g:2165:2: ( rule__CustomPostType__SupportsAssignment_7 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEntityDsl.g:2165:3: rule__CustomPostType__SupportsAssignment_7
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
    // InternalEntityDsl.g:2173:1: rule__CustomPostType__Group__8 : rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 ;
    public final void rule__CustomPostType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2177:1: ( rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9 )
            // InternalEntityDsl.g:2178:2: rule__CustomPostType__Group__8__Impl rule__CustomPostType__Group__9
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
    // InternalEntityDsl.g:2185:1: rule__CustomPostType__Group__8__Impl : ( 'taxonomies' ) ;
    public final void rule__CustomPostType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2189:1: ( ( 'taxonomies' ) )
            // InternalEntityDsl.g:2190:1: ( 'taxonomies' )
            {
            // InternalEntityDsl.g:2190:1: ( 'taxonomies' )
            // InternalEntityDsl.g:2191:2: 'taxonomies'
            {
             before(grammarAccess.getCustomPostTypeAccess().getTaxonomiesKeyword_8()); 
            match(input,38,FOLLOW_2); 
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
    // InternalEntityDsl.g:2200:1: rule__CustomPostType__Group__9 : rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 ;
    public final void rule__CustomPostType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2204:1: ( rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10 )
            // InternalEntityDsl.g:2205:2: rule__CustomPostType__Group__9__Impl rule__CustomPostType__Group__10
            {
            pushFollow(FOLLOW_35);
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
    // InternalEntityDsl.g:2212:1: rule__CustomPostType__Group__9__Impl : ( '=' ) ;
    public final void rule__CustomPostType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2216:1: ( ( '=' ) )
            // InternalEntityDsl.g:2217:1: ( '=' )
            {
            // InternalEntityDsl.g:2217:1: ( '=' )
            // InternalEntityDsl.g:2218:2: '='
            {
             before(grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_9()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:2227:1: rule__CustomPostType__Group__10 : rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 ;
    public final void rule__CustomPostType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2231:1: ( rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11 )
            // InternalEntityDsl.g:2232:2: rule__CustomPostType__Group__10__Impl rule__CustomPostType__Group__11
            {
            pushFollow(FOLLOW_35);
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
    // InternalEntityDsl.g:2239:1: rule__CustomPostType__Group__10__Impl : ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? ) ;
    public final void rule__CustomPostType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2243:1: ( ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? ) )
            // InternalEntityDsl.g:2244:1: ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? )
            {
            // InternalEntityDsl.g:2244:1: ( ( rule__CustomPostType__TaxonomiesAssignment_10 )? )
            // InternalEntityDsl.g:2245:2: ( rule__CustomPostType__TaxonomiesAssignment_10 )?
            {
             before(grammarAccess.getCustomPostTypeAccess().getTaxonomiesAssignment_10()); 
            // InternalEntityDsl.g:2246:2: ( rule__CustomPostType__TaxonomiesAssignment_10 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEntityDsl.g:2246:3: rule__CustomPostType__TaxonomiesAssignment_10
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
    // InternalEntityDsl.g:2254:1: rule__CustomPostType__Group__11 : rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12 ;
    public final void rule__CustomPostType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2258:1: ( rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12 )
            // InternalEntityDsl.g:2259:2: rule__CustomPostType__Group__11__Impl rule__CustomPostType__Group__12
            {
            pushFollow(FOLLOW_36);
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
    // InternalEntityDsl.g:2266:1: rule__CustomPostType__Group__11__Impl : ( 'registerPostType()' ) ;
    public final void rule__CustomPostType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2270:1: ( ( 'registerPostType()' ) )
            // InternalEntityDsl.g:2271:1: ( 'registerPostType()' )
            {
            // InternalEntityDsl.g:2271:1: ( 'registerPostType()' )
            // InternalEntityDsl.g:2272:2: 'registerPostType()'
            {
             before(grammarAccess.getCustomPostTypeAccess().getRegisterPostTypeKeyword_11()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getRegisterPostTypeKeyword_11()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2281:1: rule__CustomPostType__Group__12 : rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13 ;
    public final void rule__CustomPostType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2285:1: ( rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13 )
            // InternalEntityDsl.g:2286:2: rule__CustomPostType__Group__12__Impl rule__CustomPostType__Group__13
            {
            pushFollow(FOLLOW_30);
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
    // InternalEntityDsl.g:2293:1: rule__CustomPostType__Group__12__Impl : ( 'configurePostType()' ) ;
    public final void rule__CustomPostType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2297:1: ( ( 'configurePostType()' ) )
            // InternalEntityDsl.g:2298:1: ( 'configurePostType()' )
            {
            // InternalEntityDsl.g:2298:1: ( 'configurePostType()' )
            // InternalEntityDsl.g:2299:2: 'configurePostType()'
            {
             before(grammarAccess.getCustomPostTypeAccess().getConfigurePostTypeKeyword_12()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCustomPostTypeAccess().getConfigurePostTypeKeyword_12()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2308:1: rule__CustomPostType__Group__13 : rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14 ;
    public final void rule__CustomPostType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2312:1: ( rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14 )
            // InternalEntityDsl.g:2313:2: rule__CustomPostType__Group__13__Impl rule__CustomPostType__Group__14
            {
            pushFollow(FOLLOW_30);
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
    // InternalEntityDsl.g:2320:1: rule__CustomPostType__Group__13__Impl : ( ( rule__CustomPostType__HooksAssignment_13 )* ) ;
    public final void rule__CustomPostType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2324:1: ( ( ( rule__CustomPostType__HooksAssignment_13 )* ) )
            // InternalEntityDsl.g:2325:1: ( ( rule__CustomPostType__HooksAssignment_13 )* )
            {
            // InternalEntityDsl.g:2325:1: ( ( rule__CustomPostType__HooksAssignment_13 )* )
            // InternalEntityDsl.g:2326:2: ( rule__CustomPostType__HooksAssignment_13 )*
            {
             before(grammarAccess.getCustomPostTypeAccess().getHooksAssignment_13()); 
            // InternalEntityDsl.g:2327:2: ( rule__CustomPostType__HooksAssignment_13 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEntityDsl.g:2327:3: rule__CustomPostType__HooksAssignment_13
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__CustomPostType__HooksAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCustomPostTypeAccess().getHooksAssignment_13()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2335:1: rule__CustomPostType__Group__14 : rule__CustomPostType__Group__14__Impl ;
    public final void rule__CustomPostType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2339:1: ( rule__CustomPostType__Group__14__Impl )
            // InternalEntityDsl.g:2340:2: rule__CustomPostType__Group__14__Impl
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
    // InternalEntityDsl.g:2346:1: rule__CustomPostType__Group__14__Impl : ( '}' ) ;
    public final void rule__CustomPostType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2350:1: ( ( '}' ) )
            // InternalEntityDsl.g:2351:1: ( '}' )
            {
            // InternalEntityDsl.g:2351:1: ( '}' )
            // InternalEntityDsl.g:2352:2: '}'
            {
             before(grammarAccess.getCustomPostTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Hook__Group__0"
    // InternalEntityDsl.g:2362:1: rule__Hook__Group__0 : rule__Hook__Group__0__Impl rule__Hook__Group__1 ;
    public final void rule__Hook__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2366:1: ( rule__Hook__Group__0__Impl rule__Hook__Group__1 )
            // InternalEntityDsl.g:2367:2: rule__Hook__Group__0__Impl rule__Hook__Group__1
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
    // InternalEntityDsl.g:2374:1: rule__Hook__Group__0__Impl : ( 'Hook' ) ;
    public final void rule__Hook__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2378:1: ( ( 'Hook' ) )
            // InternalEntityDsl.g:2379:1: ( 'Hook' )
            {
            // InternalEntityDsl.g:2379:1: ( 'Hook' )
            // InternalEntityDsl.g:2380:2: 'Hook'
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
    // InternalEntityDsl.g:2389:1: rule__Hook__Group__1 : rule__Hook__Group__1__Impl rule__Hook__Group__2 ;
    public final void rule__Hook__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2393:1: ( rule__Hook__Group__1__Impl rule__Hook__Group__2 )
            // InternalEntityDsl.g:2394:2: rule__Hook__Group__1__Impl rule__Hook__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalEntityDsl.g:2401:1: rule__Hook__Group__1__Impl : ( '{' ) ;
    public final void rule__Hook__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2405:1: ( ( '{' ) )
            // InternalEntityDsl.g:2406:1: ( '{' )
            {
            // InternalEntityDsl.g:2406:1: ( '{' )
            // InternalEntityDsl.g:2407:2: '{'
            {
             before(grammarAccess.getHookAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEntityDsl.g:2416:1: rule__Hook__Group__2 : rule__Hook__Group__2__Impl rule__Hook__Group__3 ;
    public final void rule__Hook__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2420:1: ( rule__Hook__Group__2__Impl rule__Hook__Group__3 )
            // InternalEntityDsl.g:2421:2: rule__Hook__Group__2__Impl rule__Hook__Group__3
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
    // InternalEntityDsl.g:2428:1: rule__Hook__Group__2__Impl : ( 'hookName' ) ;
    public final void rule__Hook__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2432:1: ( ( 'hookName' ) )
            // InternalEntityDsl.g:2433:1: ( 'hookName' )
            {
            // InternalEntityDsl.g:2433:1: ( 'hookName' )
            // InternalEntityDsl.g:2434:2: 'hookName'
            {
             before(grammarAccess.getHookAccess().getHookNameKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getHookNameKeyword_2()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2443:1: rule__Hook__Group__3 : rule__Hook__Group__3__Impl rule__Hook__Group__4 ;
    public final void rule__Hook__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2447:1: ( rule__Hook__Group__3__Impl rule__Hook__Group__4 )
            // InternalEntityDsl.g:2448:2: rule__Hook__Group__3__Impl rule__Hook__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalEntityDsl.g:2455:1: rule__Hook__Group__3__Impl : ( '=' ) ;
    public final void rule__Hook__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2459:1: ( ( '=' ) )
            // InternalEntityDsl.g:2460:1: ( '=' )
            {
            // InternalEntityDsl.g:2460:1: ( '=' )
            // InternalEntityDsl.g:2461:2: '='
            {
             before(grammarAccess.getHookAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:2470:1: rule__Hook__Group__4 : rule__Hook__Group__4__Impl rule__Hook__Group__5 ;
    public final void rule__Hook__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2474:1: ( rule__Hook__Group__4__Impl rule__Hook__Group__5 )
            // InternalEntityDsl.g:2475:2: rule__Hook__Group__4__Impl rule__Hook__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalEntityDsl.g:2482:1: rule__Hook__Group__4__Impl : ( ( rule__Hook__HookNameAssignment_4 ) ) ;
    public final void rule__Hook__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2486:1: ( ( ( rule__Hook__HookNameAssignment_4 ) ) )
            // InternalEntityDsl.g:2487:1: ( ( rule__Hook__HookNameAssignment_4 ) )
            {
            // InternalEntityDsl.g:2487:1: ( ( rule__Hook__HookNameAssignment_4 ) )
            // InternalEntityDsl.g:2488:2: ( rule__Hook__HookNameAssignment_4 )
            {
             before(grammarAccess.getHookAccess().getHookNameAssignment_4()); 
            // InternalEntityDsl.g:2489:2: ( rule__Hook__HookNameAssignment_4 )
            // InternalEntityDsl.g:2489:3: rule__Hook__HookNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Hook__HookNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHookAccess().getHookNameAssignment_4()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2497:1: rule__Hook__Group__5 : rule__Hook__Group__5__Impl rule__Hook__Group__6 ;
    public final void rule__Hook__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2501:1: ( rule__Hook__Group__5__Impl rule__Hook__Group__6 )
            // InternalEntityDsl.g:2502:2: rule__Hook__Group__5__Impl rule__Hook__Group__6
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
    // InternalEntityDsl.g:2509:1: rule__Hook__Group__5__Impl : ( 'callbackFunction' ) ;
    public final void rule__Hook__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2513:1: ( ( 'callbackFunction' ) )
            // InternalEntityDsl.g:2514:1: ( 'callbackFunction' )
            {
            // InternalEntityDsl.g:2514:1: ( 'callbackFunction' )
            // InternalEntityDsl.g:2515:2: 'callbackFunction'
            {
             before(grammarAccess.getHookAccess().getCallbackFunctionKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getCallbackFunctionKeyword_5()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2524:1: rule__Hook__Group__6 : rule__Hook__Group__6__Impl rule__Hook__Group__7 ;
    public final void rule__Hook__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2528:1: ( rule__Hook__Group__6__Impl rule__Hook__Group__7 )
            // InternalEntityDsl.g:2529:2: rule__Hook__Group__6__Impl rule__Hook__Group__7
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
    // InternalEntityDsl.g:2536:1: rule__Hook__Group__6__Impl : ( '=' ) ;
    public final void rule__Hook__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2540:1: ( ( '=' ) )
            // InternalEntityDsl.g:2541:1: ( '=' )
            {
            // InternalEntityDsl.g:2541:1: ( '=' )
            // InternalEntityDsl.g:2542:2: '='
            {
             before(grammarAccess.getHookAccess().getEqualsSignKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:2551:1: rule__Hook__Group__7 : rule__Hook__Group__7__Impl rule__Hook__Group__8 ;
    public final void rule__Hook__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2555:1: ( rule__Hook__Group__7__Impl rule__Hook__Group__8 )
            // InternalEntityDsl.g:2556:2: rule__Hook__Group__7__Impl rule__Hook__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalEntityDsl.g:2563:1: rule__Hook__Group__7__Impl : ( ( rule__Hook__CallbackFunctionAssignment_7 ) ) ;
    public final void rule__Hook__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2567:1: ( ( ( rule__Hook__CallbackFunctionAssignment_7 ) ) )
            // InternalEntityDsl.g:2568:1: ( ( rule__Hook__CallbackFunctionAssignment_7 ) )
            {
            // InternalEntityDsl.g:2568:1: ( ( rule__Hook__CallbackFunctionAssignment_7 ) )
            // InternalEntityDsl.g:2569:2: ( rule__Hook__CallbackFunctionAssignment_7 )
            {
             before(grammarAccess.getHookAccess().getCallbackFunctionAssignment_7()); 
            // InternalEntityDsl.g:2570:2: ( rule__Hook__CallbackFunctionAssignment_7 )
            // InternalEntityDsl.g:2570:3: rule__Hook__CallbackFunctionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Hook__CallbackFunctionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getHookAccess().getCallbackFunctionAssignment_7()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2578:1: rule__Hook__Group__8 : rule__Hook__Group__8__Impl rule__Hook__Group__9 ;
    public final void rule__Hook__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2582:1: ( rule__Hook__Group__8__Impl rule__Hook__Group__9 )
            // InternalEntityDsl.g:2583:2: rule__Hook__Group__8__Impl rule__Hook__Group__9
            {
            pushFollow(FOLLOW_40);
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
    // InternalEntityDsl.g:2590:1: rule__Hook__Group__8__Impl : ( 'addAction()' ) ;
    public final void rule__Hook__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2594:1: ( ( 'addAction()' ) )
            // InternalEntityDsl.g:2595:1: ( 'addAction()' )
            {
            // InternalEntityDsl.g:2595:1: ( 'addAction()' )
            // InternalEntityDsl.g:2596:2: 'addAction()'
            {
             before(grammarAccess.getHookAccess().getAddActionKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getAddActionKeyword_8()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2605:1: rule__Hook__Group__9 : rule__Hook__Group__9__Impl rule__Hook__Group__10 ;
    public final void rule__Hook__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2609:1: ( rule__Hook__Group__9__Impl rule__Hook__Group__10 )
            // InternalEntityDsl.g:2610:2: rule__Hook__Group__9__Impl rule__Hook__Group__10
            {
            pushFollow(FOLLOW_41);
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
    // InternalEntityDsl.g:2617:1: rule__Hook__Group__9__Impl : ( 'addFilter()' ) ;
    public final void rule__Hook__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2621:1: ( ( 'addFilter()' ) )
            // InternalEntityDsl.g:2622:1: ( 'addFilter()' )
            {
            // InternalEntityDsl.g:2622:1: ( 'addFilter()' )
            // InternalEntityDsl.g:2623:2: 'addFilter()'
            {
             before(grammarAccess.getHookAccess().getAddFilterKeyword_9()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getAddFilterKeyword_9()); 

            }


            }

        }
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
    // InternalEntityDsl.g:2632:1: rule__Hook__Group__10 : rule__Hook__Group__10__Impl ;
    public final void rule__Hook__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2636:1: ( rule__Hook__Group__10__Impl )
            // InternalEntityDsl.g:2637:2: rule__Hook__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hook__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalEntityDsl.g:2643:1: rule__Hook__Group__10__Impl : ( '}' ) ;
    public final void rule__Hook__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2647:1: ( ( '}' ) )
            // InternalEntityDsl.g:2648:1: ( '}' )
            {
            // InternalEntityDsl.g:2648:1: ( '}' )
            // InternalEntityDsl.g:2649:2: '}'
            {
             before(grammarAccess.getHookAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__Plugin__NameAssignment_4"
    // InternalEntityDsl.g:2659:1: rule__Plugin__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Plugin__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2663:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2664:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2664:2: ( RULE_STRING )
            // InternalEntityDsl.g:2665:3: RULE_STRING
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
    // InternalEntityDsl.g:2674:1: rule__Plugin__VersionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Plugin__VersionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2678:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2679:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2679:2: ( RULE_STRING )
            // InternalEntityDsl.g:2680:3: RULE_STRING
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
    // InternalEntityDsl.g:2689:1: rule__Plugin__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Plugin__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2693:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2694:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2694:2: ( RULE_STRING )
            // InternalEntityDsl.g:2695:3: RULE_STRING
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
    // InternalEntityDsl.g:2704:1: rule__Plugin__AuthorAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Plugin__AuthorAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2708:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2709:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2709:2: ( RULE_STRING )
            // InternalEntityDsl.g:2710:3: RULE_STRING
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
    // InternalEntityDsl.g:2719:1: rule__Plugin__LicenseAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Plugin__LicenseAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2723:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2724:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2724:2: ( RULE_STRING )
            // InternalEntityDsl.g:2725:3: RULE_STRING
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
    // InternalEntityDsl.g:2734:1: rule__Plugin__PrefixAssignment_19 : ( RULE_STRING ) ;
    public final void rule__Plugin__PrefixAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2738:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2739:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2739:2: ( RULE_STRING )
            // InternalEntityDsl.g:2740:3: RULE_STRING
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
    // InternalEntityDsl.g:2749:1: rule__Plugin__TextDomainAssignment_22 : ( RULE_STRING ) ;
    public final void rule__Plugin__TextDomainAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2753:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2754:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2754:2: ( RULE_STRING )
            // InternalEntityDsl.g:2755:3: RULE_STRING
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
    // InternalEntityDsl.g:2764:1: rule__Plugin__ActivateAssignment_25 : ( RULE_STRING ) ;
    public final void rule__Plugin__ActivateAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2768:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2769:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2769:2: ( RULE_STRING )
            // InternalEntityDsl.g:2770:3: RULE_STRING
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
    // InternalEntityDsl.g:2779:1: rule__Plugin__DeactivateAssignment_28 : ( RULE_STRING ) ;
    public final void rule__Plugin__DeactivateAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2783:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2784:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2784:2: ( RULE_STRING )
            // InternalEntityDsl.g:2785:3: RULE_STRING
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


    // $ANTLR start "rule__Plugin__WidgetsAssignment_29"
    // InternalEntityDsl.g:2794:1: rule__Plugin__WidgetsAssignment_29 : ( ruleWidget ) ;
    public final void rule__Plugin__WidgetsAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2798:1: ( ( ruleWidget ) )
            // InternalEntityDsl.g:2799:2: ( ruleWidget )
            {
            // InternalEntityDsl.g:2799:2: ( ruleWidget )
            // InternalEntityDsl.g:2800:3: ruleWidget
            {
             before(grammarAccess.getPluginAccess().getWidgetsWidgetParserRuleCall_29_0()); 
            pushFollow(FOLLOW_2);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getWidgetsWidgetParserRuleCall_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__WidgetsAssignment_29"


    // $ANTLR start "rule__Plugin__ShortcodesAssignment_30"
    // InternalEntityDsl.g:2809:1: rule__Plugin__ShortcodesAssignment_30 : ( ruleShortcode ) ;
    public final void rule__Plugin__ShortcodesAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2813:1: ( ( ruleShortcode ) )
            // InternalEntityDsl.g:2814:2: ( ruleShortcode )
            {
            // InternalEntityDsl.g:2814:2: ( ruleShortcode )
            // InternalEntityDsl.g:2815:3: ruleShortcode
            {
             before(grammarAccess.getPluginAccess().getShortcodesShortcodeParserRuleCall_30_0()); 
            pushFollow(FOLLOW_2);
            ruleShortcode();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getShortcodesShortcodeParserRuleCall_30_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__ShortcodesAssignment_30"


    // $ANTLR start "rule__Plugin__CustomPostTypesAssignment_31"
    // InternalEntityDsl.g:2824:1: rule__Plugin__CustomPostTypesAssignment_31 : ( ruleCustomPostType ) ;
    public final void rule__Plugin__CustomPostTypesAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2828:1: ( ( ruleCustomPostType ) )
            // InternalEntityDsl.g:2829:2: ( ruleCustomPostType )
            {
            // InternalEntityDsl.g:2829:2: ( ruleCustomPostType )
            // InternalEntityDsl.g:2830:3: ruleCustomPostType
            {
             before(grammarAccess.getPluginAccess().getCustomPostTypesCustomPostTypeParserRuleCall_31_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomPostType();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getCustomPostTypesCustomPostTypeParserRuleCall_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__CustomPostTypesAssignment_31"


    // $ANTLR start "rule__Plugin__SettingsAssignment_32"
    // InternalEntityDsl.g:2839:1: rule__Plugin__SettingsAssignment_32 : ( ruleSetting ) ;
    public final void rule__Plugin__SettingsAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2843:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:2844:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:2844:2: ( ruleSetting )
            // InternalEntityDsl.g:2845:3: ruleSetting
            {
             before(grammarAccess.getPluginAccess().getSettingsSettingParserRuleCall_32_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getSettingsSettingParserRuleCall_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__SettingsAssignment_32"


    // $ANTLR start "rule__Widget__WidgetNameAssignment_4"
    // InternalEntityDsl.g:2854:1: rule__Widget__WidgetNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2858:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2859:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2859:2: ( RULE_STRING )
            // InternalEntityDsl.g:2860:3: RULE_STRING
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
    // InternalEntityDsl.g:2869:1: rule__Widget__WidgetDescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Widget__WidgetDescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2873:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2874:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2874:2: ( RULE_STRING )
            // InternalEntityDsl.g:2875:3: RULE_STRING
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
    // InternalEntityDsl.g:2884:1: rule__Widget__SettingsAssignment_8 : ( ruleSetting ) ;
    public final void rule__Widget__SettingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2888:1: ( ( ruleSetting ) )
            // InternalEntityDsl.g:2889:2: ( ruleSetting )
            {
            // InternalEntityDsl.g:2889:2: ( ruleSetting )
            // InternalEntityDsl.g:2890:3: ruleSetting
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


    // $ANTLR start "rule__Setting__SettingNameAssignment_4"
    // InternalEntityDsl.g:2899:1: rule__Setting__SettingNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2903:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2904:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2904:2: ( RULE_STRING )
            // InternalEntityDsl.g:2905:3: RULE_STRING
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
    // InternalEntityDsl.g:2914:1: rule__Setting__SettingTypeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Setting__SettingTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2918:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2919:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2919:2: ( RULE_STRING )
            // InternalEntityDsl.g:2920:3: RULE_STRING
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
    // InternalEntityDsl.g:2929:1: rule__Setting__DefaultValueAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Setting__DefaultValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2933:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2934:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2934:2: ( RULE_STRING )
            // InternalEntityDsl.g:2935:3: RULE_STRING
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


    // $ANTLR start "rule__Shortcode__ShortcodeNameAssignment_4"
    // InternalEntityDsl.g:2944:1: rule__Shortcode__ShortcodeNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Shortcode__ShortcodeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2948:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2949:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2949:2: ( RULE_STRING )
            // InternalEntityDsl.g:2950:3: RULE_STRING
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


    // $ANTLR start "rule__Shortcode__HooksAssignment_7"
    // InternalEntityDsl.g:2959:1: rule__Shortcode__HooksAssignment_7 : ( ruleHook ) ;
    public final void rule__Shortcode__HooksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2963:1: ( ( ruleHook ) )
            // InternalEntityDsl.g:2964:2: ( ruleHook )
            {
            // InternalEntityDsl.g:2964:2: ( ruleHook )
            // InternalEntityDsl.g:2965:3: ruleHook
            {
             before(grammarAccess.getShortcodeAccess().getHooksHookParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleHook();

            state._fsp--;

             after(grammarAccess.getShortcodeAccess().getHooksHookParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shortcode__HooksAssignment_7"


    // $ANTLR start "rule__CustomPostType__PostTypeNameAssignment_4"
    // InternalEntityDsl.g:2974:1: rule__CustomPostType__PostTypeNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__PostTypeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2978:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2979:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2979:2: ( RULE_STRING )
            // InternalEntityDsl.g:2980:3: RULE_STRING
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
    // InternalEntityDsl.g:2989:1: rule__CustomPostType__SupportsAssignment_7 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__SupportsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2993:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2994:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2994:2: ( RULE_STRING )
            // InternalEntityDsl.g:2995:3: RULE_STRING
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
    // InternalEntityDsl.g:3004:1: rule__CustomPostType__TaxonomiesAssignment_10 : ( RULE_STRING ) ;
    public final void rule__CustomPostType__TaxonomiesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3008:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3009:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3009:2: ( RULE_STRING )
            // InternalEntityDsl.g:3010:3: RULE_STRING
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


    // $ANTLR start "rule__CustomPostType__HooksAssignment_13"
    // InternalEntityDsl.g:3019:1: rule__CustomPostType__HooksAssignment_13 : ( ruleHook ) ;
    public final void rule__CustomPostType__HooksAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3023:1: ( ( ruleHook ) )
            // InternalEntityDsl.g:3024:2: ( ruleHook )
            {
            // InternalEntityDsl.g:3024:2: ( ruleHook )
            // InternalEntityDsl.g:3025:3: ruleHook
            {
             before(grammarAccess.getCustomPostTypeAccess().getHooksHookParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleHook();

            state._fsp--;

             after(grammarAccess.getCustomPostTypeAccess().getHooksHookParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPostType__HooksAssignment_13"


    // $ANTLR start "rule__Hook__HookNameAssignment_4"
    // InternalEntityDsl.g:3034:1: rule__Hook__HookNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Hook__HookNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3038:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3039:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3039:2: ( RULE_STRING )
            // InternalEntityDsl.g:3040:3: RULE_STRING
            {
             before(grammarAccess.getHookAccess().getHookNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getHookNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__HookNameAssignment_4"


    // $ANTLR start "rule__Hook__CallbackFunctionAssignment_7"
    // InternalEntityDsl.g:3049:1: rule__Hook__CallbackFunctionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Hook__CallbackFunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3053:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3054:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3054:2: ( RULE_STRING )
            // InternalEntityDsl.g:3055:3: RULE_STRING
            {
             before(grammarAccess.getHookAccess().getCallbackFunctionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHookAccess().getCallbackFunctionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hook__CallbackFunctionAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000889800010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800000L});

}