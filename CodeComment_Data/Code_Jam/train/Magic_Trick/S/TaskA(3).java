package methodEmbedding.Magic_Trick.S.LYD692;


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by DaiYang on 2014/4/13.
 */
public class TaskA {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileInputStream("TaskA.in"));
        PrintWriter out = new PrintWriter(new FileOutputStream("TaskA.out"));
        int T = in.nextInt();
        for (int Case = 1; Case <= T; ++Case) {
            out.print("Case #" + Case + ": ");
            int firstR = in.nextInt();
            Set<Integer> has = new HashSet<Integer>();
            for (int i = 1; i <= 4; ++i) {
                for (int j = 1; j <= 4; ++j) {
                    int tmp = in.nextInt();
                    if (i == firstR) has.add(tmp);
                }
            }
            int secondR = in.nextInt();
            int targetN = 0, target = 0;
            for (int i = 1; i <= 4; ++i)
                for (int j = 1; j <= 4; ++j) {
                    int tmp = in.nextInt();
                    if (i == secondR && has.contains(tmp)) {
                        ++targetN;
                        target = tmp;
                    }
                }
            if (targetN == 0)
                out.println("Volunteer cheated!");
            else if (targetN == 1)
                out.println(target);
            else
                out.println("Bad magician!");
        }
        out.close();
    }
}
