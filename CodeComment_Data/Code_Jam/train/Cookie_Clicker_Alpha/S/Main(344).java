package methodEmbedding.Cookie_Clicker_Alpha.S.LYD107;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author zhs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int cnt = 1; cnt <= t; cnt++) {
            System.out.print("Case #" + cnt + ": ");
            double c = scanner.nextDouble();
            double f = scanner.nextDouble();
            double y = scanner.nextDouble();
            double a = 2;
            double x = 0;
            double min = y / a;
            while (x <= min) {
                x += c / a;
                a += f;
                min = Math.min(min, x + y / a);
            }
            System.out.println(min);
        }
    }
}
