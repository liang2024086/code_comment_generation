package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1309;

import java.util.Scanner;
import java.util.*;
import java.lang.Math;
public class ProblemBGoogle
{

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int x = 0; x < cases; x++) {
            double c = sc.nextDouble();
            double f = sc.nextDouble();
            double done = sc.nextDouble();
            double speed = 2.0;
            boolean finished = false;
            int numPurchase = (int)(done/c);
            double fastest = Double.MAX_VALUE;
            for( int z = 0; z < numPurchase + 1; z++) {
                double time = 0.0;
                for(int y = 0; y < z ; y++) {
                    time = time + c/((y * f) + 2.0);
                }
                time = time + done/((z * f ) + 2.0);
                if(time < fastest) {
                    fastest = time;
                }
            }
            System.out.printf("Case #" + (x + 1) + ": %1$.7f\n", fastest);
        }

    }

}
