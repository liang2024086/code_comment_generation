package methodEmbedding.Standing_Ovation.S.LYD546;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ProblemA {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("A-small.in"));
            PrintWriter out = new PrintWriter(new FileWriter("A-small.out"));

            int T = Integer.parseInt(in.readLine());
            for(int kase = 1; kase <= T; kase++) {
                int ans = 0;

                StringTokenizer strtok = new StringTokenizer(in.readLine());
                int Smax = Integer.parseInt(strtok.nextToken());
                String str = strtok.nextToken();
                int[] audience = new int[Smax + 1];

                for(int i = 0; i < Smax + 1; i++) {
                    audience[i] = Integer.parseInt(str.charAt(i) + "");
                }

                int totalAudience = audience[0];

                for(int shyness = 1; shyness < Smax + 1; shyness++) {
                    if(totalAudience < shyness) {
                        int diff = shyness - totalAudience;
                        ans += diff;
                        totalAudience += diff;
                    }
                    totalAudience += audience[shyness];
                }

                out.println("Case #" + kase + ": " + ans);
            }

            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
