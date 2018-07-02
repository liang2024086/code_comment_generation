package methodEmbedding.Revenge_of_the_Pancakes.S.LYD609;

import java.util.Scanner;

public class HappyCakes {
    
    public static void main(String[] args) {
        
        Scanner inFile = new Scanner(System.in);
        int problems = Integer.parseInt(inFile.nextLine());
        
        for (int caseNum=0; caseNum < problems; caseNum++) {
            
            String stack = inFile.nextLine();
            int n = stack.length();
            while (n>0 && stack.charAt(n-1) == '+') 
                --n;
            int flips = 0;
            char lastSeen = ' ';
            for (int i=0; i<n; ++i) {
                if (! (stack.charAt(i) == lastSeen )) { 
                    lastSeen = stack.charAt(i);
                    flips++;
                }
            }   
            
            System.out.printf("Case #%d: %d\n", caseNum+1, flips);
        }
        inFile.close();
    }
}
