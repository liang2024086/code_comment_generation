package methodEmbedding.Cookie_Clicker_Alpha.S.LYD197;

import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0000000");
        int cases = sc.nextInt();
        int c = 1;
        while(c <= cases) {
            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();
            double P = 2.0;
            double sum = 0.0;
            double best = X / P;
            
            while(true) {
                sum += C / P;
                P += F;
                double temp = sum + X / P;
                if(temp > best) break;
                else            best = temp;
            }
            
            System.out.println("Case #" + (c++) + ": " + df.format(best));
        }
    }
}
