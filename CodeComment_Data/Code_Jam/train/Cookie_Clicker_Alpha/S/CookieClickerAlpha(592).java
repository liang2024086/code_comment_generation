package methodEmbedding.Cookie_Clicker_Alpha.S.LYD153;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Sidharth
 */
public class CookieClickerAlpha {

    public static void main(String[] arg) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("B-small-attempt0.in")));
        PrintWriter pw = new PrintWriter(new File("B-small.out"));
        StringTokenizer tokenizer;

        int T = Integer.parseInt(reader.readLine());
        double C, F, X,result,rate,cummulative,time,newTime;
        for (int t = 1; t <= T; t++) {
            
            tokenizer = new StringTokenizer(reader.readLine());
            C = Double.parseDouble(tokenizer.nextToken());
            F = Double.parseDouble(tokenizer.nextToken());
            X = Double.parseDouble(tokenizer.nextToken());
            
            rate = 2;           
            cummulative = 0;
            result = 0;
            time = C/2;
           
            while((X/rate + cummulative) >= (X/(rate+F) + C/rate + cummulative)){             
                result += C/rate;
                rate += F;
                cummulative += C/rate;
            }      
            result += X/rate;
            pw.printf("Case #%d: %.7f\n", t,result);            
        }
        pw.close();
    }
}
