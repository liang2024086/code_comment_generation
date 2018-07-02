package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1217;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class CookieClickerAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            String[] line = br.readLine().split(" ");

            double c = Double.parseDouble(line[0]);
            double f = Double.parseDouble(line[1]);
            double x = Double.parseDouble(line[2]);

            double cps = 0;
            double nextcps = 2.0;
            double curr, next;
            double time = 0;
            double nextfarm = 0;

            do {

                cps = nextcps;

                curr = time + (x / cps);

                nextfarm = c / cps;
                nextcps = cps + f;
                next = time + nextfarm + (x / nextcps);

                if (next < curr) {
                    time += nextfarm;
                }
            } while (next < curr);

            System.out.println(
                    "Case #"
                    + (i + 1)
                    + ": "
                    + curr
            );

        }//End test cases
    }

}
