package methodEmbedding.Counting_Sheep.S.LYD662;

import java.io.*;
import java.util.*;

public class Sheep {
  public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int N = Integer.parseInt(s);     

    // N test cases
    for (int i = 0; i < N; i++)
    {
      s = sc.nextLine();
      int curNum = Integer.parseInt(s);
      HashSet<Integer> digitsSeen = new HashSet<Integer>();

      int original = curNum;
      int count = 1;
      while (digitsSeen.size() != 10){
        curNum = original*(count++);

        if (count > 2 && original == curNum){
          System.out.println("Case #" + (i + 1) + ": INSOMNIA");
          break;
        }

        int n = curNum;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while(n != 0){
          int rem = n % 10;
          n = n/10;
          digits.add(rem);
        }

        for (Integer j : digits){
          if (!digitsSeen.contains(j)){
            digitsSeen.add(j);
          }
        }
      }

      if (digitsSeen.size() == 10){
        System.out.println("Case #" + (i + 1) + ": " + curNum);
      }
    }
  }
}
