package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1472;

import java.io.*;
import java.util.*;
import java.math.*;

public class cookie_clicker_alpha {

    static Scanner in;
    static BufferedWriter out;


    public static void main(String[] args) throws IOException {
        
        in = new Scanner(new File("cookie_clicker_alpha.in"));
        out = new BufferedWriter(new FileWriter("cookie_clicker_alpha.out"));

        int length = in.nextInt();

        for (int test = 0; test < length; test++) {
            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();

            double current_speed = 2.0;
            double secs_total = 0;

            while (X/current_speed > C/current_speed + X/(current_speed + F)) {
                secs_total += C/current_speed;
                current_speed += F;
            }
            secs_total += X/current_speed;

            out.write("Case #" + (test + 1) + ": " + secs_total + "\n");
        }

        in.close();
        out.close();
    }

}    
