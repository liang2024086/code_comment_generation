package methodEmbedding.Revenge_of_the_Pancakes.S.LYD46;


import java.util.Scanner;

public class Q1B {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {

            String S = in.next();
            if(S.equals("-")) {
                System.out.format("Case #%d: %d\n", t, 1);
                continue;
            }
            if(S.equals("+")) {
                System.out.format("Case #%d: %d\n", t, 0);
                continue;
            }

            int result = 0;
            for(int i = 0; i < S.length() - 1; i++) {
                if(S.charAt(i) != S.charAt(i + 1)) {
                    result++;
                }
            }
            if(S.endsWith("-")) {
                result++;
            }
            System.out.format("Case #%d: %d\n", t, result);
        }
    }

}
