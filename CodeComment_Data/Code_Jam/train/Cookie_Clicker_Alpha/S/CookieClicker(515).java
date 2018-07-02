package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1043;


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class CookieClicker {
    private static final String INFILE = "in/CookieClicker/B-small-attempt0.in";

    private static final String OUTFILE = "out/CookieClicker/B-small-attempt0.out";

    public static void main(String[] args) throws Exception {
        String result = "";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTFILE))) {
            try (Scanner scanner = new Scanner(new FileInputStream(INFILE))) {
                scanner.useLocale(Locale.ENGLISH);
                scanner.useLocale(Locale.ENGLISH);

                int T = scanner.nextInt();
                scanner.nextLine();

                for (int p = 1; p <= T; ++p) {

                    double C = scanner.nextDouble();
                    double F = scanner.nextDouble();
                    double X = scanner.nextDouble();

                    double rate = 2.0;
                    double spent = 0.0;

                    while (true) {

                        double tc = C / rate;
                        double tx = X / rate;
                        double tn = tc + (X / (rate + F));

                        if (tx <= tn) {
                            spent += tx;
                            result = String.format(Locale.ENGLISH, "%.7f", spent);
                            break;
                        }

                        spent += tc;
                        rate += F;

                    }

                    writer.write("Case #" + p + ": " + result);

                    if (p < T) {
                        writer.newLine();
                    }
                }
            }
        }
    }
}
