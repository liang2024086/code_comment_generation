package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1554;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
public class PrintStdIn{
 
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/
    	BufferedReader br = new BufferedReader(new FileReader("F:\\Java\\Files\\test.in"));
    	String t = br.readLine();
        int tests = Integer.parseInt(t);
        for(int z=1;z<=tests;z++)
        {
        String row = br.readLine();
        String[] rowVal = row.split(" ");
        double c = Double.parseDouble(rowVal[0]);
        double f = Double.parseDouble(rowVal[1]);
        double x = Double.parseDouble(rowVal[2]);
        double rate = 2.0;
        double time=0.0;
        
        while((x/rate)>((c/rate)+(x/(rate+f))))
        {
        	 time = time+c/rate;
        	 rate = rate+f;    	
        }
        time = time + x/rate;
        System.out.printf("Case #"+z+": %.7f\n", time);        	
    	} 
   }
}
