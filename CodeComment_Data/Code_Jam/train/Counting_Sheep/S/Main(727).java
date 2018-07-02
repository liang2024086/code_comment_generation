package methodEmbedding.Counting_Sheep.S.LYD1293;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; i++) {
      int start = in.nextInt();
      
      int num = start;
      String n;
      String answer = "";
      String temp = "";
      if (start == 0) {
        answer = "INSOMNIA";
      }
      while (answer == "") {
        n = "" + num;
        for (char c : n.toCharArray()) {
          if (temp.indexOf(c) < 0) {
            temp += c;
          }
        }
        
        if (temp.length() >= 10) {
          answer += num;
        }
        
        num += start;
      }
      System.out.println("Case #" + i + ": " + answer);
    }
  }
}
