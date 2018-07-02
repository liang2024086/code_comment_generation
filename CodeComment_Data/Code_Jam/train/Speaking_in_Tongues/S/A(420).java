package methodEmbedding.Speaking_in_Tongues.S.LYD307;


import java.util.*;


public class A
{
   public static void main(String[] args)
   {
      new A(new Scanner(System.in));
   }

   public A(Scanner in)
   {
      int tc = 1;
      char[] vs = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
      int T = Integer.parseInt(in.nextLine());
      while (T-->0)
      {
         String[] line1 = in.nextLine().split(" ");
         for (int i=0; i<line1.length; i++)
         {
            StringBuilder sb = new StringBuilder();
            String s1 = line1[i];
            for (int j=0; j<s1.length(); j++)
            {
               int a = (int)(s1.charAt(j)-'a');
               sb.append(vs[a]);
            }
            line1[i] = sb.toString();
         }
         StringBuilder sb = new StringBuilder();
         sb.append(String.format("Case #%d:", tc++));
         for (String s : line1)
         {
            sb.append(' ');
            sb.append(s);
         }
         System.out.println(sb.toString());
      }
   }
}
