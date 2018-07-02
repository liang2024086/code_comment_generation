package methodEmbedding.Cookie_Clicker_Alpha.S.LYD736;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/**
 *
 * @author Dumal
 */
public class Cookiclicker {
    public static void main(String[] args) {
        try {
            DecimalFormat df=new DecimalFormat();
            df.setMaximumFractionDigits(7);
            df.setMinimumFractionDigits(7);
            FileReader fr=new FileReader("B-small-attempt2.in");
            File f=new File("Cooky_Clicker.out");
            f.createNewFile();
            PrintWriter pw=new PrintWriter(f);
            BufferedReader br=new BufferedReader(fr);
            String s=br.readLine();
            System.out.println("Number of Test Cases="+s);
            int cases=Integer.parseInt(s);
            for (int i = 1; i <= cases; i++) {
                String num[]=br.readLine().split(" ");
                double C=Double.parseDouble(num[0].toString());
                double F=Double.parseDouble(num[1].toString());
                double X=Double.parseDouble(num[2].toString());
                double CR=2;
                double CT=0;
                double CC=0;
                //System.out.println(C+"-"+F+"-"+X);
//                System.out.println("C-"+C);
//                System.out.println("F-"+F);
//                System.out.println("X-"+X);
                
                    if(C<X){
                        
                        while( CC!=X ){
                            //System.out.println("A="+( (C/(CR)) + (X/(CR+F)) ));
//                            System.out.println("V="+(C/(CR)));
//                            System.out.println("Q="+(X/(CR+(F))));
                            //System.out.println("B="+(X/(CR)));
                            if( ( (C/(CR)) + (X/(CR+(F))) ) <  (X/(CR))){
                                CT+=(C/CR);
                                CR+=F;
                                //System.out.println("Current Time1 "+CT);
                            }else{
                                //CT+=(C/CR);
                                CT+=(X/(CR));
                                CC=X;
                                //System.out.println("Current Time"+CT);
                            }
                        }
                        //System.out.println("iiii");
                    }else{
                        CT+=X/CR;
                        df.format(CT);
                    }
                
                pw.write("Case #"+i+": "+df.format(CT).toString());
                pw.println();
            }
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
