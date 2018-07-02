package methodEmbedding.Magic_Trick.S.LYD1159;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class A {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader(
        "A-small-attempt0.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter(
        "A-small-attempt0.out"));
    String line = br.readLine(); /* Skip number of test cases. */
    List<String> lines = new ArrayList<String>();
    int testCase = 1;
    do {
      line = br.readLine();
      if (lines.size() == 10) {
        String firstResponseLine =
            lines.get(Integer.parseInt(lines.get(0)));
        String secondResponseLine =
            lines.get(5 + Integer.parseInt(lines.get(5)));
        SortedSet<String> firstSet = new TreeSet<String>(
            Arrays.asList(firstResponseLine.split(" ")));
        SortedSet<String> secondSet = new TreeSet<String>(
            Arrays.asList(secondResponseLine.split(" ")));
        firstSet.retainAll(secondSet);
        switch (firstSet.size()) {
        case 0:
          bw.write("Case #" + testCase + ": Volunteer cheated!\n");
          break;
        case 1:
          bw.write("Case #" + testCase + ": " + firstSet.first() + "\n");
          break;
        default:
          bw.write("Case #" + testCase + ": Bad magician!\n");
        }
        lines.clear();
        testCase++;
      }
      if (line != null && line.length() > 0) {
        lines.add(line);
      }
    } while (line != null);
    br.close();
    bw.close();
  }
}
