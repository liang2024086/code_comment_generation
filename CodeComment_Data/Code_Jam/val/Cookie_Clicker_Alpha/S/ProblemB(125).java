package methodEmbedding.Cookie_Clicker_Alpha.S.LYD705;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by pakon on 12.04.14.
 */
public class ProblemB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int k = 1; k <= t; ++k) {

            double c = Double.parseDouble(scanner.next());
            double f = Double.parseDouble(scanner.next());
            double x = Double.parseDouble(scanner.next());

            double time = 0.0;
            double speed = 2.0;

            while ((x / speed) > (c / speed) + (x / (speed + f))) {
//                System.out.println("Speed: " + speed);
                time += c / speed;
//                System.out.println("Time: " + time);
                speed += f;
            }

            time += x / speed;

            System.out.println("Case #" + k + ": " + time);
        }
    }
}
