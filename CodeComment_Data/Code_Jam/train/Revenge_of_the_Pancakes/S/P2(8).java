package methodEmbedding.Revenge_of_the_Pancakes.S.LYD397;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author Ismael
 */
public class P2 {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader f=new FileReader ("C:\\Users\\Ismael\\Desktop\\InputB.txt");
        Scanner in = new Scanner(f);
        PrintWriter out = new PrintWriter("C:\\Users\\Ismael\\Desktop\\OutputB.txt");
        int cant = in.nextInt();
        in.nextLine();
        for (int i = 0; i < cant; i++) {
            double sol = 0;
            String linea=in.nextLine();
            DecimalFormat d = new DecimalFormat("0");
            
            for (int j = 1; j < linea.length(); j++) {
                if(linea.charAt(j)!= linea.charAt(j-1)){
                    sol++;
                }
            }
            if(linea.charAt(linea.length()-1)=='-'){
                sol++;
            }

            out.println("Case #" + (i + 1) + ": " + d.format(sol));


        }
        out.close();
    }
}
