package methodEmbedding.Standing_Ovation.S.LYD132;

// Name: Abhishek Mishra
import java.io.*;
import java.util.*;
public class Standing_Ovation
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner sc = new Scanner(new File("A-small-attempt4.in"));
      PrintStream out = new PrintStream(new FileOutputStream("A-small-attempt4.out"));
      System.setOut(out);
      int cases = sc.nextInt();
      for (int i = 1; i <= cases; i++)
      {
         int maximumShyness = sc.nextInt();
         char[] audience = sc.next().toCharArray();
         int people = 0;
         int clapping = 0;
         if (audience[0] == '0')
         {
            audience[0] = '1';
            people++;
         }
         for (int s = 0; s < audience.length; s++)
         {
            if (clapping >= maximumShyness)
               break;
            else
            {
               if (clapping < s)
               {
                  people += s - clapping;
                  clapping += s - clapping;
               }
               if (clapping >= s)
                  clapping += Integer.parseInt(audience[s] + "");
            }  
         }
         System.out.println("Case #" + i + ": " + people); 
      }
   }
}
