package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1459;

   import java.io.*;
   import java.util.*;

   public class cookie {
      public static void main(String[] args) throws IOException
      {
         BufferedReader inFile;
         PrintWriter out;
         int count = 0;
         try
         {
            inFile = new BufferedReader(new FileReader("B-small-attempt0.in"));
            out = new PrintWriter(new FileWriter("B-small-attempt0.out"));
            int cases = Integer.parseInt(inFile.readLine());
            double c, f, x;
            String[] asdf;
            String asd;
            double t1;
            double t2;
            int farms;
            double production;
            double time;
            for(int i = 0; i < cases; i++)
            {	
               asd = inFile.readLine();
               asdf = asd.split(" ");
               c = Double.parseDouble(asdf[0]);
               f = Double.parseDouble(asdf[1]);
               x = Double.parseDouble(asdf[2]);
               t1 = x/2.0;
               farms = 0;
               production = 2.0;
               time = 0;
               while(true)
               {
                  time += c/production;
                  farms++;
                  production += f;
                  t2 = time + x/production;
                  if(t1 <= t2)
                  {
                     break;
                  }
                  t1 = t2;
               }
               out.println("Case #" + (i+1) + ": " + t1);
            
            }
         
         
            out.close();
         }
            catch(FileNotFoundException e) 
            {
            }
      }
   }
