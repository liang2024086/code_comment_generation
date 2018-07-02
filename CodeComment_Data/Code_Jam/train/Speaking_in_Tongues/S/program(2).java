package methodEmbedding.Speaking_in_Tongues.S.LYD1615;

import java.util.Scanner;
import java.io.*;

public class SpeakingInTongues {
  public static void main(String[] args) throws IOException{
    String s1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String s2 = "yhesocvxduiglbkrztnwjpfmaqYHESOCVXDUIGLBKRZTNWJPFMAQ";
    Scanner in = new Scanner(new File("D:/A-small-attempt3.in"));
    PrintStream out = new PrintStream(new File("D:/outputProb1.txt"));
    
    int lineAmount = Integer.parseInt(in.nextLine());
    
    for (int n = 1; n <= lineAmount; n++) {
      String line = in.nextLine();
      String output = "";
      String temp = "";
      for (int i = 0; i < line.length(); i++) {
        temp = line.substring(i, i + 1);
        if (s1.indexOf(temp) >= 0) {
          temp = s2.substring(s1.indexOf(temp), s1.indexOf(temp) + 1);
        }
        output+=temp;
      }
      out.println("Case #"+n+": "+output);
    }
    
    in.close();
    out.close();

  }
}
