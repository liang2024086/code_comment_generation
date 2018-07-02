package methodEmbedding.Counting_Sheep.S.LYD1550;

import java.util.Scanner;

public class ProblemA {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        
        for (int i = 1; i <= numCases; i++) {
            long N = input.nextInt();
            long k = 1;
            boolean[] digits = new boolean[10];
            boolean insomnia = true;
            while (k < 1000000) {
                long kN = k * N;
                for (long m = kN; m > 0; m = m / 10) {
                    int d = (int) (m % 10);
                    digits[d] = true;
                }
                boolean clear = true;
                for (int j = 0; j < 10; j++) {
                    if (!digits[j]) {
                        clear = false;
                        break;
                    }
                }
                if (clear) {
                    System.out.println(String.format("Case #%d: %d", i, kN));
                    insomnia = false;
                    break;
                }
                k++;
            }
            
            if (insomnia) {
                System.out.println(String.format("Case #%d: INSOMNIA", i));
            }
        }
        
        input.close();
    }
}
