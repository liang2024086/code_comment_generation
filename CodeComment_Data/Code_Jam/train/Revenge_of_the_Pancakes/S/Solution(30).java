package methodEmbedding.Revenge_of_the_Pancakes.S.LYD688;

import java.util.Scanner;

/**
 * Created by sahil on 10/04/16.
 */

public class Solution {

    public static void main(String[] args) {
        int testCases = 0;
        Scanner scanner = new Scanner(System.in);
        testCases = scanner.nextInt();
        scanner.nextLine();
        String str = null;

        for(int cases = 0; cases < testCases; cases++) {
            long count = 0;
            char searchChar = '-';
            str = scanner.nextLine();
            int lastIndex = str.length();
            for (int i = 0; i < lastIndex; i++) {
                if (str.charAt(lastIndex - 1 - i) == searchChar) {
                    count++;
                    if (searchChar == '-') {
                        searchChar = '+';
                    } else {
                        searchChar = '-';
                    }
                }
            }
            System.out.println("Case #" + (cases + 1) + ": " + count);
        }
    }
}
