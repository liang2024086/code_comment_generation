package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1593;

import java.util.Scanner;

public class QRB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double c = sc.nextDouble();
            double f = sc.nextDouble();
            double x = sc.nextDouble();

            double r = 2;
            double ct = 0;
            while (true){
                double tcr = x/r;
                double buy = c/r + x/(r+f);
                if(tcr<buy){
                    ct+=tcr;
                    break;
                } else {
                    ct += c/r;
                    r+=f;
                }
            }
            System.out.println("Case #"+(i+1)+": "+ct);
        }
    }
}
