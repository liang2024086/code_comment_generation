package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1123;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Savvas
 */
public class Codejam2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("input.in"), "cp1253"));
        
        Scanner in = new Scanner(input);
        int numOfCases = in.nextInt();
        
        
                       
        in.nextLine();
        
        for (int i = 0; i < numOfCases; i++) {
            
            output.write("Case #" + (i+1) + ": ");
            System.out.println("");
            System.out.println("");
            
            String s = in.nextLine();
            
            int l = s.length();
            
            int moves = 0;
            
            for (int j = 0; j < l-1; j++) {
                if(s.charAt(j)!=s.charAt(j+1)){
                    ++moves;
                }
            }
            
            if(s.charAt(l-1)=='-'){
                ++moves;
            }
            
            
                System.out.println("Case #" + (i+1) + ": " + moves);
                output.write("" + moves);
            
            
            output.newLine();
        }
        output.close();
    }
}
