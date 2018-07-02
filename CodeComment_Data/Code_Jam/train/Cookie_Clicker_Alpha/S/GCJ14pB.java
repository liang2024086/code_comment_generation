package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1170;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GCJ14pB {

    static BufferedReader inp;
    static PrintWriter out;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        inp = new BufferedReader(new FileReader("in.txt"));
        int t = Integer.parseInt(inp.readLine());
        String m;
        String[] k = null;
        double ans;
        PrintWriter outp = new PrintWriter(new FileWriter("C:\\Users\\Faheem\\Desktop\\Output.txt"));
        for (int i = 0; i < t; i++) {
            ans = 0.0;
            m = inp.readLine();
            k = m.split(" ");
            double c = Double.parseDouble(k[0]);
            double f = Double.parseDouble(k[1]);
            double x = Double.parseDouble(k[2]);
            double tempF = 2.0;
            while (true) {
                if (((c / tempF) + (x / (tempF + f))) < (x / tempF)) {
                    ans += (c / tempF);
                    tempF += f;
                } else {
                    ans += (x / tempF);
                    break;
                }
            }
            outp.printf("Case #%d: %.7f", i + 1, ans);
            if (i != t - 1) {
                outp.println();
            }
        }
        outp.close();
    }
}
