package methodEmbedding.Counting_Sheep.S.LYD1288;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kyle on 4/8/2016.
 */
public class QualificationRound_P1 {
    public static void main(String args[]) throws IOException {
        FileReader reader = new FileReader("C:\\A-small-attempt2.in");
        PrintWriter writer = new PrintWriter("A-small-output.out", "UTF-8");
        Scanner scanner = new Scanner(reader);
        int caseNumber = 1;

        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String arg = scanner.nextLine();
            String argCopy = arg;
            boolean skip = false;
            if (Integer.parseInt(arg) == 0) {
                writer.print("Case #" + caseNumber + ": INSOMNIA\n");
                skip = true;
            }

            ArrayList<Integer> digits = new ArrayList<>();

            int count = 2;
            while (digits.size() < 10 && !skip) {
                for (int j = 0; j < arg.length(); j++) {
                    char x = arg.charAt(j);
                    int compare = Character.getNumericValue(x);
                    if (!digits.contains(compare)) {
                        digits.add(compare);
                    }
                }

                if (digits.size() < 10) {
                    Integer blah = (Integer.parseInt(argCopy) * count);
                    count++;
                    arg = blah.toString();
                }

                if (count > 2 + 100) {
                    writer.print("Case #" + caseNumber + ": INSOMNIA\n");
                    skip = true;
                    break;
                }
            }

            if (!skip) {
                writer.print("Case #" + caseNumber + ": " + arg);
                if (scanner.hasNextLine())
                    writer.print("\n");
            }
            caseNumber++;
        }

        writer.close();
        reader.close();
    }
}
