package methodEmbedding.Counting_Sheep.S.LYD1641;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FARHAN
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        int test =0;
        File file = new File ("input.in");
        File wfile = new File ("output.in");
        Scanner cin = new Scanner (file);
        PrintWriter sout = new PrintWriter (wfile);
        
        test = cin.nextInt();
        
        
        for (int testcase =0; testcase<test; testcase++){
            
            int N = cin.nextInt();
            ArrayList arr = new ArrayList();
            if (N == 0) {
                sout.println("Case #" + (testcase+1) + ": " + "INSOMNIA");
            } else {
                int i = 0;
                int mult =1;
                
                while (i < 10) {

                    int temp =  N * mult;
                    
                    mult++;
                    while (temp > 0) {

                        int num = temp % 10;
                        temp = temp / 10;
                        if (!arr.contains(num)) {
                            arr.add(num);
                            i++;
                        }
                    }
                   
                   
                }

                sout.println("Case #" + (testcase+1) + ": " + (N*(mult-1)));
            }
                
        }
        sout.close();
    }
        
        
}
    

