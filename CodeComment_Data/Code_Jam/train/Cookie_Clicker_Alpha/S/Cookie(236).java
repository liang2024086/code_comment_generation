package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1141;

import java.util.*;
import java.io.*;

public class Cookie {
    static BufferedReader br;
    static BufferedWriter bw;
    static int t;
    static double c, f, x;

    public static void main(String[] args) {
        try {
            br = new BufferedReader(new FileReader("B-small-attempt0.in"));
            bw = new BufferedWriter(new FileWriter("output.txt"));
            t = Integer.parseInt(br.readLine());
            for (int i = 1; i <= t; i++) {
                double seconds = 0, cookies = 0, rate = 2;
                boolean buy = true;
                String[] array = br.readLine().split(" ");
                c = Double.parseDouble(array[0]);
                f = Double.parseDouble(array[1]);
                x = Double.parseDouble(array[2]);

                while (true) {
                    if (buy && cookies >= c) { //if we can purchase farm
                        if (x/(f+rate) < (x-cookies)/rate) { //faster time possible
                            //purchase farm
                            rate += f;
                            cookies = 0;
                        } else { //no faster time possible by purchasing farm so no need to keep checking
                            buy = false;
                        }
                    }
                    if (buy && c < x) {
                        seconds += (c - cookies)/rate;
                        cookies = c;
                    } else {
                        seconds += (x - cookies)/rate;
                        cookies = x;
                        bw.write("Case #"+i+": "+seconds);
                        bw.newLine();
                        break;
                    }

                }
            }
            bw.close();
            br.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
