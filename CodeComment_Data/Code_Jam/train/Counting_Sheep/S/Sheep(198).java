package methodEmbedding.Counting_Sheep.S.LYD356;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sheep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loops = scan.nextInt();
        for (int i = 0; i < loops; i++) {
            int num = scan.nextInt();
            if (num == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", i + 1);
                continue;
            }

            Set<Integer> numSet = new HashSet<>(20);
            int currN = 0;
            // Loop all digits in num
            while (numSet.size() < 10) {
                currN += num;
                int maniN = currN;
                // Loops through current c*N
                while (numSet.size() < 10 && maniN > 0) {
                    int digit = maniN % 10;
                    numSet.add(digit);
                    maniN /= 10;
                }
            }
            System.out.printf("Case #%d: %d\n", i + 1, currN);

        }
    }
}
