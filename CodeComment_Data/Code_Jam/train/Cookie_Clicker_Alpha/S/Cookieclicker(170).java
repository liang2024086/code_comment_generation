package methodEmbedding.Cookie_Clicker_Alpha.S.LYD314;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author scottso
 */
public class Cookieclicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        FileReader inFile = new FileReader("DATA1.txt");
        FileWriter outFile = new FileWriter("OUT1.txt");

        Scanner input = new Scanner(inFile);

        int cases;
        double C;
        double F;
        double X;
        double time = 0.0;
        double rate = 2.0;
        double curr;
        double next;

        cases = input.nextInt();


        for (int i = 0; i < cases; i++) {
            C = input.nextDouble();
            F = input.nextDouble();
            X = input.nextDouble();
            if (X == 2) {
                
                outFile.write("Case #" + (i + 1) + ": " + "1.00000000\n");
                System.out.println("1.0000000");

            } else if (X<2){
                time = X/rate;
                outFile.write("Case #" + (i + 1) + ": " + String.format("%.8f", time) + "\n");
            } else {


                curr = X / rate;

                next = C / rate + (X / (rate + F));

                while (curr > next) {

                    time += C / rate ;
                    rate += F;
                    curr = X / rate;
                    next = C / rate + (X / (rate + F));

                }

                time += curr;
                outFile.write("Case #" + (i + 1) + ": " + String.format("%.8f", time) + "\n");
            }
            
            System.out.printf("%.8f", time);
            System.out.println();
            time = 0.0;
            rate = 2.0;
        }


        inFile.close();
        outFile.close();
    }
}
