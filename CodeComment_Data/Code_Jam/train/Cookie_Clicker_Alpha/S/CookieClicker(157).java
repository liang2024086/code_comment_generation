package methodEmbedding.Cookie_Clicker_Alpha.S.LYD859;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DecimalFormat;

/**
 *
 * @author Daryl
 */
public class CookieClicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fstream = new FileInputStream("C:/Users/Daryl/Desktop/B-small-attempt0.in");
DataInputStream in = new DataInputStream(fstream);
        BufferedReader br =  new BufferedReader(new InputStreamReader(in));
       PrintStream out = new PrintStream(new FileOutputStream("C:/Users/Daryl/Desktop/B-small-attempt0.out"));
        System.setOut(out); 
       Double C;//cost of a farm
       Double F;//each farm gives f cookies per second
       Double X;//cookie win state
       Double cookies;
       Double cps;
       Double totalTime;
       Boolean complete;
      DecimalFormat df = new DecimalFormat("#.0000000");
      
       
       String line = br.readLine();
     int numCases = Integer.parseInt(line);
     Double num;
      for(int c=0;c<numCases;c++){        
        Double T1 = 100.0;
        Double T2 = 55.0;
          
      complete = false;
      cookies = 0.0;
      totalTime = 0.0;
      cps = 2.0;
        String[] sLine = br.readLine().split("\\s+"); 
      
        C = Double.parseDouble(sLine[0]);
        F = Double.parseDouble(sLine[1]);
        X = Double.parseDouble(sLine[2]);
        
        
   
         //for(int i=0;i<3;i++){
        while(T1 > T2){
        
        
        
        T1 = totalTime +  X/cps;
        T2 = totalTime + C/cps + X/(cps+F);
        
        //System.out.println(T1 + " T1T2 "+ T2);
     
        totalTime = totalTime + C/cps;
        cps = cps + F;
            
            
        }
        totalTime = T1;// totalTime +  X/cps;
        
        
         //  System.out.println(C +" "+F+" "+ X);
            System.out.println("Case #"+(c+1)+": "+df.format(totalTime));
        
      }
     
     
    }
}
