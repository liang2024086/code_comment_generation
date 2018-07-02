package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1137;

import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseNumber = in.nextInt();
        
        for(int i = 1; i <= caseNumber; i++) {
            String input = in.next();
            char[] stack = input.toCharArray();
            
            int[] dp = new int[stack.length + 1];
            for(int j = 1; j < dp.length; j++) {
                if(stack[j-1] == '+') {
                    dp[j] = dp[j-1];
                }
                else {
                    int k = j-1;
                    while(k >= 1 && stack[k-1] == '-') k--;
                    
                    if(k == 0) dp[j] = 1;
                    else dp[j] = dp[k] + 2;
                }
            }
            
            System.out.println("Case #" + i + ": " + dp[dp.length-1]);
        }
    }
}
