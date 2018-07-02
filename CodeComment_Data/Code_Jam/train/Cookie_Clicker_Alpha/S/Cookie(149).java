package methodEmbedding.Cookie_Clicker_Alpha.S.LYD309;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Praneeth
 */
public class Cookie {

    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("out.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner sc = new Scanner(new File("test.txt"));
            int cases = Integer.valueOf(sc.nextLine());
            for (int i = 0; i < cases; i++) {
                double c = sc.nextDouble();
                double f = sc.nextDouble();
                double x = sc.nextDouble();

                double currentRate = 2;
                double currentTime = 0;
                double currentCookies = 0;

                double rounds = x / c;

                for (double j = 0; j < rounds; j++) {

                    double wait = (x - currentCookies) / currentRate;
                    double buy = c / (currentRate) + (x - currentCookies) / (currentRate + f);

                    if (buy < wait) {
                        // then buy it
                        //System.out.println("Buy");
                        currentCookies = 0;
                        currentTime += c / currentRate;
                        currentRate += f;
                        //System.out.println("Time " + currentTime);
                    } else {
                        // don't buy
                        // System.out.println("Wait");
                        currentCookies += c;
                        currentTime += wait;
                        bw.write("Case #" + (i + 1) + ": " + currentTime);
                        bw.newLine();
                        break;
                    }

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
//result = new String[T];
//       outer:
//       for (int i = 0; i < T; i++) {
//           double toBuy = C[i] / 2.0;
//           double currentMultiplier = 2.0;
//           double currentCookies = 0.0;
//           double currentTime = 0.0;
//           for (int j = 0; j < X[i] / C[i]; j++) {
//               double notBuy = ((X[i] - currentCookies) / currentMultiplier) + currentTime;
//               double buy = currentTime + (C[i] / (currentMultiplier)) + ((X[i] - currentCookies) / (currentMultiplier + F[i]));
//               if (buy < notBuy) {
//                   currentTime+=C[i] / (currentMultiplier);
//                   currentMultiplier += F[i];
//               } else {
//                   currentTime=notBuy;
//                   result[i] = Double.toString(currentTime);
//                   continue outer;
//               }
//
//           }
//
//       }

