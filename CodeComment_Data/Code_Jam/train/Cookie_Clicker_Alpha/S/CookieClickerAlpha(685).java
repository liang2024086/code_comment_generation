package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1379;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Will on 11-Apr-14.
 */
public class CookieClickerAlpha {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out;

    public static void main(String[] args) throws FileNotFoundException {
        out = new PrintWriter(new File("2.out"));
        int cases = in.nextInt();
        in.nextLine();
        for(int tt = 1; tt <= cases; tt ++){
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            in.nextLine();
            double r = 2;
            double time = 0;
            double plain = 0, build = 0;
            do{
                plain = x / r;
                build = x / (f + r) + c / r;
                if (plain <= build){
                    time += plain;
                    out.printf("Case #%d: %f\n", tt, time);
                }else{
                    time += (c / r);
                    r += f;
                }
            }while(plain > build);
        }
        out.close();
        in.close();
    }
}
