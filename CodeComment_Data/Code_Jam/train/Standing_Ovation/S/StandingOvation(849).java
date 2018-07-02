package methodEmbedding.Standing_Ovation.S.LYD750;


import java.io.*;

/**
 * @author Octavian
 * @since 11.04.2015
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
        BufferedWriter writer = new BufferedWriter(new PrintWriter("A-small.out"));
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            String[] a = reader.readLine().split(" ");
            int smax = Integer.parseInt(a[0]);
            int r = 0;
            if (smax > 0) {
                int v = a[1].charAt(0) - '0';
                int n = v;
                int friends;
                for (int j = 1; j <= smax; j++) {
                    v = a[1].charAt(j) - '0';
                    friends = j - n;
                    n += v;
                    if (friends > 0) {
                        r += friends;
                        n += friends;
                    }
                }
            }

            writer.append(String.format("Case #%d: %d\r\n", i + 1, r));
            writer.flush();
        }

        writer.close();
        reader.close();
    }
}
