package methodEmbedding.Cookie_Clicker_Alpha.S.LYD965;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author YASARA
 */
public class Test2 {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
       double C= 0;
       double F=0;
       double X=0;
       double rate=2.0;  
       double Time=0;
       BufferedReader br = new BufferedReader(new FileReader("data.txt"));
       BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
       String str=br.readLine(); 
       str.trim();
       int Repeat= Integer.parseInt(str);
        
       for(int k=0;k<Repeat;k++){
          str=br.readLine();
          String[] splited=str.split("\\s");         
          splited[0].trim();
          C=Double.parseDouble(splited[0]);
          splited[0].trim();
          F=Double.parseDouble(splited[1]);
          splited[0].trim();
          X=Double.parseDouble(splited[2]);       
         while(((X/(rate+F))+(C/rate))<(X/rate)){                               
            Time=Time+(C/rate);
             rate=rate+F;           
       }         
     Time=Time+(X/rate);
     System.out.println("Case #"+(k+1)+": "+Time);
     bw.write("Case #"+(k+1)+": "+Time);
     bw.newLine();
     Time=0;
     rate=2;
       }
       bw.close();
    }
}
