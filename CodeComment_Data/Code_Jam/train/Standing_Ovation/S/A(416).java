package methodEmbedding.Standing_Ovation.S.LYD101;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class A {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader input
                = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\input_small.txt"));
        try (PrintStream output
                = new PrintStream(new File(System.getProperty("user.dir") + "\\output_small.txt"))) {

            final int TESTS = Integer.parseInt(input.readLine());
            for (int t = 1; t <= TESTS; t++) {
                String[] vals = input.readLine().split(" ");
                int count = 0;
                int curr = 0;
                for (int i = 0; i < vals[1].length(); i++) {
                    count += Math.max(0, i - curr);
                    curr = Math.max(curr , i);
                    curr += (vals[1].charAt(i) - '0');
                }

                output.println("Case #" + t + ": " + count);
            }
        }
    }
}
