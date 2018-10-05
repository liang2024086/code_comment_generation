package methodEmbedding.Speaking_in_Tongues.S.LYD628;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;


public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader("a.test.in"));
    BufferedReader br2 = new BufferedReader(new FileReader("a.map.in"));
    
    String line,line2;
    line = br.readLine();
    
    Map<String, String> map = Maps.newHashMap();
    
    while((line = br.readLine()) != null){
      line2 = br2.readLine();

      char[] c1 = line.toCharArray();
      char[] c2 = line2.toCharArray();

      System.out.println(line);
      System.out.println(line2);
      System.out.println();
      
      for (int i = 0; i < c2.length; i++) {
        map.put(c1[i]+"", c2[i]+"");
      }
      
    }
    map.put("q", "z");
    map.put("e", "o");
    map.put("y", "a");
    
    map.put("z", "q");
    
    System.out.println(map);
    
    List<String> keys = Lists.newArrayList(map.values());
    Collections.sort(keys);
    System.out.println(keys);
    
    br = new BufferedReader(new FileReader("A-small-attempt0.in"));
    
    FileWriter fw = new FileWriter("a.out");
    line = br.readLine();
    int cnum = 1;
    while((line = br.readLine()) != null){
      fw.write("Case #" + cnum + ": ");
      char[] c1 = line.toCharArray();
      for (int i = 0; i < c1.length; i++) {
        fw.write(map.get(c1[i]+""));
      }
      fw.write("\n");
      cnum++;
    }
    fw.close();
    
  }
  
}
