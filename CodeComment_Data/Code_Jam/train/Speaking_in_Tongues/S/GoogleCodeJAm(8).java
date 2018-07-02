package methodEmbedding.Speaking_in_Tongues.S.LYD1471;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author santiagorios
 */
public class GoogleCodeJAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    HashMap<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("y", "a");
    dictionary.put("n", "b");
    dictionary.put("f", "c");
    dictionary.put("i", "d");
    dictionary.put("c", "e");
    dictionary.put("w", "f");
    dictionary.put("l", "g");
    dictionary.put("b", "h");
    dictionary.put("k", "i");
    dictionary.put("u", "j");
    dictionary.put("o", "k");
    dictionary.put("m", "l");
    dictionary.put("x", "m");
    dictionary.put("s", "n");
    dictionary.put("e", "o");
    dictionary.put("v", "p");
    dictionary.put("z", "q");
    dictionary.put("p", "r");
    dictionary.put("d", "s");
    dictionary.put("r", "t");
    dictionary.put("j", "u");
    dictionary.put("g", "v");
    dictionary.put("t", "w");
    dictionary.put("h", "x");
    dictionary.put("a", "y");
    dictionary.put("q", "z");
    dictionary.put(" ", " ");
    
    Scanner in = new Scanner(System.in);
    int T = Integer.parseInt(in.nextLine());
    for(int i=1;i<=T; i++){
      String G=in.nextLine();
      String newString="";
      for(int j=0;j<G.length();j++){
        String c = String.valueOf(G.charAt(j));
        newString += dictionary.get(c);
      }
      System.out.println("Case #" + i + ": " + newString);
    }
  }
}
