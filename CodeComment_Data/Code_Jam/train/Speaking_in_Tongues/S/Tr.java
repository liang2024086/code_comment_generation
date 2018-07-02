package methodEmbedding.Speaking_in_Tongues.S.LYD743;

import java.util.Arrays;

public class Tr {
  public static void main(String[] args) {
    char Tr[] = new char[26];

    String str1[] = { "ejp mysljylc kd kxveddknmc re jsicpdrysi",
        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
        "de kr kd eoya kw aej tysr re ujdr lkgc jv" };
    String str2[] = { "our language is impossible to understand",
        "there are twenty six factorial possibilities",
        "so it is okay if you want to just give up" };

    Arrays.fill(Tr, '0');

    for (int i = 0; i < str1.length; i++)
      for (int j = 0; j < str1[i].length(); j++) {
        if (str2[i].charAt(j) != ' ')
          Tr[str1[i].charAt(j) - 'a'] = str2[i].charAt(j);
      }

    System.out.println(Arrays.toString(Tr));
    // Index 16 and 25 are undefined.
    // We know z becomes q as of problem statement.
    Tr['q' - 'a'] = 'z';

    System.out.println(Arrays.toString(Tr));

    // Only one left, lets find out which letter is missing.
    char Tr1[] = Arrays.copyOf(Tr, Tr.length);
    Arrays.sort(Tr1);
    System.out.println(Arrays.toString(Tr1));

    // q is missing.
    Tr[25] = 'q';

    System.out.println(Arrays.toString(Tr));

    // Print for other class in java format.
    System.out.print("{'" + Tr[0] + "'");
    for (int i = 1; i < Tr.length; i++)
      System.out.print(",'" + Tr[i] + "'");
    System.out.println("}");
  }

}
