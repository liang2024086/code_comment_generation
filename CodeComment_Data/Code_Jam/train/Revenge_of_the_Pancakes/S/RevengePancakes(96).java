package methodEmbedding.Revenge_of_the_Pancakes.S.LYD927;


import java.util.Scanner;

public class RevengePancakes {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int T = scanner.nextInt();
        int caseNumber = 0;
        while (caseNumber++ < T) {

            final char[] pancakes = scanner.next().toCharArray();

            int count = 0;
            char prev = pancakes[0];
            for (int i = 1; i < pancakes.length; i++) {
                if (pancakes[i] == '-') {
                    if (prev == '+') {
                        count++;
                    }
                } else {
                    if (prev == '-') {
                        count++;
                    }
                }
                prev = pancakes[i];
            }
            if (prev == '-') count++;

            System.out.println(String.format("Case #%d: %s", caseNumber, count));
        }
    }
}
