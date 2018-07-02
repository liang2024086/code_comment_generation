package methodEmbedding.Speaking_in_Tongues.S.LYD61;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class A {
  static String f1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi"
      + "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"
      + "de kr kd eoya kw aej tysr re ujdr lkgc jv" + "zq";

  static String t1 = "our language is impossible to understand"
      + "there are twenty six factorial possibilities"
      + "so it is okay if you want to just give up" + "qz";

  public static void main(String[] args) throws FileNotFoundException {
    TreeMap<Character, Character> m = new TreeMap<Character, Character>();

    char[] fa = f1.toCharArray();
    char[] ta = t1.toCharArray();

    for (int i = 0; i < fa.length; i++) {
      m.put(fa[i], ta[i]);
    }

    // for (char c : m.keySet()) {
    // System.out.println(c + " -> " + m.get(c));
    // }
    // System.out.println(m.keySet().size());
    //
    // Object[] aa = m.values().toArray();
    // Arrays.sort(aa);
    // for (Object a : aa) {
    // System.out.println(a);
    // }
    char[] fff = new char[27];
    char[] ttt = new char[27];

    int i = 0;
    for (char c : m.keySet()) {
      fff[i] = c;
      ttt[i] = m.get(c);
      i++;
    }

    Scanner scanner = new Scanner(new File("A-small-attempt1.in"));
    int tc = scanner.nextInt();
    scanner.nextLine();
    int id = 1;
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      char[] cc = line.toCharArray();
      StringBuilder sb = new StringBuilder("Case #" + id + ": ");
      for (char c : cc) {
        sb.append(m.get(c));
      }
      System.out.println(sb.toString());
      id++;
    }

  }

}
