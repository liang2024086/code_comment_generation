package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1131;


import java.util.Scanner;


public class CookieClicker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        double c,f,x,tt1,tt2, cps,ttemp;
        
        
        for(int i = 0; i < t; i++) {
            ttemp = 0;
            cps = 2;
            c = s.nextDouble();
            f = s.nextDouble();
            x = s.nextDouble();
            tt1 = x / cps;
            
            while(true) {
                ttemp += c / cps;
                cps += f;
                tt2 = x / cps;
                if (ttemp + tt2 > tt1) {
                    break;
                } else {
                    tt1 = ttemp + tt2;
                }
            }
            
            System.out.printf("Case #%d: %.7f\n",(i + 1),tt1);
        }
        
    }
}
