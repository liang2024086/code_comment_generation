package methodEmbedding.Cookie_Clicker_Alpha.S.LYD748;


import java.util.*;

public class P2{

   static int numCases;
   static final double cookieProd = 2.0;

   public static void main(String [] args){

      Scanner sc = new Scanner(System.in);
      numCases = sc.nextInt();

      for(int i = 0; i < numCases; i++){

         double t = 0;
         double farmProd;
         double farmCost;
         double goal;

         double numFarms = 0;
         double totalProd = cookieProd;

         farmCost = sc.nextDouble();
         farmProd = sc.nextDouble();
         goal = sc.nextDouble();

         while((farmCost/totalProd + goal/(totalProd + farmProd)) <= (goal/totalProd)){

            numFarms++;
            t += farmCost/totalProd;
            totalProd += farmProd;

         }

         t += goal/totalProd;

         System.out.printf("Case #" + (i+1) + ": %.7f\n", t);
      }
   }
}
