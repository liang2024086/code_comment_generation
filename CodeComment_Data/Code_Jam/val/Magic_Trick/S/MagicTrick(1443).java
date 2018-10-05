package methodEmbedding.Magic_Trick.S.LYD301;

import java.util.*;
import java.io.*;

public class MagicTrick
{
  public static void main(String[]args)throws Exception
  {
    Scanner sc=new Scanner(new File("A-small-attempt0 (2).in"));
    PrintWriter pr=new PrintWriter(new File("Ans1.txt"));
    
    int T=Integer.parseInt(sc.nextLine());
    
    for(int i=0; i<T; i++)
    {
      int row1=Integer.parseInt(sc.nextLine());
      String [] row1st={}, row2st={};
      
      for(int j=1; j<=4; j++)
      {
        if(j==row1)
          row1st=sc.nextLine().split(" ");
        else
          sc.nextLine();
      }
      
      int row2=Integer.parseInt(sc.nextLine());
      
      for(int j=1; j<=4; j++)
      {
        if(j==row2)
          row2st=sc.nextLine().split(" ");
        else
          sc.nextLine();
      }
      
      int count=0;
      int match=0;
      
      for(int k=0; k<4; k++)
      {
        for(int j=0; j<4; j++)
        {
          if(row1st[k].equals(row2st[j]))
          {
            count++;
            match=Integer.parseInt(row1st[k]);
          }
        }
      }
      
      if(count==0)
        pr.println("Case #"+(i+1)+": Volunteer cheated!");
      else if(count==1)
        pr.println("Case #"+(i+1)+": "+match);
      else
        pr.println("Case #"+(i+1)+": Bad magician!");
    }
    
    pr.close();
  }
}
