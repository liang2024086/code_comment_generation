package methodEmbedding.Magic_Trick.S.LYD781;

import java.io.*;
import java.util.*;
import java.math.*;

public class MagicTrick {
 
  
  
  public static void main (String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter (new FileWriter("A-out.txt"));
    int test = Integer.parseInt(in.readLine().trim());
    for (int t =0 ; t < test; t++) {
      
      String ans = "";
      
      int first = Integer.parseInt(in.readLine().trim())-1;
      
      ArrayList<Integer> arr1 = new ArrayList<Integer>();
      for (int x =0; x< 4; x++) {
        String line = in.readLine().trim();
        StringTokenizer st = new StringTokenizer (line);
        if (x == first) {
          for (int y =0; y < 4; y++)
            arr1.add(Integer.parseInt(st.nextToken())); 
        }
      }
      int second = Integer.parseInt(in.readLine().trim())-1;
      
      ArrayList<Integer> arr2 = new ArrayList<Integer>();
      for (int x =0; x< 4; x++) {
        String line = in.readLine().trim();
        StringTokenizer st = new StringTokenizer (line);
        if (x == second) {
          for (int y =0; y < 4; y++)
            arr2.add(Integer.parseInt(st.nextToken())); 
        }
      }
      
      int answer = -1;
      int count = 0;
      for (int x =0; x< 4; x++)
      {
        for (int y =0; y < 4; y++)
        {
          if (arr1.get(x) == arr2.get(y))
          {
            count++;
            answer = arr1.get(x);
          }
        }
      }
      
      if (count == 0) ans = "Volunteer cheated!";
      if (count == 1) ans = answer+"";
      if (count > 1) ans = "Bad magician!";
      out.println("Case #" + (t+1) + ": " + ans);
    }
    in.close();
    out.close();
  }
}
