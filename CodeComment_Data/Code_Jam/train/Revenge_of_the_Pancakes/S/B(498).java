package methodEmbedding.Revenge_of_the_Pancakes.S.LYD783;

import java.io.*;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter("B.out"));
        int T = Integer.parseInt(in.readLine());

        for (int t = 0; t < T; ++t) {
            String S = in.readLine();
            int num_blocks = 1;
            for (int i = 1; i < S.length(); ++i) {
                if (S.charAt(i) != S.charAt(i - 1)) {
                    ++num_blocks;
                }
            }
            out.write("Case #" + (t+1) + ": " + ((S.charAt(0) == '+' && num_blocks % 2 == 1) || (S.charAt(0) == '-' && num_blocks % 2 == 0) ? num_blocks - 1 : num_blocks) + "\n");
        }
        out.close();
    }
}
