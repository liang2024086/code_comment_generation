package methodEmbedding.Revenge_of_the_Pancakes.S.LYD994;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RevengePancakes {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
            int t = in.nextInt();
            in.nextLine();
            
            for (int i = 1; i <= t; ++i) {
                int total = 0;
                String pancakes = in.nextLine();

                if (pancakes.charAt(0) == '-') {
                    ++total;
                }

                for (int a = 1; a < pancakes.length(); ++a) {
                    if (pancakes.charAt(a - 1) == '+' && pancakes.charAt(a) == '-') {
                        total += 2;
                    }
                }

                System.out.println("Case #" + i + ": " + total);
            }
        }
    }
}
