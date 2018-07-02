package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1520;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        PrintWriter writer = new PrintWriter(new FileWriter("answer.txt"));

        for (int nt = 1; nt <= T; nt++) {
            double C, F, X, N = 2;
            C = in.nextDouble();
            F = in.nextDouble();
            X = in.nextDouble();
            double t = 0;

            while (true) {
                if (Math.abs(X) < 1e-6)
                    break;

                double X0 = C*N/F + C;
                if (X <= X0) {
                    t += X/N;
                    break;
                } else {
                    t += C/N;
                    N += F;
                }
                System.out.println(X0);
            }

            writer.print(String.format("Case #%d: %.7f\n", nt, t));
        }

        writer.close();
    }
}
