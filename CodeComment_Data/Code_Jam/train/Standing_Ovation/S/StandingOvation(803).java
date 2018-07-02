package methodEmbedding.Standing_Ovation.S.LYD489;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author R41f
 */
public class StandingOvation {

    public static void main(String[] a) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(new File("C:\\A-small-attempt1.in")));

            int N = Integer.parseInt(in.readLine());//N test cases
            for (int n = 1; n <= N; n++) {
                String[] inp = in.readLine().split(" ");
                int S = Integer.parseInt(inp[0]);
                int invited = 0, stood = 0;
                String s = inp[1];
                for (int k = 0; k <= S; k++) {
                    int numK = Character.getNumericValue(s.charAt(k));

                    if (numK > 0) {
                        if (stood < k) {
                            invited += k - stood;
                            stood += numK + invited;

                        } else {
                            stood += numK;

                        }
                    }
                }
                System.out.println("Case #" + n + ": " + invited);
            }
            in.close();
        } catch (Exception ex) {
            Logger.getLogger(StoreCredit.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
