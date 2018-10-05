package methodEmbedding.Revenge_of_the_Pancakes.S.LYD817;

import java.io.*;

public class Main {

    static BufferedReader reader;
    static BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
        writer = new BufferedWriter(new FileWriter("result.txt"));

        int T = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= T; i++) {
            String[] sPancakes = reader.readLine().split("");
            int length = sPancakes.length;

            int[] pancakes = new int[length];
            for (int j = 0; j < length; j++) {
                if (sPancakes[j].equals("+")) {
                    pancakes[j] = 1;
                } else {
                    pancakes[j] = -1;
                }
            }

            long counter = 0;
            while (true) {
                int k = 0;
                while (k < length && pancakes[k] == 1) {
                    k++;
                }
                if (k == length && pancakes[k - 1] == 1) {
                    break;
                } else {
                    if (k != 0) {
                        // flip all "+" on top
                        for (int j = 0; j < k; j++) {
                            pancakes[j] *= -1;
                        }
                        counter++;
                    }

                    while (k < length && pancakes[k] == -1) {
                        k++;
                    }

                    // flip all "-" on top
                    for (int j = 0; j < k; j++) {
                        pancakes[j] *= -1;
                    }
                    counter++;
                }
            }

            writer.write("Case #" + i + ": " + counter + "\n");
        }

        reader.close();
        writer.close();
    }
}
