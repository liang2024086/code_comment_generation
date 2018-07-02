package methodEmbedding.Counting_Sheep.S.LYD1262;


import java.util.*;
import java.io.*;
import java.lang.invoke.MethodHandles;
/**
 *
 * @author David
 */
public class QualA {
  public static void main(String[] args) {
    try {
      String input = "inputs/"+MethodHandles.lookup().lookupClass().getName();
      input = input.replace(".", "/");
      Scanner in = new Scanner(new File(input+".in"));
      FileWriter out = new FileWriter(new File(input+".out"));
      int t = in.nextInt();
      for(int i=1; i<=t; i++) {
        int count = 0;
        Set seen = new HashSet();
        int n = in.nextInt();
        String result = "INSOMNIA";
        for (int j=1; j<200; j++) {
          int num = j*n;
          String s = num+"";
          for (int k=0; k<s.length(); k++) {
            String c = s.substring(k, k+1);
            seen.add(c);
          }
          count++;
          //System.out.println(num + ": "+seen.size());
          if (seen.size()==10) {
            result = s;
            break;
          }
        }
        System.out.println("Case #"+i+": "+result+"  ("+count+")");
        out.write("Case #"+i+": "+result+"\n");
      }
      out.close();
      
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
}
