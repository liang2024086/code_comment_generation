package methodEmbedding.Standing_Ovation.S.LYD2086;


import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Darshan on 4/11/2015.
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Darshan\\Downloads\\A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ProbAOut.txt")));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;

        for (int T = Integer.parseInt(br.readLine()), t = 1; T > 0; t++, T--) {
            st = new StringTokenizer(br.readLine());
            int sMax = Integer.parseInt(st.nextToken());
            char[] audience = st.nextToken().toCharArray();

            int count = 0;
            int required = 0;
            for (int i = 0; i < sMax + 1; i++) {
                if (count >= i || audience[i] == '0') {
                    count += (audience[i] - '0');
                } else {
                    int difference = i - count;
                    required += difference;
                    count += difference;

                    count += (audience[i] - '0');
                }
            }

            out.printf("Case #%d: %d\n", t, required);
        }
        out.close();
        br.close();
    }
}
