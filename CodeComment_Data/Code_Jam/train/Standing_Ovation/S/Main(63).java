package methodEmbedding.Standing_Ovation.S.LYD1107;

import java.util.*;
import java.io.*;

public class Main {
  
  private static final String CASE = "Case #";
  private static final String NL = System.getProperty("line.separator");
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int t = 0; t < T; t++) {
      String[] in = br.readLine().split(" ");
      int Sm = Integer.parseInt(in[0]);
      String s = in[1];
      int cnt_s = 0;
      int cnt_i = 0;
      int len = s.length();
      for (int i = 0; i < len; i++) {
        int curr = (int) s.charAt(i) - 48;
        if (curr == 0) {
          if (cnt_s < i + 1) {
            cnt_i++;
            curr++;
          }
        }
        cnt_s += curr;
      }
      sb.append(CASE + (t + 1) + ": " + cnt_i);
      sb.append(NL);
    }
    System.out.println(sb.toString());
  }
  
}
