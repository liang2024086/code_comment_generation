package methodEmbedding.Standing_Ovation.S.LYD748;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        int T = Integer.parseInt(line);
        
        for (int t = 1; t <= T; t++) {
            line = stdin.readLine();
            String[] prms = line.split(" ");
            
            int n = Integer.parseInt(prms[0]);
            int ans = 0;
            int cnt = 0;
            for (int i = 0; i <= n; i++) {
                if (cnt < i) {
                    ans += (i-cnt);
                    cnt = i;
                }
                char ch = prms[1].charAt(i);
                cnt += (int)(ch-'0');
            }
            System.out.printf("Case #%d: %d\n", t, ans);
        }
    }
}
