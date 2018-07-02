package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1334;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class CookieZilla {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/alena/IdeaProjects/GoogleJam/src/B-small-attempt0.in"));
        scanner.useLocale(Locale.US);
        System.setOut(new PrintStream(new File("/Users/alena/IdeaProjects/GoogleJam/src/B-small-attempt0.out")));
        StringBuffer output = new StringBuffer();
        int cases = scanner.nextInt();
        int iterator = 1;
        while (iterator <= cases) {
            double time = 0;
            double f = 2.0;
            double input_c = scanner.nextDouble();
            double input_f = scanner.nextDouble();
            double input_x = scanner.nextDouble();
            if (input_x / f > input_c / f) {
                while ((input_x / f - input_x / (f + input_f)) > input_c / f) {
                    time += input_c / f;
                    f += input_f;
                }
                time += input_x / f;
            } else
                time = input_x / f;
            output.append(String.format(Locale.US, "Case #%d: %.7f%n", iterator, time));
            iterator++;
        }
        System.out.print(output);
    }

}
