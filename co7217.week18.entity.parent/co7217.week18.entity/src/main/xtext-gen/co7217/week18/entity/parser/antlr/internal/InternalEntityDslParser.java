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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Meta'", "'{'", "'name'", "'='", "'version'", "'description'", "'author'", "'license'", "'prefix'", "'textDomain'", "'activate'", "'deactivate'", "'uninstall'", "'}'", "'Widget'", "'widgetName'", "'widgetDescription'", "'Shortcode'", "'shortcodeName'", "'CustomPostType'", "'cptName'", "'cptSingularName'", "'cptSupports'", "'cptTaxonomies'", "'Setting'", "'settingName'", "'settingType'", "'defaultValue'", "'Hook'", "'hookType'", "'hookName'", "'callback'", "'priority'", "'acceptedArgs'", "','", "'filter'", "'action'"
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

        public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PluginModel";
       	}

       	@Override
       	protected EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePluginModel"
    // InternalEntityDsl.g:65:1: entryRulePluginModel returns [EObject current=null] : iv_rulePluginModel= rulePluginModel EOF ;
    public final EObject entryRulePluginModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginModel = null;


        try {
            // InternalEntityDsl.g:65:52: (iv_rulePluginModel= rulePluginModel EOF )
            // InternalEntityDsl.g:66:2: iv_rulePluginModel= rulePluginModel EOF
            {
             newCompositeNode(grammarAccess.getPluginModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePluginModel=rulePluginModel();

            state._fsp--;

             current =iv_rulePluginModel; 
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
    // $ANTLR end "entryRulePluginModel"


    // $ANTLR start "rulePluginModel"
    // InternalEntityDsl.g:72:1: rulePluginModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject rulePluginModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:78:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalEntityDsl.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalEntityDsl.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==25||LA1_0==28||LA1_0==30||LA1_0==35||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDsl.g:80:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalEntityDsl.g:80:3: (lv_elements_0_0= ruleElement )
            	    // InternalEntityDsl.g:81:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getPluginModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPluginModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"co7217.week18.entity.EntityDsl.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "rulePluginModel"


    // $ANTLR start "entryRuleElement"
    // InternalEntityDsl.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalEntityDsl.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalEntityDsl.g:102:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalEntityDsl.g:108:1: ruleElement returns [EObject current=null] : (this_Meta_0= ruleMeta | this_Widget_1= ruleWidget | this_Shortcode_2= ruleShortcode | this_CustomPostType_3= ruleCustomPostType | this_Setting_4= ruleSetting | this_Hook_5= ruleHook ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Meta_0 = null;

        EObject this_Widget_1 = null;

        EObject this_Shortcode_2 = null;

        EObject this_CustomPostType_3 = null;

        EObject this_Setting_4 = null;

        EObject this_Hook_5 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:114:2: ( (this_Meta_0= ruleMeta | this_Widget_1= ruleWidget | this_Shortcode_2= ruleShortcode | this_CustomPostType_3= ruleCustomPostType | this_Setting_4= ruleSetting | this_Hook_5= ruleHook ) )
            // InternalEntityDsl.g:115:2: (this_Meta_0= ruleMeta | this_Widget_1= ruleWidget | this_Shortcode_2= ruleShortcode | this_CustomPostType_3= ruleCustomPostType | this_Setting_4= ruleSetting | this_Hook_5= ruleHook )
            {
            // InternalEntityDsl.g:115:2: (this_Meta_0= ruleMeta | this_Widget_1= ruleWidget | this_Shortcode_2= ruleShortcode | this_CustomPostType_3= ruleCustomPostType | this_Setting_4= ruleSetting | this_Hook_5= ruleHook )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 39:
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
                    // InternalEntityDsl.g:116:3: this_Meta_0= ruleMeta
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMetaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Meta_0=ruleMeta();

                    state._fsp--;


                    			current = this_Meta_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:125:3: this_Widget_1= ruleWidget
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getWidgetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Widget_1=ruleWidget();

                    state._fsp--;


                    			current = this_Widget_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:134:3: this_Shortcode_2= ruleShortcode
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getShortcodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shortcode_2=ruleShortcode();

                    state._fsp--;


                    			current = this_Shortcode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:143:3: this_CustomPostType_3= ruleCustomPostType
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCustomPostTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomPostType_3=ruleCustomPostType();

                    state._fsp--;


                    			current = this_CustomPostType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEntityDsl.g:152:3: this_Setting_4= ruleSetting
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSettingParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Setting_4=ruleSetting();

                    state._fsp--;


                    			current = this_Setting_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEntityDsl.g:161:3: this_Hook_5= ruleHook
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getHookParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hook_5=ruleHook();

                    state._fsp--;


                    			current = this_Hook_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleMeta"
    // InternalEntityDsl.g:173:1: entryRuleMeta returns [EObject current=null] : iv_ruleMeta= ruleMeta EOF ;
    public final EObject entryRuleMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeta = null;


        try {
            // InternalEntityDsl.g:173:45: (iv_ruleMeta= ruleMeta EOF )
            // InternalEntityDsl.g:174:2: iv_ruleMeta= ruleMeta EOF
            {
             newCompositeNode(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeta=ruleMeta();

            state._fsp--;

             current =iv_ruleMeta; 
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
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // InternalEntityDsl.g:180:1: ruleMeta returns [EObject current=null] : (otherlv_0= 'Meta' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) ) otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) ) otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) ) otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) ) otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? otherlv_32= '}' ) ;
    public final EObject ruleMeta() throws RecognitionException {
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
        Token otherlv_32=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:186:2: ( (otherlv_0= 'Meta' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) ) otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) ) otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) ) otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) ) otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? otherlv_32= '}' ) )
            // InternalEntityDsl.g:187:2: (otherlv_0= 'Meta' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) ) otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) ) otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) ) otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) ) otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? otherlv_32= '}' )
            {
            // InternalEntityDsl.g:187:2: (otherlv_0= 'Meta' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) ) otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) ) otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) ) otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) ) otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? otherlv_32= '}' )
            // InternalEntityDsl.g:188:3: otherlv_0= 'Meta' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'author' otherlv_12= '=' ( (lv_author_13_0= RULE_STRING ) ) otherlv_14= 'license' otherlv_15= '=' ( (lv_license_16_0= RULE_STRING ) ) otherlv_17= 'prefix' otherlv_18= '=' ( (lv_prefix_19_0= RULE_STRING ) ) otherlv_20= 'textDomain' otherlv_21= '=' ( (lv_textDomain_22_0= RULE_STRING ) ) otherlv_23= 'activate' otherlv_24= '=' ( (lv_activate_25_0= RULE_STRING ) )? otherlv_26= 'deactivate' otherlv_27= '=' ( (lv_deactivate_28_0= RULE_STRING ) )? otherlv_29= 'uninstall' otherlv_30= '=' ( (lv_uninstall_31_0= RULE_STRING ) )? otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaAccess().getMetaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMetaAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:204:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:205:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:205:4: (lv_name_4_0= RULE_STRING )
            // InternalEntityDsl.g:206:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMetaAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getMetaAccess().getVersionKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMetaAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:230:3: ( (lv_version_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:231:4: (lv_version_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:231:4: (lv_version_7_0= RULE_STRING )
            // InternalEntityDsl.g:232:5: lv_version_7_0= RULE_STRING
            {
            lv_version_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_version_7_0, grammarAccess.getMetaAccess().getVersionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getMetaAccess().getDescriptionKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMetaAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:256:3: ( (lv_description_10_0= RULE_STRING ) )
            // InternalEntityDsl.g:257:4: (lv_description_10_0= RULE_STRING )
            {
            // InternalEntityDsl.g:257:4: (lv_description_10_0= RULE_STRING )
            // InternalEntityDsl.g:258:5: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_10_0, grammarAccess.getMetaAccess().getDescriptionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getMetaAccess().getAuthorKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getMetaAccess().getEqualsSignKeyword_12());
            		
            // InternalEntityDsl.g:282:3: ( (lv_author_13_0= RULE_STRING ) )
            // InternalEntityDsl.g:283:4: (lv_author_13_0= RULE_STRING )
            {
            // InternalEntityDsl.g:283:4: (lv_author_13_0= RULE_STRING )
            // InternalEntityDsl.g:284:5: lv_author_13_0= RULE_STRING
            {
            lv_author_13_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_author_13_0, grammarAccess.getMetaAccess().getAuthorSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"author",
            						lv_author_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getMetaAccess().getLicenseKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getMetaAccess().getEqualsSignKeyword_15());
            		
            // InternalEntityDsl.g:308:3: ( (lv_license_16_0= RULE_STRING ) )
            // InternalEntityDsl.g:309:4: (lv_license_16_0= RULE_STRING )
            {
            // InternalEntityDsl.g:309:4: (lv_license_16_0= RULE_STRING )
            // InternalEntityDsl.g:310:5: lv_license_16_0= RULE_STRING
            {
            lv_license_16_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_license_16_0, grammarAccess.getMetaAccess().getLicenseSTRINGTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"license",
            						lv_license_16_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_17=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getMetaAccess().getPrefixKeyword_17());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getMetaAccess().getEqualsSignKeyword_18());
            		
            // InternalEntityDsl.g:334:3: ( (lv_prefix_19_0= RULE_STRING ) )
            // InternalEntityDsl.g:335:4: (lv_prefix_19_0= RULE_STRING )
            {
            // InternalEntityDsl.g:335:4: (lv_prefix_19_0= RULE_STRING )
            // InternalEntityDsl.g:336:5: lv_prefix_19_0= RULE_STRING
            {
            lv_prefix_19_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_prefix_19_0, grammarAccess.getMetaAccess().getPrefixSTRINGTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prefix",
            						lv_prefix_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getMetaAccess().getTextDomainKeyword_20());
            		
            otherlv_21=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getMetaAccess().getEqualsSignKeyword_21());
            		
            // InternalEntityDsl.g:360:3: ( (lv_textDomain_22_0= RULE_STRING ) )
            // InternalEntityDsl.g:361:4: (lv_textDomain_22_0= RULE_STRING )
            {
            // InternalEntityDsl.g:361:4: (lv_textDomain_22_0= RULE_STRING )
            // InternalEntityDsl.g:362:5: lv_textDomain_22_0= RULE_STRING
            {
            lv_textDomain_22_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_textDomain_22_0, grammarAccess.getMetaAccess().getTextDomainSTRINGTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"textDomain",
            						lv_textDomain_22_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_23=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_23, grammarAccess.getMetaAccess().getActivateKeyword_23());
            		
            otherlv_24=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_24, grammarAccess.getMetaAccess().getEqualsSignKeyword_24());
            		
            // InternalEntityDsl.g:386:3: ( (lv_activate_25_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:387:4: (lv_activate_25_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:387:4: (lv_activate_25_0= RULE_STRING )
                    // InternalEntityDsl.g:388:5: lv_activate_25_0= RULE_STRING
                    {
                    lv_activate_25_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_activate_25_0, grammarAccess.getMetaAccess().getActivateSTRINGTerminalRuleCall_25_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMetaRule());
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

            otherlv_26=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_26, grammarAccess.getMetaAccess().getDeactivateKeyword_26());
            		
            otherlv_27=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_27, grammarAccess.getMetaAccess().getEqualsSignKeyword_27());
            		
            // InternalEntityDsl.g:412:3: ( (lv_deactivate_28_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:413:4: (lv_deactivate_28_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:413:4: (lv_deactivate_28_0= RULE_STRING )
                    // InternalEntityDsl.g:414:5: lv_deactivate_28_0= RULE_STRING
                    {
                    lv_deactivate_28_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    					newLeafNode(lv_deactivate_28_0, grammarAccess.getMetaAccess().getDeactivateSTRINGTerminalRuleCall_28_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMetaRule());
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

            otherlv_29=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_29, grammarAccess.getMetaAccess().getUninstallKeyword_29());
            		
            otherlv_30=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_30, grammarAccess.getMetaAccess().getEqualsSignKeyword_30());
            		
            // InternalEntityDsl.g:438:3: ( (lv_uninstall_31_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:439:4: (lv_uninstall_31_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:439:4: (lv_uninstall_31_0= RULE_STRING )
                    // InternalEntityDsl.g:440:5: lv_uninstall_31_0= RULE_STRING
                    {
                    lv_uninstall_31_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    					newLeafNode(lv_uninstall_31_0, grammarAccess.getMetaAccess().getUninstallSTRINGTerminalRuleCall_31_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMetaRule());
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

            otherlv_32=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getMetaAccess().getRightCurlyBracketKeyword_32());
            		

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
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleWidget"
    // InternalEntityDsl.g:464:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalEntityDsl.g:464:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalEntityDsl.g:465:2: iv_ruleWidget= ruleWidget EOF
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
    // InternalEntityDsl.g:471:1: ruleWidget returns [EObject current=null] : (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' ) ;
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
            // InternalEntityDsl.g:477:2: ( (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' ) )
            // InternalEntityDsl.g:478:2: (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' )
            {
            // InternalEntityDsl.g:478:2: (otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}' )
            // InternalEntityDsl.g:479:3: otherlv_0= 'Widget' otherlv_1= '{' otherlv_2= 'widgetName' otherlv_3= '=' ( (lv_widgetName_4_0= RULE_STRING ) ) otherlv_5= 'widgetDescription' otherlv_6= '=' ( (lv_widgetDescription_7_0= RULE_STRING ) )? ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetAccess().getWidgetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetAccess().getWidgetNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:495:3: ( (lv_widgetName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:496:4: (lv_widgetName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:496:4: (lv_widgetName_4_0= RULE_STRING )
            // InternalEntityDsl.g:497:5: lv_widgetName_4_0= RULE_STRING
            {
            lv_widgetName_4_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_5=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getWidgetAccess().getWidgetDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getWidgetAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:521:3: ( (lv_widgetDescription_7_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:522:4: (lv_widgetDescription_7_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:522:4: (lv_widgetDescription_7_0= RULE_STRING )
                    // InternalEntityDsl.g:523:5: lv_widgetDescription_7_0= RULE_STRING
                    {
                    lv_widgetDescription_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            // InternalEntityDsl.g:539:3: ( (lv_settings_8_0= ruleSetting ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEntityDsl.g:540:4: (lv_settings_8_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:540:4: (lv_settings_8_0= ruleSetting )
            	    // InternalEntityDsl.g:541:5: lv_settings_8_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getWidgetAccess().getSettingsSettingParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop7;
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
    // InternalEntityDsl.g:566:1: entryRuleShortcode returns [EObject current=null] : iv_ruleShortcode= ruleShortcode EOF ;
    public final EObject entryRuleShortcode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortcode = null;


        try {
            // InternalEntityDsl.g:566:50: (iv_ruleShortcode= ruleShortcode EOF )
            // InternalEntityDsl.g:567:2: iv_ruleShortcode= ruleShortcode EOF
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
    // InternalEntityDsl.g:573:1: ruleShortcode returns [EObject current=null] : (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' ) ;
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
            // InternalEntityDsl.g:579:2: ( (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' ) )
            // InternalEntityDsl.g:580:2: (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' )
            {
            // InternalEntityDsl.g:580:2: (otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}' )
            // InternalEntityDsl.g:581:3: otherlv_0= 'Shortcode' otherlv_1= '{' otherlv_2= 'shortcodeName' otherlv_3= '=' ( (lv_shortcodeName_4_0= RULE_STRING ) ) ( (lv_settings_5_0= ruleSetting ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getShortcodeAccess().getShortcodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getShortcodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getShortcodeAccess().getShortcodeNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getShortcodeAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:597:3: ( (lv_shortcodeName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:598:4: (lv_shortcodeName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:598:4: (lv_shortcodeName_4_0= RULE_STRING )
            // InternalEntityDsl.g:599:5: lv_shortcodeName_4_0= RULE_STRING
            {
            lv_shortcodeName_4_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            // InternalEntityDsl.g:615:3: ( (lv_settings_5_0= ruleSetting ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:616:4: (lv_settings_5_0= ruleSetting )
            	    {
            	    // InternalEntityDsl.g:616:4: (lv_settings_5_0= ruleSetting )
            	    // InternalEntityDsl.g:617:5: lv_settings_5_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getShortcodeAccess().getSettingsSettingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop8;
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
    // InternalEntityDsl.g:642:1: entryRuleCustomPostType returns [EObject current=null] : iv_ruleCustomPostType= ruleCustomPostType EOF ;
    public final EObject entryRuleCustomPostType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomPostType = null;


        try {
            // InternalEntityDsl.g:642:55: (iv_ruleCustomPostType= ruleCustomPostType EOF )
            // InternalEntityDsl.g:643:2: iv_ruleCustomPostType= ruleCustomPostType EOF
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
    // InternalEntityDsl.g:649:1: ruleCustomPostType returns [EObject current=null] : (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'cptName' otherlv_3= '=' ( (lv_cptName_4_0= RULE_STRING ) ) otherlv_5= 'cptSingularName' otherlv_6= '=' ( (lv_cptSingularName_7_0= RULE_STRING ) ) otherlv_8= 'cptSupports' otherlv_9= '=' ( (lv_cptSupports_10_0= ruleStringList ) )? otherlv_11= 'cptTaxonomies' otherlv_12= '=' ( (lv_cptTaxonomies_13_0= ruleStringList ) )? otherlv_14= '}' ) ;
    public final EObject ruleCustomPostType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_cptName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_cptSingularName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_cptSupports_10_0 = null;

        EObject lv_cptTaxonomies_13_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:655:2: ( (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'cptName' otherlv_3= '=' ( (lv_cptName_4_0= RULE_STRING ) ) otherlv_5= 'cptSingularName' otherlv_6= '=' ( (lv_cptSingularName_7_0= RULE_STRING ) ) otherlv_8= 'cptSupports' otherlv_9= '=' ( (lv_cptSupports_10_0= ruleStringList ) )? otherlv_11= 'cptTaxonomies' otherlv_12= '=' ( (lv_cptTaxonomies_13_0= ruleStringList ) )? otherlv_14= '}' ) )
            // InternalEntityDsl.g:656:2: (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'cptName' otherlv_3= '=' ( (lv_cptName_4_0= RULE_STRING ) ) otherlv_5= 'cptSingularName' otherlv_6= '=' ( (lv_cptSingularName_7_0= RULE_STRING ) ) otherlv_8= 'cptSupports' otherlv_9= '=' ( (lv_cptSupports_10_0= ruleStringList ) )? otherlv_11= 'cptTaxonomies' otherlv_12= '=' ( (lv_cptTaxonomies_13_0= ruleStringList ) )? otherlv_14= '}' )
            {
            // InternalEntityDsl.g:656:2: (otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'cptName' otherlv_3= '=' ( (lv_cptName_4_0= RULE_STRING ) ) otherlv_5= 'cptSingularName' otherlv_6= '=' ( (lv_cptSingularName_7_0= RULE_STRING ) ) otherlv_8= 'cptSupports' otherlv_9= '=' ( (lv_cptSupports_10_0= ruleStringList ) )? otherlv_11= 'cptTaxonomies' otherlv_12= '=' ( (lv_cptTaxonomies_13_0= ruleStringList ) )? otherlv_14= '}' )
            // InternalEntityDsl.g:657:3: otherlv_0= 'CustomPostType' otherlv_1= '{' otherlv_2= 'cptName' otherlv_3= '=' ( (lv_cptName_4_0= RULE_STRING ) ) otherlv_5= 'cptSingularName' otherlv_6= '=' ( (lv_cptSingularName_7_0= RULE_STRING ) ) otherlv_8= 'cptSupports' otherlv_9= '=' ( (lv_cptSupports_10_0= ruleStringList ) )? otherlv_11= 'cptTaxonomies' otherlv_12= '=' ( (lv_cptTaxonomies_13_0= ruleStringList ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomPostTypeAccess().getCustomPostTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomPostTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomPostTypeAccess().getCptNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:673:3: ( (lv_cptName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:674:4: (lv_cptName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:674:4: (lv_cptName_4_0= RULE_STRING )
            // InternalEntityDsl.g:675:5: lv_cptName_4_0= RULE_STRING
            {
            lv_cptName_4_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_cptName_4_0, grammarAccess.getCustomPostTypeAccess().getCptNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomPostTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cptName",
            						lv_cptName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomPostTypeAccess().getCptSingularNameKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:699:3: ( (lv_cptSingularName_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:700:4: (lv_cptSingularName_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:700:4: (lv_cptSingularName_7_0= RULE_STRING )
            // InternalEntityDsl.g:701:5: lv_cptSingularName_7_0= RULE_STRING
            {
            lv_cptSingularName_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_cptSingularName_7_0, grammarAccess.getCustomPostTypeAccess().getCptSingularNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomPostTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cptSingularName",
            						lv_cptSingularName_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getCustomPostTypeAccess().getCptSupportsKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_9, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:725:3: ( (lv_cptSupports_10_0= ruleStringList ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEntityDsl.g:726:4: (lv_cptSupports_10_0= ruleStringList )
                    {
                    // InternalEntityDsl.g:726:4: (lv_cptSupports_10_0= ruleStringList )
                    // InternalEntityDsl.g:727:5: lv_cptSupports_10_0= ruleStringList
                    {

                    					newCompositeNode(grammarAccess.getCustomPostTypeAccess().getCptSupportsStringListParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_cptSupports_10_0=ruleStringList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCustomPostTypeRule());
                    					}
                    					add(
                    						current,
                    						"cptSupports",
                    						lv_cptSupports_10_0,
                    						"co7217.week18.entity.EntityDsl.StringList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getCustomPostTypeAccess().getEqualsSignKeyword_12());
            		
            // InternalEntityDsl.g:752:3: ( (lv_cptTaxonomies_13_0= ruleStringList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEntityDsl.g:753:4: (lv_cptTaxonomies_13_0= ruleStringList )
                    {
                    // InternalEntityDsl.g:753:4: (lv_cptTaxonomies_13_0= ruleStringList )
                    // InternalEntityDsl.g:754:5: lv_cptTaxonomies_13_0= ruleStringList
                    {

                    					newCompositeNode(grammarAccess.getCustomPostTypeAccess().getCptTaxonomiesStringListParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_cptTaxonomies_13_0=ruleStringList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCustomPostTypeRule());
                    					}
                    					add(
                    						current,
                    						"cptTaxonomies",
                    						lv_cptTaxonomies_13_0,
                    						"co7217.week18.entity.EntityDsl.StringList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCustomPostTypeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalEntityDsl.g:779:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalEntityDsl.g:779:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalEntityDsl.g:780:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalEntityDsl.g:786:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' ) ;
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
            // InternalEntityDsl.g:792:2: ( (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' ) )
            // InternalEntityDsl.g:793:2: (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' )
            {
            // InternalEntityDsl.g:793:2: (otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}' )
            // InternalEntityDsl.g:794:3: otherlv_0= 'Setting' otherlv_1= '{' otherlv_2= 'settingName' otherlv_3= '=' ( (lv_settingName_4_0= RULE_STRING ) ) otherlv_5= 'settingType' otherlv_6= '=' ( (lv_settingType_7_0= RULE_STRING ) ) otherlv_8= 'defaultValue' otherlv_9= '=' ( (lv_defaultValue_10_0= RULE_STRING ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getSettingNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:810:3: ( (lv_settingName_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:811:4: (lv_settingName_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:811:4: (lv_settingName_4_0= RULE_STRING )
            // InternalEntityDsl.g:812:5: lv_settingName_4_0= RULE_STRING
            {
            lv_settingName_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSettingAccess().getSettingTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSettingAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:836:3: ( (lv_settingType_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:837:4: (lv_settingType_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:837:4: (lv_settingType_7_0= RULE_STRING )
            // InternalEntityDsl.g:838:5: lv_settingType_7_0= RULE_STRING
            {
            lv_settingType_7_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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

            otherlv_8=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getSettingAccess().getDefaultValueKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getSettingAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:862:3: ( (lv_defaultValue_10_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEntityDsl.g:863:4: (lv_defaultValue_10_0= RULE_STRING )
                    {
                    // InternalEntityDsl.g:863:4: (lv_defaultValue_10_0= RULE_STRING )
                    // InternalEntityDsl.g:864:5: lv_defaultValue_10_0= RULE_STRING
                    {
                    lv_defaultValue_10_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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
    // InternalEntityDsl.g:888:1: entryRuleHook returns [EObject current=null] : iv_ruleHook= ruleHook EOF ;
    public final EObject entryRuleHook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHook = null;


        try {
            // InternalEntityDsl.g:888:45: (iv_ruleHook= ruleHook EOF )
            // InternalEntityDsl.g:889:2: iv_ruleHook= ruleHook EOF
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
    // InternalEntityDsl.g:895:1: ruleHook returns [EObject current=null] : (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' ) ;
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
            // InternalEntityDsl.g:901:2: ( (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' ) )
            // InternalEntityDsl.g:902:2: (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' )
            {
            // InternalEntityDsl.g:902:2: (otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}' )
            // InternalEntityDsl.g:903:3: otherlv_0= 'Hook' otherlv_1= '{' otherlv_2= 'hookType' otherlv_3= '=' ( (lv_hookType_4_0= ruleHookType ) ) otherlv_5= 'hookName' otherlv_6= '=' ( (lv_hookName_7_0= RULE_STRING ) ) otherlv_8= 'callback' otherlv_9= '=' ( (lv_callback_10_0= RULE_STRING ) ) otherlv_11= 'priority' otherlv_12= '=' ( (lv_priority_13_0= RULE_INT ) )? otherlv_14= 'acceptedArgs' otherlv_15= '=' ( (lv_acceptedArgs_16_0= RULE_INT ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHookAccess().getHookKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getHookAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getHookAccess().getHookTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getHookAccess().getEqualsSignKeyword_3());
            		
            // InternalEntityDsl.g:919:3: ( (lv_hookType_4_0= ruleHookType ) )
            // InternalEntityDsl.g:920:4: (lv_hookType_4_0= ruleHookType )
            {
            // InternalEntityDsl.g:920:4: (lv_hookType_4_0= ruleHookType )
            // InternalEntityDsl.g:921:5: lv_hookType_4_0= ruleHookType
            {

            					newCompositeNode(grammarAccess.getHookAccess().getHookTypeHookTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_5=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getHookAccess().getHookNameKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getHookAccess().getEqualsSignKeyword_6());
            		
            // InternalEntityDsl.g:946:3: ( (lv_hookName_7_0= RULE_STRING ) )
            // InternalEntityDsl.g:947:4: (lv_hookName_7_0= RULE_STRING )
            {
            // InternalEntityDsl.g:947:4: (lv_hookName_7_0= RULE_STRING )
            // InternalEntityDsl.g:948:5: lv_hookName_7_0= RULE_STRING
            {
            lv_hookName_7_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            otherlv_8=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getHookAccess().getCallbackKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getHookAccess().getEqualsSignKeyword_9());
            		
            // InternalEntityDsl.g:972:3: ( (lv_callback_10_0= RULE_STRING ) )
            // InternalEntityDsl.g:973:4: (lv_callback_10_0= RULE_STRING )
            {
            // InternalEntityDsl.g:973:4: (lv_callback_10_0= RULE_STRING )
            // InternalEntityDsl.g:974:5: lv_callback_10_0= RULE_STRING
            {
            lv_callback_10_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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

            otherlv_11=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getHookAccess().getPriorityKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_12, grammarAccess.getHookAccess().getEqualsSignKeyword_12());
            		
            // InternalEntityDsl.g:998:3: ( (lv_priority_13_0= RULE_INT ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEntityDsl.g:999:4: (lv_priority_13_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:999:4: (lv_priority_13_0= RULE_INT )
                    // InternalEntityDsl.g:1000:5: lv_priority_13_0= RULE_INT
                    {
                    lv_priority_13_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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

            otherlv_14=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getHookAccess().getAcceptedArgsKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_15, grammarAccess.getHookAccess().getEqualsSignKeyword_15());
            		
            // InternalEntityDsl.g:1024:3: ( (lv_acceptedArgs_16_0= RULE_INT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEntityDsl.g:1025:4: (lv_acceptedArgs_16_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:1025:4: (lv_acceptedArgs_16_0= RULE_INT )
                    // InternalEntityDsl.g:1026:5: lv_acceptedArgs_16_0= RULE_INT
                    {
                    lv_acceptedArgs_16_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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


    // $ANTLR start "entryRuleStringList"
    // InternalEntityDsl.g:1050:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // InternalEntityDsl.g:1050:51: (iv_ruleStringList= ruleStringList EOF )
            // InternalEntityDsl.g:1051:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
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
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalEntityDsl.g:1057:1: ruleStringList returns [EObject current=null] : ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleStringList() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:1063:2: ( ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* ) )
            // InternalEntityDsl.g:1064:2: ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* )
            {
            // InternalEntityDsl.g:1064:2: ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* )
            // InternalEntityDsl.g:1065:3: ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )*
            {
            // InternalEntityDsl.g:1065:3: ( (lv_values_0_0= RULE_STRING ) )
            // InternalEntityDsl.g:1066:4: (lv_values_0_0= RULE_STRING )
            {
            // InternalEntityDsl.g:1066:4: (lv_values_0_0= RULE_STRING )
            // InternalEntityDsl.g:1067:5: lv_values_0_0= RULE_STRING
            {
            lv_values_0_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_values_0_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringListRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalEntityDsl.g:1083:3: (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEntityDsl.g:1084:4: otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,45,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStringListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEntityDsl.g:1088:4: ( (lv_values_2_0= RULE_STRING ) )
            	    // InternalEntityDsl.g:1089:5: (lv_values_2_0= RULE_STRING )
            	    {
            	    // InternalEntityDsl.g:1089:5: (lv_values_2_0= RULE_STRING )
            	    // InternalEntityDsl.g:1090:6: lv_values_2_0= RULE_STRING
            	    {
            	    lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            	    						newLeafNode(lv_values_2_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStringListRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleStringList"


    // $ANTLR start "ruleHookType"
    // InternalEntityDsl.g:1111:1: ruleHookType returns [Enumerator current=null] : ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) ) ;
    public final Enumerator ruleHookType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:1117:2: ( ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) ) )
            // InternalEntityDsl.g:1118:2: ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) )
            {
            // InternalEntityDsl.g:1118:2: ( (enumLiteral_0= 'filter' ) | (enumLiteral_1= 'action' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            else if ( (LA15_0==47) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEntityDsl.g:1119:3: (enumLiteral_0= 'filter' )
                    {
                    // InternalEntityDsl.g:1119:3: (enumLiteral_0= 'filter' )
                    // InternalEntityDsl.g:1120:4: enumLiteral_0= 'filter'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHookTypeAccess().getFILTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:1127:3: (enumLiteral_1= 'action' )
                    {
                    // InternalEntityDsl.g:1127:3: (enumLiteral_1= 'action' )
                    // InternalEntityDsl.g:1128:4: enumLiteral_1= 'action'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008852000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000801000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000002L});

}