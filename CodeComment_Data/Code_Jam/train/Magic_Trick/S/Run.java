package methodEmbedding.Magic_Trick.S.LYD689;

import java.util.*;
import java.io.*;

public class Run {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(new File("A-small-attempt0.in"));
      PrintStream out = new PrintStream(new File("file.out"));
      int cases = in.nextInt();
      int total = 0;

      
      for (int i= 1 ; i <= cases; i++) {
         out.print("Case #" + i + ": ");
         int[][] cards = new int[4][4];
         int row = in.nextInt();
         int counter1 = 0;
         int counter2 = 0;
         for (int j = 0; j < 16; j++) {   
            cards[counter1][counter2] = in.nextInt();
            counter2++;
            if (counter2 == 4) {
               counter1++;
               counter2 = 0;
            }
         }
         Set<Integer> chosen = new TreeSet<Integer>();
         for (int j = 0 ; j < 4; j++) {
            chosen.add(cards[row - 1][j]);
         }
         
         
         row = in.nextInt();
         counter1 = 0; 
         counter2 = 0;
         for (int j = 0; j < 16; j++) {   
            cards[counter1][counter2] = in.nextInt();
            counter2++;
            if (counter2 == 4) {
               counter1++;
               counter2 = 0;
            }
         }
         int amountFound = 0;
         int found = 0;
         
         for (int j = 0; j < 4; j++) {
            if (chosen.contains(cards[row - 1][j])) {
               amountFound++;
               found = cards[row - 1][j];
            }
               
         }
         if (amountFound > 1) {
            out.println("Bad magician!");
         } else if (amountFound ==0) {
            out.println("Volunteer cheated!");
         } else {
            out.println(found);
         }
      }
      
   }
}
