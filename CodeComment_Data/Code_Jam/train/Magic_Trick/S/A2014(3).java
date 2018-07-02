package methodEmbedding.Magic_Trick.S.LYD1313;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class A2014 {

  public static void main(String[] args) throws FileNotFoundException {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(new File("entreeA.txt"));
    assert sc != null;
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int answer = sc.nextInt() - 1;
      HashSet<Integer> possible_solutions = new HashSet<Integer>();
      /* Get the 4 numbers that can be the solution */
      for (int line = 0; line < 4; line++) {
        for (int column = 0; column < 4; column++) {
          int card = sc.nextInt();
          if (line == answer) {
            possible_solutions.add(card);
          }
        }
      }
      /*
       * Remove the numbers from the previous round that are not in the second
       * selected row
       */
      int answer_2 = sc.nextInt() - 1;
      HashSet<Integer> possible_solutions2 = new HashSet<Integer>();
      for (int line = 0; line < 4; line++) {
        for (int column = 0; column < 4; column++) {
          int card = sc.nextInt();
          if (line == answer_2) {
            possible_solutions2.add(card);
          }
        }
      }
      possible_solutions.retainAll(possible_solutions2);
      if (possible_solutions.size() == 1)
        System.out.println("Case #" + (i+1) + ": "
            + possible_solutions.toArray()[0]);
      else if (possible_solutions.size() == 0)
        System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
      else
        System.out.println("Case #" + (i+1) + ": Bad magician!");
    }
    sc.close();
  }
}
