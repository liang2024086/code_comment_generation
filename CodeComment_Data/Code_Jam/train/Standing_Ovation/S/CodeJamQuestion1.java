package methodEmbedding.Standing_Ovation.S.LYD1788;

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
 * @author Canberk
 */
public class CodeJamQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("A-small-attempt0.in"));
            PrintWriter out = new PrintWriter("A-small-attempt0.out");

            int cases = Integer.parseInt(in.nextLine());
            
            for (int c = 1; c <= cases; c++) {
                String answer = "Case #" + c + ": ";
                int extra = 0;
                String[] input = in.nextLine().split(" ");
                int n = Integer.parseInt(input[0])+1;
                String audiance = input[1];
                int total = 0;
                
                for(int i = 0; i<n; i++){
                    total += Integer.parseInt(audiance.substring(i,i+1));
                    if(total<i+1){
                        total++;
                        extra++;
                    }
                }
                
                
                out.println(answer + extra);
                
            }

            in.close();
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR");
        }

    }
    
}
