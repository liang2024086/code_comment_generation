package methodEmbedding.Standing_Ovation.S.LYD745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Chris on 4/10/2015.
 */
public class StandingOvation {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int T  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= T;t++) {
            String[] line = br.readLine().split(" ");


            int sMax = Integer.parseInt(line[0]);
            int countInvited = 0;
            char[] pp = line[1].toCharArray();
            // int[] people = new int[sMax];

            int p = Character.getNumericValue(pp[0]);
            int countStanding = p;
            for (int s = 1; s <= sMax; s++) {
                if (countStanding >= sMax) break;
                p = Character.getNumericValue(pp[s]);
                if (s > countStanding)
                {
                    countStanding++;
                    countInvited++;
                }
                countStanding += p;

            }
            sb.append("Case #").append(t).append(": ").append(countInvited).append("\n");


        }

        System.out.print(sb);


    }
}
