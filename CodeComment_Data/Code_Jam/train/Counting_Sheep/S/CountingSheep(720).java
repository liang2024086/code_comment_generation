package methodEmbedding.Counting_Sheep.S.LYD883;

import java.util.*;
import java.io.*;
public class CountingSheep {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    //BufferedWriter out = new BufferedWriter(new FileWriter("CountingSheep.out"));
    int cases = in.nextInt();
    for (int i = 1; i <= cases; i++) {
        int N = in.nextInt();
        int increment = N;
        if (N == 0) {
            System.out.println("Case #" + (i) + ": " + "INSOMNIA");
        }
        else {
            HashSet digits = new HashSet();
            while (true) {
                for (char c : (N + "").toCharArray()) {
                    digits.add(c);
                }
                if (digits.size() == 10) {
                    System.out.println("Case #" + (i) + ": " + N);
                    break;
                }
                N += increment;
            }
        }
    }
  }
}
