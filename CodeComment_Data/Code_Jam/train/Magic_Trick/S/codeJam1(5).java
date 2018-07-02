package methodEmbedding.Magic_Trick.S.LYD1253;

import java.util.*;
import java.io.*;

public class codeJam1
{
  public static void main (String []args)throws IOException 
  {
    Scanner s=new Scanner (new File ("A-small-attempt0.in"));
    PrintWriter out=new PrintWriter (new FileWriter("out.txt"));
    int cases=s.nextInt ();
    int [] firstRow=new int [4];
    int [] secondRow=new int [4];
    int answer=0;
    int repeats=0;
    for (int x=0;x<cases;x++)
    {
      repeats=0;
      answer=0;
      int row1=s.nextInt ();
      for (int y=1;y<5;y++)
      {
        if (y==row1)
        {
          firstRow[0]=s.nextInt();
          firstRow[1]=s.nextInt();
          firstRow[2]=s.nextInt();
          firstRow[3]=s.nextInt();
        }
        else
        {
        s.nextInt();
        s.nextInt();
        s.nextInt();
        s.nextInt();
        }
      }
      int row2=s.nextInt();
      for (int y=1;y<5;y++)
      {
        if (y==row2)
        {
          secondRow[0]=s.nextInt();
          secondRow[1]=s.nextInt();
          secondRow[2]=s.nextInt();
          secondRow[3]=s.nextInt();
        }
        else
        {
        s.nextInt();
        s.nextInt();
        s.nextInt();
        s.nextInt();
        }
      }
      Arrays.sort (firstRow);
      Arrays.sort (secondRow);
      for (int y=0;y<4;y++)
      {
    //    System.out.println (firstRow [y]+" "+secondRow [y] +" "+Arrays.binarySearch(secondRow,7));
        if (Arrays.binarySearch(secondRow,firstRow[y])>-1)
        {
          repeats++;
          answer=firstRow[y];
  //        System.out.println (firstRow[y]+" "+Arrays.binarySearch(secondRow,firstRow[y]));
        }       
      }
      out.print ("Case #"+(x+1)+": ");
      if (repeats==0)
      out.println ("Volunteer cheated!");
      else if (repeats==1)
        out.println (answer);
      else 
        out.println ("Bad magician!");
    }
    out.close();
  }
}
