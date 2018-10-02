package methodEmbedding.Magic_Trick.S.LYD1;


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class MagicTrick {
    private static final String INFILE = "in/MagicTrick/A-small-attempt0.in";

    private static final String OUTFILE = "out/MagicTrick/A-small.out";

    public static void main(String[] args) throws Exception {
        String result = "";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTFILE))) {
            try (Scanner scanner = new Scanner(new FileInputStream(INFILE))) {

                int T = scanner.nextInt();
                scanner.nextLine();

                for (int C = 1; C <= T; ++C) {

                    int row1 = scanner.nextInt() - 1;
                    int[][] M1 = new int[4][4];

                    for (int r = 0; r < 4; ++r) {
                        for (int c = 0; c < 4; ++c) {
                            M1[r][c] = scanner.nextInt();
                        }
                    }

                    int row2 = scanner.nextInt() - 1;
                    int[][] M2 = new int[4][4];

                    for (int r = 0; r < 4; ++r) {
                        for (int c = 0; c < 4; ++c) {
                            M2[r][c] = scanner.nextInt();
                        }
                    }

                    int found = 0;
                    int t = 0;
                    for (int c1 = 0; c1 < 4; ++c1) {
                        for (int c2 = 0; c2 < 4; ++c2) {
                            if (M1[row1][c1] == M2[row2][c2]) {
                                found++;
                                t = M1[row1][c1];
                                break;
                            }
                        }
                    }

                    if (found == 1) {
                        result = "" + t;
                    } else if (found == 0) {
                        result = "Volunteer cheated!";
                    } else {
                        result = "Bad magician!";
                    }

                    // System.out.println("Case #" + C + ": " + result);
                    writer.write("Case #" + C + ": " + result);

                    if (C < T) {
                        writer.newLine();
                    }
                }
            }
        }
    }

}
