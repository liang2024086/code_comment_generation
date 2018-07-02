package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1473;

import java.util.Scanner;


public class Cookie {


   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numTimes, counter = 0;
      double farm, increase, total;
      double sum, minTime, time;
      double cps;
      
      numTimes = sc.nextInt();

      while(counter++ < numTimes) {
         cps = 2.0;
         time = 0.0;
         farm = sc.nextDouble();
         increase = sc.nextDouble();
         total = sc.nextDouble();
         
         int i = 0;
         minTime = total/cps;
         while(true) {
            for(int tmp = i; tmp > 0; tmp--) {
               time += farm/cps;
               cps += increase;
            }
            time += total/cps;
            if(time <= minTime && time != 0.0){
               minTime = time;
            } else {
               break;
            }
            i++;
            time = 0.0;
            cps = 2.0;
         }
         System.out.print("Case #"+counter+": ");
         System.out.println(minTime);
      }
   }

}
