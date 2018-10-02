package methodEmbedding.Counting_Sheep.S.LYD795;

import java.util.Scanner;

public class CodeJam {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();

    for (int i = 1; i <= testCases; i++) {
      int number = scan.nextInt();
      int[] seenNumbers = new int[10];
      boolean foundAll = false;
      int count = 1;
      int newNumber = 0;

      while (!foundAll && number != 0) {
        newNumber = number * count;
        String newNumberString = newNumber + "";
        for (int j = 0; j < newNumberString.length(); j++) {
           seenNumbers[newNumberString.charAt(j)-48] = 1;
        }
        foundAll = true;
        for (int j = 0; j < seenNumbers.length; j++) {
           if (seenNumbers[j] == 0) {
             foundAll = false;
           }
        }
        count++;

      }
      if (number == 0) {
          System.out.println("Case #"+i+": INSOMNIA");
      } else {
        System.out.println("Case #"+i+": "+newNumber);
      }
    }
  }
}
