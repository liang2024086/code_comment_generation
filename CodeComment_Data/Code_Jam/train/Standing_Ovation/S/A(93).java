package methodEmbedding.Standing_Ovation.S.LYD1994;


import java.io.*;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("a.in"));
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("a.out"));

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int smax = scanner.nextInt();
            String line = scanner.nextLine().trim();

            int result = 0;
            int acc = 0;
            for (int j = 0; j <= smax; j++) {
                int cur = line.charAt(j) - '0';
                if (cur > 0 && acc < j) {
                    result += j - acc;
                    acc += j - acc;
                }
                acc += cur;
            }

            out.write(String.format("Case #%d: %d\n", i + 1, result));
        }

        out.close();
    }
}
