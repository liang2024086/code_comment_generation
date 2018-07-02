package methodEmbedding.Counting_Sheep.S.LYD938;

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader reader;
    static BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
        writer = new BufferedWriter(new FileWriter("result.txt"));

        int T = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= T; i++) {
            long N = Long.parseLong(reader.readLine());
            if (N == 0) {
                writer.write("Case #" + i + ": " + "INSOMNIA" + "\n");
                continue;
            }

            String[] digits = String.valueOf(N).split("");
            Set<String> set = new HashSet<>(Arrays.asList(digits));

            long tmp = N;
            while (set.size() != 10) {
                tmp += N;
                digits = String.valueOf(tmp).split("");
                set.addAll(Arrays.asList(digits));
            }
            writer.write("Case #" + i + ": " + tmp + "\n");
        }

        reader.close();
        writer.close();
    }
}
