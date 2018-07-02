package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1615;

import java.io.File;
import java.util.Scanner;
public class Cookies {
    public static void main(String[] args) {
        try {
        Scanner in = new Scanner(new File(args[0]));
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            System.out.print("Case #" + (t+1) + ": "); 
            // read input
            double C = in.nextDouble();  // cookies for a farm
            double F = in.nextDouble();  // extra cookies per second
            double X = in.nextDouble();  // cookies to win
            // calculate 
            double time = 0; 
            double v = 2.0;   // original cookies per second
            double tx = X / v;   // time to make X cookies
            double tc = C / v;   // time to make a farm
            double tcx = X / (v + F);   // time to make X cookies with a farm
            while (tx > tc + tcx) {     // more efficient with a farm
                time += tc;   // make a farm
                v += F; 
                // recalculate time needed
                tx = X / v; 
                tc = C / v; 
                tcx = X / (v + F);
            }
            // more efficient without a farm
            time += tx;
            System.out.println(time); 
        }
        } catch (java.io.FileNotFoundException e){}
    }
}
