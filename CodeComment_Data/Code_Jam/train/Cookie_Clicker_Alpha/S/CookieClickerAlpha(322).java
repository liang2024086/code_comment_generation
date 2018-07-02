package methodEmbedding.Cookie_Clicker_Alpha.S.LYD572;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class CookieClickerAlpha
{
   public static void main(String[] args) throws Exception
   {
      Scanner inp = new Scanner(new File("CookieClickerAlpha2.txt"));
      PrintWriter outp = new PrintWriter("CookieClickerAlpha.out", "UTF-8");
      
      int n = inp.nextInt();
                  
      for( int i=0; i<n; i++ )
      {
         double C = inp.nextDouble();
         double F = inp.nextDouble();
         double X = inp.nextDouble();
         double seconds = 0;
         int cookies = 0;
         double cookieRate = 2.0;
         double prevSeconds = X / cookieRate;
         seconds = X / cookieRate;
         int numFarms = 0;
         int count = 0;
         boolean found = false;
         
         while( !found )
         {
               seconds = 0;
               cookieRate = 2.0;
               /* first buy numFarms # of farms */
               for( int f=0; f<numFarms; f++ )
               {
                  seconds += C / (cookieRate);
                  cookieRate += F;
               }
               //System.out.print( "Cost to buy " + numFarms + " farms = " + seconds + " seconds.  " );
               /* get remaining cookies to X */
               seconds += X / cookieRate;
               //System.out.println( "remaining seconds = " + X / cookieRate  + ", Total seconds = " + seconds );
               if( seconds > prevSeconds )
                  found = true;
               else
                  prevSeconds = seconds;
               numFarms++;
         }              
         outp.print( "Case #" + (i+1) + ": ");
         {
            outp.print( prevSeconds );
            if( i < n-1 )
               outp.println();
                     
         }
      }   
      outp.close();
   }
}
