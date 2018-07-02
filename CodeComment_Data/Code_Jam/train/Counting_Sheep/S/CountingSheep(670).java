package methodEmbedding.Counting_Sheep.S.LYD1324;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingSheep {

    public static void main(String[] args) {
        String currentPath = Paths.get("").toAbsolutePath().toString();

        try {
            List<String> inputLines = Files.readAllLines(Paths.get(currentPath, args[0])),
                    outputLines = new ArrayList<>();
            int caseCount = Integer.valueOf(inputLines.get(0)),
                    currentCase = 1;

            while (currentCase <= caseCount) {
                Set<Integer> digits = new HashSet<>();
                long baseN = Long.valueOf(inputLines.get(currentCase)),
                        n = baseN;
                String result;
                if (baseN == 0) {
                    result = "INSOMNIA";
                } else {
                    while (true) {
                        for (char c : String.valueOf(n).toCharArray()) {
                            digits.add((int) c);
                        }
                        if (digits.size() == 10) {
                            result = String.valueOf(n);
                            break;
                        }
                        n += baseN;
                    }
                }

                outputLines.add(String.format("Case #%d: %s", currentCase++, result));
            }

            Files.write(Paths.get(currentPath, args[1]), outputLines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
