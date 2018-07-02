package methodEmbedding.Revenge_of_the_Pancakes.S.LYD547;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B {

    private static final String FILE_NAME = "B-small-attempt0";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(FILE_NAME + ".in"));
        BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME + ".out"));

        int t = Integer.parseInt(in.readLine());
        for (int c = 1; c <= t; ++c) {
            String row = in.readLine();
            char currentChar = '+';
            int count = 0;
            for (int i = row.length()-1; i >= 0; --i) {
                char cc = row.charAt(i);
                if (cc != currentChar) {
                    ++count;
                    currentChar = cc;
                }
            }

            out.write(String.format("Case #%d: %d\n", c, count));
            System.out.println(String.format("Case #%d: %d", c, count));
        }
        out.close();
    }
}
