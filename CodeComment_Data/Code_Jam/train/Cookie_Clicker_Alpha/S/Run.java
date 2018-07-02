package methodEmbedding.Cookie_Clicker_Alpha.S.LYD539;

import java.util.*;
import java.io.*;

public class Run {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(new File("B-small-attempt0.in"));
      PrintStream out = new PrintStream(new File("file.out"));
      int cases = in.nextInt();
      int total = 0;

      for (int i= 1 ; i <= cases; i++) {
         out.print("Case #" + i + ": ");
         double cost = in.nextDouble();
         double farmBonus = in.nextDouble();
         double goal = in.nextDouble();
         double rate = 2.0; //cookies per second
         double currentCookies = 0.0;
         double endTime = 0.0;
         boolean alive = true;
         while (alive) {
         
         
            double timeForFarm = cost/rate;
            double timeWinFarm = timeForFarm +  goal/(rate+farmBonus);
            
            
            
            double timeForGoal = goal/rate;
            //  currentCookies += Math.min(timeForFarm, timeForGoal);
            if (timeWinFarm <= timeForGoal) {
               //buy
               rate += farmBonus;
               endTime += timeForFarm;
               //currentCookies -= cost;
               
               
            }  else {
               endTime += timeForGoal;
               alive = false;
            }
           //  System.out.println(currentCookies);
         }
         out.printf("%.7f\n", endTime);
        
         
         
         
      
      }
      
   }
}
