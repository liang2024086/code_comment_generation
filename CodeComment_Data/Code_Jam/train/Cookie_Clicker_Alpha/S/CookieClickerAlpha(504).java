package methodEmbedding.Cookie_Clicker_Alpha.S.LYD164;


import java.io.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ashwinjain
 * Date: 12/04/14
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class CookieClickerAlpha {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("/Users/ashwinjain/Downloads/codejam/cookie_clicker_alpha_test.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("/Users/ashwinjain/Downloads/codejam/cookie_clicker_alpha_out.txt")));
        int cases = Integer.parseInt(br.readLine());

        for(int xx=0;xx<cases;xx++){
            String t[] = br.readLine().trim().split(" ");
            double c = Double.parseDouble(t[0]);
            double f = Double.parseDouble(t[1]);
            double x = Double.parseDouble(t[2]);

            int maxPurchase = (int) (x/c);
            double output = x/2;
            double min = x/2;
            for(int i=1;i<=maxPurchase;i++){
                output = output + ((c-x)/(2+(i-1)*f)) + (x/(2+i*f));
                if(output<min)
                    min=output;
            }

            bw.write(String.format("Case #%d: %.7f\n", (xx + 1), min));
            System.out.printf("Case #%d: %.7f\n", (xx + 1), min);
            bw.flush();

        }
        bw.close();

    }
}
