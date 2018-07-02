package methodEmbedding.Cookie_Clicker_Alpha.S.LYD0;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class CookieClicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner reader;
        try {
            FileReader fin = new FileReader("Test.txt");
            reader = new Scanner(fin);
        } catch (Exception e) {
            reader = new Scanner(System.in);
        }
        int TCase = reader.nextInt();

        for (int caseN = 1; caseN <= TCase; caseN++) {
            double prod = 2;
            double c = reader.nextFloat();
            double f = reader.nextFloat();
            double x = reader.nextFloat();
            double time = 0;
            double timeMax = x / prod;
            while ((x / (prod + f)) + (c / prod) + time < timeMax) {
               // System.out.println("tiempoMaximo:"+timeMax+ " Produccion: "+prod);
                timeMax = (x / (prod + f)) + (c / prod) + time;
                time += c / prod;
                prod += f;
            }
            System.out.println("Case #"+caseN+": "+timeMax);
        }
    }

}
