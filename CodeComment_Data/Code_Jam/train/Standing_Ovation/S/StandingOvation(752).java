package methodEmbedding.Standing_Ovation.S.LYD252;

import java.util.Scanner;

public class StandingOvation {
    
    public static void main(String[] args) {
        
        Scanner inFile = new Scanner(System.in);
        int problems = Integer.parseInt(inFile.nextLine());
        
        for (int caseNum=0; caseNum < problems; caseNum++) {
            int maxShy = Integer.parseInt(inFile.next());
            int[] shys = new int[maxShy+1];           
            String scores = inFile.next();
            if (inFile.hasNextLine())
                inFile.nextLine();
            
            for (int i=0; i<=maxShy; i++)
                shys[i] = Integer.parseInt(scores.substring(i,i+1));
           
            int need = 0;
            int standing = 0;
            for (int i=0; i <= maxShy; i++) {
                
                if (standing >= i)
                    standing += shys[i];
                else {
                    int shortfall = i - standing;
                    need += shortfall;
                    standing += shortfall + shys[i];
                }
            }
                    
            System.out.printf("Case #%d: %d\n", caseNum+1, need);
        }
    }
}
