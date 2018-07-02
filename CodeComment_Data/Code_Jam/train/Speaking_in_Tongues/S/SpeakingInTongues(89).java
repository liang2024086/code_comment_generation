package methodEmbedding.Speaking_in_Tongues.S.LYD706;

import java.io.*;
import java.util.*;

public class SpeakingInTongues
{
   public static void main(String [] args) throws IOException
   {
      Scanner scan = new Scanner(new File("one_small.in"));
      
      String alpha = "abcdefghijklmnopqrstuvwxyz";
      String googe = "yhesocvxduiglbkrztnwjpfmaq";
      
      int numCases = scan.nextInt();
      String junk = scan.nextLine();
      for (int z = 0; z < numCases; z++)
      {
         String raw = scan.nextLine();
         String res = "";
         for (int i = 0; i < raw.length(); i++)
         {
            char cur = raw.charAt(i);
            if (cur == ' ')
            {
               res += " ";
            }
            else
            {
               res += String.valueOf(googe.charAt(cur-'a'));
            }
         }
         System.out.println("Case #" + (z+1) + ": " + res);
      }
   }
}
