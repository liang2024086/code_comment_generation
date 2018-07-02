package methodEmbedding.Revenge_of_the_Pancakes.S.LYD731;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by kuwata on 2016/04/09.
 */
public class Question {

    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();

        for (int i = 1; i <= t; ++i) {
            String line = in.next();
            char[] linec = line.toCharArray();
            if (linec.length == 1 && linec[0] == '+') {
                System.out.println("Case #" + i + ": 0");
                continue;
            }
            if (linec.length == 1 && linec[0] == '-') {
                System.out.println("Case #" + i + ": 1");
                continue;
            }
            int length = linec.length;
            char before = 0;
            int result = 0;
            for (int count = 0; count < length; ++count) {
                char now = linec[count];
                if (before == now) {
                    continue;
                }
                before = now;
                if (count == 0) {
                    continue;
                }

                ++result;
            }
            if(linec[linec.length - 1] == '-'){
                ++result;
            }
            System.out.println("Case #" + i + ": " + result);

        }
    }
}
