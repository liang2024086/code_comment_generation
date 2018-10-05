package methodEmbedding.Magic_Trick.S.LYD952;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 
 * @author amarziali
 */
public class MagicTrick {

  /**
   * @param args
   */
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new FileInputStream("d:/in.txt"));
    PrintWriter out = new PrintWriter(new File("d:/out.txt"));
    int[] myRow = new int[4];
    int numCases = scanner.nextInt();
    for (int i = 0; i < numCases; i++) {
      int answer = scanner.nextInt() - 1;
      for (int row = 0; row < 4; row++) {
        for (int col = 0; col < 4; col++) {
          int value = scanner.nextInt();
          if (row == answer) {
            myRow[col] = value;
          }
        }
      }
      answer = scanner.nextInt() - 1;
      int ret = 0;
      Arrays.sort(myRow);
      boolean bad = false;
      boolean cheat = false;

      for (int row = 0; row < 4; row++) {
        int count = 0;
        for (int col = 0; col < 4; col++) {
          int value = scanner.nextInt();
          if (Arrays.binarySearch(myRow, value) >= 0) {
            count++;
            if (row == answer) {
              ret = value;
            }
          }
        }
        if (row == answer) {
          if (count == 0) {
            cheat = true;
          }
          else if (count > 1) {
            bad = true;
          }

        }
      }
      out.print("Case #" + (i + 1) + ": ");
      if (cheat) {
        out.println("Volunteer cheated!");
      }
      else if (bad) {
        out.println("Bad magician!");
      }
      else {
        out.println(ret);
      }

    }
    out.close();
    scanner.close();

  }
}
