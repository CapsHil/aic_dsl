package com.zenika.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.zenika.services.AicdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAicdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'Feature: '", "'End'", "'Scenario: '", "'Set sensor'", "'at'", "'Set battery level at'", "'Set Gps position at'", "','", "'Take a screenshot'", "'Click on '", "' button'", "'Kill application'", "'Run'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAicdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAicdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAicdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAicdsl.g"; }



     	private AicdslGrammarAccess grammarAccess;

        public InternalAicdslParser(TokenStream input, AicdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dsl";
       	}

       	@Override
       	protected AicdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDsl"
    // InternalAicdsl.g:64:1: entryRuleDsl returns [EObject current=null] : iv_ruleDsl= ruleDsl EOF ;
    public final EObject entryRuleDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDsl = null;


        try {
            // InternalAicdsl.g:64:44: (iv_ruleDsl= ruleDsl EOF )
            // InternalAicdsl.g:65:2: iv_ruleDsl= ruleDsl EOF
            {
             newCompositeNode(grammarAccess.getDslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDsl=ruleDsl();

            state._fsp--;

             current =iv_ruleDsl; 
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
    // $ANTLR end "entryRuleDsl"


    // $ANTLR start "ruleDsl"
    // InternalAicdsl.g:71:1: ruleDsl returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalAicdsl.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalAicdsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalAicdsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAicdsl.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalAicdsl.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalAicdsl.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDslAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDslRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"com.zenika.Aicdsl.Type");
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
    // $ANTLR end "ruleDsl"


    // $ANTLR start "entryRuleFLOAT"
    // InternalAicdsl.g:100:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalAicdsl.g:100:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalAicdsl.g:101:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalAicdsl.g:107:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAicdsl.g:113:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalAicdsl.g:114:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalAicdsl.g:114:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalAicdsl.g:115:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            // InternalAicdsl.g:122:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAicdsl.g:123:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,11,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleType"
    // InternalAicdsl.g:140:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAicdsl.g:140:45: (iv_ruleType= ruleType EOF )
            // InternalAicdsl.g:141:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAicdsl.g:147:1: ruleType returns [EObject current=null] : this_Feature_0= ruleFeature ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Feature_0 = null;



        	enterRule();

        try {
            // InternalAicdsl.g:153:2: (this_Feature_0= ruleFeature )
            // InternalAicdsl.g:154:2: this_Feature_0= ruleFeature
            {

            		newCompositeNode(grammarAccess.getTypeAccess().getFeatureParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Feature_0=ruleFeature();

            state._fsp--;


            		current = this_Feature_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFeature"
    // InternalAicdsl.g:165:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAicdsl.g:165:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAicdsl.g:166:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalAicdsl.g:172:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_scenarios_2_0= ruleScenario ) )+ otherlv_3= 'End' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_3=null;
        EObject lv_scenarios_2_0 = null;



        	enterRule();

        try {
            // InternalAicdsl.g:178:2: ( (otherlv_0= 'Feature: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_scenarios_2_0= ruleScenario ) )+ otherlv_3= 'End' ) )
            // InternalAicdsl.g:179:2: (otherlv_0= 'Feature: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_scenarios_2_0= ruleScenario ) )+ otherlv_3= 'End' )
            {
            // InternalAicdsl.g:179:2: (otherlv_0= 'Feature: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_scenarios_2_0= ruleScenario ) )+ otherlv_3= 'End' )
            // InternalAicdsl.g:180:3: otherlv_0= 'Feature: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_scenarios_2_0= ruleScenario ) )+ otherlv_3= 'End'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalAicdsl.g:184:3: ( (lv_title_1_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAicdsl.g:185:4: (lv_title_1_0= RULE_STRING )
                    {
                    // InternalAicdsl.g:185:4: (lv_title_1_0= RULE_STRING )
                    // InternalAicdsl.g:186:5: lv_title_1_0= RULE_STRING
                    {
                    lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_title_1_0, grammarAccess.getFeatureAccess().getTitleSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"title",
                    						lv_title_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalAicdsl.g:202:3: ( (lv_scenarios_2_0= ruleScenario ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAicdsl.g:203:4: (lv_scenarios_2_0= ruleScenario )
            	    {
            	    // InternalAicdsl.g:203:4: (lv_scenarios_2_0= ruleScenario )
            	    // InternalAicdsl.g:204:5: lv_scenarios_2_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_scenarios_2_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_2_0,
            	    						"com.zenika.Aicdsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleScenario"
    // InternalAicdsl.g:229:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalAicdsl.g:229:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalAicdsl.g:230:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalAicdsl.g:236:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= 'End' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalAicdsl.g:242:2: ( (otherlv_0= 'Scenario: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= 'End' ) )
            // InternalAicdsl.g:243:2: (otherlv_0= 'Scenario: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= 'End' )
            {
            // InternalAicdsl.g:243:2: (otherlv_0= 'Scenario: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= 'End' )
            // InternalAicdsl.g:244:3: otherlv_0= 'Scenario: ' ( (lv_title_1_0= RULE_STRING ) )? ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= 'End'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalAicdsl.g:248:3: ( (lv_title_1_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAicdsl.g:249:4: (lv_title_1_0= RULE_STRING )
                    {
                    // InternalAicdsl.g:249:4: (lv_title_1_0= RULE_STRING )
                    // InternalAicdsl.g:250:5: lv_title_1_0= RULE_STRING
                    {
                    lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    					newLeafNode(lv_title_1_0, grammarAccess.getScenarioAccess().getTitleSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScenarioRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"title",
                    						lv_title_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalAicdsl.g:266:3: ( (lv_actions_2_0= ruleAction ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||(LA6_0>=17 && LA6_0<=18)||(LA6_0>=20 && LA6_0<=21)||(LA6_0>=23 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAicdsl.g:267:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalAicdsl.g:267:4: (lv_actions_2_0= ruleAction )
            	    // InternalAicdsl.g:268:5: lv_actions_2_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getActionsActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"com.zenika.Aicdsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleAction"
    // InternalAicdsl.g:293:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAicdsl.g:293:47: (iv_ruleAction= ruleAction EOF )
            // InternalAicdsl.g:294:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAicdsl.g:300:1: ruleAction returns [EObject current=null] : (this_Sensor_0= ruleSensor | ruleScreenshot | this_Click_2= ruleClick | ruleStop | this_Run_4= ruleRun | this_Battery_5= ruleBattery | this_Gps_6= ruleGps ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Click_2 = null;

        EObject this_Run_4 = null;

        EObject this_Battery_5 = null;

        EObject this_Gps_6 = null;



        	enterRule();

        try {
            // InternalAicdsl.g:306:2: ( (this_Sensor_0= ruleSensor | ruleScreenshot | this_Click_2= ruleClick | ruleStop | this_Run_4= ruleRun | this_Battery_5= ruleBattery | this_Gps_6= ruleGps ) )
            // InternalAicdsl.g:307:2: (this_Sensor_0= ruleSensor | ruleScreenshot | this_Click_2= ruleClick | ruleStop | this_Run_4= ruleRun | this_Battery_5= ruleBattery | this_Gps_6= ruleGps )
            {
            // InternalAicdsl.g:307:2: (this_Sensor_0= ruleSensor | ruleScreenshot | this_Click_2= ruleClick | ruleStop | this_Run_4= ruleRun | this_Battery_5= ruleBattery | this_Gps_6= ruleGps )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            case 24:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            case 18:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAicdsl.g:308:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAicdsl.g:317:3: ruleScreenshot
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getScreenshotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleScreenshot();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAicdsl.g:325:3: this_Click_2= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_2=ruleClick();

                    state._fsp--;


                    			current = this_Click_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAicdsl.g:334:3: ruleStop
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleStop();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAicdsl.g:342:3: this_Run_4= ruleRun
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRunParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Run_4=ruleRun();

                    state._fsp--;


                    			current = this_Run_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAicdsl.g:351:3: this_Battery_5= ruleBattery
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBatteryParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Battery_5=ruleBattery();

                    state._fsp--;


                    			current = this_Battery_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAicdsl.g:360:3: this_Gps_6= ruleGps
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGpsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gps_6=ruleGps();

                    state._fsp--;


                    			current = this_Gps_6;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleSensor"
    // InternalAicdsl.g:372:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalAicdsl.g:372:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalAicdsl.g:373:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalAicdsl.g:379:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Set sensor' ( (lv_sensorName_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) ( (otherlv_4= RULE_STRING ) )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sensorName_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAicdsl.g:385:2: ( (otherlv_0= 'Set sensor' ( (lv_sensorName_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) ( (otherlv_4= RULE_STRING ) )? ) )
            // InternalAicdsl.g:386:2: (otherlv_0= 'Set sensor' ( (lv_sensorName_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) ( (otherlv_4= RULE_STRING ) )? )
            {
            // InternalAicdsl.g:386:2: (otherlv_0= 'Set sensor' ( (lv_sensorName_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) ( (otherlv_4= RULE_STRING ) )? )
            // InternalAicdsl.g:387:3: otherlv_0= 'Set sensor' ( (lv_sensorName_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) ( (otherlv_4= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSetSensorKeyword_0());
            		
            // InternalAicdsl.g:391:3: ( (lv_sensorName_1_0= RULE_ID ) )
            // InternalAicdsl.g:392:4: (lv_sensorName_1_0= RULE_ID )
            {
            // InternalAicdsl.g:392:4: (lv_sensorName_1_0= RULE_ID )
            // InternalAicdsl.g:393:5: lv_sensorName_1_0= RULE_ID
            {
            lv_sensorName_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_sensorName_1_0, grammarAccess.getSensorAccess().getSensorNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sensorName",
            						lv_sensorName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getAtKeyword_2());
            		
            // InternalAicdsl.g:413:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalAicdsl.g:414:4: (lv_value_3_0= RULE_INT )
            {
            // InternalAicdsl.g:414:4: (lv_value_3_0= RULE_INT )
            // InternalAicdsl.g:415:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_value_3_0, grammarAccess.getSensorAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalAicdsl.g:431:3: ( (otherlv_4= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAicdsl.g:432:4: (otherlv_4= RULE_STRING )
                    {
                    // InternalAicdsl.g:432:4: (otherlv_4= RULE_STRING )
                    // InternalAicdsl.g:433:5: otherlv_4= RULE_STRING
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSensorRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getTitleScenarioCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleBattery"
    // InternalAicdsl.g:448:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalAicdsl.g:448:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalAicdsl.g:449:2: iv_ruleBattery= ruleBattery EOF
            {
             newCompositeNode(grammarAccess.getBatteryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBattery=ruleBattery();

            state._fsp--;

             current =iv_ruleBattery; 
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
    // $ANTLR end "entryRuleBattery"


    // $ANTLR start "ruleBattery"
    // InternalAicdsl.g:455:1: ruleBattery returns [EObject current=null] : (otherlv_0= 'Set battery level at' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBattery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAicdsl.g:461:2: ( (otherlv_0= 'Set battery level at' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalAicdsl.g:462:2: (otherlv_0= 'Set battery level at' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalAicdsl.g:462:2: (otherlv_0= 'Set battery level at' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalAicdsl.g:463:3: otherlv_0= 'Set battery level at' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBatteryAccess().getSetBatteryLevelAtKeyword_0());
            		
            // InternalAicdsl.g:467:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalAicdsl.g:468:4: (lv_value_1_0= RULE_INT )
            {
            // InternalAicdsl.g:468:4: (lv_value_1_0= RULE_INT )
            // InternalAicdsl.g:469:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBatteryAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBatteryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // $ANTLR end "ruleBattery"


    // $ANTLR start "entryRuleGps"
    // InternalAicdsl.g:489:1: entryRuleGps returns [EObject current=null] : iv_ruleGps= ruleGps EOF ;
    public final EObject entryRuleGps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGps = null;


        try {
            // InternalAicdsl.g:489:44: (iv_ruleGps= ruleGps EOF )
            // InternalAicdsl.g:490:2: iv_ruleGps= ruleGps EOF
            {
             newCompositeNode(grammarAccess.getGpsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGps=ruleGps();

            state._fsp--;

             current =iv_ruleGps; 
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
    // $ANTLR end "entryRuleGps"


    // $ANTLR start "ruleGps"
    // InternalAicdsl.g:496:1: ruleGps returns [EObject current=null] : (otherlv_0= 'Set Gps position at' ( (lv_lat_1_0= ruleFLOAT ) ) otherlv_2= ',' ( (lv_lon_3_0= ruleFLOAT ) ) otherlv_4= ',' ( (lv_alti_5_0= ruleFLOAT ) ) ) ;
    public final EObject ruleGps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lat_1_0 = null;

        AntlrDatatypeRuleToken lv_lon_3_0 = null;

        AntlrDatatypeRuleToken lv_alti_5_0 = null;



        	enterRule();

        try {
            // InternalAicdsl.g:502:2: ( (otherlv_0= 'Set Gps position at' ( (lv_lat_1_0= ruleFLOAT ) ) otherlv_2= ',' ( (lv_lon_3_0= ruleFLOAT ) ) otherlv_4= ',' ( (lv_alti_5_0= ruleFLOAT ) ) ) )
            // InternalAicdsl.g:503:2: (otherlv_0= 'Set Gps position at' ( (lv_lat_1_0= ruleFLOAT ) ) otherlv_2= ',' ( (lv_lon_3_0= ruleFLOAT ) ) otherlv_4= ',' ( (lv_alti_5_0= ruleFLOAT ) ) )
            {
            // InternalAicdsl.g:503:2: (otherlv_0= 'Set Gps position at' ( (lv_lat_1_0= ruleFLOAT ) ) otherlv_2= ',' ( (lv_lon_3_0= ruleFLOAT ) ) otherlv_4= ',' ( (lv_alti_5_0= ruleFLOAT ) ) )
            // InternalAicdsl.g:504:3: otherlv_0= 'Set Gps position at' ( (lv_lat_1_0= ruleFLOAT ) ) otherlv_2= ',' ( (lv_lon_3_0= ruleFLOAT ) ) otherlv_4= ',' ( (lv_alti_5_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGpsAccess().getSetGpsPositionAtKeyword_0());
            		
            // InternalAicdsl.g:508:3: ( (lv_lat_1_0= ruleFLOAT ) )
            // InternalAicdsl.g:509:4: (lv_lat_1_0= ruleFLOAT )
            {
            // InternalAicdsl.g:509:4: (lv_lat_1_0= ruleFLOAT )
            // InternalAicdsl.g:510:5: lv_lat_1_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getGpsAccess().getLatFLOATParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_lat_1_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpsRule());
            					}
            					set(
            						current,
            						"lat",
            						lv_lat_1_0,
            						"com.zenika.Aicdsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGpsAccess().getCommaKeyword_2());
            		
            // InternalAicdsl.g:531:3: ( (lv_lon_3_0= ruleFLOAT ) )
            // InternalAicdsl.g:532:4: (lv_lon_3_0= ruleFLOAT )
            {
            // InternalAicdsl.g:532:4: (lv_lon_3_0= ruleFLOAT )
            // InternalAicdsl.g:533:5: lv_lon_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getGpsAccess().getLonFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_lon_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpsRule());
            					}
            					set(
            						current,
            						"lon",
            						lv_lon_3_0,
            						"com.zenika.Aicdsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getGpsAccess().getCommaKeyword_4());
            		
            // InternalAicdsl.g:554:3: ( (lv_alti_5_0= ruleFLOAT ) )
            // InternalAicdsl.g:555:4: (lv_alti_5_0= ruleFLOAT )
            {
            // InternalAicdsl.g:555:4: (lv_alti_5_0= ruleFLOAT )
            // InternalAicdsl.g:556:5: lv_alti_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getGpsAccess().getAltiFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_alti_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGpsRule());
            					}
            					set(
            						current,
            						"alti",
            						lv_alti_5_0,
            						"com.zenika.Aicdsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleGps"


    // $ANTLR start "entryRuleScreenshot"
    // InternalAicdsl.g:577:1: entryRuleScreenshot returns [String current=null] : iv_ruleScreenshot= ruleScreenshot EOF ;
    public final String entryRuleScreenshot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScreenshot = null;


        try {
            // InternalAicdsl.g:577:50: (iv_ruleScreenshot= ruleScreenshot EOF )
            // InternalAicdsl.g:578:2: iv_ruleScreenshot= ruleScreenshot EOF
            {
             newCompositeNode(grammarAccess.getScreenshotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScreenshot=ruleScreenshot();

            state._fsp--;

             current =iv_ruleScreenshot.getText(); 
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
    // $ANTLR end "entryRuleScreenshot"


    // $ANTLR start "ruleScreenshot"
    // InternalAicdsl.g:584:1: ruleScreenshot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Take a screenshot' ;
    public final AntlrDatatypeRuleToken ruleScreenshot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAicdsl.g:590:2: (kw= 'Take a screenshot' )
            // InternalAicdsl.g:591:2: kw= 'Take a screenshot'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getScreenshotAccess().getTakeAScreenshotKeyword());
            	

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
    // $ANTLR end "ruleScreenshot"


    // $ANTLR start "entryRuleClick"
    // InternalAicdsl.g:599:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalAicdsl.g:599:46: (iv_ruleClick= ruleClick EOF )
            // InternalAicdsl.g:600:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalAicdsl.g:606:1: ruleClick returns [EObject current=null] : (otherlv_0= 'Click on ' ( (lv_buttonName_1_0= RULE_ID ) ) otherlv_2= ' button' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_buttonName_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAicdsl.g:612:2: ( (otherlv_0= 'Click on ' ( (lv_buttonName_1_0= RULE_ID ) ) otherlv_2= ' button' ) )
            // InternalAicdsl.g:613:2: (otherlv_0= 'Click on ' ( (lv_buttonName_1_0= RULE_ID ) ) otherlv_2= ' button' )
            {
            // InternalAicdsl.g:613:2: (otherlv_0= 'Click on ' ( (lv_buttonName_1_0= RULE_ID ) ) otherlv_2= ' button' )
            // InternalAicdsl.g:614:3: otherlv_0= 'Click on ' ( (lv_buttonName_1_0= RULE_ID ) ) otherlv_2= ' button'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickOnKeyword_0());
            		
            // InternalAicdsl.g:618:3: ( (lv_buttonName_1_0= RULE_ID ) )
            // InternalAicdsl.g:619:4: (lv_buttonName_1_0= RULE_ID )
            {
            // InternalAicdsl.g:619:4: (lv_buttonName_1_0= RULE_ID )
            // InternalAicdsl.g:620:5: lv_buttonName_1_0= RULE_ID
            {
            lv_buttonName_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_buttonName_1_0, grammarAccess.getClickAccess().getButtonNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickRule());
            					}
            					setWithLastConsumed(
            						current,
            						"buttonName",
            						lv_buttonName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getClickAccess().getButtonKeyword_2());
            		

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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleStop"
    // InternalAicdsl.g:644:1: entryRuleStop returns [String current=null] : iv_ruleStop= ruleStop EOF ;
    public final String entryRuleStop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStop = null;


        try {
            // InternalAicdsl.g:644:44: (iv_ruleStop= ruleStop EOF )
            // InternalAicdsl.g:645:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop.getText(); 
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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalAicdsl.g:651:1: ruleStop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Kill application' ;
    public final AntlrDatatypeRuleToken ruleStop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAicdsl.g:657:2: (kw= 'Kill application' )
            // InternalAicdsl.g:658:2: kw= 'Kill application'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getStopAccess().getKillApplicationKeyword());
            	

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
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleRun"
    // InternalAicdsl.g:666:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalAicdsl.g:666:44: (iv_ruleRun= ruleRun EOF )
            // InternalAicdsl.g:667:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalAicdsl.g:673:1: ruleRun returns [EObject current=null] : (otherlv_0= 'Run' ( (lv_appName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appName_1_0=null;


        	enterRule();

        try {
            // InternalAicdsl.g:679:2: ( (otherlv_0= 'Run' ( (lv_appName_1_0= RULE_ID ) ) ) )
            // InternalAicdsl.g:680:2: (otherlv_0= 'Run' ( (lv_appName_1_0= RULE_ID ) ) )
            {
            // InternalAicdsl.g:680:2: (otherlv_0= 'Run' ( (lv_appName_1_0= RULE_ID ) ) )
            // InternalAicdsl.g:681:3: otherlv_0= 'Run' ( (lv_appName_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRunKeyword_0());
            		
            // InternalAicdsl.g:685:3: ( (lv_appName_1_0= RULE_ID ) )
            // InternalAicdsl.g:686:4: (lv_appName_1_0= RULE_ID )
            {
            // InternalAicdsl.g:686:4: (lv_appName_1_0= RULE_ID )
            // InternalAicdsl.g:687:5: lv_appName_1_0= RULE_ID
            {
            lv_appName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_appName_1_0, grammarAccess.getRunAccess().getAppNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appName",
            						lv_appName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleRun"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001B68020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001B6A020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}