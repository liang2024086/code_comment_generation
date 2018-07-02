package methodEmbedding.Counting_Sheep.S.LYD704;

import java.util.*;

public class Sheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    for (int i=0; i<tests; i++){
      int originN = in.nextInt();
      int n = originN;
      ArrayList digits = new ArrayList();
      ArrayList answers = new ArrayList();
      int count = 1;
      boolean insomnia = true;
      while (digits.size() < 10) {
        if (answers.contains(n)) {
           System.out.println("Case #" + (i+1) + ": INSOMNIA");
           insomnia = false;
           break;
        } else {
          answers.add(n);
          int number = n;
          while (number > 0) {
            if (digits.contains(number%10)) {}
            else {
            digits.add(number % 10);
            }
            number = number / 10;
            }
            count = count + 1;
            n = originN * (count);
        }
      }
      if (insomnia) {
      System.out.println("Case #" + (i+1) + ": " + (originN * (count-1)));
    }
    }
  }
}
