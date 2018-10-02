package methodEmbedding.Standing_Ovation.S.LYD838;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by b4dt0bi on 11.04.15.
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line = bufferedReader.readLine();
        int tcs = Integer.parseInt(line);
        for (int tc = 0; tc < tcs; tc++) {
            String data[] = bufferedReader.readLine().split(" ");
            int temp = 0;
            int friends = 0;
            for (int i = 0; i <= Integer.parseInt(data[0]); i++) {
                if (temp < i) {
                    friends += i - temp;
                    temp = i;
                }
                temp += Integer.parseInt("" + data[1].charAt(i));
            }
            System.out.println("Case #" + (tc + 1) + ": " + friends);
        }
        bufferedReader.close();
    }
}
