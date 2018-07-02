package methodEmbedding.Standing_Ovation.S.LYD187;

import java.util.*;
import java.io.*;
public class audience{
   public static void main (String[] args) throws FileNotFoundException{
      Scanner sc = new Scanner(new File("A-small-attempt1.in"));
      //Scanner sc = new Scanner(new File("audience.txt"));
      int numCases = sc.nextInt();
      String blankSpace = sc.nextLine();
      PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
      System.setOut(out);
      for(int k = 1; k <= numCases; k++){
         String[] lst = sc.nextLine().split(" ");
         int maxNeeded = 0;
         int maxS = Integer.parseInt(lst[0]);
         int sumS = 0;
         for(int j = 0; j < maxS; j++){
            sumS += Integer.parseInt(lst[1].substring(j,j+1));
            if (j + 1 - sumS > maxNeeded)
               maxNeeded = j + 1 - sumS;
         }
         System.out.println("Case #" + k + ": " + maxNeeded);
      }
   }
}
