package methodEmbedding.Cookie_Clicker_Alpha.S.LYD910;

import java.util.*;
import java.io.*;
import java.text.*;
public class cookie
{
   public static void main(String[] args) throws IOException
   {
      //B-small-attempt0
      BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
      PrintStream out = new PrintStream(new File("cookieout.out"));
      DecimalFormat df = new DecimalFormat("#.0000000");
      int tot = Integer.parseInt(in.readLine());
      for(int k = 0; k < tot; k++)
      {
         String data = in.readLine();
         int sp = data.indexOf(" ");
         double c = Double.parseDouble(data.substring(0, sp));
         data = data.substring(sp+1);
         sp = data.indexOf(" ");
         double f = Double.parseDouble(data.substring(0, sp));
         data = data.substring(sp+1);
         double x = Double.parseDouble(data);
         double newx = x;
         double beg = x/2.0;
         boolean cont = true;
         double rate = 2.0;
         int count = 1;
         while(cont)
         {
            newx = newx+c;
            rate = rate+f;
            double t = 0;
            for(int z = 0; z < count; z++)
            {
               t += c/(2.0+z*f);
            }
            t+= (newx - c*count)/rate;
            if(t > beg)
            {
               cont = false;
            }
            else
            {
               beg = t;
            }
            count++;
         }
         //df.format
         out.print("Case #"+(k+1)+": ");
         out.println(df.format(beg));
      }
   }
}
