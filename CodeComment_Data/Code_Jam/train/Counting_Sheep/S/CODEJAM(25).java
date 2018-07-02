package methodEmbedding.Counting_Sheep.S.LYD1064;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author aznch
 */
public class CODEJAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        int[] todo = new int[t];
        for (int i = 0; i < t; i++) {
            todo[i] = in.nextInt();
        }
        for (int i = 0; i < todo.length; i++) {
            int N = todo[i];
            ArrayList<Integer> digits = new ArrayList<>();
            int bN;
            int attempts = 0;
            while (digits.size() != 10 && attempts <= 100) {
                attempts++;
                bN = N * attempts;
                while (bN > 0) {
                    if (!digits.contains(bN % 10)) {
                        digits.add(bN % 10);
                    }
                    bN = bN / 10;
                }
            }

            if (digits.size() == 10) {
                System.out.println("Case #" + (i + 1) + ": " + N * attempts);
            } else {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            }

        }
    }

}
