package methodEmbedding.Standing_Ovation.S.LYD453;

import java.util.Scanner;

public class StandingOvation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = Integer.parseInt(scanner.nextLine());
        
        for (int i = 1; i <= numCases; i++) {
            String input = scanner.nextLine();
            String[] testCase = input.split(" ");
            
            int maxShyness = Integer.parseInt(testCase[0]);
            String digits = testCase[1];
            int minFriends = 0;
            
            //int runningSum = Integer.parseInt(digits.substring(0,1));
            int runningSum = 0;
            
            for (int j = 0; j <= maxShyness; j++) {
                if (runningSum < j) {
                    minFriends += j - runningSum;
                    runningSum = j;
                }
                int digit = Integer.parseInt(digits.substring(j,j+1));
                runningSum += digit;
            }
            
            System.out.println("Case #" + i + ": " + minFriends);
        }
    }
}
