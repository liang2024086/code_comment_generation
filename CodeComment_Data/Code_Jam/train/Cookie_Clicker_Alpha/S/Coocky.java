package methodEmbedding.Cookie_Clicker_Alpha.S.LYD786;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Coocky {
    
    public static void main(String[] args) throws IOException {
        java.util.Locale.setDefault(Locale.ENGLISH);
        FileReader fin = new FileReader("B-small-attempt1.in");
        FileWriter fout = new FileWriter("output.txt");
        Scanner sc = new Scanner(fin);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            double c = sc.nextDouble();
            double f = sc.nextDouble();
            double x = sc.nextDouble();
            //System.out.println("lol");

            //boolean perehod = false;
            boolean ubivanie = true;
            double minTime = x / 2.0;
            int k = 1;
            do {
                double prirost = 2.0;
                double time = 0;
                
                for (int j = 0; j < k; j++) {
                    time += c / prirost;
                    prirost += f;
                }
                
                time += x / prirost;
                
                if (time < minTime) {
                    minTime = time;
                    ubivanie = true;
                } else {
                    ubivanie = false;
                }
                k++;
                //System.out.println(minTime);
            } while (ubivanie);
            
            fout.write("Case #" + i + ": " + minTime + "\r\n");
        }
        fin.close();
        fout.close();
    }
}
