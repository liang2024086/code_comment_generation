package methodEmbedding.Standing_Ovation.S.LYD613;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.jmx.snmp.BerDecoder;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Tahir
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream wao = new FileInputStream(new File("input"));
        FileWriter out = new FileWriter(new File("output"));
        Scanner in = new Scanner(wao);
        String buffer;
        int cases;
        int ctr = 1;
        int smax;
        int friends, standing;
        String si;
        int[] shy;
        buffer = in.nextLine();
        cases = Integer.parseInt(buffer);
        while (ctr <= cases) {
            buffer = in.next();
            smax = Integer.parseInt(buffer);
            si = in.nextLine().substring(1);
            int i;
            //int factor = 1;
            shy = new int[smax+1];
            for (i = 0; i < shy.length; i++) {
                /*
                if ((i / factor) >= 10) {
                    factor *= 10;
                }
                
                if (si.charAt(j) == '0') {
                    shy[i] = 0;
                    i++;
                } else {
                    shy[i] = (Integer.parseInt(si.substring(j, factor + j)));
                    j += factor;
                }
                        */
                shy[i] = Integer.parseInt(si.substring(i, i+1));
            }
            friends = 0;
            standing = shy[0];
            for(i=1; i<shy.length; i++) {
                if((standing + friends) < i) {
                    friends += (i-(standing+friends));
                }
                standing += shy[i];
            }
            out.write("Case #" + ctr + ": " + friends + "\n");
            ctr++;
        }
        out.close();
    }

}
