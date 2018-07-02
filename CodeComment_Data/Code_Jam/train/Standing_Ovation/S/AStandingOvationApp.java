package methodEmbedding.Standing_Ovation.S.LYD580;

import java.util.Scanner;

public class AStandingOvationApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {

            int s_max = s.nextInt();
            String buffer = s.next();

            int total_people = 0;
            int min_needed = 0;

            for(int i = 0; i <= s_max; i++) {
                int s_i = Character.getNumericValue(buffer.charAt(i));

                if(s_i > 0) {
                    int needed = i > 0 ? i - total_people : 0;
                    total_people += s_i;
                    if (needed > min_needed) {
                        min_needed = needed;
                    }
                }
            }

            System.out.printf("Case #%d: %d%n", test_case, min_needed);
        }
    }
}
