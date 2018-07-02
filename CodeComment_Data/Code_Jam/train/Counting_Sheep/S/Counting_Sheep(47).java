package methodEmbedding.Counting_Sheep.S.LYD780;

import java.io.*;
import java.util.Scanner;

public class Counting_Sheep{
   public static void main(String[] args) throws IOException{
      Scanner scan = new Scanner(new File("A-small-attempt.txt"));
      PrintWriter output = new PrintWriter(new File("Counting_Sheep_output.txt"));
      
      int[] arr;
      int T = scan.nextInt();
      int N, count;
      String str;
      
      test:
      for(int i = 1; i <= T; i++){
         N = scan.nextInt();
         count = 0;
         arr = new int[10];
         
         output.print("Case #" + i + ": ");
         
         for(int j = 1; (j * N) > 0; j++){
            
            str = String.valueOf(j * N);
            
            for(int k = 0; k < str.length(); k++){
               if(0 == arr[Character.getNumericValue(str.charAt(k))]++){
                  if(++count == 10){
                     output.println(str);
                     continue test;
                  }
               }
            }
         }
         
         output.println("INSOMNIA");
      }
      
      scan.close();
      output.close();
   }
}
