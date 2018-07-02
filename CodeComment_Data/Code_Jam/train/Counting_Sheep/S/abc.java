package methodEmbedding.Counting_Sheep.S.LYD895;

import java.util.Scanner;
import java.io.*;
class abc
{
  public static void main(String[] args) {
  Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
  int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
  for (int i = 1; i <= t; ++i) {
    int n = in.nextInt();
    int s=0;int r=n;
    boolean k[]=new boolean[10];
    if(n==0)
    {
      System.out.println("Case #" + i +": INSOMNIA") ;
      continue;
    }
    else
    {
      int p=2;
      while(s!=10)
      {
        int copy=r;
        while(copy!=0)
        {
          if(k[copy%10]==false)
          {
            k[copy%10]=true;
            s++;
            //System.out.println(n+" "+s);
          }
          copy=copy/10;
        }

        r=n*p;
        p++;
      }

      System.out.println("Case #" + i + ": " + (n*(p-2)));
    }

  }
}
}
