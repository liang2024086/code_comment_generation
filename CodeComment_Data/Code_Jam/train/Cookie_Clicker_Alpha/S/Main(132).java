package methodEmbedding.Cookie_Clicker_Alpha.S.LYD712;

import java.util.*;
import java.io.*;

/**
 *
 * @author hynek
 */
public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader("B.in"));
        PrintWriter out = new PrintWriter(new File("B.out"));
        
        int t = Integer.parseInt(rd.readLine());
        for(int y = 1; y <= t; y++){
            double c, f, x;
            String[] s = rd.readLine().split(" ");
            c = Double.parseDouble(s[0]);f = Double.parseDouble(s[1]);
            x = Double.parseDouble(s[2]);
            
            double rate = 2d;
            double time = 0d;
            
            while((x / rate) > (c / rate) + (x / (rate + f))){
                time += (c / rate);
                rate += f;
            }
            time += (x / rate);
            out.printf(Locale.ENGLISH, "Case #%d: %.7f\n", y, time);
        }
        out.flush();
    }
    
}
