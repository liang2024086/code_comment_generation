package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1257;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Kakashi
 */
public class Jam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file = "B-small-attempt0";
        String dir = "c:/jam/";
        String newLine = System.getProperty("line.separator");
        try{
            //out
            FileWriter fw = new FileWriter(dir+file+".out");
            BufferedWriter bw = new BufferedWriter(fw);
            //in
            Scanner sc = new Scanner(new File(dir+file+".in"));
            int cases = Integer.parseInt(sc.nextLine());
            //System.out.println(cases);
            for(int i = 1 ; i<=cases;i++){String[] line = sc.nextLine().split(" ");
                double c=Double.parseDouble(line[0]),f=Double.parseDouble(line[1]),x=Double.parseDouble(line[2]);
                double r = 2;
                double b = x / r;
                double st = 0;
                while(true){
                    st += c/r;
                    r += f;
                    double t = st+(x/r);
                    if(t>b)
                        break;
                    else
                        b = t;
                }
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(7);
                nf.setMinimumFractionDigits(7);
                String result = nf.format(b);
                bw.write("Case #"+i+": "+result);
                bw.write(newLine);
            }
            bw.close();
        }catch(IOException e){
            e.getMessage();
        }
    }
    
}
