package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1146;

import java.util.*;
import java.io.*;

public class FourGCI {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int amount = scan.nextInt();
    scan.nextLine();
    
    for (int i = 0; i < amount; i++) {
      
      String stack = scan.nextLine();
      
      // count the amount of groupings within the stack
      boolean plus = false;
      if (stack.charAt(0) == '+') {
        plus = true;
      }
      
      int total = 0;
      
      for (int x = 0; x < stack.length(); x++) {
        
        if (plus && stack.charAt(x) == '-') {
          total++;
          plus = false;
        } else if (!plus && stack.charAt(x) == '+') {
          total++;
          plus = true;
        } else {}
        
      }
      
      if (stack.charAt(stack.length()-1) == '+') {
        System.out.println("Case #" + (i+1) + ": " + total);
      } else {
        System.out.println("Case #" + (i+1) + ": " + (total+1));
      }
      
    }
  }
}
