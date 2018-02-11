/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.intellij.lang.graql.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.lang.graql.psi.GraqlTokenTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Graql.flex</tt>
 */
public class _GraqlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\4\1\22\0\1\2\1\0\1\5\1\11\1\14\2\0\1\3\1\20\1\21\1\0\1\7\1\17\1"+
    "\13\1\0\1\6\12\10\1\15\1\16\1\24\1\25\1\26\2\0\1\71\1\65\1\75\1\60\1\61\1"+
    "\62\1\100\1\77\1\63\2\12\1\72\1\64\1\57\1\12\1\74\1\12\1\66\1\67\1\73\1\56"+
    "\4\12\1\70\1\0\1\4\2\0\1\76\1\0\1\36\1\31\1\51\1\46\1\33\1\53\1\47\1\35\1"+
    "\44\1\12\1\32\1\40\1\52\1\45\1\43\1\37\1\12\1\41\1\27\1\42\1\30\1\50\1\54"+
    "\1\55\1\34\1\12\1\22\1\0\1\23\7\0\1\1\32\0\1\2\337\0\1\2\177\0\13\2\35\0\2"+
    "\1\5\0\1\2\57\0\1\2\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\4\2\1\4\1\5\2\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\32\1\1\0\1\20\4\0\1\4\1\21\1\22"+
    "\2\1\1\23\4\1\1\24\13\1\1\25\1\26\1\1"+
    "\1\27\26\1\1\30\1\31\1\32\1\1\1\33\1\1"+
    "\1\34\1\1\1\35\1\36\1\37\16\1\1\40\6\1"+
    "\1\41\1\1\1\42\1\43\10\1\1\44\1\45\21\1"+
    "\1\46\1\1\1\47\1\1\1\50\1\51\1\52\4\1"+
    "\1\53\2\1\1\54\10\1\1\55\4\1\1\56\5\1"+
    "\1\57\1\60\1\61\5\1\1\62\1\63\1\64\1\1"+
    "\1\65\7\1\1\66\1\1\1\67\5\1\1\70\1\71"+
    "\5\1\1\20\1\1\1\72\4\1\1\73\1\1\1\74"+
    "\1\75\1\76\1\1\1\77\3\1\1\100\1\101\1\102"+
    "\5\1\1\103\2\1\1\104\3\1\1\105\1\1\1\106"+
    "\1\1\1\107\2\1\1\110\4\1\1\111\1\112\1\113"+
    "\1\114\1\1\1\115\1\116\7\1\1\117\1\1\1\120"+
    "\7\1\1\121";

  private static int [] zzUnpackAction() {
    int [] result = new int[302];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\101\0\202\0\303\0\u0104\0\u0145\0\u0186\0\u01c7"+
    "\0\u0208\0\u0249\0\u01c7\0\u028a\0\101\0\101\0\101\0\101"+
    "\0\101\0\101\0\101\0\u02cb\0\u030c\0\u034d\0\u038e\0\u03cf"+
    "\0\u0410\0\u0451\0\u0492\0\u04d3\0\u0514\0\u0555\0\u0596\0\u05d7"+
    "\0\u0618\0\u0659\0\u069a\0\u06db\0\u071c\0\u075d\0\u079e\0\u07df"+
    "\0\u0820\0\u0861\0\u08a2\0\u08e3\0\u0924\0\u0965\0\u09a6\0\303"+
    "\0\101\0\u09e7\0\u0104\0\u0a28\0\u0a69\0\u0186\0\101\0\101"+
    "\0\u0aaa\0\u0aeb\0\u0249\0\u0b2c\0\u0b6d\0\u0bae\0\u0bef\0\u0c30"+
    "\0\u0c71\0\u0cb2\0\u0cf3\0\u0d34\0\u0d75\0\u0db6\0\u0df7\0\u0e38"+
    "\0\u0e79\0\u0eba\0\u0efb\0\u0f3c\0\u0f7d\0\u0fbe\0\u0fff\0\u1040"+
    "\0\u1081\0\u10c2\0\u1103\0\u1144\0\u1185\0\u11c6\0\u1207\0\u1248"+
    "\0\u1289\0\u12ca\0\u130b\0\u134c\0\u138d\0\u13ce\0\u140f\0\u1450"+
    "\0\u1491\0\u14d2\0\u1513\0\u1554\0\u1595\0\101\0\u0249\0\u0249"+
    "\0\u15d6\0\u0249\0\u1617\0\u0249\0\u1658\0\u0249\0\u0249\0\u0249"+
    "\0\u1699\0\u16da\0\u171b\0\u175c\0\u179d\0\u17de\0\u181f\0\u1860"+
    "\0\u18a1\0\u18e2\0\u1923\0\u1964\0\u19a5\0\u19e6\0\u0249\0\u1a27"+
    "\0\u1a68\0\u1aa9\0\u1aea\0\u1b2b\0\u1b6c\0\u0249\0\u1bad\0\u0249"+
    "\0\u0249\0\u1bee\0\u1c2f\0\u1c70\0\u1cb1\0\u1cf2\0\u1d33\0\u1d74"+
    "\0\u1db5\0\u0249\0\u0249\0\u1df6\0\u1e37\0\u1e78\0\u1eb9\0\u1efa"+
    "\0\u1f3b\0\u1f7c\0\u1fbd\0\u1ffe\0\u203f\0\u2080\0\u20c1\0\u2102"+
    "\0\u2143\0\u2184\0\u21c5\0\u2206\0\u0249\0\u2247\0\u0249\0\u2288"+
    "\0\u0249\0\u0249\0\u0249\0\u22c9\0\u230a\0\u234b\0\u238c\0\u0249"+
    "\0\u23cd\0\u240e\0\u0249\0\u244f\0\u2490\0\u24d1\0\u2512\0\u2553"+
    "\0\u2594\0\u25d5\0\u2616\0\u0249\0\u2657\0\u2698\0\u26d9\0\u271a"+
    "\0\u0249\0\u275b\0\u279c\0\u27dd\0\u281e\0\u285f\0\u0249\0\u0249"+
    "\0\u0249\0\u28a0\0\u28e1\0\u2922\0\u2963\0\u29a4\0\u0249\0\u0249"+
    "\0\u0249\0\u29e5\0\u0249\0\u2a26\0\u2a67\0\u2aa8\0\u2ae9\0\u2b2a"+
    "\0\u2b6b\0\u2bac\0\u0249\0\u2bed\0\u0249\0\u2c2e\0\u2c6f\0\u2cb0"+
    "\0\u2cf1\0\u2d32\0\u0249\0\u0249\0\u2d73\0\u2db4\0\u2df5\0\u2e36"+
    "\0\u2e77\0\u0249\0\u2eb8\0\u0249\0\u2ef9\0\u2f3a\0\u2f7b\0\u2fbc"+
    "\0\u0249\0\u2ffd\0\u0249\0\u0249\0\u0249\0\u303e\0\u0249\0\u307f"+
    "\0\u30c0\0\u3101\0\u0249\0\u0249\0\u0249\0\u3142\0\u3183\0\u31c4"+
    "\0\u3205\0\u3246\0\u0249\0\u3287\0\u32c8\0\u0249\0\u3309\0\u334a"+
    "\0\u338b\0\u0249\0\u33cc\0\u0249\0\u340d\0\u0249\0\u344e\0\u348f"+
    "\0\u0249\0\u34d0\0\u3511\0\u3552\0\u3593\0\u0249\0\u0249\0\u0249"+
    "\0\u0249\0\u35d4\0\u0249\0\u0249\0\u3615\0\u3656\0\u3697\0\u36d8"+
    "\0\u3719\0\u375a\0\u379b\0\u0249\0\u37dc\0\u0249\0\u381d\0\u385e"+
    "\0\u389f\0\u38e0\0\u3921\0\u3962\0\u39a3\0\u0249";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[302];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\2\1\25\1\26\1\12"+
    "\1\27\1\30\1\31\1\12\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\12\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\12\1\51\1\12\1\52"+
    "\2\12\1\53\1\54\1\12\1\55\1\56\4\12\1\57"+
    "\4\12\102\0\2\3\76\0\3\60\1\61\1\62\74\60"+
    "\4\63\1\64\1\61\73\63\4\65\1\0\1\65\1\0"+
    "\72\65\10\0\1\66\100\0\1\10\1\0\2\12\13\0"+
    "\52\12\1\11\1\0\77\11\10\0\1\12\1\0\2\12"+
    "\13\0\52\12\10\0\1\14\1\0\2\14\13\0\52\14"+
    "\25\0\1\67\100\0\1\70\63\0\1\12\1\0\2\12"+
    "\13\0\1\12\1\71\11\12\1\72\36\12\10\0\1\12"+
    "\1\0\2\12\13\0\5\12\1\73\6\12\1\74\35\12"+
    "\10\0\1\12\1\0\2\12\13\0\4\12\1\75\45\12"+
    "\10\0\1\12\1\0\2\12\13\0\16\12\1\76\33\12"+
    "\10\0\1\12\1\0\2\12\13\0\7\12\1\77\42\12"+
    "\10\0\1\12\1\0\2\12\13\0\1\100\12\12\1\101"+
    "\4\12\1\102\31\12\10\0\1\12\1\0\2\12\13\0"+
    "\11\12\1\103\40\12\10\0\1\12\1\0\2\12\13\0"+
    "\7\12\1\104\4\12\1\105\1\106\34\12\10\0\1\12"+
    "\1\0\2\12\13\0\1\12\1\107\2\12\1\110\7\12"+
    "\1\111\35\12\10\0\1\12\1\0\2\12\13\0\6\12"+
    "\1\112\3\12\1\113\37\12\10\0\1\12\1\0\2\12"+
    "\13\0\12\12\1\114\11\12\1\115\25\12\10\0\1\12"+
    "\1\0\2\12\13\0\1\116\15\12\1\117\33\12\10\0"+
    "\1\12\1\0\2\12\13\0\4\12\1\120\2\12\1\121"+
    "\4\12\1\122\35\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\123\5\12\1\124\37\12\10\0\1\12\1\0"+
    "\2\12\13\0\7\12\1\125\5\12\1\126\34\12\10\0"+
    "\1\12\1\0\2\12\13\0\11\12\1\127\2\12\1\130"+
    "\35\12\10\0\1\12\1\0\2\12\13\0\4\12\1\131"+
    "\2\12\1\132\5\12\1\133\34\12\10\0\1\12\1\0"+
    "\2\12\13\0\7\12\1\134\42\12\10\0\1\12\1\0"+
    "\2\12\13\0\6\12\1\135\43\12\10\0\1\12\1\0"+
    "\2\12\13\0\30\12\1\136\21\12\10\0\1\12\1\0"+
    "\2\12\13\0\32\12\1\137\7\12\1\140\7\12\10\0"+
    "\1\12\1\0\2\12\13\0\35\12\1\141\14\12\10\0"+
    "\1\12\1\0\2\12\13\0\32\12\1\142\17\12\10\0"+
    "\1\12\1\0\2\12\13\0\32\12\1\143\17\12\10\0"+
    "\1\12\1\0\2\12\13\0\34\12\1\144\15\12\10\0"+
    "\1\12\1\0\2\12\13\0\42\12\1\145\7\12\1\60"+
    "\1\0\77\60\1\63\1\0\77\63\4\65\1\0\1\65"+
    "\1\146\72\65\10\0\1\12\1\0\2\12\13\0\2\12"+
    "\1\147\20\12\1\150\26\12\10\0\1\12\1\0\2\12"+
    "\13\0\12\12\1\151\4\12\1\152\32\12\10\0\1\12"+
    "\1\0\2\12\13\0\14\12\1\153\35\12\10\0\1\12"+
    "\1\0\2\12\13\0\5\12\1\154\44\12\10\0\1\12"+
    "\1\0\2\12\13\0\13\12\1\155\36\12\10\0\1\12"+
    "\1\0\2\12\13\0\1\156\51\12\10\0\1\12\1\0"+
    "\2\12\13\0\3\12\1\157\16\12\1\160\27\12\10\0"+
    "\1\12\1\0\2\12\13\0\13\12\1\161\36\12\10\0"+
    "\1\12\1\0\2\12\13\0\20\12\1\162\31\12\10\0"+
    "\1\12\1\0\2\12\13\0\7\12\1\163\42\12\10\0"+
    "\1\12\1\0\2\12\13\0\2\12\1\164\47\12\10\0"+
    "\1\12\1\0\2\12\13\0\16\12\1\165\33\12\10\0"+
    "\1\12\1\0\2\12\13\0\23\12\1\166\26\12\10\0"+
    "\1\12\1\0\2\12\13\0\11\12\1\167\40\12\10\0"+
    "\1\12\1\0\2\12\13\0\11\12\1\170\40\12\10\0"+
    "\1\12\1\0\2\12\13\0\11\12\1\171\40\12\10\0"+
    "\1\12\1\0\2\12\13\0\4\12\1\172\45\12\10\0"+
    "\1\12\1\0\2\12\13\0\1\12\1\173\50\12\10\0"+
    "\1\12\1\0\2\12\13\0\17\12\1\174\32\12\10\0"+
    "\1\12\1\0\2\12\13\0\24\12\1\175\25\12\10\0"+
    "\1\12\1\0\1\12\1\176\13\0\7\12\1\177\42\12"+
    "\10\0\1\12\1\0\2\12\13\0\1\200\51\12\10\0"+
    "\1\12\1\0\2\12\13\0\1\201\10\12\1\202\12\12"+
    "\1\203\25\12\10\0\1\12\1\0\2\12\13\0\13\12"+
    "\1\204\36\12\10\0\1\12\1\0\2\12\13\0\1\12"+
    "\1\205\50\12\10\0\1\12\1\0\2\12\13\0\13\12"+
    "\1\206\36\12\10\0\1\12\1\0\2\12\13\0\14\12"+
    "\1\207\35\12\10\0\1\12\1\0\2\12\13\0\11\12"+
    "\1\210\40\12\10\0\1\12\1\0\2\12\13\0\7\12"+
    "\1\211\42\12\10\0\1\12\1\0\2\12\13\0\1\12"+
    "\1\212\50\12\10\0\1\12\1\0\2\12\13\0\1\12"+
    "\1\213\14\12\1\214\4\12\1\215\26\12\10\0\1\12"+
    "\1\0\2\12\13\0\7\12\1\216\7\12\1\217\3\12"+
    "\1\220\26\12\10\0\1\12\1\0\2\12\13\0\13\12"+
    "\1\221\12\12\1\222\23\12\10\0\1\12\1\0\2\12"+
    "\13\0\16\12\1\223\33\12\10\0\1\12\1\0\2\12"+
    "\13\0\11\12\1\224\40\12\10\0\1\12\1\0\2\12"+
    "\13\0\4\12\1\225\45\12\10\0\1\12\1\0\2\12"+
    "\13\0\31\12\1\226\20\12\10\0\1\12\1\0\2\12"+
    "\13\0\51\12\1\227\10\0\1\12\1\0\2\12\13\0"+
    "\44\12\1\230\5\12\10\0\1\12\1\0\2\12\13\0"+
    "\45\12\1\231\4\12\10\0\1\12\1\0\2\12\13\0"+
    "\35\12\1\232\14\12\10\0\1\12\1\0\2\12\13\0"+
    "\42\12\1\233\7\12\10\0\1\12\1\0\2\12\13\0"+
    "\41\12\1\234\10\12\10\0\1\12\1\0\2\12\13\0"+
    "\44\12\1\235\5\12\10\0\1\12\1\0\2\12\13\0"+
    "\15\12\1\236\34\12\10\0\1\12\1\0\2\12\13\0"+
    "\11\12\1\237\40\12\10\0\1\12\1\0\2\12\13\0"+
    "\15\12\1\240\34\12\10\0\1\12\1\0\2\12\13\0"+
    "\12\12\1\241\37\12\10\0\1\12\1\0\2\12\13\0"+
    "\12\12\1\242\37\12\10\0\1\12\1\0\2\12\13\0"+
    "\5\12\1\243\44\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\244\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\20\12\1\245\31\12\10\0\1\12\1\0\2\12\13\0"+
    "\15\12\1\246\34\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\247\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\7\12\1\250\42\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\251\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\16\12\1\252\33\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\253\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\254\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\1\255\51\12\10\0\1\12\1\0\2\12\13\0\7\12"+
    "\1\256\42\12\10\0\1\12\1\0\2\12\13\0\4\12"+
    "\1\257\45\12\10\0\1\12\1\0\2\12\13\0\22\12"+
    "\1\260\27\12\10\0\1\12\1\0\2\12\13\0\4\12"+
    "\1\261\45\12\10\0\1\12\1\0\2\12\13\0\15\12"+
    "\1\262\34\12\10\0\1\12\1\0\2\12\13\0\4\12"+
    "\1\263\2\12\1\264\42\12\10\0\1\12\1\0\2\12"+
    "\13\0\2\12\1\265\47\12\10\0\1\12\1\0\2\12"+
    "\13\0\1\12\1\266\50\12\10\0\1\12\1\0\2\12"+
    "\13\0\1\267\51\12\10\0\1\12\1\0\2\12\13\0"+
    "\16\12\1\270\33\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\271\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\10\12\1\272\12\12\1\273\26\12\10\0\1\12\1\0"+
    "\2\12\13\0\16\12\1\274\33\12\10\0\1\12\1\0"+
    "\2\12\13\0\15\12\1\275\34\12\10\0\1\12\1\0"+
    "\2\12\13\0\2\12\1\276\47\12\10\0\1\12\1\0"+
    "\2\12\13\0\22\12\1\277\27\12\10\0\1\12\1\0"+
    "\2\12\13\0\1\300\51\12\10\0\1\12\1\0\2\12"+
    "\13\0\16\12\1\301\33\12\10\0\1\12\1\0\2\12"+
    "\13\0\32\12\1\302\17\12\10\0\1\12\1\0\2\12"+
    "\13\0\37\12\1\303\12\12\10\0\1\12\1\0\2\12"+
    "\13\0\32\12\1\304\17\12\10\0\1\12\1\0\2\12"+
    "\13\0\43\12\1\305\6\12\10\0\1\12\1\0\2\12"+
    "\13\0\36\12\1\306\13\12\10\0\1\12\1\0\2\12"+
    "\13\0\43\12\1\307\6\12\10\0\1\12\1\0\2\12"+
    "\13\0\32\12\1\310\17\12\10\0\1\12\1\0\2\12"+
    "\13\0\50\12\1\311\1\12\10\0\1\12\1\0\2\12"+
    "\13\0\16\12\1\312\33\12\10\0\1\12\1\0\2\12"+
    "\13\0\4\12\1\313\45\12\10\0\1\12\1\0\2\12"+
    "\13\0\13\12\1\314\36\12\10\0\1\12\1\0\2\12"+
    "\13\0\15\12\1\315\34\12\10\0\1\12\1\0\2\12"+
    "\13\0\4\12\1\316\45\12\10\0\1\12\1\0\2\12"+
    "\13\0\1\317\51\12\10\0\1\12\1\0\2\12\13\0"+
    "\11\12\1\320\40\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\321\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\322\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\12\12\1\323\37\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\324\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\2\12\1\325\47\12\10\0\1\12\1\0\2\12\13\0"+
    "\12\12\1\326\37\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\327\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\16\12\1\330\33\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\331\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\11\12\1\332\40\12\10\0\1\12\1\0\2\12\13\0"+
    "\10\12\1\333\41\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\334\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\335\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\7\12\1\336\42\12\10\0\1\12\1\0\2\12\13\0"+
    "\1\12\1\337\50\12\10\0\1\12\1\0\2\12\13\0"+
    "\15\12\1\340\34\12\10\0\1\12\1\0\2\12\13\0"+
    "\7\12\1\341\42\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\342\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\6\12\1\343\43\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\344\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\33\12\1\345\16\12\10\0\1\12\1\0\2\12\13\0"+
    "\32\12\1\346\17\12\10\0\1\12\1\0\2\12\13\0"+
    "\44\12\1\347\5\12\10\0\1\12\1\0\2\12\13\0"+
    "\34\12\1\350\15\12\10\0\1\12\1\0\2\12\13\0"+
    "\32\12\1\351\17\12\10\0\1\12\1\0\2\12\13\0"+
    "\20\12\1\352\31\12\10\0\1\12\1\0\2\12\13\0"+
    "\7\12\1\353\42\12\10\0\1\12\1\0\2\12\13\0"+
    "\5\12\1\354\44\12\10\0\1\12\1\0\2\12\13\0"+
    "\2\12\1\355\47\12\10\0\1\12\1\0\2\12\13\0"+
    "\20\12\1\356\31\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\357\10\12\1\360\34\12\10\0\1\12\1\0"+
    "\2\12\13\0\13\12\1\361\36\12\10\0\1\12\1\0"+
    "\2\12\13\0\1\362\51\12\10\0\1\12\1\0\2\12"+
    "\13\0\13\12\1\363\36\12\10\0\1\12\1\0\2\12"+
    "\13\0\4\12\1\364\45\12\10\0\1\12\1\0\2\12"+
    "\13\0\4\12\1\365\45\12\10\0\1\12\1\0\2\12"+
    "\13\0\5\12\1\366\44\12\10\0\1\12\1\0\2\12"+
    "\13\0\4\12\1\367\45\12\10\0\1\12\1\0\2\12"+
    "\13\0\4\12\1\370\45\12\10\0\1\12\1\0\2\12"+
    "\13\0\15\12\1\371\34\12\10\0\1\12\1\0\2\12"+
    "\13\0\13\12\1\372\36\12\10\0\1\12\1\0\2\12"+
    "\13\0\13\12\1\373\36\12\10\0\1\12\1\0\2\12"+
    "\13\0\16\12\1\374\33\12\10\0\1\12\1\0\2\12"+
    "\13\0\12\12\1\375\37\12\10\0\1\12\1\0\2\12"+
    "\13\0\34\12\1\376\15\12\10\0\1\12\1\0\2\12"+
    "\13\0\32\12\1\377\17\12\10\0\1\12\1\0\2\12"+
    "\13\0\34\12\1\u0100\15\12\10\0\1\12\1\0\2\12"+
    "\13\0\46\12\1\u0101\3\12\10\0\1\12\1\0\2\12"+
    "\13\0\37\12\1\u0102\12\12\10\0\1\12\1\0\2\12"+
    "\13\0\16\12\1\u0103\33\12\10\0\1\12\1\0\2\12"+
    "\13\0\1\12\1\u0104\50\12\10\0\1\12\1\0\2\12"+
    "\13\0\7\12\1\u0105\42\12\10\0\1\12\1\0\2\12"+
    "\13\0\1\u0106\51\12\10\0\1\12\1\0\2\12\13\0"+
    "\14\12\1\u0107\35\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\u0108\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\10\12\1\u0109\41\12\10\0\1\12\1\0\2\12\13\0"+
    "\12\12\1\u010a\37\12\10\0\1\12\1\0\2\12\13\0"+
    "\16\12\1\u010b\33\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\u010c\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\30\12\1\u010d\21\12\10\0\1\12\1\0\2\12\13\0"+
    "\40\12\1\u010e\11\12\10\0\1\12\1\0\2\12\13\0"+
    "\35\12\1\u010f\14\12\10\0\1\12\1\0\2\12\13\0"+
    "\34\12\1\u0110\15\12\10\0\1\12\1\0\2\12\13\0"+
    "\40\12\1\u0111\11\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\u0112\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\13\12\1\u0113\36\12\10\0\1\12\1\0\2\12\13\0"+
    "\16\12\1\u0114\33\12\10\0\1\12\1\0\2\12\13\0"+
    "\12\12\1\u0115\37\12\10\0\1\12\1\0\2\12\13\0"+
    "\4\12\1\u0116\45\12\10\0\1\12\1\0\2\12\13\0"+
    "\1\u0117\51\12\10\0\1\12\1\0\2\12\13\0\32\12"+
    "\1\u0118\17\12\10\0\1\12\1\0\2\12\13\0\32\12"+
    "\1\u0119\17\12\10\0\1\12\1\0\2\12\13\0\44\12"+
    "\1\u011a\5\12\10\0\1\12\1\0\2\12\13\0\4\12"+
    "\1\u011b\45\12\10\0\1\12\1\0\2\12\13\0\4\12"+
    "\1\u011c\45\12\10\0\1\12\1\0\2\12\13\0\1\u011d"+
    "\51\12\10\0\1\12\1\0\2\12\13\0\7\12\1\u011e"+
    "\42\12\10\0\1\12\1\0\2\12\13\0\47\12\1\u011f"+
    "\2\12\10\0\1\12\1\0\2\12\13\0\6\12\1\u0120"+
    "\43\12\10\0\1\12\1\0\2\12\13\0\22\12\1\u0121"+
    "\27\12\10\0\1\12\1\0\2\12\13\0\34\12\1\u0122"+
    "\15\12\10\0\1\12\1\0\2\12\13\0\15\12\1\u0123"+
    "\34\12\10\0\1\12\1\0\2\12\13\0\13\12\1\u0124"+
    "\36\12\10\0\1\12\1\0\2\12\13\0\31\12\1\u0125"+
    "\20\12\10\0\1\12\1\0\2\12\13\0\10\12\1\u0126"+
    "\41\12\10\0\1\12\1\0\2\12\13\0\32\12\1\u0127"+
    "\17\12\10\0\1\12\1\0\2\12\13\0\30\12\1\u0128"+
    "\21\12\10\0\1\12\1\0\2\12\13\0\44\12\1\u0129"+
    "\5\12\10\0\1\12\1\0\2\12\13\0\34\12\1\u012a"+
    "\15\12\10\0\1\12\1\0\2\12\13\0\33\12\1\u012b"+
    "\16\12\10\0\1\12\1\0\2\12\13\0\34\12\1\u012c"+
    "\15\12\10\0\1\12\1\0\2\12\13\0\32\12\1\u012d"+
    "\17\12\10\0\1\12\1\0\2\12\13\0\37\12\1\u012e"+
    "\12\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[14820];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\12\1\7\11\34\1\1\0\1\11\4\0"+
    "\1\1\2\11\55\1\1\11\310\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[302];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _GraqlLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _GraqlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ID;
            } 
            // fall through
          case 82: break;
          case 2: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 83: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 84: break;
          case 4: 
            { return INTEGER;
            } 
            // fall through
          case 85: break;
          case 5: 
            { return SINGLE_LINE_COMMENT;
            } 
            // fall through
          case 86: break;
          case 6: 
            { return VARIABLE;
            } 
            // fall through
          case 87: break;
          case 7: 
            { return COLON;
            } 
            // fall through
          case 88: break;
          case 8: 
            { return SEMICOLON;
            } 
            // fall through
          case 89: break;
          case 9: 
            { return COMMA;
            } 
            // fall through
          case 90: break;
          case 10: 
            { return LPAREN;
            } 
            // fall through
          case 91: break;
          case 11: 
            { return RPAREN;
            } 
            // fall through
          case 92: break;
          case 12: 
            { return LBRACE;
            } 
            // fall through
          case 93: break;
          case 13: 
            { return RBRACE;
            } 
            // fall through
          case 94: break;
          case 14: 
            { return LTHAN;
            } 
            // fall through
          case 95: break;
          case 15: 
            { return GTHAN;
            } 
            // fall through
          case 96: break;
          case 16: 
            { return STRING;
            } 
            // fall through
          case 97: break;
          case 17: 
            { return LTHANEQ;
            } 
            // fall through
          case 98: break;
          case 18: 
            { return GTHANEQ;
            } 
            // fall through
          case 99: break;
          case 19: 
            { return BY;
            } 
            // fall through
          case 100: break;
          case 20: 
            { return AS;
            } 
            // fall through
          case 101: break;
          case 21: 
            { return OR;
            } 
            // fall through
          case 102: break;
          case 22: 
            { return OF;
            } 
            // fall through
          case 103: break;
          case 23: 
            { return IN;
            } 
            // fall through
          case 104: break;
          case 24: 
            { return REGEX;
            } 
            // fall through
          case 105: break;
          case 25: 
            { return SUB;
            } 
            // fall through
          case 106: break;
          case 26: 
            { return SUM;
            } 
            // fall through
          case 107: break;
          case 27: 
            { return STD;
            } 
            // fall through
          case 108: break;
          case 28: 
            { return KEY;
            } 
            // fall through
          case 109: break;
          case 29: 
            { return HAS;
            } 
            // fall through
          case 110: break;
          case 30: 
            { return ASK;
            } 
            // fall through
          case 111: break;
          case 31: 
            { return ASC;
            } 
            // fall through
          case 112: break;
          case 32: 
            { return ISA;
            } 
            // fall through
          case 113: break;
          case 33: 
            { return GET;
            } 
            // fall through
          case 114: break;
          case 34: 
            { return VAL;
            } 
            // fall through
          case 115: break;
          case 35: 
            { return VIA;
            } 
            // fall through
          case 116: break;
          case 36: 
            { return MAX;
            } 
            // fall through
          case 117: break;
          case 37: 
            { return MIN;
            } 
            // fall through
          case 118: break;
          case 38: 
            { return LONG;
            } 
            // fall through
          case 119: break;
          case 39: 
            { return RULE;
            } 
            // fall through
          case 120: break;
          case 40: 
            { return ROLE;
            } 
            // fall through
          case 121: break;
          case 41: 
            { return THEN;
            } 
            // fall through
          case 122: break;
          case 42: 
            { return TRUE;
            } 
            // fall through
          case 123: break;
          case 43: 
            { return DESC;
            } 
            // fall through
          case 124: break;
          case 44: 
            { return DATE;
            } 
            // fall through
          case 125: break;
          case 45: 
            { return MEAN;
            } 
            // fall through
          case 126: break;
          case 46: 
            { return WHEN;
            } 
            // fall through
          case 127: break;
          case 47: 
            { return REAL;
            } 
            // fall through
          case 128: break;
          case 48: 
            { return SIZE;
            } 
            // fall through
          case 129: break;
          case 49: 
            { return PATH;
            } 
            // fall through
          case 130: break;
          case 50: 
            { return PLAYS;
            } 
            // fall through
          case 131: break;
          case 51: 
            { return LABEL;
            } 
            // fall through
          case 132: break;
          case 52: 
            { return LIMIT;
            } 
            // fall through
          case 133: break;
          case 53: 
            { return ORDER;
            } 
            // fall through
          case 134: break;
          case 54: 
            { return GROUP;
            } 
            // fall through
          case 135: break;
          case 55: 
            { return COUNT;
            } 
            // fall through
          case 136: break;
          case 56: 
            { return MATCH;
            } 
            // fall through
          case 137: break;
          case 57: 
            { return FALSE;
            } 
            // fall through
          case 138: break;
          case 58: 
            { return ENTITY;
            } 
            // fall through
          case 139: break;
          case 59: 
            { return OFFSET;
            } 
            // fall through
          case 140: break;
          case 60: 
            { return INSERT;
            } 
            // fall through
          case 141: break;
          case 61: 
            { return DELETE;
            } 
            // fall through
          case 142: break;
          case 62: 
            { return DEFINE;
            } 
            // fall through
          case 143: break;
          case 63: 
            { return DOUBLE;
            } 
            // fall through
          case 144: break;
          case 64: 
            { return COMMIT;
            } 
            // fall through
          case 145: break;
          case 65: 
            { return MEDIAN;
            } 
            // fall through
          case 146: break;
          case 66: 
            { return MEMBER;
            } 
            // fall through
          case 147: break;
          case 67: 
            { return BOOLEAN;
            } 
            // fall through
          case 148: break;
          case 68: 
            { return RELATES;
            } 
            // fall through
          case 149: break;
          case 69: 
            { return CLUSTER;
            } 
            // fall through
          case 150: break;
          case 70: 
            { return COMPUTE;
            } 
            // fall through
          case 151: break;
          case 71: 
            { return DEGREES;
            } 
            // fall through
          case 152: break;
          case 72: 
            { return MEMBERS;
            } 
            // fall through
          case 153: break;
          case 73: 
            { return DATATYPE;
            } 
            // fall through
          case 154: break;
          case 74: 
            { return CONTAINS;
            } 
            // fall through
          case 155: break;
          case 75: 
            { return UNDEFINE;
            } 
            // fall through
          case 156: break;
          case 76: 
            { return DATETIME;
            } 
            // fall through
          case 157: break;
          case 77: 
            { return ATTRIBUTE;
            } 
            // fall through
          case 158: break;
          case 78: 
            { return AGGREGATE;
            } 
            // fall through
          case 159: break;
          case 79: 
            { return IS_ABSTRACT;
            } 
            // fall through
          case 160: break;
          case 80: 
            { return RELATIONSHIP;
            } 
            // fall through
          case 161: break;
          case 81: 
            { return IMPLICIT_IDENTIFIER;
            } 
            // fall through
          case 162: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
