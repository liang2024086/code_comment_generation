package methodEmbedding.Revenge_of_the_Pancakes.S.LYD386;

import java.util.*;

public class RevengePancakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            char[] pancakes = in.next().toCharArray();
            int flips = 0;
            int length = pancakes.length;
            boolean curUp = (pancakes[0] == '+');
            if(length == 1) {
                if(curUp){
                    System.out.printf("Case #%d: %d%n", i, 0);
                }
                else {
                    System.out.printf("Case #%d: %d%n", i, 1);
                }
            }
            else {
                for (int j = 1; j < length; j++) {
                    if (curUp) {
                        if (pancakes[j] == '-') {
                            flips++;
                            curUp = !curUp;
                        }
                    } else {
                        if (pancakes[j] == '+') {
                            flips++;
                            curUp = !curUp;
                        }
                    }
                }
                if (pancakes[length - 1] == '-') {
                    flips++;
                }
                System.out.printf("Case #%d: %d%n", i, flips);
            }
        }
    }
}
