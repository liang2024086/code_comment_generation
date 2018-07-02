package methodEmbedding.Revenge_of_the_Pancakes.S.LYD3;

import java.io.*;
import java.util.Scanner;

public class Revenge_of_the_Pancakes{
   public static void main(String[] args) throws IOException{
      Scanner scan = new Scanner(new File("B-small-attempt.txt"));
      PrintWriter output = new PrintWriter(new File("Revenge_of_the_Pancakes_output.txt"));
      
      int T = scan.nextInt();
      String str = scan.nextLine();
      int flips;
      
      for(int i = 1; i <= T; i++){
         flips = 0;
         str = scan.nextLine();
         
         for(int j = 1; j < str.length(); j++){
            if(str.charAt(j) != str.charAt(j-1)) flips++;
         }
         if(str.charAt(str.length() - 1) == '-') flips++;
         
         output.println("Case #" + i + ": " + flips);
      }
      
      scan.close();
      output.close();
   }
}
