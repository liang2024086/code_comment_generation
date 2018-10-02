package methodEmbedding.Magic_Trick.S.LYD705;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *
 * @author Ali Akrami
 */
public class MagicTrick {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
        FileWriter fw = new FileWriter("A-small.out");

        int N, C, Y = 0, T = new Integer(in.readLine());
        String[] P;
        int[] A1 = new int[4], A2 = new int[4];

        for (int cases = 1; cases <= T; cases++) {
            C = new Integer(in.readLine());
            for (int i = 0; i < 4; i++) {
                if (i + 1 == C) {
                    P = in.readLine().split(" ");
                    for (int j = 0; j < 4; j++) {
                        A1[j] = new Integer(P[j]);
                    }
                } else {
                    in.readLine();
                }
            }
            C = new Integer(in.readLine());
            for (int i = 0; i < 4; i++) {
                if (i + 1 == C) {
                    P = in.readLine().split(" ");
                    for (int j = 0; j < 4; j++) {
                        A2[j] = new Integer(P[j]);
                    }
                } else {
                    in.readLine();
                }
            }
            N = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (A1[i] == A2[j]) {
                        Y = A1[i];
                        N++;
                    }
                }
            }

            switch (N) {
                case 0:
                    fw.write("Case #" + cases + ": Volunteer cheated!\n");
                    break;
                case 1:
                    fw.write("Case #" + cases + ": " + Y + "\n");
                    break;

                default:
                    fw.write("Case #" + cases + ": Bad magician!\n");
                    break;
            }

        }
        fw.flush();
        fw.close();
    }
}
