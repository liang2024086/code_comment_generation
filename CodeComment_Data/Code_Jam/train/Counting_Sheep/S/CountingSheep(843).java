package methodEmbedding.Counting_Sheep.S.LYD252;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mats on 09/04/16.
 */
public class CountingSheep {
    public static void main(String[] args) throws IOException {
        String filename = "A-small-attempt0.in";

        BufferedReader buffer = new BufferedReader(new FileReader("input/" + filename));

        int T = Integer.parseInt(buffer.readLine());

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            builder.append("Case #");
            builder.append(i);
            builder.append(": ");

            long N = Long.parseLong(buffer.readLine());

            if (N == 0) {
                builder.append("INSOMNIA\n");
                continue;
            }

            Set<Character> numbers = new HashSet<>();
            long n = 0;
            while (numbers.size() < 10) {
                n = n + N;
                char[] chars = Long.toString(n).toCharArray();
                for (char c : chars) {
                    numbers.add(c);
                }
            }
            builder.append(n);
            builder.append("\n");
        }

        Files.write(Paths.get("output/" + filename), builder.toString().getBytes());
    }
}
