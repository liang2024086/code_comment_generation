package methodEmbedding.Standing_Ovation.S.LYD1542;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JY
 */
public class CodeJamQual2015A {

    public static void main(String[] args) throws IOException {

        String output = "";
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\JY\\Google Drive\\Coding\\CodeJamQual2015A\\A-small-attempt1.in"))) {
            int T = Integer.valueOf(br.readLine());
            for (int i = 0; i < T; i++) {
                String[] input = br.readLine().split(" ");
                int Smax = Integer.valueOf(input[0]);
                int[] Ks = new int[Smax + 1];
                for (int j = 0; j < Ks.length; j++) {
                    Ks[j] = Integer.valueOf(input[1].substring(j, j + 1));
                }
                int standUps = 0;
                int extras = 0;
                for (int j = 0; j < Ks.length; j++) {
                    if (standUps >= j) {
                        standUps += Ks[j];
                    }
                    if (j == Ks.length - 1) {
                        if (standUps < Smax) {
                            extras++;
                            Ks[0]++;
                            standUps = 0;
                            j = -1;
                        }
                    }
                }
                output += "Case #" + String.valueOf(i + 1) + ": " + extras + "\n";
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\JY\\Google Drive\\Coding\\CodeJamQual2015A\\A-small-attempt1.out"))) {
            bw.write(output);
        }
    }
}
