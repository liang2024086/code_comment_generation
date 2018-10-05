package methodEmbedding.Magic_Trick.S.LYD2017;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;


public class MagicTrick {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(new FileReader("input/A-small-attempt0.in"));
        PrintWriter out = new PrintWriter("output/A-small-attempt0.out");

        int N = in.nextInt();
        int n = 0;

        while (n++ < N) {

            TreeSet<Integer> rowNums = new TreeSet<Integer>();
            TreeSet<Integer> answers = new TreeSet<Integer>();

            int row = in.nextInt();

            for (int i = 0; i < 4; ++i)
                for (int j = 0; j < 4; ++j) {
                    int num = in.nextInt();
                    if (i+1 == row) rowNums.add(num);
                }

            row = in.nextInt();

            for (int i = 0; i < 4; ++i)
                for (int j = 0; j < 4; ++j) {
                    int num = in.nextInt();
                    if (i+1 == row) if (rowNums.contains(num)) answers.add(num);
                }

            if (answers.size() == 1) out.println("Case #" + n + ": " + answers.last());
            else if (answers.size() == 0) out.println("Case #" + n + ": Volunteer cheated!");
            else out.println("Case #" + n + ": Bad magician!");

        }

        in.close();
        out.flush();
        out.close();

    }


}
