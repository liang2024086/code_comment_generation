package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1166;


import java.text.DecimalFormat;
import java.util.Scanner;

public class CookieClickerAlpha {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.0000000");
        
        int T = Integer.parseInt(sc.next());
        double O[] = new double[T];
        
        for (int i = 0; i < T; i++) {
            
            double S = 2.0;
            double C = Double.parseDouble(sc.next());
            double F = Double.parseDouble(sc.next());
            double X = Double.parseDouble(sc.next());
            double M = X;
            
            for (int k = 1; ; k++) {
                int max = k;
                double a[] = new double[max];
                for (int j = 0; j < max - 1; j++) {
                    a[j] = C / (S + (F * j));
                }
                a[max - 1] = X / (S + (F * (max - 1)));

                double t = 0.0;
                for (int j = 0; j < max; j++) {
                    t += a[j];
                }
                if (t < M) {
                    M = t;
                } else {
                    break;
                }
            }
            
            O[i] = M;
        }
        
        for (int i = 0; i < T; i++) {
            System.out.println("Case #" + (i + 1) + ": " + df.format(O[i]));
        }
    }
}
