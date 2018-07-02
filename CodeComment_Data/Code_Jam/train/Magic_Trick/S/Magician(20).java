package methodEmbedding.Magic_Trick.S.LYD2091;

import java.io.*;
import java.util.*;

public class Magician {
  
  private static final String OUT_MESSAGE = "Case #";
  private static final String CHEATED = "Volunteer cheated!";
  private static final String BAD = "Bad magician!";
  
  // private static final String IN_FILE = "in.txt";
  // private static final String OUT_FILE = "out.txt";
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader rd = new BufferedReader(
                                           new InputStreamReader(System.in));
    
    int t = Integer.parseInt(rd.readLine());
    for (int i = 0; i < t; i++) {
      Set<Integer> set = new HashSet<Integer>();
      
      int row1 = Integer.parseInt(rd.readLine());
      // System.out.println("Row: " + row1);
      int[] firstCards = new int[4];
      
      for (int j = 0; j < 4; j++) {
        String cards = rd.readLine();
        // System.out.println(cards);
        if (j + 1 == row1) {
          String cardsStr[] = cards.split(" ");
          for (int k = 0; k < 4; k++) {
            firstCards[k] = Integer.parseInt(cardsStr[k]);
            set.add(firstCards[k]);
          }
          // System.out.println(Arrays.toString(firstCards));
          
        }
      }
      
      int row2 = Integer.parseInt(rd.readLine());
      // System.out.println("Row2: " + row2);
      int[] mixedCards = new int[4];
      
      for (int j = 0; j < 4; j++) {
        String cards = rd.readLine();
        // System.out.println(cards);
        if (j + 1 == row2) {
          String[] cardsStr = cards.split(" ");
          for (int k = 0; k < 4; k++) {
            mixedCards[k] = Integer.parseInt(cardsStr[k]);
          }
          // System.out.println(Arrays.toString(mixedCards));
        }
      }
      int count = 0;
      int thecard = -1;
      for (int card : mixedCards) {
        if (set.contains(card)) { 
          thecard = card;
          count++; 
        }
      }
      // System.out.println(count);
      String prefix = OUT_MESSAGE + (i+1) + ": ";
      if (count == 0) {
        System.out.println(prefix + CHEATED);
      } else if (count == 1) {
        System.out.println(prefix + thecard);
      } else {
        System.out.println(prefix + BAD);
      }
      
    }
                                          
    
  }
  
}
