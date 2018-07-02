package methodEmbedding.Cookie_Clicker_Alpha.S.LYD443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for (int i=1; i<=T; i++) {
            StringTokenizer tok = new StringTokenizer(reader.readLine());
            double C = Double.parseDouble(tok.nextToken());
            double F = Double.parseDouble(tok.nextToken());
            double X = Double.parseDouble(tok.nextToken());
            int N = (int) Math.ceil((X-C)/C -2/F);
            if (N < 0) N = 0;
            double time = 0;
            for (int j=0; j<N; j++) {
                time += C / (2 + j*F);
            }
            time += X / (2 + N*F);

            System.out.printf("Case #%d: %f\n", i, time);
        }
    }
}

