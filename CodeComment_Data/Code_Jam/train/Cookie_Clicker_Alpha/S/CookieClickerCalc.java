package methodEmbedding.Cookie_Clicker_Alpha.S.LYD89;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CookieClickerCalc {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("B-small-attempt0.in");
        Scanner data = new Scanner(input);
        PrintStream output = new PrintStream(new File("B-small-attempt0.out"));
        int times = data.nextInt();

        for(int i = 1; i <= times; i++){
            double c = data.nextDouble();
            double f = data.nextDouble();
            double x = data.nextDouble();
            double r = 2.0;

            double total = x / r;

            double tempTotal = 0.0;
            int tf = 1;
            double cr = r;

            for (int j = 0; j < tf; j++) {
                tempTotal += c / cr;
                cr += f;
            }
            tf++;
            tempTotal += x / cr;


            while (tempTotal < total) {
                total = tempTotal;
                tempTotal = 0.0;
                cr = r;
                for (int j = 0; j < tf; j++) {
                    tempTotal += c / cr;
                    cr += f;
                }
                tf++;
                tempTotal += x / cr;
            }


            output.printf("Case #%d: %.7f\n", i, total);
        }
    }
}
