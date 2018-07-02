package methodEmbedding.Cookie_Clicker_Alpha.S.LYD517;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Cookies {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("B-small-attempt4.in"));
        StringTokenizer line;
        FileWriter out = new FileWriter("Xx.out");
        int test = Integer.parseInt(br.readLine());
        for (int k = 0; k < test; k++) {
            line = new StringTokenizer(br.readLine());
            double c = Double.parseDouble(line.nextToken());
            double f = Double.parseDouble(line.nextToken());
            double x = Double.parseDouble(line.nextToken());
            double inc = 2.0;
            double ttime = 0;
            for (;;) {
                if (((c / inc) + (x / (inc + f))) < (x / inc)) {
                    ttime += c / inc;
                    inc += f;
                    continue;

                }

                ttime += x / inc;
                break;
            }
            double xx = Math.round(ttime * 10000000) / 10000000.0;
            out.append("Case #" + (k + 1) + ": " + xx + "\n");
        }
        out.close();
    }

}
