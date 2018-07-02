package methodEmbedding.Counting_Sheep.S.LYD853;

import java.util.*;
import java.io.*;
public class main {
  public static void main(String ... orange) throws Exception{
    Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = s.nextInt(); 
    for (int i = 0; i < t; i++) {
      //System.out.println(t);
      //System.out.println(i);
      int n = s.nextInt();
      if (n == 0) {
        System.out.println("Case #"+(i+1)+": INSOMNIA"); continue; 
      }
      boolean flag = false;
      int a[] = new int[10];
      for (int k = 0; k < a.length; k++) {
        a[k] = 0;
      }
        int currnum = 1;
      int z = 0;
      while (flag == false) {
        //System.out.println(n*currnum);
        int temp = n * currnum;
        while ( temp > 0) {
          int abc = temp % 10;
          a[abc] = 1;
          temp/=10;
        }
        int j;
        for (j = 0; j < a.length; j++) {
          if (a[j] != 1) break;
        }
        if (j == a.length) {
          System.out.println("Case #"+(i+1)+": " + n*currnum);
          break;
        }
        currnum++;
      }
    }
  }
}
