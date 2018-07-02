package methodEmbedding.Standing_Ovation.S.LYD1285;

import java.io.*;
import java.util.*;

public class Audience {
  
  public static void main (String[] args) throws IOException {
    
    Scanner input = new Scanner(new File("A-small-attempt0.in"));
    String s;
    int total,counter;
    int test=0;
    PrintStream output = new PrintStream(new File("A-small-attempt0.out"));
    input.next();
    
    while (input.hasNext()) {
      test++;
      total=0;
      counter=0;
      
      input.next();
      s=input.next();
      
      for (int i=0;i<s.length();i++) {
        while (total<i) {
          counter++;
          total++;
        }
        total+=Integer.parseInt(s.substring(i,i+1));
      }
    output.println("Case #"+Integer.toString(test)+
                       ": "+Integer.toString(counter));
    }
  }
  
  
}
