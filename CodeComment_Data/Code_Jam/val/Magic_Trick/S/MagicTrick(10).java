package methodEmbedding.Magic_Trick.S.LYD435;

import java.util.*;
import java.io.*;

public class MagicTrick
{
   public static void main(String[] args) throws Exception
   {
      BufferedReader inputer = new BufferedReader(new FileReader("A-small-attempt0.in"));
      PrintWriter outputer = new PrintWriter(new BufferedWriter(new FileWriter("MagicTrick.out")));
      
      int T = Integer.parseInt(inputer.readLine());
      StringTokenizer st;
      for(int i = 0; i < T; i++)
      {
         int row1 = Integer.parseInt(inputer.readLine());
         int num1s[] = new int[4];
         for(int j = 1; j <= 4; j++)
         {
            String temp = inputer.readLine();
            if(j == row1)
            {
               st = new StringTokenizer(temp);
               for(int k = 0; k < 4; k++)
                  num1s[k] = Integer.parseInt(st.nextToken());
            }
         }
         
         int row2 = Integer.parseInt(inputer.readLine());
         int num2s[] = new int[4];
         for(int j = 1; j <= 4; j++)
         {
            String temp = inputer.readLine();
            if(j == row2)
            {
               st = new StringTokenizer(temp);
               for(int k = 0; k < 4; k++)
                  num2s[k] = Integer.parseInt(st.nextToken());
            }
         }
         
         int match = -1;
         int j;
         for(j = 0; j < num1s.length; j++)
         {
            int k;
            for(k = 0; k < num2s.length; k++)
            {
               if(num1s[j] == num2s[k])
               {
                  if(match == -1)
                     match = num1s[j];
                  else
                     break;
               }
            }
            
            if(k < num2s.length)
               break;
         }
         
         outputer.print("Case #" + (i + 1) + ": ");
         if(j < num2s.length)
            outputer.println("Bad magician!");
         else if(match == -1)
            outputer.println("Volunteer cheated!");
         else
            outputer.println(match);
      }
      
      outputer.close();
      inputer.close();
   }
}
