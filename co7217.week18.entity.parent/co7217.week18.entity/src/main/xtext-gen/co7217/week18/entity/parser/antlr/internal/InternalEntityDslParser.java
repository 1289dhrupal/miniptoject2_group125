package co7217.week18.entity.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co7217.week18.entity.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Plugin'", "'{'", "'name'", "'='", "'version'", "'description'", "'author'", "'license'", "'prefix'", "'textDomain'", "'activate'", "'deactivate'", "'uninstall'", "'}'", "'Widget'", "'widgetName'", "'widgetDescription'", "'Shortcode'", "'shortcodeName'", "'CustomPostType'", "'postTypeName'", "'supports'", "'taxonomies'", "'Setting'", "'settingName'", "'settingType'", "'defaultValue'", "'Hook'", "'hookType'", "'hookName'", "'callback'", "'priority'", "'acceptedArgs'", "'filter'", "'action'"
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

        public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Plugin";
       	}

       	@Override
       	protected EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlugin"
    // InternalEntityDsl.g:65:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // InternalEntityDsl.g:65:47: (iv_rulePlugin= rulePlugin EOF )
            // InternalEntityDsl.g:66:2: iv_rulePlugin= rulePlugin EOF
            {
             newCompositeNode(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlugin=rulePlugin();

            state._fsp--;

             current =iv_rulePlugin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlugin"


    // $ANTLR start "rulePlugin"
    // InternalEntityDsl.g:72:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? ( (lv_widgets_32_0= ruleWidget ) )* ( (lv_shortcodes_33_0= ruleShortcode ) )* ( (lv_customPostTypes_34_0= ruleCustomPostType ) )* ( (lv_settings_35_0= ruleSetting ) )* ( (lv_hooks_36_0= ruleHook ) )* otherlv_37= '}' ) ;
    public final EObject rulePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_version_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_author_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_license_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_prefix_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_textDomain_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_activate_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_deactivate_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_uninstall_31_0=null;
        Token otherlv_37=null;
        EObject lv_widgets_32_0 = null;

        EObject lv_shortcodes_33_0 = null;

        EObject lv_customPostTypes_34_0 = null;

        EObject lv_settings_35_0 = null;

        EObject lv_hooks_36_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:78:2: ( (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? ( (lv_widgets_32_0= ruleWidget ) )* ( (lv_shortcodes_33_0= ruleShortcode ) )* ( (lv_customPostTypes_34_0= ruleCustomPostType ) )* ( (lv_settings_35_0= ruleSetting ) )* ( (lv_hooks_36_0= ruleHook ) )* otherlv_37= '}' ) )
            // InternalEntityDsl.g:79:2: (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? ( (lv_widgets_32_0= ruleWidget ) )* ( (lv_shortcodes_33_0= ruleShortcode ) )* ( (lv_customPostTypes_34_0= ruleCustomPostType ) )* ( (lv_settings_35_0= ruleSetting ) )* ( (lv_hooks_36_0= ruleHook ) )* otherlv_37= '}' )
            {
            // InternalEntityDsl.g:79:2: (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? ( (lv_widgets_32_0= ruleWidget ) )* ( (lv_shortcodes_33_0= ruleShortcode ) )* ( (lv_customPostTypes_34_0= ruleCustomPostType ) )* ( (lv_settings_35_0= ruleSetting ) )* ( (lv_hooks_36_0= ruleHook ) )* otherlv_37= '}' )
            // InternalEntityDsl.g:80:3: otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? ( (lv_widgets_32_0= ruleWidget ) )* ( (lv_shortcodes_33_0= ruleShortcode ) )* ( (lv_customPostTypes_34_0= ruleCustomPostType ) )* ( (lv_settings_35_0= ruleSetting ) )* ( (lv_hooks_36_0= ruleHook ) )* otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPluginAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:96:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:97:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:97:4: (lv_name_4_0= RULE_STRING )
            // InternalEntityDsl.g:98:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPluginAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getVersionKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getPluginAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:122:3: ( (lv_version_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:123:4: (lv_version_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:123:4: (lv_version_7_0= RULE_STRING )
            // InternalEntityDsl.g:124:5: lv_version_7_0= RULE_STRING
            {
            lv_version_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_version_7_0, grammarAccess.getPluginAccess().getVersionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getPluginAccess().getDescriptionKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getPluginAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:148:3: ( (lv_description_10_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEntityDsl.g:149:4: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:149:4: (lv_description_10_0= RULE_STRING )
                    // InternalEntityDsl.g:150:5: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    					newLeafNode(lv_description_10_0, grammarAccess.getPluginAccess().getDescriptionSTRINGTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_10_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getPluginAccess().getAuthorKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getPluginAccess().getEqualsSignKeyword_12());
            		
            // InternalEntityDsl.g:174:3: ( (lv_author_13_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:175:4: (lv_author_13_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:175:4: (lv_author_13_0= RULE_STRING )
                    // InternalEntityDsl.g:176:5: lv_author_13_0= RULE_STRING
                    {
                    lv_author_13_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    					newLeafNode(lv_author_13_0, grammarAccess.getPluginAccess().getAuthorSTRINGTerminalRuleCall_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"author",
                    						lv_author_13_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getPluginAccess().getLicenseKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getPluginAccess().getEqualsSignKeyword_15());
            		
            // InternalEntityDsl.g:200:3: ( (lv_license_16_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:201:4: (lv_license_16_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:201:4: (lv_license_16_0= RULE_STRING )
                    // InternalEntityDsl.g:202:5: lv_license_16_0= RULE_STRING
                    {
                    lv_license_16_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    					newLeafNode(lv_license_16_0, grammarAccess.getPluginAccess().getLicenseSTRINGTerminalRuleCall_16_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"license",
                    						lv_license_16_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getPluginAccess().getPrefixKeyword_17());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_18, grammarAccess.getPluginAccess().getEqualsSignKeyword_18());
            		
            // InternalEntityDsl.g:226:3: ( (lv_prefix_19_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:227:4: (lv_prefix_19_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:227:4: (lv_prefix_19_0= RULE_STRING )
                    // InternalEntityDsl.g:228:5: lv_prefix_19_0= RULE_STRING
                    {
                    lv_prefix_19_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_prefix_19_0, grammarAccess.getPluginAccess().getPrefixSTRINGTerminalRuleCall_19_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"prefix",
                    						lv_prefix_19_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_20, grammarAccess.getPluginAccess().getTextDomainKeyword_20());
            		
            otherlv_21=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_21, grammarAccess.getPluginAccess().getEqualsSignKeyword_21());
            		
            // InternalEntityDsl.g:252:3: ( (lv_textDomain_22_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:253:4: (lv_textDomain_22_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:253:4: (lv_textDomain_22_0= RULE_STRING )
                    // InternalEntityDsl.g:254:5: lv_textDomain_22_0= RULE_STRING
                    {
                    lv_textDomain_22_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    					newLeafNode(lv_textDomain_22_0, grammarAccess.getPluginAccess().getTextDomainSTRINGTerminalRuleCall_22_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"textDomain",
                    						lv_textDomain_22_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_23, grammarAccess.getPluginAccess().getActivateKeyword_23());
            		
            otherlv_24=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_24, grammarAccess.getPluginAccess().getEqualsSignKeyword_24());
            		
            // InternalEntityDsl.g:278:3: ( (lv_activate_25_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:279:4: (lv_activate_25_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:279:4: (lv_activate_25_0= RULE_STRING )
                    // InternalEntityDsl.g:280:5: lv_activate_25_0= RULE_STRING
                    {
                    lv_activate_25_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    					newLeafNode(lv_activate_25_0, grammarAccess.getPluginAccess().getActivateSTRINGTerminalRuleCall_25_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"activate",
                    						lv_activate_25_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_26, grammarAccess.getPluginAccess().getDeactivateKeyword_26());
            		
            otherlv_27=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_27, grammarAccess.getPluginAccess().getEqualsSignKeyword_27());
            		
            // InternalEntityDsl.g:304:3: ( (lv_deactivate_28_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:305:4: (lv_deactivate_28_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:305:4: (lv_deactivate_28_0= RULE_STRING )
                    // InternalEntityDsl.g:306:5: lv_deactivate_28_0= RULE_STRING
                    {
                    lv_deactivate_28_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    					newLeafNode(lv_deactivate_28_0, grammarAccess.getPluginAccess().getDeactivateSTRINGTerminalRuleCall_28_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"deactivate",
                    						lv_deactivate_28_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_29, grammarAccess.getPluginAccess().getUninstallKeyword_29());
            		
            otherlv_30=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_30, grammarAccess.getPluginAccess().getEqualsSignKeyword_30());
            		
            // InternalEntityDsl.g:330:3: ( (lv_uninstall_31_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntityDsl.g:331:4: (lv_uninstall_31_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:331:4: (lv_uninstall_31_0= RULE_STRING )
                    // InternalEntityDsl.g:332:5: lv_uninstall_31_0= RULE_STRING
                    {
                    lv_uninstall_31_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    					newLeafNode(lv_uninstall_31_0, grammarAccess.getPluginAccess().getUninstallSTRINGTerminalRuleCall_31_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"uninstall",
                    						lv_uninstall_31_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalEntityDsl.g:348:3: ( (lv_widgets_32_0= ruleWidget ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:349:4: (lv_widgets_32_0= ruleWidget )
            	    {
            	    // InternalEntityDsl.g:349:4: (lv_widgets_32_0= ruleWidget )
            	    // InternalEntityDsl.g:350:5: lv_widgets_32_0= ruleWidget
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getWidgetsWidgetParserRuleCall_32_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_widgets_32_0=ruleWidget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"widgets",
            	    						lv_widgets_32_0,
            	    						"co7217.week18.entity.EntityDsl.Widget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalEntityDsl.g:367:3: ( (lv_shortcodes_33_0= ruleShortcode ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEntityDsl.g:368:4: (lv_shortcodes_33_0= ruleShortcode )
            	    {
            	    // InternalEntityDsl.g:368:4: (lv_shortcodes_33_0= ruleShortcode )
            	    // InternalEntityDsl.g:369:5: lv_shortcodes_33_0= ruleShortcode
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getShortcodesShortcodeParserRuleCall_33_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_shortcodes_33_0=ruleShortcode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shortcodes",
            	    						lv_shortcodes_33_0,
            	    						"co7217.week18.entity.EntityDsl.Shortcode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalEntityDsl.g:386:3: ( (lv_customPostTypes_34_0= ruleCustomPostType ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEntityDsl.g:387:4: (lv_customPostTypes_34_0= ruleCustomPostType )
            	    {
            	    // InternalEntityDsl.g:387:4: (lv_customPostTypes_34_0= ruleCustomPostType )
            	    // InternalEntityDsl.g:388:5: lv_customPostTypes_34_0= ruleCustomPostType
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getCustomPostTypesCustomPostTypeParserRuleCall_34_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_customPostTypes_34_0=ruleCustomPostType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customPostTypes",
            	    						lv_customPostTypes_34_0,
            	    						"co7217.week18.entity.EntityDsl.CustomPostType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalEntityDsl.g:405:3: ( (lv_settings_35_0= ruleSetting ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDsl.g:406:4: (lv_settings_35_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:406:4: (lv_settings_35_0= ruleSetting )
            	    // InternalEntityDsl.g:407:5: lv_settings_35_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getSettingsSettingParserRuleCall_35_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_settings_35_0=ruleSetting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"settings",
            	    						lv_settings_35_0,
            	    						"co7217.week18.entity.EntityDsl.Setting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalEntityDsl.g:424:3: ( (lv_hooks_36_0= ruleHook ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEntityDsl.g:425:4: (lv_hooks_36_0= ruleHook )
            	    {
            	    // InternalEntityDsl.g:425:4: (lv_hooks_36_0= ruleHook )
            	    // InternalEntityDsl.g:426:5: lv_hooks_36_0= ruleHook
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getHooksHookParserRuleCall_36_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_hooks_36_0=ruleHook();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hooks",
            	    						lv_hooks_36_0,
            	    						"co7217.week18.entity.EntityDsl.Hook");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_37=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_37());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlugin"


    // $ANTLR start "entryRuleWidget"
    // InternalEntityDsl.g:451:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalEntityDsl.g:451:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalEntityDsl.g:452:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalEntityDsl.g:458:1: ruleWidget returns [EObject current=null] : (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_widgetName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_widgetDescription_7_0=null;
        Token otherlv_9=null;
        EObject lv_settings_8_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:464:2: ( (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' ) )
            // InternalEntityDsl.g:465:2: (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' )
            {
            // InternalEntityDsl.g:465:2: (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' )
            // InternalEntityDsl.g:466:3: otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetAccess().getWidgetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetAccess().getWidgetNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:482:3: ( (lv_widgetName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:483:4: (lv_widgetName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:483:4: (lv_widgetName_4_0= RULE_STRING )
            // InternalEntityDsl.g:484:5: lv_widgetName_4_0= RULE_STRING
            {
            lv_widgetName_4_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_widgetName_4_0, grammarAccess.getWidgetAccess().getWidgetNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"widgetName",
            						lv_widgetName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getWidgetAccess().getWidgetDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getWidgetAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:508:3: ( (lv_widgetDescription_7_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEntityDsl.g:509:4: (lv_widgetDescription_7_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:509:4: (lv_widgetDescription_7_0= RULE_STRING )
                    // InternalEntityDsl.g:510:5: lv_widgetDescription_7_0= RULE_STRING
                    {
                    lv_widgetDescription_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    					newLeafNode(lv_widgetDescription_7_0, grammarAccess.getWidgetAccess().getWidgetDescriptionSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWidgetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"widgetDescription",
                    						lv_widgetDescription_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalEntityDsl.g:526:3: ( (lv_settings_8_0= ruleSetting ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEntityDsl.g:527:4: (lv_settings_8_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:527:4: (lv_settings_8_0= ruleSetting )
            	    // InternalEntityDsl.g:528:5: lv_settings_8_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getWidgetAccess().getSettingsSettingParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_settings_8_0=ruleSetting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWidgetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"settings",
            	    						lv_settings_8_0,
            	    						"co7217.week18.entity.EntityDsl.Setting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleShortcode"
    // InternalEntityDsl.g:553:1: entryRuleShortcode returns [EObject current=null] : iv_ruleShortcode= ruleShortcode EOF ;
    public final EObject entryRuleShortcode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortcode = null;


        try {
            // InternalEntityDsl.g:553:50: (iv_ruleShortcode= ruleShortcode EOF )
            // InternalEntityDsl.g:554:2: iv_ruleShortcode= ruleShortcode EOF
            {
             newCompositeNode(grammarAccess.getShortcodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortcode=ruleShortcode();

            state._fsp--;

             current =iv_ruleShortcode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShortcode"


    // $ANTLR start "ruleShortcode"
    // InternalEntityDsl.g:560:1: ruleShortcode returns [EObject current=null] : (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' ) ;
    public final EObject ruleShortcode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_shortcodeName_4_0=null;
        Token otherlv_6=null;
        EObject lv_settings_5_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:566:2: ( (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' ) )
            // InternalEntityDsl.g:567:2: (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' )
            {
            // InternalEntityDsl.g:567:2: (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' )
            // InternalEntityDsl.g:568:3: otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getShortcodeAccess().getShortcodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getShortcodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getShortcodeAccess().getShortcodeNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getShortcodeAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:584:3: ( (lv_shortcodeName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:585:4: (lv_shortcodeName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:585:4: (lv_shortcodeName_4_0= RULE_STRING )
            // InternalEntityDsl.g:586:5: lv_shortcodeName_4_0= RULE_STRING
            {
            lv_shortcodeName_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_shortcodeName_4_0, grammarAccess.getShortcodeAccess().getShortcodeNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShortcodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortcodeName",
            						lv_shortcodeName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalEntityDsl.g:602:3: ( (lv_settings_5_0= ruleSetting ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEntityDsl.g:603:4: (lv_settings_5_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:603:4: (lv_settings_5_0= ruleSetting )
            	    // InternalEntityDsl.g:604:5: lv_settings_5_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getShortcodeAccess().getSettingsSettingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_settings_5_0=ruleSetting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShortcodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"settings",
            	    						lv_settings_5_0,
            	    						"co7217.week18.entity.EntityDsl.Setting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getShortcodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShortcode"


    // $ANTLR start "entryRuleCustomPostType"
    // InternalEntityDsl.g:629:1: entryRuleCustomPostType returns [EObject current=null] : iv_ruleCustomPostType= ruleCustomPostType EOF ;
    public final EObject entryRuleCustomPostType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomPostType = null;


        try {
            // InternalEntityDsl.g:629:55: (iv_ruleCustomPostType= ruleCustomPostType EOF )
            // InternalEntityDsl.g:630:2: iv_ruleCustomPostType= ruleCustomPostType EOF
            {
             newCompositeNode(grammarAccess.getCustomPostTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomPostType=ruleCustomPostType();

            state._fsp--;

             current =iv_ruleCustomPostType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomPostType"


    // $ANTLR start "ruleCustomPostType"
    // InternalEntityDsl.g:636:1: ruleCustomPostType returns [EObject current=null] : (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' ) ;
    public final EObject ruleCustomPostType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_postTypeName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_supports_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_taxonomies_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:642:2: ( (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' ) )
            // InternalEntityDsl.g:643:2: (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' )
            {
            // InternalEntityDsl.g:643:2: (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' )
            // InternalEntityDsl.g:644:3: otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomPostTypeAccess().getCustomPostTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomPostTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomPostTypeAccess().getPostTypeNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:660:3: ( (lv_postTypeName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:661:4: (lv_postTypeName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:661:4: (lv_postTypeName_4_0= RULE_STRING )
            // InternalEntityDsl.g:662:5: lv_postTypeName_4_0= RULE_STRING
            {
            lv_postTypeName_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_postTypeName_4_0, grammarAccess.getCustomPostTypeAccess().getPostTypeNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomPostTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"postTypeName",
            						lv_postTypeName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomPostTypeAccess().getSupportsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:686:3: ( (lv_supports_7_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEntityDsl.g:687:4: (lv_supports_7_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:687:4: (lv_supports_7_0= RULE_STRING )
                    // InternalEntityDsl.g:688:5: lv_supports_7_0= RULE_STRING
                    {
                    lv_supports_7_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    					newLeafNode(lv_supports_7_0, grammarAccess.getCustomPostTypeAccess().getSupportsSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCustomPostTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"supports",
                    						lv_supports_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getCustomPostTypeAccess().getTaxonomiesKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_9, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:712:3: ( (lv_taxonomies_10_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEntityDsl.g:713:4: (lv_taxonomies_10_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:713:4: (lv_taxonomies_10_0= RULE_STRING )
                    // InternalEntityDsl.g:714:5: lv_taxonomies_10_0= RULE_STRING
                    {
                    lv_taxonomies_10_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    					newLeafNode(lv_taxonomies_10_0, grammarAccess.getCustomPostTypeAccess().getTaxonomiesSTRINGTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCustomPostTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"taxonomies",
                    						lv_taxonomies_10_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCustomPostTypeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomPostType"


    // $ANTLR start "entryRuleSetting"
    // InternalEntityDsl.g:738:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalEntityDsl.g:738:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalEntityDsl.g:739:2: iv_ruleSetting= ruleSetting EOF
            {
             newCompositeNode(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetting=ruleSetting();

            state._fsp--;

             current =iv_ruleSetting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalEntityDsl.g:745:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_settingName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_settingType_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_defaultValue_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:751:2: ( (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' ) )
            // InternalEntityDsl.g:752:2: (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' )
            {
            // InternalEntityDsl.g:752:2: (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' )
            // InternalEntityDsl.g:753:3: otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getSettingNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:769:3: ( (lv_settingName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:770:4: (lv_settingName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:770:4: (lv_settingName_4_0= RULE_STRING )
            // InternalEntityDsl.g:771:5: lv_settingName_4_0= RULE_STRING
            {
            lv_settingName_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_settingName_4_0, grammarAccess.getSettingAccess().getSettingNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"settingName",
            						lv_settingName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSettingAccess().getSettingTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getSettingAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:795:3: ( (lv_settingType_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:796:4: (lv_settingType_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:796:4: (lv_settingType_7_0= RULE_STRING )
            // InternalEntityDsl.g:797:5: lv_settingType_7_0= RULE_STRING
            {
            lv_settingType_7_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_settingType_7_0, grammarAccess.getSettingAccess().getSettingTypeSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"settingType",
            						lv_settingType_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getSettingAccess().getDefaultValueKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_9, grammarAccess.getSettingAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:821:3: ( (lv_defaultValue_10_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEntityDsl.g:822:4: (lv_defaultValue_10_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:822:4: (lv_defaultValue_10_0= RULE_STRING )
                    // InternalEntityDsl.g:823:5: lv_defaultValue_10_0= RULE_STRING
                    {
                    lv_defaultValue_10_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    					newLeafNode(lv_defaultValue_10_0, grammarAccess.getSettingAccess().getDefaultValueSTRINGTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSettingRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"defaultValue",
                    						lv_defaultValue_10_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleHook"
    // InternalEntityDsl.g:847:1: entryRuleHook returns [EObject current=null] : iv_ruleHook= ruleHook EOF ;
    public final EObject entryRuleHook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHook = null;


        try {
            // InternalEntityDsl.g:847:45: (iv_ruleHook= ruleHook EOF )
            // InternalEntityDsl.g:848:2: iv_ruleHook= ruleHook EOF
            {
             newCompositeNode(grammarAccess.getHookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHook=ruleHook();

            state._fsp--;

             current =iv_ruleHook; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHook"


    // $ANTLR start "ruleHook"
    // InternalEntityDsl.g:854:1: ruleHook returns [EObject current=null] : (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' ) ;
    public final EObject ruleHook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_hookName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_callback_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_priority_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_acceptedArgs_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_hookType_4_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:860:2: ( (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' ) )
            // InternalEntityDsl.g:861:2: (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' )
            {
            // InternalEntityDsl.g:861:2: (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' )
            // InternalEntityDsl.g:862:3: otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHookAccess().getHookKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getHookAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHookAccess().getHookTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getHookAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:878:3: ( (lv_hookType_4_0= ruleHookType ) )
            // InternalEntityDsl.g:879:4: (lv_hookType_4_0= ruleHookType )
            {
            // InternalEntityDsl.g:879:4: (lv_hookType_4_0= ruleHookType )
            // InternalEntityDsl.g:880:5: lv_hookType_4_0= ruleHookType
            {

            					newCompositeNode(grammarAccess.getHookAccess().getHookTypeHookTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_45);
            lv_hookType_4_0=ruleHookType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHookRule());
            					}
            					set(
            						current,
            						"hookType",
            						lv_hookType_4_0,
            						"co7217.week18.entity.EntityDsl.HookType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getHookAccess().getHookNameKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getHookAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:905:3: ( (lv_hookName_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:906:4: (lv_hookName_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:906:4: (lv_hookName_7_0= RULE_STRING )
            // InternalEntityDsl.g:907:5: lv_hookName_7_0= RULE_STRING
            {
            lv_hookName_7_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_hookName_7_0, grammarAccess.getHookAccess().getHookNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hookName",
            						lv_hookName_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getHookAccess().getCallbackKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getHookAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:931:3: ( (lv_callback_10_0= RULE_STRING ) )
            // InternalEntityDsl.g:932:4: (lv_callback_10_0= RULE_STRING )
            {
            // InternalEntityDsl.g:932:4: (lv_callback_10_0= RULE_STRING )
            // InternalEntityDsl.g:933:5: lv_callback_10_0= RULE_STRING
            {
            lv_callback_10_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

            					newLeafNode(lv_callback_10_0, grammarAccess.getHookAccess().getCallbackSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"callback",
            						lv_callback_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getHookAccess().getPriorityKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_48); 

            			newLeafNode(otherlv_12, grammarAccess.getHookAccess().getEqualsSignKeyword_12());
            		
            // InternalEntityDsl.g:957:3: ( (lv_priority_13_0= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEntityDsl.g:958:4: (lv_priority_13_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:958:4: (lv_priority_13_0= RULE_INT )
                    // InternalEntityDsl.g:959:5: lv_priority_13_0= RULE_INT
                    {
                    lv_priority_13_0=(Token)match(input,RULE_INT,FOLLOW_49); 

                    					newLeafNode(lv_priority_13_0, grammarAccess.getHookAccess().getPriorityINTTerminalRuleCall_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHookRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"priority",
                    						lv_priority_13_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getHookAccess().getAcceptedArgsKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_50); 

            			newLeafNode(otherlv_15, grammarAccess.getHookAccess().getEqualsSignKeyword_15());
            		
            // InternalEntityDsl.g:983:3: ( (lv_acceptedArgs_16_0= RULE_INT ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEntityDsl.g:984:4: (lv_acceptedArgs_16_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:984:4: (lv_acceptedArgs_16_0= RULE_INT )
                    // InternalEntityDsl.g:985:5: lv_acceptedArgs_16_0= RULE_INT
                    {
                    lv_acceptedArgs_16_0=(Token)match(input,RULE_INT,FOLLOW_39); 

                    					newLeafNode(lv_acceptedArgs_16_0, grammarAccess.getHookAccess().getAcceptedArgsINTTerminalRuleCall_16_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHookRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"acceptedArgs",
                    						lv_acceptedArgs_16_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getHookAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHook"


    // $ANTLR start "ruleHookType"
    // InternalEntityDsl.g:1009:1: ruleHookType returns [Enumerator current=null] : ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) ) ;
    public final Enumerator ruleHookType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:1015:2: ( ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) ) )
            // InternalEntityDsl.g:1016:2: ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) )
            {
            // InternalEntityDsl.g:1016:2: ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==45) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEntityDsl.g:1017:3: (enumLiteral_0= 'filter' )
                    {
                    // InternalEntityDsl.g:1017:3: (enumLiteral_0= 'filter' )
                    // InternalEntityDsl.g:1018:4: enumLiteral_0= 'filter'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:1025:3: (enumLiteral_1= 'action' )
                    {
                    // InternalEntityDsl.g:1025:3: (enumLiteral_1= 'action' )
                    // InternalEntityDsl.g:1026:4: enumLiteral_1= 'action'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getHookTypeAccess().getACTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHookTypeAccess().getACTIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHookType"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004453000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004453000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004451000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004441000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004401000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000401000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000001000020L});

}