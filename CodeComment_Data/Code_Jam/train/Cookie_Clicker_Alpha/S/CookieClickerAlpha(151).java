package methodEmbedding.Cookie_Clicker_Alpha.S.LYD674;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("B-small-attempt0.in"));
        PrintStream out = new PrintStream(new FileOutputStream("B-small-attempt0.out"));
        int nTests = scanner.nextInt();
        for (int test = 1; test <= nTests; test++) {
            final double c = scanner.nextDouble();
            final double f = scanner.nextDouble();
            final double x = scanner.nextDouble();
            double crtSpeed = 2f;
            double crtAcquired = 0f;
            double crtTime = 0f;
            while (crtAcquired < x) {
                // should we wait or should we buy?
                if ((crtAcquired >= c) && ((x - crtAcquired) / crtSpeed >= (x - (crtAcquired - c)) / (crtSpeed + f))) {
                    // we should buy
                    crtAcquired -= c;
                    crtSpeed += f;
                }
                double nextDeltaTime = Math.min((x-crtAcquired)/crtSpeed, c > crtAcquired ?( c - crtAcquired)/crtSpeed : Double.POSITIVE_INFINITY);
                crtAcquired += crtSpeed * nextDeltaTime;
                crtTime += nextDeltaTime;
            }
            out.printf("Case #%d: %.7f\n", test, crtTime);
        }
        out.close();
    }
}
