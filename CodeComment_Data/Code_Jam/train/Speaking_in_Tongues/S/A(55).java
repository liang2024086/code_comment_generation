package methodEmbedding.Speaking_in_Tongues.S.LYD1450;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader("./src/A-small-attempt1.in"));
    BufferedWriter out = new BufferedWriter(new FileWriter("./src/output.out"));

    char[] letter = new char[26];

    char[] s = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up".toCharArray();
    char[] c = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
    for (int i = 0; i < s.length; ++i) {
      if (c[i] != ' ') {
        letter[c[i] - 'a'] = s[i];
      }
    }
    letter['q' - 'a'] = 'z';
    letter['z' - 'a'] = 'q';
    String res = "", p = "";
    int T = Integer.parseInt(in.readLine());
    for (int zz = 0; zz < T; ++zz) {
      p = in.readLine().trim();
      res += "Case #" + (zz + 1) + ": ";
      for (char a : p.toCharArray()) {
        if (a == ' ')
          res += ' ';
        else
          res += letter[a - 'a'];
      }
      if (zz + 1 != T)
        res += "\n";
    }
    out.write(res);
    out.close();
    in.close();
  }
}
