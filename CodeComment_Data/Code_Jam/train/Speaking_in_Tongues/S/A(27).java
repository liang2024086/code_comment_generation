package methodEmbedding.Speaking_in_Tongues.S.LYD651;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String[] s = new String[3];
    String[] t = new String[3];
    s[0] = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
    s[1] = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
    s[2] = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
    
    t[0] = "our language is impossible to understand";
    t[1] = "there are twenty six factorial possibilities";
    t[2] = "so it is okay if you want to just give up";
    
    
    Map<String,String> m = new HashMap<String,String>();
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length(); j++) {
        String c1 = "" + s[i].charAt(j);
        String c2 = "" + t[i].charAt(j);
        String z = m.get(c1);
        if (z != null && !z.equals(c2)) {
          throw new RuntimeException("err");
        }
        m.put(c1,  c2);
      }
    }
//    System.out.println(m.size());
//    for (int i = 0; i < 26; i++) {
//      String c1 = "" + (char) ('a' +i);
//      if (!m.containsKey(c1)) {
//        System.out.println("in " + c1);
//      }
//      if (!m.containsValue(c1)) {
//        System.out.println("out " + c1);
//      }
//    }
    m.put("q", "z");
    m.put("z", "q");
    String ss = reader.readLine();
    int n = Integer.parseInt(ss);
    
    for (int i = 0; i < n; i++) {
      Map<String, Integer> map = new HashMap<String, Integer>();
      ss = reader.readLine();
      String sss = "Case #" + (i + 1) + ": " ;
      for (int j = 0; j < ss.length(); j++) {
        sss += m.get("" + ss.charAt(j));
      }
      
      System.out.println(sss);
      
      
    }
  }
}
