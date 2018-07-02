package methodEmbedding.Counting_Sheep.S.LYD855;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class problemA {
    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("data/A-small-attempt0.in"));
        Integer testCaseAmount = Integer.valueOf(strings.get(0));
        for (int i = 1; i <= testCaseAmount; i++) {
            Set<String> digits = new HashSet<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
            String starting = strings.get(i);
            String current = starting;
            String last;

            for (int j = 1; j < 100000; j++) {
                String[] chars = current.split("");
                digits.removeAll(Arrays.asList(chars));
                if (digits.isEmpty()) {
                    System.out.println(String.format("Case #%d: %s", i, current));
                    break;
                }
                last = current;
                current = String.valueOf(Long.valueOf(starting) * (j + 1));
                if (last.equals(current)) {
                    System.out.println(String.format("Case #%d: INSOMNIA", i));
                    break;
                }
            }
        }
    }
}
