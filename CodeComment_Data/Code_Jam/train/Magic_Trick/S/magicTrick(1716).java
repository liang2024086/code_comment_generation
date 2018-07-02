package methodEmbedding.Magic_Trick.S.LYD1857;

import java.util.*;

public class magicTrick {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String [] answers = new String[n];
    
    for (int i = 0; i < n; i++) {
      
      int row1 = s.nextInt();
      Set<Integer> card = new TreeSet<Integer>();
      
      for (int j = 1; j < 5; j++) {
        for (int k = 1; k < 5; k++) {
          int temp = s.nextInt();
          if (j == row1) card.add(temp);
        }
      }
      
      int row2 = s.nextInt();
      int tot = 0;
      int cardNum = 0;
      for (int j = 1; j < 5; j++) {
        for (int k = 1; k < 5; k++) {
          int temp = s.nextInt();
          if ((j == row2) && card.contains(temp)) {
            tot++;
            cardNum = temp;
          }
        }
      }
      
      if (tot == 1) answers[i] = "Case #"+(i+1)+": "+cardNum;
        else if (tot == 0) answers[i] = "Case #"+(i+1)+": Volunteer cheated!";
          else answers[i] = "Case #"+(i+1)+": Bad magician!";  
    
    }
      
    for (int i = 0; i < n; i++) 
    System.out.println(answers[i]);
  }
}
