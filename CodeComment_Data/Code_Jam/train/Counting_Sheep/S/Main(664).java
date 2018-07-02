package methodEmbedding.Counting_Sheep.S.LYD207;

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

    for (int i = 1; i <= n; ++i) {
      int num = in.nextInt();
      ArrayList<Integer> contained = (ArrayList<Integer>) digits.clone();
      if (num == 0)
      {
        System.out.println("Case #" + i + ": INSOMNIA");
        continue;
      }
      for (int m = 1; m <= 1000; m++)
      {
        int cur = num * m;
        while (cur > 0)
        {
          contained.remove(Integer.valueOf(cur%10));
          cur /= 10;
        }
        if (contained.isEmpty())
        {
          System.out.println("Case #" + i + ": " + num*m);
          break;
        }
      }
    }
  }
}
