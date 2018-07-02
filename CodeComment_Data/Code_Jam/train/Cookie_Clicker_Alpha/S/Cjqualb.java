package methodEmbedding.Cookie_Clicker_Alpha.S.LYD366;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHAWIK JAIN
 */
public class Cjqualb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = null;
        try {
            s = new Scanner(new File("B-small-attempt0.in"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cjqualb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PrintWriter pw=null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("B-small-attempt0.txt"));
            pw = new PrintWriter(fos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cjqualb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int T;
        T=Integer.parseInt(s.nextLine());
        for(int i=0; i<T; i++)
        {
            double C = s.nextDouble();
            double F = s.nextDouble();
            double X = s.nextDouble();
            double timer=0;
            double cps=2;
            double cookies=0;
            while(cookies<X)
            {
                double cox = X/cps;
                double cof = (C/cps)+(X/(cps+F));
                if(cox<cof)
                {
                    timer+=X/cps;
                    cookies=X;
                }
                else
                {
                    timer+=C/cps;
                    cps+=F;                    
                }                
            }
            pw.println("Case #"+(i+1)+": "+timer);
        }
        pw.close();
        s.close();
    }
    
}
