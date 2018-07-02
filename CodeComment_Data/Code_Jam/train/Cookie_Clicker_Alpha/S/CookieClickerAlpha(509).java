package methodEmbedding.Cookie_Clicker_Alpha.S.LYD184;


import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Ratheeshkv
 */
public class CookieClickerAlpha {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        //double time = 0, left = 0, right = 0, rate = 2.0, newrate = 0, Left = 0, Right = 0, pleft = 0;
        String[] input = new String[3];
        if (testCases >= 1 && testCases <= 100) {
            for (int i = 1; i <= testCases; i++) {
                double time = 0, left = 0, right = 0, rate = 2.0, newrate = 0, Left = 0, Right = 0, pleft = 0, left1 = 0, right1 = 0;

                input = scan.nextLine().split(" ");
                Left = Double.parseDouble(input[0]);
                if (!(Left >= 1 && Left <= 500)) {
                    System.out.print("\nInvalid Input!");
                    System.exit(0);
                }
                newrate = Double.parseDouble(input[1]);
                if (!(newrate >= 1 && newrate <= 4)) {
                    System.out.print("\nInvalid Input!");
                    System.exit(0);
                }
                Right = Double.parseDouble(input[2]);
                if (!(Right >= 1 && Right <= 2000)) {
                    System.out.print("\nInvalid Input!");
                    System.exit(0);
                }

                //System.out.print("\n" + Left + " " + newrate + " " + Right);
                time = 0;
                left = Left / rate;
                right = Right / rate;
                if (right <= left) {
                    time = right;
                } else {
                    //System.out.print("\n" + left + " " + rate + " " + right);
                    rate = rate + newrate;
                    left1 = Left / rate;
                    right1 = Right / rate;

                    while (right > (right1 + left)) {
                        //System.out.print("\n" + left1 + " " + rate + " " + right1);
                        time = time + left;
                        left = left1;
                        right = right1;
                        rate = rate + newrate;
                        left1 = Left / rate;
                        right1 = Right / rate;

                    }
                    time = time + right;
                }
                //time=Math.round(time * 10000000) / 10000000;
                //System.out.print("\nCase #" + i + ": " + time);
                //System.out.print(Math.round(time * 10000000) / 10000000);


                DecimalFormat df = new DecimalFormat("#.0000000");
                System.out.print("\nCase #" + i + ": " + df.format(time));

            }
        }
    }
}
