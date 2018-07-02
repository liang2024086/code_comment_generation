package methodEmbedding.Cookie_Clicker_Alpha.S.LYD800;


import java.util.Scanner;
public class CookieClickerAlpha {
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= T; ++i) {
            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();
            
            double time = 0.0;
            boolean won = false;
            int factories = 0;
            while (!won) {
                time = time + C/(2+F*factories);
                if (X/(2+F*(factories+1)) < (X-C)/(2+F*factories)) {
                    ++factories;  
                }
                else {
                    time = time + (X-C)/(2+F*factories);
                    won = true;
                    System.out.println("Case #"+i+": "+time);
                }
            
            }
        }
    }
}
