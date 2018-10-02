package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1156;

import java.math.*;
import java.io.*;
import java.util.*;
public class pancake
{
   public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new FileReader("B.in"));
      PrintWriter out=new PrintWriter(new FileWriter("B.out"));
      int T=Integer.parseInt(br.readLine());
      for(int x=0;x<T;x++){
         String A = br.readLine();
         String[] ar = A.split("");
         boolean flag = true;
         int count=0;
         for(int y = ar.length-1; y > -1; y--){
            switch(ar[y]){
               case "+":
                  {
                     if(!flag){
                        count++;
                        flag = !flag;
                     }
                     break;
                  }
               case "-":
                  {
                     if(flag){
                        count++;
                        flag = !flag;
                     }
                     break;
                  }
            }
         }
         out.println("Case #"+(x+1)+": "+count);
      }
      out.close();
   }
}
