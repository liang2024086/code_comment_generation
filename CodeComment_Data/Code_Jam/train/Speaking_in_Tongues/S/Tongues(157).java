package methodEmbedding.Speaking_in_Tongues.S.LYD837;

import java.io.*;

/**
 * @author Andrey Zarubin
 */
public class Tongues {
    public static final char[] MAPPING = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k',
            'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};


    public static void main(String... args) throws IOException {
        String fileName = args[0];
        BufferedReader r = new BufferedReader(new FileReader(fileName));
        PrintWriter w = new PrintWriter(fileName.split("\\.")[0] + ".out.txt");
        int t = Integer.parseInt(r.readLine());
        for (int i = 0; i < t; i++) {
            String g = r.readLine();
            StringBuilder e = new StringBuilder();
            for (int j = 0; j < g.length(); j++) {
                char c = g.charAt(j);
                if (c == ' ')
                    e.append(' ');
                else
                    e.append(MAPPING[c - 'a']);
            }
            w.println("Case #" + (i + 1) + ": " + e);
        }
        r.close();
        w.close();
    }
}
