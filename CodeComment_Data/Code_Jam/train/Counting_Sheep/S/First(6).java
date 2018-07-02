package methodEmbedding.Counting_Sheep.S.LYD388;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class First {

    public static void main(String[] args) throws IOException, URISyntaxException {
        int caseNum = 0;
        int multiplier = 2;
        List<String> lines = new ArrayList<>();
        Set<Character> seen = new HashSet<>();
        for (String line : Files.readAllLines(Paths.get(ClassLoader.getSystemResource("first.txt").toURI()))) {
            if (caseNum == 0) {
                ++caseNum;
                continue;
            }
            Long n = Long.parseLong(line);
            if (n == 0) {
                lines.add(String.format("Case #%s: INSOMNIA", caseNum));
                ++caseNum;
                continue;
            }

            while (seen.size() < 10) {
                seen.addAll(String.valueOf(n).chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
                if (seen.size() == 10) {
                    lines.add(String.format("Case #%s: %s", caseNum, n));
                } else {
                    n = Long.parseLong(line) * multiplier;
                    ++multiplier;
                }
            }

            seen.clear();
            multiplier = 2;
            ++caseNum;
        }
        Files.write(Paths.get("first.out"), lines, StandardOpenOption.TRUNCATE_EXISTING);

    }


}
