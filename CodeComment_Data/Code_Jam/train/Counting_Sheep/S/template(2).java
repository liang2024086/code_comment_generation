package methodEmbedding.Counting_Sheep.S.LYD273;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class template {

    public static void main(String[] args) throws FileNotFoundException {

        //String file = "A-test-practice";
        String file = "A-small-attempt0";
        //String file = "A-large-practice";

        PrintStream out = new PrintStream(file + ".out");
        //PrintStream out = System.out;

        Scanner in = new Scanner(new FileReader(file + ".in"));

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int count = 0;

            if (n == 0) {
                out.printf("Case #%d: INSOMNIA\n", i + 1);
                continue;
            }

            int flag = 0;
            int num;
            while (flag != 1023) {
                num = ++count * n;
                int d;
                do {
                    d = num % 10;
                    flag |= 1 << d;
                    num = num / 10;
                } while (num != 0);
            }
            out.printf("Case #%d: %d\n", i + 1, count*n);
        }

    }
}
