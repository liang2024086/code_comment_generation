package methodEmbedding.Counting_Sheep.S.LYD1073;

import java.util.*;
import java.io.*;

public class Sheep {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(new File("A-small-attempt0.in"));
    
    PrintWriter pw = new PrintWriter(new File("A.out"));
    
    int t = scan.nextInt();
    boolean[] seen = new boolean[10];
    boolean seenAll = false;
    for(int i=0; i<t; i++) {
      int n = scan.nextInt();
      int k = n;
      
      for(int j=0; j<10; j++) seen[j] = false;
      seenAll = false;
      
      // insomnia case
      if (n==0) {
        pw.println("Case #" + (i+1) + ": INSOMNIA");
      } 
      // normal case
      else {
        while(!seenAll) {
          // update the digits that has been seen and value of k
          int a = k;
          while (a>0) {
            int digit = a%10;
            seen[digit] = true;
            a = a/10;
          }
          
           //update seenAll
          for(int j=0; j<10; j++) {
            if (!seen[j]) break;
            if (j==9 && seen[j]) seenAll = true;
          }
          
          // only update k if not seen all
          if (!seenAll) k += n;
        }
        
        pw.println("Case #" + (i+1) + ": " + k);
      }
      
    }
    

    pw.close();  
    
  }
}
