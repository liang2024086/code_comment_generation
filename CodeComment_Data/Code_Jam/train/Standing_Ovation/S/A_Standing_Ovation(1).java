package methodEmbedding.Standing_Ovation.S.LYD1524;

import com.google.common.io.CharStreams;
import com.google.common.primitives.Chars;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_Standing_Ovation extends Exercise {

    public static void main(String[] args) throws IOException {
        List<String> cases = readLines("/Users/max/Downloads/A-small-attempt3.in");
        List<String> lines = new ArrayList<>();

        for (int caseId = 1; caseId < cases.size(); caseId++) {
            String[] parts = cases.get(caseId).split(" ");
            int maxShyness = Integer.valueOf(parts[0]);
            int[] counts = Chars.asList(parts[1].toCharArray()).stream().mapToInt( c -> Integer.valueOf("" + c)).toArray();
            int alreadyClapping = 0;
            int needMore = 0;

            for (int shyness = 0; shyness < counts.length; shyness++) {
                int currentShynessCount = counts[shyness];
                if(currentShynessCount > 0 && alreadyClapping < shyness) {
                    needMore += shyness - alreadyClapping;
                    alreadyClapping += shyness - alreadyClapping;
                }

                alreadyClapping += currentShynessCount;
            }

            lines.add("Case #" + caseId + ": " + needMore);
            System.out.println(lines.get(lines.size() - 1) + "\t" + cases.get(caseId));
        }

        writeLines("/Users/max/Downloads/A-small-practice.out", lines);
    }

}
