package methodEmbedding.Standing_Ovation.S.LYD2049;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Jerry on 2015/4/11.
 */
public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new FileInputStream(new File(args[0])));
        System.setOut(new PrintStream(new File("codejam/small_output.out")));
        int num, s_max, k, i, sum, min_fri_num;
        String s = null;

        num = in.nextInt();
        for (k = 0; k < num; k ++) {
            s_max = in.nextInt();
            s = in.next();
            sum = s.charAt(0)-'0';
            min_fri_num = 0;
            for (i = 1; i <= s_max; i ++) {
                if (sum < i) {
                    min_fri_num += (i-sum);
                    sum = i;
                }
                sum += (s.charAt(i)-'0');
            }
            System.out.println("Case #"+(k+1)+": "+min_fri_num);
        }

        System.setOut(System.out);

    }

}
