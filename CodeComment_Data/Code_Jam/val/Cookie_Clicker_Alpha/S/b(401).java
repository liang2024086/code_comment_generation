package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1270;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Uday Kandpal
 */
public class b {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("a.txt")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("a.out")));
        int t = Integer.parseInt(br.readLine());

        for (int j = 1; j <= t; j++) {
            double c, f, x, r = 2.0, min = 0.0;
            int n;
            String dat = br.readLine();
            String list[] = dat.trim().split(" ");
            c = Double.parseDouble(list[0]);
            f = Double.parseDouble(list[1]);
            x = Double.parseDouble(list[2]);
            while (f * x > (r + f) * c) {
                min += c / r;//select farm
                r += f;
            }
            min += x / r;
            String s = "Case #" + j + ": " + min + "\n";
            bw.write(s, 0, s.length());
        }
        bw.close();
        br.close();
    }
}
