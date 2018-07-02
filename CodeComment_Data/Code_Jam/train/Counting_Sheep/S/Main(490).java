package methodEmbedding.Counting_Sheep.S.LYD64;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Main
{
   public static void main(String[] args) throws Exception
   {
      //Scanner inp = new Scanner(System.in);
      String fileName = "ASmallIn.txt";         
      Scanner inp = new Scanner(new File(fileName));
      PrintWriter pw = new PrintWriter(new File("outA.txt"));
      int cases = inp.nextInt();
      int c=0;
      while( c < cases )
      {
         boolean[] used = new boolean[10];
         int num = inp.nextInt();
         int m = 1;
         String outp = "insomnia";
         if( num > 0 )
         {
            boolean finished = false;
            while( !finished )
            {
               int newNum = m*num;
               outp = "" + newNum;
               while( newNum > 0 )
               {
                  used[newNum%10] = true;
                  newNum /= 10;
               }
               finished = true;
               for( int i=0; i<used.length; i++ )
               {
                  if( !used[i] )
                  {
                     finished = false;
                  }
               }
               m++;
            }
         }
         //System.out.println( "Case #" + (c+1) + ": " + outp ); 
         pw.println( "Case #" + (c+1) + ": " + outp );
         c++;
      }
      inp.close();
      pw.close();
   }
}
