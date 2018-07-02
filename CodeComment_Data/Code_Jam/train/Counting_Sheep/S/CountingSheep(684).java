package methodEmbedding.Counting_Sheep.S.LYD1278;

import java.util.*;
import java.io.*;

public class CountingSheep {
  public static void main(String args[]) throws Exception {
    long time = System.currentTimeMillis();

    String filename = args[0];

    BufferedWriter writer =
      new BufferedWriter(new PrintWriter(filename + "-output.txt", "UTF-8"));
    BufferedReader reader = new BufferedReader(new FileReader(filename));

    String nextLine;
    nextLine = reader.readLine(); // ignore count
    int caseNum = 1;
    while ((nextLine = reader.readLine()) != null) {
      int base = Integer.valueOf(nextLine);
      writer.write("Case #" + caseNum + ": ");
      String output = null;
      if (base == 0) {
        output = "INSOMNIA";
      } else {
        int i = 0;
        String digits;
        Set<Character> digitsSeen = new HashSet<Character>();
        do {
          i++;
          digits = "" + (i * base);
          for (char digit: digits.toCharArray()) {
            digitsSeen.add(digit);
          }
        } while(digitsSeen.size() < 10);
        output = digits;
      }
      writer.write(output);
      caseNum++;
      writer.newLine();
    }
    writer.close();
    System.out.println(System.currentTimeMillis() - time);
  }
}
