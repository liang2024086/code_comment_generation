package methodEmbedding.Magic_Trick.S.LYD403;


import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nikaustr
 */
public class A_Magic_Trick {

    private static boolean SMALL = true;
    private static String PROBLEM = "A";

    public static void main(final String[] args) {
        try {
            try (Scanner scan = new Scanner(new File(String.format("%s-%s.in", PROBLEM, (SMALL ? "small" : "large")))); PrintWriter pw = new PrintWriter(new File(String.format("%s-%s.out", PROBLEM, (SMALL ? "small" : "large"))))) {

                int NUM_CASES = scan.nextInt();
                scan.nextLine();
                System.out.println(String.format("%d test cases:", NUM_CASES));
                long start = System.currentTimeMillis(), t1, left;
                for (int CASE = 1; CASE <= NUM_CASES; ++CASE) {
                    t1 = System.currentTimeMillis();
                    System.out.print(String.format("%d.[%s] ", CASE, new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(t1))));
                    final int row1 = scan.nextInt();
                    final int[][] board1 = new int[4][4];
                    for (int i = 0; i < 4; ++i) {
                        for (int j = 0; j < 4; ++j) {
                            board1[i][j] = scan.nextInt();
                        }
                    }
                    final List<Integer> valid = new ArrayList<>();
                    for (int i = 0; i < 4; ++i) {
                        valid.add(board1[row1 - 1][i]);
                    }
                    final int row2 = scan.nextInt();
                    final int[][] board2 = new int[4][4];
                    for (int i = 0; i < 4; ++i) {
                        for (int j = 0; j < 4; ++j) {
                            board2[i][j] = scan.nextInt();
                        }
                    }
                    final List<Integer> found = new ArrayList<>();
                    for (int i = 0; i < 4; ++i) {
                        if (valid.contains(board2[row2 - 1][i])) {
                            found.add(board2[row2 - 1][i]);
                        }
                    }
                    final String res;
                    if (found.size() == 1) {
                        res = String.format("%d", found.get(0));
                    } else if (found.isEmpty()) {
                        res = "Volunteer cheated!";
                    } else {
                        res = "Bad magician!";
                    }
                    pw.println(String.format("Case #%d: %s", CASE, res));
                    left = (System.currentTimeMillis() - start) * (NUM_CASES - CASE) / CASE;
                    System.out.println(String.format("%s (%dms, ~%dms left)", res, (System.currentTimeMillis() - t1), left));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
