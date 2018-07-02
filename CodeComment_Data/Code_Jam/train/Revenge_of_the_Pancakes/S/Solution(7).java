package methodEmbedding.Revenge_of_the_Pancakes.S.LYD291;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            char[] pancakes = in.next().toCharArray();
            int[][] dp = new int[pancakes.length + 1][2];

            for (int i = 1; i <= pancakes.length; i++) {
                if (pancakes[i - 1] == '+') {
                    dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1] + 1);
                    dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1] + 2);
                } else {
                    dp[i][0] = Math.min(dp[i - 1][0] + 2, dp[i - 1][1] + 1);
                    dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);
                }
            }
            System.out.printf("Case #%d: %d\n", t, dp[pancakes.length][0]);
        }
    }
}
