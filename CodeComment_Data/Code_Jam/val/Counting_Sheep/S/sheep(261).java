package methodEmbedding.Counting_Sheep.S.LYD1368;

import java.util.*;
import java.io.*;

class sheep {
  public static void main(String ... orange) throws Exception{
    Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = s.nextInt(); 
    for (int i = 0; i < t; i++) {
      int flag = 0;
      int n = s.nextInt();
      
      if (n == 0) {
        System.out.println("Case #"+(i+1)+": INSOMNIA"); 
        continue; 
      }    
      int a[] = new int[10];
      for (int k = 0; k < a.length; k++) {
        a[k] = 0;
      }
        int num = 1;
      int z = 0;
      while (flag == 0) {
        
        int temp = n * num;
        while ( temp > 0) {
          int temp2 = temp % 10;
          a[temp2] = 1;
          temp= temp/10;
        }
        int j;
        for (j = 0; j < a.length; j++) {
          if (a[j] != 1) break;
        }
        if (j == a.length) {
          System.out.println("Case #"+(i+1)+": " + n*num);
          break;
        }
        num++;
      }
    }
  }
}
