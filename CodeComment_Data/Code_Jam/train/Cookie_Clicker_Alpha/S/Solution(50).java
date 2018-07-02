package methodEmbedding.Cookie_Clicker_Alpha.S.LYD632;

/**
 * Created by uttam on 4/12/14.
 */

import java.util.Scanner;
public class Solution2 {
    public static void main(String []args){

        Scanner Scan = new Scanner(System.in);
        int i, t, count;
        double C, F, X, N, time1, time2, timeX;

        t = Scan.nextInt();

        for(i=0; i<t; i++)
        {
            C = Scan.nextFloat();
            F = Scan.nextFloat();
            X = Scan.nextFloat();

            N = 2+F;
            timeX = C/2;
            time1 = X/2;
            time2 = timeX + (X/N);

            count =0;
            while( time2 < time1 )
            {
                timeX += (C/N);
                count++;
                N = 2+(count+1)*F;
                time1 = time2;
                time2 = timeX + (X/N);
            }

            System.out.println("Case #"+(i+1)+ ": "+ time1);
        }
    }
}
