package methodEmbedding.Magic_Trick.S.LYD1100;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class MagicTrick {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt3.in"));
        FileWriter out = new FileWriter("MT.out");
        StringTokenizer st;
        int tn = Integer.parseInt(in.readLine());
        for (int i = 0; i < tn; i++) {
            int sl1 = Integer.parseInt(in.readLine());
            int[] rn1 = new int[4];
            for (int j = 1; j < 5; j++) {
                if (j == sl1) {
                    st = new StringTokenizer(in.readLine());
                    for (int k = 0; k < 4; k++) {
                        rn1[k] = Integer.parseInt(st.nextToken());
                    }
                } else {
                    in.readLine();
                }
            }
            int[] rn2 = new int[4];
            int sl2 = Integer.parseInt(in.readLine());
            for (int j = 1; j < 5; j++) {
                if (j == sl2) {
                    st = new StringTokenizer(in.readLine());
                    for (int k = 0; k < 4; k++) {
                        rn2[k] = Integer.parseInt(st.nextToken());
                    }
                } else {
                    in.readLine();
                }
            }
            int id = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (rn1[j] == rn2[k]) {
                        id++;
                    }
                }
            }
            if (id == 0) {
                out.append("Case #" + (i + 1) + ": Volunteer cheated!");
                out.append("\n");
            } else if (id > 1) {
                out.append("Case #" + (i + 1) + ": Bad magician!");
                out.append("\n");
            } else {
                int res = 1;
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (rn1[j] == rn2[k]) {
                            res = rn1[j];
                        }
                    }
                }
                out.append("Case #" + (i + 1) + ": " + res);
                out.append("\n");
            }
        }
        out.close();
    }
}
