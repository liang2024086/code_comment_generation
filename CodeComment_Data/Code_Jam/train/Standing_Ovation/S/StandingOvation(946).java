package methodEmbedding.Standing_Ovation.S.LYD265;

import java.util.Scanner;

public class StandingOvation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int i = 0; i < tc; ++i) {
            int shyMax = sc.nextInt();

            String input = sc.next();
            int count = 0;
            int min = 0;
            for (int x = 0; x<= shyMax; ++x) {
                 int audienceCount = Integer.parseInt(""+input.charAt(x));
                 count += audienceCount;
                 if (count < x+1) {
                     min++;
                     count++;
                 }
            }
            System.out.println("Case #"+(i+1)+": "+min);
        }
    }
}
