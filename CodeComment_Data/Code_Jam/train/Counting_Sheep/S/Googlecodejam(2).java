package methodEmbedding.Counting_Sheep.S.LYD740;

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

/**
 *
 * @author Paris
 */
public class Googlecodejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
         BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
        int T = Integer.parseInt(in.readLine());

        boolean[] num_seen = new boolean[10];
        int found;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(in.readLine());
            
            if(N==0){
                out.append("Case #"+(i+1)+": INSOMNIA"+"\n");
            }
            else{
            
            for (int n = 0; n < 10; n++) {
                num_seen[n] = false;
            }
            found = 0;
            int counter = 1;
            int finalnum;
            while (found<10) {
                int tempint_prediv = counter * N;
                while (tempint_prediv > 0) {
                    int tempint_aftdiv = tempint_prediv / 10;
                    int digit = tempint_prediv - tempint_aftdiv * 10;
                    if (num_seen[digit] == false) {
                        num_seen[digit] = true;
                        found++;
                    }
                tempint_prediv=tempint_aftdiv;
                }
                counter++;
                
            }
             out.append("Case #"+(i+1)+": "+ (counter-1) * N+"\n");
            }

        }
        out.close();

    }

}
