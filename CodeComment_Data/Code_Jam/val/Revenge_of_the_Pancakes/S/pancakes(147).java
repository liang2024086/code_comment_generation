package methodEmbedding.Revenge_of_the_Pancakes.S.LYD798;

//DANIEL YANG CODEJAM
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class pancakes{
   public static void main(String args[]) throws IOException
   {
      BufferedReader f = new BufferedReader(new FileReader("pancakes.in"));
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pancakes.out")));
      StringTokenizer st = new StringTokenizer(f.readLine());
      
      int N = Integer.parseInt(st.nextToken());
      String temp, x;
   
      int caseNum = 1;
      int result = 0; 
      for(int z = 0; z < N; z++)
      {
         temp = f.readLine();
         //System.out.println(temp);
         for(int i = temp.length()-1; i >= 0; i--)//if last character is +/-
         {
            if(temp.charAt(i) == '+')
               continue;
            else
            {
               for(int k = 0; k <= i; k++)//flips pancake
               {
                  if(temp.charAt(k) == '+')
                     x = temp.substring(0, k) + "-" + temp.substring(k+1);
                  else
                     x = temp.substring(0, k) + "+" + temp.substring(k+1);
                  //System.out.println(temp.substring(0, k)+ " " + temp.substring(k+1));
                  temp = x;
               // System.out.println(temp);
               }
            
            
            }
            result ++;
         }
         
      
      
         out.println("Case #" + caseNum + ": " + result);
         caseNum++;
         result = 0;
      }
      out.close();
      
   }
}
