package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1606;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avinash
 */
public class Q2 {

    
        public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File ("input.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            int times= in.nextInt();
            
            for(int l = 1;l<=times;l++)
            {
                double c,f,x;
                double time = 0.0;
                c = in.nextDouble();
                f = in.nextDouble();
                x = in.nextDouble();
                //boolean stop=false;
                double cookies=2.0;
                while (((c/cookies)+(x/(cookies+f)))<(x/cookies))
                {
                    time += c/ cookies;
                    cookies+=f;
                }
                time+=x/cookies;
                
                
                
                
                
                
                
                out.append("Case #"+l+": "+new DecimalFormat("0.0000000").format(time));
                out.newLine();/**/
            }

            out.close();
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(Q2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Q2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}
