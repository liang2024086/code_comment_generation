package methodEmbedding.Standing_Ovation.S.LYD2143;

import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int smax = s.nextInt();
            String audience = s.next();
            int result = 0;
            int standing = 0;
            for (int j = 0; j <= smax; j++) {
                int sj = Character.getNumericValue(audience.charAt(j));
                if (j > standing) {
                    result += j - standing;
                    standing = j;
                }
                standing += sj;
            }
            System.out.println("Case #" + i + ": " + result);
        }
    }
    
}
