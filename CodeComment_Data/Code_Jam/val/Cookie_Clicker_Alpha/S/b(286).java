package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1019;

/**
 * Created by oscar on 11-04-14.
 */
import java.util.Scanner;

public class b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int i = 0; i < cases; i++){
            double c = scan.nextDouble();
            double f = scan.nextDouble();
            double x = scan.nextDouble();

            double[] costOfCookies = new double[1000000];
            double[] totalCost = new double[100000];
            costOfCookies[0] = 0;
            int j = 1;
            totalCost[0] = x / 2;
            costOfCookies[0] = 0;
//            System.out.println("first cost no cookies "+totalCost[0]);
            totalCost[1] = c/2 + x/(2+f);
            costOfCookies[1] = c / 2;
//            System.out.println("Second cost 1 cookies "+totalCost[1]);
            while(totalCost[j-1] > totalCost[j]){
                j++;
                double cookieRate = c/(2 + f * (j-1));
//                System.out.println("cost of one more cookie: "+cookieRate);
                costOfCookies[j] = costOfCookies[j-1] + cookieRate;
//                System.out.println("added cost of cookies: "+costOfCookies[j]);
                totalCost[j] = costOfCookies[j] + x/(2 + f * j);
//                System.out.println("total cost: "+totalCost[j]);
            }
            System.out.printf("Case #"+(i+1)+": %.7f\n", totalCost[j-1]);
        }
    }
}
