package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1060;

import java.util.*;
import java.io.*;

public class Cookie
{
  public static void main(String[]args)throws Exception
  {
    Scanner sc=new Scanner(new File("B-small-attempt0.in"));
    PrintWriter pr=new PrintWriter(new File("Ans1.txt"));
    
    int T=Integer.parseInt(sc.nextLine());
    
    for(int i=0; i<T; i++)
    {
      double C=sc.nextDouble();
      double F=sc.nextDouble();
      double X=sc.nextDouble();
      double rate=2;
      
      double time=0;
      
      while(X/rate>C/rate+X/(rate+F))
      {
        time+=C/rate;
        rate+=F;
      }
      time+=X/rate;
      
      pr.println("Case #"+(i+1)+": "+time);
    }
    
    pr.close();
  }
}
