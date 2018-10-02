package methodEmbedding.Speaking_in_Tongues.S.LYD397;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author VISHAL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String na="abcdefghijklmnopqrstuvwxyz ";
        String ga="ynficwlbkuomxsevzpdrjgthaq ";
        int n;
        Scanner in=new Scanner(new File("H:\\in.txt"));
        FileWriter fout=new FileWriter("H:\\out.txt");
        PrintWriter outfile=new PrintWriter(fout);
        n=Integer.parseInt(in.nextLine());
        String s;
        for(int i=0;i<n;i++){
                 s=in.nextLine();
                 String out="";
                 for(int j=0;j<s.length();j++){
                     int k=0;
                     k=ga.indexOf(s.charAt(j));
                     out=out+na.charAt(k);
                 }
                 outfile.println("Case #"+(i+1)+": "+out);

        }
//        outfile.write("\n");
        outfile.close();
        // TODO code application logic here
    }

}
