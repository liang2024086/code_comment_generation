package methodEmbedding.Revenge_of_the_Pancakes.S.LYD278;

import java.util.Scanner;

/**
 *
 * @author Ashu
 */
public class Revenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = Integer.parseInt(scan.nextLine());
        for (int t = 0; t < tc; t++) {
            char[] s = scan.nextLine().toCharArray();
            int count = 0, len = s.length - 1;
            for (int i = len; i >= 0; i--) {
                if (s[i] == '-') {
                    for (int j = i; j >= 0; j--) {
                        s[j] = (s[j] == '+') ? '-' : '+';
                    }
                    count++;
                }
            }
            System.out.format("Case #%d: %s\n", t + 1, count);
        }
    }
}
