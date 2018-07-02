package methodEmbedding.Counting_Sheep.S.LYD1620;

import java.util.*;
import java.io.*;

public class a {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for(int i = 1; i <= t; ++i) {
      int num = in.nextInt();
      ArrayList<Integer> digits = new ArrayList<Integer>();
      digits.add(0);
      digits.add(1);
      digits.add(2);
      digits.add(3);
      digits.add(4);
      digits.add(5);
      digits.add(6);
      digits.add(7);
      digits.add(8);
      digits.add(9);
      int repeat = 1;
      int num2 = num;
      if(num==0) digits.clear();
      while(digits.size()>0){
        num2 = num*repeat;
        String str = String.valueOf(num2);
        for(int j=0;j<str.length();j++){
          int k = Integer.parseInt(str.substring(j,j+1));
//          System.out.println(k);
          if(digits.contains(k)) digits.remove((Object)k);
        }
        repeat++;
      }
      if(num==0) System.out.println("Case #" + i + ": INSOMNIA");
      else System.out.println("Case #" + i + ": " + num2);
    }
  }
}
