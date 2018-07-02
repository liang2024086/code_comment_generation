package methodEmbedding.Revenge_of_the_Pancakes.S.LYD199;

import java.util.Scanner;

public class GoogleCodeJamB {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int test = 1; test <= t; test ++) {
            String s = in.nextLine();
            while (s.contains("++")) {
                s = s.replace("++", "+");
            }

            while (s.contains("--")) {
                s = s.replace("--", "-");
            }

            int ans = s.length();
            if (s.charAt(s.length() - 1) == '+') {
                ans--;
            }

            System.out.println("Case #"+test+": "+ans);

        }

        in.close();
    }
}
