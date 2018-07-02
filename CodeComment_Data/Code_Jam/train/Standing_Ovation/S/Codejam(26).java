package methodEmbedding.Standing_Ovation.S.LYD2034;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Liku-Riku
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = args[0];
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int numTestCases = Integer.parseInt(br.readLine());
        FileWriter output = new FileWriter("output.txt");
        for(int i=0;i<numTestCases;i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int sMax = Integer.parseInt(st.nextToken().trim());
            String values = st.nextToken().trim();
            int numClappers = 0;
            int addClappers = 0;
            for(int j=0;j<values.length();j++) {
                int temp = Integer.parseInt(values.charAt(j)+"");
                if(numClappers >= j) {
                    numClappers += temp;
                }
                else if(numClappers < j && temp != 0){
                    addClappers += (j-numClappers);
                    numClappers = numClappers + j - numClappers + temp;
                }
            }
            output.write("Case #" + (i+1) + ": " + addClappers + "\n");
            
        }
        output.close();
    }
    
}
