package methodEmbedding.Cookie_Clicker_Alpha.S.LYD862;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieClickerAlpha {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int cases = Integer.parseInt(reader.readLine());
            for (int i=0; i<cases; i++) {
                String[] line = reader.readLine().split(" ");
                double c = Double.parseDouble(line[0]);
                double f = Double.parseDouble(line[1]);
                double x = Double.parseDouble(line[2]);

                double rate = 2;
                double seconds = 0;

                while (true) {
                    if (x <= c) {
                        seconds += x/rate;
                        break;
                    } else {
                        double seconds_no_buy = x/rate;
                        double seconds_before_buy = c/rate;
                        double seconds_after_buy = x/(rate+f);
                        if (seconds_no_buy < (seconds_before_buy+seconds_after_buy)) {
                            seconds += seconds_no_buy;
                            break;
                        } else {
                            seconds += seconds_before_buy;
                            rate += f;
                        }
                    }
                }
                System.out.println("Case #"+(i+1)+": "+seconds);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
