package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1440;

import java.util.*;
public class cookie_clicker {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int runs = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < runs; i++){
            String[] inputs = sc.nextLine().split(" ");
            double c = Double.parseDouble(inputs[0]);
            double f = Double.parseDouble(inputs[1]);
            double x = Double.parseDouble(inputs[2]);
            double time = 0, time1 = 0, time2 = 1, rate = 2d;
            time1 = x/rate;
            while (true){
                double in = c/rate, newrate = rate+f, more = x/newrate;
                time2 = in + more;
                if (time1 < time2){
                    String number = Double.toString(time+time1);
                    System.out.println("Case #" + (i+1) + ": " + (time + time1));
                    break;
                }
                else{
                    time+= in;
                    rate = newrate;
                    time1 = more;
                }
            }
        }
    }
}
