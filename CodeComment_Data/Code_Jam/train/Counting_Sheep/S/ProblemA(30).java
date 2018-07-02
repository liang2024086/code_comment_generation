package methodEmbedding.Counting_Sheep.S.LYD926;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProblemA {

    private static final String TEST_PATHS = "/Users/boney/projects/codejam/inout/";

    public static void main(String[] args) throws IOException {
        String problemA = "ProblemA";
        FileWriter fw = new FileWriter(TEST_PATHS + problemA + ".out");
        Scanner in = new Scanner(new FileInputStream(TEST_PATHS + problemA + ".in"));

        SortedSet<Character> fullSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            fullSet.add(Character.forDigit(i, 10));
        }
        System.out.println(fullSet);

        int totalTests = in.nextInt();
        for (int i = 0; i < totalTests; i++) {
            int x = in.nextInt();
            SortedSet<Character> chars = new TreeSet<>();
            int y = 1;
            if(x == 0) {
                fw.write("Case #" + (i+1) + ": INSOMNIA\n");
            } else {
                int z = x;
                while (!fullSet.equals(chars)) {
                    z = y++ * x;
                    for (Character aChar : String.valueOf(z).toCharArray()) {
                        chars.add(aChar);
                    }
                    System.out.println(z + " " + y + " " + chars);
                }
                fw.write("Case #" + (i+1) + ": " + z + "\n");
            }

        }
        fw.flush();
        fw.close();
    }

}
