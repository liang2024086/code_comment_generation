package methodEmbedding.Counting_Sheep.S.LYD1206;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by nvaidya on 4/8/16.
 */
public class CountingSheep {
  public static void main(String[] args)
      throws IOException {
    BufferedReader cin = new BufferedReader(new FileReader("/Users/nvaidya/Downloads/A-small-attempt1.in"));

    int T = Integer.parseInt(cin.readLine());
    int j=0;
    while(T > 0) {
      j++;
      int N = Integer.parseInt(cin.readLine());
      if (N == 0) {
        System.out.println(String.format("Case #%d: INSOMNIA", j));
      } else {
        Set<Integer> nums = new HashSet<>();
        int i=2;
        int newN = N;
        while (nums.size() < 10) {
          int copy = newN;
          while (copy > 0) {
            int digit = copy % 10;
            nums.add(digit);
            if (nums.size() == 10) {
              System.out.println(String.format("Case #%d: %d", j, newN));
              break;
            }
            copy = copy / 10;
          }
          newN = i*N;
          i++;
        }
      }
      T--;
    }
  }
}
