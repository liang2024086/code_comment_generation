package methodEmbedding.Revenge_of_the_Pancakes.S.LYD233;


import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class B
{
   public static void main(String[] args) throws Exception
   {
      System.setOut(new PrintStream(new File("a.out")));
      Scanner scan = new Scanner(new File("a.in"));
      int numCases = scan.nextInt();
      for (int z = 1; z <= numCases; z++)
      {
         String input = scan.next();
         
         boolean happy = input.charAt(0) == '+';
         int result = 0;
         for (int i = 1; i < input.length(); i++)
         {
            if (input.charAt(i) != input.charAt(i-1))
            {
               result++;
               happy = !happy;
            }
         }
         
         System.out.println("Case #" + z + ": " + (result + (happy ? 0 : 1)));
      }
      scan.close();
   }
}
