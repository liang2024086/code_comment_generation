package methodEmbedding.Speaking_in_Tongues.S.LYD1410;

   import java.io.*;
   import java.util.*;
    public class SpeakingInTongues
   {
       public static void main(String[] args)throws Exception
      {
         BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
         String s = "abcdefghijklmnopqrstuvwxyz";
         String t = "yhesocvxduiglbkrztnwjpfmaq";
         
         int numCases = Integer.parseInt(br.readLine());
         for(int x = 0; x < numCases; x++)
         {
            String translated = "";
            String p = br.readLine();
            for(int i = 0; i < p.length(); i++)
            {
               if(p.charAt(i) == ' ')
                  translated += " ";
               else
                  translated += t.charAt(s.indexOf(p.charAt(i)+""))+"";
            }
            System.out.println("Case #" + (x+1) + ": "+translated);
         }
      }
   }
