package methodEmbedding.Counting_Sheep.S.LYD1482;

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
        
        
                       
            
        for (int i = 0; i < numOfCases; i++) {
            
            output.write("Case #" + (i+1) + ": ");
            
            long n = in.nextLong();
            
            long current = n;
            
            boolean sleeps = false;
            
            Set<Integer> set = new HashSet<>(10);
            
            for (long k = 0; k < 10000000; ++k) {
                if(k%10000==0){
                    System.out.println("iterations: " + (k+1));
                }
                String nS = Long.toString(current);
                for (int j = 0; j < nS.length(); ++j) {
                    set.add(Character.getNumericValue(nS.charAt(j)));
                    if(set.size()==10){
                        j=nS.length();
                        k = 10000000;
                        sleeps = true;
                    }
                }
                current+=n;
            }
            
            
            if(sleeps){
                System.out.println("Case #" + (i+1) + ": " + (long)(current-n));
                output.write("" + (long)(current-n));
            }
            else{
                System.out.println("Case #" + (i+1) + ": INSOMNIA");
                output.write("INSOMNIA");
            }
            
            output.newLine();
        }
        output.close();
    }
}
