package methodEmbedding.Counting_Sheep.S.LYD1492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by colander on 4/9/16.
 */
public class ProblemA {
    public static void main(String[] args) {
        new ProblemA();
    }

    public ProblemA() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int tests = Integer.parseInt(br.readLine());
            for (int i = 0; i < tests; i++) {
                long n = Long.parseLong(br.readLine());
                boolean[] check = new boolean[10];
                boolean broken = false;
                for (int j = 1; j < 1000; j++) {
                    long cur = j * n;
                    String s = cur + "";
                    for (int k = 0; k < s.length(); k++) {
                        int digit = Integer.parseInt(s.charAt(k) + "");
                        if (!check[digit]) check[digit] = true;
                    }
                    boolean cont = false;
                    for (int k = 0; k < check.length; k++) {
                        if (!check[k]) cont = true;
                    }
                    if (!cont) {
                        System.out.println("Case #" + (i + 1) + ": " + cur);
                        broken = true;
                        break;
                    }
                }
                if (!broken) {
                    System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
