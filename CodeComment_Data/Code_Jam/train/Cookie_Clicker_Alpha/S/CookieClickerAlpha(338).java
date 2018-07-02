package methodEmbedding.Cookie_Clicker_Alpha.S.LYD796;

import java.util.*;
 
public class CookieClickerAlpha {

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);  
      
   //cases
      int T = sc.nextInt();
   
      for (int p = 0; p < T; p++) {
      
      //read stuff in
         double C = sc.nextDouble(); //cost of cookie farm
         double F = sc.nextDouble(); //rate of cookie farm
         double X = sc.nextDouble(); //cookies needed
         
         double total = 0;
         double time = 0;
         double rate = 2; 
      
         System.out.print("Case #"+(p+1)+": ");
         
         //if it's cheaper to wait for the cookies than to buy
         //a new farm then wait, then wait.
         while (total < X) {
            double tcNewFarm = (C/rate)+X/(rate+F);
            double tcWaiting = (X-total)/rate;
            if (X < C || tcWaiting < tcNewFarm) {
               //System.out.println("Time cost of new farm: "+ tcNewFarm);
               //System.out.println("TIme cost of waiting: " + tcWaiting);
               time += ((X-total)/rate);
               total = X;
            }
            //otherwise buy a farm
            else {
            //otherwise, wait until enough money to buy farm then buy farm
               time += C/rate;
               rate += F;
            }
         }
         System.out.printf("%.7f", time);
         System.out.println();
      }
   }
}
