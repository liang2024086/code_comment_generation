package methodEmbedding.Cookie_Clicker_Alpha.S.LYD145;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("/home/leosha/Downloads/B-small-attempt0.in"));
        int t = s.nextInt();
        PrintWriter writer = new PrintWriter("out.txt", "UTF-8");
        for(int i = 1; i <= t; i++) {
            double c = s.nextDouble();
            double f = s.nextDouble();
            double x = s.nextDouble();

            double speed = 2;
            double timePassed = 0;

            while(x/speed > (c/speed + x/(speed+f)) ) {
                timePassed += c/speed;
                speed += f;
            }
            timePassed += x/speed;

            writer.println(String.format("Case #%d: %.7f",i , timePassed));
        }
        writer.close();
    }
}
