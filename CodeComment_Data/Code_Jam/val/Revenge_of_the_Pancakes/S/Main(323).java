package methodEmbedding.Revenge_of_the_Pancakes.S.LYD154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loops = scan.nextInt();
        int[] chars = {'-', '+'};
        for (int i = 0; i < loops; i++) {
            String line = scan.next();
            int currChar = 1;
            int flips = 0;
            for (int j = line.length() - 1; j >= 0; j--) {
                if (line.charAt(j) != chars[currChar]) {
                    flips++;
                    currChar ^= 1;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + flips);
        }
    }
}
