package methodEmbedding.Counting_Sheep.S.LYD1508;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nikol
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    
    private static final String infile = "A-small-attempt0.in";
    private static final String outfile = "out.txt";
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner in = new Scanner(new FileReader(infile));
        PrintWriter out = new PrintWriter(outfile, "ASCII");
        int testCases = in.nextInt();
        int output = 0;
        
        for(int i=0; i<testCases; i++){
            //output = solve(in.nextInt());
            Integer original = in.nextInt();
            Integer current = original;
            
            if(original == 0){
                out.println("Case #"+(i+1)+": INSOMNIA");
                continue;
            }
            
            Set digits = new HashSet();
            String num;
            char digit;
            
            num = current.toString();
            
            while(digits.size()<10){
                for(int j=0; j<num.length(); j++){
                    digit = num.charAt(j);
                    digits.add(digit);
                }   
                current += original;
                num = current.toString();
            }

            out.println("Case #"+(i+1)+": "+(current-original));
        }
        
        in.close();
        out.close();
        
    }
    
}
