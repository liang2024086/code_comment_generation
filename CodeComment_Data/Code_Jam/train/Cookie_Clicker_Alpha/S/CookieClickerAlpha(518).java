package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1464;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author biman
 */
public class CookieClickerAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File input_file = new File("/home/biman/input.in");
        File output_file = new File("/home/biman/output.txt");
        try {
            Scanner scanner = new Scanner(input_file, "UTF-8");
            PrintWriter out = new PrintWriter(output_file);

            int test_case = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < test_case; i++) {
                double C, F, X;
                String line = scanner.nextLine();
                String values[] = line.split(" ");
                C = Double.parseDouble(values[0]);
                F = Double.parseDouble(values[1]);
                X = Double.parseDouble(values[2]);

                double buy_time = 0.0, total_time = X / 2.0;
                double rate = 2.0;
                for (int j = 1;; j++) {
                    double new_buy_time, new_total_time;
                    new_buy_time = buy_time + (C / rate);

                    rate += F;
                    new_total_time = new_buy_time + X / rate;

                    if (new_total_time > total_time) {
                        break;
                    } else {
                        buy_time = new_buy_time;
                        total_time = new_total_time;
                    }
                }
                out.printf("Case #%d: %.7f\n", (i + 1), total_time);
                System.out.printf("Case #%d: %.7f\n", (i + 1), total_time);
            }
            out.close();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Could not open File");
        }

    }
}
