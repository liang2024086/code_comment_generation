package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1189;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numberOfCases = s.nextInt();
        s.nextLine();

        for(int i = 0; i < numberOfCases; i++){
            char[] stackOrder = s.nextLine().trim().toCharArray();
            char consecutiveCharacter = '+';
            int consecutiveCount = 0;
            for(int j = stackOrder.length - 1; j >= 0; j--){
                if(stackOrder[j] != consecutiveCharacter){
                    consecutiveCount++;
                    consecutiveCharacter = stackOrder[j];
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + consecutiveCount);
        }
    }
}
