package methodEmbedding.Standing_Ovation.S.LYD1853;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Mohammed
 */
public class JavaApplication4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.in"));
        int T = input.nextInt();
        int s;
        int standing, result, temp, needed;
        String line;
        for (int t = 1; t <= T; t++) {
            s = input.nextInt();
            line = input.next();
            standing = 0;
            result = 0;
            for (int i = 0; i <= s; i++) {
                temp = line.charAt(i) - '0';
                if (temp > 0) {
                    needed = 0;
                    if (standing < i) {
                        needed = i - standing;
                        result += needed;
                    }
                    standing += temp + needed;
                }
            }
            System.out.printf("Case #%d: %d\n", t, result);
        }
    }
}
