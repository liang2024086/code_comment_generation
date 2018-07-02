package methodEmbedding.Standing_Ovation.S.LYD421;

import java.io.*;
import java.util.*;

public class CodeJam1
{
  public static void main (String[] args) throws Exception
  {
    Scanner in = new Scanner(new File("ab.in"));
    //Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
    
    int n = in.nextInt();
    for(int t =0; t<n; t++)
    {
      int k = in.nextInt();
      String take = in.next();
      int standing = 0;
      int added = 0;
      for (int x =0; x<= k; x++)
      {
        int now = Integer.parseInt(""+take.charAt(x));
        if (x>standing && now != 0){
          added += x-standing;
          standing = x;
        }
        standing += now;
      }
      
      String ans = ""+added;
      out.println("Case #" + (t+1) + ": " + ans);
      System.out.println("Case #" + (t+1) + ": " + ans);
    }
    
    
    in.close();
    out.close();
  }
}
