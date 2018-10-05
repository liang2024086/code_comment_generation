package methodEmbedding.Standing_Ovation.S.LYD6;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class Prelim
{
   public static void main(String[] args) throws FileNotFoundException{
      String filename = "A-small-attempt2.in";
      Scanner sc = new Scanner(new File(filename));
      int n = Integer.parseInt(sc.next());
      int[] shyness = new int[n];
      String[] input = new String[n];
      String[] output = new String[n];
      for(int x = 0; x < n; x++){
         shyness[x] = sc.nextInt();
         input[x] = sc.next();
      } 
      
      for(int x = 0; x < n; x++){
         int maxshy = shyness[x];
         int peoplestanding = 0;
         int friends = 0;
         for(int req = 0; req <= maxshy; req++){
            int curshynesslevel = Integer.parseInt(input[x].charAt(0) + "");
            input[x] = input[x].substring(1);
            
            if(peoplestanding >= req){
               peoplestanding += curshynesslevel;
            }
            
            else if(curshynesslevel > 0){
               friends += req - peoplestanding;
               peoplestanding = req + curshynesslevel;
            }
         }
         output[x] = friends + "";
         
      }
      
      String outputfile = ""; 
      for(int x = 0; x < n; x++){
         outputfile += ("Case #" + (x + 1) + ": " + output[x] + "\n");
      }
      PrintStream outfile = null;
      outfile = new PrintStream(new FileOutputStream("output.txt"));
      outfile.print(outputfile);
   }
}
