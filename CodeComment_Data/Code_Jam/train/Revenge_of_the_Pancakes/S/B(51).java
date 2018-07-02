package methodEmbedding.Revenge_of_the_Pancakes.S.LYD377;

import java.util.*;
import java.io.*;
public class B{
   public static void main(String args[]) throws FileNotFoundException{
      PrintStream printer = new PrintStream(new FileOutputStream("B-small-attempt0.out"));
      Scanner scan = new Scanner(new File("B-small-attempt0.in"));
      int n = scan.nextInt();
      for(int i = 0; i < n; i++){
         String s = scan.next()+"+";
         int count = 0;
         char[] charArray = s.toCharArray();
         for(int k = 0; k < charArray.length-1; k++){
            if(charArray[k] != charArray[k+1])
               count++;
         }
         printer.println("Case #" + (i+1) + ": " + count);
      }
   }
}
