package methodEmbedding.Cookie_Clicker_Alpha.S.LYD363;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
    
    public static void main(String args[]) throws FileNotFoundException {
        
        final Scanner in = new Scanner(new File("/home/mikel/Desktop/codejam/input.txt"));
        final PrintWriter out = new PrintWriter(new File("/home/mikel/Desktop/codejam/output.txt"));
        
        final int t = in.nextInt();
        for (int it = 1; it <= t; it++) {
            
            final double c = in.nextDouble();
            final double f = in.nextDouble();
            final double x = in.nextDouble();
            
            double time = 0;
            double cookiesPerSecond = 2;
            
            while (true) {
                
                double endingTime = x/cookiesPerSecond;
                double buyingTime = c/cookiesPerSecond + x/(cookiesPerSecond+f);

                if (endingTime < buyingTime) {
                    time += endingTime;
                    break;
                } else {
                    time += c/cookiesPerSecond;
                    cookiesPerSecond = cookiesPerSecond+f;
                }
            
            }
            
            out.println("Case #" + it + ": " + time);
        }
        
        out.close();
    }
    
}
