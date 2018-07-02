package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1174;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProblemB {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("d:/B-small-attempt0.in")));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        PrintWriter pw = new PrintWriter("d:/B-test.out");

        for (int test = 0; test < T; test++) {
            line = br.readLine();
            char[] chars = line.toCharArray();
            int count = 0;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i-1]) {
                    count++;
                }
            }
            if (chars[chars.length - 1] == '-') {
                count++;
            }
            pw.println("Case #" + (test + 1) + ": " + count);
        }
        pw.close();
        br.close();
    }
}
