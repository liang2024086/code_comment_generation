package methodEmbedding.Cookie_Clicker_Alpha.S.LYD179;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CookieClickerAlpha {

    public static void main(String[] args) {
        int T = 0;
        double C = 0.0f;
        double F = 0.0f;
        double X = 0.0f;
        try {
            Scanner in = new Scanner(new FileReader("B-small-attempt0.in"));
            BufferedWriter out = new BufferedWriter( new FileWriter("out.out") );
            
            T = in.nextInt();
            int testNumber = 0;
            for (testNumber = 1; testNumber <= T; testNumber++) {
                C = in.nextDouble();
                F = in.nextDouble();
                X = in.nextDouble();

                int factoryNumber = 0;
                double time = 0.0f, newTime = 0.0f;

                newTime = X / 2;
                do {
                    time = newTime;
                    factoryNumber++;
                    newTime = 0;
                    for (int i = 0; i < factoryNumber; i++) {
                        newTime += C / (2 + i * F);
                    }
                    newTime += X / (2 + factoryNumber * F);
                } while (newTime < time);
                String result = String.format("Case #%d: %.7f\n", testNumber, time);
                out.write(result);
            }
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
