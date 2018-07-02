package methodEmbedding.Cookie_Clicker_Alpha.S.LYD573;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author narok119
 */
public class Cookie {

    public static void main(String args[]) throws Exception {
        int caseCount = 1;
        BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/narok119/Desktop/B-small-attempt2.in")));
        String txt = reader.readLine();
        while ((txt = reader.readLine()) != null) {
            String[] txts = txt.split(" ");
            double c = Double.parseDouble(txts[0]);
            double f = Double.parseDouble(txts[1]);
            double x = Double.parseDouble(txts[2]);

            double rate = 2.0;

            double timeUsed = 0.0;
            double lastTime = Double.MAX_VALUE;
            while (true) {
                double took = timeUsed + (x / rate);
                if (lastTime <= took) {
                    break;
                }
                lastTime = took;
                timeUsed += (c / rate);
                rate += f;
            }
            System.out.print("Case #" + (caseCount++) + ": ");
            System.out.format("%.7f", timeUsed + (x / rate) < lastTime ? timeUsed + (x / rate) : lastTime);
            System.out.println();

        }
    }
}
