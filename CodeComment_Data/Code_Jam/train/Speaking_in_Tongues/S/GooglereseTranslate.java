package methodEmbedding.Speaking_in_Tongues.S.LYD1562;

public class GooglereseTranslate
{
   private static int[] cypher = {
                           'y' - 'a',
                           'h' - 'b',
                           'e' - 'c',
                           's' - 'd',
                           'o' - 'e',
                           'c' - 'f',
                           'v' - 'g',
                           'x' - 'h',
                           'd' - 'i',
                           'u' - 'j',
                           'i' - 'k',
                           'g' - 'l',
                           'l' - 'm',
                           'b' - 'n',
                           'k' - 'o',
                           'r' - 'p',
                           'z' - 'q', 
                           't' - 'r',
                           'n' - 's',
                           'w' - 't',
                           'j' - 'u',
                           'p' - 'v',
                           'f' - 'w',
                           'm' - 'x',
                           'a' - 'y',
                           'q' - 'z', };

   public static void main(String[] args)
   {
      java.util.Scanner console = new java.util.Scanner(System.in);
      String input = "";
      StringBuilder output = new StringBuilder("");

      int T = 0;
      int index;


      T = console.nextInt();
      console.nextLine();
      

      for (int i = 0; i < T; i++)
      {
         input = console.nextLine();
         output.append("Case #" + (i + 1) + ": ");

         for (char c: input.toCharArray())
         {
            if (c != ' ')
            {
               index = (int) (c - 'a');
               output.append((char) (c + cypher[index]));
            } else
            {
               output.append(' ');
            }
         }

         System.out.println(output);
         output.delete(0, output.length());
      }


      return;
   }

}
