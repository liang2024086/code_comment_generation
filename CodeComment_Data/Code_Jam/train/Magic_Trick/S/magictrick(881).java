package methodEmbedding.Magic_Trick.S.LYD2101;

import java.util.*;
import java.io.*;

public class magictrick
{
   public static StringTokenizer st;
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("answer.txt")));//writes file
      
      int num = Integer.parseInt(br.readLine());
      int[] one = new int[4];
      int[] two = new int[4];
      
      for(int i = 0; i < num; i++)
      {
         int check = 0;
         
         
         int row = Integer.parseInt(br.readLine());
         
         for(int j = 0; j < row - 1; j++)
            br.readLine();
         
         st = new StringTokenizer(br.readLine());   
         //gets the numbers in the first row
         for(int j = 0; j < 4; j++)
            one[j] = Integer.parseInt(st.nextToken());
         //gets to the next block
         for(int j = 0; j < 4 - row; j++)
            br.readLine();
            
            
            
            
         row = Integer.parseInt(br.readLine());
         
         for(int j = 0; j < row - 1; j++)
            br.readLine();
      
         st = new StringTokenizer(br.readLine());
         //numbers in the second row
         for(int j = 0; j < 4; j++)
            two[j] = Integer.parseInt(st.nextToken());
         //gets to the next block
         for(int j = 0; j < 4 - row; j++)
            br.readLine();
      
      int n = 0;
         for(int j = 0; j < 4; j++)
            for(int k = 0; k < 4; k++)
            {
               if(one[j] == two[k])
                  {check++; n = one[j];}
            }
         
       if(check == 0)
       output.println("Case #" + (i+1) + ": " + "Volunteer cheated!");
       
       if(check == 1)
       output.println("Case #" + (i+1) + ": " + n);
       
       if(check > 1)
       output.println("Case #" + (i+1) + ": " + "Bad magician!");
      }
      output.close();
   }
}
