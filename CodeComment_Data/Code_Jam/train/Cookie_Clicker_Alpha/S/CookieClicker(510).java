package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1163;

import java.util.Scanner;
import java.io.*;

public class CookieClicker
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner s = new Scanner(new File("B-small-attempt0.in"));
      int iterations = s.nextInt();
      s.nextLine();
      
      PrintWriter pw = new PrintWriter("out.txt"); //initialize the output file
      pw.close();
      
      for(int n = 1; n <= iterations ; n++)
      {
         //String output = "";
                  
         double farmCost = s.nextDouble(); //C
         double farm = s.nextDouble(); //F
         double goal = s.nextDouble(); //X
         double gain = 2;
         double time = 0;
         
         while (farmCost/gain + goal/(gain + farm) < goal/gain)
         {
            time += farmCost/gain;
            gain += farm;
         }
         
         time += goal/gain;
      
         try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt", true)))) 
         {
            if(n < iterations)
               out.printf("Case #%d: %.7f%n",n,time); 
            else
               out.printf("Case #%d: %.7f",n,time);   
         }
         catch (IOException e) 
         {
            System.out.println("whoops"); //complex error-handling
         }
      }
      
   }
}
