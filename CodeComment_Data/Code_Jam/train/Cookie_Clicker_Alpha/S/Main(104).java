package methodEmbedding.Cookie_Clicker_Alpha.S.LYD798;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try(
                BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
                PrintWriter out = new PrintWriter("B-small-attempt0.out");
                )
        {
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int t = Integer.parseInt(tokens.nextToken());
            for (int tt = 1; tt <= t; tt++) {
                tokens = new StringTokenizer(in.readLine());
                double c = Double.parseDouble(tokens.nextToken());
                double f = Double.parseDouble(tokens.nextToken());
                double x = Double.parseDouble(tokens.nextToken());
                double time = 0;
                double currentRate = 2;
                while (x / currentRate > c / currentRate + x / (currentRate + f)) {
                    time += c / currentRate;
                    currentRate += f;
                }
                time += x / currentRate;
                out.println("Case #" + tt + ": " + time);
            }
        }
    }
}
