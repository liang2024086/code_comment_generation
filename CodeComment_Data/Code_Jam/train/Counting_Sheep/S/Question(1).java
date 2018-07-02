package methodEmbedding.Counting_Sheep.S.LYD1079;

import java.util.*;
import java.io.*;

public class Question {


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            int count = 1;
            boolean[] flags = new boolean[10];
            do {
                int tmp = n * count;
                final int result = tmp;
                while (tmp > 0) {
                    flags[tmp % 10] = true;
                    tmp = tmp / 10;
                }
                if (flags[0] && flags[1] && flags[2] && flags[3] && flags[4] && flags[5] && flags[6] && flags[7] && flags[8] && flags[9]) {
                    System.out.println("Case #" + i + ": " + result);
                    break;
                }
                count++;
            } while (true);


        }
    }
}

