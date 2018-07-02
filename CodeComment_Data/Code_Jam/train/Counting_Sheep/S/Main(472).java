package methodEmbedding.Counting_Sheep.S.LYD710;

import java.io.*;
import static java.lang.System.in;
import java.util.*;

public class Main {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(),a,x,c=1;
        for (int i = 0; i < n; i++) {
          x = in.nextLong();
          if(x==0){
              System.out.println("Case #"+(i+1)+": INSOMNIA");
          } else{
              boolean b[] = new boolean[10];
              for (int j = 0; j < 10; j++) {
                  b[j] = false;
              }
              int j =0;
              a=x;
              c = 1;
              while (true) {
                  if(j==9 && b[j]==true) break;
                    if(b[j] == true) j++; else{
                        for (int k = 0; k < 10; k++) {
                            if((x+"").indexOf(k+"")>=0){
                                b[k]=true;
                            }
                        }
                        c++;
                        x = a*c;
                    }
                    //System.out.println("b="+Arrays.toString(b));
                    //System.out.println((c-1)*a);
              }
              System.out.println("Case #"+(i+1)+": "+(c-1)*a);
        }
      }
  }
}
