package methodEmbedding.Standing_Ovation.S.LYD110;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serge
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new File("output.txt"));
        int t = in.nextInt();
        for (int i=0; i<t; i++){
            int n = in.nextInt();
            String s = in.nextLine();
            if (s.length()!=n+2){
                System.out.println("Something Wrong");                
            }
            long  sumOfpeople = 0;
            long maxDisbalance = 0;
            for (int j=1; j<=n+1; j++){
                char c = s.charAt(j);
                if (sumOfpeople<j-1) {
                    maxDisbalance = Math.max((j-1-sumOfpeople), maxDisbalance);
                }
                sumOfpeople = sumOfpeople+ (int)c -(int)'0';
            }
            out.println("Case #"+(i+1)+": "+maxDisbalance);
        }
        out.flush();
        out.close();
    }
    
}
