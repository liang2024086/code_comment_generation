package methodEmbedding.Magic_Trick.S.LYD212;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q_A {

    public static void main(String args[]) throws IOException {
        //String path = "/Users/xinzhong/Dropbox/projects/practice/code/data/A-small-attempt0.in";
        String path = "/Users/xinzhong/Downloads/A-small-attempt1.in";
        String pathOut = "/Users/xinzhong/Dropbox/projects/practice/code/data/A-small-attempt1.out";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)));
                BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut))) {
            int n = scanner.nextInt();

            for (int k = 0; k < n; k++) {
                int[] flag = new int[17];
                int first = scanner.nextInt();
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        int t = scanner.nextInt();
                        if (i + 1 == first) {
                            flag[t] = 1;
                        }
                    }
                }
                int second = scanner.nextInt();
                int cnt = 0;
                int match = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        int t = scanner.nextInt();
                        if (i + 1 == second && flag[t] == 1) {
                            cnt += 1;
                            match = t;
                        }
                    }
                }
                String s =  "Case #" + (k + 1) + ": ";
                if (cnt == 1) {
                    writer.write(s  + match + "\n");
                } else if (cnt ==0) {
                    writer.write(s + "Volunteer cheated!\n");
                } else {
                    writer.write(s + "Bad magician!\n");
                }

            }
        }
    }
}
