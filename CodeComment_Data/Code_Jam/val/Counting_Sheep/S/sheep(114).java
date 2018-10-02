package methodEmbedding.Counting_Sheep.S.LYD1316;

import java.math.*;
import java.io.*;
import java.util.*;
public class sheep
{
   public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new FileReader("A.in"));
      PrintWriter out=new PrintWriter(new FileWriter("A.out"));
      int T=Integer.parseInt(br.readLine());
      for(int x=0;x<T;x++){
         int A = Integer.parseInt(br.readLine());
         String s = "INSOMNIA";
         if(A != 0){
            int B = A;
            int[] checked = new int[10];
            while(true){
               int C = B;
               while(C > 0){
                  checked[C%10] = 1;
                  C /= 10;
               }
               
               int flag = 1;
               for(int i=0; i<10; i++)
                  if(checked[i]==0) flag = 0;
               if(flag == 1){
                  s = Integer.toString(B);
                  break;
               }
               B += A;
            }
         }
         out.println("Case #"+(x+1)+": "+s);
      }
      out.close();
   }
}
