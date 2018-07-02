package methodEmbedding.Counting_Sheep.S.LYD957;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(new FileInputStream(new File("A-small-attempt1.in")));
        PrintStream fw = new PrintStream(new File("output.txt"));
        System.setOut(fw);
        int n = Integer.parseInt(s.nextLine());
        for (int ii = 0; ii < n; ii++) {
            System.out.print("Case #" + (ii + 1) + ": ");
            int x = Integer.parseInt(s.nextLine());
            if (x == 0)  {
                System.out.println("INSOMNIA");
                continue;
            }
            boolean[] digits = new boolean[10];
            for (int jj = 1; true; jj++) {
                int num = x * jj;
                if (num < 10) {
                    digits[num] = true;
                } else {
                    int copy = num;
                    while (copy > 0) {
                        int val = copy / 10;
                        int last = copy - val * 10;
                        copy = val;
                        digits[last] = true;
                    }
                }

                boolean complete = true;
                for (int kk = 0; kk < digits.length; kk++) {
                    complete = complete && digits[kk];
                    if (!complete) break;
                }
                if (complete) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}
