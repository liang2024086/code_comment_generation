package methodEmbedding.Standing_Ovation.S.LYD728;

import java.util.*;
import java.io.*;
public class A
{
  public A()
  {
    try
    {
      Scanner s = new Scanner (new FileReader("A-small-attempt0.in"));
      PrintWriter out = new PrintWriter (new PrintWriter("output.txt"));
      int numTest = s.nextInt();
      for (int x =0; x < numTest;x++)
      {
        int max = s.nextInt();
        String peep = s.next();
        int extra = 0;
        int persons =0;
        for (int y=0;y<max+1;y++)
        {
          if (y > persons)
          {
            extra+=y-persons;
            persons+=y-persons;
          }
          persons += peep.charAt(y)-48;
        }
        out.println ("Case #"+(x+1)+": "+extra);
      }
      out.close();
    }
    catch (Exception e)
    {
    }
  }
  public static void main (String[] args)
  {
    new A();
  }
}
