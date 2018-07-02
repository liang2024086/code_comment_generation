package methodEmbedding.Counting_Sheep.S.LYD1548;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter("A.out"));
        int T = Integer.parseInt(in.readLine());

        for (int t = 0; t < T; ++t) {
            int N = Integer.parseInt(in.readLine());
            int cur_num = N;
            boolean[] D = new boolean[10];
            int d_seen = 0;
            if (N == 0) {
                out.write("Case #" + (t+1) + ": INSOMNIA\n");
            } else {
                for (int i = 0; i < 100; ++i) {
                    int M = cur_num;
                    while (M > 0) {
                        if (!D[M % 10]) {
                            ++d_seen;
                            D[M % 10] = true;
                        }
                        M /= 10;
                    }
                    if (d_seen == 10) {
                        out.write("Case #" + (t+1) + ": " + cur_num + "\n");
                        break;
                    }
                    cur_num += N;
                }
            }
        }
        out.close();
    }
}
