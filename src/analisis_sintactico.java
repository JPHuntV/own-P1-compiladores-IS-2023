
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package src;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class analisis_sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public analisis_sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public analisis_sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public analisis_sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\004\000\002\003\004\000\002\003\005" +
    "\000\002\005\011\000\002\004\004\000\002\004\003\000" +
    "\002\004\003\000\002\011\003\000\002\012\003\000\002" +
    "\012\003\000\002\012\003\000\002\017\003\000\002\014" +
    "\005\000\002\014\005\000\002\014\005\000\002\014\005" +
    "\000\002\014\005\000\002\014\003\000\002\020\003\000" +
    "\002\021\003\000\002\022\003\000\002\022\004\000\002" +
    "\023\005\000\002\023\005\000\002\023\005\000\002\024" +
    "\003\000\002\024\003\000\002\025\003\000\002\025\003" +
    "\000\002\025\003\000\002\025\003\000\002\025\003\000" +
    "\002\025\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\020\000\006\014\006\076\004\001\002\000\016\002" +
    "\uffed\013\uffed\015\uffed\016\uffed\020\uffed\037\uffed\001\002" +
    "\000\014\002\000\013\013\016\015\020\014\037\016\001" +
    "\002\000\006\014\006\076\004\001\002\000\004\002\010" +
    "\001\002\000\004\002\001\001\002\000\014\013\013\015" +
    "\012\016\015\020\014\037\016\001\002\000\016\002\uffee" +
    "\013\uffee\015\uffee\016\uffee\020\uffee\037\uffee\001\002\000" +
    "\006\014\006\076\004\001\002\000\006\014\006\076\004" +
    "\001\002\000\006\014\006\076\004\001\002\000\006\014" +
    "\006\076\004\001\002\000\016\002\uffef\013\uffef\015\uffef" +
    "\016\uffef\020\uffef\037\uffef\001\002\000\016\002\ufff1\013" +
    "\013\015\ufff1\016\ufff1\020\ufff1\037\016\001\002\000\016" +
    "\002\ufff2\013\013\015\ufff2\016\ufff2\020\ufff2\037\016\001" +
    "\002\000\016\002\ufff0\013\ufff0\015\ufff0\016\ufff0\020\ufff0" +
    "\037\ufff0\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\020\000\006\002\006\014\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\014\010\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\014\021\001\001\000\004\014\020\001\001" +
    "\000\004\014\017\001\001\000\004\014\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$analisis_sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$analisis_sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$analisis_sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String resultado = "";


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$analisis_sintactico$actions {


  private final analisis_sintactico parser;

  /** Constructor */
  CUP$analisis_sintactico$actions(analisis_sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action_part00000000(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$analisis_sintactico$result;

      /* select the action based on the action number */
      switch (CUP$analisis_sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		RESULT = start_val;
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$analisis_sintactico$parser.done_parsing();
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = e; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programa ::= main 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("programa",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // programa ::= funciones main 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("programa",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // programa ::= main funciones 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("programa",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // programa ::= funciones main funciones 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("programa",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // main ::= INT MAIN LPAREN RPAREN LBRACE bloque RBRACE 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("main",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // funciones ::= funciones declaraFuncion 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("funciones",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // funciones ::= declaraFuncion 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("funciones",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // funciones ::= comentario 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("funciones",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // identificador ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("identificador",7, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // operando ::= identificador 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("operando",8, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // operando ::= numero 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("operando",8, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // operando ::= llamaFuncion 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("operando",8, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // break ::= BREAK 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("break",13, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr MAS expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = (Integer)e1 + (Integer)e2; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr MENOS expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = (Integer)e1 - (Integer)e2; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr MULT expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = (Integer)e1 * (Integer)e2; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= expr DIV expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = (Integer)e1 / (Integer)e2; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= LPAREN expr RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		 RESULT = e; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= numero 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = n; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // intLiteral ::= numero 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("intLiteral",14, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // floatLiteral ::= floatN 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("floatLiteral",15, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // stringLiteral ::= charLiteral 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("stringLiteral",16, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // stringLiteral ::= stringLiteral charLiteral 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("stringLiteral",16, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // charLiteral ::= COMILLASIM letra COMILLASIM 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("charLiteral",17, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // charLiteral ::= COMILLASIM numero COMILLASIM 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("charLiteral",17, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // charLiteral ::= COMILLASIM simbolo COMILLASIM 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("charLiteral",17, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // boolLiteral ::= TRUE 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("boolLiteral",18, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // boolLiteral ::= FALSE 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("boolLiteral",18, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // tipo ::= INT 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("tipo",19, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // tipo ::= FLOAT 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("tipo",19, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // tipo ::= STRING 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("tipo",19, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // tipo ::= CHAR 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("tipo",19, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // tipo ::= ARRAY 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("tipo",19, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // tipo ::= BOOL 
            {
              Object RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("tipo",19, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$analisis_sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
              return CUP$analisis_sintactico$do_action_part00000000(
                               CUP$analisis_sintactico$act_num,
                               CUP$analisis_sintactico$parser,
                               CUP$analisis_sintactico$stack,
                               CUP$analisis_sintactico$top);
    }
}

}
