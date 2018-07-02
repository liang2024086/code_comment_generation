package methodEmbedding.Standing_Ovation.S.LYD575;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandingOvation {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("data/standing ovation/A-small-attempt0.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data/standing ovation/out")));
    int t = sc.nextInt();
    List<Integer> si = new ArrayList<Integer>();
    for (int i = 0; i < t; i++) {
      sc.nextInt();
      String s = sc.next();
      si.clear();
      for (int j = 0; j < s.length(); j++) {
        si.add(Integer.valueOf(s.substring(j, j + 1)));
      }
      int standing = 0;
      int friends = 0;
      for (int j = 0; j < si.size(); j++) {
        int curr = si.get(j);
        if (curr > 0 && j > standing) {
          friends += j - standing;
          standing += j - standing;
        }
        standing += curr;
      }
      System.out.println("Case #" + (i + 1) + ": " + friends);
      bw.write("Case #" + (i + 1) + ": " + friends + "\n");
    }
    bw.close();
  }
}
