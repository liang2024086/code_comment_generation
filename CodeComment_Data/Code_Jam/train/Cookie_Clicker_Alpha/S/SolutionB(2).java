package methodEmbedding.Cookie_Clicker_Alpha.S.LYD843;

import java.io.*;
import java.util.*;


public class SolutionB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nt = sc.nextInt();

        for (int t = 1; t <= nt; ++t) {
            double c = sc.nextDouble();
            double f = sc.nextDouble();
            double x = sc.nextDouble();
            double sum = 0.;
            double time = 0.;
            double speed = 2.;

            while (sum < x) {
                double eta = (x - sum) / speed;
                if (sum >= c) {
                    if (c / (speed + f) + (x - sum) / (speed + f) < eta) {
                        sum -= c;
                        speed += f;
                    } else {
                        time += eta;
                        sum = x;
                    }
                } else {
                    if ((c - sum) / speed < eta) {
                        time += (c - sum) / speed;
                        sum = c;
                    } else {
                        time += eta;
                        sum = x;
                    }
                }
            }

            System.out.format("Case #%d: ", t);
            System.out.println(time);
        }
    }
}
