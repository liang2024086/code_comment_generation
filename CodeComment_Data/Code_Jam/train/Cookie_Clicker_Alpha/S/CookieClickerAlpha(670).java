package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1335;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejo
 */
public class CookieClickerAlpha {

    private static int numCases;
    private static double c, f, x;
    private static Scanner scan = new Scanner(System.in);
    private static double[] tiempos = new double[100];

    public static void main(String args[]) {

        double r = 2.0;
        double tiempoTotal = 0.0;
        double tiempoCookie = 0.0;
        double tiempoTotalSiguiente = 0.0;
        double tiempoConsumido = 0.0;

        numCases = scan.nextInt();

        for (int i = 0; i < numCases; i++) {

            c = scan.nextDouble();
            f = scan.nextDouble();
            x = scan.nextDouble();

            tiempoConsumido = 0.0;
            r = 2.0;

            boolean seguir = true;
            while (seguir) {

                tiempoTotal = tiempoConsumido + (x / r);
                tiempoCookie = c / r;

                tiempoConsumido += tiempoCookie;

                tiempoTotalSiguiente = tiempoConsumido + (x / (r + f));
                if (tiempoTotalSiguiente > tiempoTotal) {
                    seguir = false;
                } else {
                    r = r + f;
                }
            }
            tiempos[i] = tiempoTotal;
        }


        FileWriter write = null;
        try {
            write = new FileWriter(new File("output.txt"));
        } catch (IOException ex) {
        }
        PrintWriter printer = new PrintWriter(write);

        for (int i = 0; i < numCases; i++) {
            System.out.printf("Case #%d: %.7f\n", (i + 1), tiempos[i]);

            printer.printf("Case #%d: %.7f\n", (i + 1), tiempos[i]);

        }
        printer.close();
    }
}
