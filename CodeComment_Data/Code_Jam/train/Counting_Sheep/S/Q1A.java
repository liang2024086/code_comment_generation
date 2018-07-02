package methodEmbedding.Counting_Sheep.S.LYD532;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1A {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {

            int N = in.nextInt();
            if(N == 0) {
                System.out.format("Case #%d: %s\n", t, "INSOMNIA");
                continue;
            }
            Set<Integer> figs = new HashSet<>();

            int x = N;
            while(x < Integer.MAX_VALUE - N) {
                int d = x;
                while(d > 0) {
                    figs.add(d % 10);
                    d /= 10;
                }
                if(figs.size() >= 10) {
                    System.out.format("Case #%d: %d\n", t, x);
                    break;
                }
                x += N;
            }
            if(figs.size() < 10) {
                System.out.format("Case #%d: %s\n", t, "INSOMNIA");
            }
        }
    }

}
