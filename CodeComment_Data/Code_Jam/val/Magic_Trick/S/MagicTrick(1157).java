package methodEmbedding.Magic_Trick.S.LYD1604;


import java.io.*;

/**
 * @author Octavian
 */
public class MagicTrick {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
        BufferedWriter writer = new BufferedWriter(new PrintWriter("out.txt"));
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            int r1 = Integer.parseInt(reader.readLine());
            int[] v1 = new int[4];
            for (int x = 1; x <= 4; x++) {
                String line = reader.readLine();
                if (r1 == x) {
                    String[] a = line.split(" ");
                    for (int y = 0; y < 4; y++) {
                        v1[y] = Integer.parseInt(a[y]);
                    }
                }
            }

            int r2 = Integer.parseInt(reader.readLine());
            int[] v2 = new int[4];
            for (int x = 1; x <= 4; x++) {
                String line = reader.readLine();
                if (r2 == x) {
                    String[] a = line.split(" ");
                    for (int y = 0; y < 4; y++) {
                        v2[y] = Integer.parseInt(a[y]);
                    }
                }
            }

            int matches = 0;
            int lastMatch = -1;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (v1[j] == v2[k]) {
                        matches++;
                        lastMatch = v1[j];
                    }
                }
            }

            writer.append("Case #");
            writer.append((i + 1) + ": ");
            if (matches == 1) {
                writer.append(Integer.toString(lastMatch));
            } else if (matches == 0) {
                writer.append("Volunteer cheated!");
            } else {
                writer.append("Bad magician!");
            }
            writer.append("\r\n");
            writer.flush();
        }

        writer.close();
        reader.close();
    }

}
