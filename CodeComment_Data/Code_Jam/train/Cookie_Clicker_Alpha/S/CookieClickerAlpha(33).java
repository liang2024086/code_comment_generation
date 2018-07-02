package methodEmbedding.Cookie_Clicker_Alpha.S.LYD134;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *
 * @author Ali Akrami
 */
public class CookieClickerAlpha {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
        FileWriter fw = new FileWriter("A-small.out");

        int T = new Integer(in.readLine());
        double S, C, F, X, Time;
        String[] P;

        for (int cases = 1; cases <= T; cases++) {
            P = in.readLine().split(" ");

            C = new Double(P[0]);
            F = new Double(P[1]);
            X = new Double(P[2]);
            S = 2;
            Time = 0;

            while ((C / S + X / (S + F)) < X / S) {
                Time += C / S;
                S += F;
            }

            fw.write("Case #" + cases + ": " + String.format("%.7f", Time + X / S) + "\n");
        }
        fw.flush();
        fw.close();
    }
}
