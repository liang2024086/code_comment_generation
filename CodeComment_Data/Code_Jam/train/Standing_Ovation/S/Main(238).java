package methodEmbedding.Standing_Ovation.S.LYD909;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("A-small-attempt0.out")));
            int testCount = Integer.parseInt(in.readLine());
            for (int t = 1; t <= testCount; t++) {
                StringTokenizer tokens = new StringTokenizer(in.readLine());
                tokens.nextToken();
                String shies = tokens.nextToken();
                long fromLeft = shies.charAt(0) - '0';
                long s = 0;
                for (int pos = 1; pos < shies.length(); pos++) {
                    int here = shies.charAt(pos) - '0';
                    if (fromLeft < pos) {
                        s += pos - fromLeft;
                        fromLeft = pos;
                    }
                    fromLeft += here;
                }
                out.write("Case #" + t + ": " + s);
                out.newLine();
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignored) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ignored) {
                }
            }
        }
    }
}
