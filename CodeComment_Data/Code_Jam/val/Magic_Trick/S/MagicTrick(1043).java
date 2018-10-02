package methodEmbedding.Magic_Trick.S.LYD1782;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String... args) throws IOException {
        Scanner in = new Scanner(new File("A-small-attempt0.in.txt"));

        PrintWriter out = new PrintWriter("MagicTrick.out");

        int loopvarloop = in.nextInt();
        for (int loopvar = 0; loopvar < loopvarloop; loopvar++) {
            int row = in.nextInt() - 1;
            HashSet<Integer> kept = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == row)
                        kept.add(in.nextInt());
                    else {
                        in.nextInt();
                    }
                }
            }
            row = in.nextInt() - 1 ;
            HashSet<Integer> kept2 = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == row)
                        kept2.add(in.nextInt());
                    else {
                        in.nextInt();
                    }
                }
            }
            kept2.retainAll(kept);
            out.print("Case #" + (loopvar + 1) + ": ");
            if (kept2.size() == 0) {
                out.println("Volunteer cheated!");
            }
            else if (kept2.size() > 1) {
                out.println("Bad magician!");
            } else {
                out.println(kept2.iterator().next());
            }

        }
        out.close();
        in.close();
    }
}
