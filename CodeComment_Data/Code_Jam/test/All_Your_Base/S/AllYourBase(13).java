package method_new_test.All_Your_Base.S.LYD116;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class AllYourBase {
  
  public static void main(String[] args) {
    
    try {
      
      File f = new File("src/codejam/r1c2009/A-small1.in");
      Scanner scanner = new Scanner(f);
      
      FileWriter fstream = new FileWriter("src/codejam/r1c2009/a-small.out");
      BufferedWriter out = new BufferedWriter(fstream);
      
      int testCases = scanner.nextInt();
      scanner.nextLine();
      
      for (int t = 0; t < testCases; ++t) {
        
        Map<Character, Long> map = new HashMap<Character, Long>();
        
        String s = scanner.nextLine();
        
        String dif = new String();
        
        for (int i = 0; i < s.length(); ++i) {
          
          if (!dif.contains("" + s.charAt(i))) {
             dif += s.charAt(i);
          }
     
        }
        
        int base = dif.length();
        if (base == 1) {
          base = 2;
        }
        map.put(dif.charAt(0), 1L);
        if (dif.length() > 1) {
          map.put(dif.charAt(1), 0L);
        }
        
        for (int i = 2; i < dif.length(); ++i) {
          map.put(dif.charAt(i), (long) i);
          
        }
        long seconds = 0;
        
        for (int i = 0; i < s.length(); ++i) {
          seconds += (long) Math.pow(base, s.length() - 1 - i) * map.get(s.charAt(i));
        }
        
        String output = "Case #" + (t + 1) + ": " + seconds + "\n";
        System.out.print(output);
        
        out.write(output);
        
        
      }
      
      
      


      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
