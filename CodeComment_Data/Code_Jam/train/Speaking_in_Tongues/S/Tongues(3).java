package methodEmbedding.Speaking_in_Tongues.S.LYD1258;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Tongues
{
  public static void main(String... args)
  {
    Scanner sc = new Scanner(System.in);
    String sampleIn =  "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jvqz";
    String sampleOut = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give upzq";
    Map<Character, Character> map = new HashMap<Character, Character>();
    for (int i = 0; i < sampleIn.length(); i++)
    {
      map.put(sampleIn.charAt(i), sampleOut.charAt(i));
    }
    
    int tests = sc.nextInt();
    sc.nextLine();
    for (int test = 1; test <= tests; test++)
    {
      String line = sc.nextLine();
      StringBuffer out = new StringBuffer();
      for (int i = 0; i < line.length(); i++)
      {
        Character result = map.get(line.charAt(i));
        if (result != null)
        {
          out.append(result);
        }
        else
        {
          out.append(line.charAt(i));
        }
      }
      System.out.println("Case #" + test + ": " + out);
    }
  }
}
