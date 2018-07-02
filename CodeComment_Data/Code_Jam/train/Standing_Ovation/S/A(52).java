package methodEmbedding.Standing_Ovation.S.LYD1737;

import java.io.*;
import java.awt.*;
import java.util.*;
public class A 
{
  public static void main(String[]args)
  {
    try
    {
    BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
    PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
    int cases = Integer.parseInt(in.readLine());
    for(int x=0;x<cases;x++)
    {
      int friends=0;
      int currentAudience=0;
      StringTokenizer st = new StringTokenizer(in.readLine());
      int max = Integer.parseInt(st.nextToken());
      String audience = st.nextToken();
      
      for(int y=0;y<=max;y++)
      {
        if(currentAudience < y)
        {
          friends+=(y-currentAudience);
          currentAudience +=y-currentAudience;
        }
        currentAudience+= (Integer.parseInt(audience.substring(y,y+1)));
        //System.out.println(currentAudience);
      }
      //System.out.println("Case done");
      out.println("Case #" + (x+1) + ": " + friends);
    }
    in.close();
    out.close();
    }
    catch(IOException e)
    {
    }
  }
}
