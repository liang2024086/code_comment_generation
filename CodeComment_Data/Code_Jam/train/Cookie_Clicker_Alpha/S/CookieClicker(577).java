package methodEmbedding.Cookie_Clicker_Alpha.S.LYD307;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NENE
 */
public class CookieClicker 
{
    public static void main(String[] args) throws Exception
    {
         Scanner sc=new Scanner(new File("C:/txt/small.in"));
         BufferedWriter bw=new BufferedWriter(new FileWriter("C:/txt/output.txt"));
         int t=Integer.parseInt(sc.next());
         for(int i=0;i<t;i++)
         {
             double c,f,x;
             c=Double.parseDouble(sc.next());
             f=Double.parseDouble(sc.next());
             x=Double.parseDouble(sc.next());
             double r=2;
             double time=0;
             loop:while(true)
             {
                 if((x/r)>((c/r)+(x/(r+f))))
                 {
                     time+=(c/r);
                     r=r+f;
                 }
                 else
                 {
                     time+=(x/r);
                     break loop;
                 }
             }
             
             bw.write("Case #"+(i+1)+": "+String.format("%.7f", time));
             bw.newLine();
         }
         bw.close();
    }
}
