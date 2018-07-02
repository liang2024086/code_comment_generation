package methodEmbedding.Counting_Sheep.S.LYD434;

import java.util.*;
import java.io.*;

class Solution {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();

    for (int cs=1;cs<=t;cs++){
      long n = in.nextInt();

      if (n == 0){
        System.out.println("Case #" + cs + ": INSOMNIA");
        continue;
      }

      boolean a[] = new boolean[10];
      long result = -1;

      for (int k=1;k<1000000;k++){
        long r = n * k;
        while (0<r){
          a[(int)(r%10)] = true;
          r/=10;
        }

        boolean notFilled = false;
        for (int i=0;i<10;i++){
          if (!a[i]) notFilled = true;
        }

        if (!notFilled){
          result = n * k;
          break;
        }
      } // check

      if (0 < result){
        System.out.println("Case #" + cs + ": " + result);
      } else {
        System.out.println("Case #" + cs + ": INSOMNIA");
      }
    }
  }
}
