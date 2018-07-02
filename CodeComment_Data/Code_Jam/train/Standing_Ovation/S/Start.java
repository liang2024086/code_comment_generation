package methodEmbedding.Standing_Ovation.S.LYD672;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;

public class Start {

    public static void main (String[ ] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int index = 1; index <= t; ++index) {
            Integer n = in.nextInt() + 1;
            Integer x = in.nextInt();
            String s = x.toString();
            while (s.length() < n) {
                s = "0" + s;
            }
            int result = 0;
            int sum = 0;
            for (int person = 0; person < s.length(); ++person) {
                if (person > sum) {
                    int invite = person - sum;
                    result += invite;
                    sum += invite;
                }
                sum += ((int)s.charAt(person) - 48);
            }
            System.out.println("Case #" + index + ": " + result);
        }
    }

}
