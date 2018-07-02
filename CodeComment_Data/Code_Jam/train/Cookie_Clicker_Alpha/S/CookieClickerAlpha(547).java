package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1538;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author c_sachsh
 */
public class CookieClickerAlpha {

    public CookieClickerAlpha() {
        File input = new File("C:\\CookieClickerAlpha\\input.txt");
        Scanner sc = null;
        String op = "";
        try {
            sc = new Scanner(input);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        int T = sc.nextInt();
        if (T < 1 || T > 100) {
            System.out.println("Not a valid set of test cases. Exiting now");
            System.exit(0);
        }
        for (int i = 1; i <= T; i++) {

            double C, F, X,time=0.0;
            C = sc.nextDouble();
            F = sc.nextDouble();
            X = sc.nextDouble();
            double nf = (F * X - 2 * C) / (F * C);
            int n=(int)nf;
            if(n<0)
                n=0;
            for(int j=0;j<n;j++){
                time+=C/(2+(j*F));
                System.out.println("t"+j+"="+(C/(2+(j*F))));
            }
            
            time+=(X/(2+(n*F)));
            time=new BigDecimal(time ).setScale(7, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println("t"+n+"="+(X/(2+(n*F))));
            op += "Case #" + i + ": " + time+"\n";
        }
        File output = new File("C:\\CookieClickerAlpha\\output.txt");
        BufferedWriter r = null;
        try {
            output.createNewFile();
            r = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
            r.write(op);
            r.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new cookieclickeralpha.CookieClickerAlpha();
    }
}
