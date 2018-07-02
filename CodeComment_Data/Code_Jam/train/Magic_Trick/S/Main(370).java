package methodEmbedding.Magic_Trick.S.LYD209;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int answ1, answ2;
        int[] deck = new int[4];
        int[] deck2 = new int[4];
        String[] tt;
        int answ = 0;
        boolean status = false;
        boolean printStatus = false;
        for (int i = 0; i < n; i++) {
            answ1 = in.nextInt();
            in.nextLine();
            for(int j = 0; j < 4; j++) {
                tt = in.nextLine().split(" ");
                if (j+1 == answ1) {
                    for (int k = 0; k < 4; k++) {
                        deck[k] = Integer.parseInt(tt[k]);
                    }
                }
            }
            answ2 = in.nextInt();
            in.nextLine();
            for(int j = 0; j < 4; j++) {
                tt = in.nextLine().split(" ");
                if (j+1 == answ2) {
                    for (int k = 0; k < 4; k++) {
                        deck2[k] = Integer.parseInt(tt[k]);
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (deck[j] == deck2[k]) {
                        if (status && !printStatus) {
                            out.printf("Case #%d: Bad magician!\n", i);
                            printStatus = true;
                            break;
                        }
                        answ = deck[j];
                        status = true;
                    }
                }

                if (j == 3 && status && !printStatus) {
                    out.printf("Case #%d: %d\n", i, answ);
                } else if (j == 3 && !printStatus) {
                    out.printf("Case #%d: Volunteer cheated!\n", i);
                }
            }
            printStatus = false;
            status = false;
        }
        out.flush();
    }
}
