package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1166;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {

    public static void main(String[] args) throws NumberFormatException, IOException, URISyntaxException {
        int caseNum = 0;
        List<String> lines = new ArrayList<>();
        for (String line : Files.readAllLines(Paths.get(ClassLoader.getSystemResource("second.txt").toURI()))) {
            if (caseNum == 0) {
                ++caseNum;
                continue;
            }
            if (!line.contains("-")) {
                lines.add(String.format("Case #%s: 0", caseNum));
                ++caseNum;
                continue;
            }

            int groups = 0;
            Pattern patt = Pattern.compile("((.)\\2*)");
            Matcher match = patt.matcher(line);
            while(match.find()) {
                ++groups;
            }
            if (line.endsWith("+")) {
                --groups;
            }

            lines.add(String.format("Case #%s: %s", caseNum, groups));
            ++caseNum;
        }
        Files.write(Paths.get("second.txt"), lines, StandardOpenOption.TRUNCATE_EXISTING);

    }
}
