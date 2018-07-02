package methodEmbedding.Speaking_in_Tongues.S.LYD395;

import java.util.*;

public class A {
   private static char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      scan.nextLine();

      for (int i = 1; i <= N; i++) {
         System.out.printf("Case #%d: ", i);
         for (char c : scan.nextLine().toCharArray())
            System.out.print(c >= 'a' && c <= 'z' ? map[c-'a']: c);
         System.out.println();
      }
   }
}
