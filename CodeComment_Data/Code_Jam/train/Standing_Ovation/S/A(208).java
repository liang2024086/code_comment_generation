package methodEmbedding.Standing_Ovation.S.LYD1056;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class A {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader(args[0]));
    BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
    String line = br.readLine();
    int testCase = 1;
    while ((line = br.readLine()) != null) {
      if (line.length() == 0) {
        break;
      }
      int i = 0, standing = 0, invited = 0,
          smax = Integer.parseInt(line.split(" ")[0]);
      for (char c : line.split(" ")[1].toCharArray()) {
        int si = Integer.parseInt(String.valueOf(c));
        if (si > 0 && i > standing) {
          invited += i - standing;
          standing += i - standing;
        }
        standing += si;
        if (standing >= smax) {
          break;
        }
        i++;
      }
      bw.write("Case #" + testCase++ + ": " + invited + "\n");
    }
    br.close();
    bw.close();
  }
}

