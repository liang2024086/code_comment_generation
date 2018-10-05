package methodEmbedding.Revenge_of_the_Pancakes.S.LYD492;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        int T = Integer.parseInt(line);
        
        for (int t = 1; t <= T; t++) {
            line = stdin.readLine();
            int n = line.length();
            int cnt = 0;
            boolean f = false;;
            if (line.charAt(0) == '+') {
                f = true;
            }
            for (int i = 1; i < n; i++) {
                char ch = line.charAt(i);
                if (ch == '+' && !f || ch == '-' && f) {
                    cnt++;
                    f = !f;
                }
            }
            if (!f) cnt++;
            System.out.printf("Case #%d: %d\n", t, cnt);
        }
    }
}
