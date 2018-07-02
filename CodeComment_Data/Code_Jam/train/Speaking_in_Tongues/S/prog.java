package methodEmbedding.Speaking_in_Tongues.S.LYD1681;

import java.util.Scanner;
import java.io.*;

public class Temp {
  public static void main(String args[])throws IOException {
    Scanner in = new Scanner(new File("E:/A-small-attempt3 (1).in"));
    String alp = "abcdefghijklmnopqrstuvwxyz ";
    String t[] = { "y", "h", "e", "s", "o", "c", "v", "x", "d", "u", "i", "g", "l", "b", "k", "r", "z", "t", "n", "w", "j", "p", "f", "m", "a", "q", " " };
    int n = Integer.parseInt(in.nextLine());
    for (int i = 1; i <= n; i++) {
      String a = in.nextLine();
      String output = "";
      int l = a.length();
      System.out.print("Case #" + i + ": ");
      for (int j = 0; j < l; j++) {
        String sub = a.substring(j, j + 1);
        int temp = alp.indexOf(sub);
        if (temp > 25||temp < 0) output += sub;
        else output += t[temp];
      }
      System.out.println(output);
    }
    
  }
}

