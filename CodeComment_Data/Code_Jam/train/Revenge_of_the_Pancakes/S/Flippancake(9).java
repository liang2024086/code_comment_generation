package methodEmbedding.Revenge_of_the_Pancakes.S.LYD593;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author yilianz
 */
public class Flippancake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //read input and display output

        Scanner inFile = new Scanner(new File("B-small-attempt0.in"));
       PrintWriter outFile = new PrintWriter(new File("B-small.out"));
        
         //Scanner inFile = new Scanner(new File("file.in"));
       // PrintWriter outFile = new PrintWriter(new File("file.out"));

        //  Scanner inFile = new Scanner(new File("B-large.in"));
        //  PrintWriter outFile = new PrintWriter(new File("B-large.out"));

        int caseN = (int) inFile.nextInt();
        inFile.nextLine();
        for (int i = 1; i < caseN + 1; i++) {
            int fliptime=0;
            String pat= inFile.nextLine();
            
            //Change to char array
            char facearr[] = pat.toCharArray();
            
            // check whether it end with "+" or "-" and how many changes
            char current = facearr[0];
            char change =0;
            int len = facearr.length;
            
            for(int s = 1;s<len;s++){
                if(facearr[s]!=current){
                    change++;
                }
                current=facearr[s];
            }
            
            if (current=='+') fliptime=change;
            else if (current=='-') fliptime = change+1;

            System.out.println("Case #" + i + ": " + fliptime);
            outFile.println("Case #" + i + ": " + fliptime);

        }
        //close the file
        inFile.close();
        outFile.close();


    }
}
