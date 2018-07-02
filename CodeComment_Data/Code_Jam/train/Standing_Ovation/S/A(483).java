package methodEmbedding.Standing_Ovation.S.LYD1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {

    private static final String FILE_NAME = "A-small-attempt0";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(FILE_NAME + ".in"));
        BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME + ".out"));

        int t = Integer.parseInt(in.readLine());
        for (int c = 1; c <= t; ++c) {
            String shyness = in.readLine();
            shyness = shyness.substring(shyness.indexOf(' ')+1);
            int extra = 0;
            int total = 0;
            for (int i = 0; i < shyness.length(); ++i) {
                int shy = shyness.charAt(i)-'0';
                if (shy > 0) {
                    if (total < i) {
                        extra += i-total;
                        total = i;
                    }
                    total += shy;
                }
            }

            out.write(String.format("Case #%d: %d\n", c, extra));
        }
        out.close();
    }
}
