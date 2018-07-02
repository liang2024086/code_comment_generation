package methodEmbedding.Standing_Ovation.S.LYD1080;

import java.io.*;

/**
 * Created by James on 1/29/2015.
 */

public class Driver {
    public static void main(String [] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter("answer.txt");
        //PrintWriter out = new PrintWriter(System.out);

        int T = Integer.parseInt(scanner.readLine().trim());

        for (int t = 0; t < T; ++t) {
            int answer = 0, sum = 0;

            String [] pieces = scanner.readLine().split("\\s+");
            int max = Integer.parseInt(pieces[0]);

            if (max == 0) {
                out.printf("Case #%d: 0%n", t + 1);
                continue;
            }

            String people = pieces[1];
            sum += people.charAt(0) - '0';

            for (int i = 1; i <= max; ++i) {
                int num = people.charAt(i) - '0';

                if (sum < i) {
                    answer += (i - sum);
                    sum += (i - sum);
                }

                sum += num;
            }

            out.printf("Case #%d: %d%n", t + 1, answer);
        }

        out.close();
    }
}
