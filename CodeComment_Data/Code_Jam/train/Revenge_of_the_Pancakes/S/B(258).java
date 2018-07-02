package methodEmbedding.Revenge_of_the_Pancakes.S.LYD565;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.BitSet;

public class B {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader(
        "B-small-attempt0.in"));
    br.readLine();
    String line;
    int testCase = 1;
    while ((line = br.readLine()) != null) {
      if (line.length() == 0) {
        break;
      }
      BitSet stack = new BitSet();
      char[] lineChars = line.toCharArray();
      for (int i = 0; i < lineChars.length; i++) {
        if (lineChars[i] == '-') {
          stack.set(i);
        }
      }
      int flips = 0;
      while (!stack.isEmpty()) {
        stack.flip(0, stack.length());
        flips++;
      }
      System.out.println("Case #" + testCase++ + ": " + flips);
      
    }
    br.close();
  }
}
