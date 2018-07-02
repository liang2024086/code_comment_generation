package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1046;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieTime {
    static DecimalFormat SEVEN = new DecimalFormat("#0.0000000"); 
    
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfTestCases = scanner.nextInt();
        for (int i = 0; i < numberOfTestCases; ++i) {
            double cookieCount = 2;
            double c = scanner.nextDouble();
            double f = scanner.nextDouble();
            double x = scanner.nextDouble();
            double solution = x/cookieCount;
            
            double cookieEatTime = c/cookieCount;
            double newSolution = cookieEatTime + x/(cookieCount+f);
            int j = 1;
            System.out.print("Case #" + (i+1) + ": ");
            while (newSolution < solution) {
                solution = newSolution;
                cookieEatTime = cookieEatTime + c/(cookieCount + j*f);
                
                newSolution = cookieEatTime +  x/(cookieCount+(j + 1)*f);
                ++j;
            }
            System.out.println(SEVEN.format(solution));
        }
    }
}
