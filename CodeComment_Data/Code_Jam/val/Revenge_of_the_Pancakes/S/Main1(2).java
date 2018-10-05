package methodEmbedding.Revenge_of_the_Pancakes.S.LYD340;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Uday Kandpal
 */
public class Main1 {

    public static void main(String[] args) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br = new BufferedReader(new FileReader(new File("b_small.in")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("b_small.out")));
        int t = Integer.parseInt(br.readLine());
        for (int caseT = 1; caseT <= t; caseT++) {
            bw.write("Case #" + caseT + ": ");
            char x[] = br.readLine().trim().toCharArray();
            int minus = 0, plus = 0;
            int i = 0;
            int count = 0;
            for (i = 0; i < x.length; i++) {
                char xi = x[i];
                if (xi == '+') {
                    if (plus == 0 && minus != 0) {
                        count++;
                        plus = i + 1;
                        minus = 0;
                        for (int j = 0; j <= i; j++) {
                            x[j] = '-';
                        }
                    }
                    plus++;
                } else {
                    if (plus != 0 && minus == 0) {
                        minus = i + 1;
                        plus = 0;
                        count++;
                        for (int j = 0; j <= i; j++) {
                            x[j] = '+';
                        }
                    }
                    minus++;
                }

            }
            if (plus == 0) {
                for (i = 0; i < x.length; i++) {
                    x[i] = '+';
                }
                count++;
            }
            bw.write(count + "\n");
        }
        bw.close();
        br.close();
    }
}
