package methodEmbedding.Standing_Ovation.S.LYD973;

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
 * @author Juan
 */
public class CodeJam2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner leer = new Scanner(new File("src/A-small-attempt0.in"));
        BufferedWriter write = new BufferedWriter(new FileWriter("src/A-small-attempt0.out"));
        int T, i,j;
        int smax, sact = 0;
        //int shy;
        char shy[];
        String s;
        T = leer.nextInt();
        int x,addT,add;
        for (i = 0; i < T; i++) {
            sact=0;
            add=0;
            addT=0;
            smax = leer.nextInt();
            shy = new char[smax + 1];
            s = leer.next();
            shy = s.toCharArray();
            //shy[i]=leer.nextInt();
            //shy=leer.nextInt();
            for (j = 0; j <= smax; j++) {
                x=Integer.parseInt(shy[j]+"");
                //System.out.println("Indice: "+j);
                //System.out.println("Actuales"+sact);
                if (sact >= j) {
                    sact += x;
                } else {
                    add=(j-sact);
                    addT+=add;
                    sact+=(add+x);
                }
                //System.out.println("Actuales+Add: "+sact);
                //System.out.println(add+","+addT);
            }
            //System.out.println("Case #"+(i+1)+": "+addT);
            write.write("Case #"+(i+1)+": "+addT+"\n");
            
        }
        write.close();
    }

}
