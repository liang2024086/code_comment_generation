package methodEmbedding.Counting_Sheep.S.LYD1668;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        HashSet<Integer> set = new HashSet<Integer>(10);
        for (int i = 1; i <= t; ++i) {
            final int n = in.nextInt();
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            set.clear();
            int result = 0;
            while (set.size() < 10) {
                result += n;
                int tmp = result;
                while (tmp > 0) {
                    set.add(tmp % 10);
                    tmp /= 10;
                }
            }
            System.out.println("Case #" + i + ": " + result);
        }
    }

}
