package methodEmbedding.Standing_Ovation.S.LYD2107;

import java.util.*;
import java.io.*;

public class p1 
{
  public static void main (String[]args)throws IOException
  {
    Scanner s=new Scanner (new File("A-small-attempt0.in"));
    PrintWriter out=new PrintWriter(new FileWriter("out.txt"));
    //Scanner s=new Scanner (System.in);
    
    int cases=s.nextInt();
    for (int n=0;n<cases;n++)
    {
      int max=s.nextInt();
      String next=s.next();
      int []people=new int[max+1];
      for(int x=0;x<=max;x++)
      {
        people[x]=Integer.parseInt(next.substring(x,x+1));
      }  
      
      int ans=0;
      int clap=0;
      for (int x=0;x<=max;x++)
      {
        if (clap>=x)
        {
          clap+=people[x];
        }
        else
        {
          ans++;
          while(clap<x)
          {
            clap++;
          }
          clap+=people[x];
        }
      }
      
      out.println ("Case #"+(n+1)+": "+ans+" ");
      System.out.println ("Case: #"+(n+1)+": "+ans+" ");
    }
    out.close();
  }
}
