package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1224;

import java.util.*;
import java.io.*;

class cookie {
    public static void main(String[] args) throws IOException{
         
         int i, j, k, t, temp;     
         
         Scanner reader = new Scanner(new File("input.txt"));
         
         
         int T = reader.nextInt();
         
         for(t=0;t<T;t++){
            
            double[] estimates = new double[100000000];
            int cur = 0;
            
            double C = reader.nextDouble();
            double F = reader.nextDouble();
            double X = reader.nextDouble();
            
            double curCookies = 0;
            double curRate = 2;
            double time = 0;
            
           
            
            estimates[cur] = (X-curCookies)/curRate +time;
            cur++;
            
            time += ((C - curCookies)/curRate);
            
            curCookies = 0;
            curRate += F;
            
            estimates[cur] = (X-curCookies)/curRate +time;
            cur++;
            
            while(estimates[cur-1] < estimates[cur-2]){
               
               
               time += ((C - curCookies)/curRate);
               curCookies = 0;
               curRate += F;
               
               estimates[cur] = (X-curCookies)/curRate +time;
               cur++;
               
                   
               
               
            }
            
            System.out.println("Case #"+(t+1)+": "+String.format( "%.7f", estimates[cur-2] ));
            
           
            
            
            
         }
         
         
         
         
    }
}
