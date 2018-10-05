package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1179;

import java.util.*;
import java.io.*;

public class cookie
{
   public static StringTokenizer st;
   
   public static void main(String[] args) throws IOException
   {
      BufferedReader input = new BufferedReader(new FileReader("B-small-attempt0.in"));
      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("answer.txt")));//writes file
      
      int num = Integer.parseInt(input.readLine());
      
      for(int i = 0; i < num; i++)
      {
         double time = 0.0;
         double rate = 2.0;
            
            //inputs
         st = new StringTokenizer(input.readLine());
         double c = Double.parseDouble(st.nextToken());
         double f = Double.parseDouble(st.nextToken());
         double x = Double.parseDouble(st.nextToken());
         
         double ptime = x/rate + time;
         double pftime = c/rate + x/(rate + f) + time;
         
         while(ptime > pftime)
         {
            time += c/rate;
            rate += f;
            ptime = x/rate + time;
            pftime = c/rate + x/(rate + f) + time;
         }
      
         output.println("Case #" + (i+1) + ": " + ptime);
      }
      
      output.close();
   }
}
