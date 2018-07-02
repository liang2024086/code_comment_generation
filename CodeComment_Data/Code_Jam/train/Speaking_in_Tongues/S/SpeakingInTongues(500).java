package methodEmbedding.Speaking_in_Tongues.S.LYD22;

/**
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author yincrash
 *
 */
public class SpeakingInTongues
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    ArrayList<String> entries = new ArrayList<String>(3);
    ArrayList<String> entriesTranslation = new ArrayList<String>(3);
    entries.add("ejp mysljylc kd kxveddknmc re jsicpdrysi");
    entries.add("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd");
    entries.add("de kr kd eoya kw aej tysr re ujdr lkgc jv");
    
    entriesTranslation.add("our language is impossible to understand");
    entriesTranslation.add("there are twenty six factorial possibilities");
    entriesTranslation.add("so it is okay if you want to just give up");
    
    HashMap<Character, Character> mapping = new HashMap<Character, Character>();
    
    for (int i = 0; i < entries.size(); i++) {
      String entry = entries.get(i);
      
      for (int j = 0; j < entry.length(); j++) {
        mapping.put(entry.charAt(j), entriesTranslation.get(i).charAt(j));
      }
    }
    mapping.put('y', 'a');
    mapping.put('e', 'o');
    mapping.put('q', 'z');
    mapping.put('z', 'q');
    
    /*
    // determine what mapping is missing
    System.out.println(mapping.size());
    ArrayList<Entry<Character, Character>> keySorted = new ArrayList<Entry<Character, Character>>(mapping.entrySet());
    Collections.sort(keySorted, new Comparator<Entry<Character, Character>>() {
      @Override
      public int compare(Entry<Character, Character> o1,
          Entry<Character, Character> o2)
      {
        return o1.getKey().compareTo(o2.getKey());
      }
    });
    
    System.out.println(keySorted);
    
    Collections.sort(keySorted, new Comparator<Entry<Character, Character>>() {
      @Override
      public int compare(Entry<Character, Character> o1,
          Entry<Character, Character> o2)
      {
        return o1.getValue().compareTo(o2.getValue());
      }
    });
    
    System.out.println(keySorted);
    */
    
    try
    {
      Scanner file = new Scanner(new File(args[0]));
      int testCases = file.nextInt();
      file.nextLine();
      int currentCase = 1;
      final PrintStream ps = new PrintStream(new File("tongues.out"));
      while (currentCase <= testCases) {
        final String line = file.nextLine();
        ps.append("Case #").print(currentCase);
        ps.append(": ");
        for (int i =0; i < line.length(); i++) {
          ps.append(mapping.get(line.charAt(i)));
        }
        ps.println();
        currentCase++;
      }
    } catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
  }

}
