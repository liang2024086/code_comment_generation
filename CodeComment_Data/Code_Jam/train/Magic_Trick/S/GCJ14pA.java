package methodEmbedding.Magic_Trick.S.LYD1754;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GCJ14pA {

    static BufferedReader inp;
    static PrintWriter out;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        inp = new BufferedReader(new FileReader("in.txt"));
        out = new PrintWriter("out.txt");
        int t = Integer.parseInt(inp.readLine());
        String m;
        String[] k = null;
        int[] deck1 = new int[4];
        int[] deck2 = new int[4];
        int row;
        String[] ans = new String[t];
        for (int i = 0; i < t; i++) {
            m = inp.readLine();
            row = Integer.parseInt(m);
            for (int j = 0; j < 4; j++) {
                m = inp.readLine();
                k = m.split(" ");
                if (j == row - 1) {
                    for (int y = 0; y < 4; y++) {
                        deck1[y] = Integer.parseInt(k[y]);
                    }
                }
            }
            m = inp.readLine();
            row = Integer.parseInt(m);
            for (int j = 0; j < 4; j++) {
                m = inp.readLine();
                k = m.split(" ");
                if (j == row - 1) {
                    for (int y = 0; y < 4; y++) {
                        deck2[y] = Integer.parseInt(k[y]);
                    }
                }
            }
            int count = 0;
            int temp = 0;
            for (int j = 0; j < 4; j++) {
                for (int y = 0; y < 4; y++) {
                    if (deck1[j] == deck2[y]) {
                        temp = y;
                        count++;
                    }
                }
            }
            if (count == 0) {
                ans[i] = "Volunteer cheated!";
            } else if (count == 1) {
                ans[i] = Integer.toString(deck2[temp]);
            } else {
                ans[i] = "Bad magician!";
            }
        }
        PrintWriter outp = new PrintWriter(new FileWriter("C:\\Users\\Faheem\\Desktop\\Output.txt"));

        for (int x = 0; x < t; x++) {
            outp.println("Case #" + (x + 1) + ": " + ans[x]);
        }
        outp.close();
    }
}
