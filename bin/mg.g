grammar mg;


options {
    language = Java;
    output = template;
}

tokens {
	DEDENT;
}

@lexer::header {

    import java.util.Deque;
    import java.util.LinkedList;
    import java.util.ArrayList;
}
  
@lexer::members {

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
}

@parser::members
{
	private boolean isOk = true;
	public void err(){ isOk = false;}
	public boolean isOk(){return isOk;} 
}

program
  scope
  {
    List functions;
    List globals;
    Block globalVars;
    Block funIds;
  }
  @init
  { 
    $program::functions = new ArrayList();
    $program::globals = new ArrayList();
    $program::globalVars = new Block();
    $program::funIds = new Block();
  }    
      :   (global {$program::globals.add($global.st); } NEWLINE )*  
       ( fun_declaration { 
       $program::functions.add($fun_declaration.st);
       
       } )+ 
            -> program(functions = {$program::functions}, globals = {$program::globals})
      ;

global
  : 'global' var_declaration
  {
    if(!$program::globalVars.addVar($var_declaration.Id, $var_declaration.Type, $var_declaration.Line))
    {
      System.out.println("line "+$var_declaration.Line+" multiple declaration of "+$var_declaration.Id);
      err();
     }  
  }
   -> global(init = {$var_declaration.st})
  ; 

var_dec_in_block 
   : var_declaration
   {
      if(!$program::globalVars.contains($var_declaration.Id) && !$fun_declaration::vars.contains($var_declaration.Id))
        {
 
         $fun_declaration::vars.addVar($var_declaration.Id, $var_declaration.Type, $var_declaration.Line);
        }
         else {System.out.println("line "+$var_declaration.Line+" multiple declaration of  "+$var_declaration.Id); err();}
   }
 
   -> str( value = {$var_declaration.st} )
   ;

var_declaration returns [String Id , String Type, int Line]
    :  var_type ID 
    {
    $Id = $ID.text;
    $Type = $var_type.v_type;
    $Line = $ID.line;   
   }
    
    ( var_init 
    { 
     if(!$Type.equals($var_init.Type))
      {
        System.out.println("line "+ $ID.line +" incorrect initialisation"); 
        err();
      }
     }
    )?
    
      -> var_dec( type = {$var_type.v_type}, id = {$ID.text}, init = {$var_init.st}  )  
    ;

fragment    
var_init returns [String Type] 
  : '=' atom
  {$Type = $atom.Type; }
   -> var_init(atom = {$atom.st})
  ;

fun_declaration returns [String Id, String Type, int Line]
scope
{
List args;
Block vars;
boolean needReturn;
boolean hasReturn;
}
@init
{
$fun_declaration::vars = new Block();
$fun_declaration::args = new ArrayList();
$fun_declaration::needReturn = false;
$fun_declaration::hasReturn = false;
}

  :  
   ( KEY_MAIN '(' ')'  
   {
   $Id = $KEY_MAIN.text;
   $Type = "void";
   $Line = $KEY_MAIN.line;
    if(!$program::funIds.contains($Id))
       {
           $program::funIds.addVar($fun_declaration.Id, $fun_declaration.Type, $fun_declaration.Line); 
      }
      
       else { System.out.println("line "+$fun_declaration.Line+" function "+ $fun_declaration.Id + " already exist"); err(); }
      
   
   } block CLEAR_LINE
   
    ->main(block = {$block.blocks}) )
  |
  ( fun_type ID '(' arg_list_declaration ')'  
  {
  $Id = $ID.text;
  $Type = $fun_type.funType;
   $Line = $ID.line;
   if(!$program::funIds.contains($Id))
       {
           $program::funIds.addVar($fun_declaration.Id, $fun_declaration.Type, $fun_declaration.Line); 
      }
      
       else { System.out.println("line "+$fun_declaration.Line+" function "+ $fun_declaration.Id + " already exist"); err(); }
	   if(!$Type.equals("void")){$fun_declaration::needReturn = true;}    
   
      
  } block CLEAR_LINE
  {
  	if($fun_declaration::needReturn && !$fun_declaration::hasReturn)
  {System.out.println("line "+ $ID.line+" return statement missing"); err();
  	if(!$fun_declaration::needReturn && $fun_declaration::hasReturn)
  {System.out.println("line "+ $ID.line+" return statement in void function "); 
  err();
  }
   }
   }
  
   -> functions(type = {$fun_type.funType}, id = {$ID.text}, arglist = {$fun_declaration::args}, block ={$block.blocks} ))
   ;

arg_list_declaration 
  : ( a1 = arg {$fun_declaration::args.add(a1.st); } (',' a2 = arg {$fun_declaration::args.add(a2.st);} )* )?
   ;  

fragment 
arg returns[String atype, String aid]
  : var_type ID
  { 
    $atype =  $var_type.v_type;
    $aid = $ID.text;
    
       if(!$program::globalVars.contains($aid) && !$fun_declaration::vars.contains($aid))
        {
 
         $fun_declaration::vars.addVar($aid, $atype, $ID.line);
         }
         else { System.out.println(" line "+$ID.line +" multiple decloration of  "+$aid); err();}
  }
  ->parametr(type = {$atype}, id = {$aid})
  ;

fun_call returns [String Id, int Line]
scope{List args}
@init{$fun_call::args = new ArrayList();}
  : ID '(' arg_list_call ')' {$Id = $ID.text; $Line = $ID.line;}
    ->fun_call(id = {$ID.text}, args = {$fun_call::args}) 
  ;

arg_list_call
  :  
     a = atom {$fun_call::args.add(a.st); }(',' b = atom  {$fun_call::args.add(b.st); } )*
  ;
  
atom returns[String Type, int Line]   
    : 
      (ID   
          {  
            if($program::globalVars.contains($ID.text) || $fun_declaration::vars.contains($ID.text)  )
              { 
                if($program::globalVars.contains($ID.text)){
                	$Type = $program::globalVars.getTypeOfVar($ID.text);
                }
                if($fun_declaration::vars.contains($ID.text)) {
                	$Type =  $fun_declaration::vars.getTypeOfVar($ID.text); 
                }
                $Line = $ID.line;
              } 
            else {System.out.println("line "+$ID.line+" undefined variable "+$ID.text); err(); }
          } 
      -> str(value = {$ID.text}))
    | INT  {$Type = "int"; $Line = $INT.line; } -> str(value = {$INT.text})
    | DOUBLE  {$Type = "double"; $Line = $DOUBLE.line;} -> str(value = {$DOUBLE.text})  
    | '[' expression ']' {$Type = $expression.Type; $Line = $expression.Line;} 
    	-> parren_exp(exp = {$expression.st})
    | fun_call 
    {
    if($program::funIds.contains($fun_call.Id))
    {
      $Type = $program::funIds.getTypeOfVar($fun_call.Id);
    }
    else { System.out.println(" line "+$fun_call.Line+" udefined function "+ $fun_call.Id); err();}
    }
    -> {$fun_call.st}
    | pow {$Type = "double"; $Line = $pow.Line;} ->{$pow.st}
    | sqrt {$Type = "double"; $Line = $sqrt.Line; } ->{$sqrt.st}
    ;


expression  returns[String Type, int Line, String Type2]
@init{
         List atoms = new ArrayList();
     }
   :  a = atom {$Type = $a.Type;  $Line = $a.Line;} 
   (
	   op = operator{atoms.add($op.st);  } 
	   b = atom {atoms.add($b.st); $Type2 = $b.Type;   
	   if(op.Id.equals("="))
	   {
	   if($Type.equals("double") && $Type2.equals("int")){System.out.println("line"+$a.Line +" can`t assign int to double "); err();}
	   if($Type.equals("int") && $Type2.equals("double")){System.out.println("line"+$a.Line+"can`t assign double to int" ); err();}
	   }
	    $Line = $b.Line;} 
	)*
   ->operation(left = {$a.st}, right = {atoms})
   ;

logic_expression returns[String Type, int Line , String Type2, String Operator]
@init{
        List atoms = new ArrayList();
     } 
  :  neg = negation  a = atom {$Type = $a.Type; $Line = $a.Line;} 
  (
	  op = logic_operator {atoms.add($op.st); $Operator = $op.Id ; } 
	  ntwo = negation  
	  b = atom {atoms.add($b.st); atoms.add($ntwo.st); $Type2 = $b.Type; $Line = $b.Line;} 
  )*
   ->logic_operation( neg = {$neg.st},  left = {$a.st}, right = {atoms})
  ;

fun_type  returns [String funType]  
  : KEY_INT   { $funType = "int";   } 
  | KEY_DOUBLE { $funType = "double"; }
  | KEY_VOID  { $funType = "void";  }
  | KEY_BOOL  { $funType = "boolean";  }
  ; 
  

fragment 
block returns [List blocks]
scope{List stmts}
@init{$block::stmts = new ArrayList(); $blocks = new ArrayList(); } 

  :  
   NEWLINE INDENT (statement  ) +  DEDENT { $blocks.add($block::stmts);}
  ;
  
statement
  : line_statement 
  | compound_statement 
  ;
  
line_statement
  : 
  ( return_statement  {$block::stmts.add($return_statement.st); }
  | break_statement  {$block::stmts.add($break_statement.st );}
  | expression       {$block::stmts.add($expression.st);} 
  | var_dec_in_block  {$block::stmts.add($var_dec_in_block.st); }
  | read             {$block::stmts.add($read.st); }
  | write            {$block::stmts.add($write.st); }
  | change_type     {$block::stmts.add($change_type.st); }
  ) NEWLINE?
  ;

compound_statement
  : 
  if_statement            {$block::stmts.add($if_statement.st);}
  | while_statement       {$block::stmts.add($while_statement.st);}
  | repeatuntil_statement {$block::stmts.add($repeatuntil_statement.st);}
  | for_statement         {$block::stmts.add($for_statement.st);}
  ; 


pow returns[int Line]
  : 'pow' '(' a= atom ',' b = atom ')' {$Line = $a.Line;}
  -> pow(a = {$a.st}, b = {$b.st})
  ;

sqrt  returns[String Type, int Line]
  : 'sqrt' '(' atom ')' {$Type = $atom.Type; $Line = $atom.Line;}
  ->sqrt(x = {$atom.st})
  ;

fragment return_statement
  : KEY_RETURN atom 
  {
  
    if(!$program::funIds.getLastType().equals($atom.Type))
    {
      System.out.println(" line "+ $atom.Line+" incorrect retrun type "+ $atom.Type +  $program::funIds.getLastType()); err();
    }
    
    $fun_declaration::hasReturn = true;
    
  }
  -> return(exp = {$atom.st}) 
  ;

fragment  
break_statement
  : 
     KEY_BREAK
     -> break()
  ;

bool 
      :
        KEY_FALSE -> {new StringTemplate($KEY_FALSE.text)}
      | KEY_TRUE -> {new StringTemplate($KEY_TRUE.text)}
      ;

var_type  returns[String v_type]
   :   KEY_INT {$v_type = $KEY_INT.text; }
   |   KEY_DOUBLE  {$v_type = $KEY_DOUBLE.text; }
   ;

if_statement
  :    
      KEY_IF '(' logic_expression ')' block  (  else_statement   )?
      ->if_template(expr = {$logic_expression.st}, ifblock = {$block.blocks}, elseblock = {$else_statement.st} )
  ;

fragment  
else_statement 
  :   
  KEY_ELSE  block  
  -> else_template( elseblock = {$block.blocks})
  ;

while_statement
  : 
  KEY_WHILE '(' logic_expression ')'  block
  ->while(expr = {$logic_expression.st}, block = {$block.blocks})
  ;
  
repeatuntil_statement
  : 
  KEY_REPEAT  block  KEY_UNTIL '(' logic_expression ')'
  ->dowhile(block = {$block.blocks}, expr = {$logic_expression.st})
  ;    

for_statement
  : 
  KEY_FOR '(' ( a1 = for_first  )? SEMI logic_expression? SEMI  expression? ')'  block
  -> for_template(atom1 = {$a1.st}, atom2 = {$logic_expression.st}, atom3 = {$expression.st} , block = {$block.blocks})
  ; 
   
fragment
for_first 
  : ID ->str(value = {$ID.text})
  | var_dec_in_block ->{$var_dec_in_block.st} 
  ;
  
change_type 

  : id1 = ID '=' '(' var_type ')' id2 = ID
  
  {
  if(!$program::globalVars.contains($id1.text) && !$fun_declaration::vars.contains($id1.text)  )
        { 
          {System.out.println(" line "+$id1.line+" undefined variable "+$id1.text );} err();
        }
        
   if(!$program::globalVars.contains($id2.text) && !$fun_declaration::vars.contains($id2.text)  )
        { 
          {System.out.println(" line "+$id2.line+" undefined variable "+$id2.text);} err();
        }
    if($program::globalVars.contains($id1.text))
       {
          if(!$program::globalVars.getTypeOfVar($id1.text).equals($var_type.v_type) )
          {
            System.out.println("line "+ $id1.line+" incorrect converation type"); err();
          }
       }
    if($fun_declaration::vars.contains($id1.text))
       {
          if(!$fun_declaration::vars.getTypeOfVar($id1.text).equals($var_type.v_type))
          {
            System.out.println("line "+ $id1.line+" incorrect converation type" ); err();
          }
       }   
  }
  -> change_type(idone = {$id1.text}, type = {$var_type.v_type}, idtwo = {$id2.text} );

read  : KEY_READ  ID '('  
      ( KEY_INT  
      
      {
      
       if(!$program::globalVars.contains($ID.text) && !$fun_declaration::vars.contains($ID.text)  )
        { 
          {System.out.println("line "+$ID.line+" undefined variable "+$ID.text);} err();
        }
       if($program::globalVars.contains($ID.text))
       {
          if(!$program::globalVars.getTypeOfVar($ID.text).equals("int"))
          {
            System.out.println("line "+ $ID.line+" incorrect read type" ); err();
          }
       }
       
        if($fun_declaration::vars.contains($ID.text))
       {
          if(!$fun_declaration::vars.getTypeOfVar($ID.text).equals("int"))
          {
            System.out.println("line "+ $ID.line+" incorrect read type.  "); err();
          }
       }
      }
       -> readInt( id = {$ID.text} )
      | KEY_DOUBLE 
      {
       if(!$program::globalVars.contains($ID.text) && !$fun_declaration::vars.contains($ID.text)  )
        { 
        System.out.println("line "+$ID.line+" undefined variable "+$ID.text); err();
        }
       if($program::globalVars.contains($ID.text))
       {
          if(!$program::globalVars.getTypeOfVar($ID.text).equals("double"))
          {
            System.out.println("line "+ $ID.line+" incorrect read type "); err();
          }
       }
       
        if($fun_declaration::vars.contains($ID.text))
       {
          if(!$fun_declaration::vars.getTypeOfVar($ID.text).equals("double"))
          {
            System.out.println("line "+ $ID.line+" incorrect read type."); err();
          }
       }
      }
      
      
      
      -> readDouble( id = {$ID.text} ) ) 
      ')'
      ;
      
write : KEY_WRITE  atom  
      -> write(id = {$atom.st } ) 
      ;
 
operator returns[String Id] 
        : 
         
         ( DIV   {$Id = $DIV.text; } -> { new StringTemplate( $DIV.text ) }
         | DIV_ASSIGN  {$Id = $DIV_ASSIGN.text; } -> { new StringTemplate( $DIV_ASSIGN.text ) }
         | PLUS  {$Id = $PLUS.text; } -> { new StringTemplate( $PLUS.text ) }
         | PLUS_ASSIGN {$Id = $PLUS_ASSIGN.text; } -> { new StringTemplate( $PLUS_ASSIGN.text ) }
         | INC    {$Id = $INC.text; } -> { new StringTemplate( $INC.text ) }
         | MINUS {$Id = $MINUS.text; }  -> { new StringTemplate( $MINUS.text ) }
         | MINUS_ASSIGN {$Id = $MINUS_ASSIGN.text; }  -> { new StringTemplate( $MINUS_ASSIGN.text ) }
         | DEC   {$Id = $DEC.text; } -> { new StringTemplate( $DEC.text ) }
         | STAR {$Id = $STAR.text; }  -> { new StringTemplate( $STAR.text ) }
         | STAR_ASSIGN {$Id = $STAR_ASSIGN.text; } -> { new StringTemplate( $STAR_ASSIGN.text ) }
         | MOD   {$Id = $MOD.text; }  -> { new StringTemplate( $MOD.text ) }
         | MOD_ASSIGN  {$Id = $MOD_ASSIGN.text; }  -> { new StringTemplate( $MOD_ASSIGN.text ) }
         | ASSIGN  {$Id = $ASSIGN.text; } ->{ new StringTemplate( $ASSIGN.text ) } )
        ;

logic_operator returns[String Id]
   :
    KEY_AND {$Id = $KEY_AND.text; } -> { new StringTemplate( $KEY_AND.text ) }
   | KEY_OR  {$Id = $KEY_OR.text; } -> { new StringTemplate( $KEY_OR.text ) }
   | EQUAL {$Id = $EQUAL.text; } -> { new StringTemplate( $EQUAL.text ) }
   | NOT_EQUAL {$Id = $NOT_EQUAL.text; } -> { new StringTemplate( $NOT_EQUAL.text ) }
   | GE {$Id = $GE.text; } -> { new StringTemplate( $GE.text ) }
   | GT {$Id = $GT.text; } -> { new StringTemplate( $GT.text ) }
   | LE {$Id = $LE.text; } -> { new StringTemplate( $LE.text ) }
   | LT {$Id = $LT.text; } -> { new StringTemplate( $LT.text ) }
   ;
      
fragment
negation 
  :  (NOT    -> { new StringTemplate( $NOT.text ) } )?  ;

  
NEWLINE : '\n';
    
TAB   : '\t';
 
DEDENT: ; 

SEMI : ';' ;
  
KEY_PRINT :'print' ;

KEY_POW : 'power';

KEY_SQRT  : 'sqrt'; 

KEY_READ : 'read' ;

KEY_WRITE: 'write' ; 

KEY_WHILE : 'while' ;

KEY_UNTIL:  'until';

KEY_REPEAT : 'repeat' ;

KEY_FOR : 'for' ;

KEY_IF : 'if'; 

KEY_ELSE: 'else' ; 

KEY_INT: 'int' ;

KEY_DOUBLE : 'double' ;

KEY_BOOL: 'bool' ;

KEY_VOID: 'void';

KEY_RETURN: 'return';

KEY_BREAK : 'break';

KEY_OR: '||';

KEY_AND: '&&';

KEY_CONST: 'const';

KEY_FALSE : 'false';

KEY_TRUE: 'true';

KEY_MAIN : 'main' ;

ASSIGN : '=' ;

EQUAL   : '==' ;

NOT    : '!' ;

NOT_EQUAL : '!=';

DIV   : '/';

DIV_ASSIGN  : '/=';

PLUS    : '+' ;

PLUS_ASSIGN : '+=' ;

INC   : '++'   ;

MINUS   : '-'  ;

MINUS_ASSIGN  : '-='  ;

DEC   : '--'   ;

STAR   : '*' ;

STAR_ASSIGN : '*=' ;

MOD   : '%'  ;

MOD_ASSIGN  : '%='  ;

GE  : '>='  ;

GT  : '>'   ;

LE  : '<='  ;
  
LT  : '<'   ;

fragment
DIGIT : '0'..'9' ;

fragment
LETTER : 'a'..'z'|'A'..'Z';
 
ID  : LETTER (LETTER|DIGIT|'_')* ;

INT : DIGIT+ ;

DOUBLE    :   DIGIT+ '.' DIGIT+ ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ; 

WS  :    (' '  | '\r')  {$channel=HIDDEN;} ;


INDENT 
@init{  curLevel=0; }
    :
    {
        getCharPositionInLine()==0}? => ({curLevel++; } TAB)+
        {
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
    ;

CLEAR_LINE
    :  {getCharPositionInLine()==1 || getCharPositionInLine()==0 }?=> NEWLINE 
    {
         if(levels.peek().intValue()!=0) 
          {
            while(levels.peek()!=0) 
             {
	            levels.pop();
    	        emit(new ClassicToken(DEDENT, "DEDENT"));
             }
          }
    }
    ; 
