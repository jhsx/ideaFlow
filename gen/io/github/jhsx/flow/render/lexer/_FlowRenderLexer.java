/* The following code was generated by JFlex 1.4.3 on 19-04-2016 20:32 */

package io.github.jhsx.flow.render.lexer;

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;

import java.util.*;
import static io.github.jhsx.flow.render.FlowRenderTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 19-04-2016 20:32 from the specification file
 * <tt>flowrender.flex</tt>
 */
public class _FlowRenderLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int ST_ACTION = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\34\1\17"+
    "\2\0\1\43\1\36\1\0\1\30\1\31\1\23\1\41\1\44\1\15"+
    "\1\16\1\42\1\11\7\10\1\26\1\7\1\33\1\46\1\37\1\32"+
    "\1\40\1\45\1\0\4\6\1\14\1\6\16\4\1\20\2\4\1\13"+
    "\2\4\1\0\1\25\2\0\1\4\1\27\1\21\1\56\1\60\1\55"+
    "\1\51\1\50\1\70\1\4\1\47\1\4\1\61\1\52\1\65\1\54"+
    "\1\57\1\66\1\4\1\67\1\53\1\63\1\64\1\20\1\4\1\12"+
    "\1\62\1\4\1\22\1\35\1\24\54\0\1\4\12\0\1\4\4\0"+
    "\1\4\5\0\27\4\1\0\37\4\1\0\u01ca\4\4\0\14\4\16\0"+
    "\5\4\7\0\1\4\1\0\1\4\201\0\5\4\1\0\2\4\2\0"+
    "\4\4\10\0\1\4\1\0\3\4\1\0\1\4\1\0\24\4\1\0"+
    "\123\4\1\0\213\4\10\0\236\4\11\0\46\4\2\0\1\4\7\0"+
    "\47\4\110\0\33\4\5\0\3\4\55\0\53\4\25\0\12\5\4\0"+
    "\2\4\1\0\143\4\1\0\1\4\17\0\2\4\7\0\2\4\12\5"+
    "\3\4\2\0\1\4\20\0\1\4\1\0\36\4\35\0\131\4\13\0"+
    "\1\4\16\0\12\5\41\4\11\0\2\4\4\0\1\4\5\0\26\4"+
    "\4\0\1\4\11\0\1\4\3\0\1\4\27\0\31\4\107\0\1\4"+
    "\1\0\13\4\127\0\66\4\3\0\1\4\22\0\1\4\7\0\12\4"+
    "\4\0\12\5\1\0\7\4\1\0\7\4\5\0\10\4\2\0\2\4"+
    "\2\0\26\4\1\0\7\4\1\0\1\4\3\0\4\4\3\0\1\4"+
    "\20\0\1\4\15\0\2\4\1\0\3\4\4\0\12\5\2\4\23\0"+
    "\6\4\4\0\2\4\2\0\26\4\1\0\7\4\1\0\2\4\1\0"+
    "\2\4\1\0\2\4\37\0\4\4\1\0\1\4\7\0\12\5\2\0"+
    "\3\4\20\0\11\4\1\0\3\4\1\0\26\4\1\0\7\4\1\0"+
    "\2\4\1\0\5\4\3\0\1\4\22\0\1\4\17\0\2\4\4\0"+
    "\12\5\25\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0"+
    "\2\4\1\0\5\4\3\0\1\4\36\0\2\4\1\0\3\4\4\0"+
    "\12\5\1\0\1\4\21\0\1\4\1\0\6\4\3\0\3\4\1\0"+
    "\4\4\3\0\2\4\1\0\1\4\1\0\2\4\3\0\2\4\3\0"+
    "\3\4\3\0\14\4\26\0\1\4\25\0\12\5\25\0\10\4\1\0"+
    "\3\4\1\0\27\4\1\0\12\4\1\0\5\4\3\0\1\4\32\0"+
    "\2\4\6\0\2\4\4\0\12\5\25\0\10\4\1\0\3\4\1\0"+
    "\27\4\1\0\12\4\1\0\5\4\3\0\1\4\40\0\1\4\1\0"+
    "\2\4\4\0\12\5\1\0\2\4\22\0\10\4\1\0\3\4\1\0"+
    "\51\4\2\0\1\4\20\0\1\4\21\0\2\4\4\0\12\5\12\0"+
    "\6\4\5\0\22\4\3\0\30\4\1\0\11\4\1\0\1\4\2\0"+
    "\7\4\72\0\60\4\1\0\2\4\14\0\7\4\11\0\12\5\47\0"+
    "\2\4\1\0\1\4\2\0\2\4\1\0\1\4\2\0\1\4\6\0"+
    "\4\4\1\0\7\4\1\0\3\4\1\0\1\4\1\0\1\4\2\0"+
    "\2\4\1\0\4\4\1\0\2\4\11\0\1\4\2\0\5\4\1\0"+
    "\1\4\11\0\12\5\2\0\4\4\40\0\1\4\37\0\12\5\26\0"+
    "\10\4\1\0\44\4\33\0\5\4\163\0\53\4\24\0\1\4\12\5"+
    "\6\0\6\4\4\0\4\4\3\0\1\4\3\0\2\4\7\0\3\4"+
    "\4\0\15\4\14\0\1\4\1\0\12\5\6\0\46\4\1\0\1\4"+
    "\5\0\1\4\2\0\53\4\1\0\u014d\4\1\0\4\4\2\0\7\4"+
    "\1\0\1\4\1\0\4\4\2\0\51\4\1\0\4\4\2\0\41\4"+
    "\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\17\4"+
    "\1\0\71\4\1\0\4\4\2\0\103\4\45\0\20\4\20\0\125\4"+
    "\14\0\u026c\4\2\0\21\4\1\0\32\4\5\0\113\4\25\0\15\4"+
    "\1\0\4\4\16\0\22\4\16\0\22\4\16\0\15\4\1\0\3\4"+
    "\17\0\64\4\43\0\1\4\4\0\1\4\3\0\12\5\46\0\12\5"+
    "\6\0\130\4\10\0\51\4\1\0\1\4\5\0\106\4\12\0\35\4"+
    "\51\0\12\5\36\4\2\0\5\4\13\0\54\4\25\0\7\4\10\0"+
    "\12\5\46\0\27\4\11\0\65\4\53\0\12\5\6\0\12\5\15\0"+
    "\1\4\135\0\57\4\21\0\7\4\4\0\12\5\51\0\36\4\15\0"+
    "\2\4\12\5\54\4\32\0\44\4\34\0\12\5\3\0\3\4\12\5"+
    "\44\4\153\0\4\4\1\0\4\4\3\0\2\4\11\0\300\4\100\0"+
    "\u0116\4\2\0\6\4\2\0\46\4\2\0\6\4\2\0\10\4\1\0"+
    "\1\4\1\0\1\4\1\0\1\4\1\0\37\4\2\0\65\4\1\0"+
    "\7\4\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0"+
    "\6\4\4\0\15\4\5\0\3\4\1\0\7\4\164\0\1\4\15\0"+
    "\1\4\20\0\15\4\145\0\1\4\4\0\1\4\2\0\12\4\1\0"+
    "\1\4\3\0\5\4\6\0\1\4\1\0\1\4\1\0\1\4\1\0"+
    "\4\4\1\0\13\4\2\0\4\4\5\0\5\4\4\0\1\4\64\0"+
    "\2\4\u0a7b\0\57\4\1\0\57\4\1\0\205\4\6\0\4\4\3\0"+
    "\2\4\14\0\46\4\1\0\1\4\5\0\1\4\2\0\70\4\7\0"+
    "\1\4\20\0\27\4\11\0\7\4\1\0\7\4\1\0\7\4\1\0"+
    "\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\120\0"+
    "\1\4\u01d5\0\2\4\52\0\5\4\5\0\2\4\4\0\126\4\6\0"+
    "\3\4\1\0\132\4\1\0\4\4\5\0\51\4\3\0\136\4\21\0"+
    "\33\4\65\0\20\4\u0200\0\u19b6\4\112\0\u51cd\4\63\0\u048d\4\103\0"+
    "\56\4\2\0\u010d\4\3\0\20\4\12\5\2\4\24\0\57\4\20\0"+
    "\31\4\10\0\106\4\61\0\11\4\2\0\147\4\2\0\4\4\1\0"+
    "\4\4\14\0\13\4\115\0\12\4\1\0\3\4\1\0\4\4\1\0"+
    "\27\4\35\0\64\4\16\0\62\4\34\0\12\5\30\0\6\4\3\0"+
    "\1\4\4\0\12\5\34\4\12\0\27\4\31\0\35\4\7\0\57\4"+
    "\34\0\1\4\12\5\46\0\51\4\27\0\3\4\1\0\10\4\4\0"+
    "\12\5\6\0\27\4\3\0\1\4\5\0\60\4\1\0\1\4\3\0"+
    "\2\4\2\0\5\4\2\0\1\4\1\0\1\4\30\0\3\4\2\0"+
    "\13\4\7\0\3\4\14\0\6\4\2\0\6\4\2\0\6\4\11\0"+
    "\7\4\1\0\7\4\221\0\43\4\15\0\12\5\6\0\u2ba4\4\14\0"+
    "\27\4\4\0\61\4\u2104\0\u016e\4\2\0\152\4\46\0\7\4\14\0"+
    "\5\4\5\0\1\4\1\0\12\4\1\0\15\4\1\0\5\4\1\0"+
    "\1\4\1\0\2\4\1\0\2\4\1\0\154\4\41\0\u016b\4\22\0"+
    "\100\4\2\0\66\4\50\0\14\4\164\0\5\4\1\0\207\4\23\0"+
    "\12\5\7\0\32\4\6\0\32\4\13\0\131\4\3\0\6\4\2\0"+
    "\6\4\2\0\6\4\2\0\3\4\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\0\2\1\1\2\1\3\1\4\1\2\2\5"+
    "\1\6\1\7\1\10\1\2\1\11\1\2\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\2\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\5\4\1\31"+
    "\3\0\3\5\1\0\1\10\1\0\1\32\1\33\1\12"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\10\4\1\0\1\5\1\0\1\5\4\4\1\44\3\4"+
    "\1\45\3\4\1\46\6\4\1\47\1\50\1\51\1\4"+
    "\1\52\1\4\1\53\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[97];
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
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u01c8\0\u0201\0\344\0\u023a\0\u0273\0\u02ac\0\344\0\u02e5"+
    "\0\u031e\0\344\0\344\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b"+
    "\0\u0474\0\u04ad\0\344\0\344\0\344\0\344\0\344\0\344"+
    "\0\u04e6\0\u051f\0\u0558\0\u0591\0\u05ca\0\344\0\u0603\0\u018f"+
    "\0\u063c\0\u0675\0\344\0\u06ae\0\u06e7\0\344\0\u0720\0\344"+
    "\0\344\0\344\0\344\0\344\0\344\0\344\0\344\0\344"+
    "\0\344\0\u0156\0\u0759\0\u0792\0\u07cb\0\u0804\0\u083d\0\u0876"+
    "\0\u08af\0\u08e8\0\u0921\0\u095a\0\u0993\0\u06e7\0\u09cc\0\u0a05"+
    "\0\u0a3e\0\u0a77\0\u0156\0\u0ab0\0\u0ae9\0\u0b22\0\u0603\0\u0b5b"+
    "\0\u0b94\0\u0bcd\0\u0156\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1\0\u0cea"+
    "\0\u0d23\0\u0156\0\u0156\0\u0156\0\u0d5c\0\u0156\0\u0d95\0\u0156"+
    "\0\u0156";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[97];
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
    "\22\3\1\4\46\3\1\5\3\6\1\7\1\10\1\7"+
    "\2\11\1\12\3\7\1\13\1\14\1\15\2\7\1\16"+
    "\1\17\1\20\1\5\1\11\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\7\1\42\4\7"+
    "\1\43\3\7\1\44\4\7\1\45\1\7\22\3\1\0"+
    "\46\3\22\0\1\46\1\47\137\0\3\6\71\0\11\7"+
    "\3\0\2\7\4\0\1\7\20\0\22\7\5\0\1\50"+
    "\1\0\3\50\2\0\1\51\1\0\1\52\7\0\1\50"+
    "\20\0\1\53\1\0\1\51\24\0\1\50\1\0\3\11"+
    "\2\0\1\51\1\0\1\52\7\0\1\11\20\0\1\53"+
    "\1\0\1\51\24\0\1\50\1\0\1\50\2\54\2\55"+
    "\1\51\1\0\1\52\7\0\1\50\20\0\1\53\1\0"+
    "\1\51\24\0\1\52\1\0\3\52\14\0\1\52\42\0"+
    "\1\15\2\0\14\15\1\56\5\15\1\57\43\15\22\0"+
    "\1\60\72\0\1\61\44\0\27\21\1\62\41\21\32\0"+
    "\1\63\70\0\1\64\70\0\1\65\73\0\1\66\71\0"+
    "\1\67\64\0\1\70\70\0\1\71\42\0\11\7\3\0"+
    "\2\7\4\0\1\7\20\0\1\7\1\72\3\7\1\73"+
    "\10\7\1\74\3\7\4\0\6\7\1\75\2\7\3\0"+
    "\2\7\4\0\1\7\20\0\3\7\1\76\1\7\1\77"+
    "\14\7\4\0\11\7\3\0\2\7\4\0\1\7\20\0"+
    "\3\7\1\100\16\7\4\0\11\7\3\0\2\7\4\0"+
    "\1\7\20\0\1\101\21\7\4\0\11\7\3\0\1\7"+
    "\1\102\4\0\1\7\20\0\22\7\2\47\1\0\20\47"+
    "\1\103\45\47\5\0\1\104\1\0\3\104\3\0\1\105"+
    "\10\0\1\104\12\0\1\105\34\0\1\52\1\0\3\52"+
    "\2\0\1\51\11\0\1\52\20\0\1\53\1\0\1\51"+
    "\24\0\1\50\1\0\1\50\2\54\2\0\1\51\1\0"+
    "\1\52\7\0\1\50\20\0\1\53\1\0\1\51\25\0"+
    "\4\106\2\0\1\106\4\0\1\106\4\0\1\106\21\0"+
    "\2\106\3\0\2\106\1\0\1\106\20\0\3\15\4\0"+
    "\3\15\3\0\2\15\21\0\1\15\3\0\1\15\1\0"+
    "\1\15\4\0\2\15\2\0\1\15\5\0\11\7\3\0"+
    "\2\7\4\0\1\7\20\0\11\7\1\107\10\7\4\0"+
    "\11\7\3\0\2\7\4\0\1\7\20\0\17\7\1\110"+
    "\2\7\4\0\11\7\3\0\2\7\4\0\1\7\20\0"+
    "\14\7\1\111\5\7\4\0\11\7\3\0\2\7\4\0"+
    "\1\7\20\0\4\7\1\112\15\7\4\0\11\7\3\0"+
    "\2\7\4\0\1\7\20\0\6\7\1\113\13\7\4\0"+
    "\11\7\3\0\2\7\4\0\1\7\20\0\10\7\1\114"+
    "\11\7\4\0\11\7\3\0\2\7\4\0\1\7\20\0"+
    "\2\7\1\115\17\7\4\0\11\7\3\0\2\7\4\0"+
    "\1\7\20\0\5\7\1\116\14\7\2\47\1\0\20\47"+
    "\1\103\1\117\44\47\5\0\1\104\1\0\3\104\14\0"+
    "\1\104\20\0\1\53\26\0\1\104\1\0\3\104\14\0"+
    "\1\104\46\0\11\7\3\0\2\7\4\0\1\7\20\0"+
    "\3\7\1\120\16\7\4\0\11\7\3\0\2\7\4\0"+
    "\1\7\20\0\10\7\1\121\11\7\4\0\11\7\3\0"+
    "\2\7\4\0\1\7\20\0\2\7\1\122\17\7\4\0"+
    "\11\7\3\0\2\7\4\0\1\7\20\0\2\7\1\123"+
    "\17\7\4\0\11\7\3\0\2\7\4\0\1\7\20\0"+
    "\11\7\1\124\10\7\4\0\11\7\3\0\2\7\4\0"+
    "\1\7\20\0\3\7\1\125\16\7\4\0\11\7\3\0"+
    "\2\7\4\0\1\7\20\0\21\7\1\126\4\0\11\7"+
    "\3\0\2\7\4\0\1\7\20\0\15\7\1\127\4\7"+
    "\4\0\11\7\3\0\2\7\4\0\1\7\20\0\20\7"+
    "\1\130\1\7\4\0\11\7\3\0\2\7\4\0\1\7"+
    "\20\0\5\7\1\131\14\7\4\0\11\7\3\0\2\7"+
    "\4\0\1\7\20\0\12\7\1\132\7\7\4\0\11\7"+
    "\3\0\2\7\4\0\1\7\20\0\6\7\1\133\13\7"+
    "\4\0\11\7\3\0\2\7\4\0\1\7\20\0\2\7"+
    "\1\134\17\7\4\0\11\7\3\0\2\7\4\0\1\7"+
    "\20\0\6\7\1\135\13\7\4\0\11\7\3\0\2\7"+
    "\4\0\1\7\20\0\14\7\1\136\5\7\4\0\11\7"+
    "\3\0\2\7\4\0\1\7\20\0\6\7\1\137\13\7"+
    "\4\0\11\7\3\0\2\7\4\0\1\7\20\0\2\7"+
    "\1\140\17\7\4\0\11\7\3\0\2\7\4\0\1\7"+
    "\20\0\4\7\1\141\15\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3534];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\0\2\1\1\11\5\1\1\11\3\1\1\11"+
    "\2\1\2\11\7\1\6\11\5\1\1\11\3\0\1\1"+
    "\1\11\1\1\1\0\1\11\1\0\12\11\11\1\1\0"+
    "\1\1\1\0\34\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[97];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  public _FlowRenderLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _FlowRenderLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1732) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 35: 
          { return IF;
          }
        case 45: break;
        case 33: 
          { return LESS_OR_EQUAL;
          }
        case 46: break;
        case 36: 
          { return END;
          }
        case 47: break;
        case 10: 
          { return RAW_STRING;
          }
        case 48: break;
        case 40: 
          { return YIELD;
          }
        case 49: break;
        case 23: 
          { return TERNARY;
          }
        case 50: break;
        case 1: 
          { return TEXT;
          }
        case 51: break;
        case 5: 
          { return NUMBER;
          }
        case 52: break;
        case 21: 
          { return MOD;
          }
        case 53: break;
        case 24: 
          { return COLONCOMMA;
          }
        case 54: break;
        case 22: 
          { return COMMA;
          }
        case 55: break;
        case 17: 
          { return LESS;
          }
        case 56: break;
        case 39: 
          { return BLOCK;
          }
        case 57: break;
        case 37: 
          { return COMMENT;
          }
        case 58: break;
        case 7: 
          { return DOT;
          }
        case 59: break;
        case 20: 
          { return DIV;
          }
        case 60: break;
        case 14: 
          { return COLON;
          }
        case 61: break;
        case 15: 
          { return NOT;
          }
        case 62: break;
        case 42: 
          { return IMPORT;
          }
        case 63: break;
        case 30: 
          { return NOT_EQ;
          }
        case 64: break;
        case 44: 
          { return EXTENDS;
          }
        case 65: break;
        case 13: 
          { return ASSIGN;
          }
        case 66: break;
        case 27: 
          { yybegin(YYINITIAL);return RDOUBLE_BRACE;
          }
        case 67: break;
        case 43: 
          { return INCLUDE;
          }
        case 68: break;
        case 31: 
          { return COND_OR;
          }
        case 69: break;
        case 34: 
          { return GREATER_OR_EQUAL;
          }
        case 70: break;
        case 18: 
          { return GREATER;
          }
        case 71: break;
        case 41: 
          { return RANGE;
          }
        case 72: break;
        case 38: 
          { return ELSE;
          }
        case 73: break;
        case 26: 
          { return LDOUBLE_BRACE;
          }
        case 74: break;
        case 6: 
          { return MINUS;
          }
        case 75: break;
        case 8: 
          { return STRING;
          }
        case 76: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 77: break;
        case 11: 
          { return LPAREN;
          }
        case 78: break;
        case 4: 
          { return IDENT;
          }
        case 79: break;
        case 25: 
          { yybegin(ST_ACTION);return LDOUBLE_BRACE;
          }
        case 80: break;
        case 12: 
          { return RPAREN;
          }
        case 81: break;
        case 16: 
          { return BIT_OR;
          }
        case 82: break;
        case 28: 
          { return EQ;
          }
        case 83: break;
        case 32: 
          { return COND_AND;
          }
        case 84: break;
        case 19: 
          { return PLUS;
          }
        case 85: break;
        case 2: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 86: break;
        case 29: 
          { return SCOPE_ASSIGN;
          }
        case 87: break;
        case 9: 
          { return MUL;
          }
        case 88: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
