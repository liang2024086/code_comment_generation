package methodEmbedding.Cookie_Clicker_Alpha.S.LYD316;


import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class ProblemB {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        SimpleFormatter sf = new SimpleFormatter();

        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            double c = sc.nextDouble();
            double f = sc.nextDouble();
            double x = sc.nextDouble();
            double r = 2.0;
            double time = 0.0;
            while (true) {
                double t1 = x / r;
                double t2 = c / r + x / (r + f);
                if (t1 > t2) {
                    time += c / r;
                    r += f;
                } else {
                    time += t1;
                    break;
                }
            }
            System.out.println("Case #" + k + ": " + String.format("%.7f", time));
        }

//        System.out.printf("Time taken : %.5f minutes\n", (System.currentTimeMillis() - start) / 60000.0);
    }
}
