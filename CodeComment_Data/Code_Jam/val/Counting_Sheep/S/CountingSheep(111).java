package methodEmbedding.Counting_Sheep.S.LYD1662;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

  public static void main(String[] args) {

    Set<String> allNums = new HashSet<>();
    allNums.addAll(Arrays.asList("0 1 2 3 4 5 6 7 8 9".split(" ")));

    try (InputStreamReader isr = new InputStreamReader(new FileInputStream("inputs/ASmall.txt")); BufferedReader br = new BufferedReader(isr);) {
      int t = Integer.parseInt(br.readLine());

      for (int i = 0; i < t; i++) {
        boolean found = false;
        long num = Long.parseLong(br.readLine());
        Set<String> currNums = new HashSet<>();
        if (num == 0) {
          System.out.println("Case #" + (i + 1) + ": INSOMNIA");
          continue;
        }
        currNums.addAll(Arrays.asList((num + "").split(".")));
        for (long j = 1; j < Integer.MAX_VALUE; j++) {
          long curr = num * j;
          currNums.addAll(Arrays.asList((curr + "").split("")));
          if (currNums.containsAll(allNums)) {
            System.out.println("Case #" + (i + 1) + ": " + curr);
            found = true;
            break;
          }
        }
        if (!found) {
          System.out.println("Case #" + (i + 1) + ": INSOMNIA");
        }

      }
    } catch (Exception ex) {
    }

  }

}
