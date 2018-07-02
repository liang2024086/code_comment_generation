package methodEmbedding.Revenge_of_the_Pancakes.S.LYD384;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for (int caseNum = 1; caseNum <= numCases; caseNum++) {
            String stack = sc.next();
            stack += '+';
            int numFlips = 0;
            char lastChar = stack.charAt(0);
            for (int i = 1; i < stack.length(); i++) {
                char nextChar = stack.charAt(i);
                if (nextChar != lastChar) {
                    numFlips++;
                    lastChar = nextChar;
                }
            }
            System.out.println("Case #" + caseNum + ": " + numFlips);
        }
    }
}
