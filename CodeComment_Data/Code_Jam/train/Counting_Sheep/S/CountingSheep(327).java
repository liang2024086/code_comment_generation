package methodEmbedding.Counting_Sheep.S.LYD1502;


import java.io.*;
import java.util.HashSet;

/**
 * Created by darshan on 9/4/16.
 */
public class CountingSheep {
    private static final boolean flag = false;
    private static final String output = "Case #%d: ";

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        PrintWriter out;
        if (flag) {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            br = new BufferedReader(new FileReader("/home/darshan/Downloads/A-small-attempt0.in"));
            out = new PrintWriter(new BufferedWriter(new FileWriter("/home/darshan/Downloads/A-small.txt")));
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int T = Integer.parseInt(br.readLine()), t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                out.println(String.format(output, t) + "INSOMNIA");
                continue;
            }

            int i = n;
            while (true) {
                int temp = i;
                while (temp > 0) {
                    hashSet.add(temp % 10);
                    temp /= 10;
                }
                if (hashSet.size() == 10) {
                    out.println(String.format(output, t) + i);
                    hashSet.clear();
                    break;
                }
                i += n;
            }
        }
        out.close();
    }
}
