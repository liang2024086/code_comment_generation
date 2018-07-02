package methodEmbedding.Counting_Sheep.S.LYD1222;


import qualification_round.A;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Template utile pour faciliter la r??solution d'un probl??me de type Google Code
 * Jam. On lira le fichier d'input par l'entr??e standard, et on r??cuperera le
 * fichier output par la sortie standard.
 * Tr??s largement inspir?? de la solution propos??e par darnley.
 * @author maxime
 *
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException, FileNotFoundException {

        String filePrefix= "A-small-attempt0";

        // Input
    /*
     * Pour r??cuperer des double, qui sont repr??sent??s par un point, et non une
     * virgule comme en francais.
     */
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(new BufferedReader(new FileReader(new File(filePrefix + ".in"))));
    /*
     * Le tableau qui stockera les r??sultats.
     * (L'output en lui-m??me sera g??r?? par System.out)
     */
        // On r??cup??re d'abord le nombre de tests.
        int nbTests = in.nextInt();
        // On passe ?? la ligne suivante (on mange le \n)
        in.nextLine();
        Future<String>[] output = new Future[nbTests];
    /*
     * Gestion du pool de threads
     */
        // On r??cup??re le nombre de processeurs disponibles.
        int N_CPUS = Runtime.getRuntime().availableProcessors();
        // On cr??e un pool de threads de taille N_CPUS + 1.
        ExecutorService pool = Executors.newFixedThreadPool(N_CPUS + 1);

        // Boucle principale
        for(int n = 1; n <= nbTests; ++n){
            final Problem test = new A(in);
            final int testNumber = n;
            output[n - 1] = pool.submit(() -> {
                // On r??cup??re la solution
                String solution = test.compute();
                return "Case #" + testNumber + ": " + solution;
            });
        }

        PrintWriter out = new PrintWriter(new File(filePrefix + ".out"));

        for(int i = 0; i < nbTests; ++i){
            out.println(output[i].get());
        }
        in.close();
        out.close();
        pool.shutdown();

    }

}
