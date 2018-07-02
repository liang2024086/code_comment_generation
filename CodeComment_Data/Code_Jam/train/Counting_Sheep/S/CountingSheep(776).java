package methodEmbedding.Counting_Sheep.S.LYD531;

import java.util.*;

public class CountingSheep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int c = 1;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int cur = n;

            if(n == 0) {
                System.out.printf("Case #%d: INSOMNIA%n", c);
            }
            else {
                TreeSet<Character> seen = new TreeSet<>();
                while (seen.size() < 10) {
                    char[] chars = String.valueOf(cur).toCharArray();
                    for (char cha : chars) {
                        seen.add(cha);
                    }
                    cur+=n;
                }
                cur-=n;
                System.out.printf("Case #%d: %d%n", c, cur);
            }
            c++;
        }
    }
}
