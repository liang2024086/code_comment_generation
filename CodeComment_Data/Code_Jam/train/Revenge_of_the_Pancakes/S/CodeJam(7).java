package methodEmbedding.Revenge_of_the_Pancakes.S.LYD915;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author huytt
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("input.in"));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        
        try (PrintWriter writer = new PrintWriter("output", "UTF-8")) {
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                int index = line.lastIndexOf("-");
                int count = 0;
                while(index != -1) {
                    char[] arrChars = line.toCharArray();
                    for (int j = 0; j <= index; j++) {
                        if (arrChars[j] == '-') {
                            arrChars[j] = '+';
                        } else {
                            arrChars[j] = '-';
                        }
                    }
                    line = new String(arrChars);
                    index = line.lastIndexOf("-");
                    count++;
                }
                
                writer.println("Case #" + (i + 1) + ": " + count);
            }
        }
    }
}
