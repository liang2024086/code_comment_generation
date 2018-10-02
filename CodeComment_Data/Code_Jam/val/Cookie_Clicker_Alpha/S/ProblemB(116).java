package methodEmbedding.Cookie_Clicker_Alpha.S.LYD471;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i;
        int T;
        double C, F, X, time, rate;
        double cookies;
        T = scan.nextInt();
        scan.nextLine();
        for(i=1; i<=T ; i++){
            C = scan.nextDouble();

            F = scan.nextDouble();

            X = scan.nextDouble();
            scan.nextLine();
            rate = 2;
            time = 0;
            System.out.print("Case #"+i+": ");
            cookies = 0;
            while(cookies != X) {
                if(C>=X){
                    time += X/rate;
                    cookies = X;
                }else if((X/(rate+F) + C/rate) < X/rate){
                    time += C/rate;
                    rate = rate + F;
                    cookies=0;
                } else {
                    time += X/rate;
                    cookies = X;
                }
            }
            time *= 10000000;
            time = Math.round(time);
            time /= 10000000;
            System.out.println(time);
        }
    }
}
