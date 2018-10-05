package methodEmbedding.Standing_Ovation.S.LYD763;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Patel
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
          
        String text = in.readLine();
        
        int lines = Integer.parseInt(text);
        
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        
        
        for(int i = 1; i <= lines; i++){
            
        String audience = in.readLine();
            
        int count = 0;
        int tally = 0;
        
        audience = audience.substring(audience.indexOf(" ") + 1);
        for(int j = 0; j < audience.length(); j++){
            
            if (tally < j){
                
                count += (j - tally);
                tally += (j - tally);
                
            }
            
            tally += (audience.charAt(j)) - ('0');
        }
        
        out.println("Case #" + i + ": " + count);
       
        }
        in.close();
        out.close();
        
    }
    
    
    
}
