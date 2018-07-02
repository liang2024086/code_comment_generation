package methodEmbedding.Cookie_Clicker_Alpha.S.LYD641;

import java.util.*;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 1; i <= T; i++) {
            HashSet<Integer> possible = new HashSet<Integer>();
            int row1 = in.nextInt();
            for (int j = 0; j < 16; j++) {
                int number = in.nextInt();
                if (j / 4 == row1 - 1)
                    possible.add(number);
            }
            HashSet<Integer> possible2 = new HashSet<Integer>();
            int row2 = in.nextInt();
            for (int j = 0; j < 16; j++) {
                int number = in.nextInt();
                if (j / 4 == row2 - 1)
                    possible2.add(number);
            }
            possible.retainAll(possible2);
            String answer = "";
            if (possible.size() > 1) {
                answer = "Bad magician!";
            } else if (possible.size() == 0) {
                answer = "Volunteer cheated!";
            } else {
                answer = possible.iterator().next().toString();
            }
            System.out.println("Case #" + i + ": " + answer);
        }
        in.close();
    }
}
