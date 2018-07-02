package methodEmbedding.Counting_Sheep.S.LYD1651;

import java.util.Scanner;

public class CountingSheep {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    for(int i=0; i<tests; i++){
      int n = in.nextInt();
      if(n==0){
        System.out.printf("Case #%d: INSOMNIA\n", i+1);
        continue;
      }

      boolean[] chars = new boolean[10];
      for(int j=0; j<chars.length; j++){
        chars[j] = false;
      }
      int count;
      int k = 1;
      while(true) {
        String N = "" + (k * n);
        for(int j=0; j<N.length(); j++){
          chars[(int)N.charAt(j) - 48] = true;
        }
        count = 0;
        for(int j=0; j<chars.length; j++){
          if(chars[j]) ++count;
        }
        if(count >= 10){
          System.out.printf("Case #%d: %d\n", i+1, n*k);
          break;
        }
        ++k;
      }
    }
  }
}
