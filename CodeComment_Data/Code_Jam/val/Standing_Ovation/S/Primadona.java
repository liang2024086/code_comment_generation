package methodEmbedding.Standing_Ovation.S.LYD550;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;

/**
 * Please write comment.
 *
 * @author Alexey Gadalin
 */
public class Primadona {

    private static final String FILE_PATTERN = "A-small-attempt3";

    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(FileSystems.getDefault().getPath(FILE_PATTERN + ".in"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE_PATTERN + ".out")));
        int lines = Integer.parseInt(strings.get(0).trim());
        for (int i = 1; i <= lines; i++) {
            String line = strings.get(i).trim();
            int maxS = line.charAt(0) - 48;
            line = line.substring(2, maxS + 2 + 1);
            int friends = 0;
            int stending = 0;
            for (int k = 0; k <= maxS; k++) {
                int peopleAtLevel = line.charAt(k) - 48;
                if (k != 0 && stending < k && peopleAtLevel != 0) {
                    int moreFriends = k - stending;
                    friends += moreFriends;
                    stending += moreFriends;
                }
                stending += peopleAtLevel;
            }
            writer.write("Case #" + i + ": " + friends);
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }
}
