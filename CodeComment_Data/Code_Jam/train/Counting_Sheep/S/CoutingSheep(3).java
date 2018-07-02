package methodEmbedding.Counting_Sheep.S.LYD1635;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author langl
 */
public class CoutingSheep {

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(new FileReader("C:\\CoutingSheep\\A-small-attempt2.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\CoutingSheep\\A-small-attempt0.out"));
        try {
            int ntest = Integer.parseInt(sc.nextLine());

            for (int test = 1; test <= ntest; ++test) {
                String res = "INSOMNIA";

                int n = sc.nextInt();
                int[] t = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

                if (n != 0) {

                    int total = 0;
                    int c = 1;
                    int l = 1;
                    while (total < 10) {
                        l = n * c;
                        while (l != 0) {
                            t[l % 10] = 1;
                            l = l / 10;
                        }
                        total = 0;
                        for (int i = 0; i < 10; i++) {
                            total += t[i];
                        }
                        c++;
                    }
                    res = String.valueOf(n * (c - 1));
                }

                pw.print("Case #" + test + ": ");
                pw.print(res);
                pw.println();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            pw.close();
            sc.close();
        }
    }
}
