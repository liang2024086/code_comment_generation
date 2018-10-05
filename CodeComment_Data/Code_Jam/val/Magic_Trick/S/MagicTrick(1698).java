package methodEmbedding.Magic_Trick.S.LYD2060;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import jdk.internal.jfr.events.FileWriteEvent;

public class MagicTrick {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("problemA.in");
        File f2 = new File("ProblemASolve.out");
        Scanner sc = new Scanner(f);
        FileWriter fw = new FileWriter(f2);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int[] probnums1 = new int[8];
            int row1 = sc.nextInt();
            for (int j = 0; j < 16; j++) {
                int nextInt = sc.nextInt();
                if (j / 4 == row1 - 1) {
                    probnums1[j % 4] = nextInt;
                }
            }
            int row2 = sc.nextInt();

            for (int j = 0; j < 16; j++) {
                int nextInt = sc.nextInt();
                if (j / 4 == row2 - 1) {
                    probnums1[j % 4 + 4] = nextInt;
                }
            }

            Arrays.sort(probnums1);

            int res = -1;
            for (int j = 0; j < 7; j++) {
                if (probnums1[j] == probnums1[j + 1]) {
                    if (res != -1) {
                        fw.append("Case #" + (i + 1) + ": Bad magician!");
                        res = -2;
                        break;
                    } else {
                        res = probnums1[j];
                    }
                }
            }
            if (res != -2) {
                if (res != -1){
                    fw.append("Case #" + (i + 1) + ": " + res);
                } else {
                    fw.append("Case #" + (i + 1) + ": Volunteer cheated!");
                }
            }
            if(i < T - 1){
                fw.append("\n");
            }
        }
        fw.close();
    }
}
