package methodEmbedding.Standing_Ovation.S.LYD437;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author wpower
 */
public class StandingO {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fn = args[0];
        File in = new File(fn);

        Scanner read = new Scanner(in);
        Integer t = read.nextInt();
        Integer s, total, count;
        String shylist;
        Integer[] audience = new Integer[1000];

        BufferedWriter write = new BufferedWriter(new FileWriter(fn + "out"));

        //while( read.hasNextLine() ){          
        for (int i = 0; i < t; i++) {
            read.nextLine();
            s = read.nextInt();
            shylist = read.next();
            total = 0;
            count = 0;

            write.write("Case #" + (i + 1) + ": ");
            for (int a = 0; a < s + 1; a++) {
                audience[a] = Character.getNumericValue(shylist.charAt(a));

                if (total >= a) {
                    total += audience[a];
                } else {
                    while (total < a) {
                        count++;
                        total++;
                    }
                    total += audience[a];
                }
            }
            write.write("" + count);

            write.newLine();
        }
        write.close();
        read.close();
        System.out.println("Hi");
    }
}
