package methodEmbedding.Cookie_Clicker_Alpha.S.LYD913;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import qr1.QR1;

/**
 *
 * @author Chris
 */
public class QR2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("C:/cj/QR2/B-small-attempt1.in"));
            int cases = input.nextInt();
            PrintWriter output = new PrintWriter("C:/cj/QR2/output.txt", "UTF-8");
            
            //Problem variables
            double C, F, X, cps, time;
            double time1, time2, time3;
            
            for (int caseNum = 0; caseNum < cases; caseNum++) {
                C = input.nextDouble();
                F = input.nextDouble();
                X = input.nextDouble();
                cps = 2;
                time = 0;
                
                while (true) {
                    time1 = X/cps;
                    time2 = C/cps;
                    time3 = X/(cps + F);
                    if (time1 <= time2+time3) {
                        time += time1;
                        break;
                    }
                    else {
                        time += time2;
                        cps += F;
                    }
                }
                output.printf("Case #%d: %.7f\n", caseNum+1, time);
            }
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QR1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QR1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
