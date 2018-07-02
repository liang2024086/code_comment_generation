package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1014;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static final File INPUT = new File("input.txt");
    public static final File OUTPUT = new File("output.txt");

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(INPUT);
            BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT));

            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                bw.write("Case #" + (i + 1) + ": ");
                bw.write(ProblemB.solve(sc));
                bw.write("\n");
            }

            sc.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
