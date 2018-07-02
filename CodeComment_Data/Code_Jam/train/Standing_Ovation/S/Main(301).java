package methodEmbedding.Standing_Ovation.S.LYD2148;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(args[0]));
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("solution.out"));

        int tests = Integer.valueOf(lines.get(0));
        for (int i = 1; i <= tests; i++) {
            String[] input = lines.get(i).split(" ");
            int maxShy = Integer.valueOf(input[0]);
            String audience = input[1];

            int friends = 0;
            int ovates = 0;

            for (int j = 0; j <= maxShy; j++) {
                int shyPeople = Character.getNumericValue(audience.charAt(j));
                if (shyPeople == 0) {
                    continue;
                }

                if (ovates < j) {
                    int diff = j - ovates;
                    friends += diff;
                    ovates += diff + shyPeople;
                } else {
                    ovates += shyPeople;
                }

                if (ovates >= maxShy) {
                    break;
                }
            }

            writer.write(String.format("Case #%d: %d%n", i, friends));
        }

        writer.flush();
        writer.close();
    }
}
