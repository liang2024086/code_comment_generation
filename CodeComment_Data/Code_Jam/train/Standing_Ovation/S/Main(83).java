package methodEmbedding.Standing_Ovation.S.LYD1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 542 - France '98
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=483
 *
 * @author Steve James
 */
public class Main {

    private static final int NUM_COUNTRIES = 16;
    private static final int NUM_ROUNDS = 5; //including initial round when everyone is in

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; ++t) {

            String[] line = br.readLine().trim().split(" ");
            int N = Integer.parseInt(line[0]);
            char[] arr = line[1].toCharArray();
            int ans = 0;
            int sum = 0;
            for (int i = 0; i < arr.length; ++i) {
                if (sum < i) {
                    ans += (i - sum);
                    sum = i;
                }
                sum += arr[i] - '0';
            }

            System.out.println(String.format("Case #%d: %d", t + 1, ans));
        }
    }
}
