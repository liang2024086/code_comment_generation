package methodEmbedding.Standing_Ovation.S.LYD354;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main
{


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int T = Integer.parseInt(br.readLine());
            for (int caseId = 1; caseId <= T; caseId++) {
                String[] tokens = br.readLine().split("\\s");
                int N = Integer.parseInt(tokens[0]) + 1;
                int[] shy = new int[N];
                for (int i = 0; i < N; i++) {
                    shy[i] = (int) (tokens[1].charAt(i)) - 48;
                }
                int result = 0;
                int total = shy[0];
                for (int i = 1; i < N; i++) {
                    if (total < i) {
                        result += i - total;
                        total += i - total;
                    }
                    total += shy[i];
                }

                System.out.println("Case #" + caseId + ": " + result);

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
