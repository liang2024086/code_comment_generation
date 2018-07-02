package methodEmbedding.Standing_Ovation.S.LYD862;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int T = Integer.parseInt(br.readLine());
    for (int t = 1; t <= T; t++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      st.nextToken();
      String line = st.nextToken();
      int ans = 0, count = 0;
      for (int i = 0; i < line.length(); i++) {
        int val = line.charAt(i) - '0';
        if (val != 0 && count < i) {
          ans += i - count;
          count = i;
        }
        count += val;
      }
      System.out.println(String.format("Case #%d: %d", t, ans));
    }
  }
}
