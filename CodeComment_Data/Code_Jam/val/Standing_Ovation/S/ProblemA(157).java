package methodEmbedding.Standing_Ovation.S.LYD1212;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProblemA {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(ProblemA.class.getResourceAsStream("/ovation.in"));
    int t = sc.nextInt();
    sc.nextLine();
    FileWriter fw = new FileWriter("ovation.out");
    for(int i = 1; i <= t; i++) {
      String[] vals = sc.nextLine().split(" ");
      int max = Integer.parseInt(vals[0]);
      int running = 0;
      int toAdd = 0;
      for(int j = 0; j <= max; j++) {
        if(running < j) {
          int added = j - running;
          toAdd += added;
          running += added;
        }
        running += Integer.parseInt(String.valueOf(vals[1].charAt(j)));
      }
      System.out.println("Case #" + i + ": " + toAdd);
      fw.append("Case #" + i + ": " + toAdd + "\n");
    }
    fw.flush();
  }
}
