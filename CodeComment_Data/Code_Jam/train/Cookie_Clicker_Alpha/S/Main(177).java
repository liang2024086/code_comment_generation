package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1252;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jquijano82
 */
public class Main {
    
    private final static String ESPACIO = " ";

    public static void main(String[] args) {
        Scanner scan = null;

        try {
            scan = new Scanner(new BufferedInputStream(new FileInputStream(new File("build/classes/entrada.txt"))));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }

        double t,t1,t2;
        double produccionSeg;
        double costoFinca, adicionalProduccion, meta;
        boolean fin;
        
        int casos = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= casos; i++) {
            String[] s = scan.nextLine().split(ESPACIO);
            costoFinca = Double.parseDouble(s[0]);
            adicionalProduccion = Double.parseDouble(s[1]);
            meta = Double.parseDouble(s[2]);
            
            t=0;
            t1=0;
            t2=0;
            produccionSeg = 2;
            fin = false;
            while(!fin){
                //timepo actual
                t += costoFinca / produccionSeg;
                //tiempo para cumpliar la meta con la produccion actual
                t1 = ((meta - costoFinca) / produccionSeg) + t;
                //
                t2 = (meta / (produccionSeg + adicionalProduccion)) + t;
                if(t1 > t2){
                    produccionSeg += adicionalProduccion;
                } else {
                    fin = true;
                    System.out.println("Case #" + i + ": " + t1);
                }
            }
            
        }

        scan.close();
    }

}
