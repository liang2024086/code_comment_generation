package methodEmbedding.Counting_Sheep.S.LYD933;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingSheep {

    public static void main(String[] args) throws IOException {
        List<String> inputValues = new ArrayList<String>();
        Files.lines(Paths.get(args[0])).skip(1).forEach(s -> inputValues.add(s));

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < inputValues.size(); j++) {
            sb.append("Case #" + (j+1) + ": ");
            int value = Integer.valueOf(inputValues.get(j));

            if (value == 0) {
                sb.append("INSOMNIA");
            } else {
                // List<Integer> numbers = new ArrayList<Integer>();
                // IntStream.range(0, 10).forEach(s -> numbers.add(s));
                String numbers = "0123456789";
                String currentSheep = String.valueOf(value);
                int i = 1;
                while (!numbers.isEmpty()) {
                    Set<String> digits = new HashSet<String>();
                    currentSheep = String.valueOf(i++ * value);
                    currentSheep.chars().mapToObj(digit -> String.valueOf((char) digit)).forEach(s -> {
                        digits.add(s);
                    });

                    for (String digit : digits) {
                        if (numbers.indexOf(digit) != -1) {
                            numbers = numbers.replaceAll(digit, "");
                        }
                    }
                }
                sb.append(currentSheep);
            }

            sb.append("\n");
        }

        Path path = Paths.get(args[1]);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(sb.toString());
        }
    }

}
