package methodEmbedding.Magic_Trick.S.LYD1332;

import java.util.*;

class A {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int T = input.nextInt();
    for (int t = 1; t <= T; t++) {
      System.out.print("Case #" + t + ": ");
      TreeSet<Integer> A = new TreeSet<Integer>();
      TreeSet<Integer> B = new TreeSet<Integer>();
      for (int x = 0; x < 2; x ++) {
        int R = input.nextInt();
        for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
            if (i == R - 1) {
              if (x == 0) {
                A.add(input.nextInt());
              } else {
                B.add(input.nextInt());
              }
            } else {
              input.nextInt();
            }
          }
        }
      }
      A.retainAll(B);
      if (A.isEmpty()) {
        System.out.println("Volunteer cheated!");
      } else if (A.size() > 1) {
        System.out.println("Bad magician!");
      } else {
        System.out.println(A.first());
      }
    }
  }
}
