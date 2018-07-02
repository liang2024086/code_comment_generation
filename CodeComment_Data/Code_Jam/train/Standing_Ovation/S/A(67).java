package methodEmbedding.Standing_Ovation.S.LYD2162;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A
{

   public static void main(String[] args) throws FileNotFoundException
   {
      System.setOut(new PrintStream(new File("small.out")));
      Scanner scan = new Scanner(new File("small.in"));

      int numCases = scan.nextInt();
      for (int z = 1; z <= numCases; z++)
      {
         int smax = scan.nextInt();
         String people = scan.next();
         int applauding = 0;
         int friendCount = 0;
         for (int i = 0; i < people.length(); i++) 
         {
            if (applauding < i) 
            {
               int diff = (i - applauding);
               applauding += diff;
               friendCount += diff;
            }
            
            int num = Integer.parseInt(Character.toString(people.charAt(i)));
            applauding += num;
         }
         
         System.out.println("Case #" + z + ": " + friendCount);
      }

      scan.close();
   }

}

