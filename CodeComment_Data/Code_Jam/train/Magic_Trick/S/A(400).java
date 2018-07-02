package methodEmbedding.Magic_Trick.S.LYD644;

import java.io.*;
import java.util.*;
public class A
{
  public static void main(String[] arg)throws IOException
  {
    BufferedReader in=new BufferedReader(new FileReader("A-small-attempt1.in"));
    PrintWriter out=new PrintWriter(new FileWriter("A.out"));
    int num=Integer.parseInt(in.readLine());
    for(int asd=1;asd<=num;asd++)
    {
      out.print("Case #"+asd+": ");
      int c=Integer.parseInt(in.readLine());
      ArrayList<Integer> cards=new ArrayList<Integer>();
      for(int x=1;x<=4;x++)
      {
        String[] temp=in.readLine().split(" ");
        if (c==x)
        {
          for(int y=0;y<4;y++)
          cards.add(Integer.parseInt(temp[y]));
        }
      }
      //System.out.println(cards);
      int c2=Integer.parseInt(in.readLine());
      int lolz=-1;
      outerloop:
      for(int x=1;x<=4;x++)
      {
        String[] temp2=in.readLine().split(" ");
        if (c2==x)
        {
          for(int y=0;y<4;y++)
          {
            int temp=Integer.parseInt(temp2[y]);
            //System.out.println(temp);
            if(cards.contains(temp))
            {
              if (lolz==-1)
                lolz=temp;
              else
              {
                out.println("Bad magician!");
                lolz=-2;
                break;
              }
            }
          }
        }
      }
      if(lolz==-1)
        out.println("Volunteer cheated!");
      else
        if(lolz!=-2)
        out.println(lolz);
    }
    in.close();
    out.close();
  }
}
