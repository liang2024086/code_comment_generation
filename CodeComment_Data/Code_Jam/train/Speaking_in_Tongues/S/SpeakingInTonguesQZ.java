package methodEmbedding.Speaking_in_Tongues.S.LYD901;


import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class SpeakingInTonguesQZ {
  public static void main(String[] args) throws Exception {
    if (args.length == 3) {
      // prepering the variables for storing the translation rules
      // TODO: the searching time is O(lg(n)) -> constans'd be better
      Map<Character, Character> translationRules = new TreeMap<Character, Character>();  
      
      // reading the dictionary
      BufferedReader langX = new BufferedReader(new FileReader(args[0]));
      BufferedReader langG = new BufferedReader(new FileReader(args[1]));
      String line = null;
      int n = ((line = langX.readLine()) != null) ? Integer.parseInt(line) : 0;
      if (n == 0) {
        System.err.println("The dictionary seems empty!");
        System.exit(-1);
      }
      // processing the dictionary
      for (int i = 0; i < n; i ++) {
        String origLine = langX.readLine();
        line = langG.readLine().replaceAll("Case #[0-9]+: ", "");
        for (int j = 0; j < origLine.length() && j < line.length(); j++) {
          if (origLine.charAt(j) != ' ' && line.charAt(j) != ' ') {
            Character chObj = translationRules.get(origLine.charAt(j));
            char ch = (chObj == null) ? ' ' : chObj.charValue();
            if (chObj != null && ch != line.charAt(j)) {
              System.err.println("On key: " + origLine.charAt(j) + ", there is a mismatch, orig: " + ch + ", new: " + line.charAt(j));
            }
            translationRules.put(origLine.charAt(j), line.charAt(j));
          }
        }
      }
      langG.close();
      langX.close();
      
      translationRules.put('z', 'q'); // from the hint
      translationRules.put('q', 'z'); // test
      // show translation rules
      
      //out.println("Translation rules: " + translationRules);
      /*Set<Character> vals = new TreeSet<Character>();
      vals.addAll(translationRules.values());
      out.println(vals);
      */
      
      // opening the input
      BufferedReader in = new BufferedReader(new FileReader(args[2]));
      
      // reading the number of test cases
      n = ((line = in.readLine()) != null) ? Integer.parseInt(line) : 0;
      for (int t = 0; t < n; t ++) {
        line = in.readLine();
        out.print("Case #" + (t+1) + ": ");
        for (int j = 0; j < line.length(); j++) {
          if (line.charAt(j) != ' ') {
            Character chObj = translationRules.get(line.charAt(j));
            if (chObj == null) {
              System.err.println("Non-translatable character " + line.charAt(j) + "! Stop processing!");
              System.exit(-2);
            } else {
              out.print(chObj);
            }
          } else {
            out.print(' ');
          }
        }
        out.println();
      }
      
      // closing the input
      in.close();
    } else {
      // show the usage
      System.err.println("Using: java googleCodeJam.SpeakingInTongues input");
    }

  }

}
