package methodEmbedding.Speaking_in_Tongues.S.LYD126;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeffrey
 */
public class q1_SpeakinginTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       String REAL_ALPHA = "abcdefghijklmnopqrstuvwxyz ";
       String NEW_ALPHA = "yhesocvxduiglbkrztnwjpfmaq ";
       
       FileReader reader;
      
            reader = new FileReader("q2_input.txt");
            Scanner in = new Scanner(reader);
            
            PrintWriter out = new PrintWriter("q1_output.txt");
            
            String line;
            String output=""; 
           
            
            int cases = Integer.parseInt(in.nextLine());
            for (int i=0 ;i<cases;i++){
                line = in.nextLine();
                output += "Case #"+(i+1)+": ";
                for (int j=0;j<line.length();j++){
                 
                    output += NEW_ALPHA.charAt(REAL_ALPHA.indexOf(line.substring(j,j+1))) ;
                    }
                output += "\n";
                } 
            //System.out.println(output.substring(0,output.length()-1));
            System.out.println(output.substring(1,output.length()));
            out.println(output.substring(0,output.length()-1));
            in.close();
            out.close();
         
        
        
        //PrintWriter out = new PrintWriter("flight.dat");
        //out.println(flightList.size());
    }
}
