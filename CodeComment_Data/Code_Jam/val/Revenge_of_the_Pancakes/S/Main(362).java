package methodEmbedding.Revenge_of_the_Pancakes.S.LYD782;


import java.util.BitSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int TC = 1; TC <= T; ++TC) {
            System.out.print("Case #" + TC + ": ");
            String pc = sc.nextLine();
            int S = pc.length();
            BitSet bs = new BitSet(S);
            for (int i = 0; i < S; ++i)
                if (pc.charAt(i) == '-') bs.set(i);

            int ops = 0;

            while (!bs.isEmpty()) {
                int lastSet = bs.previousSetBit(S - 1);
                bs.flip(0, lastSet+1);
                ops++;
            }

            System.out.println(ops);
        }
    }
}
