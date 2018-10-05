package methodEmbedding.Magic_Trick.S.LYD1498;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class MagicTrick
{
   public static void main(String[] args) throws Exception
   {
      Scanner inp = new Scanner(new File("MagicTrick2.txt"));
      PrintWriter outp = new PrintWriter("MagicTrick.out", "UTF-8");
      
      int n = inp.nextInt();
      int r;
      int[] c1 = new int[4];
      int[] c2 = new int[4];
      int count = 0;
            
      for( int i=0; i<n; i++ )
      {
         count = 0;
         r = inp.nextInt();
         for( int j=0; j<4; j++ )
         {
            for( int k=0; k<4; k++ )
            {
               if( j == r-1 )
               {
                  c1[k] = inp.nextInt();   
               }
               else
               {
                  inp.nextInt();
               }
            }
         } 
         
         r = inp.nextInt();
         for( int j=0; j<4; j++ )
         {
            for( int k=0; k<4; k++ )
            {
               if( j == r-1 )
               {
                  c2[k] = inp.nextInt();   
               }
               else
               {
                  inp.nextInt();
               }
            }
         } 
         int val = 0;
         for( int j=0; j<c1.length; j++ )
         {
            for( int k=0; k<c1.length; k++ )
            {
               if( c1[k] == c2[j] )
               {
                  val = c1[k];
                  count++;
               }
            }
         }
         outp.print( "Case #" + (i+1) + ": ");
         if( count == 0 )
         {
            outp.println( "Volunteer cheated!");
         }
         else if( count == 1 )
         {
            outp.println( val);
         }
         else
         {
            outp.println( "Bad magician!");         
         }
      }   
      outp.close();
   }
}
