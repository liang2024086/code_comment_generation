package methodEmbedding.Standing_Ovation.S.LYD2217;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Applause
{
   public static void main(String[] args) throws Exception
   {
      Scanner inp = new Scanner(new File("a-small-attempt1.in.txt"));
      PrintWriter pw = new PrintWriter(new File("a-small.out"));
      int cases = inp.nextInt();
      int c = 1;
      while( cases > 0 ) {
         int n = inp.nextInt();
         int[] a = new int[n+1];
         String s = inp.next();
         for( int i=0; i<s.length(); i++ ){
            a[i] = s.charAt(i) - '0';      
         }
         
         int audienceCount = 0;
         int audienceAdd = 0;
         for( int i=0; i<=n; i++ ) {
            if( audienceCount < i ) {
               audienceAdd += (i-audienceCount);
               audienceCount += (i-audienceCount);
            }
            audienceCount += a[i];
         }
         pw.println( "Case #" + (c++) + ": " + audienceAdd );
         cases--;   
      }
      pw.close();
   }
}
