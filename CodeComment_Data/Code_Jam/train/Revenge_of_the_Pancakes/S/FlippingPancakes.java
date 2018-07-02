package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1194;

//Google Code Jam 2016 Warmup 1 - Permutations
//Take 2 vectors, switch any 2 coordinates, get the smallest resultant vector

import java.io.*;
import java.util.*;

public class FlippingPancakes {
   
  public static void main(String[] args)
  {
    //Typical try-catch stuff. 
     try
     {
       //IO Elements
       BufferedReader in = new BufferedReader(new FileReader("in.txt"));
       PrintWriter out = new PrintWriter(new File("out.txt"));
       
       //Data Stuffs
       String input;
       int numInputs;
       
       //Load in inputs
       numInputs = Integer.parseInt(in.readLine());
       
       String output = "";
       
       for(int i = 0; i < numInputs; i++)
       {
         String line = in.readLine();
         char last = line.charAt(0);
         int flips = 0;
         for(int x = 1; x < line.length(); x++)
         {
           if(last != line.charAt(x))
           {
             flips++;
             last = line.charAt(x);
           }
         }
         if(last == '-')
           flips++;
         out.println("Case #" + String.valueOf(i+1) + ": " + String.valueOf(flips));
       }
       
       out.close();
       
     }
     catch(IOException e)
     {
       System.out.println("IOEXCEPTION");
       System.out.println(e.getMessage());
     }
  }
}
