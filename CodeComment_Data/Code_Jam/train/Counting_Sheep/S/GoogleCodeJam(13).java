package methodEmbedding.Counting_Sheep.S.LYD627;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ruslan on 4/8/2016.
 */
public class GoogleCodeJam {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int tc = 0;
        boolean sleep = false;
        while (T > 0) {
            T--;
            int n = sc.nextInt();sc.nextLine();
            if (n == 0) {
                System.out.println("Case #" + ++tc + ": INSOMNIA");
                continue;
            } else if (n == 1) {
                System.out.println("Case #" + ++tc + ": 10");
                continue;
            }
            List<Integer> digits = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
            String strn;
            int i = 1;
            long m;
            while (i < Integer.MAX_VALUE) {
                m = i * n;
                strn = Long.toString(m);
                for (int j = 0; j < strn.length(); j++) {
                    int d = Character.getNumericValue(strn.charAt(j));
                    if (digits.remove(new Integer(d)) && digits.isEmpty()) {
                        sleep = true;
                        break;
                    }

                }

                if (sleep) {
                    System.out.println("Case #" + ++tc + ": " + m);
                    break;
                }

                i++;
            }
            if (!sleep) {
                System.out.println("Case #" + ++tc + ": INSOMNIA");
            }
            sleep = false;
        }
    }

}
