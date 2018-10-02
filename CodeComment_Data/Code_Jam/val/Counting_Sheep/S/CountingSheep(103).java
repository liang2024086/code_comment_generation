package methodEmbedding.Counting_Sheep.S.LYD447;

//Google Code Jam 2016 Warmup 1 - Permutations
//Take 2 vectors, switch any 2 coordinates, get the smallest resultant vector

import java.io.*;
import java.util.*;

public class CountingSheep {
   
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
         int baseVal = Integer.parseInt(in.readLine());
         if(baseVal == 0)
         {
           out.println("Case #" + String.valueOf(i+1) + ": INSOMNIA");
           continue;
         }
         int currentVal = baseVal;
         boolean[] seen = new boolean[10];
         boolean done = false;
         String temp = "";
         while (!done)
         {
           temp = String.valueOf(currentVal);
           for(int x = 0; x < 10; x++)
           {
             if(temp.indexOf(x + 48) != -1)
             {
               seen[x] = true;
             }
           }
           done = true;
           for(int x = 0; x < 10; x++)
           {
             done = done && seen[x];
           }
           currentVal += baseVal;
         }
         out.println("Case #" + String.valueOf(i+1) + ": " + temp);
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
