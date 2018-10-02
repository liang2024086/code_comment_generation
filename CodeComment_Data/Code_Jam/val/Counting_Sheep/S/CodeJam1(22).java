package methodEmbedding.Counting_Sheep.S.LYD524;

import java.io.*;

class CodeJam1 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter("/home/somnath/codejam1.out", "UTF-8");
        int a, c, i, j, k, t, n, v;
        String s;
        t = Integer.parseInt(br.readLine());
        char ch;
        for (k = 1; k <= t; k++) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                writer.println("Case #" + k + ": INSOMNIA");
                continue;
            }
            int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            v = 0;
            i = 1;
            while (v == 0) {
                a = n * i;
                i++;
                s = ""+a;
                for (j = 0; j < s.length(); j++) {
                    ch = s.charAt(j);
                    c = ch - '0';
                    arr[c] = 1;
                }
                c = 0;
                for (j = 0; j < 10; j++) {
                    if (arr[j] == 1)
                        c++;
                }
                if (c == 10) {
                    writer.println("Case #" + k + ": " + a);
                    v = 1;
                }
            }
        }
        writer.close();
    }
}
