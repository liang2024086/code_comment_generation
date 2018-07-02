package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1007;


import java.util.Scanner;

public class BRevengeOfThePancakes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int t = 1; t <= tests; t++) {
            String input = sc.next();
            int flipCount = 0;
            for (int x = 1; x < input.length(); x++) if (input.charAt(x) != input.charAt(x - 1)) flipCount++;
            if (input.charAt(input.length() - 1) == '-') flipCount++;
            System.out.printf("Case #%d: %d%n", t, flipCount);
        }
        sc.close();
    }
}
