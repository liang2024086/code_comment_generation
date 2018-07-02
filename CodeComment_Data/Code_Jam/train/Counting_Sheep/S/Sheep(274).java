package methodEmbedding.Counting_Sheep.S.LYD733;


import com.google.code.Pancakes;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 */
public class Sheep {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        InputStream is = Pancakes.class.getResourceAsStream("/A-small-attempt0.in");
        Scanner s = new Scanner(is);
        OutputStream os = new FileOutputStream("A-small-attempt0.out");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        int totalCnt = s.nextInt();
        boolean[] seenNums = new boolean[10];
        for (int test = 0; test < totalCnt; test++) {
            int n = s.nextInt();
            if (n == 0) {
                bw.write("Case #" + (test + 1) + ": INSOMNIA\n");
                continue;
            }
            Arrays.fill(seenNums, false);
            int i = 0;
            outer:
            while (true) {
                int num = n * i;
                while (num > 0) {
                    int newN = num / 10;
                    seenNums[num - newN * 10] = true;
                    num = newN;
                }
                for (boolean seenNum : seenNums) {
                    if (!seenNum) {
                        i++;
                        continue outer;
                    }
                }
                break;
            }
            bw.write("Case #" + (test + 1) + ": " + (n * i) + "\n");
        }
        bw.flush();
        os.close();
        s.close();
        System.out.println("time: " + (System.currentTimeMillis() - start));

    }
}
