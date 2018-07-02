package methodEmbedding.Magic_Trick.S.LYD1838;

import java.util.*;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int test = 1; test <= t; ++test) {
      int[] answers = new int[2];
      int[][][] boards = new int[2][4][4];
      for (int i = 0; i < 2; ++i) {
        answers[i] = in.nextInt()-1;
        for (int row = 0; row < 4; ++row) {
          for (int col = 0; col < 4; ++col) {
            boards[i][row][col] = in.nextInt();
          }
        }
      }
      ArrayList<Integer> possibleAnswers = new ArrayList<Integer>();
      for (int col1 = 0; col1 < 4; ++col1) {
        for (int col2 = 0; col2 < 4; ++col2) {
          if (boards[0][answers[0]][col1] == boards[1][answers[1]][col2]) {
            possibleAnswers.add(boards[0][answers[0]][col1]);
          }
        }
      }
      System.out.printf("Case #%d: ", test);
      if (possibleAnswers.size() == 0) {
        System.out.printf("Volunteer cheated!\n");
      } else if (possibleAnswers.size() > 1) {
        System.out.printf("Bad magician!\n");
      } else {
        System.out.println(possibleAnswers.get(0));
      }
    }
  }
}
