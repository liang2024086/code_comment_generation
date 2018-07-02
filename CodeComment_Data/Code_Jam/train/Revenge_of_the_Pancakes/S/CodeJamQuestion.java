package methodEmbedding.Revenge_of_the_Pancakes.S.LYD582;

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
 * @author Canberk
 */

public class CodeJamQuestion {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("B-small-attempt1.in"));
            PrintWriter out = new PrintWriter("B-small-attempt1.out");

            int cases = Integer.parseInt(in.nextLine());
            
            for (int c = 1; c <= cases; c++) {
                String answer = "Case #" + c + ": ";
                String ps = in.nextLine();
                int flips = 0;
                if(ps.charAt(0) == '-') flips++;
                for(int i = 1;i < ps.length();i++){
                    if(ps.charAt(i-1) == '+' && ps.charAt(i) == '-') flips +=2;
                }
                
                out.println(answer + flips);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR");
        }

    }
    
}
