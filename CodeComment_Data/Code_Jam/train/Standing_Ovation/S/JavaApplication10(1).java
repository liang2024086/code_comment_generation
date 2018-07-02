package methodEmbedding.Standing_Ovation.S.LYD1511;

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
 * @author jafer
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fin = new Scanner(new File("input.txt"));
        
        int testcases = fin.nextInt();
        
        for(int t=0; t<testcases; t++)
        {
            int highestshyness = fin.nextInt();
            int audishyness[] = new int[highestshyness+1];
            int code = fin.nextInt();
            int addfrnds=0;
            
            for(int i=highestshyness; i>=0; i--)
            {
                int tmp=code%10;
                code /= 10;
                audishyness[i] = tmp;
            }
            
            for(int i=1; i<audishyness.length; i++)
            {
                int sum=0;
                for(int j=i-1; j>=0; j--)
                    sum += audishyness[j];
                if(sum < i)
                {   
                    int tmp = i-sum;
                    audishyness[0] += tmp;
                    addfrnds += tmp;
                }
                    
            }
            System.out.println("Case #" + (t+1) + ": " + addfrnds);
        }
        
    }
    
}
