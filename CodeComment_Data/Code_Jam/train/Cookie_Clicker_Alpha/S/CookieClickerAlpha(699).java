package methodEmbedding.Cookie_Clicker_Alpha.S.LYD595;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CookieClickerAlpha {
    static Scanner input;
    static BufferedWriter output;

    public static void main(String[] args) throws IOException {
        input = new Scanner(new File(args[0]));
        output = new BufferedWriter(new FileWriter("small.out"));

        int numCase = input.nextInt();

        for (int i = 0; i < numCase; i++) {
        	output.write("Case #" + (i + 1) + ": ");
        	
            double C = input.nextDouble();
            double F = input.nextDouble();
            double X = input.nextDouble();
            
            int k = 1;
            
            double timeJ = 0;
            double timeK = C / 2;
            double timeJJ = timeJ + X / 2;
            double timeKK = timeK + X / (2 + F);
            
            while (timeJJ > timeKK) {
            	timeJ = timeK;
            	timeJJ = timeKK;
            	timeK += + C / (2 + k * F);
            	k++;
            	timeKK = timeK + X / (2 + k * F);
            }
            
            output.write(String.format("%.7f", timeJJ) + "\n");
        }
        
        output.close();
    }
    
    
}
