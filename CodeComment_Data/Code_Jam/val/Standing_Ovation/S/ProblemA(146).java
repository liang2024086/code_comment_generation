package methodEmbedding.Standing_Ovation.S.LYD1027;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by vio on 11.04.2015.
 */
public class ProblemA {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter writer = new PrintWriter(new File("problem.out"));
        int T = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= T; i++) {
            String[] line = in.nextLine().split(" ");
            int max = line[0].charAt(0) - '0';
            int friendCount = 0, peopleCount = line[1].charAt(0) - '0';
            for (int j = 1; j <= max; j++) {
                int curCount = line[1].charAt(j) - '0';
                if (curCount > 0 && j - peopleCount - friendCount > 0) {
                    friendCount += j - peopleCount - friendCount;
                }
                peopleCount += curCount;
            }
            writer.write(String.format("Case #%d: %d\n", i, friendCount));
        }
        writer.close();
    }
}
