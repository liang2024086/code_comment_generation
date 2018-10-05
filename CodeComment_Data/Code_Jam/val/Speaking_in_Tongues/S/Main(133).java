package methodEmbedding.Speaking_in_Tongues.S.LYD114;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.io.Files;

public class Main {
  
  static String[] ins = new String[] {
      "yeqz",
      "ejp mysljylc kd kxveddknmc re jsicpdrysi",
      "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
      "de kr kd eoya kw aej tysr re ujdr lkgc jv"
  };

  static String[] outs = new String[] {
      "aozq",
      "our language is impossible to understand",
      "there are twenty six factorial possibilities",
      "so it is okay if you want to just give up"
  };
  
  public static void main(String[] args) throws IOException {

    File f = new File("A-small-attempt1.in");
//    File f = new File("A-large-practice.in");
//    File f = new File("example.in");
//    File f = new File("test.in");
    List<String> lines = Files.readLines(f, Charsets.UTF_8);

    Map<Character, Character> translationTable = new HashMap<Character, Character>();
    
    for (int i = 0; i < ins.length; i++) {
      String in = ins[i];
      String out = outs[i];
      for (int j = 0; j < in.length(); j++) {
        translationTable.put(in.charAt(j), out.charAt(j));
      }
    }
    
//    for (int i = 0; i < 26; i++) {
//      if (!translationTable.containsKey((char) ('a' + i))) {
//        System.out.println((char) ('a' + i));
//      }
//    }
//    
//    if (true) return;
    
    int cases = Integer.valueOf(lines.get(0));
    int c = 0;
    int line = 1;
    while (c < cases) {
      c++;
      System.out.print("Case #" + c + ": ");
      
      String in = lines.get(line++);
      for (int j = 0; j < in.length(); j++) {
        System.out.print(translationTable.get(in.charAt(j)));
      }
      System.out.println();
    }
  }

}
