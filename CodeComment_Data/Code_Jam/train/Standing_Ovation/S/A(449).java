package methodEmbedding.Standing_Ovation.S.LYD1715;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor V
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);
        Scanner leer = new Scanner(new File("A-small-attempt0.in"));
        int t = leer.nextInt();
        int max, cp[], i, j, tot, ami;
        String cad;
        for (i = 0; i < t; i++) {
            tot = 0;
            ami = 0;
            max = leer.nextInt();
            cp = new int[max+1];
            cad = leer.next();
            for (j = 0; j <= max; j++) {
                cp[j] = Integer.parseInt(cad.charAt(j) + "");
            }
            for (j = 0; j <= max; j++) {
                if (cp[j] > 0) {
                    if (tot >= j) {
                        tot = tot + cp[j];
                    } else {
                        ami += (j - tot);
                        tot += ami + cp[j];
                    }
                }

            }
            System.out.println("Case #" + (i + 1) + ": " + ami);
        }
    }

}
