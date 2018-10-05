package methodEmbedding.Standing_Ovation.S.LYD389;

import java.io.*;
import java.util.*;
public class PA
{
  public static void main (String[]args) throws IOException
  {
    Scanner in = new Scanner (new BufferedReader(new FileReader("A-small-attempt1.in")));
    PrintWriter out = new PrintWriter (new File ("out.txt"));
    int p = in.nextInt();
    for (int q=0;q<p;q++)
    {
      int total = 0;
      int count = 0;
      int z = in.nextInt();
      String number = in.next();
      char[] digits1 = number.toCharArray();
      for (int x=0;x<=z;x++)
      {
        if (x>total)
        {
          count = count + x - total;
          total = x+ Character.getNumericValue(digits1[x]);
        }
        else
        {
          total = total + Character.getNumericValue(digits1[x]);
        }
      }
      out.println("Case #"+(q+1)+""+":"+" "+count);
    }
    out.close();
  }
}
