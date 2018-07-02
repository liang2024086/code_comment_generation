package methodEmbedding.Standing_Ovation.S.LYD514;

import java.io.*;

class ASmall {
  public static void main (String[] args) {
    try {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      int T = Integer.parseInt(br.readLine());
      for (int t = 1; t <= T; t++) {
        String s = br.readLine().split(" ")[1];
        int answer = 0, standing = 0;
        for(int i = 0; i < s.length(); i++) {
          int si = s.charAt(i) - '0';
          if(standing < i) {
            answer += i - standing;
            standing += i - standing;
          }
          standing += si;
        }
        System.out.println("Case #" + t + ": " + answer);
      }
    } catch (IOException e) {}
  }
}
