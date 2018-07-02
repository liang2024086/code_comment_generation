package methodEmbedding.Revenge_of_the_Pancakes.S.LYD515;

import java.util.Scanner;

public class ProblemB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        input.nextLine();
        
        for (int i = 1; i <= numCases; i++) {    
            String s = input.nextLine();
            
            char[] c = s.toCharArray();
            int count = 0;
            
            for (int k = 0; k < c.length - 1; k++) {
                if (c[k] != c[k+1]) {
                    count++;
                }
            }
            
            if (c[c.length-1] != '+') {
                count++;
            }
            
            System.out.println(String.format("Case #%d: %d", i, count));
            
        }
        
        input.close();
    }
}
