package methodEmbedding.Magic_Trick.S.LYD515;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.FileInputStream;
import java.util.Scanner;


public class Rv
{
   public static PrintWriter out = null;
   public static void main(String [] args)
   {
      try
      {
         out = new PrintWriter(new FileWriter("output.in"));    
      }
      catch (IOException e){
         System.out.println(e);
      }
   
      try{
         FileInputStream fs = new FileInputStream("A-small-attempt3.in" );
         //InputStream data = ((InputStream) fs);
      
         Scanner input = new Scanner( fs );
         int tests = input.nextInt();
         int cases = 1;
         int [][] first = new int [4][4];
         int [][] second = new int [4][4];
         String ccc = "";
         int judge = 0;
         int right = 0;
      
         while (tests > 0)
         {
            int guessA = input.nextInt()-1;
            
          
            
            for (int i =0; i<4;i++)
               for (int k = 0; k<4; k++)
                  first [i][k] = input.nextInt();
                      
            int guessB = input.nextInt()-1;
          
             
            for (int i =0; i<4;i++)
               for (int k = 0; k<4; k++)
                  second [i][k] = input.nextInt();
                      
            for (int v=0; v<4; v++)
            {
               for (int w=0; w<4; w++)
               {
                  if (first[guessA][v]==second[guessB][w])
                  {
                     judge++;
                     if (judge==1)
                        right = first[guessA][v];
                  }
               }
                         
            }
            if (judge<1)
               ccc = "Volunteer cheated!";
            else if (judge > 1)
               ccc = "Bad Magician!";
            else
               ccc = ""+right;
                      
            tests--;
            judge = 0;
            
            //System.out.println();
                     
            //out.print("Case #"+ccc+": ");
            out.print("Case #"+cases+": "+ccc+"");
            cases++;
            out.println();
            
               
         }
      
         
      
      }
      catch (FileNotFoundException e){
         System.out.println(e);
      }
      
      out.close();
      
   }
}
