package methodEmbedding.Standing_Ovation.S.LYD551;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StandingOvation {
  
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(args[0]));
    int T = new Integer(in.readLine()).intValue();
    PrintWriter pw = new PrintWriter("standingOvation-result.txt");
    
    for (int t=1; t<=T; t++) {
      String line = in.readLine();
      StringTokenizer st = new StringTokenizer(line);
      int sMax = new Integer(st.nextToken()).intValue();
      String shynessLine = st.nextToken();
      
      int[] levelCount = new int[sMax+1];
      for (int i=0; i<levelCount.length; i++) {
        levelCount[i] = Integer.valueOf(String.valueOf(shynessLine.charAt(i)));
      }
      
      //////////////////////////////////
      
      int standing = levelCount[0];
      int required = 0;
      for (int i=1; i<levelCount.length; i++) {
        if (levelCount[i]>0 && standing<i) {
          required += (i - standing);
          standing += required;
        }
        standing += levelCount[i];
      }
      
      String caseResultLine = "Case #"+t+": " + required;
      System.out.println(caseResultLine);
      pw.println(caseResultLine);
    }
    pw.close();
    in.close();
  }
}
