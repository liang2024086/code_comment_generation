package methodEmbedding.Revenge_of_the_Pancakes.S.LYD41;


import java.io.*;

/**
 * Created by darshan on 9/4/16.
 */
public class RevengeOfThePancakes {
    private static final boolean flag = false;
    private static final String output = "Case #%d: ";

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        PrintWriter out;
        if (flag) {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            br = new BufferedReader(new FileReader("/home/darshan/Downloads/B-small-attempt0.in"));
            out = new PrintWriter(new BufferedWriter(new FileWriter("/home/darshan/Downloads/B-small.txt")));
        }

        for (int T = Integer.parseInt(br.readLine()), t = 1; t <= T; t++) {
            String s = br.readLine();
            int l = s.length();
            int[] stack = new int[l];
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) == '-') {
                    stack[i] = 1;
                } else {
                    stack[i] = 0;
                }
            }
            int time = 0;
            for (int i = l - 1; i > -1; i--) {
                stack[i] = (stack[i] + time) & 1;
                if (stack[i] == 0) {
                    continue;
                }
                time++;
            }
            out.println(String.format(output, t) + time);
        }
        out.close();
    }
}
