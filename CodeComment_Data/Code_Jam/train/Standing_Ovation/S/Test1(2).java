package methodEmbedding.Standing_Ovation.S.LYD253;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author mounir
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (BufferedReader br = new BufferedReader(new FileReader("input"))) {
            Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("/home/mounir/Desktop/google/ouput"), "utf-8"));
            String solution = null;
            //Number of Tests
            int T = Integer.parseInt(br.readLine());
            String line;
            for (int C = 1; C < T + 1; C++) {
                //The core of the solution
                line = br.readLine();
                String[] tab = line.split(" ");
                int Smax = Integer.parseInt(tab[0]);
                int cmp = 0;
                char[] t = tab[1].toCharArray();
                int pass = 0;
                int num;
                for (int i = 0; i < t.length; i++) {

                    num = Integer.parseInt(Character.toString(t[i]));
                    if (num > 0) {
                        if (pass + cmp < i) {
                            cmp += (i - pass -cmp);
                        }
                        pass = pass + num;
                    }

                }
                //Print Solution 
                writer.write("Case #" + C + ": " + cmp + "\n");
                //It depends if there is a CR or not !

            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
