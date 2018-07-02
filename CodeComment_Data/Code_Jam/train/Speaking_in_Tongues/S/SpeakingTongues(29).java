package methodEmbedding.Speaking_in_Tongues.S.LYD1382;

import java.io.*;
import java.util.*;

public class SpeakingTongues {
  public static Map<Character, Character> map = new HashMap<Character, Character>();

  static {
    String [][] tests = {
        {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "our language is impossible to understand"},
        {"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "there are twenty six factorial possibilities"},
        {"de kr kd eoya kw aej tysr re ujdr lkgc jv qz", "so it is okay if you want to just give up zq"}
    };

    int len;
    for(int i = 0; i < 3; i++){
      len = tests[i][0].length();
      for(int j = 0; j < len; j++){
        map.put(tests[i][0].charAt(j), tests[i][1].charAt(j));
      }
    }
    map.put(' ', ' ');
/*    for(Character ch: map.keySet()){
      System.out.println(ch + "  =  " + map.get(ch));
    }*/
  }
  public static void main(String... args) throws IOException {
    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
    //PrintWriter writer = new PrintWriter(System.out);
    PrintWriter writer = new PrintWriter("A-small-attempt0.out");

    int len, cases = Integer.parseInt(reader.readLine());
    
    String line;
    for(int i = 1; i <= cases; i++){
      line = reader.readLine();
      len = line.length();
      writer.print("Case #" + i + ": ");
      for(int j = 0; j < len; j++){
        if(map.containsKey(line.charAt(j)))
          writer.print(map.get(line.charAt(j)));
        else
          writer.print(line.charAt(j));
      }
      writer.println();
    }
    writer.flush();
  }
}
