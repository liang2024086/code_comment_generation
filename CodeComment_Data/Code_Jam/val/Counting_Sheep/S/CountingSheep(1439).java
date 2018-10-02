package methodEmbedding.Counting_Sheep.S.LYD1103;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountingSheep {

    public static void main(String[] args) throws IOException {
        Scanner inFile = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter outFile = new PrintWriter(new File("sheep.out"));
        int numTestCases = inFile.nextInt();
        
        for (int t = 1; t <= numTestCases; t++){
            
            String lastDigit = "INSOMNIA";
            boolean[] seen = new boolean[10];
            
            int n = inFile.nextInt();
            long num = 0;
            int numSeen = 0;
            
            if (n == 0){
                numSeen = 10;
            }
            
            while (numSeen < 10){
                num += n;
                
                long tmp = num;
                while (tmp > 0){
                    int digit = (int) (tmp % 10);
                    if (!seen[digit]){
                        seen[digit] = true;
                        numSeen++;
                        lastDigit = String.valueOf(num);
                    }
                    tmp = tmp / 10;
                }
            }
            
            
            outFile.printf("Case #%d: %s %n", t, lastDigit);
        }
        inFile.close();
        outFile.close();

    }

}
