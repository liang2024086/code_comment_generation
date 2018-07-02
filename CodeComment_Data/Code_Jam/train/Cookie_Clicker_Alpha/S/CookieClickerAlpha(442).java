package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1637;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class CookieClickerAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("B-small.in");
        Scanner fin = new Scanner(file);
        DecimalFormat df = new DecimalFormat("#0.0000000");
        
        int testCases = fin.nextInt();
        
        for(int a = 1; a <= testCases; a++)
        {
            double c, f, x;
            double cookies = 0;
            double cps = 2;
            double time = 0;
            double intertime = 0;
            
            c = fin.nextDouble();
            f = fin.nextDouble();
            x = fin.nextDouble();
            
            while(cookies < x)
            {
                if((x-cookies) < c)
                {
                    time += (x-cookies)/cps;
                    
                    break;
                }
                else
                {
                    time += (c/cps);
                    
                    cookies += c;
                }
                
                
                if(cookies >= x)
                {
                    break;
                }
                intertime = ((x)/(cps+f));
                if(intertime > ((x-cookies)/cps))
                {
                    
                    time += ((x-cookies)/cps);
                    break;
                }
                else
                {
                    
                    cookies -= c;
                    cps += f;
                    
                }
                
                
                
            }
            System.out.println("Case #" + a + ": " + df.format(time));
            
            // REMEMBER: a is testcase count
        }
    }
}
