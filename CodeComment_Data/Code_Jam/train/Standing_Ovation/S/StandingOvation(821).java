package methodEmbedding.Standing_Ovation.S.LYD1561;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class StandingOvation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int smax = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            long sum = 0, ans = 0;

            for (int j = 0; j <= smax; j++) {
                if (j - sum > 0) {
                    ans += j - sum;
                    sum +=(j-sum);
                }
                long a = Long.parseLong(String.valueOf(s.charAt(j)));
                sum += a;

            }

            out.println("Case #" + i + ": " + ans);
        }
        out.close();
    }

}
