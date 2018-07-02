package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1079;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author wik2kassa
 */
public class Jamcookies {

    /**
     * @param args the command line arguments
     */
    static double c,f, x;
    public static void main(String[] args) throws FileNotFoundException {
        int t;
        double eta = Double.MAX_VALUE;
        double elapsedt;
        double step;
        double rate;
        double cookies;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            c = input.nextDouble();
            f = input.nextDouble();
            PrintWriter pw = new PrintWriter(new File("jamcookieout.txt"));
            x = input.nextDouble();
            eta = x / 2.0;
            elapsedt = 0;
            rate = 2.0;
            cookies = 0;
            while(true)
            {
                if(x > c)
                {
                    if((x/rate) < (c/rate) + (x/(rate+f)))
                    {
                        elapsedt += x/rate;
                        break;
                    }
                    else
                    {
                        elapsedt += c/rate;
                        rate += f;
                    }
                }
                else
                {
                    elapsedt += (x-cookies)/rate;
                    break;
                }
                    
            }
            System.out.println("Case #" + (i+1) + ": " + elapsedt);
            pw.println("Case #" + (i+1) + ": " + elapsedt);
        }
        
    }
    
}
