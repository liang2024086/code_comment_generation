package methodEmbedding.Speaking_in_Tongues.S.LYD300;


import java.util.Scanner;

public class A {

  /**
   * @param args
   */
  public static void main(String[] args) {
    char[] c = new char[Character.MAX_VALUE];
    c[' '] = ' ';
    c['a'] = 'y';
    c['b'] = 'h';
    c['c'] = 'e';
    c['d'] = 's';
    c['e'] = 'o';
    c['f'] = 'c';
    c['g'] = 'v';
    c['h'] = 'x';
    c['i'] = 'd';
    c['j'] = 'u';
    c['k'] = 'i';
    c['l'] = 'g';
    c['m'] = 'l';
    c['n'] = 'b';
    c['o'] = 'k';
    c['p'] = 'r';
    c['q'] = 'z';
    c['r'] = 't';
    c['s'] = 'n';
    c['t'] = 'w';
    c['u'] = 'j';
    c['v'] = 'p';
    c['w'] = 'f';
    c['x'] = 'm';
    c['y'] = 'a';
    c['z'] = 'q';

    Scanner sc = new Scanner(System.in);
    int nbrCases = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= nbrCases; ++i) {
      System.out.print("Case #" + i + ": ");

      String input = sc.nextLine();
      for (int j = 0; j < input.length(); ++j) {
        System.out.print(c[input.charAt(j)]);
      }
      System.out.println();
    }
  }
}
