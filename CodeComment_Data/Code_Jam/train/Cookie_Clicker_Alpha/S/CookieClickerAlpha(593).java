package methodEmbedding.Cookie_Clicker_Alpha.S.LYD969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieClickerAlpha {

    public static void main(String[] args) {
        String line;
        String[] temp;
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        int cases = -1, case_ind = 1;
        double c, f, x, num, rate, catchup, time;
        while (true) {
            try {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                if (line.isEmpty()) {
                    continue;
                }
                if (cases < 0) {
                    cases = Integer.parseInt(line);
                } else {
                    temp = line.split("\\s+");
                    c = Double.parseDouble(temp[0]);
                    f = Double.parseDouble(temp[1]);
                    x = Double.parseDouble(temp[2]);
                    num = 0;
                    time = 0;
                    rate = 2;
                    catchup = c / f;
                    while ((x - c) / rate >= catchup) {
                        time += c / rate;
                        rate += f;
                    }
                    time += (x - num) / rate;
                    System.out.printf("Case #%d: %.7f\n", case_ind, time);
                    case_ind += 1;
                }
            } catch (IOException e) {
                System.exit(1);
                return;
            }
        }
        System.out.print("\n");
    }
}
