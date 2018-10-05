package methodEmbedding.Standing_Ovation.S.LYD1238;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Problem A. Standing Ovation
 * @author Pavel Janecka
 */
public class StandingOvation {
    private final String path = "01-A-small-attempt1";
    private final String inExt = ".in";
    private final String outExt = ".out";

    public StandingOvation() throws IOException {
        Stream<String> lines = Files.lines(Paths.get(path + inExt));
        List<Integer> results = lines.skip(1).mapToInt(value -> {
            String[] set = value.split(" ");
            int max = Integer.valueOf(set[0]);
            int invites = 0;
            String people = set[1];
            for (int idx = 0, shyness = 0; shyness < max; idx++) {
                shyness += Character.getNumericValue(people.charAt(idx));
                if (shyness < idx + 1) {
                    shyness++;
                    invites++;
                }
            }
            return invites;
        }).boxed().collect(Collectors.toList());
        try (FileWriter fileWriter = new FileWriter(new File(path + outExt))) {
            for (int idx = 0; idx < results.size(); idx++) {
                fileWriter.write("Case #" + (idx + 1) + ": " + results.get(idx) + System.lineSeparator());
            }
        }
    }

    public static void main(String[] args) {
        try {
            new StandingOvation();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
