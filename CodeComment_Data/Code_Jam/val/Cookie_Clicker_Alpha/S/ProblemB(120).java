package methodEmbedding.Cookie_Clicker_Alpha.S.LYD955;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemB {

    static int T;
    static double C, F, X;


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        scanner = new Scanner(new FileReader("ProblemB.txt"));
        FileWriter fileWriter = new FileWriter("ProblemB.out");
        BufferedWriter bw = new BufferedWriter(fileWriter);

        T = scanner.nextInt();
        for (int testNumber = 1; testNumber <= T; ++testNumber) {
            C = scanner.nextDouble();
            F = scanner.nextDouble();
            X = scanner.nextDouble();

            double currentCost = 2;
            double best = X / currentCost;
            double answer = X;
            double time = 0;
            while (answer > best) {
                answer = best;
                time += C / currentCost;
                currentCost += F;
                best = time + X / currentCost;
            }
            DecimalFormat df = new DecimalFormat("#.#######");
            bw.write("Case #" + testNumber + ": " + df.format(answer));
            bw.newLine();
            //DecimalFormat df = new DecimalFormat("#.#######");
            //System.out.println("Case #" + testNumber + ": " + df.format(answer));
        }
        bw.close();
    }
}
