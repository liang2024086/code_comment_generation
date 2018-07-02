package methodEmbedding.Standing_Ovation.S.LYD370;


import java.io.*;

import static java.lang.Integer.parseInt;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        File file = new File("A-small-attempt0.in");
        File outFile = new File("target/A-small-attempt0.out");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
        int testCases = parseInt(br.readLine());
        for (int t = 1; t <= testCases; t++) {
            String[] parts = br.readLine().split(" ");
            int maxLevel = parseInt(parts[0]);
            int additionals = 0;
            int standers = 0;
            for (int level = 0; level <= maxLevel; ++level) {
                int membersAtThisLevel = parseInt("" + parts[1].charAt(level));
                if (level == 0) {
                    standers += membersAtThisLevel;
                } else {
                    if (standers < level) {
                        int gap = level - standers;
                        additionals += gap;
                        standers += gap;
                    }
                    standers += membersAtThisLevel;
                }
            }

            String str = "Case #" + t + ": " + additionals + "\n";
//            System.out.print("str = " + str);
            bw.write(str);
        }
        br.close();
        bw.close();
    }
}
