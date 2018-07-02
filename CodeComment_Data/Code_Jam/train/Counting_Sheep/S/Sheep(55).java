package methodEmbedding.Counting_Sheep.S.LYD295;

import java.util.*;
import java.io.*;

public class Sheep {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("sheep.in"));
        PrintWriter out = new PrintWriter(new FileWriter("sheep.out"));
        int t = Integer.parseInt(new StringTokenizer(in.readLine()).nextToken());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(new StringTokenizer(in.readLine()).nextToken());
            if (n == 0) {
                out.println("Case #" + i + ": INSOMNIA");
            } else {
                boolean[] seenDigits = new boolean[10];
                int count = 0, m = 0;
                while (count != 10) {
                    m += n;
                    int x = m;
                    while (x != 0) {
                        if (!seenDigits[x % 10]) {
                            count++;
                            seenDigits[x % 10] = true;
                        }
                        x /= 10;
                    }
                }
                out.println("Case #" + i + ": " + m);
            }
        }
        out.close();
        System.exit(0);
    }

}
