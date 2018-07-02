package methodEmbedding.Standing_Ovation.S.LYD584;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    private static final String INPUT_FILE = "/A-small-attempt1.in";
    private static final String OUTPUT_FILE = "src/main/resources/A-small-attempt1.out";

    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = A.class.getResourceAsStream(INPUT_FILE);
        Scanner scanner = new Scanner(inputStream);

        PrintWriter printWriter = new PrintWriter(new FileOutputStream(OUTPUT_FILE));

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            // read input
            int s_max = scanner.nextInt();
            String shynessStr = scanner.next();

            assert s_max == shynessStr.length();

            int[] shyness_level = new int[s_max + 1];
            for (int j = 0; j <= s_max; j++) {
                shyness_level[j] = shynessStr.charAt(j) - '0';
            }

            //
            int initialPeopleNumber = 0;
            for (int j = 0; j <= s_max; j++) {
                initialPeopleNumber += shyness_level[j];
            }

            // simulate ovation
            int standingPeopleNumber = 0;
            for (int j = 0; j <= s_max; j++) {
                if (j - standingPeopleNumber > 0) {
                    standingPeopleNumber += j - standingPeopleNumber;
                }
                standingPeopleNumber += shyness_level[j];
            }

            printWriter.print(String.format("Case #%d: %d%n", i + 1, standingPeopleNumber - initialPeopleNumber));
        }

        scanner.close();
        printWriter.close();
    }

}
