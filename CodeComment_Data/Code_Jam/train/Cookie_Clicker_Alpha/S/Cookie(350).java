package methodEmbedding.Cookie_Clicker_Alpha.S.LYD407;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Udara
 */
public class Cookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("B-small-attempt0.in")));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        int t = sc.nextInt();
        double r = 2.0;
        double c,f,x;
        double z;
        double time;
        double round = Math.pow(10, 7);
        int n;
        /* Logic used..
         * It is prooved that 
         * when n = floor(X/C - r/F) time is a minimum
         * and t(n) = t(n-1) + (Cz - F(X-C))/(z+zF) where z = r + (n-1)F
         */
        for(int i=0;i<t;i++){
            c = sc.nextDouble();
            f = sc.nextDouble();
            x = sc.nextDouble();
            time = x/r;
            //System.out.println("inital "+time);
            if(c!= 0.0 && f!=0.0){
                n = (int) Math.floor(x/c - r/f);    //this is the iteration we need               
                for(int j=1;j<=n;j++){
                    z = r + (j-1)*f;
                    time = time + (c*z - f*(x-c))/(z*(z+f));           
                }
            }
            bw.write("Case #"+(i+1)+": "+time);
            //System.out.println("Case #"+(i+1)+": "+time);
            if(i < t-1){
                bw.newLine();
                //System.out.println("");
            }
        }
        bw.close();
        sc.close();
        System.exit(0);
    }
}
