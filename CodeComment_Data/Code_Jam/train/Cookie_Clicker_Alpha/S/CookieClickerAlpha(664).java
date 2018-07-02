package methodEmbedding.Cookie_Clicker_Alpha.S.LYD704;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 8
 * Date: 4/12/14
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner((CookieClickerAlpha.class.getClassLoader().getResourceAsStream("data.txt")));

        PrintWriter out = new PrintWriter("CookieClickerAlpha.out");

        int lines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i<= lines; i++){

            double s = (double) 2.0;
            double c = scanner.nextDouble();
            double f = scanner.nextDouble();
            double x = scanner.nextDouble();

            double min = x/s;
            double totalTime = 0.0f;


            while(true){
                double slice = c/s;
                totalTime += slice;
                s += f;
                if (totalTime + (x/s) < min)
                    min = totalTime + (x/s);
                else break;
            }

            out.println("Case #" + i + ": " + min);

        }

        scanner.close();
        out.close();
    }

}
