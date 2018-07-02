package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1558;

import java.io.*;
import java.util.*;
public class Cookie_Clicker
{
   public static void main(String[] args)throws Exception
   {
   PrintWriter writer = new PrintWriter("output2.txt", "UTF-8");
      Scanner scn = new Scanner(new File("B-small-attempt0.in"));
      int testCases = scn.nextInt();
      for(int i = 0; i<testCases; i++)
      {
         double totalSeconds = 0;
         double CPS = 2.0;
         double C = scn.nextDouble();
         double F = scn.nextDouble();
         double X = scn.nextDouble();
      
         boolean allDone = false;
      
         while(!allDone)
         {
         double secondsToFarm = C/CPS;
         double secondsToXAfter = X/(CPS+F);
         double secondsToX = X/CPS;
         if(secondsToFarm + secondsToXAfter < secondsToX)
         {
         totalSeconds += secondsToFarm;
         CPS += F;
         }
         else
         {
         totalSeconds += secondsToX;
         allDone = true;
         }
         
         
         }
      writer.println("Case #"+(i+1) + ": " + totalSeconds);
      }
      writer.close();
   }
}
