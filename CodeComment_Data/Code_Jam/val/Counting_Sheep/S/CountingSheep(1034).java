package methodEmbedding.Counting_Sheep.S.LYD203;

import java.util.HashSet;
import java.util.Scanner;

class CountingSheep {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        for (int test = 0; test < T; test++) {
            int N = cin.nextInt();
            if (N == 0) {
                System.out.println("Case #" + (test + 1) + ": " + "INSOMNIA");
                continue;
            }
            int mul = 1;
            HashSet<Integer> num = new HashSet<>();
            while (num.size() < 10) {
                int t = mul * N;
                String tt = String.valueOf(t);
                for (int j = 0; j < tt.length(); j++) {
                    int d = tt.charAt(j) - '0';
                    num.add(d);
                }
                mul++;
            }
            System.out.println("Case #" + (test + 1) + ": " + ((mul-1) * N));
        }
    }
}
