// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\WORK\\mg\\src\\mg.g 2013-08-29 17:41:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class mgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DEDENT", "NEWLINE", "ID", "KEY_MAIN", "CLEAR_LINE", "INT", "DOUBLE", "KEY_INT", "KEY_DOUBLE", "KEY_VOID", "KEY_BOOL", "INDENT", "KEY_RETURN", "KEY_BREAK", "KEY_FALSE", "KEY_TRUE", "KEY_IF", "KEY_ELSE", "KEY_WHILE", "KEY_REPEAT", "KEY_UNTIL", "KEY_FOR", "SEMI", "KEY_READ", "KEY_WRITE", "DIV", "DIV_ASSIGN", "PLUS", "PLUS_ASSIGN", "INC", "MINUS", "MINUS_ASSIGN", "DEC", "STAR", "STAR_ASSIGN", "MOD", "MOD_ASSIGN", "ASSIGN", "KEY_AND", "KEY_OR", "EQUAL", "NOT_EQUAL", "GE", "GT", "LE", "LT", "NOT", "TAB", "KEY_PRINT", "KEY_POW", "KEY_SQRT", "KEY_CONST", "DIGIT", "LETTER", "COMMENT", "WS", "'global'", "'('", "')'", "','", "'['", "']'", "'pow'"
    };
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int DEDENT=4;
    public static final int NEWLINE=5;
    public static final int ID=6;
    public static final int KEY_MAIN=7;
    public static final int CLEAR_LINE=8;
    public static final int INT=9;
    public static final int DOUBLE=10;
    public static final int KEY_INT=11;
    public static final int KEY_DOUBLE=12;
    public static final int KEY_VOID=13;
    public static final int KEY_BOOL=14;
    public static final int INDENT=15;
    public static final int KEY_RETURN=16;
    public static final int KEY_BREAK=17;
    public static final int KEY_FALSE=18;
    public static final int KEY_TRUE=19;
    public static final int KEY_IF=20;
    public static final int KEY_ELSE=21;
    public static final int KEY_WHILE=22;
    public static final int KEY_REPEAT=23;
    public static final int KEY_UNTIL=24;
    public static final int KEY_FOR=25;
    public static final int SEMI=26;
    public static final int KEY_READ=27;
    public static final int KEY_WRITE=28;
    public static final int DIV=29;
    public static final int DIV_ASSIGN=30;
    public static final int PLUS=31;
    public static final int PLUS_ASSIGN=32;
    public static final int INC=33;
    public static final int MINUS=34;
    public static final int MINUS_ASSIGN=35;
    public static final int DEC=36;
    public static final int STAR=37;
    public static final int STAR_ASSIGN=38;
    public static final int MOD=39;
    public static final int MOD_ASSIGN=40;
    public static final int ASSIGN=41;
    public static final int KEY_AND=42;
    public static final int KEY_OR=43;
    public static final int EQUAL=44;
    public static final int NOT_EQUAL=45;
    public static final int GE=46;
    public static final int GT=47;
    public static final int LE=48;
    public static final int LT=49;
    public static final int NOT=50;
    public static final int TAB=51;
    public static final int KEY_PRINT=52;
    public static final int KEY_POW=53;
    public static final int KEY_SQRT=54;
    public static final int KEY_CONST=55;
    public static final int DIGIT=56;
    public static final int LETTER=57;
    public static final int COMMENT=58;
    public static final int WS=59;

    // delegates
    // delegators


        public mgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public mgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("mgParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return mgParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\WORK\\mg\\src\\mg.g"; }


    	private boolean isOk = true;
    	public void err(){ isOk = false;}
    	public boolean isOk(){return isOk;} 


    protected static class program_scope {
        List functions;
        List globals;
        Block globalVars;
        Block funIds;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // D:\\WORK\\mg\\src\\mg.g:53:1: program : ( global NEWLINE )* ( fun_declaration )+ -> program(functions=$program::functionsglobals=$program::globals);
    public final mgParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        mgParser.program_return retval = new mgParser.program_return();
        retval.start = input.LT(1);

        mgParser.global_return global1 = null;

        mgParser.fun_declaration_return fun_declaration2 = null;


         
            ((program_scope)program_stack.peek()).functions = new ArrayList();
            ((program_scope)program_stack.peek()).globals = new ArrayList();
            ((program_scope)program_stack.peek()).globalVars = new Block();
            ((program_scope)program_stack.peek()).funIds = new Block();
          
        try {
            // D:\\WORK\\mg\\src\\mg.g:68:7: ( ( global NEWLINE )* ( fun_declaration )+ -> program(functions=$program::functionsglobals=$program::globals))
            // D:\\WORK\\mg\\src\\mg.g:68:11: ( global NEWLINE )* ( fun_declaration )+
            {
            // D:\\WORK\\mg\\src\\mg.g:68:11: ( global NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==60) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:68:12: global NEWLINE
            	    {
            	    pushFollow(FOLLOW_global_in_program106);
            	    global1=global();

            	    state._fsp--;

            	    ((program_scope)program_stack.peek()).globals.add((global1!=null?global1.st:null)); 
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program110); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\WORK\\mg\\src\\mg.g:69:8: ( fun_declaration )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEY_MAIN||(LA2_0>=KEY_INT && LA2_0<=KEY_BOOL)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:69:10: fun_declaration
            	    {
            	    pushFollow(FOLLOW_fun_declaration_in_program126);
            	    fun_declaration2=fun_declaration();

            	    state._fsp--;

            	     
            	           ((program_scope)program_stack.peek()).functions.add((fun_declaration2!=null?fun_declaration2.st:null));
            	           
            	           

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);



            // TEMPLATE REWRITE
            // 73:13: -> program(functions=$program::functionsglobals=$program::globals)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("functions", ((program_scope)program_stack.peek()).functions).put("globals", ((program_scope)program_stack.peek()).globals));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class global_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "global"
    // D:\\WORK\\mg\\src\\mg.g:76:1: global : 'global' var_declaration -> global(init=$var_declaration.st);
    public final mgParser.global_return global() throws RecognitionException {
        mgParser.global_return retval = new mgParser.global_return();
        retval.start = input.LT(1);

        mgParser.var_declaration_return var_declaration3 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:77:3: ( 'global' var_declaration -> global(init=$var_declaration.st))
            // D:\\WORK\\mg\\src\\mg.g:77:5: 'global' var_declaration
            {
            match(input,60,FOLLOW_60_in_global179); 
            pushFollow(FOLLOW_var_declaration_in_global181);
            var_declaration3=var_declaration();

            state._fsp--;


                if(!((program_scope)program_stack.peek()).globalVars.addVar((var_declaration3!=null?var_declaration3.Id:null), (var_declaration3!=null?var_declaration3.Type:null), (var_declaration3!=null?var_declaration3.Line:0)))
                {
                  System.out.println("line "+(var_declaration3!=null?var_declaration3.Line:0)+" multiple declaration of "+(var_declaration3!=null?var_declaration3.Id:null));
                  err();
                 }  
              


            // TEMPLATE REWRITE
            // 85:4: -> global(init=$var_declaration.st)
            {
                retval.st = templateLib.getInstanceOf("global",
              new STAttrMap().put("init", (var_declaration3!=null?var_declaration3.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "global"

    public static class var_dec_in_block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_dec_in_block"
    // D:\\WORK\\mg\\src\\mg.g:88:1: var_dec_in_block : var_declaration -> str(value=$var_declaration.st);
    public final mgParser.var_dec_in_block_return var_dec_in_block() throws RecognitionException {
        mgParser.var_dec_in_block_return retval = new mgParser.var_dec_in_block_return();
        retval.start = input.LT(1);

        mgParser.var_declaration_return var_declaration4 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:89:4: ( var_declaration -> str(value=$var_declaration.st))
            // D:\\WORK\\mg\\src\\mg.g:89:6: var_declaration
            {
            pushFollow(FOLLOW_var_declaration_in_var_dec_in_block215);
            var_declaration4=var_declaration();

            state._fsp--;


                  if(!((program_scope)program_stack.peek()).globalVars.contains((var_declaration4!=null?var_declaration4.Id:null)) && !((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((var_declaration4!=null?var_declaration4.Id:null)))
                    {
             
                     ((fun_declaration_scope)fun_declaration_stack.peek()).vars.addVar((var_declaration4!=null?var_declaration4.Id:null), (var_declaration4!=null?var_declaration4.Type:null), (var_declaration4!=null?var_declaration4.Line:0));
                    }
                     else {System.out.println("line "+(var_declaration4!=null?var_declaration4.Line:0)+" multiple declaration of  "+(var_declaration4!=null?var_declaration4.Id:null)); err();}
               


            // TEMPLATE REWRITE
            // 99:4: -> str(value=$var_declaration.st)
            {
                retval.st = templateLib.getInstanceOf("str",
              new STAttrMap().put("value", (var_declaration4!=null?var_declaration4.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_dec_in_block"

    public static class var_declaration_return extends ParserRuleReturnScope {
        public String Id;
        public String Type;
        public int Line;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_declaration"
    // D:\\WORK\\mg\\src\\mg.g:102:1: var_declaration returns [String Id , String Type, int Line] : var_type ID ( var_init )? -> var_dec(type=$var_type.v_typeid=$ID.textinit=$var_init.st);
    public final mgParser.var_declaration_return var_declaration() throws RecognitionException {
        mgParser.var_declaration_return retval = new mgParser.var_declaration_return();
        retval.start = input.LT(1);

        Token ID5=null;
        mgParser.var_type_return var_type6 = null;

        mgParser.var_init_return var_init7 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:103:5: ( var_type ID ( var_init )? -> var_dec(type=$var_type.v_typeid=$ID.textinit=$var_init.st))
            // D:\\WORK\\mg\\src\\mg.g:103:8: var_type ID ( var_init )?
            {
            pushFollow(FOLLOW_var_type_in_var_declaration259);
            var_type6=var_type();

            state._fsp--;

            ID5=(Token)match(input,ID,FOLLOW_ID_in_var_declaration261); 

                retval.Id = (ID5!=null?ID5.getText():null);
                retval.Type = (var_type6!=null?var_type6.v_type:null);
                retval.Line = (ID5!=null?ID5.getLine():0);   
               
            // D:\\WORK\\mg\\src\\mg.g:110:5: ( var_init )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ASSIGN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:110:7: var_init
                    {
                    pushFollow(FOLLOW_var_init_in_var_declaration281);
                    var_init7=var_init();

                    state._fsp--;

                     
                         if(!retval.Type.equals((var_init7!=null?var_init7.Type:null)))
                          {
                            System.out.println("line "+ (ID5!=null?ID5.getLine():0) +" incorrect initialisation"); 
                            err();
                          }
                         

                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 120:7: -> var_dec(type=$var_type.v_typeid=$ID.textinit=$var_init.st)
            {
                retval.st = templateLib.getInstanceOf("var_dec",
              new STAttrMap().put("type", (var_type6!=null?var_type6.v_type:null)).put("id", (ID5!=null?ID5.getText():null)).put("init", (var_init7!=null?var_init7.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_declaration"

    public static class var_init_return extends ParserRuleReturnScope {
        public String Type;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_init"
    // D:\\WORK\\mg\\src\\mg.g:123:1: fragment var_init returns [String Type] : '=' atom -> var_init(atom=$atom.st);
    public final mgParser.var_init_return var_init() throws RecognitionException {
        mgParser.var_init_return retval = new mgParser.var_init_return();
        retval.start = input.LT(1);

        mgParser.atom_return atom8 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:125:3: ( '=' atom -> var_init(atom=$atom.st))
            // D:\\WORK\\mg\\src\\mg.g:125:5: '=' atom
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_var_init362); 
            pushFollow(FOLLOW_atom_in_var_init364);
            atom8=atom();

            state._fsp--;

            retval.Type = (atom8!=null?atom8.Type:null); 


            // TEMPLATE REWRITE
            // 127:4: -> var_init(atom=$atom.st)
            {
                retval.st = templateLib.getInstanceOf("var_init",
              new STAttrMap().put("atom", (atom8!=null?atom8.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_init"

    protected static class fun_declaration_scope {
        List args;
        Block vars;
        boolean needReturn;
        boolean hasReturn;
    }
    protected Stack fun_declaration_stack = new Stack();

    public static class fun_declaration_return extends ParserRuleReturnScope {
        public String Id;
        public String Type;
        public int Line;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_declaration"
    // D:\\WORK\\mg\\src\\mg.g:130:1: fun_declaration returns [String Id, String Type, int Line] : ( ( KEY_MAIN '(' ')' block CLEAR_LINE -> main(block=$block.blocks)) | ( fun_type ID '(' arg_list_declaration ')' block CLEAR_LINE -> functions(type=$fun_type.funTypeid=$ID.textarglist=$fun_declaration::argsblock=$block.blocks)) );
    public final mgParser.fun_declaration_return fun_declaration() throws RecognitionException {
        fun_declaration_stack.push(new fun_declaration_scope());
        mgParser.fun_declaration_return retval = new mgParser.fun_declaration_return();
        retval.start = input.LT(1);

        Token KEY_MAIN9=null;
        Token ID11=null;
        mgParser.block_return block10 = null;

        mgParser.fun_type_return fun_type12 = null;

        mgParser.block_return block13 = null;



        ((fun_declaration_scope)fun_declaration_stack.peek()).vars = new Block();
        ((fun_declaration_scope)fun_declaration_stack.peek()).args = new ArrayList();
        ((fun_declaration_scope)fun_declaration_stack.peek()).needReturn = false;
        ((fun_declaration_scope)fun_declaration_stack.peek()).hasReturn = false;

        try {
            // D:\\WORK\\mg\\src\\mg.g:146:3: ( ( KEY_MAIN '(' ')' block CLEAR_LINE -> main(block=$block.blocks)) | ( fun_type ID '(' arg_list_declaration ')' block CLEAR_LINE -> functions(type=$fun_type.funTypeid=$ID.textarglist=$fun_declaration::argsblock=$block.blocks)) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEY_MAIN) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=KEY_INT && LA4_0<=KEY_BOOL)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:147:4: ( KEY_MAIN '(' ')' block CLEAR_LINE -> main(block=$block.blocks))
                    {
                    // D:\\WORK\\mg\\src\\mg.g:147:4: ( KEY_MAIN '(' ')' block CLEAR_LINE -> main(block=$block.blocks))
                    // D:\\WORK\\mg\\src\\mg.g:147:6: KEY_MAIN '(' ')' block CLEAR_LINE
                    {
                    KEY_MAIN9=(Token)match(input,KEY_MAIN,FOLLOW_KEY_MAIN_in_fun_declaration416); 
                    match(input,61,FOLLOW_61_in_fun_declaration418); 
                    match(input,62,FOLLOW_62_in_fun_declaration420); 

                       retval.Id = (KEY_MAIN9!=null?KEY_MAIN9.getText():null);
                       retval.Type = "void";
                       retval.Line = (KEY_MAIN9!=null?KEY_MAIN9.getLine():0);
                        if(!((program_scope)program_stack.peek()).funIds.contains(retval.Id))
                           {
                               ((program_scope)program_stack.peek()).funIds.addVar(retval.Id, retval.Type, retval.Line); 
                          }
                          
                           else { System.out.println("line "+retval.Line+" function "+ retval.Id + " already exist"); err(); }
                          
                       
                       
                    pushFollow(FOLLOW_block_in_fun_declaration429);
                    block10=block();

                    state._fsp--;

                    match(input,CLEAR_LINE,FOLLOW_CLEAR_LINE_in_fun_declaration431); 


                    // TEMPLATE REWRITE
                    // 162:5: -> main(block=$block.blocks)
                    {
                        retval.st = templateLib.getInstanceOf("main",
                      new STAttrMap().put("block", (block10!=null?block10.blocks:null)));
                    }


                    }


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:164:3: ( fun_type ID '(' arg_list_declaration ')' block CLEAR_LINE -> functions(type=$fun_type.funTypeid=$ID.textarglist=$fun_declaration::argsblock=$block.blocks))
                    {
                    // D:\\WORK\\mg\\src\\mg.g:164:3: ( fun_type ID '(' arg_list_declaration ')' block CLEAR_LINE -> functions(type=$fun_type.funTypeid=$ID.textarglist=$fun_declaration::argsblock=$block.blocks))
                    // D:\\WORK\\mg\\src\\mg.g:164:5: fun_type ID '(' arg_list_declaration ')' block CLEAR_LINE
                    {
                    pushFollow(FOLLOW_fun_type_in_fun_declaration461);
                    fun_type12=fun_type();

                    state._fsp--;

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_fun_declaration463); 
                    match(input,61,FOLLOW_61_in_fun_declaration465); 
                    pushFollow(FOLLOW_arg_list_declaration_in_fun_declaration467);
                    arg_list_declaration();

                    state._fsp--;

                    match(input,62,FOLLOW_62_in_fun_declaration469); 

                      retval.Id = (ID11!=null?ID11.getText():null);
                      retval.Type = (fun_type12!=null?fun_type12.funType:null);
                       retval.Line = (ID11!=null?ID11.getLine():0);
                       if(!((program_scope)program_stack.peek()).funIds.contains(retval.Id))
                           {
                               ((program_scope)program_stack.peek()).funIds.addVar(retval.Id, retval.Type, retval.Line); 
                          }
                          
                           else { System.out.println("line "+retval.Line+" function "+ retval.Id + " already exist"); err(); }
                    	   if(!retval.Type.equals("void")){((fun_declaration_scope)fun_declaration_stack.peek()).needReturn = true;}    
                       
                          
                      
                    pushFollow(FOLLOW_block_in_fun_declaration477);
                    block13=block();

                    state._fsp--;

                    match(input,CLEAR_LINE,FOLLOW_CLEAR_LINE_in_fun_declaration479); 

                      	if(((fun_declaration_scope)fun_declaration_stack.peek()).needReturn && !((fun_declaration_scope)fun_declaration_stack.peek()).hasReturn)
                      {System.out.println("line "+ (ID11!=null?ID11.getLine():0)+" return statement missing"); err();
                      	if(!((fun_declaration_scope)fun_declaration_stack.peek()).needReturn && ((fun_declaration_scope)fun_declaration_stack.peek()).hasReturn)
                      {System.out.println("line "+ (ID11!=null?ID11.getLine():0)+" return statement in void function "); 
                      err();
                      }
                       }
                       


                    // TEMPLATE REWRITE
                    // 189:4: -> functions(type=$fun_type.funTypeid=$ID.textarglist=$fun_declaration::argsblock=$block.blocks)
                    {
                        retval.st = templateLib.getInstanceOf("functions",
                      new STAttrMap().put("type", (fun_type12!=null?fun_type12.funType:null)).put("id", (ID11!=null?ID11.getText():null)).put("arglist", ((fun_declaration_scope)fun_declaration_stack.peek()).args).put("block", (block13!=null?block13.blocks:null)));
                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            fun_declaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "fun_declaration"

    public static class arg_list_declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arg_list_declaration"
    // D:\\WORK\\mg\\src\\mg.g:192:1: arg_list_declaration : (a1= arg ( ',' a2= arg )* )? ;
    public final mgParser.arg_list_declaration_return arg_list_declaration() throws RecognitionException {
        mgParser.arg_list_declaration_return retval = new mgParser.arg_list_declaration_return();
        retval.start = input.LT(1);

        mgParser.arg_return a1 = null;

        mgParser.arg_return a2 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:193:3: ( (a1= arg ( ',' a2= arg )* )? )
            // D:\\WORK\\mg\\src\\mg.g:193:5: (a1= arg ( ',' a2= arg )* )?
            {
            // D:\\WORK\\mg\\src\\mg.g:193:5: (a1= arg ( ',' a2= arg )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=KEY_INT && LA6_0<=KEY_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:193:7: a1= arg ( ',' a2= arg )*
                    {
                    pushFollow(FOLLOW_arg_in_arg_list_declaration543);
                    a1=arg();

                    state._fsp--;

                    ((fun_declaration_scope)fun_declaration_stack.peek()).args.add(a1.st); 
                    // D:\\WORK\\mg\\src\\mg.g:193:54: ( ',' a2= arg )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==63) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\WORK\\mg\\src\\mg.g:193:55: ',' a2= arg
                    	    {
                    	    match(input,63,FOLLOW_63_in_arg_list_declaration548); 
                    	    pushFollow(FOLLOW_arg_in_arg_list_declaration554);
                    	    a2=arg();

                    	    state._fsp--;

                    	    ((fun_declaration_scope)fun_declaration_stack.peek()).args.add(a2.st);

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg_list_declaration"

    public static class arg_return extends ParserRuleReturnScope {
        public String atype;
        public String aid;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arg"
    // D:\\WORK\\mg\\src\\mg.g:196:1: fragment arg returns [String atype, String aid] : var_type ID -> parametr(type=$atypeid=$aid);
    public final mgParser.arg_return arg() throws RecognitionException {
        mgParser.arg_return retval = new mgParser.arg_return();
        retval.start = input.LT(1);

        Token ID15=null;
        mgParser.var_type_return var_type14 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:198:3: ( var_type ID -> parametr(type=$atypeid=$aid))
            // D:\\WORK\\mg\\src\\mg.g:198:5: var_type ID
            {
            pushFollow(FOLLOW_var_type_in_arg584);
            var_type14=var_type();

            state._fsp--;

            ID15=(Token)match(input,ID,FOLLOW_ID_in_arg586); 
             
                retval.atype =  (var_type14!=null?var_type14.v_type:null);
                retval.aid = (ID15!=null?ID15.getText():null);
                
                   if(!((program_scope)program_stack.peek()).globalVars.contains(retval.aid) && !((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains(retval.aid))
                    {
             
                     ((fun_declaration_scope)fun_declaration_stack.peek()).vars.addVar(retval.aid, retval.atype, (ID15!=null?ID15.getLine():0));
                     }
                     else { System.out.println(" line "+(ID15!=null?ID15.getLine():0) +" multiple decloration of  "+retval.aid); err();}
              


            // TEMPLATE REWRITE
            // 210:3: -> parametr(type=$atypeid=$aid)
            {
                retval.st = templateLib.getInstanceOf("parametr",
              new STAttrMap().put("type", retval.atype).put("id", retval.aid));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg"

    protected static class fun_call_scope {
        List args;
    }
    protected Stack fun_call_stack = new Stack();

    public static class fun_call_return extends ParserRuleReturnScope {
        public String Id;
        public int Line;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_call"
    // D:\\WORK\\mg\\src\\mg.g:213:1: fun_call returns [String Id, int Line] : ID '(' arg_list_call ')' -> fun_call(id=$ID.textargs=$fun_call::args);
    public final mgParser.fun_call_return fun_call() throws RecognitionException {
        fun_call_stack.push(new fun_call_scope());
        mgParser.fun_call_return retval = new mgParser.fun_call_return();
        retval.start = input.LT(1);

        Token ID16=null;

        ((fun_call_scope)fun_call_stack.peek()).args = new ArrayList();
        try {
            // D:\\WORK\\mg\\src\\mg.g:216:3: ( ID '(' arg_list_call ')' -> fun_call(id=$ID.textargs=$fun_call::args))
            // D:\\WORK\\mg\\src\\mg.g:216:5: ID '(' arg_list_call ')'
            {
            ID16=(Token)match(input,ID,FOLLOW_ID_in_fun_call633); 
            match(input,61,FOLLOW_61_in_fun_call635); 
            pushFollow(FOLLOW_arg_list_call_in_fun_call637);
            arg_list_call();

            state._fsp--;

            match(input,62,FOLLOW_62_in_fun_call639); 
            retval.Id = (ID16!=null?ID16.getText():null); retval.Line = (ID16!=null?ID16.getLine():0);


            // TEMPLATE REWRITE
            // 217:5: -> fun_call(id=$ID.textargs=$fun_call::args)
            {
                retval.st = templateLib.getInstanceOf("fun_call",
              new STAttrMap().put("id", (ID16!=null?ID16.getText():null)).put("args", ((fun_call_scope)fun_call_stack.peek()).args));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            fun_call_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "fun_call"

    public static class arg_list_call_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arg_list_call"
    // D:\\WORK\\mg\\src\\mg.g:220:1: arg_list_call : a= atom ( ',' b= atom )* ;
    public final mgParser.arg_list_call_return arg_list_call() throws RecognitionException {
        mgParser.arg_list_call_return retval = new mgParser.arg_list_call_return();
        retval.start = input.LT(1);

        mgParser.atom_return a = null;

        mgParser.atom_return b = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:221:3: (a= atom ( ',' b= atom )* )
            // D:\\WORK\\mg\\src\\mg.g:222:6: a= atom ( ',' b= atom )*
            {
            pushFollow(FOLLOW_atom_in_arg_list_call687);
            a=atom();

            state._fsp--;

            ((fun_call_scope)fun_call_stack.peek()).args.add(a.st); 
            // D:\\WORK\\mg\\src\\mg.g:222:44: ( ',' b= atom )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==63) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:222:45: ',' b= atom
            	    {
            	    match(input,63,FOLLOW_63_in_arg_list_call691); 
            	    pushFollow(FOLLOW_atom_in_arg_list_call697);
            	    b=atom();

            	    state._fsp--;

            	    ((fun_call_scope)fun_call_stack.peek()).args.add(b.st); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg_list_call"

    public static class atom_return extends ParserRuleReturnScope {
        public String Type;
        public int Line;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // D:\\WORK\\mg\\src\\mg.g:225:1: atom returns [String Type, int Line] : ( ( ID -> str(value=$ID.text)) | INT -> str(value=$INT.text) | DOUBLE -> str(value=$DOUBLE.text) | '[' expression ']' -> parren_exp(exp=$expression.st) | fun_call -> {$fun_call.st} | pow -> {$pow.st} | sqrt -> {$sqrt.st});
    public final mgParser.atom_return atom() throws RecognitionException {
        mgParser.atom_return retval = new mgParser.atom_return();
        retval.start = input.LT(1);

        Token ID17=null;
        Token INT18=null;
        Token DOUBLE19=null;
        mgParser.expression_return expression20 = null;

        mgParser.fun_call_return fun_call21 = null;

        mgParser.pow_return pow22 = null;

        mgParser.sqrt_return sqrt23 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:226:5: ( ( ID -> str(value=$ID.text)) | INT -> str(value=$INT.text) | DOUBLE -> str(value=$DOUBLE.text) | '[' expression ']' -> parren_exp(exp=$expression.st) | fun_call -> {$fun_call.st} | pow -> {$pow.st} | sqrt -> {$sqrt.st})
            int alt8=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==61) ) {
                    alt8=5;
                }
                else if ( ((LA8_1>=DEDENT && LA8_1<=ID)||(LA8_1>=INT && LA8_1<=KEY_DOUBLE)||(LA8_1>=KEY_RETURN && LA8_1<=KEY_BREAK)||LA8_1==KEY_IF||(LA8_1>=KEY_WHILE && LA8_1<=KEY_REPEAT)||(LA8_1>=KEY_FOR && LA8_1<=LT)||LA8_1==KEY_SQRT||(LA8_1>=62 && LA8_1<=66)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                alt8=2;
                }
                break;
            case DOUBLE:
                {
                alt8=3;
                }
                break;
            case 64:
                {
                alt8=4;
                }
                break;
            case 66:
                {
                alt8=6;
                }
                break;
            case KEY_SQRT:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:227:7: ( ID -> str(value=$ID.text))
                    {
                    // D:\\WORK\\mg\\src\\mg.g:227:7: ( ID -> str(value=$ID.text))
                    // D:\\WORK\\mg\\src\\mg.g:227:8: ID
                    {
                    ID17=(Token)match(input,ID,FOLLOW_ID_in_atom734); 
                      
                                if(((program_scope)program_stack.peek()).globalVars.contains((ID17!=null?ID17.getText():null)) || ((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((ID17!=null?ID17.getText():null))  )
                                  { 
                                    if(((program_scope)program_stack.peek()).globalVars.contains((ID17!=null?ID17.getText():null))){
                                    	retval.Type = ((program_scope)program_stack.peek()).globalVars.getTypeOfVar((ID17!=null?ID17.getText():null));
                                    }
                                    if(((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((ID17!=null?ID17.getText():null))) {
                                    	retval.Type =  ((fun_declaration_scope)fun_declaration_stack.peek()).vars.getTypeOfVar((ID17!=null?ID17.getText():null)); 
                                    }
                                    retval.Line = (ID17!=null?ID17.getLine():0);
                                  } 
                                else {System.out.println("line "+(ID17!=null?ID17.getLine():0)+" undefined variable "+(ID17!=null?ID17.getText():null)); err(); }
                              


                    // TEMPLATE REWRITE
                    // 241:7: -> str(value=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("str",
                      new STAttrMap().put("value", (ID17!=null?ID17.getText():null)));
                    }


                    }


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:242:7: INT
                    {
                    INT18=(Token)match(input,INT,FOLLOW_INT_in_atom776); 
                    retval.Type = "int"; retval.Line = (INT18!=null?INT18.getLine():0); 


                    // TEMPLATE REWRITE
                    // 242:49: -> str(value=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("str",
                      new STAttrMap().put("value", (INT18!=null?INT18.getText():null)));
                    }


                    }
                    break;
                case 3 :
                    // D:\\WORK\\mg\\src\\mg.g:243:7: DOUBLE
                    {
                    DOUBLE19=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom798); 
                    retval.Type = "double"; retval.Line = (DOUBLE19!=null?DOUBLE19.getLine():0);


                    // TEMPLATE REWRITE
                    // 243:57: -> str(value=$DOUBLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("str",
                      new STAttrMap().put("value", (DOUBLE19!=null?DOUBLE19.getText():null)));
                    }


                    }
                    break;
                case 4 :
                    // D:\\WORK\\mg\\src\\mg.g:244:7: '[' expression ']'
                    {
                    match(input,64,FOLLOW_64_in_atom822); 
                    pushFollow(FOLLOW_expression_in_atom824);
                    expression20=expression();

                    state._fsp--;

                    match(input,65,FOLLOW_65_in_atom826); 
                    retval.Type = (expression20!=null?expression20.Type:null); retval.Line = (expression20!=null?expression20.Line:0);


                    // TEMPLATE REWRITE
                    // 245:6: -> parren_exp(exp=$expression.st)
                    {
                        retval.st = templateLib.getInstanceOf("parren_exp",
                      new STAttrMap().put("exp", (expression20!=null?expression20.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // D:\\WORK\\mg\\src\\mg.g:246:7: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_atom853);
                    fun_call21=fun_call();

                    state._fsp--;


                        if(((program_scope)program_stack.peek()).funIds.contains((fun_call21!=null?fun_call21.Id:null)))
                        {
                          retval.Type = ((program_scope)program_stack.peek()).funIds.getTypeOfVar((fun_call21!=null?fun_call21.Id:null));
                        }
                        else { System.out.println(" line "+(fun_call21!=null?fun_call21.Line:0)+" udefined function "+ (fun_call21!=null?fun_call21.Id:null)); err();}
                        


                    // TEMPLATE REWRITE
                    // 254:5: -> {$fun_call.st}
                    {
                        retval.st = (fun_call21!=null?fun_call21.st:null);
                    }


                    }
                    break;
                case 6 :
                    // D:\\WORK\\mg\\src\\mg.g:255:7: pow
                    {
                    pushFollow(FOLLOW_pow_in_atom876);
                    pow22=pow();

                    state._fsp--;

                    retval.Type = "double"; retval.Line = (pow22!=null?pow22.Line:0);


                    // TEMPLATE REWRITE
                    // 255:50: -> {$pow.st}
                    {
                        retval.st = (pow22!=null?pow22.st:null);
                    }


                    }
                    break;
                case 7 :
                    // D:\\WORK\\mg\\src\\mg.g:256:7: sqrt
                    {
                    pushFollow(FOLLOW_sqrt_in_atom889);
                    sqrt23=sqrt();

                    state._fsp--;

                    retval.Type = "double"; retval.Line = (sqrt23!=null?sqrt23.Line:0); 


                    // TEMPLATE REWRITE
                    // 256:53: -> {$sqrt.st}
                    {
                        retval.st = (sqrt23!=null?sqrt23.st:null);
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class expression_return extends ParserRuleReturnScope {
        public String Type;
        public int Line;
        public String Type2;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // D:\\WORK\\mg\\src\\mg.g:260:1: expression returns [String Type, int Line, String Type2] : a= atom (op= operator b= atom )* -> operation(left=$a.stright=atoms);
    public final mgParser.expression_return expression() throws RecognitionException {
        mgParser.expression_return retval = new mgParser.expression_return();
        retval.start = input.LT(1);

        mgParser.atom_return a = null;

        mgParser.operator_return op = null;

        mgParser.atom_return b = null;



                 List atoms = new ArrayList();
             
        try {
            // D:\\WORK\\mg\\src\\mg.g:264:4: (a= atom (op= operator b= atom )* -> operation(left=$a.stright=atoms))
            // D:\\WORK\\mg\\src\\mg.g:264:7: a= atom (op= operator b= atom )*
            {
            pushFollow(FOLLOW_atom_in_expression924);
            a=atom();

            state._fsp--;

            retval.Type = (a!=null?a.Type:null);  retval.Line = (a!=null?a.Line:0);
            // D:\\WORK\\mg\\src\\mg.g:265:4: (op= operator b= atom )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=DIV && LA9_0<=ASSIGN)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:266:5: op= operator b= atom
            	    {
            	    pushFollow(FOLLOW_operator_in_expression942);
            	    op=operator();

            	    state._fsp--;

            	    atoms.add((op!=null?op.st:null));  
            	    pushFollow(FOLLOW_atom_in_expression954);
            	    b=atom();

            	    state._fsp--;

            	    atoms.add((b!=null?b.st:null)); retval.Type2 = (b!=null?b.Type:null);   
            	    	   if(op.Id.equals("="))
            	    	   {
            	    	   if(retval.Type.equals("double") && retval.Type2.equals("int")){System.out.println("line"+(a!=null?a.Line:0) +" can`t assign int to double "); err();}
            	    	   if(retval.Type.equals("int") && retval.Type2.equals("double")){System.out.println("line"+(a!=null?a.Line:0)+"can`t assign double to int" ); err();}
            	    	   }
            	    	    retval.Line = (b!=null?b.Line:0);

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 275:4: -> operation(left=$a.stright=atoms)
            {
                retval.st = templateLib.getInstanceOf("operation",
              new STAttrMap().put("left", (a!=null?a.st:null)).put("right", atoms));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class logic_expression_return extends ParserRuleReturnScope {
        public String Type;
        public int Line;
        public String Type2;
        public String Operator;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logic_expression"
    // D:\\WORK\\mg\\src\\mg.g:278:1: logic_expression returns [String Type, int Line , String Type2, String Operator] : neg= negation a= atom (op= logic_operator ntwo= negation b= atom )* -> logic_operation(neg=$neg.stleft=$a.stright=atoms);
    public final mgParser.logic_expression_return logic_expression() throws RecognitionException {
        mgParser.logic_expression_return retval = new mgParser.logic_expression_return();
        retval.start = input.LT(1);

        mgParser.negation_return neg = null;

        mgParser.atom_return a = null;

        mgParser.logic_operator_return op = null;

        mgParser.negation_return ntwo = null;

        mgParser.atom_return b = null;



                List atoms = new ArrayList();
             
        try {
            // D:\\WORK\\mg\\src\\mg.g:282:3: (neg= negation a= atom (op= logic_operator ntwo= negation b= atom )* -> logic_operation(neg=$neg.stleft=$a.stright=atoms))
            // D:\\WORK\\mg\\src\\mg.g:282:6: neg= negation a= atom (op= logic_operator ntwo= negation b= atom )*
            {
            pushFollow(FOLLOW_negation_in_logic_expression1008);
            neg=negation();

            state._fsp--;

            pushFollow(FOLLOW_atom_in_logic_expression1015);
            a=atom();

            state._fsp--;

            retval.Type = (a!=null?a.Type:null); retval.Line = (a!=null?a.Line:0);
            // D:\\WORK\\mg\\src\\mg.g:283:3: (op= logic_operator ntwo= negation b= atom )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=KEY_AND && LA10_0<=LT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:284:4: op= logic_operator ntwo= negation b= atom
            	    {
            	    pushFollow(FOLLOW_logic_operator_in_logic_expression1031);
            	    op=logic_operator();

            	    state._fsp--;

            	    atoms.add((op!=null?op.st:null)); retval.Operator = (op!=null?op.Id:null) ; 
            	    pushFollow(FOLLOW_negation_in_logic_expression1043);
            	    ntwo=negation();

            	    state._fsp--;

            	    pushFollow(FOLLOW_atom_in_logic_expression1054);
            	    b=atom();

            	    state._fsp--;

            	    atoms.add((b!=null?b.st:null)); atoms.add((ntwo!=null?ntwo.st:null)); retval.Type2 = (b!=null?b.Type:null); retval.Line = (b!=null?b.Line:0);

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 288:4: -> logic_operation(neg=$neg.stleft=$a.stright=atoms)
            {
                retval.st = templateLib.getInstanceOf("logic_operation",
              new STAttrMap().put("neg", (neg!=null?neg.st:null)).put("left", (a!=null?a.st:null)).put("right", atoms));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logic_expression"

    public static class fun_type_return extends ParserRuleReturnScope {
        public String funType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_type"
    // D:\\WORK\\mg\\src\\mg.g:291:1: fun_type returns [String funType] : ( KEY_INT | KEY_DOUBLE | KEY_VOID | KEY_BOOL );
    public final mgParser.fun_type_return fun_type() throws RecognitionException {
        mgParser.fun_type_return retval = new mgParser.fun_type_return();
        retval.start = input.LT(1);

        try {
            // D:\\WORK\\mg\\src\\mg.g:292:3: ( KEY_INT | KEY_DOUBLE | KEY_VOID | KEY_BOOL )
            int alt11=4;
            switch ( input.LA(1) ) {
            case KEY_INT:
                {
                alt11=1;
                }
                break;
            case KEY_DOUBLE:
                {
                alt11=2;
                }
                break;
            case KEY_VOID:
                {
                alt11=3;
                }
                break;
            case KEY_BOOL:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:292:5: KEY_INT
                    {
                    match(input,KEY_INT,FOLLOW_KEY_INT_in_fun_type1111); 
                     retval.funType = "int";   

                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:293:5: KEY_DOUBLE
                    {
                    match(input,KEY_DOUBLE,FOLLOW_KEY_DOUBLE_in_fun_type1122); 
                     retval.funType = "double"; 

                    }
                    break;
                case 3 :
                    // D:\\WORK\\mg\\src\\mg.g:294:5: KEY_VOID
                    {
                    match(input,KEY_VOID,FOLLOW_KEY_VOID_in_fun_type1130); 
                     retval.funType = "void";  

                    }
                    break;
                case 4 :
                    // D:\\WORK\\mg\\src\\mg.g:295:5: KEY_BOOL
                    {
                    match(input,KEY_BOOL,FOLLOW_KEY_BOOL_in_fun_type1139); 
                     retval.funType = "boolean";  

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fun_type"

    protected static class block_scope {
        List stmts;
    }
    protected Stack block_stack = new Stack();

    public static class block_return extends ParserRuleReturnScope {
        public List blocks;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // D:\\WORK\\mg\\src\\mg.g:299:1: fragment block returns [List blocks] : NEWLINE INDENT ( statement )+ DEDENT ;
    public final mgParser.block_return block() throws RecognitionException {
        block_stack.push(new block_scope());
        mgParser.block_return retval = new mgParser.block_return();
        retval.start = input.LT(1);

        ((block_scope)block_stack.peek()).stmts = new ArrayList(); retval.blocks = new ArrayList(); 
        try {
            // D:\\WORK\\mg\\src\\mg.g:304:3: ( NEWLINE INDENT ( statement )+ DEDENT )
            // D:\\WORK\\mg\\src\\mg.g:305:4: NEWLINE INDENT ( statement )+ DEDENT
            {
            match(input,NEWLINE,FOLLOW_NEWLINE_in_block1180); 
            match(input,INDENT,FOLLOW_INDENT_in_block1182); 
            // D:\\WORK\\mg\\src\\mg.g:305:19: ( statement )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID||(LA12_0>=INT && LA12_0<=KEY_DOUBLE)||(LA12_0>=KEY_RETURN && LA12_0<=KEY_BREAK)||LA12_0==KEY_IF||(LA12_0>=KEY_WHILE && LA12_0<=KEY_REPEAT)||LA12_0==KEY_FOR||(LA12_0>=KEY_READ && LA12_0<=KEY_WRITE)||LA12_0==KEY_SQRT||LA12_0==64||LA12_0==66) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:305:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block1185);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match(input,DEDENT,FOLLOW_DEDENT_in_block1193); 
             retval.blocks.add(((block_scope)block_stack.peek()).stmts);

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            block_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // D:\\WORK\\mg\\src\\mg.g:308:1: statement : ( line_statement | compound_statement );
    public final mgParser.statement_return statement() throws RecognitionException {
        mgParser.statement_return retval = new mgParser.statement_return();
        retval.start = input.LT(1);

        try {
            // D:\\WORK\\mg\\src\\mg.g:309:3: ( line_statement | compound_statement )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID||(LA13_0>=INT && LA13_0<=KEY_DOUBLE)||(LA13_0>=KEY_RETURN && LA13_0<=KEY_BREAK)||(LA13_0>=KEY_READ && LA13_0<=KEY_WRITE)||LA13_0==KEY_SQRT||LA13_0==64||LA13_0==66) ) {
                alt13=1;
            }
            else if ( (LA13_0==KEY_IF||(LA13_0>=KEY_WHILE && LA13_0<=KEY_REPEAT)||LA13_0==KEY_FOR) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:309:5: line_statement
                    {
                    pushFollow(FOLLOW_line_statement_in_statement1210);
                    line_statement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:310:5: compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_statement1217);
                    compound_statement();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class line_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "line_statement"
    // D:\\WORK\\mg\\src\\mg.g:313:1: line_statement : ( return_statement | break_statement | expression | var_dec_in_block | read | write | change_type ) ( NEWLINE )? ;
    public final mgParser.line_statement_return line_statement() throws RecognitionException {
        mgParser.line_statement_return retval = new mgParser.line_statement_return();
        retval.start = input.LT(1);

        mgParser.return_statement_return return_statement24 = null;

        mgParser.break_statement_return break_statement25 = null;

        mgParser.expression_return expression26 = null;

        mgParser.var_dec_in_block_return var_dec_in_block27 = null;

        mgParser.read_return read28 = null;

        mgParser.write_return write29 = null;

        mgParser.change_type_return change_type30 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:314:3: ( ( return_statement | break_statement | expression | var_dec_in_block | read | write | change_type ) ( NEWLINE )? )
            // D:\\WORK\\mg\\src\\mg.g:315:3: ( return_statement | break_statement | expression | var_dec_in_block | read | write | change_type ) ( NEWLINE )?
            {
            // D:\\WORK\\mg\\src\\mg.g:315:3: ( return_statement | break_statement | expression | var_dec_in_block | read | write | change_type )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:315:5: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_line_statement1238);
                    return_statement24=return_statement();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((return_statement24!=null?return_statement24.st:null)+ ";");

                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:316:5: break_statement
                    {
                    pushFollow(FOLLOW_break_statement_in_line_statement1247);
                    break_statement25=break_statement();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((break_statement25!=null?break_statement25.st:null)+ ";");

                    }
                    break;
                case 3 :
                    // D:\\WORK\\mg\\src\\mg.g:317:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_line_statement1256);
                    expression26=expression();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((expression26!=null?expression26.st:null)+ ";");

                    }
                    break;
                case 4 :
                    // D:\\WORK\\mg\\src\\mg.g:318:5: var_dec_in_block
                    {
                    pushFollow(FOLLOW_var_dec_in_block_in_line_statement1271);
                    var_dec_in_block27=var_dec_in_block();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((var_dec_in_block27!=null?var_dec_in_block27.st:null)+ ";");

                    }
                    break;
                case 5 :
                    // D:\\WORK\\mg\\src\\mg.g:319:5: read
                    {
                    pushFollow(FOLLOW_read_in_line_statement1280);
                    read28=read();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((read28!=null?read28.st:null)+ ";");

                    }
                    break;
                case 6 :
                    // D:\\WORK\\mg\\src\\mg.g:320:5: write
                    {
                    pushFollow(FOLLOW_write_in_line_statement1300);
                    write29=write();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((write29!=null?write29.st:null)+ ";");

                    }
                    break;
                case 7 :
                    // D:\\WORK\\mg\\src\\mg.g:321:5: change_type
                    {
                    pushFollow(FOLLOW_change_type_in_line_statement1319);
                    change_type30=change_type();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((change_type30!=null?change_type30.st:null)+ ";");

                    }
                    break;

            }

            // D:\\WORK\\mg\\src\\mg.g:322:5: ( NEWLINE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NEWLINE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:322:5: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_line_statement1331); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "line_statement"

    public static class compound_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "compound_statement"
    // D:\\WORK\\mg\\src\\mg.g:326:1: compound_statement : ( if_statement | while_statement | repeatuntil_statement | for_statement );
    public final mgParser.compound_statement_return compound_statement() throws RecognitionException {
        mgParser.compound_statement_return retval = new mgParser.compound_statement_return();
        retval.start = input.LT(1);

        mgParser.if_statement_return if_statement31 = null;

        mgParser.while_statement_return while_statement32 = null;

        mgParser.repeatuntil_statement_return repeatuntil_statement33 = null;

        mgParser.for_statement_return for_statement34 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:327:3: ( if_statement | while_statement | repeatuntil_statement | for_statement )
            int alt16=4;
            switch ( input.LA(1) ) {
            case KEY_IF:
                {
                alt16=1;
                }
                break;
            case KEY_WHILE:
                {
                alt16=2;
                }
                break;
            case KEY_REPEAT:
                {
                alt16=3;
                }
                break;
            case KEY_FOR:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:328:3: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_compound_statement1349);
                    if_statement31=if_statement();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((if_statement31!=null?if_statement31.st:null));

                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:329:5: while_statement
                    {
                    pushFollow(FOLLOW_while_statement_in_compound_statement1368);
                    while_statement32=while_statement();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((while_statement32!=null?while_statement32.st:null));

                    }
                    break;
                case 3 :
                    // D:\\WORK\\mg\\src\\mg.g:330:5: repeatuntil_statement
                    {
                    pushFollow(FOLLOW_repeatuntil_statement_in_compound_statement1382);
                    repeatuntil_statement33=repeatuntil_statement();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((repeatuntil_statement33!=null?repeatuntil_statement33.st:null));

                    }
                    break;
                case 4 :
                    // D:\\WORK\\mg\\src\\mg.g:331:5: for_statement
                    {
                    pushFollow(FOLLOW_for_statement_in_compound_statement1390);
                    for_statement34=for_statement();

                    state._fsp--;

                    ((block_scope)block_stack.peek()).stmts.add((for_statement34!=null?for_statement34.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_statement"

    public static class pow_return extends ParserRuleReturnScope {
        public int Line;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pow"
    // D:\\WORK\\mg\\src\\mg.g:335:1: pow returns [int Line] : 'pow' '(' a= atom ',' b= atom ')' -> pow(a=$a.stb=$b.st);
    public final mgParser.pow_return pow() throws RecognitionException {
        mgParser.pow_return retval = new mgParser.pow_return();
        retval.start = input.LT(1);

        mgParser.atom_return a = null;

        mgParser.atom_return b = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:336:3: ( 'pow' '(' a= atom ',' b= atom ')' -> pow(a=$a.stb=$b.st))
            // D:\\WORK\\mg\\src\\mg.g:336:5: 'pow' '(' a= atom ',' b= atom ')'
            {
            match(input,66,FOLLOW_66_in_pow1418); 
            match(input,61,FOLLOW_61_in_pow1420); 
            pushFollow(FOLLOW_atom_in_pow1425);
            a=atom();

            state._fsp--;

            match(input,63,FOLLOW_63_in_pow1427); 
            pushFollow(FOLLOW_atom_in_pow1433);
            b=atom();

            state._fsp--;

            match(input,62,FOLLOW_62_in_pow1435); 
            retval.Line = (a!=null?a.Line:0);


            // TEMPLATE REWRITE
            // 337:3: -> pow(a=$a.stb=$b.st)
            {
                retval.st = templateLib.getInstanceOf("pow",
              new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pow"

    public static class sqrt_return extends ParserRuleReturnScope {
        public String Type;
        public int Line;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sqrt"
    // D:\\WORK\\mg\\src\\mg.g:340:1: sqrt returns [String Type, int Line] : 'sqrt' '(' atom ')' -> sqrt(x=$atom.st);
    public final mgParser.sqrt_return sqrt() throws RecognitionException {
        mgParser.sqrt_return retval = new mgParser.sqrt_return();
        retval.start = input.LT(1);

        mgParser.atom_return atom35 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:341:3: ( 'sqrt' '(' atom ')' -> sqrt(x=$atom.st))
            // D:\\WORK\\mg\\src\\mg.g:341:5: 'sqrt' '(' atom ')'
            {
            match(input,KEY_SQRT,FOLLOW_KEY_SQRT_in_sqrt1474); 
            match(input,61,FOLLOW_61_in_sqrt1476); 
            pushFollow(FOLLOW_atom_in_sqrt1478);
            atom35=atom();

            state._fsp--;

            match(input,62,FOLLOW_62_in_sqrt1480); 
            retval.Type = (atom35!=null?atom35.Type:null); retval.Line = (atom35!=null?atom35.Line:0);


            // TEMPLATE REWRITE
            // 342:3: -> sqrt(x=$atom.st)
            {
                retval.st = templateLib.getInstanceOf("sqrt",
              new STAttrMap().put("x", (atom35!=null?atom35.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqrt"

    public static class return_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "return_statement"
    // D:\\WORK\\mg\\src\\mg.g:345:10: fragment return_statement : KEY_RETURN atom -> return(exp=$atom.st);
    public final mgParser.return_statement_return return_statement() throws RecognitionException {
        mgParser.return_statement_return retval = new mgParser.return_statement_return();
        retval.start = input.LT(1);

        mgParser.atom_return atom36 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:346:3: ( KEY_RETURN atom -> return(exp=$atom.st))
            // D:\\WORK\\mg\\src\\mg.g:346:5: KEY_RETURN atom
            {
            match(input,KEY_RETURN,FOLLOW_KEY_RETURN_in_return_statement1509); 
            pushFollow(FOLLOW_atom_in_return_statement1511);
            atom36=atom();

            state._fsp--;


              
                if(!((program_scope)program_stack.peek()).funIds.getLastType().equals((atom36!=null?atom36.Type:null)))
                {
                  System.out.println(" line "+ (atom36!=null?atom36.Line:0)+" incorrect retrun type "+ (atom36!=null?atom36.Type:null) +  ((program_scope)program_stack.peek()).funIds.getLastType()); err();
                }
                
                ((fun_declaration_scope)fun_declaration_stack.peek()).hasReturn = true;
                
              


            // TEMPLATE REWRITE
            // 357:3: -> return(exp=$atom.st)
            {
                retval.st = templateLib.getInstanceOf("return",
              new STAttrMap().put("exp", (atom36!=null?atom36.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "return_statement"

    public static class break_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "break_statement"
    // D:\\WORK\\mg\\src\\mg.g:360:1: fragment break_statement : KEY_BREAK -> break();
    public final mgParser.break_statement_return break_statement() throws RecognitionException {
        mgParser.break_statement_return retval = new mgParser.break_statement_return();
        retval.start = input.LT(1);

        try {
            // D:\\WORK\\mg\\src\\mg.g:362:3: ( KEY_BREAK -> break())
            // D:\\WORK\\mg\\src\\mg.g:363:6: KEY_BREAK
            {
            match(input,KEY_BREAK,FOLLOW_KEY_BREAK_in_break_statement1553); 


            // TEMPLATE REWRITE
            // 364:6: -> break()
            {
                retval.st = templateLib.getInstanceOf("break");
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "break_statement"

    public static class bool_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bool"
    // D:\\WORK\\mg\\src\\mg.g:367:1: bool : ( KEY_FALSE -> {new StringTemplate($KEY_FALSE.text)} | KEY_TRUE -> {new StringTemplate($KEY_TRUE.text)});
    public final mgParser.bool_return bool() throws RecognitionException {
        mgParser.bool_return retval = new mgParser.bool_return();
        retval.start = input.LT(1);

        Token KEY_FALSE37=null;
        Token KEY_TRUE38=null;

        try {
            // D:\\WORK\\mg\\src\\mg.g:368:7: ( KEY_FALSE -> {new StringTemplate($KEY_FALSE.text)} | KEY_TRUE -> {new StringTemplate($KEY_TRUE.text)})
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEY_FALSE) ) {
                alt17=1;
            }
            else if ( (LA17_0==KEY_TRUE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:369:9: KEY_FALSE
                    {
                    KEY_FALSE37=(Token)match(input,KEY_FALSE,FOLLOW_KEY_FALSE_in_bool1590); 


                    // TEMPLATE REWRITE
                    // 369:19: -> {new StringTemplate($KEY_FALSE.text)}
                    {
                        retval.st = new StringTemplate((KEY_FALSE37!=null?KEY_FALSE37.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:370:9: KEY_TRUE
                    {
                    KEY_TRUE38=(Token)match(input,KEY_TRUE,FOLLOW_KEY_TRUE_in_bool1604); 


                    // TEMPLATE REWRITE
                    // 370:18: -> {new StringTemplate($KEY_TRUE.text)}
                    {
                        retval.st = new StringTemplate((KEY_TRUE38!=null?KEY_TRUE38.getText():null));
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool"

    public static class var_type_return extends ParserRuleReturnScope {
        public String v_type;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_type"
    // D:\\WORK\\mg\\src\\mg.g:373:1: var_type returns [String v_type] : ( KEY_INT | KEY_DOUBLE );
    public final mgParser.var_type_return var_type() throws RecognitionException {
        mgParser.var_type_return retval = new mgParser.var_type_return();
        retval.start = input.LT(1);

        Token KEY_INT39=null;
        Token KEY_DOUBLE40=null;

        try {
            // D:\\WORK\\mg\\src\\mg.g:374:4: ( KEY_INT | KEY_DOUBLE )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEY_INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==KEY_DOUBLE) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:374:8: KEY_INT
                    {
                    KEY_INT39=(Token)match(input,KEY_INT,FOLLOW_KEY_INT_in_var_type1632); 
                    retval.v_type = (KEY_INT39!=null?KEY_INT39.getText():null); 

                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:375:8: KEY_DOUBLE
                    {
                    KEY_DOUBLE40=(Token)match(input,KEY_DOUBLE,FOLLOW_KEY_DOUBLE_in_var_type1643); 
                    retval.v_type = (KEY_DOUBLE40!=null?KEY_DOUBLE40.getText():null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_type"

    public static class if_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "if_statement"
    // D:\\WORK\\mg\\src\\mg.g:378:1: if_statement : KEY_IF '(' logic_expression ')' block ( else_statement )? -> if_template(expr=$logic_expression.stifblock=$block.blockselseblock=$else_statement.st);
    public final mgParser.if_statement_return if_statement() throws RecognitionException {
        mgParser.if_statement_return retval = new mgParser.if_statement_return();
        retval.start = input.LT(1);

        mgParser.logic_expression_return logic_expression41 = null;

        mgParser.block_return block42 = null;

        mgParser.else_statement_return else_statement43 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:379:3: ( KEY_IF '(' logic_expression ')' block ( else_statement )? -> if_template(expr=$logic_expression.stifblock=$block.blockselseblock=$else_statement.st))
            // D:\\WORK\\mg\\src\\mg.g:380:7: KEY_IF '(' logic_expression ')' block ( else_statement )?
            {
            match(input,KEY_IF,FOLLOW_KEY_IF_in_if_statement1670); 
            match(input,61,FOLLOW_61_in_if_statement1672); 
            pushFollow(FOLLOW_logic_expression_in_if_statement1674);
            logic_expression41=logic_expression();

            state._fsp--;

            match(input,62,FOLLOW_62_in_if_statement1676); 
            pushFollow(FOLLOW_block_in_if_statement1678);
            block42=block();

            state._fsp--;

            // D:\\WORK\\mg\\src\\mg.g:380:46: ( else_statement )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEY_ELSE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:380:49: else_statement
                    {
                    pushFollow(FOLLOW_else_statement_in_if_statement1684);
                    else_statement43=else_statement();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 381:7: -> if_template(expr=$logic_expression.stifblock=$block.blockselseblock=$else_statement.st)
            {
                retval.st = templateLib.getInstanceOf("if_template",
              new STAttrMap().put("expr", (logic_expression41!=null?logic_expression41.st:null)).put("ifblock", (block42!=null?block42.blocks:null)).put("elseblock", (else_statement43!=null?else_statement43.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class else_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "else_statement"
    // D:\\WORK\\mg\\src\\mg.g:384:1: fragment else_statement : KEY_ELSE block -> else_template(elseblock=$block.blocks);
    public final mgParser.else_statement_return else_statement() throws RecognitionException {
        mgParser.else_statement_return retval = new mgParser.else_statement_return();
        retval.start = input.LT(1);

        mgParser.block_return block44 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:386:3: ( KEY_ELSE block -> else_template(elseblock=$block.blocks))
            // D:\\WORK\\mg\\src\\mg.g:387:3: KEY_ELSE block
            {
            match(input,KEY_ELSE,FOLLOW_KEY_ELSE_in_else_statement1743); 
            pushFollow(FOLLOW_block_in_else_statement1746);
            block44=block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 388:3: -> else_template(elseblock=$block.blocks)
            {
                retval.st = templateLib.getInstanceOf("else_template",
              new STAttrMap().put("elseblock", (block44!=null?block44.blocks:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else_statement"

    public static class while_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "while_statement"
    // D:\\WORK\\mg\\src\\mg.g:391:1: while_statement : KEY_WHILE '(' logic_expression ')' block -> while(expr=$logic_expression.stblock=$block.blocks);
    public final mgParser.while_statement_return while_statement() throws RecognitionException {
        mgParser.while_statement_return retval = new mgParser.while_statement_return();
        retval.start = input.LT(1);

        mgParser.logic_expression_return logic_expression45 = null;

        mgParser.block_return block46 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:392:3: ( KEY_WHILE '(' logic_expression ')' block -> while(expr=$logic_expression.stblock=$block.blocks))
            // D:\\WORK\\mg\\src\\mg.g:393:3: KEY_WHILE '(' logic_expression ')' block
            {
            match(input,KEY_WHILE,FOLLOW_KEY_WHILE_in_while_statement1778); 
            match(input,61,FOLLOW_61_in_while_statement1780); 
            pushFollow(FOLLOW_logic_expression_in_while_statement1782);
            logic_expression45=logic_expression();

            state._fsp--;

            match(input,62,FOLLOW_62_in_while_statement1784); 
            pushFollow(FOLLOW_block_in_while_statement1787);
            block46=block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 394:3: -> while(expr=$logic_expression.stblock=$block.blocks)
            {
                retval.st = templateLib.getInstanceOf("while",
              new STAttrMap().put("expr", (logic_expression45!=null?logic_expression45.st:null)).put("block", (block46!=null?block46.blocks:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class repeatuntil_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "repeatuntil_statement"
    // D:\\WORK\\mg\\src\\mg.g:397:1: repeatuntil_statement : KEY_REPEAT block KEY_UNTIL '(' logic_expression ')' -> dowhile(block=$block.blocksexpr=$logic_expression.st);
    public final mgParser.repeatuntil_statement_return repeatuntil_statement() throws RecognitionException {
        mgParser.repeatuntil_statement_return retval = new mgParser.repeatuntil_statement_return();
        retval.start = input.LT(1);

        mgParser.block_return block47 = null;

        mgParser.logic_expression_return logic_expression48 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:398:3: ( KEY_REPEAT block KEY_UNTIL '(' logic_expression ')' -> dowhile(block=$block.blocksexpr=$logic_expression.st))
            // D:\\WORK\\mg\\src\\mg.g:399:3: KEY_REPEAT block KEY_UNTIL '(' logic_expression ')'
            {
            match(input,KEY_REPEAT,FOLLOW_KEY_REPEAT_in_repeatuntil_statement1824); 
            pushFollow(FOLLOW_block_in_repeatuntil_statement1827);
            block47=block();

            state._fsp--;

            match(input,KEY_UNTIL,FOLLOW_KEY_UNTIL_in_repeatuntil_statement1830); 
            match(input,61,FOLLOW_61_in_repeatuntil_statement1832); 
            pushFollow(FOLLOW_logic_expression_in_repeatuntil_statement1834);
            logic_expression48=logic_expression();

            state._fsp--;

            match(input,62,FOLLOW_62_in_repeatuntil_statement1836); 


            // TEMPLATE REWRITE
            // 400:3: -> dowhile(block=$block.blocksexpr=$logic_expression.st)
            {
                retval.st = templateLib.getInstanceOf("dowhile",
              new STAttrMap().put("block", (block47!=null?block47.blocks:null)).put("expr", (logic_expression48!=null?logic_expression48.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "repeatuntil_statement"

    public static class for_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_statement"
    // D:\\WORK\\mg\\src\\mg.g:403:1: for_statement : KEY_FOR '(' (a1= for_first )? SEMI ( logic_expression )? SEMI ( expression )? ')' block -> for_template(atom1=$a1.statom2=$logic_expression.statom3=$expression.stblock=$block.blocks);
    public final mgParser.for_statement_return for_statement() throws RecognitionException {
        mgParser.for_statement_return retval = new mgParser.for_statement_return();
        retval.start = input.LT(1);

        mgParser.for_first_return a1 = null;

        mgParser.logic_expression_return logic_expression49 = null;

        mgParser.expression_return expression50 = null;

        mgParser.block_return block51 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:404:3: ( KEY_FOR '(' (a1= for_first )? SEMI ( logic_expression )? SEMI ( expression )? ')' block -> for_template(atom1=$a1.statom2=$logic_expression.statom3=$expression.stblock=$block.blocks))
            // D:\\WORK\\mg\\src\\mg.g:405:3: KEY_FOR '(' (a1= for_first )? SEMI ( logic_expression )? SEMI ( expression )? ')' block
            {
            match(input,KEY_FOR,FOLLOW_KEY_FOR_in_for_statement1875); 
            match(input,61,FOLLOW_61_in_for_statement1877); 
            // D:\\WORK\\mg\\src\\mg.g:405:15: (a1= for_first )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID||(LA20_0>=KEY_INT && LA20_0<=KEY_DOUBLE)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:405:17: a1= for_first
                    {
                    pushFollow(FOLLOW_for_first_in_for_statement1885);
                    a1=for_first();

                    state._fsp--;


                    }
                    break;

            }

            match(input,SEMI,FOLLOW_SEMI_in_for_statement1891); 
            // D:\\WORK\\mg\\src\\mg.g:405:41: ( logic_expression )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID||(LA21_0>=INT && LA21_0<=DOUBLE)||LA21_0==NOT||LA21_0==KEY_SQRT||LA21_0==64||LA21_0==66) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:405:41: logic_expression
                    {
                    pushFollow(FOLLOW_logic_expression_in_for_statement1893);
                    logic_expression49=logic_expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,SEMI,FOLLOW_SEMI_in_for_statement1896); 
            // D:\\WORK\\mg\\src\\mg.g:405:65: ( expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||(LA22_0>=INT && LA22_0<=DOUBLE)||LA22_0==KEY_SQRT||LA22_0==64||LA22_0==66) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:405:65: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1899);
                    expression50=expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,62,FOLLOW_62_in_for_statement1902); 
            pushFollow(FOLLOW_block_in_for_statement1905);
            block51=block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 406:3: -> for_template(atom1=$a1.statom2=$logic_expression.statom3=$expression.stblock=$block.blocks)
            {
                retval.st = templateLib.getInstanceOf("for_template",
              new STAttrMap().put("atom1", (a1!=null?a1.st:null)).put("atom2", (logic_expression49!=null?logic_expression49.st:null)).put("atom3", (expression50!=null?expression50.st:null)).put("block", (block51!=null?block51.blocks:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class for_first_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_first"
    // D:\\WORK\\mg\\src\\mg.g:409:1: fragment for_first : ( ID -> str(value=$ID.text) | var_dec_in_block -> {$var_dec_in_block.st});
    public final mgParser.for_first_return for_first() throws RecognitionException {
        mgParser.for_first_return retval = new mgParser.for_first_return();
        retval.start = input.LT(1);

        Token ID52=null;
        mgParser.var_dec_in_block_return var_dec_in_block53 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:411:3: ( ID -> str(value=$ID.text) | var_dec_in_block -> {$var_dec_in_block.st})
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=KEY_INT && LA23_0<=KEY_DOUBLE)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:411:5: ID
                    {
                    ID52=(Token)match(input,ID,FOLLOW_ID_in_for_first1960); 


                    // TEMPLATE REWRITE
                    // 411:8: -> str(value=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("str",
                      new STAttrMap().put("value", (ID52!=null?ID52.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:412:5: var_dec_in_block
                    {
                    pushFollow(FOLLOW_var_dec_in_block_in_for_first1976);
                    var_dec_in_block53=var_dec_in_block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 412:22: -> {$var_dec_in_block.st}
                    {
                        retval.st = (var_dec_in_block53!=null?var_dec_in_block53.st:null);
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_first"

    public static class change_type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "change_type"
    // D:\\WORK\\mg\\src\\mg.g:415:1: change_type : id1= ID '=' '(' var_type ')' id2= ID -> change_type(idone=$id1.texttype=$var_type.v_typeidtwo=$id2.text);
    public final mgParser.change_type_return change_type() throws RecognitionException {
        mgParser.change_type_return retval = new mgParser.change_type_return();
        retval.start = input.LT(1);

        Token id1=null;
        Token id2=null;
        mgParser.var_type_return var_type54 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:417:3: (id1= ID '=' '(' var_type ')' id2= ID -> change_type(idone=$id1.texttype=$var_type.v_typeidtwo=$id2.text))
            // D:\\WORK\\mg\\src\\mg.g:417:5: id1= ID '=' '(' var_type ')' id2= ID
            {
            id1=(Token)match(input,ID,FOLLOW_ID_in_change_type2001); 
            match(input,ASSIGN,FOLLOW_ASSIGN_in_change_type2003); 
            match(input,61,FOLLOW_61_in_change_type2005); 
            pushFollow(FOLLOW_var_type_in_change_type2007);
            var_type54=var_type();

            state._fsp--;

            match(input,62,FOLLOW_62_in_change_type2009); 
            id2=(Token)match(input,ID,FOLLOW_ID_in_change_type2015); 

              if(!((program_scope)program_stack.peek()).globalVars.contains((id1!=null?id1.getText():null)) && !((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((id1!=null?id1.getText():null))  )
                    { 
                      {System.out.println(" line "+(id1!=null?id1.getLine():0)+" undefined variable "+(id1!=null?id1.getText():null) );} err();
                    }
                    
               if(!((program_scope)program_stack.peek()).globalVars.contains((id2!=null?id2.getText():null)) && !((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((id2!=null?id2.getText():null))  )
                    { 
                      {System.out.println(" line "+(id2!=null?id2.getLine():0)+" undefined variable "+(id2!=null?id2.getText():null));} err();
                    }
                if(((program_scope)program_stack.peek()).globalVars.contains((id1!=null?id1.getText():null)))
                   {
                      if(!((program_scope)program_stack.peek()).globalVars.getTypeOfVar((id1!=null?id1.getText():null)).equals((var_type54!=null?var_type54.v_type:null)) )
                      {
                        System.out.println("line "+ (id1!=null?id1.getLine():0)+" incorrect converation type"); err();
                      }
                   }
                if(((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((id1!=null?id1.getText():null)))
                   {
                      if(!((fun_declaration_scope)fun_declaration_stack.peek()).vars.getTypeOfVar((id1!=null?id1.getText():null)).equals((var_type54!=null?var_type54.v_type:null)))
                      {
                        System.out.println("line "+ (id1!=null?id1.getLine():0)+" incorrect converation type" ); err();
                      }
                   }   
              


            // TEMPLATE REWRITE
            // 444:3: -> change_type(idone=$id1.texttype=$var_type.v_typeidtwo=$id2.text)
            {
                retval.st = templateLib.getInstanceOf("change_type",
              new STAttrMap().put("idone", (id1!=null?id1.getText():null)).put("type", (var_type54!=null?var_type54.v_type:null)).put("idtwo", (id2!=null?id2.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "change_type"

    public static class read_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "read"
    // D:\\WORK\\mg\\src\\mg.g:446:1: read : KEY_READ ID '(' ( KEY_INT -> readInt(id=$ID.text) | KEY_DOUBLE -> readDouble(id=$ID.text)) ')' ;
    public final mgParser.read_return read() throws RecognitionException {
        mgParser.read_return retval = new mgParser.read_return();
        retval.start = input.LT(1);

        Token ID55=null;

        try {
            // D:\\WORK\\mg\\src\\mg.g:446:7: ( KEY_READ ID '(' ( KEY_INT -> readInt(id=$ID.text) | KEY_DOUBLE -> readDouble(id=$ID.text)) ')' )
            // D:\\WORK\\mg\\src\\mg.g:446:9: KEY_READ ID '(' ( KEY_INT -> readInt(id=$ID.text) | KEY_DOUBLE -> readDouble(id=$ID.text)) ')'
            {
            match(input,KEY_READ,FOLLOW_KEY_READ_in_read2059); 
            ID55=(Token)match(input,ID,FOLLOW_ID_in_read2062); 
            match(input,61,FOLLOW_61_in_read2064); 
            // D:\\WORK\\mg\\src\\mg.g:447:7: ( KEY_INT -> readInt(id=$ID.text) | KEY_DOUBLE -> readDouble(id=$ID.text))
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEY_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==KEY_DOUBLE) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:447:9: KEY_INT
                    {
                    match(input,KEY_INT,FOLLOW_KEY_INT_in_read2076); 

                          
                           if(!((program_scope)program_stack.peek()).globalVars.contains((ID55!=null?ID55.getText():null)) && !((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((ID55!=null?ID55.getText():null))  )
                            { 
                              {System.out.println("line "+(ID55!=null?ID55.getLine():0)+" undefined variable "+(ID55!=null?ID55.getText():null));} err();
                            }
                           if(((program_scope)program_stack.peek()).globalVars.contains((ID55!=null?ID55.getText():null)))
                           {
                              if(!((program_scope)program_stack.peek()).globalVars.getTypeOfVar((ID55!=null?ID55.getText():null)).equals("int"))
                              {
                                System.out.println("line "+ (ID55!=null?ID55.getLine():0)+" incorrect read type" ); err();
                              }
                           }
                           
                            if(((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((ID55!=null?ID55.getText():null)))
                           {
                              if(!((fun_declaration_scope)fun_declaration_stack.peek()).vars.getTypeOfVar((ID55!=null?ID55.getText():null)).equals("int"))
                              {
                                System.out.println("line "+ (ID55!=null?ID55.getLine():0)+" incorrect read type.  "); err();
                              }
                           }
                          


                    // TEMPLATE REWRITE
                    // 471:8: -> readInt(id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("readInt",
                      new STAttrMap().put("id", (ID55!=null?ID55.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:472:9: KEY_DOUBLE
                    {
                    match(input,KEY_DOUBLE,FOLLOW_KEY_DOUBLE_in_read2123); 

                           if(!((program_scope)program_stack.peek()).globalVars.contains((ID55!=null?ID55.getText():null)) && !((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((ID55!=null?ID55.getText():null))  )
                            { 
                            System.out.println("line "+(ID55!=null?ID55.getLine():0)+" undefined variable "+(ID55!=null?ID55.getText():null)); err();
                            }
                           if(((program_scope)program_stack.peek()).globalVars.contains((ID55!=null?ID55.getText():null)))
                           {
                              if(!((program_scope)program_stack.peek()).globalVars.getTypeOfVar((ID55!=null?ID55.getText():null)).equals("double"))
                              {
                                System.out.println("line "+ (ID55!=null?ID55.getLine():0)+" incorrect read type "); err();
                              }
                           }
                           
                            if(((fun_declaration_scope)fun_declaration_stack.peek()).vars.contains((ID55!=null?ID55.getText():null)))
                           {
                              if(!((fun_declaration_scope)fun_declaration_stack.peek()).vars.getTypeOfVar((ID55!=null?ID55.getText():null)).equals("double"))
                              {
                                System.out.println("line "+ (ID55!=null?ID55.getLine():0)+" incorrect read type."); err();
                              }
                           }
                          


                    // TEMPLATE REWRITE
                    // 497:7: -> readDouble(id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("readDouble",
                      new STAttrMap().put("id", (ID55!=null?ID55.getText():null)));
                    }


                    }
                    break;

            }

            match(input,62,FOLLOW_62_in_read2183); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "read"

    public static class write_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "write"
    // D:\\WORK\\mg\\src\\mg.g:501:1: write : KEY_WRITE atom -> write(id=$atom.st );
    public final mgParser.write_return write() throws RecognitionException {
        mgParser.write_return retval = new mgParser.write_return();
        retval.start = input.LT(1);

        mgParser.atom_return atom56 = null;


        try {
            // D:\\WORK\\mg\\src\\mg.g:501:7: ( KEY_WRITE atom -> write(id=$atom.st ))
            // D:\\WORK\\mg\\src\\mg.g:501:9: KEY_WRITE atom
            {
            match(input,KEY_WRITE,FOLLOW_KEY_WRITE_in_write2204); 
            pushFollow(FOLLOW_atom_in_write2207);
            atom56=atom();

            state._fsp--;



            // TEMPLATE REWRITE
            // 502:7: -> write(id=$atom.st )
            {
                retval.st = templateLib.getInstanceOf("write",
              new STAttrMap().put("id", (atom56!=null?atom56.st:null) ));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "write"

    public static class operator_return extends ParserRuleReturnScope {
        public String Id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operator"
    // D:\\WORK\\mg\\src\\mg.g:505:1: operator returns [String Id] : ( DIV -> { new StringTemplate( $DIV.text ) } | DIV_ASSIGN -> { new StringTemplate( $DIV_ASSIGN.text ) } | PLUS -> { new StringTemplate( $PLUS.text ) } | PLUS_ASSIGN -> { new StringTemplate( $PLUS_ASSIGN.text ) } | INC -> { new StringTemplate( $INC.text ) } | MINUS -> { new StringTemplate( $MINUS.text ) } | MINUS_ASSIGN -> { new StringTemplate( $MINUS_ASSIGN.text ) } | DEC -> { new StringTemplate( $DEC.text ) } | STAR -> { new StringTemplate( $STAR.text ) } | STAR_ASSIGN -> { new StringTemplate( $STAR_ASSIGN.text ) } | MOD -> { new StringTemplate( $MOD.text ) } | MOD_ASSIGN -> { new StringTemplate( $MOD_ASSIGN.text ) } | ASSIGN -> { new StringTemplate( $ASSIGN.text ) }) ;
    public final mgParser.operator_return operator() throws RecognitionException {
        mgParser.operator_return retval = new mgParser.operator_return();
        retval.start = input.LT(1);

        Token DIV57=null;
        Token DIV_ASSIGN58=null;
        Token PLUS59=null;
        Token PLUS_ASSIGN60=null;
        Token INC61=null;
        Token MINUS62=null;
        Token MINUS_ASSIGN63=null;
        Token DEC64=null;
        Token STAR65=null;
        Token STAR_ASSIGN66=null;
        Token MOD67=null;
        Token MOD_ASSIGN68=null;
        Token ASSIGN69=null;

        try {
            // D:\\WORK\\mg\\src\\mg.g:506:9: ( ( DIV -> { new StringTemplate( $DIV.text ) } | DIV_ASSIGN -> { new StringTemplate( $DIV_ASSIGN.text ) } | PLUS -> { new StringTemplate( $PLUS.text ) } | PLUS_ASSIGN -> { new StringTemplate( $PLUS_ASSIGN.text ) } | INC -> { new StringTemplate( $INC.text ) } | MINUS -> { new StringTemplate( $MINUS.text ) } | MINUS_ASSIGN -> { new StringTemplate( $MINUS_ASSIGN.text ) } | DEC -> { new StringTemplate( $DEC.text ) } | STAR -> { new StringTemplate( $STAR.text ) } | STAR_ASSIGN -> { new StringTemplate( $STAR_ASSIGN.text ) } | MOD -> { new StringTemplate( $MOD.text ) } | MOD_ASSIGN -> { new StringTemplate( $MOD_ASSIGN.text ) } | ASSIGN -> { new StringTemplate( $ASSIGN.text ) }) )
            // D:\\WORK\\mg\\src\\mg.g:508:10: ( DIV -> { new StringTemplate( $DIV.text ) } | DIV_ASSIGN -> { new StringTemplate( $DIV_ASSIGN.text ) } | PLUS -> { new StringTemplate( $PLUS.text ) } | PLUS_ASSIGN -> { new StringTemplate( $PLUS_ASSIGN.text ) } | INC -> { new StringTemplate( $INC.text ) } | MINUS -> { new StringTemplate( $MINUS.text ) } | MINUS_ASSIGN -> { new StringTemplate( $MINUS_ASSIGN.text ) } | DEC -> { new StringTemplate( $DEC.text ) } | STAR -> { new StringTemplate( $STAR.text ) } | STAR_ASSIGN -> { new StringTemplate( $STAR_ASSIGN.text ) } | MOD -> { new StringTemplate( $MOD.text ) } | MOD_ASSIGN -> { new StringTemplate( $MOD_ASSIGN.text ) } | ASSIGN -> { new StringTemplate( $ASSIGN.text ) })
            {
            // D:\\WORK\\mg\\src\\mg.g:508:10: ( DIV -> { new StringTemplate( $DIV.text ) } | DIV_ASSIGN -> { new StringTemplate( $DIV_ASSIGN.text ) } | PLUS -> { new StringTemplate( $PLUS.text ) } | PLUS_ASSIGN -> { new StringTemplate( $PLUS_ASSIGN.text ) } | INC -> { new StringTemplate( $INC.text ) } | MINUS -> { new StringTemplate( $MINUS.text ) } | MINUS_ASSIGN -> { new StringTemplate( $MINUS_ASSIGN.text ) } | DEC -> { new StringTemplate( $DEC.text ) } | STAR -> { new StringTemplate( $STAR.text ) } | STAR_ASSIGN -> { new StringTemplate( $STAR_ASSIGN.text ) } | MOD -> { new StringTemplate( $MOD.text ) } | MOD_ASSIGN -> { new StringTemplate( $MOD_ASSIGN.text ) } | ASSIGN -> { new StringTemplate( $ASSIGN.text ) })
            int alt25=13;
            switch ( input.LA(1) ) {
            case DIV:
                {
                alt25=1;
                }
                break;
            case DIV_ASSIGN:
                {
                alt25=2;
                }
                break;
            case PLUS:
                {
                alt25=3;
                }
                break;
            case PLUS_ASSIGN:
                {
                alt25=4;
                }
                break;
            case INC:
                {
                alt25=5;
                }
                break;
            case MINUS:
                {
                alt25=6;
                }
                break;
            case MINUS_ASSIGN:
                {
                alt25=7;
                }
                break;
            case DEC:
                {
                alt25=8;
                }
                break;
            case STAR:
                {
                alt25=9;
                }
                break;
            case STAR_ASSIGN:
                {
                alt25=10;
                }
                break;
            case MOD:
                {
                alt25=11;
                }
                break;
            case MOD_ASSIGN:
                {
                alt25=12;
                }
                break;
            case ASSIGN:
                {
                alt25=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:508:12: DIV
                    {
                    DIV57=(Token)match(input,DIV,FOLLOW_DIV_in_operator2278); 
                    retval.Id = (DIV57!=null?DIV57.getText():null); 


                    // TEMPLATE REWRITE
                    // 508:38: -> { new StringTemplate( $DIV.text ) }
                    {
                        retval.st =  new StringTemplate( (DIV57!=null?DIV57.getText():null) ) ;
                    }


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:509:12: DIV_ASSIGN
                    {
                    DIV_ASSIGN58=(Token)match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_operator2299); 
                    retval.Id = (DIV_ASSIGN58!=null?DIV_ASSIGN58.getText():null); 


                    // TEMPLATE REWRITE
                    // 509:51: -> { new StringTemplate( $DIV_ASSIGN.text ) }
                    {
                        retval.st =  new StringTemplate( (DIV_ASSIGN58!=null?DIV_ASSIGN58.getText():null) ) ;
                    }


                    }
                    break;
                case 3 :
                    // D:\\WORK\\mg\\src\\mg.g:510:12: PLUS
                    {
                    PLUS59=(Token)match(input,PLUS,FOLLOW_PLUS_in_operator2319); 
                    retval.Id = (PLUS59!=null?PLUS59.getText():null); 


                    // TEMPLATE REWRITE
                    // 510:39: -> { new StringTemplate( $PLUS.text ) }
                    {
                        retval.st =  new StringTemplate( (PLUS59!=null?PLUS59.getText():null) ) ;
                    }


                    }
                    break;
                case 4 :
                    // D:\\WORK\\mg\\src\\mg.g:511:12: PLUS_ASSIGN
                    {
                    PLUS_ASSIGN60=(Token)match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_operator2339); 
                    retval.Id = (PLUS_ASSIGN60!=null?PLUS_ASSIGN60.getText():null); 


                    // TEMPLATE REWRITE
                    // 511:52: -> { new StringTemplate( $PLUS_ASSIGN.text ) }
                    {
                        retval.st =  new StringTemplate( (PLUS_ASSIGN60!=null?PLUS_ASSIGN60.getText():null) ) ;
                    }


                    }
                    break;
                case 5 :
                    // D:\\WORK\\mg\\src\\mg.g:512:12: INC
                    {
                    INC61=(Token)match(input,INC,FOLLOW_INC_in_operator2358); 
                    retval.Id = (INC61!=null?INC61.getText():null); 


                    // TEMPLATE REWRITE
                    // 512:39: -> { new StringTemplate( $INC.text ) }
                    {
                        retval.st =  new StringTemplate( (INC61!=null?INC61.getText():null) ) ;
                    }


                    }
                    break;
                case 6 :
                    // D:\\WORK\\mg\\src\\mg.g:513:12: MINUS
                    {
                    MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_operator2380); 
                    retval.Id = (MINUS62!=null?MINUS62.getText():null); 


                    // TEMPLATE REWRITE
                    // 513:41: -> { new StringTemplate( $MINUS.text ) }
                    {
                        retval.st =  new StringTemplate( (MINUS62!=null?MINUS62.getText():null) ) ;
                    }


                    }
                    break;
                case 7 :
                    // D:\\WORK\\mg\\src\\mg.g:514:12: MINUS_ASSIGN
                    {
                    MINUS_ASSIGN63=(Token)match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_operator2400); 
                    retval.Id = (MINUS_ASSIGN63!=null?MINUS_ASSIGN63.getText():null); 


                    // TEMPLATE REWRITE
                    // 514:55: -> { new StringTemplate( $MINUS_ASSIGN.text ) }
                    {
                        retval.st =  new StringTemplate( (MINUS_ASSIGN63!=null?MINUS_ASSIGN63.getText():null) ) ;
                    }


                    }
                    break;
                case 8 :
                    // D:\\WORK\\mg\\src\\mg.g:515:12: DEC
                    {
                    DEC64=(Token)match(input,DEC,FOLLOW_DEC_in_operator2420); 
                    retval.Id = (DEC64!=null?DEC64.getText():null); 


                    // TEMPLATE REWRITE
                    // 515:38: -> { new StringTemplate( $DEC.text ) }
                    {
                        retval.st =  new StringTemplate( (DEC64!=null?DEC64.getText():null) ) ;
                    }


                    }
                    break;
                case 9 :
                    // D:\\WORK\\mg\\src\\mg.g:516:12: STAR
                    {
                    STAR65=(Token)match(input,STAR,FOLLOW_STAR_in_operator2441); 
                    retval.Id = (STAR65!=null?STAR65.getText():null); 


                    // TEMPLATE REWRITE
                    // 516:39: -> { new StringTemplate( $STAR.text ) }
                    {
                        retval.st =  new StringTemplate( (STAR65!=null?STAR65.getText():null) ) ;
                    }


                    }
                    break;
                case 10 :
                    // D:\\WORK\\mg\\src\\mg.g:517:12: STAR_ASSIGN
                    {
                    STAR_ASSIGN66=(Token)match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_operator2461); 
                    retval.Id = (STAR_ASSIGN66!=null?STAR_ASSIGN66.getText():null); 


                    // TEMPLATE REWRITE
                    // 517:52: -> { new StringTemplate( $STAR_ASSIGN.text ) }
                    {
                        retval.st =  new StringTemplate( (STAR_ASSIGN66!=null?STAR_ASSIGN66.getText():null) ) ;
                    }


                    }
                    break;
                case 11 :
                    // D:\\WORK\\mg\\src\\mg.g:518:12: MOD
                    {
                    MOD67=(Token)match(input,MOD,FOLLOW_MOD_in_operator2480); 
                    retval.Id = (MOD67!=null?MOD67.getText():null); 


                    // TEMPLATE REWRITE
                    // 518:39: -> { new StringTemplate( $MOD.text ) }
                    {
                        retval.st =  new StringTemplate( (MOD67!=null?MOD67.getText():null) ) ;
                    }


                    }
                    break;
                case 12 :
                    // D:\\WORK\\mg\\src\\mg.g:519:12: MOD_ASSIGN
                    {
                    MOD_ASSIGN68=(Token)match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_operator2502); 
                    retval.Id = (MOD_ASSIGN68!=null?MOD_ASSIGN68.getText():null); 


                    // TEMPLATE REWRITE
                    // 519:52: -> { new StringTemplate( $MOD_ASSIGN.text ) }
                    {
                        retval.st =  new StringTemplate( (MOD_ASSIGN68!=null?MOD_ASSIGN68.getText():null) ) ;
                    }


                    }
                    break;
                case 13 :
                    // D:\\WORK\\mg\\src\\mg.g:520:12: ASSIGN
                    {
                    ASSIGN69=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_operator2523); 
                    retval.Id = (ASSIGN69!=null?ASSIGN69.getText():null); 


                    // TEMPLATE REWRITE
                    // 520:43: -> { new StringTemplate( $ASSIGN.text ) }
                    {
                        retval.st =  new StringTemplate( (ASSIGN69!=null?ASSIGN69.getText():null) ) ;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class logic_operator_return extends ParserRuleReturnScope {
        public String Id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logic_operator"
    // D:\\WORK\\mg\\src\\mg.g:523:1: logic_operator returns [String Id] : ( KEY_AND -> { new StringTemplate( $KEY_AND.text ) } | KEY_OR -> { new StringTemplate( $KEY_OR.text ) } | EQUAL -> { new StringTemplate( $EQUAL.text ) } | NOT_EQUAL -> { new StringTemplate( $NOT_EQUAL.text ) } | GE -> { new StringTemplate( $GE.text ) } | GT -> { new StringTemplate( $GT.text ) } | LE -> { new StringTemplate( $LE.text ) } | LT -> { new StringTemplate( $LT.text ) });
    public final mgParser.logic_operator_return logic_operator() throws RecognitionException {
        mgParser.logic_operator_return retval = new mgParser.logic_operator_return();
        retval.start = input.LT(1);

        Token KEY_AND70=null;
        Token KEY_OR71=null;
        Token EQUAL72=null;
        Token NOT_EQUAL73=null;
        Token GE74=null;
        Token GT75=null;
        Token LE76=null;
        Token LT77=null;

        try {
            // D:\\WORK\\mg\\src\\mg.g:524:4: ( KEY_AND -> { new StringTemplate( $KEY_AND.text ) } | KEY_OR -> { new StringTemplate( $KEY_OR.text ) } | EQUAL -> { new StringTemplate( $EQUAL.text ) } | NOT_EQUAL -> { new StringTemplate( $NOT_EQUAL.text ) } | GE -> { new StringTemplate( $GE.text ) } | GT -> { new StringTemplate( $GT.text ) } | LE -> { new StringTemplate( $LE.text ) } | LT -> { new StringTemplate( $LT.text ) })
            int alt26=8;
            switch ( input.LA(1) ) {
            case KEY_AND:
                {
                alt26=1;
                }
                break;
            case KEY_OR:
                {
                alt26=2;
                }
                break;
            case EQUAL:
                {
                alt26=3;
                }
                break;
            case NOT_EQUAL:
                {
                alt26=4;
                }
                break;
            case GE:
                {
                alt26=5;
                }
                break;
            case GT:
                {
                alt26=6;
                }
                break;
            case LE:
                {
                alt26=7;
                }
                break;
            case LT:
                {
                alt26=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:525:5: KEY_AND
                    {
                    KEY_AND70=(Token)match(input,KEY_AND,FOLLOW_KEY_AND_in_logic_operator2558); 
                    retval.Id = (KEY_AND70!=null?KEY_AND70.getText():null); 


                    // TEMPLATE REWRITE
                    // 525:37: -> { new StringTemplate( $KEY_AND.text ) }
                    {
                        retval.st =  new StringTemplate( (KEY_AND70!=null?KEY_AND70.getText():null) ) ;
                    }


                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:526:6: KEY_OR
                    {
                    KEY_OR71=(Token)match(input,KEY_OR,FOLLOW_KEY_OR_in_logic_operator2571); 
                    retval.Id = (KEY_OR71!=null?KEY_OR71.getText():null); 


                    // TEMPLATE REWRITE
                    // 526:37: -> { new StringTemplate( $KEY_OR.text ) }
                    {
                        retval.st =  new StringTemplate( (KEY_OR71!=null?KEY_OR71.getText():null) ) ;
                    }


                    }
                    break;
                case 3 :
                    // D:\\WORK\\mg\\src\\mg.g:527:6: EQUAL
                    {
                    EQUAL72=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_logic_operator2585); 
                    retval.Id = (EQUAL72!=null?EQUAL72.getText():null); 


                    // TEMPLATE REWRITE
                    // 527:34: -> { new StringTemplate( $EQUAL.text ) }
                    {
                        retval.st =  new StringTemplate( (EQUAL72!=null?EQUAL72.getText():null) ) ;
                    }


                    }
                    break;
                case 4 :
                    // D:\\WORK\\mg\\src\\mg.g:528:6: NOT_EQUAL
                    {
                    NOT_EQUAL73=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logic_operator2598); 
                    retval.Id = (NOT_EQUAL73!=null?NOT_EQUAL73.getText():null); 


                    // TEMPLATE REWRITE
                    // 528:42: -> { new StringTemplate( $NOT_EQUAL.text ) }
                    {
                        retval.st =  new StringTemplate( (NOT_EQUAL73!=null?NOT_EQUAL73.getText():null) ) ;
                    }


                    }
                    break;
                case 5 :
                    // D:\\WORK\\mg\\src\\mg.g:529:6: GE
                    {
                    GE74=(Token)match(input,GE,FOLLOW_GE_in_logic_operator2611); 
                    retval.Id = (GE74!=null?GE74.getText():null); 


                    // TEMPLATE REWRITE
                    // 529:28: -> { new StringTemplate( $GE.text ) }
                    {
                        retval.st =  new StringTemplate( (GE74!=null?GE74.getText():null) ) ;
                    }


                    }
                    break;
                case 6 :
                    // D:\\WORK\\mg\\src\\mg.g:530:6: GT
                    {
                    GT75=(Token)match(input,GT,FOLLOW_GT_in_logic_operator2624); 
                    retval.Id = (GT75!=null?GT75.getText():null); 


                    // TEMPLATE REWRITE
                    // 530:28: -> { new StringTemplate( $GT.text ) }
                    {
                        retval.st =  new StringTemplate( (GT75!=null?GT75.getText():null) ) ;
                    }


                    }
                    break;
                case 7 :
                    // D:\\WORK\\mg\\src\\mg.g:531:6: LE
                    {
                    LE76=(Token)match(input,LE,FOLLOW_LE_in_logic_operator2637); 
                    retval.Id = (LE76!=null?LE76.getText():null); 


                    // TEMPLATE REWRITE
                    // 531:28: -> { new StringTemplate( $LE.text ) }
                    {
                        retval.st =  new StringTemplate( (LE76!=null?LE76.getText():null) ) ;
                    }


                    }
                    break;
                case 8 :
                    // D:\\WORK\\mg\\src\\mg.g:532:6: LT
                    {
                    LT77=(Token)match(input,LT,FOLLOW_LT_in_logic_operator2650); 
                    retval.Id = (LT77!=null?LT77.getText():null); 


                    // TEMPLATE REWRITE
                    // 532:28: -> { new StringTemplate( $LT.text ) }
                    {
                        retval.st =  new StringTemplate( (LT77!=null?LT77.getText():null) ) ;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logic_operator"

    public static class negation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "negation"
    // D:\\WORK\\mg\\src\\mg.g:535:1: fragment negation : ( NOT -> { new StringTemplate( $NOT.text ) })? ;
    public final mgParser.negation_return negation() throws RecognitionException {
        mgParser.negation_return retval = new mgParser.negation_return();
        retval.start = input.LT(1);

        Token NOT78=null;

        try {
            // D:\\WORK\\mg\\src\\mg.g:537:3: ( ( NOT -> { new StringTemplate( $NOT.text ) })? )
            // D:\\WORK\\mg\\src\\mg.g:537:6: ( NOT -> { new StringTemplate( $NOT.text ) })?
            {
            // D:\\WORK\\mg\\src\\mg.g:537:6: ( NOT -> { new StringTemplate( $NOT.text ) })?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:537:7: NOT
                    {
                    NOT78=(Token)match(input,NOT,FOLLOW_NOT_in_negation2681); 


                    // TEMPLATE REWRITE
                    // 537:14: -> { new StringTemplate( $NOT.text ) }
                    {
                        retval.st =  new StringTemplate( (NOT78!=null?NOT78.getText():null) ) ;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negation"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\6\2\uffff\1\4\4\uffff\1\6\1\uffff";
    static final String DFA14_maxS =
        "\1\102\2\uffff\1\102\4\uffff\1\102\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\2\uffff\2\4\2\5\3\uffff\1\1\1\2\11\uffff\1\6\1\7\31\uffff"+
            "\1\4\11\uffff\1\4\1\uffff\1\4",
            "",
            "",
            "\3\4\2\uffff\4\4\3\uffff\2\4\2\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\1\4\1\uffff\16\4\1\10\14\uffff\1\4\6\uffff\1\4\2\uffff\1\4"+
            "\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\4\2\uffff\2\4\53\uffff\1\4\6\uffff\1\11\2\uffff\1\4\1\uffff"+
            "\1\4",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "315:3: ( return_statement | break_statement | expression | var_dec_in_block | read | write | change_type )";
        }
    }
 

    public static final BitSet FOLLOW_global_in_program106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_program110 = new BitSet(new long[]{0x1000000000007880L});
    public static final BitSet FOLLOW_fun_declaration_in_program126 = new BitSet(new long[]{0x0000000000007882L});
    public static final BitSet FOLLOW_60_in_global179 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_var_declaration_in_global181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_var_dec_in_block215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_type_in_var_declaration259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_var_declaration261 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_var_init_in_var_declaration281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_var_init362 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_var_init364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_MAIN_in_fun_declaration416 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_fun_declaration418 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_fun_declaration420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_fun_declaration429 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLEAR_LINE_in_fun_declaration431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_type_in_fun_declaration461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_fun_declaration463 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_fun_declaration465 = new BitSet(new long[]{0x4000000000001800L});
    public static final BitSet FOLLOW_arg_list_declaration_in_fun_declaration467 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_fun_declaration469 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_fun_declaration477 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLEAR_LINE_in_fun_declaration479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arg_list_declaration543 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_arg_list_declaration548 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_arg_in_arg_list_declaration554 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_var_type_in_arg584 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_arg586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call633 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_fun_call635 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_arg_list_call_in_fun_call637 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_fun_call639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_arg_list_call687 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_arg_list_call691 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_arg_list_call697 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_atom822 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_expression_in_atom824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_atom853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pow_in_atom876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqrt_in_atom889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expression924 = new BitSet(new long[]{0x000003FFE0000002L});
    public static final BitSet FOLLOW_operator_in_expression942 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_expression954 = new BitSet(new long[]{0x000003FFE0000002L});
    public static final BitSet FOLLOW_negation_in_logic_expression1008 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_logic_expression1015 = new BitSet(new long[]{0x0003FC0000000002L});
    public static final BitSet FOLLOW_logic_operator_in_logic_expression1031 = new BitSet(new long[]{0x0044000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_negation_in_logic_expression1043 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_logic_expression1054 = new BitSet(new long[]{0x0003FC0000000002L});
    public static final BitSet FOLLOW_KEY_INT_in_fun_type1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_DOUBLE_in_fun_type1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_VOID_in_fun_type1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_BOOL_in_fun_type1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block1180 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INDENT_in_block1182 = new BitSet(new long[]{0x004000001AD31E40L,0x0000000000000005L});
    public static final BitSet FOLLOW_statement_in_block1185 = new BitSet(new long[]{0x004000001AD31E50L,0x0000000000000005L});
    public static final BitSet FOLLOW_DEDENT_in_block1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_statement_in_statement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_line_statement1238 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_break_statement_in_line_statement1247 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_expression_in_line_statement1256 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_var_dec_in_block_in_line_statement1271 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_read_in_line_statement1280 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_write_in_line_statement1300 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_change_type_in_line_statement1319 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_NEWLINE_in_line_statement1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_compound_statement1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_compound_statement1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatuntil_statement_in_compound_statement1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_compound_statement1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_pow1418 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_pow1420 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_pow1425 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_pow1427 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_pow1433 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_pow1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_SQRT_in_sqrt1474 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_sqrt1476 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_sqrt1478 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_sqrt1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_RETURN_in_return_statement1509 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_return_statement1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_BREAK_in_break_statement1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_FALSE_in_bool1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_TRUE_in_bool1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_INT_in_var_type1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_DOUBLE_in_var_type1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_IF_in_if_statement1670 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_if_statement1672 = new BitSet(new long[]{0x0044000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_logic_expression_in_if_statement1674 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_if_statement1676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_if_statement1678 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_statement_in_if_statement1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_ELSE_in_else_statement1743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_else_statement1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_WHILE_in_while_statement1778 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_while_statement1780 = new BitSet(new long[]{0x0044000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_logic_expression_in_while_statement1782 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_while_statement1784 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_while_statement1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_REPEAT_in_repeatuntil_statement1824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_repeatuntil_statement1827 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEY_UNTIL_in_repeatuntil_statement1830 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_repeatuntil_statement1832 = new BitSet(new long[]{0x0044000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_logic_expression_in_repeatuntil_statement1834 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_repeatuntil_statement1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_FOR_in_for_statement1875 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_for_statement1877 = new BitSet(new long[]{0x0000000004001840L});
    public static final BitSet FOLLOW_for_first_in_for_statement1885 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1891 = new BitSet(new long[]{0x0044000004000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_logic_expression_in_for_statement1893 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1896 = new BitSet(new long[]{0x4040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_expression_in_for_statement1899 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_for_statement1902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_for_statement1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_first1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_dec_in_block_in_for_first1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_change_type2001 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_change_type2003 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_change_type2005 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_var_type_in_change_type2007 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_change_type2009 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_change_type2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_READ_in_read2059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_read2062 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_read2064 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_KEY_INT_in_read2076 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_DOUBLE_in_read2123 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_read2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_WRITE_in_write2204 = new BitSet(new long[]{0x0040000000000640L,0x0000000000000005L});
    public static final BitSet FOLLOW_atom_in_write2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_operator2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_operator2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_operator2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_operator2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_operator2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_operator2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_operator2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_operator2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_operator2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_operator2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_operator2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_operator2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_operator2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_AND_in_logic_operator2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_OR_in_logic_operator2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_logic_operator2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logic_operator2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_logic_operator2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_logic_operator2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_logic_operator2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_logic_operator2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negation2681 = new BitSet(new long[]{0x0000000000000002L});

}