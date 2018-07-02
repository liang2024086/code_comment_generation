package methodEmbedding.Cookie_Clicker_Alpha.S.LYD900;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Roaa
 */
public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        FileReader fr =new FileReader ("B-small-attempt0.in");
     BufferedReader in =new BufferedReader (fr);
FileWriter fw =new FileWriter ("out.txt");
     BufferedWriter out =new BufferedWriter (fw);
     String temp,sp[]; 
        int t=0,tt = 0;
        boolean ch =true;
        temp = in.readLine();
        tt = Integer.parseInt(temp);
        double c,x,f,sum=0.0,k=2.0,xt=0.0,ct=0.0;
        double min=0.0,mint=1.0;
        while (t < tt){
        temp = in.readLine();
        sp = temp.split(" ");
        c = Double.parseDouble(sp[0]);
        f = Double.parseDouble(sp[1]);
        x = Double.parseDouble(sp[2]);
            mint = x/k;
            min = (mint - (x/k)) + c/k + x/(k+f);            
          while(mint > min ){
                k+=f;  
                mint=min;
                min = (mint - (x/k)) + c/k + x/(k+f);
        }
         //done
         out.append("Case #"+(t+1)+": "+Math.rint(mint*10000000)/10000000);
         out.newLine();
        t++;
        min =0.0;
        c =0.0; f =0.0; x=0.0;
        sum=0.0;
        k=2.0;
        }
    in.close();
out.close();
    }
}
