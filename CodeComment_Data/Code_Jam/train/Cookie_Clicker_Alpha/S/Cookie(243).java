package methodEmbedding.Cookie_Clicker_Alpha.S.LYD64;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Mwana-a-Mbuvi
 */
public class Cookie {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("C:/codejam/A-Small.txt"));
        int T = in.nextInt();
        double C,F,X;
        for (int i = 0; i < T; i++) {
            C = in.nextDouble();
            F = in.nextDouble();
            X = in.nextDouble();
            double rate = 2;
            double secs = 0.0;
            while(X/rate> (X/(rate+F)+C/rate)) {
                secs += C/rate;
                rate += F;
            }
            secs += X/rate;
            System.out.println("Case #"+(i+1)+": "+secs);
        }
    }
}
