package methodEmbedding.Standing_Ovation.S.LYD2057;

import java.util.Scanner;

public class StandingOvation {

 private static final int min_test_cases = 1;
 private static final int max_test_cases = 100;

 private static final int max_shyness_small = 6;
 private static final int max_shyness_large = 1000;

 public static void main(String args[]) {

 Scanner scanner = new Scanner(System.in);
  try {

   int noOfTestCases = scanner.nextInt();
   if (noOfTestCases < min_test_cases
     || noOfTestCases > max_test_cases) {
    System.out.println("Limists " + min_test_cases + " <= T <= "
      + max_test_cases);
    System.exit(0);
   }

   int output[] = new int[noOfTestCases];

   for (int i = 0; i < noOfTestCases; i++) {

    int max_shylevel = scanner.nextInt();
    if (max_shylevel < 0 || max_shylevel > max_shyness_large) {
     System.out.println("Large data set 0 <= Smax <= "
       + max_shyness_large);
     System.exit(0);

    }
    String input = scanner.next();
    char[] input_new = input.toCharArray();
    int a[] = new int[input_new.length];

    int peopleRequired = 0;
    int peopleStanding = 0;

    for (int k = 0; k < a.length; k++) {
     a[k] = Character.getNumericValue(input_new[k]);

     if (a[k] == 0)
      continue;

     if ((peopleStanding) >= k) {
      peopleStanding += a[k];
     } else {
      peopleRequired += (k - peopleStanding);
      peopleStanding = peopleStanding + (k - peopleStanding)
        + a[k];
     }
    }
    output[i] = peopleRequired;
   }

   for (int i = 0; i < noOfTestCases; i++) {
    System.out.println("case #" + (i+1) + ": " + output[i]);
   }
  } finally {
   scanner.close();
  }
 }
}
