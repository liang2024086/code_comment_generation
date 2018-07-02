package methodEmbedding.Standing_Ovation.S.LYD1096;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Aditya
 */
public class CodeJam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String inPath = "e://A-small-attempt0.in";
        String outPath = "output.txt";

        File inFile = new File(inPath);
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        File outFile = new File(outPath);
        FileWriter fw = new FileWriter(outPath);
        BufferedWriter bw = new BufferedWriter(fw);

        //Variables 
        int t = Integer.parseInt(br.readLine());
        int smax;
        String nset;
        StringTokenizer st;

        //For each case
        for (int i = 0; i < t; ++i) {

            st = new StringTokenizer(br.readLine(), " ");

            smax = Integer.parseInt(st.nextToken());
            nset = st.nextToken();

            int sett[] = new int[smax + 1];

            for (int j = 0; j < smax + 1; ++j) {

                sett[j] = Integer.parseInt(String.valueOf(nset.charAt(j)));

            }
            int sum = sett[0], c = 0;
            for (int j = 1; j < smax + 1; ++j) {
                if (sum < j) {
                    c++;
                    sum++;
                }
                sum = sum + sett[j];

            }

            bw.write("Case #" + (i + 1) + ": " + c);
            bw.newLine();
        }

        bw.close();
    }

}
