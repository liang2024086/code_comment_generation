package methodEmbedding.Cookie_Clicker_Alpha.S.LYD39;

import java.io.*;
import java.util.*;
public class cookie
{
    public static void main(String[] args)
    {
         
         try
         {
             Scanner myScan = new Scanner(new File("B-small-attempt0.in"));
             PrintWriter myWrite = new PrintWriter(new File("Output.txt"));
             int length = myScan.nextInt();
             
         for(int i = 1;i<=length;i++)
         { 
               double cookiesPerTime = 2.0;
               double cookieFarm = myScan.nextDouble();
               double cookieFarmIncrease = myScan.nextDouble();
               double endCookies = myScan.nextDouble();
               double timeWithFarm = 0;
               double endTime = 0;
               boolean done = false;
               while(!done)
               {
                  double timeToFarm = cookieFarm/cookiesPerTime;
                  double possibleEndTime1 = endCookies/cookiesPerTime;
                  double possibleEndTime2 = timeToFarm + (endCookies/(cookiesPerTime + cookieFarmIncrease));
                  if(possibleEndTime1 < possibleEndTime2)
                  {
                      done = true;
                      endTime += possibleEndTime1;
                    }
                  else
                  {
                     endTime += timeToFarm;
                     cookiesPerTime += cookieFarmIncrease;
                  }
               }
                myWrite.println("Case #" + i + ": " + endTime);
         }
            myScan.close();
            myWrite.close();
                     }catch(FileNotFoundException e)
         {
                System.out.println("File not found");
         }
    }
}
