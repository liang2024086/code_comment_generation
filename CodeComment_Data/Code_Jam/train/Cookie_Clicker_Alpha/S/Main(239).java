package methodEmbedding.Cookie_Clicker_Alpha.S.LYD728;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            double ans = 0.0d;
            double c = sc.nextDouble();//farm
            double f = sc.nextDouble(); //rate increment
            double x = sc.nextDouble(); //goal
            double rate = 2.0d;
            //function = (goal+farm*var)/(rate*var+2)           
            double timeSpent = 0;
            double prev = 0.0d;
            double next = x / rate;
            ans = next;
            int j = 1;
            while(prev==0.0d || prev > next) {
                timeSpent += c / rate;
                rate += f;
                double temp = timeSpent + (x)/(rate);                
                prev = next;
                next = temp;
                if(next <= prev)    {
                    ans = next;
                }
                j++;
            }
            System.out.printf("Case #%d: %f\n", i, ans);
        }
    }
}
