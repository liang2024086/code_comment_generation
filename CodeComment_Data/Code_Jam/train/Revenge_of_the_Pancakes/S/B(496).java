package methodEmbedding.Revenge_of_the_Pancakes.S.LYD149;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import aa_google_test.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thavihaz
 */
public class B {

    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        B obj = new B();

        try {
            String pathInput = "B-small-attempt0.in";
            String pathOutput = "Output.txt";
            reader = new BufferedReader(new FileReader(pathInput));
            writer = new BufferedWriter(new FileWriter(pathOutput));
            String output = null;
            int t = Integer.parseInt(reader.readLine()); //No. of test cases
            for (int i = 1; i < t + 1; i++) {
                StringBuilder line = new StringBuilder(reader.readLine()); //Stack of pancakes
                int flipCount = 0;
                for (int j = line.length() - 1; j > -1; j--) {
                    String digit = line.substring(j, j + 1);
                    if (digit.equals("-")) {
                        for (int k = 0; k < j + 1; k++) {
                            if(line.charAt(k)=='+'){
                                line.setCharAt(k, '-');
                            }else{
                                line.setCharAt(k, '+');
                            }                            
                        }
                        flipCount++;
                    }
                }
                output = "Case #" + i + ": " + flipCount;
                writer.write(output);
                writer.newLine();
            }
            writer.close();
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
