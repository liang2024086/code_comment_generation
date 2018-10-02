package methodEmbedding.Standing_Ovation.S.LYD783;

import java.io.File;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by study on 4/11/15.
 */
public class StandingOvation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        IntStream.range(0, t).forEach(i -> {
            int s_max = scanner.nextInt();

            String audience = scanner.next();
            int s_i[] = new int[s_max + 1];

            for (int j = 0; j < s_max + 1; j++) {
                s_i[j] = audience.charAt(j) - '0';
            }

            int invited = 0;
            if (s_i[0] == 0 && s_max != 0) {
                invited++;
            }

            out:
            while(true) {
                int people = invited;

                for(int x = 0; x <= s_max; x++) {
                    if(people >= x) {
                        people += s_i[x];
                    }
                }

                if(people >= s_max) {
                    break;
                } else {
                    invited++;
                }
            }



            System.out.println("Case #" + (i + 1) + ": " + invited);
        });
    }
}
