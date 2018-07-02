package methodEmbedding.Counting_Sheep.S.LYD889;

//DANIEL YANG USACO
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class Sheep{
   public static void main(String args[]) throws IOException
   {
      BufferedReader f = new BufferedReader(new FileReader("Sheep.in"));
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Sheep.out")));
      StringTokenizer st = new StringTokenizer(f.readLine());
      
      int N = Integer.parseInt(st.nextToken());
      String temp = "";
      boolean[] nums = new boolean[10];
      for(int i = 0; i < 10; i++)
         nums[i] = false;
      boolean allT = false;
      
      int caseNum = 1;
      int initial = 0;
      int result = 0;
      for(int i = 0; i < N; i++) //loop testcases
      {
         st = new StringTokenizer(f.readLine());
         temp = st.nextToken();
         initial = Integer.parseInt(temp);
       //  System.out.println(temp);
         if(Integer.parseInt(temp) == 0)
         {
            out.println("Case #" + caseNum + ": INSOMNIA");
            caseNum++;
            continue;
         }
         
         result = Integer.parseInt(temp);
         for(int k = 0; k < temp.length(); k++)
            nums[Integer.parseInt(temp.substring(k, k+1))] = true;
         for(int j = 0; j < 10; j++)//checks for all true
         {
            if(nums[j] == false)
               {
               allT = false;
               break;
               }
            allT = true;
         }
            
         while(allT != true)
         {
            temp = String.valueOf(Integer.parseInt(temp) + initial);
            //System.out.println(temp);
            result = Integer.parseInt(temp);
            for(int k = 0; k < temp.length(); k++)
            {  
               nums[Integer.parseInt(temp.substring(k, k+1))] = true;
            }
         
            for(int j = 0; j < 10; j++)//checks for all true
            {
               if(nums[j] == false)
               { 
                  allT = false;
                  break;
               }
               allT = true;
            }
            //System.out.println("ALLT " + allT);
            //for(int x = 0; x < 10; x++)
               //System.out.print(nums[x] + " " );
            //System.out.println();
            
         }
         
      
         out.println("Case #" + caseNum + ": " + result);
         caseNum++;
         allT = false;//resets allT
         nums = new boolean[10];//resets array
         for(int z = 0; z < 10; z++)
            nums[z] = false;
       
      }
      
      out.close();
   }
   
      
}
