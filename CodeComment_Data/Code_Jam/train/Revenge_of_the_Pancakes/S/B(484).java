package methodEmbedding.Revenge_of_the_Pancakes.S.LYD643;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class B {
  private static String fileName = "src/B-small-attempt1";

  public static void main(String[] args) throws FileNotFoundException {
    Scanner file = new Scanner(new File(fileName + ".in"));
    PrintStream out = new PrintStream(new File(fileName + ".out"));
    int caseCount = Integer.parseInt(file.nextLine());
    int caseNum = 0;
    while (++caseNum <= caseCount) {
      out.print("Case #" + caseNum + ": ");
      String str = file.nextLine();
      char[] chr = new char[str.length()];
      chr[0] = str.charAt(0);
      int len = 1;
      for (int i = 1; i < str.length(); ++i) {
        if (str.charAt(i) != chr[len - 1]) {
          chr[len++] = str.charAt(i);
        }
      }
      out.println(len - (chr[len - 1] == '+' ? 1 : 0));
    }
    out.close();
    file.close();
  }

}
