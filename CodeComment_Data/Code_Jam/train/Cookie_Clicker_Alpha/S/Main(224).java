package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1072;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Date: 4/12/14
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String path = args[0];

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            CookieClickerAlpha cookieClickerAlpha = new CookieClickerAlpha();
            int numInputs = Integer.parseInt(br.readLine());

            for (int i = 0; i < numInputs; i++) {
                String[] lineComponents = br.readLine().split(" ");

                System.out.println(String.format("Case #%d: %.7f",
                        i + 1, cookieClickerAlpha.getTime(
                            Double.parseDouble(lineComponents[0]),
                            Double.parseDouble(lineComponents[1]),
                            Double.parseDouble(lineComponents[2])
                        )
                        ));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
