package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'('", "','", "')'", "'equal'", "'equalplus'", "'equalminus'", "'notequal'", "'notequalplus'", "'notequalminus'", "'showall'", "'log'", "'solve'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleTypes ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () ( (lv_elements_1_0= ruleTypes ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( (lv_elements_1_0= ruleTypes ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( (lv_elements_1_0= ruleTypes ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: () ( (lv_elements_1_0= ruleTypes ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:2: ( (lv_elements_1_0= ruleTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=16 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_elements_1_0= ruleTypes )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_elements_1_0= ruleTypes )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:3: lv_elements_1_0= ruleTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsTypesParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypes_in_ruleModel140);
            	    lv_elements_1_0=ruleTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"Types");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:112:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:113:2: (iv_ruleTypes= ruleTypes EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_ruleTypes_in_entryRuleTypes177);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypes187); 

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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: ruleTypes returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Equal_1= ruleEqual | this_NotEqual_2= ruleNotEqual | this_ShowAll_3= ruleShowAll | this_Solve_4= ruleSolve | this_EqualPlus_5= ruleEqualPlus | this_EqualMinus_6= ruleEqualMinus | this_NotEqualPlus_7= ruleNotEqualPlus | this_NotEqualMinus_8= ruleNotEqualMinus | this_Log_9= ruleLog ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Equal_1 = null;

        EObject this_NotEqual_2 = null;

        EObject this_ShowAll_3 = null;

        EObject this_Solve_4 = null;

        EObject this_EqualPlus_5 = null;

        EObject this_EqualMinus_6 = null;

        EObject this_NotEqualPlus_7 = null;

        EObject this_NotEqualMinus_8 = null;

        EObject this_Log_9 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:28: ( (this_Variable_0= ruleVariable | this_Equal_1= ruleEqual | this_NotEqual_2= ruleNotEqual | this_ShowAll_3= ruleShowAll | this_Solve_4= ruleSolve | this_EqualPlus_5= ruleEqualPlus | this_EqualMinus_6= ruleEqualMinus | this_NotEqualPlus_7= ruleNotEqualPlus | this_NotEqualMinus_8= ruleNotEqualMinus | this_Log_9= ruleLog ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_Variable_0= ruleVariable | this_Equal_1= ruleEqual | this_NotEqual_2= ruleNotEqual | this_ShowAll_3= ruleShowAll | this_Solve_4= ruleSolve | this_EqualPlus_5= ruleEqualPlus | this_EqualMinus_6= ruleEqualMinus | this_NotEqualPlus_7= ruleNotEqualPlus | this_NotEqualMinus_8= ruleNotEqualMinus | this_Log_9= ruleLog )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_Variable_0= ruleVariable | this_Equal_1= ruleEqual | this_NotEqual_2= ruleNotEqual | this_ShowAll_3= ruleShowAll | this_Solve_4= ruleSolve | this_EqualPlus_5= ruleEqualPlus | this_EqualMinus_6= ruleEqualMinus | this_NotEqualPlus_7= ruleNotEqualPlus | this_NotEqualMinus_8= ruleNotEqualMinus | this_Log_9= ruleLog )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 20:
                {
                alt2=8;
                }
                break;
            case 21:
                {
                alt2=9;
                }
                break;
            case 23:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleTypes234);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:5: this_Equal_1= ruleEqual
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getEqualParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEqual_in_ruleTypes261);
                    this_Equal_1=ruleEqual();

                    state._fsp--;

                     
                            current = this_Equal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:5: this_NotEqual_2= ruleNotEqual
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getNotEqualParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNotEqual_in_ruleTypes288);
                    this_NotEqual_2=ruleNotEqual();

                    state._fsp--;

                     
                            current = this_NotEqual_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:5: this_ShowAll_3= ruleShowAll
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getShowAllParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleShowAll_in_ruleTypes315);
                    this_ShowAll_3=ruleShowAll();

                    state._fsp--;

                     
                            current = this_ShowAll_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:166:5: this_Solve_4= ruleSolve
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getSolveParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSolve_in_ruleTypes342);
                    this_Solve_4=ruleSolve();

                    state._fsp--;

                     
                            current = this_Solve_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:5: this_EqualPlus_5= ruleEqualPlus
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getEqualPlusParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEqualPlus_in_ruleTypes369);
                    this_EqualPlus_5=ruleEqualPlus();

                    state._fsp--;

                     
                            current = this_EqualPlus_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:5: this_EqualMinus_6= ruleEqualMinus
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getEqualMinusParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleEqualMinus_in_ruleTypes396);
                    this_EqualMinus_6=ruleEqualMinus();

                    state._fsp--;

                     
                            current = this_EqualMinus_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:5: this_NotEqualPlus_7= ruleNotEqualPlus
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getNotEqualPlusParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleNotEqualPlus_in_ruleTypes423);
                    this_NotEqualPlus_7=ruleNotEqualPlus();

                    state._fsp--;

                     
                            current = this_NotEqualPlus_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:206:5: this_NotEqualMinus_8= ruleNotEqualMinus
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getNotEqualMinusParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleNotEqualMinus_in_ruleTypes450);
                    this_NotEqualMinus_8=ruleNotEqualMinus();

                    state._fsp--;

                     
                            current = this_NotEqualMinus_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:5: this_Log_9= ruleLog
                    {
                     
                            newCompositeNode(grammarAccess.getTypesAccess().getLogParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLog_in_ruleTypes477);
                    this_Log_9=ruleLog();

                    state._fsp--;

                     
                            current = this_Log_9; 
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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:232:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable512);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable522); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'var' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_range_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_range_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:244:28: ( ( () otherlv_1= 'var' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_range_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:1: ( () otherlv_1= 'var' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_range_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:1: ( () otherlv_1= 'var' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_range_5_0= RULE_INT ) ) otherlv_6= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:2: () otherlv_1= 'var' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_range_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:246:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleVariable568); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVarKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleVariable580); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:259:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:260:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:260:1: (lv_name_3_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable597); 

            			newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleVariable614); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getCommaKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:1: ( (lv_range_5_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:1: (lv_range_5_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:1: (lv_range_5_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:3: lv_range_5_0= RULE_INT
            {
            lv_range_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable631); 

            			newLeafNode(lv_range_5_0, grammarAccess.getVariableAccess().getRangeINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"range",
                    		lv_range_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleVariable648); 

                	newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEqual"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:2: (iv_ruleEqual= ruleEqual EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_ruleEqual_in_entryRuleEqual684);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqual694); 

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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:320:1: ruleEqual returns [EObject current=null] : (otherlv_0= 'equal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:323:28: ( (otherlv_0= 'equal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: (otherlv_0= 'equal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: (otherlv_0= 'equal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:3: otherlv_0= 'equal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEqual731); 

                	newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEqual743); 

                	newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqual763); 

            		newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getVar1VariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEqual775); 

                	newLeafNode(otherlv_3, grammarAccess.getEqualAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:349:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqual795); 

            		newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getVar2VariableCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEqual807); 

                	newLeafNode(otherlv_5, grammarAccess.getEqualAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleEqualPlus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:1: entryRuleEqualPlus returns [EObject current=null] : iv_ruleEqualPlus= ruleEqualPlus EOF ;
    public final EObject entryRuleEqualPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualPlus = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:2: (iv_ruleEqualPlus= ruleEqualPlus EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:2: iv_ruleEqualPlus= ruleEqualPlus EOF
            {
             newCompositeNode(grammarAccess.getEqualPlusRule()); 
            pushFollow(FOLLOW_ruleEqualPlus_in_entryRuleEqualPlus843);
            iv_ruleEqualPlus=ruleEqualPlus();

            state._fsp--;

             current =iv_ruleEqualPlus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualPlus853); 

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
    // $ANTLR end "entryRuleEqualPlus"


    // $ANTLR start "ruleEqualPlus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:1: ruleEqualPlus returns [EObject current=null] : (otherlv_0= 'equalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleEqualPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_range_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:28: ( (otherlv_0= 'equalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: (otherlv_0= 'equalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: (otherlv_0= 'equalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:3: otherlv_0= 'equalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEqualPlus890); 

                	newLeafNode(otherlv_0, grammarAccess.getEqualPlusAccess().getEqualplusKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEqualPlus902); 

                	newLeafNode(otherlv_1, grammarAccess.getEqualPlusAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualPlusRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqualPlus922); 

            		newLeafNode(otherlv_2, grammarAccess.getEqualPlusAccess().getVar1VariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEqualPlus934); 

                	newLeafNode(otherlv_3, grammarAccess.getEqualPlusAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:412:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualPlusRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqualPlus954); 

            		newLeafNode(otherlv_4, grammarAccess.getEqualPlusAccess().getVar2VariableCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEqualPlus966); 

                	newLeafNode(otherlv_5, grammarAccess.getEqualPlusAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:429:1: ( (lv_range_6_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: (lv_range_6_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: (lv_range_6_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:3: lv_range_6_0= RULE_INT
            {
            lv_range_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEqualPlus983); 

            			newLeafNode(lv_range_6_0, grammarAccess.getEqualPlusAccess().getRangeINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualPlusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"range",
                    		lv_range_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqualPlus1000); 

                	newLeafNode(otherlv_7, grammarAccess.getEqualPlusAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleEqualPlus"


    // $ANTLR start "entryRuleEqualMinus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: entryRuleEqualMinus returns [EObject current=null] : iv_ruleEqualMinus= ruleEqualMinus EOF ;
    public final EObject entryRuleEqualMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualMinus = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:2: (iv_ruleEqualMinus= ruleEqualMinus EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:2: iv_ruleEqualMinus= ruleEqualMinus EOF
            {
             newCompositeNode(grammarAccess.getEqualMinusRule()); 
            pushFollow(FOLLOW_ruleEqualMinus_in_entryRuleEqualMinus1036);
            iv_ruleEqualMinus=ruleEqualMinus();

            state._fsp--;

             current =iv_ruleEqualMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualMinus1046); 

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
    // $ANTLR end "entryRuleEqualMinus"


    // $ANTLR start "ruleEqualMinus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: ruleEqualMinus returns [EObject current=null] : (otherlv_0= 'equalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleEqualMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_range_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:28: ( (otherlv_0= 'equalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (otherlv_0= 'equalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (otherlv_0= 'equalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:3: otherlv_0= 'equalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEqualMinus1083); 

                	newLeafNode(otherlv_0, grammarAccess.getEqualMinusAccess().getEqualminusKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEqualMinus1095); 

                	newLeafNode(otherlv_1, grammarAccess.getEqualMinusAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualMinusRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqualMinus1115); 

            		newLeafNode(otherlv_2, grammarAccess.getEqualMinusAccess().getVar1VariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEqualMinus1127); 

                	newLeafNode(otherlv_3, grammarAccess.getEqualMinusAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:499:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualMinusRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqualMinus1147); 

            		newLeafNode(otherlv_4, grammarAccess.getEqualMinusAccess().getVar2VariableCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEqualMinus1159); 

                	newLeafNode(otherlv_5, grammarAccess.getEqualMinusAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: ( (lv_range_6_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (lv_range_6_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (lv_range_6_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:3: lv_range_6_0= RULE_INT
            {
            lv_range_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEqualMinus1176); 

            			newLeafNode(lv_range_6_0, grammarAccess.getEqualMinusAccess().getRangeINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualMinusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"range",
                    		lv_range_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqualMinus1193); 

                	newLeafNode(otherlv_7, grammarAccess.getEqualMinusAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleEqualMinus"


    // $ANTLR start "entryRuleNotEqual"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: entryRuleNotEqual returns [EObject current=null] : iv_ruleNotEqual= ruleNotEqual EOF ;
    public final EObject entryRuleNotEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqual = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:2: (iv_ruleNotEqual= ruleNotEqual EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:2: iv_ruleNotEqual= ruleNotEqual EOF
            {
             newCompositeNode(grammarAccess.getNotEqualRule()); 
            pushFollow(FOLLOW_ruleNotEqual_in_entryRuleNotEqual1229);
            iv_ruleNotEqual=ruleNotEqual();

            state._fsp--;

             current =iv_ruleNotEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqual1239); 

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
    // $ANTLR end "entryRuleNotEqual"


    // $ANTLR start "ruleNotEqual"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: ruleNotEqual returns [EObject current=null] : (otherlv_0= 'notequal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleNotEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:28: ( (otherlv_0= 'notequal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: (otherlv_0= 'notequal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: (otherlv_0= 'notequal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:3: otherlv_0= 'notequal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleNotEqual1276); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEqualAccess().getNotequalKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleNotEqual1288); 

                	newLeafNode(otherlv_1, grammarAccess.getNotEqualAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:567:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotEqual1308); 

            		newLeafNode(otherlv_2, grammarAccess.getNotEqualAccess().getVar1VariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleNotEqual1320); 

                	newLeafNode(otherlv_3, grammarAccess.getNotEqualAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:584:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotEqual1340); 

            		newLeafNode(otherlv_4, grammarAccess.getNotEqualAccess().getVar2VariableCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleNotEqual1352); 

                	newLeafNode(otherlv_5, grammarAccess.getNotEqualAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleNotEqual"


    // $ANTLR start "entryRuleNotEqualPlus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:1: entryRuleNotEqualPlus returns [EObject current=null] : iv_ruleNotEqualPlus= ruleNotEqualPlus EOF ;
    public final EObject entryRuleNotEqualPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualPlus = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:608:2: (iv_ruleNotEqualPlus= ruleNotEqualPlus EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:609:2: iv_ruleNotEqualPlus= ruleNotEqualPlus EOF
            {
             newCompositeNode(grammarAccess.getNotEqualPlusRule()); 
            pushFollow(FOLLOW_ruleNotEqualPlus_in_entryRuleNotEqualPlus1388);
            iv_ruleNotEqualPlus=ruleNotEqualPlus();

            state._fsp--;

             current =iv_ruleNotEqualPlus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualPlus1398); 

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
    // $ANTLR end "entryRuleNotEqualPlus"


    // $ANTLR start "ruleNotEqualPlus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:1: ruleNotEqualPlus returns [EObject current=null] : (otherlv_0= 'notequalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleNotEqualPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_range_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:619:28: ( (otherlv_0= 'notequalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:620:1: (otherlv_0= 'notequalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:620:1: (otherlv_0= 'notequalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:620:3: otherlv_0= 'notequalplus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNotEqualPlus1435); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEqualPlusAccess().getNotequalplusKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleNotEqualPlus1447); 

                	newLeafNode(otherlv_1, grammarAccess.getNotEqualPlusAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:628:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualPlusRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotEqualPlus1467); 

            		newLeafNode(otherlv_2, grammarAccess.getNotEqualPlusAccess().getVar1VariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleNotEqualPlus1479); 

                	newLeafNode(otherlv_3, grammarAccess.getNotEqualPlusAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualPlusRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotEqualPlus1499); 

            		newLeafNode(otherlv_4, grammarAccess.getNotEqualPlusAccess().getVar2VariableCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleNotEqualPlus1511); 

                	newLeafNode(otherlv_5, grammarAccess.getNotEqualPlusAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:1: ( (lv_range_6_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:1: (lv_range_6_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:1: (lv_range_6_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:664:3: lv_range_6_0= RULE_INT
            {
            lv_range_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNotEqualPlus1528); 

            			newLeafNode(lv_range_6_0, grammarAccess.getNotEqualPlusAccess().getRangeINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualPlusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"range",
                    		lv_range_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleNotEqualPlus1545); 

                	newLeafNode(otherlv_7, grammarAccess.getNotEqualPlusAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleNotEqualPlus"


    // $ANTLR start "entryRuleNotEqualMinus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:1: entryRuleNotEqualMinus returns [EObject current=null] : iv_ruleNotEqualMinus= ruleNotEqualMinus EOF ;
    public final EObject entryRuleNotEqualMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualMinus = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:693:2: (iv_ruleNotEqualMinus= ruleNotEqualMinus EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:2: iv_ruleNotEqualMinus= ruleNotEqualMinus EOF
            {
             newCompositeNode(grammarAccess.getNotEqualMinusRule()); 
            pushFollow(FOLLOW_ruleNotEqualMinus_in_entryRuleNotEqualMinus1581);
            iv_ruleNotEqualMinus=ruleNotEqualMinus();

            state._fsp--;

             current =iv_ruleNotEqualMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualMinus1591); 

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
    // $ANTLR end "entryRuleNotEqualMinus"


    // $ANTLR start "ruleNotEqualMinus"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:1: ruleNotEqualMinus returns [EObject current=null] : (otherlv_0= 'notequalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleNotEqualMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_range_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:28: ( (otherlv_0= 'notequalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:1: (otherlv_0= 'notequalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:1: (otherlv_0= 'notequalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:3: otherlv_0= 'notequalminus' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_range_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleNotEqualMinus1628); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEqualMinusAccess().getNotequalminusKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleNotEqualMinus1640); 

                	newLeafNode(otherlv_1, grammarAccess.getNotEqualMinusAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualMinusRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotEqualMinus1660); 

            		newLeafNode(otherlv_2, grammarAccess.getNotEqualMinusAccess().getVar1VariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleNotEqualMinus1672); 

                	newLeafNode(otherlv_3, grammarAccess.getNotEqualMinusAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualMinusRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotEqualMinus1692); 

            		newLeafNode(otherlv_4, grammarAccess.getNotEqualMinusAccess().getVar2VariableCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleNotEqualMinus1704); 

                	newLeafNode(otherlv_5, grammarAccess.getNotEqualMinusAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:747:1: ( (lv_range_6_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:748:1: (lv_range_6_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:748:1: (lv_range_6_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:3: lv_range_6_0= RULE_INT
            {
            lv_range_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNotEqualMinus1721); 

            			newLeafNode(lv_range_6_0, grammarAccess.getNotEqualMinusAccess().getRangeINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualMinusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"range",
                    		lv_range_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleNotEqualMinus1738); 

                	newLeafNode(otherlv_7, grammarAccess.getNotEqualMinusAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleNotEqualMinus"


    // $ANTLR start "entryRuleShowAll"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:1: entryRuleShowAll returns [EObject current=null] : iv_ruleShowAll= ruleShowAll EOF ;
    public final EObject entryRuleShowAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowAll = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:2: (iv_ruleShowAll= ruleShowAll EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:779:2: iv_ruleShowAll= ruleShowAll EOF
            {
             newCompositeNode(grammarAccess.getShowAllRule()); 
            pushFollow(FOLLOW_ruleShowAll_in_entryRuleShowAll1774);
            iv_ruleShowAll=ruleShowAll();

            state._fsp--;

             current =iv_ruleShowAll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShowAll1784); 

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
    // $ANTLR end "entryRuleShowAll"


    // $ANTLR start "ruleShowAll"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:1: ruleShowAll returns [EObject current=null] : (otherlv_0= 'showall' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' ) ;
    public final EObject ruleShowAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_range_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:789:28: ( (otherlv_0= 'showall' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:1: (otherlv_0= 'showall' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:1: (otherlv_0= 'showall' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:3: otherlv_0= 'showall' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleShowAll1821); 

                	newLeafNode(otherlv_0, grammarAccess.getShowAllAccess().getShowallKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleShowAll1833); 

                	newLeafNode(otherlv_1, grammarAccess.getShowAllAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:798:1: ( (lv_range_2_0= RULE_BOOLEAN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:1: (lv_range_2_0= RULE_BOOLEAN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:1: (lv_range_2_0= RULE_BOOLEAN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:3: lv_range_2_0= RULE_BOOLEAN
            {
            lv_range_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleShowAll1850); 

            			newLeafNode(lv_range_2_0, grammarAccess.getShowAllAccess().getRangeBOOLEANTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getShowAllRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"range",
                    		lv_range_2_0, 
                    		"BOOLEAN");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleShowAll1867); 

                	newLeafNode(otherlv_3, grammarAccess.getShowAllAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleShowAll"


    // $ANTLR start "entryRuleLog"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:2: (iv_ruleLog= ruleLog EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_ruleLog_in_entryRuleLog1903);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog1913); 

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
    // $ANTLR end "entryRuleLog"


    // $ANTLR start "ruleLog"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: ruleLog returns [EObject current=null] : (otherlv_0= 'log' otherlv_1= '(' ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_str_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:28: ( (otherlv_0= 'log' otherlv_1= '(' ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:841:1: (otherlv_0= 'log' otherlv_1= '(' ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:841:1: (otherlv_0= 'log' otherlv_1= '(' ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:841:3: otherlv_0= 'log' otherlv_1= '(' ( (lv_str_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleLog1950); 

                	newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleLog1962); 

                	newLeafNode(otherlv_1, grammarAccess.getLogAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:1: ( (lv_str_2_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:1: (lv_str_2_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:1: (lv_str_2_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:3: lv_str_2_0= RULE_STRING
            {
            lv_str_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLog1979); 

            			newLeafNode(lv_str_2_0, grammarAccess.getLogAccess().getStrSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLogRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"str",
                    		lv_str_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLog1996); 

                	newLeafNode(otherlv_3, grammarAccess.getLogAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleLog"


    // $ANTLR start "entryRuleSolve"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:879:1: entryRuleSolve returns [EObject current=null] : iv_ruleSolve= ruleSolve EOF ;
    public final EObject entryRuleSolve() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolve = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:880:2: (iv_ruleSolve= ruleSolve EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:2: iv_ruleSolve= ruleSolve EOF
            {
             newCompositeNode(grammarAccess.getSolveRule()); 
            pushFollow(FOLLOW_ruleSolve_in_entryRuleSolve2032);
            iv_ruleSolve=ruleSolve();

            state._fsp--;

             current =iv_ruleSolve; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolve2042); 

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
    // $ANTLR end "entryRuleSolve"


    // $ANTLR start "ruleSolve"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:1: ruleSolve returns [EObject current=null] : (otherlv_0= 'solve' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' ) ;
    public final EObject ruleSolve() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_range_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:28: ( (otherlv_0= 'solve' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:1: (otherlv_0= 'solve' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:1: (otherlv_0= 'solve' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:3: otherlv_0= 'solve' otherlv_1= '(' ( (lv_range_2_0= RULE_BOOLEAN ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSolve2079); 

                	newLeafNode(otherlv_0, grammarAccess.getSolveAccess().getSolveKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSolve2091); 

                	newLeafNode(otherlv_1, grammarAccess.getSolveAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:900:1: ( (lv_range_2_0= RULE_BOOLEAN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_range_2_0= RULE_BOOLEAN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_range_2_0= RULE_BOOLEAN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:902:3: lv_range_2_0= RULE_BOOLEAN
            {
            lv_range_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleSolve2108); 

            			newLeafNode(lv_range_2_0, grammarAccess.getSolveAccess().getRangeBOOLEANTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSolveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"range",
                    		lv_range_2_0, 
                    		"BOOLEAN");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSolve2125); 

                	newLeafNode(otherlv_3, grammarAccess.getSolveAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSolve"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypes_in_ruleModel140 = new BitSet(new long[]{0x0000000001FF1002L});
    public static final BitSet FOLLOW_ruleTypes_in_entryRuleTypes177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypes187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTypes234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqual_in_ruleTypes261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqual_in_ruleTypes288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowAll_in_ruleTypes315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolve_in_ruleTypes342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualPlus_in_ruleTypes369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualMinus_in_ruleTypes396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualPlus_in_ruleTypes423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualMinus_in_ruleTypes450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_ruleTypes477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleVariable568 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVariable580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable597 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariable614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable631 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariable648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqual_in_entryRuleEqual684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqual694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEqual731 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEqual743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqual763 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqual775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqual795 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqual807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualPlus_in_entryRuleEqualPlus843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualPlus853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEqualPlus890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEqualPlus902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqualPlus922 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqualPlus934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqualPlus954 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqualPlus966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEqualPlus983 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqualPlus1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualMinus_in_entryRuleEqualMinus1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualMinus1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEqualMinus1083 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEqualMinus1095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqualMinus1115 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqualMinus1127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqualMinus1147 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqualMinus1159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEqualMinus1176 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqualMinus1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqual_in_entryRuleNotEqual1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqual1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNotEqual1276 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNotEqual1288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotEqual1308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotEqual1320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotEqual1340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNotEqual1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualPlus_in_entryRuleNotEqualPlus1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualPlus1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNotEqualPlus1435 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNotEqualPlus1447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotEqualPlus1467 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotEqualPlus1479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotEqualPlus1499 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotEqualPlus1511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNotEqualPlus1528 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNotEqualPlus1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualMinus_in_entryRuleNotEqualMinus1581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualMinus1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNotEqualMinus1628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNotEqualMinus1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotEqualMinus1660 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotEqualMinus1672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotEqualMinus1692 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotEqualMinus1704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNotEqualMinus1721 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNotEqualMinus1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowAll_in_entryRuleShowAll1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShowAll1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleShowAll1821 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleShowAll1833 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleShowAll1850 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleShowAll1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_in_entryRuleLog1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLog1950 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLog1962 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLog1979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLog1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolve_in_entryRuleSolve2032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolve2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSolve2079 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSolve2091 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleSolve2108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSolve2125 = new BitSet(new long[]{0x0000000000000002L});

}