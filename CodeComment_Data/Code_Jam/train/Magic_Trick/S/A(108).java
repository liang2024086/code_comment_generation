package methodEmbedding.Magic_Trick.S.LYD1311;

import java.util.*;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int k = 1; k <= T; k++) {
      int first = in.nextInt();
      Map<Integer, Set<Integer>> firstMap = new HashMap<Integer, Set<Integer>>();
      for (int i = 1; i <= 4; i++) {
        Set<Integer> currRow = new HashSet<Integer>();
        firstMap.put(i, currRow);
        for (int j = 0; j < 4; j++) {
          firstMap.get(i).add(in.nextInt());
        }
      }
      int second = in.nextInt();
      Map<Integer, Set<Integer>> secondMap = new HashMap<Integer, Set<Integer>>();
      for (int i = 1; i <= 4; i++) {
        Set<Integer> currRow = new HashSet<Integer>();
        secondMap.put(i, currRow);
        for (int j = 0; j < 4; j++) {
          secondMap.get(i).add(in.nextInt());
        }
      }
      Set<Integer> intersection = new HashSet<Integer>(firstMap.get(first));
      intersection.retainAll(secondMap.get(second));
      if (intersection.size() == 1) {
        System.out.printf("Case #%d: %d\n", k, intersection.toArray()[0]);
      } else if (intersection.size() == 0) {
        System.out.printf("Case #%d: Volunteer cheated!\n", k);
      } else if (intersection.size() > 1) {
        System.out.printf("Case #%d: Bad magician!\n", k);
      }
    }
    in.close();
  }
}
