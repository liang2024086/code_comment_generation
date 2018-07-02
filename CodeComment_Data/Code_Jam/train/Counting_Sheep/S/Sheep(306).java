package methodEmbedding.Counting_Sheep.S.LYD1085;

import java.util.*;

public class Sheep {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] arGs) {
    int N = sc.nextInt();
    int _case = 1;
    while(N-- > 0) {
      long n = sc.nextLong();
      if (n == 0) {
        System.out.printf("Case #%d: INSOMNIA\n", _case);
      } else {
        
        HashSet<Long> digits = new HashSet<>();
        for(long i = 0; i < 10; i++) digits.add(i);

        int i = 0;
        while(digits.size() > 0) {
          long n_cp = (i+1)*n;
          while(n_cp != 0) {
            long d = n_cp % 10;
            n_cp /= 10;
            if (digits.contains(d))
              digits.remove(d);
          }
          i++;
        }
        System.out.printf("Case #%d: %d\n", _case, (i)*n );
      }
      _case++;
    }
  }
}
