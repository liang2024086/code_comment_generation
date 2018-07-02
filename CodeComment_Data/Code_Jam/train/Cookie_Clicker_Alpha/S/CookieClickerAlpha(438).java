package methodEmbedding.Cookie_Clicker_Alpha.S.LYD621;



import java.util.Scanner;

public class CookieClickerAlpha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();

            int n = 0;

            double tm = 0;

            if (x > c) {

                while (x / (2 + (n + 1) * f) < (x-c) / (2 + n * f)) {
                    tm += c / (2 + n * f);
                    n++;
                }

            }

            tm += x / (2 + n * f);

//            System.out.println(tm);
            
            sb.append("Case #" + t + ": " + tm + "\n");

        }
        
        System.out.println(sb.toString());

    }
}
