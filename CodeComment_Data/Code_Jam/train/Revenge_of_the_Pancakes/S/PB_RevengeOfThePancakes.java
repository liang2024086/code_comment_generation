package methodEmbedding.Revenge_of_the_Pancakes.S.LYD616;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class PB_RevengeOfThePancakes {
    
    public static void main(String[] args) throws FileNotFoundException{
        File inf = new File("D:\\NetBeansProjects\\GoogleCodeJam\\src\\GCJ2016QR\\PB1.in");
        File outf = new File("D:\\NetBeansProjects\\GoogleCodeJam\\src\\GCJ2016QR\\PB1.out");
        Scanner sc = new Scanner(inf);
        PrintWriter out = new PrintWriter(outf);
        int t = sc.nextInt();
        char[] l;
        int ct = 0;
        for(int cs = 1; cs<=t;cs++){
            l = sc.next().toCharArray();
            ct = 0;
            for(int i=1;i<l.length;i++){
                if(l[i]!=l[i-1])ct++;
            }
            ct += (l[l.length-1]=='-'?1:0);
            out.printf("Case #%d: %d%n",cs,ct);
        }
        out.close();
    }
    
}
