package methodEmbedding.Counting_Sheep.S.LYD444;

import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
      boolean [] nums = new boolean[10];
      int cont = 10;
      int n = in.nextInt();
      int N = n;
      int tem=n;
      boolean temp = true;
      int k = 1;
      
      if(n==0){
          System.out.println("Case #" + i + ": INSOMNIA");
          continue;
      }else{
          while(cont!=0){
              while(temp){
                  if(N ==0 || cont ==0){
                      temp = false;
                      continue;
                  }
                  tem = N%10;
                  if(!nums[tem]){
                      nums[tem]=true;
                      cont--;
                  }
                  N = N/10;
              }
              k++;
              temp =true;
              N = k*n;
          }
          System.out.println("Case #" + i + ": "+(k-1)*n);
      }
    }
  }
}
