package methodEmbedding.Magic_Trick.S.LYD1392;

import java.util.ArrayList;
import java.util.Set;
import java.util.Set.*;
import java.util.HashSet;
import java.io.*;
import java.util.Scanner;

/* Do some magic! */
public class Magician{
   public static void main(String[] args){
      if(args.length != 1){
         System.out.println("You forgot the filename or gave too many args.");
         return;
         
      } else {
         try{
            final String MAG_BAD = "Bad magician!";
            final String CHEAT = "Volunteer cheated!";
            
            Scanner in = new Scanner(new File(args[0]));
            
            int n_inputs = Integer.parseInt(in.nextLine());
            
            String[] outputs = new String[n_inputs];
            int row1, row2;
            for(int index = 0; index < n_inputs; index++){
               // Get row 1
               row1 = Integer.parseInt(in.nextLine());
               String[] row_in1 = null;
               for(int row = 1; row <= 4; row++){
                     if(row == row1){
                        row_in1 = in.nextLine().split(" ");
                     } else {
                        in.nextLine();
                     }
               }
               
               // Get row 2
               row2 = Integer.parseInt(in.nextLine());
               String[] row_in2 = null;
               for(int row = 1; row <= 4; row++){
                  if(row == row2){
                     row_in2 = in.nextLine().split(" ");
                     
                  } else {
                     in.nextLine();
                  }
               }
               
               // Find out which card(s) are the solution
               Set<Integer> row1_int = new HashSet<Integer>();
               Set<Integer> row2_int = new HashSet<Integer>();
               
               for(int col = 0; col < 4; col++){
                  row1_int.add(Integer.parseInt(row_in1[col]));
                  row2_int.add(Integer.parseInt(row_in2[col]));
               }
               
               row1_int.retainAll(row2_int);
               
               if(row1_int.size() == 0){
                  outputs[index] = CHEAT;
               } else if(row1_int.size() > 1){
                  outputs[index] = MAG_BAD;
               } else {
                  Integer[] unused = new Integer[0];
                  outputs[index] = Integer.toString((row1_int.toArray(unused))[0]);
               }
               
               System.out.println("Case #" + Integer.toString(index + 1)
                                + ": " + outputs[index]);
            }
            
            
         } catch(FileNotFoundException noFile){
            System.out.println("File not found :(.");
            return;
         }
      }
   }
}
