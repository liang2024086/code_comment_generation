package methodEmbedding.Cookie_Clicker_Alpha.S.LYD757;

import java.io.*;
import java.util.Scanner;

public class Q_B {

    public static void main(String args[]) throws IOException {
        //String path = "/Users/xinzhong/Dropbox/projects/practice/code/data/Q_B_test.in";
        String path = "/Users/xinzhong/Downloads/B-small-attempt0.in";
        String pathOut = "/Users/xinzhong/Dropbox/projects/practice/code/data/B-small-attempt0.out";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut))) {
            int n = scanner.nextInt();

            for (int T = 1; T <= n; T++) {
                double C = scanner.nextDouble();
                double F = scanner.nextDouble();
                double X = scanner.nextDouble();

                double rate = 2.0;
                double prevC = 0;
                double prev = X / 2.0;
                while (true) {
                    double currC = prevC + C / rate;
                    rate += F;
                    double curr = currC + X / rate;
                    if (curr > prev) {
                        break;
                    }
                    prev = curr;
                    prevC = currC;
                }

                System.out.println(prev);

                String s = "Case #" + T + ": ";

                writer.write(s + prev + "\n");


            }
        }
    }
}
