package methodEmbedding.Counting_Sheep.S.LYD837;

import java.util.*;
import java.io.*;
public class CountingSheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    //System.out.println(t);
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      //int m = in.nextInt();
      //System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
      
      if(n == 0){
          System.out.println("Case #" + i + ": " + "INSOMNIA");
          continue;
      }
      
      boolean flag = true;
      boolean[] result = new boolean[10];
      
      int counter = 1;
      int newN = n;
      
      while(flag){
          counter++;
          //System.out.println("Counter: " + counter);
          String number = String.valueOf(newN);
          char[] digits = number.toCharArray();
          
          for(int j = 0; j < digits.length; j++){
              result[Character.getNumericValue(digits[j])] = true;
          }
          
          boolean fulldigits = true;
          for(int m = 0; m < result.length; m++){
              if(result[m] == false){
                  fulldigits = false;
                  break;
              }
          }
          
          if(fulldigits == true){
              System.out.println("Case #" + i + ": " + newN);
              flag = false;
          }
          
          newN = n * counter; 
          //System.out.println("newN: " + newN);
      }
    }
  }
}


