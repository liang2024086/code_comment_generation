package methodEmbedding.Standing_Ovation.S.LYD588;


import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File(args[0]));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(args[1]))));
        final int N_CASE = sc.nextInt();
        for (int C = 0; C < N_CASE; C++) {
            int S_max = sc.nextInt();
            int[] S = Stream.of(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
            assert(S_max == S.length + 1);

            int sum = 0;
            int diff = 0;
            for (int i = 0; i < S.length; i++) {
                if (i > sum + diff) {
                    diff = i - sum;
                }
                sum = sum + S[i];
            }
            pw.printf("Case #%d: %d%n", C+1, diff);
        }
        pw.flush();
        pw.close();
    }
}
