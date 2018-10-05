package methodEmbedding.Counting_Sheep.S.LYD1373;


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
    Scanner inputFileScanner = null, line = null;
    BufferedWriter out = null;
    try {
      inputFileScanner = new Scanner(new File(inputFilename));
      out = new BufferedWriter(new FileWriter(new File(outputFilename)));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Read in problem description
    line = new Scanner(inputFileScanner.nextLine());
    int runs = line.nextInt();
    
    Set<Integer> possibilities = new TreeSet<Integer>();

    // Read in the input data
    try {
      for (int i = 1; i <= runs; ++i) {
        
        int startN = inputFileScanner.nextInt();
        out.write("Case #" + i + ": ");
        if (startN == 0) {
          out.write("INSOMNIA");
          out.newLine();
          continue;
        }

        possibilities.clear();
        int j = 1;
        for (j = 1; j < 101; ++j) {
          int n = startN * j;
          while (n > 0) {
            possibilities.add(n % 10);
            n /= 10;
          }
          if (possibilities.size() >= 10) {
            out.write(String.valueOf(startN * j));
            out.newLine();
            break;
          }
        }
        if (possibilities.size() < 10) {
          out.write("INSOMNIA");
          out.newLine();
        }
      }
      out.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
