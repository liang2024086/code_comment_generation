package methodEmbedding.Cookie_Clicker_Alpha.S.LYD276;

import java.io.*;
import java.util.*;
public class CookieClicker
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(new File("input.txt"));
      PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
      int N = sc.nextInt();
      for(int x = 0; x < N; x++)
      {
         double rate = 2;
         double C = sc.nextDouble();
         double F = sc.nextDouble();
         double X = sc.nextDouble();
         double time = 0;
         double cookies = 0;
         while(cookies < X)
         {
            if(X < C)
            {
               cookies = X;
               time += X/rate;
            }
            else
            {
               double dif = C - cookies;
               time += dif/rate;
               cookies = C;
               if((X-cookies)/rate > X/(rate+F))
               {
                  rate += F;
                  cookies = 0;
               }
               else
               {
                  dif = X - cookies;
                  time += dif/rate;
                  cookies = X;
               }
            }
         }
            
         out.println("Case #" + (x+1) + ": " + time);
      }
   }
}
