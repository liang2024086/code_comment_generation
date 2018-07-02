package methodEmbedding.Magic_Trick.S.LYD1349;

import java.util.*;
public class Trick {

   public static void main(String[] args) {
      int numTrials = StdIn.readInt();
      for (int i = 0; i < numTrials; i++) {
         int row = StdIn.readInt();
         Set<Integer> possibles1 = new HashSet<Integer>();
         Set<Integer> possibles2 = new HashSet<Integer>();
         for (int j = 0; j < 16; j++) {
            if (j >= (row - 1) * 4 && j < (row) * 4)
               possibles1.add(StdIn.readInt());
            else 
               StdIn.readInt();
         }

         int secondRow = StdIn.readInt();
         for (int j = 0; j < 16; j++) {
            if (j >= (secondRow - 1) * 4 && j < (secondRow) * 4)
               possibles2.add(StdIn.readInt());
            else 
               StdIn.readInt();
         }
         possibles1.retainAll(possibles2);

         System.out.print("Case #" + (i + 1) + ": ");
         if (possibles1.size() > 1)
            System.out.println("Bad magician!");
         else if (possibles1.size() == 0)
            System.out.println("Volunteer cheated!");
         else {
            for (int k : possibles1) {
               System.out.println(k);
            }
         }
      }
   }
}
