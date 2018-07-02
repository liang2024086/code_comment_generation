package methodEmbedding.Cookie_Clicker_Alpha.S.LYD67;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Hemang Jangle
 */
public class CookieClicker {

    static BufferedReader in;
    static PrintWriter out;
    static int numCases;
    static double c;
    static double f;
    static double x;
    static double speed;

    public static void main(String[] args) throws IOException {

        in = new BufferedReader(new FileReader("cookieClicker.in"));
        out = new PrintWriter(new FileWriter("cookieClicker.out"));


        speed = 2;
        numCases = Integer.parseInt(in.readLine());



        for (int i = 1; i <= numCases; i++) {
            speed = 2;
            StringTokenizer st = new StringTokenizer(in.readLine());
            c = Double.parseDouble(st.nextToken());
            f = Double.parseDouble(st.nextToken());
            x = Double.parseDouble(st.nextToken());


            double time = x / speed;
            boolean done = false;

            while (!done) {
                speed += f;
                System.out.println("time1: "  + time);
                double oldTime = time;
                time -= x / (speed - f);
                time += c / (speed - f);
                time += x / (speed);
                System.out.println(time);
                if (oldTime < time) {
                    done = true;
                    time = oldTime;
                    System.out.println("");
                }
            }
            
            out.println("Case #" + i + ": " + time);
            
            



        }









        /*
         * for(int i = 1; i <= numCases; i++){ StringTokenizer st = new
         * StringTokenizer(in.readLine()); c =
         * Double.parseDouble(st.nextToken()); f =
         * Double.parseDouble(st.nextToken()); x =
         * Double.parseDouble(st.nextToken()); out.println("Case #" + i + ": " +
         * evaluateTime()); }
         */
        out.close();
        System.exit(0);




    }
    /*
    public static double evaluateTime() {

        double time = 0;

        int i = 1;
        boolean done = false;
        while (!done) {
            if (i < (c * f + c * speed + f * x) / (c * f)) {
                done = true;
            }
        }
        time = x / (speed + i * f) + summation(i - 1);

        return time;


    }

    public static double summation(int high) {
        double sum = 0;
        for (int i = 0; i <= high; i++) {
            sum += c / (speed + i * f);
        }
        return sum;
    }
    * */
    
}
