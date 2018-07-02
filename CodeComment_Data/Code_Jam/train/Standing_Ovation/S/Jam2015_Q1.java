package methodEmbedding.Standing_Ovation.S.LYD1570;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Jam2015_Q1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(args[0]));
        int T = scanner.nextInt();
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
        for (int i = 1; i <= T; i++) {
            int S = scanner.nextInt();
            String line = scanner.next();
            int my = 0;
            int all = 0;
            for (int j = 0; j <= S; j++) {
                int diff = all - j;
                if (diff < 0) {
                    my += -diff;
                    all += -diff;
                }
                all += line.charAt(j) - '0';
            }
            writer.write(String.format("Case #%d: %d\n", i, my));
        }
        writer.close();
        scanner.close();
    }
}
