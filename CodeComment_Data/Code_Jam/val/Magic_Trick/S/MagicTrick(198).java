package methodEmbedding.Magic_Trick.S.LYD1933;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {

  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(new File("MagicTrickInput"));
      int cases = scan.nextInt();
      for (int i = 0; i < cases; ++i) {
        int answer1 = scan.nextInt();
        ArrayList<ArrayList<Integer>> rows1 = new ArrayList<ArrayList<Integer>>();
        for (int j = 1; j <= 4; ++j) {
          rows1.add(new ArrayList<Integer>());
          for (int k = 1; k <= 4; ++k) {
            rows1.get(j-1).add(scan.nextInt());
          }
        }
               
        int answer2 = scan.nextInt();
        
        ArrayList<ArrayList<Integer>> rows2 = new ArrayList<ArrayList<Integer>>();
        for (int j = 1; j <= 4; ++j) {
          rows2.add(new ArrayList<Integer>());
          for (int k = 1; k <= 4; ++k) {
            rows2.get(j-1).add(scan.nextInt());
          }
        }
        int count = 0;
        int intersect = -1;
        for (int cur : rows1.get(answer1 - 1)) {
          if (rows2.get(answer2 - 1).contains(cur)) {
            ++count;
            if (count == 1)
              intersect = cur;
          }
        }
        
        if (count == 1) {
          System.out.printf("Case #%d: %d\n", (i+1), intersect);
        } else if (count == 0) {
          System.out.printf("Case #%d: Volunteer cheated!\n", (i+1));
        } else {
          System.out.printf("Case #%d: Bad magician!\n", (i+1));
        }
      }
      scan.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
