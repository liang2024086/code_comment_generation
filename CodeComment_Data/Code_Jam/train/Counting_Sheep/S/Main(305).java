package methodEmbedding.Counting_Sheep.S.LYD1587;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int tests = in.nextInt();
        for (int t = 1; t <= tests; ++t) {
            BigInteger n = in.nextBigInteger();
            boolean[] exist = new boolean[10];
            int ans = 0;

            int i;
            BigInteger calcValue = n;
            for (i = 1; i < 100000; ++i, calcValue = n.multiply(BigInteger.valueOf(i))) {
                String number = calcValue.toString();
                for (int j = 0; j < number.length(); ++j) {
                    int temp = Integer.parseInt(String.valueOf(number.charAt(j)));
                    if (!exist[temp]) {
                        ans++;
                        exist[temp] = true;
                    }
                }

                if (ans >= 10) {
                    break;
                }
            }

            System.out.println("Case #"+ t +": " + (ans == 10 ? calcValue : "INSOMNIA"));
        }

    }
}
