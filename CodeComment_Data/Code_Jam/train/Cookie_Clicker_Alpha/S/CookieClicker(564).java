package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1286;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class CookieClicker {
   public static void main (String[] args) throws FileNotFoundException {
      //Scanner sc = new Scanner(System.in);
      Scanner sc = new Scanner(new File("src/B-small-attempt0.in"));

      File file = new File("src/output1");
      FileOutputStream fis = new FileOutputStream(file);
      PrintStream out = new PrintStream(fis);
      System.setOut(out);
      int testCases = sc.nextInt();
      for (int i = 0; i < testCases; i++) {
         double timeTaken = 0.0;
         double currentCookiesPerSec = 2.0;
         double currentCookies = 0.0;
         double farmCost = sc.nextFloat(); //C
         double farmBonus = sc.nextFloat(); //F
         double cookieGoal = sc.nextFloat(); //X
         double dontBuyFarm = (cookieGoal - currentCookies)/currentCookiesPerSec;
         double buyFarm = (farmCost/currentCookiesPerSec) + (cookieGoal/(currentCookiesPerSec + farmBonus));
         while (buyFarm < dontBuyFarm) {
            //System.out.println(dontBuyFarm + " buyFarm: " + buyFarm );
            //System.out.println("Adding Time + :" + (farmCost/currentCookiesPerSec));

            dontBuyFarm = (cookieGoal - currentCookies)/currentCookiesPerSec;
            buyFarm = (farmCost/currentCookiesPerSec) + (cookieGoal/(currentCookiesPerSec + farmBonus));
            if (buyFarm < dontBuyFarm) {
               timeTaken += (farmCost/currentCookiesPerSec);
               currentCookiesPerSec += farmBonus;
            }
            //System.out.println ("Current Cookies : " + currentCookies);
         }
         timeTaken += cookieGoal/currentCookiesPerSec;
         //System.out.println("Adding Time + :" + (cookieGoal/currentCookiesPerSec));
         System.out.println("Case #" + (i + 1) + ": " + timeTaken);
         //System.out.println(dontBuyFarm + " buyFarm: " + buyFarm );
      }
   }
}
