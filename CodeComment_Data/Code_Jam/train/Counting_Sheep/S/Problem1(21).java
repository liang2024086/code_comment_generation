package methodEmbedding.Counting_Sheep.S.LYD87;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data/A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new File("data/A-small-attempt0.out"));
        int t = sc.nextInt();
        int caseIndex = 1;
        while (t-- > 0) {
            long n = sc.nextInt();
            if(n==0){
                out.println("Case #" + caseIndex++ + ": INSOMNIA");
                continue;
            }
            boolean[] seen = new boolean[10];
            int seenCount = 0;
            for (int i = 1; seenCount < 10; i++) {
                long h = n * i;
                while (h > 0) {
                    if (!seen[(int)(h % 10)]) {
                        seen[(int)(h % 10)] = true;
                        seenCount++;
                    }
                    h /= 10;
                }
                if (seenCount == 10) {
                    out.println("Case #" + caseIndex++ + ": " + n * i);
                    break;
                }
            }
        }
        out.close();
    }

}
