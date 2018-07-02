package methodEmbedding.Standing_Ovation.S.LYD1343;

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
import java.util.Scanner;

/**
 *
 * @author Savvas
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("input.in"), "cp1253"));
        
        Scanner in = new Scanner(input);
        int numOfCases = in.nextInt();
        
        
        int maxS;
        String si;
        int digit1, digit2;
        
                       
            
        for (int i = 0; i < numOfCases; i++) {
            int solution = 0;
            int weHave = 0;
            output.write("Case #" + (i+1) + ": ");

            maxS = in.nextInt();
            
            StringBuilder sit = new StringBuilder(in.nextLine());
            sit.deleteCharAt(0);
            si = sit.toString();
            
            for (int j = 1; j < maxS+1; ++j) {
                digit1=si.charAt(j-1)-48;
                digit2=si.charAt(j)-48;
                //System.out.println(si + " char at j: " + si.charAt(j-1) + " digit1: " + digit1);
                
                weHave += digit1;
                if(j>weHave){
                    solution += j-weHave;
                    weHave += j-weHave;
                }
            }
            output.write("" + solution);
            
            output.newLine();
        }
        output.close();
    }
}
