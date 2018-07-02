package methodEmbedding.Revenge_of_the_Pancakes.S.LYD619;


import java.util.Scanner;

class B {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();
    String s = scanner.nextLine();
    for (int t = 1; t <= T; t++) {
      // TODO

      s = scanner.nextLine();
      int change = 0;
      char last = s.charAt(0);
      for (int i = 0; i < s.length(); i++) {
        char now = s.charAt(i);
        if (now != last) ++ change;
        last = now;
      }

      if (last == '-') ++ change;

      System.out.printf("Case #%d: %d\n", t, change);
    }
  }
}
