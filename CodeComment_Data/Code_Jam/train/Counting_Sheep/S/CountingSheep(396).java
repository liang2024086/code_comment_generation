package methodEmbedding.Counting_Sheep.S.LYD69;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

import gcj.gcj.Pancakes.InputReader;

public class CountingSheep {

    private static final String INPUT_FILE = "/home/elinow/Downloads/A-small-attempt0.in";
    // private static final String INPUT_FILE = "/home/elinow/Downloads/A-large.in";
    private static final String OUTPUT_FOLDER = "/home/elinow/workspaces/algo/gcj/src/main/java/gcj/gcj/";
    private static final String OUTPUT_FILE = "A-small.out";

    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader(new FileInputStream(INPUT_FILE));
        // InputReader in = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(new File(OUTPUT_FOLDER, OUTPUT_FILE));
        int limit = 72;
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int num = in.nextInt();
            String resStr;
            if (num > 0) {
                Set<Character> usedChars = new TreeSet<>();
                int ind = 1;
                while (usedChars.size() < 10 && ind <= limit) {
                    char[] chars = String.valueOf(ind * num).toCharArray();
                    for (char c : chars) {
                        usedChars.add(c);
                    }
                    ind++;
                }
                resStr = String.format("Case #%d: %d", t, (ind - 1) * num);
            } else {
                resStr = String.format("Case #%d: INSOMNIA", t);
            }
            pw.println(resStr);
            System.out.println(resStr);
        }
        pw.close();

    }

}
