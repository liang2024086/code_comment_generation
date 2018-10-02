package methodEmbedding.Cookie_Clicker_Alpha.S.LYD772;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mancha
 */
public class cookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedWriter write = new BufferedWriter(new FileWriter("src/cookie.out"));
        short T;
        int i;
        double C, F, X, oSeg = 0, nSeg = 0, cSeg = 0;
        double cps = 2;
        Scanner leer = new Scanner(new File("src/B-small-attempt0.in"));
        T = leer.nextShort();
        for (i = 0; i < T; i++) {
            nSeg=0;
            cSeg=0;
            oSeg=0;
            cps=2;
            //System.out.print("Case #"+(i+1)+": ");
            C = leer.nextDouble();
            F = leer.nextDouble();
            X = leer.nextDouble();
            //Calcular tiempo
            nSeg = X / cps;
            do {
                oSeg = nSeg;
                cSeg += (C / cps);
                cps+=F;
                nSeg = cSeg + (X / cps);
                //oSeg=nSeg;
//                System.out.println(oSeg);
            } while (oSeg > nSeg);
            //System.out.println(oSeg);
            write.write("Case #"+(i+1)+": "+oSeg+"\n");
            //System.out.println("Nseg " + nSeg);
        }
        write.close();
    }

}
