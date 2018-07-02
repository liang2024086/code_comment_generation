package methodEmbedding.Counting_Sheep.S.LYD533;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Justin Lee
 */
public class Sleepingb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IndexOutOfBoundsException, FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\Justin Lee\\Dropbox\\NetBeansProjects\\sleepingb\\A-small-attempt0.in"));;
        int n = in.nextInt();
        boolean done;
        boolean[] digits = new boolean[10];
        int N, o, next, filler;
        PrintWriter fout = new PrintWriter("output.txt");

        a:
        for (int i = 0; i < n; i++) {
            done = false;
            Arrays.fill(digits, false);
            o = 1;
            N = in.nextInt();
            if (N == 0) {
                fout.printf("Case #%d: INSOMNIA\n", i+1);
                continue;
            }
            b:
            while (!done) {
                next = N * o;
                filler = next;
                o++;
                while (filler > 0) {
                    digits[filler % 10] = true;
                    filler /= 10;
                }
                for (int j = 0; j < digits.length; j++) {
                    if (!digits[j]) {
//                        fout.println(Arrays.toString(digits));
                        continue b;
                    }
                }
                done = true;
                fout.println("Case #" + (i+1) + ": " + next);
            }

        }
        fout.close();

    }

}
