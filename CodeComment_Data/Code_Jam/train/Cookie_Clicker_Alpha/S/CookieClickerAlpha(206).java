package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1343;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (new File ("B-small-attempt0.in"));
        
        FileWriter fw = new FileWriter ("B-small-attempt0-Out.txt");
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter outFile = new PrintWriter (bw);
        
        int test = scan.nextInt();
        double pRate; // Production Rate
        double minTime;
        double C;
        double F;
        double X;
        
        double buyTime;
        double dontBuyTime;
        String outText;
        for (int i = 1 ; i <= test; i++) {
            pRate = 2;
            minTime = 0;
                        
            C = scan.nextDouble();
            F = scan.nextDouble();
            X = scan.nextDouble();
                        
            buyTime = C/pRate + X/(pRate+F);
            dontBuyTime = X/pRate;
            while(buyTime < dontBuyTime) {
                minTime = minTime + C/pRate;
                pRate = pRate + F;
                
                buyTime = C/pRate + X/(pRate+F);
                dontBuyTime = X/pRate;
            }
            
            minTime = minTime + X/pRate;
            
            outText = String.format("%.7f", minTime);
            outFile.println("Case #" + i + ": " + outText);
        }
        outFile.close();
    }
}

