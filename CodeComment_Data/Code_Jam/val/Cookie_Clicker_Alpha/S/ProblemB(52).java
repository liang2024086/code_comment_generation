package methodEmbedding.Cookie_Clicker_Alpha.S.LYD199;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            int count = i + 1;
            double c = 0, f = 0, x = 0;
            c = scanner.nextDouble();
            f = scanner.nextDouble();
            x = scanner.nextDouble();
            double timeEst = x / 2;
            double timeFarm = c / 2;
            double timeCurrent = timeFarm;
            if (timeFarm > timeEst) {
                pw.println("Case #" + count + ": " + timeEst);
            } else {
                double del = 2 + f;
                while (true) {
                    double newTimeExt = x / (del);
                    if (newTimeExt + timeCurrent > timeEst) {
                        break;
                    } else {
                        timeEst = newTimeExt + timeCurrent;
                        timeCurrent = c / del + timeCurrent;
                        del = del + f;

                    }
                }
                pw.println("Case #" + count + ": " + timeEst);
            }
        }
        pw.close();

    }

}
