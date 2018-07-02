package methodEmbedding.Counting_Sheep.S.LYD967;

import java.io.*;
import java.util.Scanner;

public class Sheep {

    public static void main(String[] args) throws IOException {

        int t;
        long n;

        Scanner scanner = new Scanner(new FileInputStream("c:\\codejam\\sheep.in"));
        Writer writer = new OutputStreamWriter(new FileOutputStream("c:\\codejam\\sheep.out"));

        t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            n = scanner.nextLong();

            if (n == 0) {
                writer.write("Case #" + i + ": " + "INSOMNIA\n");
                System.out.println("INSOMNIA");
                continue;
            }

            long m = 0;
            boolean[] digits = new boolean[10];
            int digCount = 0;
            while (digCount < 10) {
                m += n;

                String string = Long.toString(m);
                for (int indx = 0; indx < string.length(); indx++) {
                    char ch = string.charAt(indx);
                    int dig = ch - '0';

                    digCount += digits[dig] ? 0 : 1;
                    digits[dig] = true;
                }
            }
            System.out.println("Case #" + i + ": " + m);
            writer.write("Case #" + i + ": " + m + "\n");
        }

        writer.close();
    }

}
