package methodEmbedding.Standing_Ovation.S.LYD902;

import java.util.*;
import java.io.*;

/**
 * Created by LaiQX on 04/10/15.
 */
public class StandingOvation {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(System.in);
    PrintWriter wr = new PrintWriter("output");
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i< n; i++) {
      StringBuilder resString = new StringBuilder();
      resString.append("Case #"+(i+1)+": ");
      String[] raw = sc.nextLine().split(" ");
      int level = Integer.parseInt(raw[0]);
      int num = Integer.parseInt(raw[1].substring(0,1));
      int sum = num;
      int add = 0;
      for (int j = 1 ; j <= level; j++) {
        num = Integer.parseInt(raw[1].substring(j,j+1));
        if (j>sum) {
          add = add + (j-sum);
          sum = sum + (j-sum);
        }
        sum = sum+num;
      }
      resString.append(add);
      wr.println(resString);
    }
    wr.close();
  }
}

