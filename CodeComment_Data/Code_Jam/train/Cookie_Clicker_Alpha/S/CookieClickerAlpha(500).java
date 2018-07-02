package methodEmbedding.Cookie_Clicker_Alpha.S.LYD271;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CookieClickerAlpha {
    
    private static final String COL_SEPARATOR = " ";
    private static final String RESULT_FORMAT = "Case #%d: %s" + System.lineSeparator();;

    public static void main(String[] args) {
       String inputFilePath = args[0];
       String outputFilePath = args[1];
     
       try(
           BufferedReader in = new BufferedReader(new FileReader(inputFilePath));
           BufferedWriter out = new BufferedWriter(new FileWriter(outputFilePath));    
       ) {
           // Test case
           int T = Integer.valueOf(in.readLine());
           
           for(int i = 0; i < T; i++) {
               // Input data
               String[] CFX = in.readLine().split(COL_SEPARATOR);
               double C = Double.valueOf(CFX[0]);
               double F = Double.valueOf(CFX[1]);
               double X = Double.valueOf(CFX[2]);
               double cookiesPerSec = 2d;
               double result = 0d;
               
               // Process
               if (C >= X) {
                   result = X / cookiesPerSec;
               } else {
                   for(;;) {
                       result += (C / cookiesPerSec);
                       if ( ((X - C) / cookiesPerSec) > (X / (cookiesPerSec + F))) {
                           cookiesPerSec += F;
                       } else {
                           result += (X - C) / cookiesPerSec;
                           break;
                       }
                   }
               }
               
               // Output
               out.write(String.format(RESULT_FORMAT, i + 1, String.valueOf(result)));
           }
       } catch (IOException e) {
        e.printStackTrace();
       } 
       
    }
}
