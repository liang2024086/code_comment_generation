package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1402;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
/**
 *
 * @author Spyros
 */
public class CookieClickerAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         try {
        
            BufferedReader in = new BufferedReader(new FileReader("B-small-attempt1.in"));
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            
            String line = in.readLine();
            int N = Integer.parseInt(line);
            
            
            for (int i=1;i<=N;i++)
            {   
                line = in.readLine();
                String input[] = line.split(" ");
                double C = Double.parseDouble(input[0]);
                double F = Double.parseDouble(input[1]);
                double X = Double.parseDouble(input[2]);
                double currentProduction=2.0;
                double totalTime=0.0;
                
                while(true)
                {
                    double finalTime=X/currentProduction;
                    
                    double nextFarmTime=C/currentProduction;
                    double nextFinalTime=X/(currentProduction+F);
                    
                   //System.out.printf("%.7f ", finalTime);
                    
                    if((nextFarmTime+nextFinalTime) > finalTime)
                    {   
                        totalTime=totalTime+finalTime;
                        break;
                    }
                    else
                      totalTime=totalTime+nextFarmTime;  
                    
                    
                    currentProduction+=F;
                }
                 out.write(String.format(Locale.US ,"Case #%d: %.7f\n", i,totalTime));
            }
                
           
            in.close();
            out.close();
        }
        catch (IOException ioe) 
                {
                    System.out.println(ioe.getMessage());
                }
        
    }
}
