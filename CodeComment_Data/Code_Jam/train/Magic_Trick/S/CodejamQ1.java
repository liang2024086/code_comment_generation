package methodEmbedding.Magic_Trick.S.LYD1408;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class CodejamQ1 {

  private static String baseName = "A-small-attempt0";
  private static String inputFilename = baseName + ".in";
  private static String outputFilename = baseName + ".out";

  /**
   * Forgive me for my sins. I haven't woken up yet.
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = null, line = null;
    BufferedWriter out = null;
    try {
      sc = new Scanner(new File(inputFilename));
      out = new BufferedWriter(new FileWriter(new File(outputFilename)));
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    line = new Scanner(sc.nextLine());
    int runs = line.nextInt();
    Set<Integer> possibilities = new TreeSet<Integer>();
    int answer = -1;
    int guess = -1;
    boolean found = false;

    try {
      for (int i = 1; i <= runs; ++i) {
        out.write("Case #" + i + ": ");
        int row = sc.nextInt();
        possibilities.clear();
        answer = -1;
        found = false;
        for (int j = 1; j <= 4; ++j) {
          for (int k = 1; k <= 4; ++k) {
            if (j != row) {
              sc.nextInt();
            } else {
              possibilities.add(sc.nextInt());
            }
          }
        }
        row = sc.nextInt();
        for (int j = 1; j <= 4; ++j) {
          for (int k = 1; k <= 4; ++k) {
            guess = sc.nextInt();
            if (j != row) {
              continue;
            }
            if (possibilities.contains(guess)) {
              if (!found) {
                answer = guess;
                found = true;
              } else {
                answer = -1;
              }
            }
          }
        }
        if (found && answer > -1) {
          out.write("" + answer);
        } else if (found) {
          out.write("Bad magician!");
        } else {
          out.write("Volunteer cheated!");
        }
        out.newLine();
      }
      out.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
