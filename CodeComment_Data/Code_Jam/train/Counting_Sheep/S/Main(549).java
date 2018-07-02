package methodEmbedding.Counting_Sheep.S.LYD1181;

import java.io.*;
import java.util.HashSet;

/**
 * Created by petergok on 4/9/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.in"));
        int numLines = Integer.parseInt(br.readLine().trim());

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.out"));

        for (int test = 0; test < numLines; test++) {
            int number = Integer.parseInt(br.readLine().trim());

            if (number == 0) {
                bw.write("Case #" + (test + 1) + ": INSOMNIA\n");
                continue;
            }

            int lastNumber = -1;
            int multiplier = 1;

            HashSet<Integer> digits = new HashSet<Integer>();
            while (digits.size() < 10) {
                int currentNum = number * multiplier;
                lastNumber = currentNum;

                while (currentNum > 0) {
                    int digit = currentNum % 10;
                    currentNum /= 10;
                    digits.add(digit);
                }

                multiplier++;
            }

            if (digits.size() == 10) {
                bw.write("Case #" + (test + 1) + ": " + lastNumber + "\n");
            }
        }
        bw.close();
    }
}
