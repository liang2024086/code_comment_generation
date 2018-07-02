package methodEmbedding.Magic_Trick.S.LYD420;


import java.io.*;
import java.util.*;

public class a {

  public static void main(String[] args) throws Exception{
    Scanner inf = new Scanner(new FileReader("in.txt"));
    int nn = inf.nextInt();
    for (int ii = 0; ii < nn; ii++) {
      int x = inf.nextInt() - 1;
      HashSet<Integer> candidate = new HashSet<Integer>();
      for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++) {
          int num = inf.nextInt();
          if (x == i) candidate.add(num);
        }
      int y = inf.nextInt() - 1;
      HashSet<Integer> ans = new HashSet<Integer>();
      for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++) {
          int num = inf.nextInt();
          if (y == i && candidate.contains(num)) ans.add(num);
        }
      System.out.print("Case #" + (ii+1) + ": ");
      if (ans.size() == 0)
        System.out.println("Volunteer cheated!");
      else if (ans.size() == 1)
        System.out.println(ans.toArray()[0]);
      else
        System.out.println("Bad magician!");
    }
  }

}
