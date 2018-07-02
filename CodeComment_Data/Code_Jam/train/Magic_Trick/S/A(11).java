package methodEmbedding.Magic_Trick.S.LYD1261;


import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter(new File("qua/a.txt"));
        Scanner scanner = new Scanner(new File("qua/A-small-attempt0.in"));
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            writer.write("Case #" + t + ": ");
            int[] cards = new int[16];
            for (int i = 0; i < 2; i++) {
                int n = (scanner.nextInt() - 1) * 4;
                for (int j = 0; j < 16; j++) {
                    int card = scanner.nextInt();
                    if (n <= j && j < n + 4) cards[card-1]++;
                }
            }
            Integer c = null;
            for (int j = 0; j < 16; j++) {
                if (cards[j] == 2) {
                    if (c == null) {
                        c = j;
                    } else {
                        c = -1;
                        break;
                    }
                }
            }
            if (c == null) {
                writer.write("Volunteer cheated!");
            } else if (c < 0) {
                writer.write("Bad magician!");
            } else {
                writer.write(String.valueOf(c + 1));
            }
            writer.write("\n");
        }

        writer.close();
        scanner.close();
    }
}
