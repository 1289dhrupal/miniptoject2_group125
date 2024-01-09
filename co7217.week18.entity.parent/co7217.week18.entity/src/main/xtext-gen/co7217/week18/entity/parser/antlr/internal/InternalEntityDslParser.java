package co7217.week18.entity.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Plugin'", "'{'", "'name'", "'='", "'version'", "'description'", "'author'", "'license'", "'prefix'", "'textDomain'", "'activate'", "'deactivate'", "'}'", "'Widget'", "'widgetName'", "'widgetDescription'", "'Shortcode'", "'shortcodeName'", "'CustomPostType'", "'postTypeName'", "'supports'", "'taxonomies'", "'Setting'", "'settingName'", "'settingType'", "'defaultValue'", "'Hook'", "'hookType'", "'hookName'", "'callback'", "'priority'", "'acceptedArgs'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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
    // InternalEntityDsl.g:64:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // InternalEntityDsl.g:64:47: (iv_rulePlugin= rulePlugin EOF )
            // InternalEntityDsl.g:65:2: iv_rulePlugin= rulePlugin EOF
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
    // InternalEntityDsl.g:71:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? ( (lv_widgets_29_0= ruleWidget ) )* ( (lv_shortcodes_30_0= ruleShortcode ) )* ( (lv_customPostTypes_31_0= ruleCustomPostType ) )* ( (lv_settings_32_0= ruleSetting ) )* ( (lv_hooks_33_0= ruleHook ) )* otherlv_34= '}' ) ;
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
        Token otherlv_34=null;
        EObject lv_widgets_29_0 = null;

        EObject lv_shortcodes_30_0 = null;

        EObject lv_customPostTypes_31_0 = null;

        EObject lv_settings_32_0 = null;

        EObject lv_hooks_33_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:77:2: ( (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? ( (lv_widgets_29_0= ruleWidget ) )* ( (lv_shortcodes_30_0= ruleShortcode ) )* ( (lv_customPostTypes_31_0= ruleCustomPostType ) )* ( (lv_settings_32_0= ruleSetting ) )* ( (lv_hooks_33_0= ruleHook ) )* otherlv_34= '}' ) )
            // InternalEntityDsl.g:78:2: (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? ( (lv_widgets_29_0= ruleWidget ) )* ( (lv_shortcodes_30_0= ruleShortcode ) )* ( (lv_customPostTypes_31_0= ruleCustomPostType ) )* ( (lv_settings_32_0= ruleSetting ) )* ( (lv_hooks_33_0= ruleHook ) )* otherlv_34= '}' )
            {
            // InternalEntityDsl.g:78:2: (otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? ( (lv_widgets_29_0= ruleWidget ) )* ( (lv_shortcodes_30_0= ruleShortcode ) )* ( (lv_customPostTypes_31_0= ruleCustomPostType ) )* ( (lv_settings_32_0= ruleSetting ) )* ( (lv_hooks_33_0= ruleHook ) )* otherlv_34= '}' )
            // InternalEntityDsl.g:79:3: otherlv_0= 'Plugin' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) )? otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) )? otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) )? otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) )? otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) )? otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? ( (lv_widgets_29_0= ruleWidget ) )* ( (lv_shortcodes_30_0= ruleShortcode ) )* ( (lv_customPostTypes_31_0= ruleCustomPostType ) )* ( (lv_settings_32_0= ruleSetting ) )* ( (lv_hooks_33_0= ruleHook ) )* otherlv_34= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPluginAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:95:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:96:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:96:4: (lv_name_4_0= RULE_STRING )
            // InternalEntityDsl.g:97:5: lv_name_4_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:121:3: ( (lv_version_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:122:4: (lv_version_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:122:4: (lv_version_7_0= RULE_STRING )
            // InternalEntityDsl.g:123:5: lv_version_7_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:147:3: ( (lv_description_10_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEntityDsl.g:148:4: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:148:4: (lv_description_10_0= RULE_STRING )
                    // InternalEntityDsl.g:149:5: lv_description_10_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:173:3: ( (lv_author_13_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:174:4: (lv_author_13_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:174:4: (lv_author_13_0= RULE_STRING )
                    // InternalEntityDsl.g:175:5: lv_author_13_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:199:3: ( (lv_license_16_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:200:4: (lv_license_16_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:200:4: (lv_license_16_0= RULE_STRING )
                    // InternalEntityDsl.g:201:5: lv_license_16_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:225:3: ( (lv_prefix_19_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:226:4: (lv_prefix_19_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:226:4: (lv_prefix_19_0= RULE_STRING )
                    // InternalEntityDsl.g:227:5: lv_prefix_19_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:251:3: ( (lv_textDomain_22_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:252:4: (lv_textDomain_22_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:252:4: (lv_textDomain_22_0= RULE_STRING )
                    // InternalEntityDsl.g:253:5: lv_textDomain_22_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:277:3: ( (lv_activate_25_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:278:4: (lv_activate_25_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:278:4: (lv_activate_25_0= RULE_STRING )
                    // InternalEntityDsl.g:279:5: lv_activate_25_0= RULE_STRING
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
            		
            // InternalEntityDsl.g:303:3: ( (lv_deactivate_28_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:304:4: (lv_deactivate_28_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:304:4: (lv_deactivate_28_0= RULE_STRING )
                    // InternalEntityDsl.g:305:5: lv_deactivate_28_0= RULE_STRING
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

            // InternalEntityDsl.g:321:3: ( (lv_widgets_29_0= ruleWidget ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:322:4: (lv_widgets_29_0= ruleWidget )
            	    {
            	    // InternalEntityDsl.g:322:4: (lv_widgets_29_0= ruleWidget )
            	    // InternalEntityDsl.g:323:5: lv_widgets_29_0= ruleWidget
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getWidgetsWidgetParserRuleCall_29_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_widgets_29_0=ruleWidget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"widgets",
            	    						lv_widgets_29_0,
            	    						"co7217.week18.entity.EntityDsl.Widget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalEntityDsl.g:340:3: ( (lv_shortcodes_30_0= ruleShortcode ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:341:4: (lv_shortcodes_30_0= ruleShortcode )
            	    {
            	    // InternalEntityDsl.g:341:4: (lv_shortcodes_30_0= ruleShortcode )
            	    // InternalEntityDsl.g:342:5: lv_shortcodes_30_0= ruleShortcode
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getShortcodesShortcodeParserRuleCall_30_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_shortcodes_30_0=ruleShortcode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shortcodes",
            	    						lv_shortcodes_30_0,
            	    						"co7217.week18.entity.EntityDsl.Shortcode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalEntityDsl.g:359:3: ( (lv_customPostTypes_31_0= ruleCustomPostType ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEntityDsl.g:360:4: (lv_customPostTypes_31_0= ruleCustomPostType )
            	    {
            	    // InternalEntityDsl.g:360:4: (lv_customPostTypes_31_0= ruleCustomPostType )
            	    // InternalEntityDsl.g:361:5: lv_customPostTypes_31_0= ruleCustomPostType
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getCustomPostTypesCustomPostTypeParserRuleCall_31_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_customPostTypes_31_0=ruleCustomPostType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customPostTypes",
            	    						lv_customPostTypes_31_0,
            	    						"co7217.week18.entity.EntityDsl.CustomPostType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalEntityDsl.g:378:3: ( (lv_settings_32_0= ruleSetting ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEntityDsl.g:379:4: (lv_settings_32_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:379:4: (lv_settings_32_0= ruleSetting )
            	    // InternalEntityDsl.g:380:5: lv_settings_32_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getSettingsSettingParserRuleCall_32_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_settings_32_0=ruleSetting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"settings",
            	    						lv_settings_32_0,
            	    						"co7217.week18.entity.EntityDsl.Setting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalEntityDsl.g:397:3: ( (lv_hooks_33_0= ruleHook ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDsl.g:398:4: (lv_hooks_33_0= ruleHook )
            	    {
            	    // InternalEntityDsl.g:398:4: (lv_hooks_33_0= ruleHook )
            	    // InternalEntityDsl.g:399:5: lv_hooks_33_0= ruleHook
            	    {

            	    					newCompositeNode(grammarAccess.getPluginAccess().getHooksHookParserRuleCall_33_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_hooks_33_0=ruleHook();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPluginRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hooks",
            	    						lv_hooks_33_0,
            	    						"co7217.week18.entity.EntityDsl.Hook");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_34=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_34());
            		

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
    // InternalEntityDsl.g:424:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalEntityDsl.g:424:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalEntityDsl.g:425:2: iv_ruleWidget= ruleWidget EOF
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
    // InternalEntityDsl.g:431:1: ruleWidget returns [EObject current=null] : (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) ) ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' ) ;
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
            // InternalEntityDsl.g:437:2: ( (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) ) ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' ) )
            // InternalEntityDsl.g:438:2: (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) ) ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' )
            {
            // InternalEntityDsl.g:438:2: (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) ) ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' )
            // InternalEntityDsl.g:439:3: otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) ) ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetAccess().getWidgetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetAccess().getWidgetNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:455:3: ( (lv_widgetName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:456:4: (lv_widgetName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:456:4: (lv_widgetName_4_0= RULE_STRING )
            // InternalEntityDsl.g:457:5: lv_widgetName_4_0= RULE_STRING
            {
            lv_widgetName_4_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            otherlv_5=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getWidgetAccess().getWidgetDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getWidgetAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:481:3: ( (lv_widgetDescription_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:482:4: (lv_widgetDescription_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:482:4: (lv_widgetDescription_7_0= RULE_STRING )
            // InternalEntityDsl.g:483:5: lv_widgetDescription_7_0= RULE_STRING
            {
            lv_widgetDescription_7_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalEntityDsl.g:499:3: ( (lv_settings_8_0= ruleSetting ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEntityDsl.g:500:4: (lv_settings_8_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:500:4: (lv_settings_8_0= ruleSetting )
            	    // InternalEntityDsl.g:501:5: lv_settings_8_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getWidgetAccess().getSettingsSettingParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

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
    // InternalEntityDsl.g:526:1: entryRuleShortcode returns [EObject current=null] : iv_ruleShortcode= ruleShortcode EOF ;
    public final EObject entryRuleShortcode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortcode = null;


        try {
            // InternalEntityDsl.g:526:50: (iv_ruleShortcode= ruleShortcode EOF )
            // InternalEntityDsl.g:527:2: iv_ruleShortcode= ruleShortcode EOF
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
    // InternalEntityDsl.g:533:1: ruleShortcode returns [EObject current=null] : (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' ) ;
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
            // InternalEntityDsl.g:539:2: ( (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' ) )
            // InternalEntityDsl.g:540:2: (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' )
            {
            // InternalEntityDsl.g:540:2: (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' )
            // InternalEntityDsl.g:541:3: otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getShortcodeAccess().getShortcodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getShortcodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getShortcodeAccess().getShortcodeNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getShortcodeAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:557:3: ( (lv_shortcodeName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:558:4: (lv_shortcodeName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:558:4: (lv_shortcodeName_4_0= RULE_STRING )
            // InternalEntityDsl.g:559:5: lv_shortcodeName_4_0= RULE_STRING
            {
            lv_shortcodeName_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalEntityDsl.g:575:3: ( (lv_settings_5_0= ruleSetting ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEntityDsl.g:576:4: (lv_settings_5_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:576:4: (lv_settings_5_0= ruleSetting )
            	    // InternalEntityDsl.g:577:5: lv_settings_5_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getShortcodeAccess().getSettingsSettingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

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
    // InternalEntityDsl.g:602:1: entryRuleCustomPostType returns [EObject current=null] : iv_ruleCustomPostType= ruleCustomPostType EOF ;
    public final EObject entryRuleCustomPostType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomPostType = null;


        try {
            // InternalEntityDsl.g:602:55: (iv_ruleCustomPostType= ruleCustomPostType EOF )
            // InternalEntityDsl.g:603:2: iv_ruleCustomPostType= ruleCustomPostType EOF
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
    // InternalEntityDsl.g:609:1: ruleCustomPostType returns [EObject current=null] : (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' ) ;
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
            // InternalEntityDsl.g:615:2: ( (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' ) )
            // InternalEntityDsl.g:616:2: (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' )
            {
            // InternalEntityDsl.g:616:2: (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}' )
            // InternalEntityDsl.g:617:3: otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'postTypeName' otherlv_3= '=' ( (lv_postTypeName_4_0= RULE_STRING ) ) otherlv_5= 'supports' otherlv_6= '=' ( (lv_supports_7_0= RULE_STRING ) )? otherlv_8= 'taxonomies' otherlv_9= '=' ( (lv_taxonomies_10_0= RULE_STRING ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomPostTypeAccess().getCustomPostTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomPostTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomPostTypeAccess().getPostTypeNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:633:3: ( (lv_postTypeName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:634:4: (lv_postTypeName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:634:4: (lv_postTypeName_4_0= RULE_STRING )
            // InternalEntityDsl.g:635:5: lv_postTypeName_4_0= RULE_STRING
            {
            lv_postTypeName_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_5=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomPostTypeAccess().getSupportsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:659:3: ( (lv_supports_7_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEntityDsl.g:660:4: (lv_supports_7_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:660:4: (lv_supports_7_0= RULE_STRING )
                    // InternalEntityDsl.g:661:5: lv_supports_7_0= RULE_STRING
                    {
                    lv_supports_7_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            otherlv_8=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getCustomPostTypeAccess().getTaxonomiesKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_9, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:685:3: ( (lv_taxonomies_10_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEntityDsl.g:686:4: (lv_taxonomies_10_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:686:4: (lv_taxonomies_10_0= RULE_STRING )
                    // InternalEntityDsl.g:687:5: lv_taxonomies_10_0= RULE_STRING
                    {
                    lv_taxonomies_10_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

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
    // InternalEntityDsl.g:711:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalEntityDsl.g:711:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalEntityDsl.g:712:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalEntityDsl.g:718:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' ) ;
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
            // InternalEntityDsl.g:724:2: ( (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' ) )
            // InternalEntityDsl.g:725:2: (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' )
            {
            // InternalEntityDsl.g:725:2: (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' )
            // InternalEntityDsl.g:726:3: otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getSettingNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:742:3: ( (lv_settingName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:743:4: (lv_settingName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:743:4: (lv_settingName_4_0= RULE_STRING )
            // InternalEntityDsl.g:744:5: lv_settingName_4_0= RULE_STRING
            {
            lv_settingName_4_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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

            otherlv_5=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSettingAccess().getSettingTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getSettingAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:768:3: ( (lv_settingType_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:769:4: (lv_settingType_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:769:4: (lv_settingType_7_0= RULE_STRING )
            // InternalEntityDsl.g:770:5: lv_settingType_7_0= RULE_STRING
            {
            lv_settingType_7_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            otherlv_8=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getSettingAccess().getDefaultValueKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_9, grammarAccess.getSettingAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:794:3: ( (lv_defaultValue_10_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEntityDsl.g:795:4: (lv_defaultValue_10_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:795:4: (lv_defaultValue_10_0= RULE_STRING )
                    // InternalEntityDsl.g:796:5: lv_defaultValue_10_0= RULE_STRING
                    {
                    lv_defaultValue_10_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

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
    // InternalEntityDsl.g:820:1: entryRuleHook returns [EObject current=null] : iv_ruleHook= ruleHook EOF ;
    public final EObject entryRuleHook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHook = null;


        try {
            // InternalEntityDsl.g:820:45: (iv_ruleHook= ruleHook EOF )
            // InternalEntityDsl.g:821:2: iv_ruleHook= ruleHook EOF
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
    // InternalEntityDsl.g:827:1: ruleHook returns [EObject current=null] : (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= RULE_STRING ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) ) otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) ) otherlv_17= '}' ) ;
    public final EObject ruleHook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_hookType_4_0=null;
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


        	enterRule();

        try {
            // InternalEntityDsl.g:833:2: ( (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= RULE_STRING ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) ) otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) ) otherlv_17= '}' ) )
            // InternalEntityDsl.g:834:2: (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= RULE_STRING ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) ) otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) ) otherlv_17= '}' )
            {
            // InternalEntityDsl.g:834:2: (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= RULE_STRING ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) ) otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) ) otherlv_17= '}' )
            // InternalEntityDsl.g:835:3: otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= RULE_STRING ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) ) otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHookAccess().getHookKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getHookAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHookAccess().getHookTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getHookAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:851:3: ( (lv_hookType_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:852:4: (lv_hookType_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:852:4: (lv_hookType_4_0= RULE_STRING )
            // InternalEntityDsl.g:853:5: lv_hookType_4_0= RULE_STRING
            {
            lv_hookType_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_hookType_4_0, grammarAccess.getHookAccess().getHookTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hookType",
            						lv_hookType_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getHookAccess().getHookNameKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getHookAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:877:3: ( (lv_hookName_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:878:4: (lv_hookName_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:878:4: (lv_hookName_7_0= RULE_STRING )
            // InternalEntityDsl.g:879:5: lv_hookName_7_0= RULE_STRING
            {
            lv_hookName_7_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

            otherlv_8=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getHookAccess().getCallbackKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getHookAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:903:3: ( (lv_callback_10_0= RULE_STRING ) )
            // InternalEntityDsl.g:904:4: (lv_callback_10_0= RULE_STRING )
            {
            // InternalEntityDsl.g:904:4: (lv_callback_10_0= RULE_STRING )
            // InternalEntityDsl.g:905:5: lv_callback_10_0= RULE_STRING
            {
            lv_callback_10_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

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

            otherlv_11=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getHookAccess().getPriorityKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_44); 

            			newLeafNode(otherlv_12, grammarAccess.getHookAccess().getEqualsSignKeyword_12());
            		
            // InternalEntityDsl.g:929:3: ( (lv_priority_13_0= RULE_INT ) )
            // InternalEntityDsl.g:930:4: (lv_priority_13_0= RULE_INT )
            {
            // InternalEntityDsl.g:930:4: (lv_priority_13_0= RULE_INT )
            // InternalEntityDsl.g:931:5: lv_priority_13_0= RULE_INT
            {
            lv_priority_13_0=(Token)match(input,RULE_INT,FOLLOW_45); 

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

            otherlv_14=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getHookAccess().getAcceptedArgsKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_44); 

            			newLeafNode(otherlv_15, grammarAccess.getHookAccess().getEqualsSignKeyword_15());
            		
            // InternalEntityDsl.g:955:3: ( (lv_acceptedArgs_16_0= RULE_INT ) )
            // InternalEntityDsl.g:956:4: (lv_acceptedArgs_16_0= RULE_INT )
            {
            // InternalEntityDsl.g:956:4: (lv_acceptedArgs_16_0= RULE_INT )
            // InternalEntityDsl.g:957:5: lv_acceptedArgs_16_0= RULE_INT
            {
            lv_acceptedArgs_16_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            otherlv_17=(Token)match(input,23,FOLLOW_2); 

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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002229800010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002229800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002228800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002220800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002200800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});

}