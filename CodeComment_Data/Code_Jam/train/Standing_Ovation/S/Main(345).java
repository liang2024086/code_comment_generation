package methodEmbedding.Standing_Ovation.S.LYD1510;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Rabo on 12.04.2015.
 */
public class Main {

    public static final String INPUT = "input.txt";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File(INPUT));
        PrintWriter writer = new PrintWriter(new FileWriter(new File("output.txt")));
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int s = scanner.nextInt();
            String str = scanner.next();
            int result = 0;
            int people = 0;
            for (int j = 0; j < str.length(); ++j) {
                if (str.charAt(j) == '0' && people <= j) {
                    result++;
                    people++;
                } else {
                    people += (str.charAt(j) - '0');
                }
            }
            writer.println("Case #" + (i + 1) + ": " + result);
        }
        writer.close();
    }
}
