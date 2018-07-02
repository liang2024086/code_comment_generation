package methodEmbedding.Standing_Ovation.S.LYD1942;

import java.util.*;
import java.io.*;

public class A{
  public static void main (String[]args) throws IOException{
    Scanner in = new Scanner (new FileReader("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter ("A.out");
    int cases = in.nextInt();
    for (int casenum = 1;casenum <= cases;casenum++){
      int[] people = new int[in.nextInt() + 1];
      String string = in.next();
      for (int i = 0; i < people.length; i++){
        people[i] = Integer.parseInt(string.substring(i,i+1));
      }
      
      int standing = 0;
      int friends = 0;
      for (int i = 0; i < people.length; i++){
        if (standing < i){
          friends++;
          standing++;
          //System.out.println (standing);
        }
        standing += people[i];
      }
      
      out.println ("Case #" + casenum + ": " + friends);
    }
    out.close();
    in.close();
  }
}
