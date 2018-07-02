package methodEmbedding.Standing_Ovation.S.LYD543;


import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static final String changeLine = System.getProperty("line.separator");

  public static void main(String[] args) throws FileNotFoundException, IOException {
    Main main = new Main();
  }

  public int e, r;
  String str;

  public Main() throws FileNotFoundException, IOException {
    BufferedReader br = new BufferedReader(new FileReader("D:/A-small-attempt0.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("D:/result.txt"));
    int cases = Integer.parseInt(br.readLine());
    for (int caseNum = 0; caseNum < cases; caseNum++) {
      String[] split = br.readLine().split(" ");
      e = Integer.parseInt(split[0]);
      str = split[1];
      int standing = 0;
      int result = 0;
      for (int i = 0; i <= e; i++) {
        int current = str.charAt(i) - '0';
        if (standing >= i) {
          standing += current;
        } else {
          result += i - standing;
          standing = i + current;
        }
      }
      // output
      System.out.println("Case #" + (caseNum + 1) + ": " + result);
      bw.write("Case #" + (caseNum + 1) + ": ");
      bw.write("" + result);
      bw.write(changeLine);
    }
    br.close();
    bw.close();
  }
}
