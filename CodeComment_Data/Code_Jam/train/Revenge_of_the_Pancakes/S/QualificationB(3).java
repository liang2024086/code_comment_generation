package methodEmbedding.Revenge_of_the_Pancakes.S.LYD766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

/**
 * Created by james on 09/04/2016.
 */
public class QualificationB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputs = Integer.parseInt(br.readLine());

        for(int inp = 1; inp <= inputs; inp++) {
            String pancakeString = br.readLine();

            char[] pancakes = pancakeString.toCharArray();
            BitSet bs = new BitSet(pancakes.length);
            for (int i = 0; i < pancakes.length; i++) {
                bs.set(i, pancakes[i] == '+');
            }

            int moves = 0;
            while(bs.cardinality() != pancakes.length) {
                int last = bs.previousClearBit(pancakes.length - 1);
                bs.flip(0, last + 1);
                moves++;
            }
            System.out.println("Case #" + inp + ": " + moves);
        }
    }
}
