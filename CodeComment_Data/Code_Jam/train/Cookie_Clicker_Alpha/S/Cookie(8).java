package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1619;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abhishek
 */
public class Cookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
        if (reader.ready()) {
            int testCases = Integer.parseInt(reader.readLine());

            for (int testCase = 1; testCase <= testCases; testCase++) {

                double C, F, X, rate, actual = 0, estimate, newRate,oldRate=0,total = 0;

                String[] values = reader.readLine().split(" ");
                C = Double.parseDouble(values[0]);
                F = Double.parseDouble(values[1]);
                X = Double.parseDouble(values[2]);

                rate = 2;

                newRate = F + rate;

                actual = X / rate;

                estimate = C / rate + X / newRate;

                while (true) {
                    if (estimate < actual) {
                        total += C / rate;
                        oldRate=rate;
                        rate = newRate;
                        actual = X / rate;
                        newRate = newRate + F;
                        estimate = C / rate + X / newRate;
                    } else {
                        total+=actual;
                        break;
                    }
                }
                
                System.out.printf("Case #%d: %.7f\n",testCase,total);

            }

        }
    }

}
