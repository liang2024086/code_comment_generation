package methodEmbedding.Magic_Trick.S.LYD1644;

import java.io.*;
import java.util.*;

public class Magic_Trick
{
   public static void main(String[] args) throws Exception
   {
      PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
      Scanner scn = new Scanner(new File("A-small-attempt0.in"));
      int testCases = scn.nextInt();
      for(int x = 0; x < testCases; x++)
      {
         int[][] state1 = new int[4][4];
         int firstLine = scn.nextInt()-1;
         for(int k = 0; k < 4; k++)
            for(int j = 0; j < 4; j++)
               state1[k][j] = scn.nextInt();
         int[][] state2 = new int[4][4];
         int secondLine = scn.nextInt()-1;
         for(int k = 0; k < 4; k++)
            for(int j = 0; j < 4; j++)
               state2[k][j] = scn.nextInt();
         int[] row1 = {state1[firstLine][0], state1[firstLine][1], state1[firstLine][2], state1[firstLine][3]};
         int[] row2 = {state2[secondLine][0], state2[secondLine][1], state2[secondLine][2], state2[secondLine][3]};
         int numSols = 0;
         int solution = 0;
         for(int k = 0; k < row1.length; k++)
         {
            for(int j = 0; j < row2.length; j++)
            {
            
               if(row1[k] == row2[j])
               {
                  numSols++;
                  solution = row1[k];
               }
            }
         }
         writer.print("Case #" + (x+1) + ": ");
         if(numSols == 0)
            writer.println("Volunteer cheated!");
         else if(numSols == 1)
            writer.println("" + solution);
         else
            writer.println("Bad magician!");
      }
      writer.close();
   }
  
}
