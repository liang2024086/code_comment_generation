package methodEmbedding.Magic_Trick.S.LYD1343;

/*
   Magic Trick
   @author gary https://plus.google.com/110619450313015458698
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick
{
   static public void main(String[] args)
   {
      Scanner fin;
      PrintWriter fout;
      try
      {
         fin = new Scanner(new File("MagicTrick.in"));
         fout = new PrintWriter(new File("MagicTrick.out"));
      }
      catch(FileNotFoundException fnfe)
      {
         fnfe.printStackTrace(System.err);
         return;
      }
      
      int t;
      
      t = fin.nextInt();
      for(int x=1; x<=t; x++)
      {
         int r1, r2;
         int[][] board1 = new int[4][4], board2 = new int[4][4];
         boolean[] ele1 = new boolean[16], ele2 = new boolean[16];
         int count=0, ans=-1;
         
         r1 = fin.nextInt() - 1;
         for(int i=0; i<4; i++)
            for(int j=0; j<4; j++)
               board1[i][j] = fin.nextInt() - 1;
         
         r2 = fin.nextInt() - 1;
         for(int i=0; i<4; i++)
            for(int j=0; j<4; j++)
               board2[i][j] = fin.nextInt() - 1;
         
         for(int j=0; j<4; j++)
            ele1[board1[r1][j]] = ele2[board2[r2][j]] = true;
         
         for(int i=0; i<16; i++)
         {
            if(ele1[i] && ele2[i])
            {
               count++;
               ans = i+1;
            }
         }
         
         fout.print("Case #"+x+": ");
         switch(count)
         {
            case 1:
               fout.println(ans);
               continue;
            case 0:
               fout.println("Volunteer cheated!");
               continue;
            default:
               fout.println("Bad magician!");
         }
      }
      
      fin.close();
      fout.close();
   }
}
