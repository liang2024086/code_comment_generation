package methodEmbedding.Standing_Ovation.S.LYD1199;

import java.util.Scanner;


public class StandingOvation {

  static Scanner s = new Scanner(System.in);
    
  public static void main(String[] args) {
    int T = Integer.parseInt(s.nextLine());
      
    for (int t = 1; t <= T; t++) {
      String[] words = s.nextLine().split(" ");
      int sMax = Integer.parseInt(words[0]);
      char[] nums = words[1].toCharArray();
      
      int standing = Integer.parseInt(""+nums[0]);
      int extra   = 0;
      for (int i = 1; i < nums.length; i++) {
        int sitting = Integer.parseInt(""+nums[i]);  // nums[i]-'0';
        if(sitting<1)
          continue;

        if(standing<i) {
          int missing = i-standing;
          extra    += missing;
          standing += missing;
        }
        standing+=sitting;
      }

      System.out.format("Case #%d: %d\n", t, extra); 
    }
      
    s.close();
  }

}
