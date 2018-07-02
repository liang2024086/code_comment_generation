package methodEmbedding.Magic_Trick.S.LYD1739;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

/**
 * Created by marius on 12/04/14.
 */
public class A {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/Users/marius/IdeaProjects/IntelliTest/src/A.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/Users/marius/IdeaProjects/IntelliTest/src/A.out")));

        int cases = Integer.parseInt(lines.get(0).trim());

        for (int c = 0; c < cases; c++) {
            int caseIndex = (c * 10 + 1);
            int answer1 = Integer.parseInt(lines.get(caseIndex));
            int answer2 = Integer.parseInt(lines.get(caseIndex + 5));

            List<Integer> cards1 = new ArrayList<Integer>();
            for (String s : lines.get(caseIndex + answer1).trim().split(" ")) {
                cards1.add(Integer.parseInt(s));
            }

            List<Integer> cards2 = new ArrayList<Integer>();
            for (String s : lines.get(caseIndex + answer2 + 5).trim().split(" ")) {
                cards2.add(Integer.parseInt(s));
            }

            cards1.retainAll(cards2);

            if (cards1.size() == 0) {
                writer.write(String.format("Case #%d: Volunteer cheated!", c + 1));
                writer.newLine();
//                System.out.println(String.format("Case #%d: Volunteer cheated!", c + 1));
            } else if (cards1.size() == 1) {
                writer.write(String.format("Case #%d: %d", c + 1, cards1.get(0)));
                writer.newLine();
//                System.out.println(String.format("Case #%d: %d", c + 1, cards1.get(0)));
            } else {
                writer.write(String.format("Case #%d: Bad magician!", c + 1));
                writer.newLine();
//                System.out.println(String.format("Case #%d: Bad magician!", c + 1));
            }


        }

        writer.flush();
        writer.close();

    }

}
