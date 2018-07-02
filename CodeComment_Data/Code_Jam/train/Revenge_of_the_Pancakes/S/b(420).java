package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1038;

import java.util.*;
import java.io.*;

public class b {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String s = reader.readLine();
            char[] c = s.toCharArray();
            boolean done = false;
            int answer = 0;
            int pos = 0;
            char sym = '+';

            /*while (pos < c.length) {
                while (pos < c.length && c[pos] == '+') {
                    pos++;
                }
                if (pos >= c.length) {
                    break;
                }
                answer++;
                while (pos < c.length && c[pos] == '-') {
                    pos++;
                }
                if (pos >= c.length) {
                    break;
                }
            }*/

            pos = 1;
            while (pos < c.length) {
                if (c[pos] != c[pos-1]) {
                    answer++;
                }
                pos++;
            }


            if (c[pos-1] == '-') {
                answer++;
            }

            System.out.printf("Case #%d: %d\n", i+1, answer);
        }
    }
}
