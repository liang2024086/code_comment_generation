package methodEmbedding.Speaking_in_Tongues.S.LYD997;

import java.util.Scanner;
import java.io.*;
public class SSS {
  public static void main(String[] args) throws IOException {
    Scanner w = new Scanner(new File("D:/sample.txt"));
    int cases = Integer.parseInt(w.nextLine());
    
    String[] in  = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " " };
    String[] out = { "y", "h", "e", "s", "o", "c", "v", "x", "d", "u", "i", "g", "l", "b", "k", "r", "z", "t", "n", "w", "j", "p", "f", "m", "a", "q", " " };
    
    String ans = "";
    for (int i = 0; i < cases; i++) {
      String t = w.nextLine().trim();
      for (int j = 0; j < t.length(); j++) {
        for (int k = 0; k < in.length; k++) {
          if (t.substring(j, j + 1).equals(in[k])) {
          ans += out[k];  
          }
        }  
      }
      System.out.println("Case #" + (i + 1) + ": " + ans);
      ans = "";
    }   
  }
}
