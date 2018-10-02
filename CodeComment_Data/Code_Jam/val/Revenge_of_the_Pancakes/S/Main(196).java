package methodEmbedding.Revenge_of_the_Pancakes.S.LYD396;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        final String FILE = "B-small-attempt0";
        PrintWriter outPrinter = new PrintWriter(new File("C:\\Users\\ivo.correia\\Downloads\\" + FILE  + ".out"));

        Scanner scanIn = new Scanner(new File("C:\\Users\\ivo.correia\\Downloads\\" + FILE + ".in"));
        final int N = Integer.parseInt(scanIn.nextLine());

        for (int entries = 0; entries < N; entries++) {
            String pancakes = scanIn.nextLine();

            int noMoves = 0;
            char prev = pancakes.charAt(0);
            for (int i = 0; i < pancakes.length(); i++) {
                char curr = pancakes.charAt(i);

                if (curr != prev){
                    noMoves++;
                }

                prev = curr;
            }

            if (pancakes.charAt(pancakes.length() -1) == '-') {
                noMoves++;
            }

            outPrinter.write("Case #" + (entries + 1) + ": " + noMoves + "\n");
        }

        outPrinter.close();
        scanIn.close();
    }

}
