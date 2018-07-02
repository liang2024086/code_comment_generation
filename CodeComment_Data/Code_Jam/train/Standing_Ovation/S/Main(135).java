package methodEmbedding.Standing_Ovation.S.LYD823;

import java.util.Scanner;

/**
 * Created by anilkishore on 4/10/15.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int kase = 1; kase <= t ; kase++) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0, sum = 0;
            for (int i = 0; i < s.length(); i++) {
            	int need = 0;
                if (s.charAt(i) != '0')
                	need = Math.max(0, i - sum);
                ans += need;	
                sum += s.charAt(i) - '0' + need;
            }
            System.out.println("Case #" + kase + ": " + ans);
        }
    }
}
