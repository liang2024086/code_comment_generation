package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1150;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author aznch
 */
public class CODEJAM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        String[] todo = new String[t];
        for (int i = 0; i < t; i++) {
            todo[i] = in.next();
        }
        for (int i = 0; i < todo.length; i++) {
            int flips = 0;
            String[] pancake = todo[i].split("");
            for (int j = 1; j < pancake.length; j++) {
                if (!pancake[0].equals(pancake[j])){
                    String replacement;
                    if (pancake[0].equals("-")){
                        replacement = "+";
                    }else{
                        replacement = "-";
                    }
                    for (int k = 0; k < j; k++){
                        pancake[k] = replacement;
                    }
                    flips++;
                }
            }
            if (pancake[0].equals("-")) {
                flips++;
            }
            System.out.println("Case #" + (i + 1) + ": " + flips);
        }

    }

}
