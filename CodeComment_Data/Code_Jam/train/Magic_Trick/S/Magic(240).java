package methodEmbedding.Magic_Trick.S.LYD1155;

import java.io.*;
import java.util.HashSet;

/**
 * Created by SaiL on 14-4-12.
 */
public class Magic {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("A-small-attempt0.out"));

        int T, row1, row2, cas = 0;
        String[] line;
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            HashSet<Integer> hs = new HashSet<Integer>();
            HashSet<Integer> rs = new HashSet<Integer>();
            row1 = Integer.parseInt(br.readLine());
            for (int i = 1; i <= 4; i++) {
                line = br.readLine().split(" ");
                if (row1 == i) {
                    for (int j = 0; j < 4; j++) {
                        hs.add(Integer.parseInt(line[j]));
                    }
                }
            }
            row2 = Integer.parseInt(br.readLine());
            for (int i = 1; i <= 4; i++) {
                line = br.readLine().split(" ");
                if (row2 == i) {
                    for (int j = 0; j < 4; j++) {
                        int cur = Integer.parseInt(line[j]);
                        if (hs.contains(cur))
                            rs.add(cur);
                    }
                }
            }
            pw.print("Case #" + (++cas) + ": ");
            if (rs.size() == 0) {
                pw.print("Volunteer cheated!");
            } else if (rs.size() > 1) {
                pw.print("Bad magician!");
            } else {
                pw.print(rs.iterator().next());
            }
            pw.println();
        }
        pw.flush();
    }
}
