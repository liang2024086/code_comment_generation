package methodEmbedding.Standing_Ovation.S.LYD805;


import java.util.Scanner;

public class AStandingOvation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int t = 0; t < tests; t++) {
            int maxShyness = sc.nextInt();
            String line = sc.next();
            int total = 0;
            int added = 0;
            for (int s = 0; s <= maxShyness; s++) {
                if (total < s) {
                    added += s - total;
                    total = s;
                }
                total += line.charAt(s) - '0';
            }
            System.out.printf("Case #%d: %d%n", t + 1, added);
        }
        sc.close();
    }
}
