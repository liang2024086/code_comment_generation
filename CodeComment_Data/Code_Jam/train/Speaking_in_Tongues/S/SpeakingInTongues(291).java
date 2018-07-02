package methodEmbedding.Speaking_in_Tongues.S.LYD750;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;

public class SpeakingInTongues {
  public static void main(String... args) {
    String out  = "abcdefghijklmnopqrstuvwxyz ";
    String in   = "ynficwlbkuomxsevzpdrjgthaq ";

    try {
      File f = new File("A-small-attempt0.in");
      File outFile = new File("output.txt");
      FileWriter w = new FileWriter(outFile);
      Scanner s = new Scanner(f);
      int len = s.nextInt();
      s.nextLine();
      for(int o = 0; o < len; ) {
        String line = s.nextLine();
        String newLine = "Case #" + ++o + ": ";
        for(int i = 0; i < line.length(); i ++) {
          char c = line.charAt(i);
          newLine += out.charAt(in.indexOf(c));
        }
        w.write(newLine);
        w.write('\n');
      }
      w.close();
    }
    catch(Exception e) { }
  }
}
