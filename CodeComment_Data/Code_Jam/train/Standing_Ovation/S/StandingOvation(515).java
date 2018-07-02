package methodEmbedding.Standing_Ovation.S.LYD1609;


import java.util.Scanner;

/**
 *
 * @author izharishaksa
 */
public class StandingOvation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            String s = sc.next();
            int ret = 0, cur = s.charAt(0) - '0';
            for (int i = 1; i < N + 1; i++) {
                int x = s.charAt(i) - '0';
                if (x > 0 && cur < i) {
                    ret += i - cur;
                    cur += i - cur;
                }
                cur += s.charAt(i) - '0';
            }
            System.out.println("Case #" + t + ": " + ret);
        }
    }

}
