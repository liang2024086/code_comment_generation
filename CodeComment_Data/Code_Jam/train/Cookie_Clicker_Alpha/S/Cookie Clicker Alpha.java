package methodEmbedding.Cookie_Clicker_Alpha.S.LYD642;


import java.util.*;
import java.io.*;

public class CookieClickerAlpha {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.in"));
        int T = input.nextInt();
        double C, F, X, currProd, time, temp;
        for (int cases = 1; cases <= T; cases++) {
            C = input.nextDouble();
            F = input.nextDouble();
            X = input.nextDouble();
            time = 0;
            currProd = 2;
            while (true) {
                temp = C / currProd;
                if (temp + X / (F + currProd) < X / currProd) {
                    time += temp;
                    currProd += F;
                } else {
                    break;
                }
            }
            System.out.printf("Case #%d: %.7f\n", cases, time + X / currProd);
        }
    }
}
