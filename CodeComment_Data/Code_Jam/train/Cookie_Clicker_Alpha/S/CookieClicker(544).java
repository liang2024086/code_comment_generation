package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1129;

import java.util.Scanner;
import java.util.ArrayList;
 
 
public class CookieClicker {
 	
 		
        public static void main(String[] args) {
               
               Scanner scan = new Scanner (System.in);
               double C;
               double F;
               double X;
               double minTime;
               int T;
               T = scan.nextInt();
               double numOfFact;
               boolean go;
               double time1;
               double time2;
           		
                for( int i = 1; i < T + 1; i++)
                {
                		go = true;
                		numOfFact = 0;
                		minTime = 0;
                        C = scan.nextDouble();
                        F = scan.nextDouble();
                        X = scan.nextDouble();
                       
                        
                        while (go){
                        	time1 =  X / (( numOfFact) * F + 2);
                        	time2 = (C / (( numOfFact) * F + 2)) + (X / ((( numOfFact + 1) * F + 2)));
                        	
                        	if (time1 <= time2){
                        		go = false;
                        		
                        		for (int j = 0 ; j < numOfFact  ; j++ )
                        		{
                        			minTime = minTime + ( C /(j * F + 2));
                        		}
                        		
                        		minTime = minTime + X /(numOfFact * F + 2);
                        		
                        	}
                        	else{
                        	
                        		numOfFact++;
                           	}
                      
                        }
                     	
                        System.out.println( "Case #" +i + ": " + String.format("%.7f", minTime) );
        
                }
        }
}
