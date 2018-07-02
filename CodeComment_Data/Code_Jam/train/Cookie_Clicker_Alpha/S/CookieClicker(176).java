package methodEmbedding.Cookie_Clicker_Alpha.S.LYD223;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ariantoanugerah on 12/4/14.
 */
public class CookieClicker {
    public static void main(String[] args) {
        Scanner sc = null;
        PrintWriter pw = null;
        String fileName = "CookieClicker/B-small-attempt0";

        try {
            sc = new Scanner(new File(fileName + ".in"));
            pw = new PrintWriter(new File(fileName + ".out"));

            int numOfTests = sc.nextInt();
            sc.nextLine();

            for (int i=0; i<numOfTests; i++) {
                double c = sc.nextDouble();
                double f = sc.nextDouble();
                double x = sc.nextDouble();

//                sc.nextLine();

                double r = 2.0;

                double currtime = x/r;
                double newtime = c/r + x/(r+f);

                int count=2;
                while (currtime > newtime) {
                    currtime = newtime;
                    newtime = 0;
                    for (int j = 0; j < count; j++) {
                        newtime += c/((j*f)+r);
                    }
                    newtime += x/((count*f)+r);
                    count++;
                }
                DecimalFormat df = new DecimalFormat("#.0000000");
                df.setRoundingMode(RoundingMode.HALF_UP);

                pw.println("Case #" + (i+1) + ": " + df.format(currtime));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (sc!=null) {
                sc.close();
            }
            if (pw!=null) {
                pw.close();
            }
        }
    }
}
