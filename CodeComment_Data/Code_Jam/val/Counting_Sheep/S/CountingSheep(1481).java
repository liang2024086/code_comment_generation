package methodEmbedding.Counting_Sheep.S.LYD705;

import java.util.Scanner;

/**
 * Created by SID on 4/8/2016.
 */

public class CountingSheep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        for (int j = 1; j <= t; j++) {
            String n = in.nextLine();
            int original = Integer.parseInt(n);
            int result = original;
            if (result == 0) {
                System.out.println("Case #" + j + ": INSOMNIA");
                continue;
            }

            boolean[] digs = new boolean[10];
            int count = 0;

            while (count < 10) {
                int num = result;
                while(num != 0) {
                    int dig = num%10;
                    num /= 10;
                    if (digs[dig] == false) {
                        digs[dig] = true;
                        count++;
                    }
                }
                result += original;
            }

            if (count == 10) {
                System.out.println("Case #" + j + ": " + (result - original));
            }
        }
    }
}
