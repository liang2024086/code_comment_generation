package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1105;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MagicTrick {
    
    static PrintWriter print;
    
    public static void main(String [] args) throws Exception {
        
        Scanner input = new Scanner(new File("C:\\Users\\Atif_2\\Documents\\dd.in"));
        print = new PrintWriter(new FileWriter("C:\\Users\\Atif_2\\Documents\\t9.out"));
        
        int cases = Integer.parseInt(input.nextLine().trim());
        
        for(int i = 0; i < cases; i++) {
            
            double seconds = 0;
            double cookies = 0;
            
            double cookiesGain = 2;
            
            String values = input.nextLine();
            String [] them = values.split(" ");
            
            double farmCost = Double.parseDouble(them[0].trim());
            double dydx = Double.parseDouble(them[1].trim());
            double totalCookies = Double.parseDouble(them[2].trim());
            
            long millis = System.currentTimeMillis();
            
            print.print("Case #" + (i+1) + ": ");
            
            while(true) {
                
                if(totalCookies / cookiesGain < totalCookies / (cookiesGain + dydx) + farmCost / cookiesGain) {
                    seconds += totalCookies / cookiesGain;
                    break;
                }
                    
                seconds += (farmCost / cookiesGain);
                cookiesGain += dydx;
                    
            }
            
            print.println(seconds);
           
        }
        
        print.close();
    }
}
