package methodEmbedding.Revenge_of_the_Pancakes.S.LYD555;

import java.util.Scanner;

public class RevengeOfThePancakes {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=0; i<n; i++){
      in.nextLine();
      String s = in.next();
      int count = 0;
      boolean at = (s.charAt(0) == '+')? true : false;
      for(int j=0; j<s.length(); ++j){
        if((s.charAt(j) == '+') != at){
          at = !at;
          ++count;
        }
      }
      if(at == false) ++count;
      System.out.printf("Case #%d: %d\n", i+1, count);
    }
  }
}
