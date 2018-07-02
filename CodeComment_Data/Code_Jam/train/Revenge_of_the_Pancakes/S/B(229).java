package methodEmbedding.Revenge_of_the_Pancakes.S.LYD482;

import java.util.*;
import java.io.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

public class B {
    static int INF = 1<<30;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int T = parseInt(br.readLine());
        for (int z=0;z<T;z++) {
            char[] arr = br.readLine().trim().toCharArray();
            int N = arr.length;
            int[] ok = new int[N];
            int[] rev = new int[N];
            Arrays.fill(ok, INF);
            Arrays.fill(rev, INF);
            ok[0] = arr[0] == '+' ? 0 : 1;
            rev[0] = 1 - ok[0];

            for (int i=1;i<N;i++) {
                if (arr[i] == '+') {
                    ok[i] = min(ok[i], ok[i-1]);
                    rev[i] = min(rev[i], 1 + ok[i-1]);
                } else {
                    ok[i] = min(ok[i], 1 + rev[i-1]);
                    rev[i] = min(rev[i], rev[i-1]);
                }
            }

            out.println("Case #" + (z+1) + ": " + ok[N-1]);
            // out.println(Arrays.toString(ok));
            // out.println(Arrays.toString(rev));
        }
    }
}
