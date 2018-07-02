package methodEmbedding.Cookie_Clicker_Alpha.S.LYD114;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

/**
 *
 * @author GIHAN
 */
public class Cookie {

    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new FileReader("E:/codejam/input.in"));
            FileWriter output = new FileWriter("E:/codejam/output.out");
            int cases = Integer.parseInt(input.readLine());
            DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
            for (int i = 0; i < cases; i++) {
                String[] s = input.readLine().split(" ");

                double c = Double.parseDouble(s[0]);
                double f = Double.parseDouble(s[1]);
                double x = Double.parseDouble(s[2]);
                double rate = 2;
                double totTime = 0;
                boolean flag = true;
                while (flag) {
                    if (x < c) {
                        totTime = x / rate;
                        flag = false;
                    } else {

                        if ((c / rate) + (x / (rate + f)) < (x / rate)) {
                            totTime += (c / rate);

                            rate += f;
                        } else {
                            totTime += (x / rate);
                            flag = false;
                        }

                    }

                }

                 output.write("Case #" + (i + 1) + ": " + df.format(totTime)+"\n");
               // System.out.println("Case #" + (i + 1) + ": " + df.format(totTime));
            }
            input.close();
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
