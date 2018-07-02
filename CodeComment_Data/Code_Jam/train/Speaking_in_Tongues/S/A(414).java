package methodEmbedding.Speaking_in_Tongues.S.LYD801;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {
  static String decode = "yhesocvxduiglbkrztnwjpfmaq";
  
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(new File("A.in"));
    PrintWriter out = new PrintWriter(new File("A.out"));
    
    int T = s.nextInt();
    s.nextLine();
    for (int tc = 1; tc <= T; tc++) {
      out.print("Case #" + tc + ": ");
      String line = s.nextLine();
      for (int i = 0; i < line.length(); i++) {
        if (line.charAt(i) == ' ') out.print(" ");
        else out.print(decode.charAt(line.charAt(i) - 'a'));
      }
      out.println();
    }
    out.close();
  }

}
