package methodEmbedding.Revenge_of_the_Pancakes.S.LYD623;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by silver_android on 08/04/16.
 */
public class E2 {

    private static final String INPUT_FILE = "B-small-attempt0.in";
    private static final String OUTPUT_FILE = "output.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
        int testCaseNum = Integer.parseInt(reader.readLine());
        PrintWriter writer = new PrintWriter(OUTPUT_FILE);
        for (int i = 1; i <= testCaseNum; i++) {
            String line = reader.readLine();
            int notHappy = -1;
            char[] characters = new char[line.length()];
            for (int j = characters.length - 1; j > -1; j--) {
                char c = line.charAt(j);
                if (c == '-') {
                    notHappy = notHappy == -1 ? j : notHappy;
                }
                characters[j] = c;
            }
            System.out.print("Initial: ");
            System.out.println(characters);
            boolean valid = true;
            int counter = 0;
            if (notHappy != -1) {
                counter++;
            }
            do {
                int lastMinus = -1;
                boolean doNotStop = false;
                System.out.println(notHappy);
                for (int j = notHappy; j > -1; j--) {
                    characters[j] = characters[j] == '-' ? '+' : '-';
                    if (characters[j] == '-') {
                        doNotStop = true;
                        valid = false;
                        lastMinus = lastMinus == -1 ? j : lastMinus;
                    }
                }
                System.out.println(characters);
                notHappy = lastMinus;
                if (!doNotStop) {
                    valid = true;
                } else {
                    counter++;
                }
            } while (!valid);
            writer.printf("Case #%d: %d%n", i, counter);
        }
        writer.close();
    }
}
