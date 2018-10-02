package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1500;

/**
 * Main.java
 *
 * Created on 15-11-2013 02:13 PM
 *
 */
import java.io.*;
import java.util.Scanner;

public class ProbB {
	
	public static void main(String a[]) throws Exception{
                Scanner reader = new Scanner(new File("c:/codejam2014/bIn.in"));
                
		FileOutputStream fs = new FileOutputStream("c:/codejam2014/solB.txt");
		PrintWriter pw = new PrintWriter( new OutputStreamWriter(fs));
             
                int nc = reader.nextInt();
                
		
		for(int i=1;i<=nc;i++){
                    
                    double C,F,X;
                    
                    C = reader.nextDouble();
                    F = reader.nextDouble();
                    X = reader.nextDouble();
                    
                    
                    double cookInHand = 0;
                    double time = 0;
                    double rate = 2;
                    
                    
                    if( X - C <= 0 ){
                        
                       time =  X/rate;     
                        
                    }
                    
                    
                    
                    else { 
                        while(true){
                        
                    
                        time +=  (C - cookInHand) /rate;
                        cookInHand = C;
                        
                        double rem = X - C;
                        
                        if( rem / rate < C/F){
                                time += rem/rate;
                                break;
                        }
                        
                        cookInHand = 0;
                        rate += F;
                        
                    }
                   }
                    
		pw.println("Case #"+i+": "+time);
		}
	    
	  pw.flush();
	  pw.close();
	  
	}

}
