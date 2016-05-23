    import java.util.Deque;
    import java.util.LinkedList;
    import java.util.ArrayList;
	import org.antlr.runtime.*;
	import java.util.Stack;
	import java.util.List;
	import java.util.ArrayList;

public class mgLexer extends Lexer {
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


        int curLevel = 0;
        int prevLevel = 0;
        int startPos = 0;
        ClassicToken token = null;
        
        Stack<Integer> levels = new Stack<Integer>();
        Deque<Token> tokens = new java.util.ArrayDeque<Token>();
     
        @Override
        public void emit(Token token) {
            state.token = token;
            tokens.addLast(token);
        }
     
        @Override
        public Token nextToken() {
            super.nextToken();
      
            if (tokens.isEmpty())
                return Token.EOF_TOKEN;
            return tokens.removeFirst();
        }


    // delegates
    // delegators

    public mgLexer() {;} 
    public mgLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public mgLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\WORK\\mg\\src\\mg.g"; }

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:39:7: ( 'global' )
            // D:\\WORK\\mg\\src\\mg.g:39:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:40:7: ( '(' )
            // D:\\WORK\\mg\\src\\mg.g:40:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:41:7: ( ')' )
            // D:\\WORK\\mg\\src\\mg.g:41:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:42:7: ( ',' )
            // D:\\WORK\\mg\\src\\mg.g:42:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:43:7: ( '[' )
            // D:\\WORK\\mg\\src\\mg.g:43:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:44:7: ( ']' )
            // D:\\WORK\\mg\\src\\mg.g:44:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:45:7: ( 'pow' )
            // D:\\WORK\\mg\\src\\mg.g:45:9: 'pow'
            {
            match("pow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:540:9: ( '\\n' )
            // D:\\WORK\\mg\\src\\mg.g:540:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "TAB"
    public final void mTAB() throws RecognitionException {
        try {
            int _type = TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:542:7: ( '\\t' )
            // D:\\WORK\\mg\\src\\mg.g:542:9: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAB"

    // $ANTLR start "DEDENT"
    public final void mDEDENT() throws RecognitionException {
        try {
            int _type = DEDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:544:7: ()
            // D:\\WORK\\mg\\src\\mg.g:544:9: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEDENT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:546:6: ( ';' )
            // D:\\WORK\\mg\\src\\mg.g:546:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "KEY_PRINT"
    public final void mKEY_PRINT() throws RecognitionException {
        try {
            int _type = KEY_PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:548:11: ( 'print' )
            // D:\\WORK\\mg\\src\\mg.g:548:12: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_PRINT"

    // $ANTLR start "KEY_POW"
    public final void mKEY_POW() throws RecognitionException {
        try {
            int _type = KEY_POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:550:9: ( 'power' )
            // D:\\WORK\\mg\\src\\mg.g:550:11: 'power'
            {
            match("power"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_POW"

    // $ANTLR start "KEY_SQRT"
    public final void mKEY_SQRT() throws RecognitionException {
        try {
            int _type = KEY_SQRT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:552:11: ( 'sqrt' )
            // D:\\WORK\\mg\\src\\mg.g:552:13: 'sqrt'
            {
            match("sqrt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_SQRT"

    // $ANTLR start "KEY_READ"
    public final void mKEY_READ() throws RecognitionException {
        try {
            int _type = KEY_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:554:10: ( 'read' )
            // D:\\WORK\\mg\\src\\mg.g:554:12: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_READ"

    // $ANTLR start "KEY_WRITE"
    public final void mKEY_WRITE() throws RecognitionException {
        try {
            int _type = KEY_WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:556:10: ( 'write' )
            // D:\\WORK\\mg\\src\\mg.g:556:12: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_WRITE"

    // $ANTLR start "KEY_WHILE"
    public final void mKEY_WHILE() throws RecognitionException {
        try {
            int _type = KEY_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:558:11: ( 'while' )
            // D:\\WORK\\mg\\src\\mg.g:558:13: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_WHILE"

    // $ANTLR start "KEY_UNTIL"
    public final void mKEY_UNTIL() throws RecognitionException {
        try {
            int _type = KEY_UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:560:10: ( 'until' )
            // D:\\WORK\\mg\\src\\mg.g:560:13: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_UNTIL"

    // $ANTLR start "KEY_REPEAT"
    public final void mKEY_REPEAT() throws RecognitionException {
        try {
            int _type = KEY_REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:562:12: ( 'repeat' )
            // D:\\WORK\\mg\\src\\mg.g:562:14: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_REPEAT"

    // $ANTLR start "KEY_FOR"
    public final void mKEY_FOR() throws RecognitionException {
        try {
            int _type = KEY_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:564:9: ( 'for' )
            // D:\\WORK\\mg\\src\\mg.g:564:11: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_FOR"

    // $ANTLR start "KEY_IF"
    public final void mKEY_IF() throws RecognitionException {
        try {
            int _type = KEY_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:566:8: ( 'if' )
            // D:\\WORK\\mg\\src\\mg.g:566:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_IF"

    // $ANTLR start "KEY_ELSE"
    public final void mKEY_ELSE() throws RecognitionException {
        try {
            int _type = KEY_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:568:9: ( 'else' )
            // D:\\WORK\\mg\\src\\mg.g:568:11: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_ELSE"

    // $ANTLR start "KEY_INT"
    public final void mKEY_INT() throws RecognitionException {
        try {
            int _type = KEY_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:570:8: ( 'int' )
            // D:\\WORK\\mg\\src\\mg.g:570:10: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_INT"

    // $ANTLR start "KEY_DOUBLE"
    public final void mKEY_DOUBLE() throws RecognitionException {
        try {
            int _type = KEY_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:572:12: ( 'double' )
            // D:\\WORK\\mg\\src\\mg.g:572:14: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_DOUBLE"

    // $ANTLR start "KEY_BOOL"
    public final void mKEY_BOOL() throws RecognitionException {
        try {
            int _type = KEY_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:574:9: ( 'bool' )
            // D:\\WORK\\mg\\src\\mg.g:574:11: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_BOOL"

    // $ANTLR start "KEY_VOID"
    public final void mKEY_VOID() throws RecognitionException {
        try {
            int _type = KEY_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:576:9: ( 'void' )
            // D:\\WORK\\mg\\src\\mg.g:576:11: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_VOID"

    // $ANTLR start "KEY_RETURN"
    public final void mKEY_RETURN() throws RecognitionException {
        try {
            int _type = KEY_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:578:11: ( 'return' )
            // D:\\WORK\\mg\\src\\mg.g:578:13: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_RETURN"

    // $ANTLR start "KEY_BREAK"
    public final void mKEY_BREAK() throws RecognitionException {
        try {
            int _type = KEY_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:580:11: ( 'break' )
            // D:\\WORK\\mg\\src\\mg.g:580:13: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_BREAK"

    // $ANTLR start "KEY_OR"
    public final void mKEY_OR() throws RecognitionException {
        try {
            int _type = KEY_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:582:7: ( '||' )
            // D:\\WORK\\mg\\src\\mg.g:582:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_OR"

    // $ANTLR start "KEY_AND"
    public final void mKEY_AND() throws RecognitionException {
        try {
            int _type = KEY_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:584:8: ( '&&' )
            // D:\\WORK\\mg\\src\\mg.g:584:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_AND"

    // $ANTLR start "KEY_CONST"
    public final void mKEY_CONST() throws RecognitionException {
        try {
            int _type = KEY_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:586:10: ( 'const' )
            // D:\\WORK\\mg\\src\\mg.g:586:12: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_CONST"

    // $ANTLR start "KEY_FALSE"
    public final void mKEY_FALSE() throws RecognitionException {
        try {
            int _type = KEY_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:588:11: ( 'false' )
            // D:\\WORK\\mg\\src\\mg.g:588:13: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_FALSE"

    // $ANTLR start "KEY_TRUE"
    public final void mKEY_TRUE() throws RecognitionException {
        try {
            int _type = KEY_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:590:9: ( 'true' )
            // D:\\WORK\\mg\\src\\mg.g:590:11: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_TRUE"

    // $ANTLR start "KEY_MAIN"
    public final void mKEY_MAIN() throws RecognitionException {
        try {
            int _type = KEY_MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:592:10: ( 'main' )
            // D:\\WORK\\mg\\src\\mg.g:592:12: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_MAIN"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:594:8: ( '=' )
            // D:\\WORK\\mg\\src\\mg.g:594:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:596:9: ( '==' )
            // D:\\WORK\\mg\\src\\mg.g:596:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:598:8: ( '!' )
            // D:\\WORK\\mg\\src\\mg.g:598:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:600:11: ( '!=' )
            // D:\\WORK\\mg\\src\\mg.g:600:13: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:602:7: ( '/' )
            // D:\\WORK\\mg\\src\\mg.g:602:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DIV_ASSIGN"
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:604:13: ( '/=' )
            // D:\\WORK\\mg\\src\\mg.g:604:15: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV_ASSIGN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:606:9: ( '+' )
            // D:\\WORK\\mg\\src\\mg.g:606:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PLUS_ASSIGN"
    public final void mPLUS_ASSIGN() throws RecognitionException {
        try {
            int _type = PLUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:608:13: ( '+=' )
            // D:\\WORK\\mg\\src\\mg.g:608:15: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_ASSIGN"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:610:7: ( '++' )
            // D:\\WORK\\mg\\src\\mg.g:610:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:612:9: ( '-' )
            // D:\\WORK\\mg\\src\\mg.g:612:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MINUS_ASSIGN"
    public final void mMINUS_ASSIGN() throws RecognitionException {
        try {
            int _type = MINUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:614:15: ( '-=' )
            // D:\\WORK\\mg\\src\\mg.g:614:17: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_ASSIGN"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:616:7: ( '--' )
            // D:\\WORK\\mg\\src\\mg.g:616:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:618:8: ( '*' )
            // D:\\WORK\\mg\\src\\mg.g:618:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "STAR_ASSIGN"
    public final void mSTAR_ASSIGN() throws RecognitionException {
        try {
            int _type = STAR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:620:13: ( '*=' )
            // D:\\WORK\\mg\\src\\mg.g:620:15: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR_ASSIGN"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:622:7: ( '%' )
            // D:\\WORK\\mg\\src\\mg.g:622:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MOD_ASSIGN"
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:624:13: ( '%=' )
            // D:\\WORK\\mg\\src\\mg.g:624:15: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD_ASSIGN"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:626:5: ( '>=' )
            // D:\\WORK\\mg\\src\\mg.g:626:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:628:5: ( '>' )
            // D:\\WORK\\mg\\src\\mg.g:628:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:630:5: ( '<=' )
            // D:\\WORK\\mg\\src\\mg.g:630:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:632:5: ( '<' )
            // D:\\WORK\\mg\\src\\mg.g:632:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\WORK\\mg\\src\\mg.g:635:7: ( '0' .. '9' )
            // D:\\WORK\\mg\\src\\mg.g:635:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // D:\\WORK\\mg\\src\\mg.g:638:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // D:\\WORK\\mg\\src\\mg.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:640:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // D:\\WORK\\mg\\src\\mg.g:640:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // D:\\WORK\\mg\\src\\mg.g:640:14: ( LETTER | DIGIT | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:642:5: ( ( DIGIT )+ )
            // D:\\WORK\\mg\\src\\mg.g:642:7: ( DIGIT )+
            {
            // D:\\WORK\\mg\\src\\mg.g:642:7: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:642:7: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:644:11: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // D:\\WORK\\mg\\src\\mg.g:644:15: ( DIGIT )+ '.' ( DIGIT )+
            {
            // D:\\WORK\\mg\\src\\mg.g:644:15: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:644:15: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            // D:\\WORK\\mg\\src\\mg.g:644:26: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:644:26: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:647:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\WORK\\mg\\src\\mg.g:647:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\WORK\\mg\\src\\mg.g:647:14: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\WORK\\mg\\src\\mg.g:647:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // D:\\WORK\\mg\\src\\mg.g:647:28: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\WORK\\mg\\src\\mg.g:647:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\WORK\\mg\\src\\mg.g:648:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\WORK\\mg\\src\\mg.g:648:14: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\WORK\\mg\\src\\mg.g:648:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:651:5: ( ( ' ' | '\\r' ) )
            // D:\\WORK\\mg\\src\\mg.g:651:10: ( ' ' | '\\r' )
            {
            if ( input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
              curLevel=0; 
            // D:\\WORK\\mg\\src\\mg.g:656:5: ({...}? => ( TAB )+ )
            // D:\\WORK\\mg\\src\\mg.g:657:5: {...}? => ( TAB )+
            {
            if ( !((
                    getCharPositionInLine()==0)) ) {
                throw new FailedPredicateException(input, "INDENT", "\r\n        getCharPositionInLine()==0");
            }
            // D:\\WORK\\mg\\src\\mg.g:658:41: ( TAB )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\WORK\\mg\\src\\mg.g:658:42: TAB
            	    {
            	    curLevel++; 
            	    mTAB(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


                        if (levels.empty()) 
                        {levels.push(0);}
                        if (curLevel > levels.peek().intValue())
                           {
                               emit(new ClassicToken(INDENT,"INDENT"));
                               levels.push(curLevel);
                           } 
              
                        if(curLevel < levels.peek().intValue())
                           {
                               while (curLevel < levels.peek().intValue()) 
                                  {
                                     levels.pop();
                                     emit(new ClassicToken(DEDENT,"DEDENT"));
                                  }
                           }
                        if(curLevel == levels.peek().intValue()) { 
                        skip(); 
                    }
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDENT"

    // $ANTLR start "CLEAR_LINE"
    public final void mCLEAR_LINE() throws RecognitionException {
        try {
            int _type = CLEAR_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WORK\\mg\\src\\mg.g:683:5: ({...}? => NEWLINE )
            // D:\\WORK\\mg\\src\\mg.g:683:8: {...}? => NEWLINE
            {
            if ( !((getCharPositionInLine()==1 || getCharPositionInLine()==0 )) ) {
                throw new FailedPredicateException(input, "CLEAR_LINE", "getCharPositionInLine()==1 || getCharPositionInLine()==0 ");
            }
            mNEWLINE(); 

                     if(levels.peek().intValue()!=0) 
                      {
                        while(levels.peek()!=0) 
                         {
            	            levels.pop();
                	        emit(new ClassicToken(DEDENT, "DEDENT"));
                         }
                      }
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLEAR_LINE"

    public void mTokens() throws RecognitionException {
        // D:\\WORK\\mg\\src\\mg.g:1:8: ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | NEWLINE | TAB | DEDENT | SEMI | KEY_PRINT | KEY_POW | KEY_SQRT | KEY_READ | KEY_WRITE | KEY_WHILE | KEY_UNTIL | KEY_REPEAT | KEY_FOR | KEY_IF | KEY_ELSE | KEY_INT | KEY_DOUBLE | KEY_BOOL | KEY_VOID | KEY_RETURN | KEY_BREAK | KEY_OR | KEY_AND | KEY_CONST | KEY_FALSE | KEY_TRUE | KEY_MAIN | ASSIGN | EQUAL | NOT | NOT_EQUAL | DIV | DIV_ASSIGN | PLUS | PLUS_ASSIGN | INC | MINUS | MINUS_ASSIGN | DEC | STAR | STAR_ASSIGN | MOD | MOD_ASSIGN | GE | GT | LE | LT | ID | INT | DOUBLE | COMMENT | WS | INDENT | CLEAR_LINE )
        int alt10=61;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // D:\\WORK\\mg\\src\\mg.g:1:10: T__60
                {
                mT__60(); 

                }
                break;
            case 2 :
                // D:\\WORK\\mg\\src\\mg.g:1:16: T__61
                {
                mT__61(); 

                }
                break;
            case 3 :
                // D:\\WORK\\mg\\src\\mg.g:1:22: T__62
                {
                mT__62(); 

                }
                break;
            case 4 :
                // D:\\WORK\\mg\\src\\mg.g:1:28: T__63
                {
                mT__63(); 

                }
                break;
            case 5 :
                // D:\\WORK\\mg\\src\\mg.g:1:34: T__64
                {
                mT__64(); 

                }
                break;
            case 6 :
                // D:\\WORK\\mg\\src\\mg.g:1:40: T__65
                {
                mT__65(); 

                }
                break;
            case 7 :
                // D:\\WORK\\mg\\src\\mg.g:1:46: T__66
                {
                mT__66(); 

                }
                break;
            case 8 :
                // D:\\WORK\\mg\\src\\mg.g:1:52: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 9 :
                // D:\\WORK\\mg\\src\\mg.g:1:60: TAB
                {
                mTAB(); 

                }
                break;
            case 10 :
                // D:\\WORK\\mg\\src\\mg.g:1:64: DEDENT
                {
                mDEDENT(); 

                }
                break;
            case 11 :
                // D:\\WORK\\mg\\src\\mg.g:1:71: SEMI
                {
                mSEMI(); 

                }
                break;
            case 12 :
                // D:\\WORK\\mg\\src\\mg.g:1:76: KEY_PRINT
                {
                mKEY_PRINT(); 

                }
                break;
            case 13 :
                // D:\\WORK\\mg\\src\\mg.g:1:86: KEY_POW
                {
                mKEY_POW(); 

                }
                break;
            case 14 :
                // D:\\WORK\\mg\\src\\mg.g:1:94: KEY_SQRT
                {
                mKEY_SQRT(); 

                }
                break;
            case 15 :
                // D:\\WORK\\mg\\src\\mg.g:1:103: KEY_READ
                {
                mKEY_READ(); 

                }
                break;
            case 16 :
                // D:\\WORK\\mg\\src\\mg.g:1:112: KEY_WRITE
                {
                mKEY_WRITE(); 

                }
                break;
            case 17 :
                // D:\\WORK\\mg\\src\\mg.g:1:122: KEY_WHILE
                {
                mKEY_WHILE(); 

                }
                break;
            case 18 :
                // D:\\WORK\\mg\\src\\mg.g:1:132: KEY_UNTIL
                {
                mKEY_UNTIL(); 

                }
                break;
            case 19 :
                // D:\\WORK\\mg\\src\\mg.g:1:142: KEY_REPEAT
                {
                mKEY_REPEAT(); 

                }
                break;
            case 20 :
                // D:\\WORK\\mg\\src\\mg.g:1:153: KEY_FOR
                {
                mKEY_FOR(); 

                }
                break;
            case 21 :
                // D:\\WORK\\mg\\src\\mg.g:1:161: KEY_IF
                {
                mKEY_IF(); 

                }
                break;
            case 22 :
                // D:\\WORK\\mg\\src\\mg.g:1:168: KEY_ELSE
                {
                mKEY_ELSE(); 

                }
                break;
            case 23 :
                // D:\\WORK\\mg\\src\\mg.g:1:177: KEY_INT
                {
                mKEY_INT(); 

                }
                break;
            case 24 :
                // D:\\WORK\\mg\\src\\mg.g:1:185: KEY_DOUBLE
                {
                mKEY_DOUBLE(); 

                }
                break;
            case 25 :
                // D:\\WORK\\mg\\src\\mg.g:1:196: KEY_BOOL
                {
                mKEY_BOOL(); 

                }
                break;
            case 26 :
                // D:\\WORK\\mg\\src\\mg.g:1:205: KEY_VOID
                {
                mKEY_VOID(); 

                }
                break;
            case 27 :
                // D:\\WORK\\mg\\src\\mg.g:1:214: KEY_RETURN
                {
                mKEY_RETURN(); 

                }
                break;
            case 28 :
                // D:\\WORK\\mg\\src\\mg.g:1:225: KEY_BREAK
                {
                mKEY_BREAK(); 

                }
                break;
            case 29 :
                // D:\\WORK\\mg\\src\\mg.g:1:235: KEY_OR
                {
                mKEY_OR(); 

                }
                break;
            case 30 :
                // D:\\WORK\\mg\\src\\mg.g:1:242: KEY_AND
                {
                mKEY_AND(); 

                }
                break;
            case 31 :
                // D:\\WORK\\mg\\src\\mg.g:1:250: KEY_CONST
                {
                mKEY_CONST(); 

                }
                break;
            case 32 :
                // D:\\WORK\\mg\\src\\mg.g:1:260: KEY_FALSE
                {
                mKEY_FALSE(); 

                }
                break;
            case 33 :
                // D:\\WORK\\mg\\src\\mg.g:1:270: KEY_TRUE
                {
                mKEY_TRUE(); 

                }
                break;
            case 34 :
                // D:\\WORK\\mg\\src\\mg.g:1:279: KEY_MAIN
                {
                mKEY_MAIN(); 

                }
                break;
            case 35 :
                // D:\\WORK\\mg\\src\\mg.g:1:288: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 36 :
                // D:\\WORK\\mg\\src\\mg.g:1:295: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 37 :
                // D:\\WORK\\mg\\src\\mg.g:1:301: NOT
                {
                mNOT(); 

                }
                break;
            case 38 :
                // D:\\WORK\\mg\\src\\mg.g:1:305: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 39 :
                // D:\\WORK\\mg\\src\\mg.g:1:315: DIV
                {
                mDIV(); 

                }
                break;
            case 40 :
                // D:\\WORK\\mg\\src\\mg.g:1:319: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 

                }
                break;
            case 41 :
                // D:\\WORK\\mg\\src\\mg.g:1:330: PLUS
                {
                mPLUS(); 

                }
                break;
            case 42 :
                // D:\\WORK\\mg\\src\\mg.g:1:335: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 

                }
                break;
            case 43 :
                // D:\\WORK\\mg\\src\\mg.g:1:347: INC
                {
                mINC(); 

                }
                break;
            case 44 :
                // D:\\WORK\\mg\\src\\mg.g:1:351: MINUS
                {
                mMINUS(); 

                }
                break;
            case 45 :
                // D:\\WORK\\mg\\src\\mg.g:1:357: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 

                }
                break;
            case 46 :
                // D:\\WORK\\mg\\src\\mg.g:1:370: DEC
                {
                mDEC(); 

                }
                break;
            case 47 :
                // D:\\WORK\\mg\\src\\mg.g:1:374: STAR
                {
                mSTAR(); 

                }
                break;
            case 48 :
                // D:\\WORK\\mg\\src\\mg.g:1:379: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 

                }
                break;
            case 49 :
                // D:\\WORK\\mg\\src\\mg.g:1:391: MOD
                {
                mMOD(); 

                }
                break;
            case 50 :
                // D:\\WORK\\mg\\src\\mg.g:1:395: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 

                }
                break;
            case 51 :
                // D:\\WORK\\mg\\src\\mg.g:1:406: GE
                {
                mGE(); 

                }
                break;
            case 52 :
                // D:\\WORK\\mg\\src\\mg.g:1:409: GT
                {
                mGT(); 

                }
                break;
            case 53 :
                // D:\\WORK\\mg\\src\\mg.g:1:412: LE
                {
                mLE(); 

                }
                break;
            case 54 :
                // D:\\WORK\\mg\\src\\mg.g:1:415: LT
                {
                mLT(); 

                }
                break;
            case 55 :
                // D:\\WORK\\mg\\src\\mg.g:1:418: ID
                {
                mID(); 

                }
                break;
            case 56 :
                // D:\\WORK\\mg\\src\\mg.g:1:421: INT
                {
                mINT(); 

                }
                break;
            case 57 :
                // D:\\WORK\\mg\\src\\mg.g:1:425: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 58 :
                // D:\\WORK\\mg\\src\\mg.g:1:432: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 59 :
                // D:\\WORK\\mg\\src\\mg.g:1:440: WS
                {
                mWS(); 

                }
                break;
            case 60 :
                // D:\\WORK\\mg\\src\\mg.g:1:443: INDENT
                {
                mINDENT(); 

                }
                break;
            case 61 :
                // D:\\WORK\\mg\\src\\mg.g:1:450: CLEAR_LINE
                {
                mCLEAR_LINE(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\12\1\44\5\uffff\1\44\1\52\1\53\2\uffff\12\44\2\uffff\3\44\1"+
        "\77\1\101\1\104\1\107\1\112\1\114\1\116\1\120\1\122\1\uffff\1\123"+
        "\1\uffff\3\44\3\uffff\7\44\1\144\11\44\27\uffff\1\44\1\160\1\44"+
        "\3\uffff\7\44\1\171\1\44\1\uffff\1\173\12\44\1\uffff\1\44\1\u0087"+
        "\1\u0088\5\44\1\uffff\1\44\1\uffff\1\u008f\1\44\1\u0091\1\44\1\u0093"+
        "\1\44\1\u0095\1\u0096\1\44\1\u0098\1\u0099\2\uffff\2\44\1\u009c"+
        "\1\u009d\1\u009e\1\u009f\1\uffff\1\44\1\uffff\1\u00a1\1\uffff\1"+
        "\u00a2\2\uffff\1\u00a3\2\uffff\1\u00a4\1\u00a5\4\uffff\1\u00a6\6"+
        "\uffff";
    static final String DFA10_eofS =
        "\u00a7\uffff";
    static final String DFA10_minS =
        "\1\11\1\154\5\uffff\1\157\1\0\1\11\2\uffff\1\161\1\145\1\150\1"+
        "\156\1\141\1\146\1\154\3\157\2\uffff\1\157\1\162\1\141\2\75\1\52"+
        "\1\53\1\55\4\75\1\uffff\1\56\1\uffff\1\157\1\167\1\151\2\0\1\uffff"+
        "\1\162\1\141\2\151\1\164\1\162\1\154\1\60\1\164\1\163\1\165\1\157"+
        "\1\145\1\151\1\156\1\165\1\151\27\uffff\1\142\1\60\1\156\3\uffff"+
        "\1\164\1\144\1\145\1\165\1\164\1\154\1\151\1\60\1\163\1\uffff\1"+
        "\60\1\145\1\142\1\154\1\141\1\144\1\163\1\145\1\156\1\141\1\162"+
        "\1\uffff\1\164\2\60\1\141\1\162\2\145\1\154\1\uffff\1\145\1\uffff"+
        "\1\60\1\154\1\60\1\153\1\60\1\164\2\60\1\154\2\60\2\uffff\1\164"+
        "\1\156\4\60\1\uffff\1\145\1\uffff\1\60\1\uffff\1\60\2\uffff\1\60"+
        "\2\uffff\2\60\4\uffff\1\60\6\uffff";
    static final String DFA10_maxS =
        "\1\174\1\154\5\uffff\1\162\1\0\1\11\2\uffff\1\161\1\145\1\162\1"+
        "\156\1\157\1\156\1\154\1\157\1\162\1\157\2\uffff\1\157\1\162\1\141"+
        "\11\75\1\uffff\1\71\1\uffff\1\157\1\167\1\151\2\0\1\uffff\1\162"+
        "\1\164\2\151\1\164\1\162\1\154\1\172\1\164\1\163\1\165\1\157\1\145"+
        "\1\151\1\156\1\165\1\151\27\uffff\1\142\1\172\1\156\3\uffff\1\164"+
        "\1\144\1\145\1\165\1\164\1\154\1\151\1\172\1\163\1\uffff\1\172\1"+
        "\145\1\142\1\154\1\141\1\144\1\163\1\145\1\156\1\141\1\162\1\uffff"+
        "\1\164\2\172\1\141\1\162\2\145\1\154\1\uffff\1\145\1\uffff\1\172"+
        "\1\154\1\172\1\153\1\172\1\164\2\172\1\154\2\172\2\uffff\1\164\1"+
        "\156\4\172\1\uffff\1\145\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172"+
        "\2\uffff\2\172\4\uffff\1\172\6\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\3\uffff\1\12\1\13\12\uffff\1\35\1"+
        "\36\14\uffff\1\67\1\uffff\1\73\5\uffff\1\74\21\uffff\1\44\1\43\1"+
        "\46\1\45\1\50\1\72\1\47\1\52\1\53\1\51\1\55\1\56\1\54\1\60\1\57"+
        "\1\62\1\61\1\63\1\64\1\65\1\66\1\70\1\71\3\uffff\1\10\1\75\1\11"+
        "\11\uffff\1\25\13\uffff\1\7\10\uffff\1\24\1\uffff\1\27\13\uffff"+
        "\1\16\1\17\6\uffff\1\26\1\uffff\1\31\1\uffff\1\32\1\uffff\1\41\1"+
        "\42\1\uffff\1\15\1\14\2\uffff\1\20\1\21\1\22\1\40\1\uffff\1\34\1"+
        "\37\1\1\1\23\1\33\1\30";
    static final String DFA10_specialS =
        "\11\uffff\1\0\40\uffff\1\2\1\1\173\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\11\1\10\2\uffff\1\46\22\uffff\1\46\1\34\3\uffff\1\41\1\27"+
            "\1\uffff\1\2\1\3\1\40\1\36\1\4\1\37\1\uffff\1\35\12\45\1\uffff"+
            "\1\13\1\43\1\33\1\42\2\uffff\32\44\1\5\1\uffff\1\6\3\uffff\1"+
            "\44\1\24\1\30\1\23\1\22\1\20\1\1\1\44\1\21\3\44\1\32\2\44\1"+
            "\7\1\44\1\15\1\14\1\31\1\17\1\25\1\16\3\44\1\uffff\1\26",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "\1\50\2\uffff\1\51",
            "\1\uffff",
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\60\11\uffff\1\57",
            "\1\61",
            "\1\63\15\uffff\1\62",
            "\1\64\7\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70\2\uffff\1\71",
            "\1\72",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100",
            "\1\103\4\uffff\1\103\15\uffff\1\102",
            "\1\106\21\uffff\1\105",
            "\1\111\17\uffff\1\110",
            "\1\113",
            "\1\115",
            "\1\117",
            "\1\121",
            "",
            "\1\124\1\uffff\12\45",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\133",
            "\1\134\16\uffff\1\135\3\uffff\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\157\25\44",
            "\1\161",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\172",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0090",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0092",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0094",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0097",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00a0",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | NEWLINE | TAB | DEDENT | SEMI | KEY_PRINT | KEY_POW | KEY_SQRT | KEY_READ | KEY_WRITE | KEY_WHILE | KEY_UNTIL | KEY_REPEAT | KEY_FOR | KEY_IF | KEY_ELSE | KEY_INT | KEY_DOUBLE | KEY_BOOL | KEY_VOID | KEY_RETURN | KEY_BREAK | KEY_OR | KEY_AND | KEY_CONST | KEY_FALSE | KEY_TRUE | KEY_MAIN | ASSIGN | EQUAL | NOT | NOT_EQUAL | DIV | DIV_ASSIGN | PLUS | PLUS_ASSIGN | INC | MINUS | MINUS_ASSIGN | DEC | STAR | STAR_ASSIGN | MOD | MOD_ASSIGN | GE | GT | LE | LT | ID | INT | DOUBLE | COMMENT | WS | INDENT | CLEAR_LINE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_9=='\t') && ((
                                getCharPositionInLine()==0))) {s = 44;}

                        else s = 43;

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_43 = input.LA(1);

                         
                        int index10_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((
                                getCharPositionInLine()==0)))) ) {s = 90;}

                        else if ( ((
                                getCharPositionInLine()==0)) ) {s = 44;}

                         
                        input.seek(index10_43);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_42 = input.LA(1);

                         
                        int index10_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((getCharPositionInLine()==1 || getCharPositionInLine()==0 )))) ) {s = 88;}

                        else if ( ((getCharPositionInLine()==1 || getCharPositionInLine()==0 )) ) {s = 89;}

                         
                        input.seek(index10_42);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}