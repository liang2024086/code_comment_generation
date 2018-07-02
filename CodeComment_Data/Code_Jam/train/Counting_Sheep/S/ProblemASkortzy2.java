package methodEmbedding.Counting_Sheep.S.LYD1447;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProblemASkortzy2 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        PrintWriter pw = new PrintWriter("A-small.out");

        for (int test = 0; test < T; test++) {
            line = br.readLine();
            int N = Integer.parseInt(line);
            if (N == 0) {
                pw.println("Case #" + (test + 1) + ": INSOMNIA");
                continue;
            }
            int value = 0;
            Set<Integer> set = new TreeSet<Integer>();
            while (set.size() < 10) {
                value += N;
                int v = value;
                while (v > 0) {
                    set.add(v % 10);
                    v /= 10;
                }
            }
            pw.println("Case #" + (test + 1) + ": " + value);
        }
        pw.close();
        br.close();
    }
}
